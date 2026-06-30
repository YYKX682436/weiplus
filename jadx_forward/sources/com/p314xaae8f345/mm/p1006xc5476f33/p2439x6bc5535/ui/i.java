package com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui;

/* loaded from: classes3.dex */
public class i implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19503x99c967c5 f269546d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19503x99c967c5 activityC19503x99c967c5) {
        this.f269546d = activityC19503x99c967c5;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19503x99c967c5 activityC19503x99c967c5 = this.f269546d;
        if (activityC19503x99c967c5.f269505r) {
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, activityC19503x99c967c5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l7u));
        }
        intent.putExtra("rawUrl", activityC19503x99c967c5.G + "&lang=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
        intent.putExtra("showShare", false);
        intent.putExtra("neverGetA8Key", false);
        j45.l.j(activityC19503x99c967c5, "webview", ".ui.tools.WebViewUI", intent, null);
        return false;
    }
}
