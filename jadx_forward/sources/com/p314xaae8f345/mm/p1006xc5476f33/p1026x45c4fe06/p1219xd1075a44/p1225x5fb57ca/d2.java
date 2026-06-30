package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public final class d2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b2 implements nl1.b {
    public d2(android.content.Context context) {
        super(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.d.a(context));
        setKeyListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.c2(this));
    }

    @Override // nl1.b
    public android.view.inputmethod.InputConnection a() {
        return super.onCreateInputConnection(new android.view.inputmethod.EditorInfo());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4, android.view.View
    public void clearFocus() {
        q();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4
    public void o() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2 mo53433x400bc850;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.x0.b(this) && (mo53433x400bc850 = mo53433x400bc850()) != null) {
            mo53433x400bc850.m53510xce4186ff(this);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4, android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4, android.view.View
    public boolean requestFocus(int i17, android.graphics.Rect rect) {
        return r(i17, rect);
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] inputFilterArr) {
        int i17 = 0;
        if (inputFilterArr == null) {
            inputFilterArr = new android.text.InputFilter[0];
        }
        android.text.InputFilter[] inputFilterArr2 = new android.text.InputFilter[inputFilterArr.length + 1];
        while (i17 < inputFilterArr.length) {
            inputFilterArr2[i17] = inputFilterArr[i17];
            i17++;
        }
        inputFilterArr2[i17] = new android.text.InputFilter.AllCaps();
        super.setFilters(inputFilterArr2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b2, android.widget.TextView
    public /* bridge */ /* synthetic */ void setGravity(int i17) {
        super.setGravity(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4
    /* renamed from: setPasswordMode */
    public void mo53458xb9053060(boolean z17) {
        p();
        int inputType = getInputType() | 2;
        setInputType(z17 ? inputType | 16 : inputType & (-17));
        super.mo53458xb9053060(z17);
        t();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4
    /* renamed from: getInputPanel */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2 mo53433x400bc850() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2.f173110o;
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2) getRootView().findViewById(com.p314xaae8f345.mm.R.id.f564692y6);
    }
}
