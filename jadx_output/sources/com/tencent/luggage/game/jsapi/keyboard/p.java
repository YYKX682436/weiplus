package com.tencent.luggage.game.jsapi.keyboard;

/* loaded from: classes7.dex */
public class p implements com.tencent.mm.plugin.appbrand.widget.input.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.game.widget.input.WAGamePanelInputEditText f47248a;

    public p(com.tencent.luggage.game.jsapi.keyboard.r rVar, com.tencent.luggage.game.widget.input.WAGamePanelInputEditText wAGamePanelInputEditText) {
        this.f47248a = wAGamePanelInputEditText;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.q3
    public boolean a(java.lang.String str) {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        com.tencent.luggage.game.widget.input.WAGamePanelInputEditText wAGamePanelInputEditText = this.f47248a;
        if (!n3.x0.b(wAGamePanelInputEditText)) {
            return false;
        }
        if ("[DELETE_EMOTION]".equalsIgnoreCase(str)) {
            wAGamePanelInputEditText.getClass();
            wAGamePanelInputEditText.dispatchKeyEvent(new android.view.KeyEvent(0, 67));
            wAGamePanelInputEditText.dispatchKeyEvent(new android.view.KeyEvent(1, 67));
        } else {
            wAGamePanelInputEditText.append(str);
        }
        return true;
    }
}
