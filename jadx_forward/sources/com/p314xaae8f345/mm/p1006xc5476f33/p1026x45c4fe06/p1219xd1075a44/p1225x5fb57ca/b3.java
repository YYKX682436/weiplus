package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public final class b3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b2 {

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.z2 f172898v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8 f172899w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f172900x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f172901y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8 c28009x4b3da7b8 = new com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8(context);
        this.f172899w = c28009x4b3da7b8;
        setImeOptions(1);
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.i6(this);
        c28009x4b3da7b8.setText(getText());
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart >= 0 && selectionEnd >= 0 && selectionStart <= selectionEnd) {
            try {
                c28009x4b3da7b8.setSelection(selectionStart, selectionEnd);
            } catch (java.lang.Exception unused) {
            }
        }
        c28009x4b3da7b8.m121730xc90120ff(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x2(this));
        c28009x4b3da7b8.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y2(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        m53448x15fc1322();
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int keyCode = event.getKeyCode();
        boolean z17 = true;
        if (!(7 <= keyCode && keyCode < 17)) {
            int keyCode2 = event.getKeyCode();
            if (!(29 <= keyCode2 && keyCode2 < 55)) {
                z17 = false;
            }
        }
        android.view.KeyEvent keyEvent = z17 ? new android.view.KeyEvent(event.getAction(), 155) : event;
        m53448x15fc1322();
        event.toString();
        keyEvent.toString();
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        this.f172899w.dispatchKeyEvent(event);
        m53448x15fc1322();
        return dispatchKeyEvent;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4
    public boolean f() {
        m53448x15fc1322();
        return false;
    }

    /* renamed from: getListener */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.z2 m53447xcc17022a() {
        return this.f172898v;
    }

    /* renamed from: getMyTag$luggage_wxa_app_input_ext_release */
    public final java.lang.String m53448x15fc1322() {
        return "MicroMsg.AppBrand.AppBrandSecureInputWidget#" + m53464xb251d24f();
    }

    /* renamed from: getRealText$luggage_wxa_app_input_ext_release */
    public final java.lang.String m53449x421201ab() {
        android.text.Editable text = this.f172899w.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    /* renamed from: getSecureInputWidgetLogic$luggage_wxa_app_input_ext_release */
    public final com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8 m53450x848eb727() {
        return this.f172899w;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4
    public void h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        m53448x15fc1322();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4
    public void i(java.lang.CharSequence charSequence) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(m53448x15fc1322(), "appendText, text: " + ((java.lang.Object) charSequence));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4
    public void m() {
        m53448x15fc1322();
        dispatchKeyEvent(new android.view.KeyEvent(0, 67));
        dispatchKeyEvent(new android.view.KeyEvent(1, 67));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4
    public void o() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f3 mo53433x400bc850;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (!n3.x0.b(this) || (mo53433x400bc850 = mo53433x400bc850()) == null) {
            return;
        }
        mo53433x400bc850.m53474x6430d8ec(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onCreateContextMenu(android.view.ContextMenu contextMenu) {
        if (contextMenu != null) {
            contextMenu.clearHeader();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4, android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        m53448x15fc1322();
        return null;
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m53448x15fc1322(), "onSelectionChanged, selStart: " + i17 + ", selEnd: " + i18);
        android.text.Editable text = getText();
        int length = text != null ? text.length() : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m53448x15fc1322(), "onSelectionChangedDisable, sel: " + length);
        if (i17 != length || i18 != length) {
            setSelection(length, length);
        } else {
            super.onSelectionChanged(i17, i18);
            post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.a3(this, i17, i18));
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i17) {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4
    /* renamed from: setInputId */
    public void mo53451x25c31fc3(int i17) {
        m53448x15fc1322();
        super.mo53451x25c31fc3(i17);
    }

    /* renamed from: setLength$luggage_wxa_app_input_ext_release */
    public final void m53452xcad46072(int i17) {
        m53448x15fc1322();
        this.f172899w.m121728x5137b98e(i17, i17);
    }

    /* renamed from: setListener */
    public final void m53453xc6cf6336(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.z2 z2Var) {
        this.f172898v = z2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4, android.widget.EditText, android.widget.TextView
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
                m53448x15fc1322();
                sb6.append(charAt);
            }
            str = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        } else {
            str = (java.lang.String) charSequence;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandSecureInputWidget", "setText, text: " + ((java.lang.Object) charSequence) + ", shownText: " + str + ", type: " + bufferType);
        super.setText(str, bufferType);
        try {
            this.f172899w.setText(charSequence, bufferType);
        } catch (java.lang.NullPointerException unused) {
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4
    public void v(char c17) {
        if (java.lang.Character.isLetterOrDigit(c17)) {
            c17 = '*';
        }
        m53448x15fc1322();
        this.f172954u = c17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4
    /* renamed from: getInputPanel */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f3 mo53433x400bc850() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f3 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f3.f172975n.a(this);
        m53448x15fc1322();
        java.util.Objects.toString(a17);
        return a17;
    }
}
