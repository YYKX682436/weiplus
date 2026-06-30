package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca;

/* loaded from: classes15.dex */
public class s extends android.text.SpannableStringBuilder {

    /* renamed from: d, reason: collision with root package name */
    public int f147320d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f147321e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f147322f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f147323g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f147324h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f147325i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f147326m;

    /* renamed from: n, reason: collision with root package name */
    public int f147327n;

    /* renamed from: o, reason: collision with root package name */
    public int f147328o;

    /* renamed from: p, reason: collision with root package name */
    public int f147329p;

    /* renamed from: q, reason: collision with root package name */
    public int f147330q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.inputmethod.BaseInputConnection f147331r;

    public s(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState textEditState, android.view.View view) {
        this.f147331r = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.q(this, view, true, this);
        if (textEditState != null) {
            f(textEditState);
        }
    }

    public void a(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.r rVar) {
        if (this.f147321e > 0) {
            io.p3284xd2ae381c.Log.e("ListenableEditingState", "adding a listener " + rVar.toString() + " in a listener callback");
        }
        if (this.f147320d <= 0) {
            this.f147322f.add(rVar);
        } else {
            io.p3284xd2ae381c.Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f147323g.add(rVar);
        }
    }

    public void b() {
        this.f147320d++;
        if (this.f147321e > 0) {
            io.p3284xd2ae381c.Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f147320d != 1 || this.f147322f.isEmpty()) {
            return;
        }
        this.f147326m = toString();
        this.f147327n = android.text.Selection.getSelectionStart(this);
        this.f147328o = android.text.Selection.getSelectionEnd(this);
        this.f147329p = android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this);
        this.f147330q = android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this);
    }

    public void c() {
        int i17 = this.f147320d;
        if (i17 == 0) {
            io.p3284xd2ae381c.Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        java.util.ArrayList arrayList = this.f147323g;
        java.util.ArrayList arrayList2 = this.f147322f;
        if (i17 == 1) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.r rVar = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.r) it.next();
                this.f147321e++;
                rVar.mo44265x3186bc88(true, true, true);
                this.f147321e--;
            }
            if (!arrayList2.isEmpty()) {
                io.p3284xd2ae381c.Log.v("ListenableEditingState", "didFinishBatchEdit with " + java.lang.String.valueOf(arrayList2.size()) + " listener(s)");
                d(!toString().equals(this.f147326m), (this.f147327n == android.text.Selection.getSelectionStart(this) && this.f147328o == android.text.Selection.getSelectionEnd(this)) ? false : true, (this.f147329p == android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this) && this.f147330q == android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList2.addAll(arrayList);
        arrayList.clear();
        this.f147320d--;
    }

    public final void d(boolean z17, boolean z18, boolean z19) {
        if (z17 || z18 || z19) {
            java.util.Iterator it = this.f147322f.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.r rVar = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.r) it.next();
                this.f147321e++;
                rVar.mo44265x3186bc88(z17, z18, z19);
                this.f147321e--;
            }
        }
    }

    public void e(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.r rVar) {
        if (this.f147321e > 0) {
            io.p3284xd2ae381c.Log.e("ListenableEditingState", "removing a listener " + rVar.toString() + " in a listener callback");
        }
        this.f147322f.remove(rVar);
        if (this.f147320d > 0) {
            this.f147323g.remove(rVar);
        }
    }

    public void f(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState textEditState) {
        b();
        replace(0, length(), (java.lang.CharSequence) textEditState.f71546x36452d);
        if (textEditState.m138383x58fb4c12()) {
            android.text.Selection.setSelection(this, textEditState.f71545x80947a36, textEditState.f71544x9ee6a3af);
        } else {
            android.text.Selection.removeSelection(this);
        }
        int i17 = textEditState.f71543xbfb02bd3;
        int i18 = textEditState.f71542xf18c188c;
        if (i17 < 0 || i17 >= i18) {
            android.view.inputmethod.BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f147331r.setComposingRegion(i17, i18);
        }
        this.f147324h.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(java.lang.Object obj, int i17, int i18, int i19) {
        super.setSpan(obj, i17, i18, i19);
        this.f147324h.add(new io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28700x121616ed(toString(), android.text.Selection.getSelectionStart(this), android.text.Selection.getSelectionEnd(this), android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this), android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this)));
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public java.lang.String toString() {
        java.lang.String str = this.f147325i;
        if (str != null) {
            return str;
        }
        java.lang.String spannableStringBuilder = super.toString();
        this.f147325i = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder replace(int i17, int i18, java.lang.CharSequence charSequence, int i19, int i27) {
        boolean z17;
        boolean z18;
        if (this.f147321e > 0) {
            io.p3284xd2ae381c.Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        java.lang.String sVar = toString();
        int i28 = i18 - i17;
        boolean z19 = i28 != i27 - i19;
        for (int i29 = 0; i29 < i28 && !z19; i29++) {
            z19 |= charAt(i17 + i29) != charSequence.charAt(i19 + i29);
        }
        if (z19) {
            this.f147325i = null;
        }
        int selectionStart = android.text.Selection.getSelectionStart(this);
        int selectionEnd = android.text.Selection.getSelectionEnd(this);
        int composingSpanStart = android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this);
        android.text.SpannableStringBuilder replace = super.replace(i17, i18, charSequence, i19, i27);
        boolean z27 = z19;
        this.f147324h.add(new io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28700x121616ed(sVar, i17, i18, charSequence, android.text.Selection.getSelectionStart(this), android.text.Selection.getSelectionEnd(this), android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this), android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this)));
        if (this.f147320d > 0) {
            return replace;
        }
        boolean z28 = (android.text.Selection.getSelectionStart(this) == selectionStart && android.text.Selection.getSelectionEnd(this) == selectionEnd) ? false : true;
        if (android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) {
            z17 = z27;
            z18 = false;
        } else {
            z17 = z27;
            z18 = true;
        }
        d(z17, z28, z18);
        return replace;
    }
}
