package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes9.dex */
public final class j implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public boolean f156096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.C11487xdaa53b89 f156097e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f156098f;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.C11487xdaa53b89 c11487xdaa53b89, android.content.Context context) {
        this.f156097e = c11487xdaa53b89;
        this.f156098f = context;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        boolean z17;
        java.lang.String str;
        if (this.f156096d) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.C11487xdaa53b89 c11487xdaa53b89 = this.f156097e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c11487xdaa53b89.f155939p;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("itemTextET");
            throw null;
        }
        android.text.Editable text = c22621x7603e017.getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(text);
        c11487xdaa53b89.getClass();
        java.lang.Object[] spans = text.getSpans(0, text.length(), java.lang.Object.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(spans);
        int length = spans.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                z17 = false;
                break;
            }
            java.lang.Object obj = spans[i17];
            java.lang.String name = obj.getClass().getName();
            if (r26.n0.B(name, "ComposingText", false) || r26.n0.B(name, "Composing", false) || (text.getSpanFlags(obj) & 256) != 0) {
                z17 = true;
                break;
            }
            i17++;
        }
        if (z17) {
            c11487xdaa53b89.c(true);
            return;
        }
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        android.text.SpannableString i18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this.f156098f, str);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c11487xdaa53b89.f155941r, i18.toString())) {
            this.f156096d = true;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = c11487xdaa53b89.f155939p;
            if (c22621x7603e0172 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("itemTextET");
                throw null;
            }
            int selectionStart = c22621x7603e0172.getSelectionStart();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0173 = c11487xdaa53b89.f155939p;
            if (c22621x7603e0173 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("itemTextET");
                throw null;
            }
            int selectionEnd = c22621x7603e0173.getSelectionEnd();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0174 = c11487xdaa53b89.f155939p;
            if (c22621x7603e0174 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("itemTextET");
                throw null;
            }
            c22621x7603e0174.removeTextChangedListener(this);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0175 = c11487xdaa53b89.f155939p;
            if (c22621x7603e0175 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("itemTextET");
                throw null;
            }
            c22621x7603e0175.setText(i18);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0176 = c11487xdaa53b89.f155939p;
            if (c22621x7603e0176 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("itemTextET");
                throw null;
            }
            int length2 = c22621x7603e0176.getText().length();
            if (selectionStart > length2) {
                selectionStart = length2;
            }
            if (selectionEnd > length2) {
                selectionEnd = length2;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0177 = c11487xdaa53b89.f155939p;
            if (c22621x7603e0177 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("itemTextET");
                throw null;
            }
            c22621x7603e0177.setSelection(selectionStart, selectionEnd);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0178 = c11487xdaa53b89.f155939p;
            if (c22621x7603e0178 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("itemTextET");
                throw null;
            }
            c22621x7603e0178.addTextChangedListener(this);
            this.f156096d = false;
            java.lang.String spannableString = i18.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(spannableString, "toString(...)");
            c11487xdaa53b89.f155941r = spannableString;
        }
        c11487xdaa53b89.c(true);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
