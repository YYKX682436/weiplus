package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes3.dex */
public class we extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816 f252279a;

    public we(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816 activityC18016xf3330816) {
        this.f252279a = activityC18016xf3330816;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOutline", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$2");
        if (view == null || outline == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOutline", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$2");
            return;
        }
        outline.setAlpha(0.35f);
        int f17 = i65.a.f(this.f252279a.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj);
        int i17 = -f17;
        outline.setRoundRect(i17, i17, view.getWidth() + f17, view.getHeight() + f17, i65.a.f(r2.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOutline", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$2");
    }
}
