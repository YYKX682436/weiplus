package a64;

/* loaded from: classes4.dex */
public final class l extends a64.j implements l75.q0 {
    public android.widget.LinearLayout A;
    public android.widget.LinearLayout B;
    public android.view.View C;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17703x743924d4 f83307r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f83308s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f83309t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f83310u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f83311v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d f83312w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f83313x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f83314y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.Button f83315z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f83308s = "";
    }

    public final void S6(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateOpenIMDescWording", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
        if (!(str2 == null || str2.length() == 0)) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("3552365301", str)) {
                str2 = "@" + str2;
            }
            android.widget.TextView textView = this.f83314y;
            if (textView != null) {
                textView.setText(str2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateOpenIMDescWording", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c8, code lost:
    
        if (r8 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e2, code lost:
    
        if (r8 != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01fc, code lost:
    
        if (r8 != null) goto L101;
     */
    @Override // a64.e, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a64.l.mo450x3e5a77bb(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("release", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
        ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).getClass();
        ((i41.l) i95.n0.c(i41.l.class)).Ui().mo49775xc84af884(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("release", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNotifyChange", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNotifyChange", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
            return;
        }
        if (w0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNotifyChange", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
            return;
        }
        j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17703x743924d4 c17703x743924d4 = this.f83307r;
        java.lang.String b17 = c17703x743924d4 != null ? c17703x743924d4.b() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17703x743924d4 c17703x743924d42 = this.f83307r;
        java.lang.String Ai = ((l41.q2) b0Var).Ai(w0Var, b17, c17703x743924d42 != null ? c17703x743924d42.c() : null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17703x743924d4 c17703x743924d43 = this.f83307r;
        S6(c17703x743924d43 != null ? c17703x743924d43.b() : null, Ai);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNotifyChange", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdKefuBottomComponentUIC");
    }
}
