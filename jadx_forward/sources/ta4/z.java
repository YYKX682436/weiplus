package ta4;

/* loaded from: classes15.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f498400d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(java.lang.String str) {
        super(0);
        this.f498400d = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$cancelImageLoadByFling$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$cancelImageLoadByFling$1");
        java.lang.Object d17 = ta4.u0.d();
        java.lang.String str = this.f498400d;
        synchronized (d17) {
            try {
                ta4.u0 u0Var = ta4.u0.f498371a;
                ta4.a b17 = ta4.u0.b(u0Var, str);
                if (b17 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$cancelImageLoadByFling$1");
                } else {
                    ta4.u0.g(u0Var, b17, ta4.j.f498310o);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Image.SnsImageLoadReporter", "cancelImageLoadByFling:" + str);
                    ta4.u0.f(u0Var, b17);
                    kz5.h0.A(ta4.u0.e(), new ta4.y(b17));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$cancelImageLoadByFling$1");
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$cancelImageLoadByFling$1");
                throw th6;
            }
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$cancelImageLoadByFling$1");
        return f0Var;
    }
}
