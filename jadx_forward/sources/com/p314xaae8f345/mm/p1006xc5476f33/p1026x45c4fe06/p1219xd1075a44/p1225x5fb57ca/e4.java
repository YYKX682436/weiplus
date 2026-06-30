package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public abstract class e4 extends android.widget.EditText implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4, bl1.c {

    /* renamed from: d, reason: collision with root package name */
    public android.view.inputmethod.InputConnection f172940d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f172941e;

    /* renamed from: f, reason: collision with root package name */
    public volatile int f172942f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.k f172943g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f172944h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f172945i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f172946m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d4 f172947n;

    /* renamed from: o, reason: collision with root package name */
    public final android.text.method.PasswordTransformationMethod f172948o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.j4 f172949p;

    /* renamed from: q, reason: collision with root package name */
    public int f172950q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f172951r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f172952s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r4 f172953t;

    /* renamed from: u, reason: collision with root package name */
    public char f172954u;

    public e4(android.content.Context context) {
        super(context);
        this.f172941e = false;
        this.f172942f = -1;
        this.f172948o = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.g1();
        this.f172950q = 0;
        this.f172951r = false;
        this.f172952s = false;
        this.f172954u = (char) 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d4 d4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d4(this, null);
        this.f172947n = d4Var;
        this.f172944h = new x.b();
        this.f172946m = new x.b();
        this.f172945i = new x.b();
        this.f172949p = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.j4(this);
        setBackgroundDrawable(null);
        setIncludeFontPadding(false);
        j(3);
        setSingleLine(true);
        setTextCursorDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562376dy);
        setTextIsSelectable(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i17 = android.os.Build.VERSION.SDK_INT;
        setLineSpacing(0.0f, 1.0f);
        setTypeface(android.graphics.Typeface.SANS_SERIF);
        super.addTextChangedListener(d4Var);
        super.setPadding(0, 0, 0, 0);
        super.setEditableFactory(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.z3(this));
        if (f()) {
            this.f172943g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.k(this);
        } else {
            this.f172943g = null;
        }
        if (i17 < 35 || !com.p314xaae8f345.mm.ui.b4.b(getContext())) {
            return;
        }
        setLocalePreferredLineHeightForMinimumUsed(false);
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(android.text.TextWatcher textWatcher) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d4 d4Var = this.f172947n;
        if (textWatcher != null) {
            d4Var.f172932d.add(textWatcher);
        } else {
            d4Var.getClass();
        }
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.k kVar = this.f172943g;
        if (kVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.o oVar = kVar.f172873d;
            oVar.f172884d = v5Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1.a(v5Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b1 b1Var = oVar.f172883c;
            if (b1Var == null) {
                a17.getClass();
                return;
            }
            x.n nVar = (x.n) a17.f172921d;
            if (nVar.m174748xc6607c0(b1Var)) {
                return;
            }
            nVar.put(b1Var, a17);
        }
    }

    public void c(float f17, float f18) {
        throw new java.lang.IllegalStateException("Should implement performClick(float, float) in this class!");
    }

    @Override // android.view.View
    public void clearFocus() {
        if (getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) getParent()).setFocusableInTouchMode(true);
            ((android.view.ViewGroup) getParent()).setDescendantFocusability(131072);
        }
        super.clearFocus();
    }

    public boolean d() {
        return this.f172951r;
    }

    public boolean f() {
        return !(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.a2);
    }

    public boolean g() {
        return false;
    }

    /* renamed from: getAutoFillController */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.k m53463xdb215b04() {
        return this.f172943g;
    }

    @Override // android.widget.TextView, android.view.View
    public int getAutofillType() {
        return 0;
    }

    /* renamed from: getInputId */
    public int m53464xb251d24f() {
        return this.f172942f;
    }

    /* renamed from: getInputPanel */
    public abstract /* synthetic */ android.view.View mo53433x400bc850();

    /* renamed from: getLastKeyPressed */
    public char m53465xfe6f04ef() {
        return this.f172954u;
    }

    @Override // android.widget.TextView
    public android.graphics.drawable.Drawable getTextSelectHandle() {
        try {
            return super.getTextSelectHandle();
        } catch (android.content.res.Resources.NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: getView */
    public final android.view.View m53466xfb86a31b() {
        return this;
    }

    public void h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.k kVar = this.f172943g;
        if (kVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.o oVar = kVar.f172873d;
            oVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1.a(v5Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b1 b1Var = oVar.f172883c;
            if (b1Var == null) {
                a17.getClass();
            } else {
                ((x.n) a17.f172921d).m174754xc84af884(b1Var);
            }
        }
    }

    public void i(java.lang.CharSequence charSequence) {
        if (getEditableText() == null) {
            setText(charSequence, android.widget.TextView.BufferType.EDITABLE);
        } else {
            getEditableText().append(charSequence);
        }
        setSelection(getEditableText().length());
    }

    public final void j(int i17) {
        setGravity(i17 | (getGravity() & (-8388612) & (-8388614)));
        int gravity = getGravity();
        java.lang.CharSequence hint = getHint();
        if (android.text.TextUtils.isEmpty(hint)) {
            return;
        }
        java.lang.Class cls = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.f173082d;
        if (hint == null) {
            hint = "";
        }
        android.text.Spannable spannableStringBuilder = hint instanceof android.text.Spannable ? (android.text.Spannable) hint : new android.text.SpannableStringBuilder(hint);
        int i18 = gravity & 7;
        int i19 = 5;
        android.text.Layout.Alignment alignment = i18 != 1 ? i18 != 5 ? android.text.Layout.Alignment.ALIGN_NORMAL : android.text.Layout.Alignment.ALIGN_OPPOSITE : android.text.Layout.Alignment.ALIGN_CENTER;
        spannableStringBuilder.setSpan(new android.text.style.AlignmentSpan.Standard(alignment), 0, getHint().length(), 18);
        super.setHint(spannableStringBuilder);
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b4.f172902a[alignment.ordinal()];
        if (i27 == 1) {
            i19 = 4;
        } else if (i27 == 2) {
            i19 = 6;
        }
        super.setTextAlignment(i19);
    }

    public int k() {
        return l(getLineCount()) + getPaddingBottom();
    }

    public int l(int i17) {
        int paddingTop = getPaddingTop() + ((int) (i17 * (getLineHeight() + getLineSpacingExtra())));
        getLayout();
        return paddingTop;
    }

    public void m() {
        if (this.f172940d == null) {
            dispatchKeyEvent(new android.view.KeyEvent(0, 67));
            dispatchKeyEvent(new android.view.KeyEvent(1, 67));
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(getEditableText())) {
                return;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.a4) this.f172940d).deleteSurroundingText(getEditableText().length(), getEditableText().length() - 1);
        }
    }

    public void n() {
        ((x.n) this.f172944h).clear();
        ((x.n) this.f172946m).clear();
        ((x.n) this.f172945i).clear();
        this.f172947n.f172932d.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.k kVar = this.f172943g;
        if (kVar != null) {
            kVar.a();
        }
        super.setOnFocusChangeListener(null);
    }

    public abstract void o();

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        java.lang.Object obj = this.f172944h;
        if (((x.n) obj).m174752x7aab3243()) {
            return;
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q4 q4Var : (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q4[]) ((x.b) obj).keySet().toArray(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q4[((x.n) obj).f532379f])) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.d) q4Var).f172858a.c();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        this.f172940d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.a4(this, onCreateInputConnection, false, onCreateInputConnection);
        editorInfo.imeOptions |= 268435456;
        if (getImeOptions() != 0) {
            editorInfo.imeOptions &= -1073741825;
        }
        return this.f172940d;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z17, int i17, android.graphics.Rect rect) {
        super.onFocusChanged(z17, i17, rect);
        if (!z17) {
            clearComposingText();
        }
        if (z17) {
            o();
        }
        java.lang.Object obj = this.f172945i;
        if (((x.n) obj).m174752x7aab3243()) {
            return;
        }
        for (android.view.View.OnFocusChangeListener onFocusChangeListener : (android.view.View.OnFocusChangeListener[]) ((x.b) obj).keySet().toArray(new android.view.View.OnFocusChangeListener[((x.n) obj).f532379f])) {
            onFocusChangeListener.onFocusChange(this, z17);
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 67) {
            v('\b');
        }
        boolean onKeyDown = super.onKeyDown(i17, keyEvent);
        if (onKeyDown && i17 == 66) {
            v('\n');
        }
        this.f172952s = onKeyDown;
        return onKeyDown;
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r4 r4Var;
        if (this.f172952s || (r4Var = this.f172953t) == null || !r4Var.a(i17, keyEvent)) {
            return super.onKeyUp(i17, keyEvent);
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        java.lang.Object obj = this.f172946m;
        if (((x.n) obj).m174752x7aab3243()) {
            return;
        }
        for (java.lang.Object obj2 : ((x.b) obj).keySet().toArray()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.s4) obj2).a(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void p() {
        this.f172950q++;
    }

    public final void q() {
        super.clearFocus();
    }

    public final boolean r(int i17, android.graphics.Rect rect) {
        return super.requestFocus(i17, rect);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(android.text.TextWatcher textWatcher) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d4 d4Var = this.f172947n;
        if (textWatcher != null) {
            d4Var.f172932d.remove(textWatcher);
        } else {
            d4Var.getClass();
        }
    }

    @Override // android.view.View
    public boolean requestFocus(int i17, android.graphics.Rect rect) {
        if (130 == i17 && rect == null && (getParent() instanceof android.view.ViewGroup)) {
            ((android.view.ViewGroup) getParent()).setDescendantFocusability(262144);
            ((android.view.ViewGroup) getParent()).setFocusableInTouchMode(false);
        }
        try {
            return super.requestFocus(i17, rect);
        } catch (java.lang.RuntimeException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.WebEditText", "requestFocus e=%s", e17);
            try {
                return super.requestFocus(i17, rect);
            } catch (java.lang.RuntimeException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.WebEditText", "requestFocus try again e=%s", e18);
                return false;
            }
        }
    }

    public android.text.Editable s(android.text.Editable editable) {
        this.f172949p.a(editable);
        return editable;
    }

    /* renamed from: setFixed */
    public void m53467x52faa832(boolean z17) {
        this.f172951r = z17;
    }

    /* renamed from: setInputId */
    public void mo53451x25c31fc3(int i17) {
        this.f172942f = i17;
    }

    @Override // android.widget.TextView
    public void setInputType(int i17) {
        if (getInputType() == i17) {
            return;
        }
        super.setInputType(i17);
    }

    @Override // android.widget.TextView
    public void setMaxHeight(int i17) {
        if (getMaxHeight() == i17) {
            return;
        }
        super.setMaxHeight(i17);
    }

    @Override // android.widget.TextView
    public void setMinHeight(int i17) {
        if (getMinHeight() == i17) {
            return;
        }
        super.setMinHeight(i17);
    }

    /* renamed from: setOnComposingDismissedListener */
    public void m53468x9b6bc52f(ml1.c cVar) {
        this.f172949p.f173039f = cVar;
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        java.lang.Object obj = this.f172945i;
        if (obj == null) {
            super.setOnFocusChangeListener(onFocusChangeListener);
        } else if (onFocusChangeListener != null) {
            ((x.n) obj).put(onFocusChangeListener, this);
        }
    }

    /* renamed from: setOnKeyUpPostImeListener */
    public void m53469xac3f159c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r4 r4Var) {
        this.f172953t = r4Var;
    }

    /* renamed from: setPasswordMode */
    public void mo53458xb9053060(boolean z17) {
        p();
        this.f172941e = z17;
        setTransformationMethod(z17 ? this.f172948o : null);
        t();
    }

    @Override // android.widget.EditText
    public void setSelection(int i17) {
        if (getEditableText() == null) {
            return;
        }
        super.setSelection(java.lang.Math.min(i17, getEditableText().length()));
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z17) {
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    @Override // android.widget.TextView
    public final void setTextCursorDrawable(int i17) {
        try {
            yo.b bVar = new yo.b(this, "mCursorDrawableRes", android.widget.TextView.class.getName());
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            bVar.b();
            java.lang.reflect.Field field = bVar.f545577d;
            if (field == null) {
                throw new java.lang.NoSuchFieldException();
            }
            field.set(this, valueOf);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(float f17) {
        setTextSize(0, f17);
    }

    @Override // android.widget.TextView
    public void setTypeface(android.graphics.Typeface typeface) {
        super.setTypeface(typeface);
    }

    public final void t() {
        this.f172950q = java.lang.Math.max(0, this.f172950q - 1);
    }

    @Override // android.view.View
    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "[%s|%s]", getClass().getSimpleName(), java.lang.Integer.valueOf(m53464xb251d24f()));
    }

    public final void u(java.lang.CharSequence charSequence) {
        p();
        android.text.Editable editableText = getEditableText();
        if (editableText == null) {
            setText(charSequence, android.widget.TextView.BufferType.EDITABLE);
        } else {
            clearComposingText();
            if (android.text.TextUtils.isEmpty(charSequence)) {
                editableText.clear();
            } else {
                editableText.replace(0, editableText.length(), charSequence);
            }
        }
        t();
    }

    public void v(char c17) {
        this.f172954u = c17;
    }

    @Override // android.widget.TextView
    public void setTextSize(int i17, float f17) {
        super.setTextSize(i17, f17);
    }

    @Override // android.widget.TextView
    public void setTypeface(android.graphics.Typeface typeface, int i17) {
        super.setTypeface(typeface, i17);
    }

    @Override // android.widget.EditText
    public void setSelection(int i17, int i18) {
        if (i17 < 0) {
            i17 = 0;
        }
        if (i17 >= getEditableText().length()) {
            i17 = getEditableText().length();
        }
        if (i18 < i17) {
            i18 = i17;
        }
        if (i18 >= getEditableText().length()) {
            i18 = getEditableText().length();
        }
        super.setSelection(i17, i18);
    }
}
