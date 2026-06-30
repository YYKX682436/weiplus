package yc4;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.w1 f542384d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f542385e;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.w1 uic) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uic, "uic");
        this.f542384d = uic;
        this.f542385e = jz5.h.b(new yc4.b(this));
        jz5.h.b(new yc4.d(this));
        jz5.h.b(new yc4.c(this));
        jz5.h.b(new yc4.e(this));
        jz5.h.b(new yc4.a(this));
    }

    public static final android.content.Context a(yc4.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getContext", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        fVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContext", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        android.content.Context context = (android.content.Context) ((jz5.n) fVar.f542385e).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContext", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getContext", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        return context;
    }

    public abstract void b(android.os.Bundle bundle);

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
    }

    public abstract void d();

    public abstract void e();

    public abstract void f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.x1 x1Var, int i17);
}
