package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class b3 extends com.tencent.mm.plugin.appbrand.widget.input.b2 {

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.z2 f91365v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tenpay.miniapp.MiniAppSecureEditText f91366w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f91367x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f91368y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        com.tenpay.miniapp.MiniAppSecureEditText miniAppSecureEditText = new com.tenpay.miniapp.MiniAppSecureEditText(context);
        this.f91366w = miniAppSecureEditText;
        setImeOptions(1);
        new com.tencent.mm.plugin.appbrand.widget.input.i6(this);
        miniAppSecureEditText.setText(getText());
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart >= 0 && selectionEnd >= 0 && selectionStart <= selectionEnd) {
            try {
                miniAppSecureEditText.setSelection(selectionStart, selectionEnd);
            } catch (java.lang.Exception unused) {
            }
        }
        miniAppSecureEditText.setOnPasswdInputListener(new com.tencent.mm.plugin.appbrand.widget.input.x2(this));
        miniAppSecureEditText.addTextChangedListener(new com.tencent.mm.plugin.appbrand.widget.input.y2(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, com.tencent.mm.plugin.appbrand.widget.input.t4
    public void b(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        getMyTag$luggage_wxa_app_input_ext_release();
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        int keyCode = event.getKeyCode();
        boolean z17 = true;
        if (!(7 <= keyCode && keyCode < 17)) {
            int keyCode2 = event.getKeyCode();
            if (!(29 <= keyCode2 && keyCode2 < 55)) {
                z17 = false;
            }
        }
        android.view.KeyEvent keyEvent = z17 ? new android.view.KeyEvent(event.getAction(), 155) : event;
        getMyTag$luggage_wxa_app_input_ext_release();
        event.toString();
        keyEvent.toString();
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        this.f91366w.dispatchKeyEvent(event);
        getMyTag$luggage_wxa_app_input_ext_release();
        return dispatchKeyEvent;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, com.tencent.mm.plugin.appbrand.widget.input.t4
    public boolean f() {
        getMyTag$luggage_wxa_app_input_ext_release();
        return false;
    }

    public final com.tencent.mm.plugin.appbrand.widget.input.z2 getListener() {
        return this.f91365v;
    }

    public final java.lang.String getMyTag$luggage_wxa_app_input_ext_release() {
        return "MicroMsg.AppBrand.AppBrandSecureInputWidget#" + getInputId();
    }

    public final java.lang.String getRealText$luggage_wxa_app_input_ext_release() {
        android.text.Editable text = this.f91366w.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final com.tenpay.miniapp.MiniAppSecureEditText getSecureInputWidgetLogic$luggage_wxa_app_input_ext_release() {
        return this.f91366w;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, com.tencent.mm.plugin.appbrand.widget.input.t4
    public void h(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        getMyTag$luggage_wxa_app_input_ext_release();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4
    public void i(java.lang.CharSequence charSequence) {
        com.tencent.mars.xlog.Log.e(getMyTag$luggage_wxa_app_input_ext_release(), "appendText, text: " + ((java.lang.Object) charSequence));
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4
    public void m() {
        getMyTag$luggage_wxa_app_input_ext_release();
        dispatchKeyEvent(new android.view.KeyEvent(0, 67));
        dispatchKeyEvent(new android.view.KeyEvent(1, 67));
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4
    public void o() {
        com.tencent.mm.plugin.appbrand.widget.input.f3 inputPanel;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (!n3.x0.b(this) || (inputPanel = getInputPanel()) == null) {
            return;
        }
        inputPanel.setInputWidget(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onCreateContextMenu(android.view.ContextMenu contextMenu) {
        if (contextMenu != null) {
            contextMenu.clearHeader();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        getMyTag$luggage_wxa_app_input_ext_release();
        return null;
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(getMyTag$luggage_wxa_app_input_ext_release(), "onSelectionChanged, selStart: " + i17 + ", selEnd: " + i18);
        android.text.Editable text = getText();
        int length = text != null ? text.length() : 0;
        com.tencent.mars.xlog.Log.i(getMyTag$luggage_wxa_app_input_ext_release(), "onSelectionChangedDisable, sel: " + length);
        if (i17 != length || i18 != length) {
            setSelection(length, length);
        } else {
            super.onSelectionChanged(i17, i18);
            post(new com.tencent.mm.plugin.appbrand.widget.input.a3(this, i17, i18));
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i17) {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, com.tencent.mm.plugin.appbrand.widget.input.t4
    public void setInputId(int i17) {
        getMyTag$luggage_wxa_app_input_ext_release();
        super.setInputId(i17);
    }

    public final void setLength$luggage_wxa_app_input_ext_release(int i17) {
        getMyTag$luggage_wxa_app_input_ext_release();
        this.f91366w.setInputLength(i17, i17);
    }

    public final void setListener(com.tencent.mm.plugin.appbrand.widget.input.z2 z2Var) {
        this.f91365v = z2Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, android.widget.EditText, android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        java.lang.String str;
        if (charSequence != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int length = charSequence.length();
            for (int i17 = 0; i17 < length; i17++) {
                char charAt = charSequence.charAt(i17);
                if (java.lang.Character.isLetterOrDigit(charAt)) {
                    charAt = '*';
                }
                getMyTag$luggage_wxa_app_input_ext_release();
                sb6.append(charAt);
            }
            str = sb6.toString();
            kotlin.jvm.internal.o.f(str, "toString(...)");
        } else {
            str = (java.lang.String) charSequence;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandSecureInputWidget", "setText, text: " + ((java.lang.Object) charSequence) + ", shownText: " + str + ", type: " + bufferType);
        super.setText(str, bufferType);
        try {
            this.f91366w.setText(charSequence, bufferType);
        } catch (java.lang.NullPointerException unused) {
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4
    public void v(char c17) {
        if (java.lang.Character.isLetterOrDigit(c17)) {
            c17 = '*';
        }
        getMyTag$luggage_wxa_app_input_ext_release();
        this.f91421u = c17;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, com.tencent.mm.plugin.appbrand.widget.input.t4
    public com.tencent.mm.plugin.appbrand.widget.input.f3 getInputPanel() {
        com.tencent.mm.plugin.appbrand.widget.input.f3 a17 = com.tencent.mm.plugin.appbrand.widget.input.f3.f91442n.a(this);
        getMyTag$luggage_wxa_app_input_ext_release();
        java.util.Objects.toString(a17);
        return a17;
    }
}
