package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class y implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.z f289782d;

    public y(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.z zVar) {
        this.f289782d = zVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        if (windowInsets == null) {
            return windowInsets;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseConversationUI", "OnApplyWindowInsetsListener %s", windowInsets);
        windowInsets.consumeSystemWindowInsets();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.z zVar = this.f289782d;
        zVar.f289814h.V6(zVar.f289812f, windowInsets.getSystemWindowInsetTop(), new android.graphics.Rect(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom()), zVar.f289813g);
        return windowInsets;
    }
}
