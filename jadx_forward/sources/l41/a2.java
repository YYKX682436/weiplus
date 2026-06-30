package l41;

/* loaded from: classes5.dex */
public final class a2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l41.b2 f397312e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(java.lang.String str, l41.b2 b2Var) {
        super(1);
        this.f397311d = str;
        this.f397312e = b2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMKefuService", "sendOpenImKfCard getShareCardContent failed");
        } else {
            java.util.Iterator it = r26.n0.f0(this.f397311d, new java.lang.String[]{","}, false, 0, 6, null).iterator();
            while (it.hasNext()) {
                this.f397312e.Ri((java.lang.String) it.next(), str);
            }
        }
        return jz5.f0.f384359a;
    }
}
