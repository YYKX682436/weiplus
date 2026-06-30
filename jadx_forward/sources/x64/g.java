package x64;

/* loaded from: classes4.dex */
public class g extends w64.a {
    public g(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9) {
        this.f524816a = c17702x544f64e9;
    }

    @Override // w64.a
    public boolean c(android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, v64.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick");
        if (c17702x544f64e9 == null || c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick");
            return false;
        }
        a84.u0.a((com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad) dVar.a("snsAdClick", null), 42);
        android.content.Context context = view.getContext();
        x64.f fVar = new x64.f(context, c17933xe8d1b226);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("show", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        fVar.f533818p = c17702x544f64e9;
        if (fVar.f533811f == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cqu, (android.view.ViewGroup) null);
            fVar.f533812g = inflate;
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.bys);
            android.widget.TextView textView = (android.widget.TextView) fVar.f533812g.findViewById(com.p314xaae8f345.mm.R.id.f568698nr4);
            fVar.f533813h = (android.widget.ImageView) fVar.f533812g.findViewById(com.p314xaae8f345.mm.R.id.f569229ph4);
            fVar.f533814i = (android.widget.TextView) fVar.f533812g.findViewById(com.p314xaae8f345.mm.R.id.f569230ph5);
            fVar.f533815m = (android.widget.TextView) fVar.f533812g.findViewById(com.p314xaae8f345.mm.R.id.nri);
            fVar.f533816n = (android.widget.TextView) fVar.f533812g.findViewById(com.p314xaae8f345.mm.R.id.nr8);
            if (findViewById != null) {
                findViewById.setOnClickListener(new x64.b(fVar));
            }
            if (textView != null) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.j6o);
                textView.setOnClickListener(new x64.c(fVar));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, true, 0);
            fVar.f533811f = k0Var;
            k0Var.s(fVar.f533812g, true);
            fVar.f533811f.e(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        android.widget.TextView textView2 = fVar.f533814i;
        if (textView2 != null) {
            textView2.setText(c17702x544f64e9.U);
        }
        android.widget.TextView textView3 = fVar.f533815m;
        if (textView3 != null) {
            textView3.setText(c17702x544f64e9.V);
        }
        android.widget.TextView textView4 = fVar.f533816n;
        if (textView4 != null) {
            textView4.setText(c17702x544f64e9.W);
        }
        o94.c.a(com.p314xaae8f345.mm.R.id.n5u, c17702x544f64e9.T, fVar.f533813h);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        if (!fVar.f533811f.i()) {
            fVar.f533811f.v();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("show", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick");
        return true;
    }
}
