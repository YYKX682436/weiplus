package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f251281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f251282e;

    public b(android.content.Context context, android.view.View view) {
        this.f251281d = context;
        this.f251282e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.listener.SnsAutoShowVKBOnUICreate$launch$1");
        android.content.Context context = this.f251281d;
        java.lang.Object systemService = context != null ? context.getSystemService("input_method") : null;
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        java.lang.Boolean valueOf = inputMethodManager != null ? java.lang.Boolean.valueOf(inputMethodManager.showSoftInput(this.f251282e, 0)) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.listener.SnsAutoShowVKBOnUICreate");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.listener.SnsAutoShowVKBOnUICreate");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAutoShowVKBOnUICreate", "launch: result:" + valueOf + ", from:" + context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.listener.SnsAutoShowVKBOnUICreate$launch$1");
    }
}
