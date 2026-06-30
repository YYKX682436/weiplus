package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.MMEditText */
/* loaded from: classes15.dex */
public class C22621x7603e017 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6 implements fl5.i, android.text.InputFilter {
    public static final /* synthetic */ int F = 0;
    public al5.n1 A;
    public fl5.f B;
    public al5.q1 C;
    public nl5.s0 D;
    public nl5.p E;

    /* renamed from: r, reason: collision with root package name */
    public android.view.inputmethod.InputConnection f292849r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f292850s;

    /* renamed from: t, reason: collision with root package name */
    public fl5.e f292851t;

    /* renamed from: u, reason: collision with root package name */
    public fl5.h f292852u;

    /* renamed from: v, reason: collision with root package name */
    public fl5.d f292853v;

    /* renamed from: w, reason: collision with root package name */
    public fl5.c f292854w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f292855x;

    /* renamed from: y, reason: collision with root package name */
    public int f292856y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f292857z;

    public C22621x7603e017(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f292850s = false;
        this.f292855x = true;
        this.f292856y = 0;
        this.f292857z = false;
        this.E = null;
        addTextChangedListener(new al5.l1(this));
    }

    @Override // fl5.i
    public void a(nl5.p pVar) {
        this.E = pVar;
    }

    @Override // fl5.i
    public void b(java.lang.String str, java.lang.String str2, nl5.a0 a0Var, nl5.w wVar) {
        nl5.y yVar = new nl5.y(this);
        yVar.f419925g = str;
        yVar.f419924f = str2;
        if (wVar != null) {
            wVar.a(yVar);
        }
        nl5.s0 s0Var = new nl5.s0(yVar);
        this.D = s0Var;
        s0Var.f419901s = a0Var;
    }

    @Override // fl5.i
    public void c(fl5.g gVar) {
        if (gVar == null) {
            return;
        }
        setOnEditorActionListener(new al5.m1(this, gVar));
    }

    @Override // fl5.i
    public void d(boolean z17) {
    }

    @Override // fl5.i
    /* renamed from: destroy */
    public void mo81351x5cd39ffa() {
        nl5.s0 s0Var = this.D;
        if (s0Var != null) {
            s0Var.b();
        }
    }

    @Override // fl5.i
    public boolean e() {
        return false;
    }

    @Override // fl5.i
    public void f() {
        nl5.s0 s0Var = this.D;
        if (s0Var != null) {
            s0Var.a();
        }
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        if (this.f292855x && (charSequence instanceof java.lang.String)) {
            return ((java.lang.String) charSequence).replaceAll(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, "\n").replaceAll("\r", "\n");
        }
        return null;
    }

    @Override // fl5.i
    /* renamed from: getInputConnection */
    public android.view.inputmethod.InputConnection mo81352x6a67d012() {
        return this.f292849r;
    }

    /* renamed from: getRealEditText */
    public fl5.i mo61840xc52e48b() {
        return this;
    }

    @Override // fl5.i
    /* renamed from: getSelectHelper */
    public nl5.s0 mo81353xc6fc1640() {
        return this.D;
    }

    @Override // fl5.i
    public qa5.g getSizeAnimController() {
        int i17 = qa5.g.f442652a;
        return qa5.e.f442651a;
    }

    @Override // fl5.i
    public android.view.View j() {
        return this;
    }

    @Override // fl5.i
    public android.view.View l() {
        return this;
    }

    @Override // fl5.i
    public void m(boolean z17) {
        nl5.s0 s0Var = this.D;
        if (s0Var != null) {
            s0Var.N = z17;
            nl5.h hVar = (nl5.h) ((jz5.n) s0Var.P).mo141623x754a37bb();
            hVar.getClass();
            com.p314xaae8f345.mm.ui.yk.a("DoubleTapWordSelect", "onKeyboardShow: " + z17, new java.lang.Object[0]);
            hVar.f419816l = z17;
            if (!z17) {
                hVar.a();
            }
            if (z17) {
                nl5.s0 s0Var2 = this.D;
                s0Var2.a();
                s0Var2.T = false;
            } else {
                nl5.s0 s0Var3 = this.D;
                s0Var3.T = true;
                s0Var3.a();
            }
        }
    }

    public void n(java.lang.String str) {
        android.text.InputFilter[] filters;
        int d17 = pg5.d.d(getContext(), getText().toString(), getSelectionStart());
        int d18 = pg5.d.d(getContext(), getText().toString(), getSelectionEnd());
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(getText());
        java.lang.String str2 = stringBuffer.substring(0, d17) + str + stringBuffer.substring(d18, stringBuffer.length());
        int i17 = -1;
        if (fp.h.c(21) && (filters = getFilters()) != null) {
            for (android.text.InputFilter inputFilter : filters) {
                if (inputFilter instanceof android.text.InputFilter.LengthFilter) {
                    i17 = ((android.text.InputFilter.LengthFilter) inputFilter).getMax();
                }
            }
        }
        int length = d17 + str.length();
        if (i17 <= 0 || length <= i17) {
            setText(pg5.d.b(str2, false));
            mo81549xf579a34a(length);
        }
    }

    @Override // fl5.i
    public void o() {
        nl5.s0 s0Var = this.D;
        if (s0Var != null) {
            s0Var.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null) {
            this.f292849r = new nl5.v(onCreateInputConnection);
        } else {
            this.f292849r = onCreateInputConnection;
        }
        if (this.f292849r != null && this.f292850s) {
            editorInfo.imeOptions &= -1073741825;
            editorInfo.inputType &= -131073;
        }
        if (editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new android.os.Bundle();
            }
            editorInfo.extras.putInt("SUPPORT_SOGOU_EXPRESSION", 1);
        }
        android.view.inputmethod.InputConnection inputConnection = this.f292849r;
        return inputConnection != null ? new al5.k1(this, this.f292849r, true) : inputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i17, android.view.KeyEvent keyEvent) {
        if (this.A != null && i17 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                android.view.KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                android.view.KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    this.A.a();
                    android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
                    }
                    return true;
                }
            }
        }
        al5.q1 q1Var = this.C;
        if (q1Var == null || !((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.w1) q1Var).a(i17, keyEvent)) {
            return super.onKeyPreIme(i17, keyEvent);
        }
        return true;
    }

    @Override // fl5.i
    /* renamed from: onPause */
    public void mo81355xb01dfb57() {
        nl5.s0 s0Var = this.D;
        if (s0Var != null) {
            s0Var.a();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6, android.widget.TextView
    public boolean onPrivateIMECommand(java.lang.String str, android.os.Bundle bundle) {
        if (gl5.i.a(str, bundle, this.f292851t)) {
            return true;
        }
        nl5.p pVar = this.E;
        return pVar != null ? pVar.a(str, bundle) : super.onPrivateIMECommand(str, bundle);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i17, int i18) {
        super.onSelectionChanged(i17, i18);
        if (this.f292852u == null || this.f292857z) {
            return;
        }
        android.text.Layout layout = getLayout();
        if (layout != null && layout.getLineCount() >= 0) {
            int lineForOffset = layout.getLineForOffset(i17);
            layout.getLineTop(lineForOffset);
            layout.getLineBottom(lineForOffset);
        }
        this.f292852u.a(i17, i18, layout);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        fl5.d dVar = this.f292853v;
        if (dVar != null) {
            dVar.mo63638x6521d014(i17, i18, i19, i27);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6, android.widget.EditText, android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTextContextMenuItem(int r8) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.MMEditText"
            r1 = 16908322(0x1020022, float:2.3877324E-38)
            r2 = 0
            fl5.c r3 = r7.f292854w     // Catch: java.lang.NullPointerException -> L22 java.lang.IndexOutOfBoundsException -> L2d
            if (r3 == 0) goto L15
            if (r8 != r1) goto L15
            android.content.Context r4 = r7.getContext()     // Catch: java.lang.NullPointerException -> L22 java.lang.IndexOutOfBoundsException -> L2d
            boolean r3 = r3.a(r4)     // Catch: java.lang.NullPointerException -> L22 java.lang.IndexOutOfBoundsException -> L2d
            goto L16
        L15:
            r3 = r2
        L16:
            if (r3 != 0) goto L39
            boolean r3 = super.onTextContextMenuItem(r8)     // Catch: java.lang.IndexOutOfBoundsException -> L1d java.lang.NullPointerException -> L22
            goto L39
        L1d:
            r4 = move-exception
            r6 = r4
            r4 = r3
            r3 = r6
            goto L2f
        L22:
            r8 = move-exception
            java.lang.String r1 = "!!MMEditText NullPointerException %s"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1, r8)
            return r2
        L2d:
            r3 = move-exception
            r4 = r2
        L2f:
            java.lang.String r5 = "!!MMEditText IndexOutOfBoundsException %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r5, r3)
            r3 = r4
        L39:
            if (r8 != r1) goto L77
            r7.f292856y = r2
            android.text.Editable r8 = r7.getText()
            java.lang.String r8 = r8.toString()
            r7.s(r8)     // Catch: java.lang.IndexOutOfBoundsException -> L49
            goto L77
        L49:
            r1 = move-exception
            int r2 = r7.f292856y
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r4 = "!!MMEditText Exception %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r4, r2)
            int r0 = r7.f292856y
            r2 = 3
            if (r0 >= r2) goto L76
            int r0 = r7.f292856y
            int r0 = r0 + 1
            r7.f292856y = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.s(r8)
            goto L77
        L76:
            throw r1
        L77:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017.onTextContextMenuItem(int):boolean");
    }

    @Override // android.widget.TextView, android.view.View
    public boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    @Override // android.view.View
    public boolean requestFocus(int i17, android.graphics.Rect rect) {
        try {
            return super.requestFocus(i17, rect);
        } catch (java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMEditText", "[requestFocus] error:%s", e17);
            return false;
        }
    }

    public void s(java.lang.String str) {
        this.f292857z = true;
        int selectionStart = getSelectionStart();
        setText(pg5.d.b(str, false));
        int length = getText().length() - str.length();
        if (length > 0) {
            int i17 = selectionStart + length;
            if (i17 <= getText().length()) {
                mo81549xf579a34a(i17);
            }
        } else {
            mo81549xf579a34a(selectionStart);
        }
        this.f292857z = false;
    }

    /* renamed from: setAutoCompactLineBreak */
    public void m81356xb5f61cd9(boolean z17) {
        this.f292855x = z17;
    }

    @Override // fl5.i
    /* renamed from: setBackListener */
    public void mo81357xb8fce43d(al5.n1 n1Var) {
        this.A = n1Var;
    }

    @Override // fl5.i
    /* renamed from: setEnableSendBtn */
    public void mo81358x8f2956f(boolean z17) {
        this.f292850s = z17;
    }

    @Override // android.widget.TextView, fl5.i
    /* renamed from: setFilters */
    public void mo81583x7e4f2d39(android.text.InputFilter[] inputFilterArr) {
        android.text.InputFilter[] inputFilterArr2;
        try {
            boolean z17 = false;
            for (android.text.InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this) {
                    z17 = true;
                }
            }
            if (z17) {
                inputFilterArr2 = inputFilterArr;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(inputFilterArr));
                arrayList.add(this);
                inputFilterArr2 = (android.text.InputFilter[]) arrayList.toArray(new android.text.InputFilter[0]);
            }
            super.setFilters(inputFilterArr2);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.ui.yk.d("MicroMsg.MMEditText", th6, "set Filters err", new java.lang.Object[0]);
            super.setFilters(inputFilterArr);
        }
    }

    @Override // fl5.i
    /* renamed from: setImeSendImageCallback */
    public void mo81359xbbee6dd9(fl5.e eVar) {
        this.f292851t = eVar;
    }

    @Override // fl5.i
    /* renamed from: setInputListener */
    public void mo81360xbf01395c(fl5.f fVar) {
        this.B = fVar;
    }

    @Override // fl5.i
    /* renamed from: setKeyCodeEnterListener */
    public void mo81361xf1ab59a2(al5.q1 q1Var) {
        this.C = q1Var;
    }

    @Override // android.view.View, fl5.i
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        if (this.D == null || onClickListener == null || onClickListener.getClass().getName().contains("SelectableEditTextHelper")) {
            super.setOnClickListener(onClickListener);
        } else {
            this.D.f419900r = onClickListener;
        }
    }

    @Override // android.view.View, fl5.i
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        if (this.D == null || onFocusChangeListener == null || onFocusChangeListener.getClass().getName().contains("SelectableEditTextHelper")) {
            super.setOnFocusChangeListener(onFocusChangeListener);
        } else {
            this.D.f419899q = onFocusChangeListener;
        }
    }

    @Override // android.view.View, fl5.i
    public void setOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        if (this.D == null || onLongClickListener == null || onLongClickListener.getClass().getName().contains("SelectableEditTextHelper")) {
            super.setOnLongClickListener(onLongClickListener);
        } else {
            this.D.f419897o = onLongClickListener;
        }
    }

    @Override // fl5.i
    /* renamed from: setOnMsgPasteListener */
    public void mo81362x7fcf1e67(fl5.c cVar) {
        this.f292854w = cVar;
    }

    @Override // android.view.View, fl5.i
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        if (this.D == null || onTouchListener == null || onTouchListener.getClass().getName().contains("SelectableEditTextHelper")) {
            super.setOnTouchListener(onTouchListener);
        } else {
            this.D.f419898p = onTouchListener;
        }
    }

    /* renamed from: setPasterLen */
    public void mo70738x2526cb14(int i17) {
    }

    @Override // android.widget.EditText, fl5.i
    /* renamed from: setSelection */
    public void mo81549xf579a34a(int i17) {
        try {
            super.setSelection(i17);
        } catch (java.lang.IndexOutOfBoundsException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMEditText", e17, "IndexOutOfBoundsExceptionindex = " + i17, new java.lang.Object[0]);
        }
    }

    @Override // fl5.i
    /* renamed from: setSelectionChangedListener */
    public void mo81363xda276ede(fl5.h hVar) {
        this.f292852u = hVar;
    }

    /* renamed from: setSizeChangeListener */
    public void m81364x44f86e7(fl5.d dVar) {
        this.f292853v = dVar;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        int i17 = b85.e.f99880e0;
        b85.e eVar = (b85.e) i95.n0.c(b85.e.class);
        if (!(eVar != null ? eVar.mo9971x8baf334f() : false)) {
            super.setText(charSequence, bufferType);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMEditText", "skip! evil setText");
            ((com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70) i95.n0.c(com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.InterfaceC4960xb8a45f70.class)).mo42746xf0eb9ea();
        }
    }

    public void t() {
        if (mo81352x6a67d012() != null) {
            mo81352x6a67d012().sendKeyEvent(new android.view.KeyEvent(0, 67));
            mo81352x6a67d012().sendKeyEvent(new android.view.KeyEvent(1, 67));
        } else {
            dispatchKeyEvent(new android.view.KeyEvent(0, 67));
            dispatchKeyEvent(new android.view.KeyEvent(1, 67));
        }
    }

    @Override // android.widget.EditText
    public void setSelection(int i17, int i18) {
        super.setSelection(i17, i18);
    }

    public C22621x7603e017(android.content.Context context) {
        super(context);
        this.f292850s = false;
        this.f292855x = true;
        this.f292856y = 0;
        this.f292857z = false;
        this.E = null;
        addTextChangedListener(new al5.l1(this));
    }

    public C22621x7603e017(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f292850s = false;
        this.f292855x = true;
        this.f292856y = 0;
        this.f292857z = false;
        this.E = null;
        addTextChangedListener(new al5.l1(this));
    }
}
