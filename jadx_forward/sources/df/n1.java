package df;

/* loaded from: classes7.dex */
public final class n1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.w1 f311058d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(df.w1 w1Var) {
        super(1);
        this.f311058d = w1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean z17 = this.f311058d.f311123q.get();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineView", "waitFlutterReady isSuccess:" + booleanValue + ", isDestroyed:" + z17, new java.lang.Object[0]);
        if (!z17) {
            df.w1 w1Var = this.f311058d;
            synchronized (w1Var) {
                w1Var.f311119m = true;
                arrayList = new java.util.ArrayList(w1Var.f311120n);
                w1Var.f311120n.clear();
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((yz5.a) it.next()).mo152xb9724478();
            }
        }
        return jz5.f0.f384359a;
    }
}
