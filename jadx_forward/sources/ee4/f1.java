package ee4;

/* loaded from: classes4.dex */
public final class f1 extends ee4.t {

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f333239n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f333240o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(ce4.b pcContext) {
        super(pcContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pcContext, "pcContext");
        this.f333239n = "";
        this.f333240o = new java.util.HashMap();
    }

    @Override // ce4.a
    public java.lang.String d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
        return "SnsPublish.PicReportPc";
    }

    @Override // ce4.a
    public boolean h(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
        if (!super.h(bundle)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
            return false;
        }
        java.lang.String stringExtra = c().getIntent().getStringExtra("KSessionID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f333239n = stringExtra;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
        return true;
    }

    @Override // ce4.a
    public void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
        super.i();
        this.f333240o.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
    }

    public final void p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c abstractC18435x78de886c, boolean z17) {
        com.p314xaae8f345.mm.vfs.x1 m17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addReportInfoFromPicItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
        if (abstractC18435x78de886c != null) {
            try {
                java.lang.String b17 = abstractC18435x78de886c.b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(b17);
                java.lang.String str = a17.f294812f;
                if (str != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                    if (!str.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                ee4.f1 n17 = n();
                java.lang.String b18 = abstractC18435x78de886c.b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b18);
                int i17 = z17 ? 1 : 2;
                com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                long j17 = 0;
                if (m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) {
                    j17 = m17.f294768e;
                }
                long m43594xb79e176e = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(abstractC18435x78de886c.b()).m43594xb79e176e();
                n17.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addReportInfo", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
                r45.ea6 ea6Var = new r45.ea6();
                ea6Var.f454732h = i17;
                ea6Var.f454734m = j17 / 1000;
                ea6Var.f454733i = m43594xb79e176e;
                n17.f333240o.put(b18, ea6Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addReportInfo", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
            } catch (java.lang.Exception e17) {
                f("get report info error " + e17.getMessage());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addReportInfoFromPicItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
    }

    public final void q(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("rptPostImageInfo", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6880x27618ca7 c6880x27618ca7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6880x27618ca7();
        c6880x27618ca7.f141997f = c6880x27618ca7.i();
        c6880x27618ca7.f141995d = i17;
        c6880x27618ca7.f141996e = c6880x27618ca7.b("SessionId", this.f333239n, true);
        c6880x27618ca7.k();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rptPostImageInfo", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
    }
}
