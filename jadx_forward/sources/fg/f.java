package fg;

/* loaded from: classes7.dex */
public final class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4 {
    public pl1.f A;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.inputmethod.InputConnection f343290v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8 f343291w;

    /* renamed from: x, reason: collision with root package name */
    public fg.c f343292x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f343293y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f343294z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, android.view.inputmethod.InputConnection sameLayerInputConnection) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sameLayerInputConnection, "sameLayerInputConnection");
        this.f343290v = sameLayerInputConnection;
        com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8 c28009x4b3da7b8 = new com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8(context);
        this.f343291w = c28009x4b3da7b8;
        setImeOptions(1);
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.i6(this);
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart >= 0 && selectionEnd >= 0 && selectionStart <= selectionEnd) {
            try {
                c28009x4b3da7b8.setSelection(selectionStart, selectionEnd);
            } catch (java.lang.Exception unused) {
            }
        }
        c28009x4b3da7b8.m121730xc90120ff(new fg.a(this));
        c28009x4b3da7b8.addTextChangedListener(new fg.b());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        android.view.KeyEvent keyEvent = w(event) ? new android.view.KeyEvent(event.getAction(), 155) : event;
        event.toString();
        keyEvent.toString();
        if (w(event) && event.getAction() == 0) {
            android.text.Editable text = getText();
            if ((text != null ? text.length() : 0) >= getMaxEms()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelegateEditText", "over max ems, return");
                return false;
            }
        }
        super.dispatchKeyEvent(keyEvent);
        com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8 c28009x4b3da7b8 = this.f343291w;
        c28009x4b3da7b8.requestFocus();
        boolean dispatchKeyEvent = c28009x4b3da7b8.dispatchKeyEvent(event);
        c28009x4b3da7b8.clearFocus();
        android.view.inputmethod.InputConnection inputConnection = this.f343290v;
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(keyEvent);
        }
        return dispatchKeyEvent;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4
    public boolean e() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4
    public boolean f() {
        return false;
    }

    /* renamed from: getListener */
    public final fg.c m129519xcc17022a() {
        return this.f343292x;
    }

    /* renamed from: getRealText$luggage_xweb_ext_release */
    public final android.text.Editable m129520x95ccead2() {
        return this.f343291w.getText();
    }

    /* renamed from: getSecureInputWidgetLogic$luggage_xweb_ext_release */
    public final com.p3249xcbb51f6b.p3253x3f73626a.C28009x4b3da7b8 m129521xe6b2d9d6() {
        return this.f343291w;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4
    public void h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4
    public void i(java.lang.CharSequence charSequence) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DelegateEditText", "appendText, text: " + ((java.lang.Object) charSequence));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4
    public void m() {
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

    @Override // android.widget.TextView
    public void onSelectionChanged(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelegateEditText", "onSelectionChanged, selStart: " + i17 + ", selEnd: " + i18);
        android.text.Editable text = getText();
        int length = text != null ? text.length() : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelegateEditText", "onSelectionChangedDisable, sel: " + length);
        if (i17 != length || i18 != length) {
            setSelection(length, length);
        } else {
            super.onSelectionChanged(i17, i18);
            post(new fg.d(this, i17, i18));
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i17) {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4
    /* renamed from: setInputId */
    public void mo53451x25c31fc3(int i17) {
        super.mo53451x25c31fc3(i17);
    }

    /* renamed from: setListener */
    public final void m129522xc6cf6336(fg.c cVar) {
        this.f343292x = cVar;
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
                sb6.append(charAt);
            }
            str = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        } else {
            str = (java.lang.String) charSequence;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelegateEditText", "setText, text: " + ((java.lang.Object) charSequence) + ", shownText: " + str + ", type: " + bufferType);
        super.setText(str, bufferType);
        try {
            this.f343291w.setText(charSequence, bufferType);
        } catch (java.lang.NullPointerException unused) {
        }
        android.view.inputmethod.InputConnection inputConnection = this.f343290v;
        if (inputConnection != null) {
            inputConnection.deleteSurroundingText(Integer.MAX_VALUE, Integer.MAX_VALUE);
            inputConnection.commitText(str, 1);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4
    public void v(char c17) {
        if (java.lang.Character.isLetterOrDigit(c17)) {
            c17 = '*';
        }
        this.f172954u = c17;
    }

    public final boolean w(android.view.KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (7 <= keyCode && keyCode < 17) {
            return true;
        }
        int keyCode2 = keyEvent.getKeyCode();
        return 29 <= keyCode2 && keyCode2 < 55;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4
    /* renamed from: getInputPanel */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f3 mo53433x400bc850() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f3 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f3.f172975n.a(this);
        java.util.Objects.toString(a17);
        return a17;
    }
}
