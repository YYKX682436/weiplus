package io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.flutter.plugin.editing.ListenableEditingState */
/* loaded from: classes15.dex */
public class C28697x79969c3a extends android.text.SpannableStringBuilder {
    private static final java.lang.String TAG = "ListenableEditingState";

    /* renamed from: mComposingEndWhenBeginBatchEdit */
    private int f71674x4b9e450e;

    /* renamed from: mComposingStartWhenBeginBatchEdit */
    private int f71675xc58ff555;

    /* renamed from: mDummyConnection */
    private android.view.inputmethod.BaseInputConnection f71676xa0dcdd79;

    /* renamed from: mSelectionEndWhenBeginBatchEdit */
    private int f71680xb7d76d71;

    /* renamed from: mSelectionStartWhenBeginBatchEdit */
    private int f71681x82090f8;

    /* renamed from: mTextWhenBeginBatchEdit */
    private java.lang.String f71682x599c086f;

    /* renamed from: mToStringCache */
    private java.lang.String f71683xcc441909;

    /* renamed from: mBatchEditNestDepth */
    private int f71671x4b58a694 = 0;

    /* renamed from: mChangeNotificationDepth */
    private int f71673x8422db9b = 0;

    /* renamed from: mListeners */
    private java.util.ArrayList<io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28697x79969c3a.EditingStateWatcher> f71678x32131c52 = new java.util.ArrayList<>();

    /* renamed from: mPendingListeners */
    private java.util.ArrayList<io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28697x79969c3a.EditingStateWatcher> f71679x1c710cf5 = new java.util.ArrayList<>();

    /* renamed from: mBatchTextEditingDeltas */
    private java.util.ArrayList<io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28700x121616ed> f71672x95b6f7f9 = new java.util.ArrayList<>();

    /* renamed from: mIgnoreSpanSelectionUpdate */
    private boolean f71677x990c89ac = false;

    /* renamed from: io.flutter.plugin.editing.ListenableEditingState$EditingStateWatcher */
    /* loaded from: classes15.dex */
    public interface EditingStateWatcher {
        /* renamed from: didChangeEditingState */
        void mo138491x3186bc88(boolean z17, boolean z18, boolean z19);
    }

    public C28697x79969c3a(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState textEditState, android.view.View view) {
        this.f71676xa0dcdd79 = new android.view.inputmethod.BaseInputConnection(view, true) { // from class: io.flutter.plugin.editing.ListenableEditingState.1
            @Override // android.view.inputmethod.BaseInputConnection
            public android.text.Editable getEditable() {
                return this;
            }
        };
        if (textEditState != null) {
            m138506x359d2b5b(textEditState);
        }
    }

    /* renamed from: notifyListener */
    private void m138493xc41b671d(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28697x79969c3a.EditingStateWatcher editingStateWatcher, boolean z17, boolean z18, boolean z19) {
        this.f71673x8422db9b++;
        editingStateWatcher.mo138491x3186bc88(z17, z18, z19);
        this.f71673x8422db9b--;
    }

    /* renamed from: notifyListenersIfNeeded */
    private void m138494xbba24248(boolean z17, boolean z18, boolean z19) {
        if (z17 || z18 || z19) {
            java.util.Iterator<io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28697x79969c3a.EditingStateWatcher> it = this.f71678x32131c52.iterator();
            while (it.hasNext()) {
                m138493xc41b671d(it.next(), z17, z18, z19);
            }
        }
    }

    /* renamed from: addEditingStateListener */
    public void m138495x481aefee(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28697x79969c3a.EditingStateWatcher editingStateWatcher) {
        if (this.f71673x8422db9b > 0) {
            io.p3284xd2ae381c.Log.e(TAG, "adding a listener " + editingStateWatcher.toString() + " in a listener callback");
        }
        if (this.f71671x4b58a694 <= 0) {
            this.f71678x32131c52.add(editingStateWatcher);
        } else {
            io.p3284xd2ae381c.Log.w(TAG, "a listener was added to EditingState while a batch edit was in progress");
            this.f71679x1c710cf5.add(editingStateWatcher);
        }
    }

    /* renamed from: beginBatchEdit */
    public void m138496xef81e1bb() {
        this.f71671x4b58a694++;
        if (this.f71673x8422db9b > 0) {
            io.p3284xd2ae381c.Log.e(TAG, "editing state should not be changed in a listener callback");
        }
        if (this.f71671x4b58a694 != 1 || this.f71678x32131c52.isEmpty()) {
            return;
        }
        this.f71682x599c086f = toString();
        this.f71681x82090f8 = m138503x6f2c472c();
        this.f71680xb7d76d71 = m138502xffd93625();
        this.f71675xc58ff555 = m138501xae47f8c9();
        this.f71674x4b9e450e = m138500x527eab02();
    }

    /* renamed from: clearBatchDeltas */
    public void m138497x526f9b08() {
        this.f71672x95b6f7f9.clear();
    }

    /* renamed from: endBatchEdit */
    public void m138498xad1ee9c9() {
        int i17 = this.f71671x4b58a694;
        if (i17 == 0) {
            io.p3284xd2ae381c.Log.e(TAG, "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i17 == 1) {
            java.util.Iterator<io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28697x79969c3a.EditingStateWatcher> it = this.f71679x1c710cf5.iterator();
            while (it.hasNext()) {
                m138493xc41b671d(it.next(), true, true, true);
            }
            if (!this.f71678x32131c52.isEmpty()) {
                io.p3284xd2ae381c.Log.v(TAG, "didFinishBatchEdit with " + java.lang.String.valueOf(this.f71678x32131c52.size()) + " listener(s)");
                boolean equals = toString().equals(this.f71682x599c086f) ^ true;
                boolean z17 = (this.f71681x82090f8 == m138503x6f2c472c() && this.f71680xb7d76d71 == m138502xffd93625()) ? false : true;
                boolean z18 = (this.f71675xc58ff555 == m138501xae47f8c9() && this.f71674x4b9e450e == m138500x527eab02()) ? false : true;
                io.p3284xd2ae381c.Log.d(TAG, "endBatchEdit mSelectionStartWhenBeginBatchEdit: " + this.f71681x82090f8 + ", mSelectionEndWhenBeginBatchEdit: " + this.f71680xb7d76d71 + ", mComposingStartWhenBeginBatchEdit: " + this.f71675xc58ff555 + ", mComposingEndWhenBeginBatchEdit: " + this.f71674x4b9e450e);
                m138494xbba24248(equals, z17, z18);
            }
        }
        this.f71678x32131c52.addAll(this.f71679x1c710cf5);
        this.f71679x1c710cf5.clear();
        this.f71671x4b58a694--;
    }

    /* renamed from: extractBatchTextEditingDeltas */
    public java.util.ArrayList<io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28700x121616ed> m138499x21fccd0d() {
        java.util.ArrayList<io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28700x121616ed> arrayList = new java.util.ArrayList<>(this.f71672x95b6f7f9);
        this.f71672x95b6f7f9.clear();
        return arrayList;
    }

    /* renamed from: getComposingEnd */
    public final int m138500x527eab02() {
        return android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this);
    }

    /* renamed from: getComposingStart */
    public final int m138501xae47f8c9() {
        return android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this);
    }

    /* renamed from: getSelectionEnd */
    public final int m138502xffd93625() {
        return android.text.Selection.getSelectionEnd(this);
    }

    /* renamed from: getSelectionStart */
    public final int m138503x6f2c472c() {
        return android.text.Selection.getSelectionStart(this);
    }

    /* renamed from: removeEditingStateListener */
    public void m138504x1f50a051(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28697x79969c3a.EditingStateWatcher editingStateWatcher) {
        if (this.f71673x8422db9b > 0) {
            io.p3284xd2ae381c.Log.e(TAG, "removing a listener " + editingStateWatcher.toString() + " in a listener callback");
        }
        this.f71678x32131c52.remove(editingStateWatcher);
        if (this.f71671x4b58a694 > 0) {
            this.f71679x1c710cf5.remove(editingStateWatcher);
        }
    }

    /* renamed from: setComposingRange */
    public void m138505x7627d5b0(int i17, int i18) {
        if (i17 < 0 || i17 >= i18) {
            android.view.inputmethod.BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f71676xa0dcdd79.setComposingRegion(i17, i18);
        }
    }

    /* renamed from: setEditingState */
    public void m138506x359d2b5b(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState textEditState) {
        m138496xef81e1bb();
        replace(0, length(), (java.lang.CharSequence) textEditState.f71546x36452d);
        if (textEditState.m138383x58fb4c12()) {
            android.text.Selection.setSelection(this, textEditState.f71545x80947a36, textEditState.f71544x9ee6a3af);
        } else {
            android.text.Selection.removeSelection(this);
        }
        m138505x7627d5b0(textEditState.f71543xbfb02bd3, textEditState.f71542xf18c188c);
        m138497x526f9b08();
        m138498xad1ee9c9();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(java.lang.Object obj, int i17, int i18, int i19) {
        super.setSpan(obj, i17, i18, i19);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public java.lang.String toString() {
        java.lang.String str = this.f71683xcc441909;
        if (str != null) {
            return str;
        }
        java.lang.String spannableStringBuilder = super.toString();
        this.f71683xcc441909 = spannableStringBuilder;
        return spannableStringBuilder;
    }

    /* renamed from: updateTextInputSelectionState */
    public void m138507x69131359(java.util.Map<java.lang.String, java.lang.Integer> map) {
        int length = toString().length();
        int min = java.lang.Math.min(map.get("selectionBase") != null ? map.get("selectionBase").intValue() : 0, length);
        int min2 = java.lang.Math.min(map.get("selectionExtent") != null ? map.get("selectionExtent").intValue() : 0, length);
        this.f71681x82090f8 = min;
        this.f71680xb7d76d71 = min2;
        this.f71677x990c89ac = true;
        android.text.Selection.setSelection(this, min, min2);
        this.f71677x990c89ac = false;
        io.p3284xd2ae381c.Log.d(TAG, "updateTextInputSelectionState (" + min + "," + min2 + "), text length: " + length + ", selectionBase=" + map.get("selectionBase") + ", selectionExtent=" + map.get("selectionExtent"));
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder replace(int i17, int i18, java.lang.CharSequence charSequence, int i19, int i27) {
        boolean z17;
        boolean z18;
        if (this.f71673x8422db9b > 0) {
            io.p3284xd2ae381c.Log.e(TAG, "editing state should not be changed in a listener callback");
        }
        java.lang.String c28697x79969c3a = toString();
        int i28 = i18 - i17;
        boolean z19 = i28 != i27 - i19;
        for (int i29 = 0; i29 < i28 && !z19; i29++) {
            z19 |= charAt(i17 + i29) != charSequence.charAt(i19 + i29);
        }
        if (z19) {
            this.f71683xcc441909 = null;
        }
        int m138503x6f2c472c = m138503x6f2c472c();
        int m138502xffd93625 = m138502xffd93625();
        int m138501xae47f8c9 = m138501xae47f8c9();
        int m138500x527eab02 = m138500x527eab02();
        android.text.SpannableStringBuilder replace = super.replace(i17, i18, charSequence, i19, i27);
        boolean z27 = z19;
        this.f71672x95b6f7f9.add(new io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28700x121616ed(c28697x79969c3a, i17, i18, charSequence, m138503x6f2c472c(), m138502xffd93625(), m138501xae47f8c9(), m138500x527eab02()));
        if (this.f71671x4b58a694 > 0) {
            return replace;
        }
        boolean z28 = (m138503x6f2c472c() == m138503x6f2c472c && m138502xffd93625() == m138502xffd93625) ? false : true;
        if (m138501xae47f8c9() == m138501xae47f8c9 && m138500x527eab02() == m138500x527eab02) {
            z17 = z27;
            z18 = false;
        } else {
            z17 = z27;
            z18 = true;
        }
        m138494xbba24248(z17, z28, z18);
        return replace;
    }
}
