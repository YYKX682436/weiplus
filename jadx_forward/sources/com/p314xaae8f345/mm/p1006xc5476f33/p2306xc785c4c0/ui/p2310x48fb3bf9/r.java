package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9;

/* loaded from: classes5.dex */
public class r implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f256778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l f256780f;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l lVar, android.content.Context context, java.lang.String str) {
        this.f256780f = lVar;
        this.f256778d = context;
        this.f256779e = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl shareImage ItemId click:%s", java.lang.Integer.valueOf(menuItem.getItemId()));
        int itemId = menuItem.getItemId();
        java.lang.String str = this.f256779e;
        android.content.Context context = this.f256778d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l lVar = this.f256780f;
        if (itemId == 1) {
            lVar.getClass();
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(context);
            ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(str, new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.t(lVar, weakReference));
            return;
        }
        if (menuItem.getItemId() == 0) {
            lVar.getClass();
            if (context == null || android.text.TextUtils.isEmpty(str)) {
                return;
            }
            java.lang.ref.WeakReference weakReference2 = new java.lang.ref.WeakReference(context);
            ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(str, new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.w(lVar, weakReference2));
        }
    }
}
