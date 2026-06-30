package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public abstract class e4 extends android.widget.EditText implements com.tencent.mm.plugin.appbrand.widget.input.t4, bl1.c {

    /* renamed from: d, reason: collision with root package name */
    public android.view.inputmethod.InputConnection f91407d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f91408e;

    /* renamed from: f, reason: collision with root package name */
    public volatile int f91409f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.autofill.k f91410g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f91411h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f91412i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f91413m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.d4 f91414n;

    /* renamed from: o, reason: collision with root package name */
    public final android.text.method.PasswordTransformationMethod f91415o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.j4 f91416p;

    /* renamed from: q, reason: collision with root package name */
    public int f91417q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f91418r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f91419s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.r4 f91420t;

    /* renamed from: u, reason: collision with root package name */
    public char f91421u;

    public e4(android.content.Context context) {
        super(context);
        this.f91408e = false;
        this.f91409f = -1;
        this.f91415o = new com.tencent.mm.plugin.appbrand.widget.input.g1();
        this.f91417q = 0;
        this.f91418r = false;
        this.f91419s = false;
        this.f91421u = (char) 0;
        com.tencent.mm.plugin.appbrand.widget.input.d4 d4Var = new com.tencent.mm.plugin.appbrand.widget.input.d4(this, null);
        this.f91414n = d4Var;
        this.f91411h = new x.b();
        this.f91413m = new x.b();
        this.f91412i = new x.b();
        this.f91416p = new com.tencent.mm.plugin.appbrand.widget.input.j4(this);
        setBackgroundDrawable(null);
        setIncludeFontPadding(false);
        j(3);
        setSingleLine(true);
        setTextCursorDrawable(com.tencent.mm.R.drawable.f480843dy);
        setTextIsSelectable(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i17 = android.os.Build.VERSION.SDK_INT;
        setLineSpacing(0.0f, 1.0f);
        setTypeface(android.graphics.Typeface.SANS_SERIF);
        super.addTextChangedListener(d4Var);
        super.setPadding(0, 0, 0, 0);
        super.setEditableFactory(new com.tencent.mm.plugin.appbrand.widget.input.z3(this));
        if (f()) {
            this.f91410g = new com.tencent.mm.plugin.appbrand.widget.input.autofill.k(this);
        } else {
            this.f91410g = null;
        }
        if (i17 < 35 || !com.tencent.mm.ui.b4.b(getContext())) {
            return;
        }
        setLocalePreferredLineHeightForMinimumUsed(false);
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(android.text.TextWatcher textWatcher) {
        com.tencent.mm.plugin.appbrand.widget.input.d4 d4Var = this.f91414n;
        if (textWatcher != null) {
            d4Var.f91399d.add(textWatcher);
        } else {
            d4Var.getClass();
        }
    }

    public void b(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        com.tencent.mm.plugin.appbrand.widget.input.autofill.k kVar = this.f91410g;
        if (kVar != null) {
            com.tencent.mm.plugin.appbrand.widget.input.autofill.o oVar = kVar.f91340d;
            oVar.f91351d = v5Var;
            com.tencent.mm.plugin.appbrand.widget.input.d1 a17 = com.tencent.mm.plugin.appbrand.widget.input.d1.a(v5Var);
            com.tencent.mm.plugin.appbrand.widget.input.b1 b1Var = oVar.f91350c;
            if (b1Var == null) {
                a17.getClass();
                return;
            }
            x.n nVar = (x.n) a17.f91388d;
            if (nVar.containsKey(b1Var)) {
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
        return this.f91418r;
    }

    public boolean f() {
        return !(this instanceof com.tencent.mm.plugin.appbrand.widget.input.a2);
    }

    public boolean g() {
        return false;
    }

    public com.tencent.mm.plugin.appbrand.widget.input.autofill.k getAutoFillController() {
        return this.f91410g;
    }

    @Override // android.widget.TextView, android.view.View
    public int getAutofillType() {
        return 0;
    }

    public int getInputId() {
        return this.f91409f;
    }

    public abstract /* synthetic */ android.view.View getInputPanel();

    public char getLastKeyPressed() {
        return this.f91421u;
    }

    @Override // android.widget.TextView
    public android.graphics.drawable.Drawable getTextSelectHandle() {
        try {
            return super.getTextSelectHandle();
        } catch (android.content.res.Resources.NotFoundException unused) {
            return null;
        }
    }

    public final android.view.View getView() {
        return this;
    }

    public void h(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        com.tencent.mm.plugin.appbrand.widget.input.autofill.k kVar = this.f91410g;
        if (kVar != null) {
            com.tencent.mm.plugin.appbrand.widget.input.autofill.o oVar = kVar.f91340d;
            oVar.getClass();
            com.tencent.mm.plugin.appbrand.widget.input.d1 a17 = com.tencent.mm.plugin.appbrand.widget.input.d1.a(v5Var);
            com.tencent.mm.plugin.appbrand.widget.input.b1 b1Var = oVar.f91350c;
            if (b1Var == null) {
                a17.getClass();
            } else {
                ((x.n) a17.f91388d).remove(b1Var);
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
        java.lang.Class cls = com.tencent.mm.plugin.appbrand.widget.input.m5.f91549d;
        if (hint == null) {
            hint = "";
        }
        android.text.Spannable spannableStringBuilder = hint instanceof android.text.Spannable ? (android.text.Spannable) hint : new android.text.SpannableStringBuilder(hint);
        int i18 = gravity & 7;
        int i19 = 5;
        android.text.Layout.Alignment alignment = i18 != 1 ? i18 != 5 ? android.text.Layout.Alignment.ALIGN_NORMAL : android.text.Layout.Alignment.ALIGN_OPPOSITE : android.text.Layout.Alignment.ALIGN_CENTER;
        spannableStringBuilder.setSpan(new android.text.style.AlignmentSpan.Standard(alignment), 0, getHint().length(), 18);
        super.setHint(spannableStringBuilder);
        int i27 = com.tencent.mm.plugin.appbrand.widget.input.b4.f91369a[alignment.ordinal()];
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
        if (this.f91407d == null) {
            dispatchKeyEvent(new android.view.KeyEvent(0, 67));
            dispatchKeyEvent(new android.view.KeyEvent(1, 67));
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.J0(getEditableText())) {
                return;
            }
            ((com.tencent.mm.plugin.appbrand.widget.input.a4) this.f91407d).deleteSurroundingText(getEditableText().length(), getEditableText().length() - 1);
        }
    }

    public void n() {
        ((x.n) this.f91411h).clear();
        ((x.n) this.f91413m).clear();
        ((x.n) this.f91412i).clear();
        this.f91414n.f91399d.clear();
        com.tencent.mm.plugin.appbrand.widget.input.autofill.k kVar = this.f91410g;
        if (kVar != null) {
            kVar.a();
        }
        super.setOnFocusChangeListener(null);
    }

    public abstract void o();

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        java.lang.Object obj = this.f91411h;
        if (((x.n) obj).isEmpty()) {
            return;
        }
        for (com.tencent.mm.plugin.appbrand.widget.input.q4 q4Var : (com.tencent.mm.plugin.appbrand.widget.input.q4[]) ((x.b) obj).keySet().toArray(new com.tencent.mm.plugin.appbrand.widget.input.q4[((x.n) obj).f450846f])) {
            ((com.tencent.mm.plugin.appbrand.widget.input.autofill.d) q4Var).f91325a.c();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        this.f91407d = new com.tencent.mm.plugin.appbrand.widget.input.a4(this, onCreateInputConnection, false, onCreateInputConnection);
        editorInfo.imeOptions |= 268435456;
        if (getImeOptions() != 0) {
            editorInfo.imeOptions &= -1073741825;
        }
        return this.f91407d;
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
        java.lang.Object obj = this.f91412i;
        if (((x.n) obj).isEmpty()) {
            return;
        }
        for (android.view.View.OnFocusChangeListener onFocusChangeListener : (android.view.View.OnFocusChangeListener[]) ((x.b) obj).keySet().toArray(new android.view.View.OnFocusChangeListener[((x.n) obj).f450846f])) {
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
        this.f91419s = onKeyDown;
        return onKeyDown;
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.appbrand.widget.input.r4 r4Var;
        if (this.f91419s || (r4Var = this.f91420t) == null || !r4Var.a(i17, keyEvent)) {
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
        java.lang.Object obj = this.f91413m;
        if (((x.n) obj).isEmpty()) {
            return;
        }
        for (java.lang.Object obj2 : ((x.b) obj).keySet().toArray()) {
            ((com.tencent.mm.plugin.appbrand.widget.input.s4) obj2).a(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void p() {
        this.f91417q++;
    }

    public final void q() {
        super.clearFocus();
    }

    public final boolean r(int i17, android.graphics.Rect rect) {
        return super.requestFocus(i17, rect);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(android.text.TextWatcher textWatcher) {
        com.tencent.mm.plugin.appbrand.widget.input.d4 d4Var = this.f91414n;
        if (textWatcher != null) {
            d4Var.f91399d.remove(textWatcher);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.WebEditText", "requestFocus e=%s", e17);
            try {
                return super.requestFocus(i17, rect);
            } catch (java.lang.RuntimeException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.WebEditText", "requestFocus try again e=%s", e18);
                return false;
            }
        }
    }

    public android.text.Editable s(android.text.Editable editable) {
        this.f91416p.a(editable);
        return editable;
    }

    public void setFixed(boolean z17) {
        this.f91418r = z17;
    }

    public void setInputId(int i17) {
        this.f91409f = i17;
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

    public void setOnComposingDismissedListener(ml1.c cVar) {
        this.f91416p.f91506f = cVar;
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        java.lang.Object obj = this.f91412i;
        if (obj == null) {
            super.setOnFocusChangeListener(onFocusChangeListener);
        } else if (onFocusChangeListener != null) {
            ((x.n) obj).put(onFocusChangeListener, this);
        }
    }

    public void setOnKeyUpPostImeListener(com.tencent.mm.plugin.appbrand.widget.input.r4 r4Var) {
        this.f91420t = r4Var;
    }

    public void setPasswordMode(boolean z17) {
        p();
        this.f91408e = z17;
        setTransformationMethod(z17 ? this.f91415o : null);
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
            java.lang.reflect.Field field = bVar.f464044d;
            if (field == null) {
                throw new java.lang.NoSuchFieldException();
            }
            field.set(this, valueOf);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.sdk.platformtools.z3.c(e17);
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
        this.f91417q = java.lang.Math.max(0, this.f91417q - 1);
    }

    @Override // android.view.View
    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "[%s|%s]", getClass().getSimpleName(), java.lang.Integer.valueOf(getInputId()));
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
        this.f91421u = c17;
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
