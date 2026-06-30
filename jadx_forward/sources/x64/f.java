package x64;

/* loaded from: classes4.dex */
public class f implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f533809d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f533810e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f533811f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f533812g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f533813h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f533814i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f533815m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f533816n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f533817o = null;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f533818p;

    public f(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f533809d = context;
        this.f533810e = c17933xe8d1b226;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 a(x64.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = fVar.f533811f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        return k0Var;
    }

    public static /* synthetic */ android.content.Context b(x64.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        android.content.Context context = fVar.f533809d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        return context;
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendRequest", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        if (c17702x544f64e9 != null) {
            k64.p pVar = new k64.p(c17702x544f64e9.R, c17702x544f64e9.S, this.f533810e.m70375x338a8cc7(), "");
            gm0.j1.d().a(4743, this);
            gm0.j1.d().g(pVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f533817o;
            if (u3Var == null) {
                android.content.Context context = this.f533809d;
                this.f533817o = db5.e1.Q(context, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gga), true, true, null);
            } else if (!u3Var.isShowing()) {
                this.f533817o.show();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendRequest", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        try {
            ((ku5.t0) ku5.t0.f394148d).B(new x64.d(this));
            gm0.j1.d().q(4743, this);
            java.lang.String str2 = "";
            int i19 = -1;
            if (i17 == 0 && i18 == 0 && (m1Var instanceof k64.p)) {
                r45.eo3 eo3Var = (r45.eo3) ((k64.p) m1Var).I();
                if (eo3Var != null) {
                    i19 = eo3Var.f455153d;
                    java.lang.String str3 = eo3Var.f455154e;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (str3 != null) {
                        str2 = str3;
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.AdCoupon", "the coupon errType is " + i17 + ", errCode is " + i18);
            }
            ((ku5.t0) ku5.t0.f394148d).B(new x64.e(this, i19, str2));
            a84.t0.a(new x64.a(this.f533810e, i19, str2, this.f533818p));
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
    }
}
