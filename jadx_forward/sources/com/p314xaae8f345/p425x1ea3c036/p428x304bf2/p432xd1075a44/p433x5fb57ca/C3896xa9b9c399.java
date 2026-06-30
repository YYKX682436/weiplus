package com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p432xd1075a44.p433x5fb57ca;

/* renamed from: com.tencent.luggage.game.widget.input.WAGamePanelInputEditText */
/* loaded from: classes7.dex */
public class C3896xa9b9c399 extends android.widget.EditText {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.j4 f128795d;

    /* renamed from: e, reason: collision with root package name */
    public final android.text.InputFilter f128796e;

    /* renamed from: f, reason: collision with root package name */
    public int f128797f;

    /* renamed from: g, reason: collision with root package name */
    public final android.text.Spannable.Factory f128798g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f128799h;

    public C3896xa9b9c399(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559770ee);
    }

    public static android.text.Spannable a(com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p432xd1075a44.p433x5fb57ca.C3896xa9b9c399 c3896xa9b9c399, android.text.Spannable spannable) {
        c3896xa9b9c399.getClass();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        c19767x257d7f.f38864x6ac9171 = c3896xa9b9c399.f128797f;
        kl1.h hVar = (kl1.h) i95.n0.c(kl1.h.class);
        if (hVar == null) {
            hVar = kl1.b.f390276a;
        }
        return hVar.Oh(c3896xa9b9c399.getContext(), spannable, java.lang.Math.round(c3896xa9b9c399.getTextSize()), c19767x257d7f, c3896xa9b9c399.f128798g);
    }

    /* renamed from: getMaxLength */
    public int m32059xd041a2b4() {
        return this.f128797f;
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        editorInfo.imeOptions |= 268435456;
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void onEditorAction(int i17) {
        ie.d N;
        super.onEditorAction(i17);
        if ((i17 == 6 || i17 == 5 || i17 == 3 || i17 == 2 || i17 == 4) && (N = ie.d.N(this)) != null && N.f173209f) {
            clearFocus();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z17, int i17, android.graphics.Rect rect) {
        ie.d N;
        super.onFocusChanged(z17, i17, rect);
        if (z17 || this.f128799h || !isAttachedToWindow() || getWindowToken() == null || (N = ie.d.N(this)) == null || !N.f173209f) {
            return;
        }
        this.f128799h = true;
        try {
            N.z();
        } finally {
            this.f128799h = false;
        }
    }

    /* renamed from: setComposingDismissedListener */
    public void m32060xd3473c70(ml1.c cVar) {
        this.f128795d.f173039f = cVar;
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] inputFilterArr) {
        android.text.InputFilter inputFilter = this.f128796e;
        if (inputFilter != null) {
            int i17 = 0;
            if (inputFilterArr == null) {
                inputFilterArr = new android.text.InputFilter[0];
            }
            android.text.InputFilter[] inputFilterArr2 = new android.text.InputFilter[inputFilterArr.length + 1];
            while (i17 < inputFilterArr.length) {
                inputFilterArr2[i17] = inputFilterArr[i17];
                i17++;
            }
            inputFilterArr2[i17] = inputFilter;
            inputFilterArr = inputFilterArr2;
        }
        super.setFilters(inputFilterArr);
    }

    /* renamed from: setMaxLength */
    public void m32061x2c956328(int i17) {
        this.f128797f = i17;
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z17) {
        int maxHeight = getMaxHeight();
        super.setSingleLine(z17);
        if (maxHeight > 0) {
            setMaxHeight(maxHeight);
        }
    }

    public C3896xa9b9c399(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        ie.f fVar = new ie.f(this);
        this.f128796e = fVar;
        this.f128797f = Integer.MAX_VALUE;
        this.f128798g = new ie.g(this);
        this.f128799h = false;
        if (android.os.Build.VERSION.SDK_INT >= 35 && com.p314xaae8f345.mm.ui.b4.b(getContext())) {
            setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.f128795d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.j4(this);
        super.setEditableFactory(new ie.e(this));
        super.setFilters(new android.text.InputFilter[]{fVar});
    }
}
