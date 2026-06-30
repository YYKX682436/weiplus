package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class AppBrandNumberKeyboardView extends com.tencent.mm.plugin.appbrand.widget.input.numberpad.BaseNumberKeyboardView {

    /* renamed from: w, reason: collision with root package name */
    public int f91269w;

    /* renamed from: x, reason: collision with root package name */
    public final android.util.SparseIntArray f91270x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.inputmethod.InputConnection f91271y;

    public AppBrandNumberKeyboardView(android.content.Context context) {
        super(context);
        this.f91269w = 0;
        this.f91270x = new com.tencent.mm.plugin.appbrand.widget.input.p2(this);
        d();
    }

    public static boolean c(com.tencent.mm.plugin.appbrand.widget.input.AppBrandNumberKeyboardView appBrandNumberKeyboardView) {
        if (appBrandNumberKeyboardView.f91271y == null) {
            return false;
        }
        if (!android.text.TextUtils.isEmpty(r0.getTextBeforeCursor(1, 0))) {
            appBrandNumberKeyboardView.f91271y.deleteSurroundingText(1, 0);
        } else {
            appBrandNumberKeyboardView.f91271y.sendKeyEvent(new android.view.KeyEvent(0, 67));
            appBrandNumberKeyboardView.f91271y.sendKeyEvent(new android.view.KeyEvent(1, 67));
        }
        return true;
    }

    public final void d() {
        com.tencent.mm.plugin.appbrand.widget.input.q2 q2Var = new com.tencent.mm.plugin.appbrand.widget.input.q2(this);
        int i17 = 0;
        while (true) {
            android.util.SparseIntArray sparseIntArray = this.f91270x;
            if (i17 >= sparseIntArray.size()) {
                findViewById(com.tencent.mm.R.id.tenpay_keyboard_x).setOnClickListener(q2Var);
                ((com.tencent.mm.plugin.appbrand.widget.input.RepeatKeyTouchImageButton) findViewById(com.tencent.mm.R.id.tenpay_keyboard_d)).setRepeatKeyTouchListener(new com.tencent.mm.plugin.appbrand.widget.input.r2(this));
                return;
            } else {
                findViewById(sparseIntArray.valueAt(i17)).setOnClickListener(q2Var);
                i17++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(nl1.b bVar) {
        com.tencent.mm.plugin.appbrand.widget.input.x4 a17;
        if (bVar == 0) {
            return;
        }
        boolean z17 = bVar instanceof android.view.View;
        if (z17 && (a17 = com.tencent.mm.plugin.appbrand.widget.input.w4.a(((android.view.View) bVar).getContext())) != null) {
            a17.hideVKB();
        }
        if (bVar instanceof android.widget.EditText) {
            android.widget.EditText editText = (android.widget.EditText) bVar;
            editText.setShowSoftInputOnFocus(false);
            com.tencent.mm.plugin.appbrand.widget.input.m5.b(editText).hideSoftInputFromInputMethod(editText.getWindowToken(), 0);
        }
        if (z17) {
            ((android.view.View) bVar).requestFocus();
        }
        this.f91271y = bVar.a();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.numberpad.BaseNumberKeyboardView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setInputEditText(null);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.numberpad.BaseNumberKeyboardView
    public void setXMode(int i17) {
        super.setXMode(i17);
        this.f91269w = i17;
    }

    public AppBrandNumberKeyboardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f91269w = 0;
        this.f91270x = new com.tencent.mm.plugin.appbrand.widget.input.p2(this);
        d();
    }
}
