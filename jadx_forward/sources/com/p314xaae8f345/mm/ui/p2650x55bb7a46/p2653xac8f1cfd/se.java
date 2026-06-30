package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class se implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.te f281470d;

    public se(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.te teVar) {
        this.f281470d = teVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.te teVar = this.f281470d;
        teVar.getClass();
        if (itemId == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("k_username", teVar.f281527e.f280113d.x());
            intent.putExtra("showShare", false);
            intent.putExtra("rawUrl", java.lang.String.format(com.p314xaae8f345.mm.ui.n2.f290931a, 36));
            j45.l.j(teVar.f281527e.f280113d.g(), "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }
}
