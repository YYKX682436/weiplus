package qd2;

/* loaded from: classes10.dex */
public final class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qd2.g1 f443239e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(java.lang.String str, qd2.g1 g1Var) {
        super(0);
        this.f443238d = str;
        this.f443239e = g1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = qd2.g1.f443278u;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f443238d, str);
        qd2.g1 g1Var = this.f443239e;
        if (b17) {
            if (!g1Var.f443295p) {
                qd2.g1.a(g1Var, "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/s6zCQ8q4oR2FpRXe");
            }
        } else if (!g1Var.f443294o) {
            qd2.g1.a(g1Var, str);
        }
        return jz5.f0.f384359a;
    }
}
