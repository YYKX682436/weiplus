package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class e2 extends com.tencent.mm.plugin.appbrand.widget.input.b2 {
    public e2(android.content.Context context) {
        super(com.tencent.mm.plugin.appbrand.jsapi.coverview.d.a(context));
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, com.tencent.mm.plugin.appbrand.widget.input.t4
    public android.view.View getInputPanel() {
        return com.tencent.mm.plugin.appbrand.widget.input.u3.y(this);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4
    public void o() {
        try {
            com.tencent.mm.plugin.appbrand.widget.input.m5.b(this).restartInput(this);
        } catch (java.lang.RuntimeException e17) {
            com.tencent.mars.xlog.Log.e("Luggage.Wxa.AppBrandInputWidgetSingleLineWithSoftKeyboard", "ensureInputConnection restartInput re=%s", e17);
            try {
                com.tencent.mm.plugin.appbrand.widget.input.m5.b(this).showSoftInput(this, 0);
            } catch (java.lang.RuntimeException e18) {
                com.tencent.mars.xlog.Log.e("Luggage.Wxa.AppBrandInputWidgetSingleLineWithSoftKeyboard", "ensureInputConnection showSoftInput re=%s", e18);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4
    public void setPasswordMode(boolean z17) {
        p();
        int inputType = getInputType() | 1;
        setInputType(z17 ? inputType | 128 : inputType & (-129));
        super.setPasswordMode(z17);
        t();
    }
}
