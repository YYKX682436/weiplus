package com.tencent.mm.feature.ecs.nirvana.input;

/* loaded from: classes15.dex */
public class s extends android.text.SpannableStringBuilder {

    /* renamed from: d, reason: collision with root package name */
    public int f65787d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f65788e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f65789f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f65790g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f65791h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f65792i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f65793m;

    /* renamed from: n, reason: collision with root package name */
    public int f65794n;

    /* renamed from: o, reason: collision with root package name */
    public int f65795o;

    /* renamed from: p, reason: collision with root package name */
    public int f65796p;

    /* renamed from: q, reason: collision with root package name */
    public int f65797q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.inputmethod.BaseInputConnection f65798r;

    public s(io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState textEditState, android.view.View view) {
        this.f65798r = new com.tencent.mm.feature.ecs.nirvana.input.q(this, view, true, this);
        if (textEditState != null) {
            f(textEditState);
        }
    }

    public void a(com.tencent.mm.feature.ecs.nirvana.input.r rVar) {
        if (this.f65788e > 0) {
            io.flutter.Log.e("ListenableEditingState", "adding a listener " + rVar.toString() + " in a listener callback");
        }
        if (this.f65787d <= 0) {
            this.f65789f.add(rVar);
        } else {
            io.flutter.Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f65790g.add(rVar);
        }
    }

    public void b() {
        this.f65787d++;
        if (this.f65788e > 0) {
            io.flutter.Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f65787d != 1 || this.f65789f.isEmpty()) {
            return;
        }
        this.f65793m = toString();
        this.f65794n = android.text.Selection.getSelectionStart(this);
        this.f65795o = android.text.Selection.getSelectionEnd(this);
        this.f65796p = android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this);
        this.f65797q = android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this);
    }

    public void c() {
        int i17 = this.f65787d;
        if (i17 == 0) {
            io.flutter.Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        java.util.ArrayList arrayList = this.f65790g;
        java.util.ArrayList arrayList2 = this.f65789f;
        if (i17 == 1) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.feature.ecs.nirvana.input.r rVar = (com.tencent.mm.feature.ecs.nirvana.input.r) it.next();
                this.f65788e++;
                rVar.didChangeEditingState(true, true, true);
                this.f65788e--;
            }
            if (!arrayList2.isEmpty()) {
                io.flutter.Log.v("ListenableEditingState", "didFinishBatchEdit with " + java.lang.String.valueOf(arrayList2.size()) + " listener(s)");
                d(!toString().equals(this.f65793m), (this.f65794n == android.text.Selection.getSelectionStart(this) && this.f65795o == android.text.Selection.getSelectionEnd(this)) ? false : true, (this.f65796p == android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this) && this.f65797q == android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList2.addAll(arrayList);
        arrayList.clear();
        this.f65787d--;
    }

    public final void d(boolean z17, boolean z18, boolean z19) {
        if (z17 || z18 || z19) {
            java.util.Iterator it = this.f65789f.iterator();
            while (it.hasNext()) {
                com.tencent.mm.feature.ecs.nirvana.input.r rVar = (com.tencent.mm.feature.ecs.nirvana.input.r) it.next();
                this.f65788e++;
                rVar.didChangeEditingState(z17, z18, z19);
                this.f65788e--;
            }
        }
    }

    public void e(com.tencent.mm.feature.ecs.nirvana.input.r rVar) {
        if (this.f65788e > 0) {
            io.flutter.Log.e("ListenableEditingState", "removing a listener " + rVar.toString() + " in a listener callback");
        }
        this.f65789f.remove(rVar);
        if (this.f65787d > 0) {
            this.f65790g.remove(rVar);
        }
    }

    public void f(io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState textEditState) {
        b();
        replace(0, length(), (java.lang.CharSequence) textEditState.text);
        if (textEditState.hasSelection()) {
            android.text.Selection.setSelection(this, textEditState.selectionStart, textEditState.selectionEnd);
        } else {
            android.text.Selection.removeSelection(this);
        }
        int i17 = textEditState.composingStart;
        int i18 = textEditState.composingEnd;
        if (i17 < 0 || i17 >= i18) {
            android.view.inputmethod.BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f65798r.setComposingRegion(i17, i18);
        }
        this.f65791h.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(java.lang.Object obj, int i17, int i18, int i19) {
        super.setSpan(obj, i17, i18, i19);
        this.f65791h.add(new io.flutter.plugin.editing.TextEditingDelta(toString(), android.text.Selection.getSelectionStart(this), android.text.Selection.getSelectionEnd(this), android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this), android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this)));
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public java.lang.String toString() {
        java.lang.String str = this.f65792i;
        if (str != null) {
            return str;
        }
        java.lang.String spannableStringBuilder = super.toString();
        this.f65792i = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder replace(int i17, int i18, java.lang.CharSequence charSequence, int i19, int i27) {
        boolean z17;
        boolean z18;
        if (this.f65788e > 0) {
            io.flutter.Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        java.lang.String sVar = toString();
        int i28 = i18 - i17;
        boolean z19 = i28 != i27 - i19;
        for (int i29 = 0; i29 < i28 && !z19; i29++) {
            z19 |= charAt(i17 + i29) != charSequence.charAt(i19 + i29);
        }
        if (z19) {
            this.f65792i = null;
        }
        int selectionStart = android.text.Selection.getSelectionStart(this);
        int selectionEnd = android.text.Selection.getSelectionEnd(this);
        int composingSpanStart = android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this);
        android.text.SpannableStringBuilder replace = super.replace(i17, i18, charSequence, i19, i27);
        boolean z27 = z19;
        this.f65791h.add(new io.flutter.plugin.editing.TextEditingDelta(sVar, i17, i18, charSequence, android.text.Selection.getSelectionStart(this), android.text.Selection.getSelectionEnd(this), android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this), android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this)));
        if (this.f65787d > 0) {
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
