package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.fts;

/* loaded from: classes15.dex */
public class b implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.fts.ActivityC13331xc936a5b5 f179544d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.fts.ActivityC13331xc936a5b5 activityC13331xc936a5b5) {
        this.f179544d = activityC13331xc936a5b5;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.fts.ActivityC13331xc936a5b5 activityC13331xc936a5b5 = this.f179544d;
        activityC13331xc936a5b5.f179529n = null;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            activityC13331xc936a5b5.getClass();
            gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.fts.c(activityC13331xc936a5b5));
            return;
        }
        if (itemId != 2) {
            return;
        }
        activityC13331xc936a5b5.getClass();
        ((sg0.q3) ((tg0.v1) i95.n0.c(tg0.v1.class))).wi(activityC13331xc936a5b5.f179536u, activityC13331xc936a5b5.f179537v, activityC13331xc936a5b5.f179539x, 5, 0, 0, activityC13331xc936a5b5.f179538w);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        java.lang.String str = activityC13331xc936a5b5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ffk) + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, activityC13331xc936a5b5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.byh));
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("neverGetA8Key", true);
        j45.l.j(activityC13331xc936a5b5, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }
}
