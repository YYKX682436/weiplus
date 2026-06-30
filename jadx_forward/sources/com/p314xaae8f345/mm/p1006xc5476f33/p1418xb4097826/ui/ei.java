package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class ei implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingsUI f210641d;

    public ei(com.tencent.mm.plugin.finder.ui.FinderSettingsUI finderSettingsUI) {
        this.f210641d = finderSettingsUI;
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
        com.tencent.mm.plugin.finder.ui.FinderSettingsUI finderSettingsUI = this.f210641d;
        finderSettingsUI.e = i17;
        oa.i k17 = finderSettingsUI.U6().f516162b.k(i17);
        if (k17 != null) {
            k17.b();
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractC15091x20e3bca0) finderSettingsUI.f.get(i17)).A0();
    }
}
