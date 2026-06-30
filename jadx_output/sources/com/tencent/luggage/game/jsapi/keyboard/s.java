package com.tencent.luggage.game.jsapi.keyboard;

/* loaded from: classes7.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f47255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f47256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f47257f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.game.jsapi.keyboard.t f47258g;

    public s(com.tencent.luggage.game.jsapi.keyboard.t tVar, com.tencent.mm.plugin.appbrand.e9 e9Var, java.lang.String str, int i17) {
        this.f47258g = tVar;
        this.f47255d = e9Var;
        this.f47256e = str;
        this.f47257f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.v5 V0;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f47255d;
        if (!e9Var.isRunning() || (V0 = e9Var.V0()) == null) {
            return;
        }
        ie.d N = ie.d.N(V0.getContentView());
        com.tencent.luggage.game.jsapi.keyboard.t tVar = this.f47258g;
        int i17 = this.f47257f;
        if (N == null) {
            e9Var.a(i17, tVar.o("fail"));
            return;
        }
        com.tencent.luggage.game.widget.input.WAGamePanelInputEditText attachedEditText = N.getAttachedEditText();
        int maxLength = attachedEditText.getMaxLength();
        java.lang.String str = this.f47256e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            attachedEditText.setText("");
        } else {
            if (maxLength > 0) {
                if (str.length() > maxLength) {
                    str = str.substring(0, maxLength);
                }
                attachedEditText.setText(str);
            } else {
                attachedEditText.setText(str);
            }
            attachedEditText.setSelection(attachedEditText.getText().length());
        }
        e9Var.a(i17, tVar.o("ok"));
    }
}
