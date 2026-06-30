package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public final class b implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f46133d;

    public b(android.app.Activity activity) {
        this.f46133d = activity;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final android.view.WindowInsets onApplyWindowInsets(android.view.View v17, android.view.WindowInsets insets) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(insets, "insets");
        boolean isVisible = insets.isVisible(android.view.WindowInsets.Type.ime());
        android.graphics.Insets insets2 = insets.getInsets(android.view.WindowInsets.Type.ime());
        kotlin.jvm.internal.o.f(insets2, "getInsets(...)");
        java.lang.String str = android.os.Build.MANUFACTURER;
        if (str == null) {
            str = "";
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        if (r26.n0.B(lowerCase, "vivo", false)) {
            android.graphics.Insets insets3 = insets.getInsets(256);
            kotlin.jvm.internal.o.f(insets3, "getInsets(...)");
            insets2 = android.graphics.Insets.max(insets2, insets3);
            kotlin.jvm.internal.o.f(insets2, "max(...)");
            isVisible = isVisible || insets.isVisible(256);
        }
        boolean z17 = isVisible;
        android.graphics.Insets insets4 = insets2;
        android.graphics.Insets insets5 = insets.getInsets(android.view.WindowInsets.Type.navigationBars());
        kotlin.jvm.internal.o.f(insets5, "getInsets(...)");
        android.graphics.Insets max = android.graphics.Insets.max(android.graphics.Insets.subtract(insets4, insets5), android.graphics.Insets.NONE);
        kotlin.jvm.internal.o.f(max, "max(...)");
        int i17 = max.bottom - max.top;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(insets.isVisible(android.view.WindowInsets.Type.ime()));
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        android.app.Activity activity = this.f46133d;
        java.util.Set set = com.tencent.liteapp.ui.e.f46147a;
        kd.c.c("LiteApp.KeyBoardHeightProviderUtil", "onApplyWindowInsets %s, %s, %s ,%s , %s, %s ,%s", insets4, valueOf, valueOf2, activity, v17, insets, 1);
        java.util.Set set2 = com.tencent.liteapp.ui.e.f46147a;
        java.util.Iterator it = com.tencent.liteapp.ui.e.f46147a.iterator();
        while (it.hasNext()) {
            com.tencent.liteapp.ui.i iVar = (com.tencent.liteapp.ui.i) ((com.tencent.liteapp.ui.a) it.next());
            iVar.getClass();
            kd.c.c("LiteApp.KeyboardHeightProvider", "onNotifyKeyBoardHeightChange() called with: height = [" + i17 + "], isShow = [" + z17 + "]", new java.lang.Object[0]);
            iVar.d(i17, iVar.f46178k ^ true);
        }
        java.util.Set set3 = com.tencent.liteapp.ui.e.f46147a;
        return v17.onApplyWindowInsets(insets);
    }
}
