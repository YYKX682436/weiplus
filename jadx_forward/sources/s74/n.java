package s74;

/* loaded from: classes4.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f485965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f485966e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f485967f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s74.o0 o0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        super(0);
        this.f485965d = o0Var;
        this.f485966e = i17;
        this.f485967f = c17933xe8d1b226;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.FrameLayout n17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$mainElementMeasuredWidth$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$mainElementMeasuredWidth$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$checkMeasureWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        s74.o0 o0Var = this.f485965d;
        o0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkMeasureWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        s74.f3 f3Var = o0Var.f485991y;
        int measuredWidth = (f3Var == null || (n17 = f3Var.n()) == null) ? 0 : n17.getMeasuredWidth();
        int i17 = this.f485966e;
        int b17 = (measuredWidth <= 0 || measuredWidth > i17 * 10) ? i65.a.b(o0Var.E(), 302) : measuredWidth;
        java.lang.String j17 = o0Var.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkMeasureWidth, hasMainElement=");
        s74.f3 f3Var2 = o0Var.f485991y;
        sb6.append((f3Var2 != null ? f3Var2.n() : null) != null);
        sb6.append(", hasGridElement=");
        s74.f3 f3Var3 = o0Var.f485991y;
        sb6.append((f3Var3 != null ? f3Var3.k() : null) != null);
        sb6.append(", snsId=");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f485967f;
        sb6.append(ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
        s74.f3 f3Var4 = o0Var.f485991y;
        if ((f3Var4 != null ? f3Var4.n() : null) != null && (measuredWidth <= 0 || measuredWidth > i17 * 10)) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2008, 8);
            ca4.e0.b("error_in_cal_dynamic_view_width", "" + o0Var.f485981o, 1, 0, "snsId=" + c17933xe8d1b226.m70367x7525eefd() + "|measuredWidth=" + measuredWidth);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkMeasureWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$checkMeasureWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(b17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$mainElementMeasuredWidth$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$mainElementMeasuredWidth$1");
        return valueOf;
    }
}
