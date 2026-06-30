package g22;

/* loaded from: classes11.dex */
public final class e0 implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13364x933d260b f349339d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13364x933d260b activityC13364x933d260b) {
        this.f349339d = activityC13364x933d260b;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        g22.v vVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13367x36ad0482 c13367x36ad0482;
        android.widget.ImageView imageView;
        oa.i k17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13364x933d260b activityC13364x933d260b = this.f349339d;
        activityC13364x933d260b.f179971h = i17;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = activityC13364x933d260b.f179974n;
        if (c2718xca2902ff != null && (k17 = c2718xca2902ff.k(i17)) != null) {
            k17.b();
        }
        if (activityC13364x933d260b.f179971h != 1 || activityC13364x933d260b.f179972i) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12090, new java.lang.Object[0]);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_STORE_NEW_ORIGINAL_BOOLEAN, java.lang.Boolean.FALSE);
        if (activityC13364x933d260b.f179978r && activityC13364x933d260b.f179974n != null) {
            java.util.List list = activityC13364x933d260b.f179976p;
            if ((list != null ? ((java.util.ArrayList) list).size() : 0) > 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStoreV3HomeUI", "cleanPersonPoint");
                java.util.List list2 = activityC13364x933d260b.f179976p;
                if (list2 != null && (vVar = (g22.v) ((java.util.ArrayList) list2).get(1)) != null && (c13367x36ad0482 = vVar.f349412d) != null && (imageView = c13367x36ad0482.f180007f) != null) {
                    imageView.setVisibility(4);
                }
            }
        }
        activityC13364x933d260b.f179972i = true;
    }
}
