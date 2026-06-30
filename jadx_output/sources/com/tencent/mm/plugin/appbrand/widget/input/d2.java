package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class d2 extends com.tencent.mm.plugin.appbrand.widget.input.b2 implements nl1.b {
    public d2(android.content.Context context) {
        super(com.tencent.mm.plugin.appbrand.jsapi.coverview.d.a(context));
        setKeyListener(new com.tencent.mm.plugin.appbrand.widget.input.c2(this));
    }

    @Override // nl1.b
    public android.view.inputmethod.InputConnection a() {
        return super.onCreateInputConnection(new android.view.inputmethod.EditorInfo());
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, android.view.View
    public void clearFocus() {
        q();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4
    public void o() {
        com.tencent.mm.plugin.appbrand.widget.input.o2 inputPanel;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.b(this) && (inputPanel = getInputPanel()) != null) {
            inputPanel.setInputEditText(this);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, android.view.View
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

    @Override // com.tencent.mm.plugin.appbrand.widget.input.b2, android.widget.TextView
    public /* bridge */ /* synthetic */ void setGravity(int i17) {
        super.setGravity(i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4
    public void setPasswordMode(boolean z17) {
        p();
        int inputType = getInputType() | 2;
        setInputType(z17 ? inputType | 16 : inputType & (-17));
        super.setPasswordMode(z17);
        t();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.e4, com.tencent.mm.plugin.appbrand.widget.input.t4
    public com.tencent.mm.plugin.appbrand.widget.input.o2 getInputPanel() {
        int i17 = com.tencent.mm.plugin.appbrand.widget.input.o2.f91577o;
        return (com.tencent.mm.plugin.appbrand.widget.input.o2) getRootView().findViewById(com.tencent.mm.R.id.f483159y6);
    }
}
