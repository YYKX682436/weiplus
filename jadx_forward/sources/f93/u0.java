package f93;

/* loaded from: classes3.dex */
public final class u0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f342007d;

    /* renamed from: e, reason: collision with root package name */
    public final n80.c f342008e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f342009f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f342010g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(android.view.View itemView, android.content.Context uiContext, n80.c cVar) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiContext, "uiContext");
        this.f342007d = uiContext;
        this.f342008e = cVar;
        this.f342009f = jz5.h.b(new f93.q0(itemView));
        this.f342010g = jz5.h.b(new f93.t0(itemView));
    }

    public final void i(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        if (z3Var == null) {
            return;
        }
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String d17 = z3Var.d1();
        ((sg3.a) v0Var).getClass();
        java.lang.String c17 = c01.a2.c(z3Var, d17);
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f342010g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb).setText(com.p314xaae8f345.mm.p2614xca6eae71.x1.Di().Ri(c17, true));
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) this.f342009f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) zVar).Ai((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18409xf85d1ccf) mo141623x754a37bb2, z3Var.d1(), null);
        android.view.View itemView = this.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setThrottleOnClickListener", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        itemView.setOnClickListener(new f93.s0(itemView, 1000L, this, z3Var));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setThrottleOnClickListener", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
    }
}
