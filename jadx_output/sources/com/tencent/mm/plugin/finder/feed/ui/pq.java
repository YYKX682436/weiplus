package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes10.dex */
public final class pq implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI f110433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f110434b;

    public pq(com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI selectLocalFileRouterUI, android.net.Uri uri) {
        this.f110433a = selectLocalFileRouterUI;
        this.f110434b = uri;
    }

    @Override // j35.b0
    public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        kotlin.jvm.internal.o.d(strArr);
        boolean z17 = !(strArr.length == 0);
        com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI selectLocalFileRouterUI = this.f110433a;
        if (!z17 || iArr[0] != 0) {
            com.tencent.mars.xlog.Log.i("FinderSelectLocalFileUI", "requestStoragePermission failed");
            db5.e1.C(selectLocalFileRouterUI.getContext(), selectLocalFileRouterUI.getContext().getString(com.tencent.mm.R.string.hhe), "", selectLocalFileRouterUI.getContext().getString(com.tencent.mm.R.string.g6z), selectLocalFileRouterUI.getContext().getString(com.tencent.mm.R.string.hh9), false, new com.tencent.mm.plugin.finder.feed.ui.nq(selectLocalFileRouterUI), new com.tencent.mm.plugin.finder.feed.ui.oq(selectLocalFileRouterUI));
        } else {
            int i18 = com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI.f109628p;
            selectLocalFileRouterUI.X6(this.f110434b);
            com.tencent.mars.xlog.Log.i("FinderSelectLocalFileUI", "requestStoragePermission success");
        }
    }
}
