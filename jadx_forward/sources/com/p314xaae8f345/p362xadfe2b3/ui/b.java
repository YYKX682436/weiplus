package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes14.dex */
public final class b implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f127666d;

    public b(android.app.Activity activity) {
        this.f127666d = activity;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final android.view.WindowInsets onApplyWindowInsets(android.view.View v17, android.view.WindowInsets insets) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insets, "insets");
        boolean isVisible = insets.isVisible(android.view.WindowInsets.Type.ime());
        android.graphics.Insets insets2 = insets.getInsets(android.view.WindowInsets.Type.ime());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(insets2, "getInsets(...)");
        java.lang.String str = android.os.Build.MANUFACTURER;
        if (str == null) {
            str = "";
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        if (r26.n0.B(lowerCase, "vivo", false)) {
            android.graphics.Insets insets3 = insets.getInsets(256);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(insets3, "getInsets(...)");
            insets2 = android.graphics.Insets.max(insets2, insets3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(insets2, "max(...)");
            isVisible = isVisible || insets.isVisible(256);
        }
        boolean z17 = isVisible;
        android.graphics.Insets insets4 = insets2;
        android.graphics.Insets insets5 = insets.getInsets(android.view.WindowInsets.Type.navigationBars());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(insets5, "getInsets(...)");
        android.graphics.Insets max = android.graphics.Insets.max(android.graphics.Insets.subtract(insets4, insets5), android.graphics.Insets.NONE);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(max, "max(...)");
        int i17 = max.bottom - max.top;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(insets.isVisible(android.view.WindowInsets.Type.ime()));
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        android.app.Activity activity = this.f127666d;
        java.util.Set set = com.p314xaae8f345.p362xadfe2b3.ui.e.f127680a;
        kd.c.c("LiteApp.KeyBoardHeightProviderUtil", "onApplyWindowInsets %s, %s, %s ,%s , %s, %s ,%s", insets4, valueOf, valueOf2, activity, v17, insets, 1);
        java.util.Set set2 = com.p314xaae8f345.p362xadfe2b3.ui.e.f127680a;
        java.util.Iterator it = com.p314xaae8f345.p362xadfe2b3.ui.e.f127680a.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p362xadfe2b3.ui.i iVar = (com.p314xaae8f345.p362xadfe2b3.ui.i) ((com.p314xaae8f345.p362xadfe2b3.ui.a) it.next());
            iVar.getClass();
            kd.c.c("LiteApp.KeyboardHeightProvider", "onNotifyKeyBoardHeightChange() called with: height = [" + i17 + "], isShow = [" + z17 + "]", new java.lang.Object[0]);
            iVar.d(i17, iVar.f127711k ^ true);
        }
        java.util.Set set3 = com.p314xaae8f345.p362xadfe2b3.ui.e.f127680a;
        return v17.onApplyWindowInsets(insets);
    }
}
