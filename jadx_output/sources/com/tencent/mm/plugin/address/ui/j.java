package com.tencent.mm.plugin.address.ui;

/* loaded from: classes9.dex */
public final class j implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public boolean f74563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.AddrItemView f74564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f74565f;

    public j(com.tencent.mm.plugin.address.ui.AddrItemView addrItemView, android.content.Context context) {
        this.f74564e = addrItemView;
        this.f74565f = context;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        boolean z17;
        java.lang.String str;
        if (this.f74563d) {
            return;
        }
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView = this.f74564e;
        com.tencent.mm.ui.widget.MMEditText mMEditText = addrItemView.f74406p;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("itemTextET");
            throw null;
        }
        android.text.Editable text = mMEditText.getText();
        kotlin.jvm.internal.o.d(text);
        addrItemView.getClass();
        java.lang.Object[] spans = text.getSpans(0, text.length(), java.lang.Object.class);
        kotlin.jvm.internal.o.d(spans);
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
            addrItemView.c(true);
            return;
        }
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        android.text.SpannableString i18 = com.tencent.mm.pluginsdk.ui.span.c0.i(this.f74565f, str);
        if (!kotlin.jvm.internal.o.b(addrItemView.f74408r, i18.toString())) {
            this.f74563d = true;
            com.tencent.mm.ui.widget.MMEditText mMEditText2 = addrItemView.f74406p;
            if (mMEditText2 == null) {
                kotlin.jvm.internal.o.o("itemTextET");
                throw null;
            }
            int selectionStart = mMEditText2.getSelectionStart();
            com.tencent.mm.ui.widget.MMEditText mMEditText3 = addrItemView.f74406p;
            if (mMEditText3 == null) {
                kotlin.jvm.internal.o.o("itemTextET");
                throw null;
            }
            int selectionEnd = mMEditText3.getSelectionEnd();
            com.tencent.mm.ui.widget.MMEditText mMEditText4 = addrItemView.f74406p;
            if (mMEditText4 == null) {
                kotlin.jvm.internal.o.o("itemTextET");
                throw null;
            }
            mMEditText4.removeTextChangedListener(this);
            com.tencent.mm.ui.widget.MMEditText mMEditText5 = addrItemView.f74406p;
            if (mMEditText5 == null) {
                kotlin.jvm.internal.o.o("itemTextET");
                throw null;
            }
            mMEditText5.setText(i18);
            com.tencent.mm.ui.widget.MMEditText mMEditText6 = addrItemView.f74406p;
            if (mMEditText6 == null) {
                kotlin.jvm.internal.o.o("itemTextET");
                throw null;
            }
            int length2 = mMEditText6.getText().length();
            if (selectionStart > length2) {
                selectionStart = length2;
            }
            if (selectionEnd > length2) {
                selectionEnd = length2;
            }
            com.tencent.mm.ui.widget.MMEditText mMEditText7 = addrItemView.f74406p;
            if (mMEditText7 == null) {
                kotlin.jvm.internal.o.o("itemTextET");
                throw null;
            }
            mMEditText7.setSelection(selectionStart, selectionEnd);
            com.tencent.mm.ui.widget.MMEditText mMEditText8 = addrItemView.f74406p;
            if (mMEditText8 == null) {
                kotlin.jvm.internal.o.o("itemTextET");
                throw null;
            }
            mMEditText8.addTextChangedListener(this);
            this.f74563d = false;
            java.lang.String spannableString = i18.toString();
            kotlin.jvm.internal.o.f(spannableString, "toString(...)");
            addrItemView.f74408r = spannableString;
        }
        addrItemView.c(true);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
