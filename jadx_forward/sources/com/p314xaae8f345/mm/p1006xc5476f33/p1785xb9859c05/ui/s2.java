package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes.dex */
public class s2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16140x55b9c685 f224537d;

    public s2(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16140x55b9c685 activityC16140x55b9c685) {
        this.f224537d = activityC16140x55b9c685;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16140x55b9c685 activityC16140x55b9c685 = this.f224537d;
        intent.putExtra("rawUrl", activityC16140x55b9c685.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3p));
        intent.putExtra("showShare", false);
        j45.l.j(activityC16140x55b9c685, "webview", ".ui.tools.WebViewUI", intent, null);
        return true;
    }
}
