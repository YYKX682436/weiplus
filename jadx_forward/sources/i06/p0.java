package i06;

/* loaded from: classes15.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.k1 f368250d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(i06.k1 k1Var) {
        super(0);
        this.f368250d = k1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        i06.k1 k1Var = this.f368250d;
        java.util.Collection k17 = k1Var.k();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(k17, 10));
        java.util.Iterator it = k17.iterator();
        while (it.hasNext()) {
            arrayList.add(new i06.y1(k1Var, (o06.l) it.next()));
        }
        return arrayList;
    }
}
