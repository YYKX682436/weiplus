package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.AppBrandNumberKeyboardView */
/* loaded from: classes7.dex */
public final class C12774xd6ab59bb extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1227x625824aa.C12780x42a41de6 {

    /* renamed from: w, reason: collision with root package name */
    public int f172802w;

    /* renamed from: x, reason: collision with root package name */
    public final android.util.SparseIntArray f172803x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.inputmethod.InputConnection f172804y;

    public C12774xd6ab59bb(android.content.Context context) {
        super(context);
        this.f172802w = 0;
        this.f172803x = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p2(this);
        d();
    }

    public static boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.C12774xd6ab59bb c12774xd6ab59bb) {
        if (c12774xd6ab59bb.f172804y == null) {
            return false;
        }
        if (!android.text.TextUtils.isEmpty(r0.getTextBeforeCursor(1, 0))) {
            c12774xd6ab59bb.f172804y.deleteSurroundingText(1, 0);
        } else {
            c12774xd6ab59bb.f172804y.sendKeyEvent(new android.view.KeyEvent(0, 67));
            c12774xd6ab59bb.f172804y.sendKeyEvent(new android.view.KeyEvent(1, 67));
        }
        return true;
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q2(this);
        int i17 = 0;
        while (true) {
            android.util.SparseIntArray sparseIntArray = this.f172803x;
            if (i17 >= sparseIntArray.size()) {
                findViewById(com.p314xaae8f345.mm.R.id.f78323xf2891774).setOnClickListener(q2Var);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.C12777x4fec1272) findViewById(com.p314xaae8f345.mm.R.id.f78321xf2891760)).m53431xf8346bb1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r2(this));
                return;
            } else {
                findViewById(sparseIntArray.valueAt(i17)).setOnClickListener(q2Var);
                i17++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(nl1.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4 a17;
        if (bVar == 0) {
            return;
        }
        boolean z17 = bVar instanceof android.view.View;
        if (z17 && (a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w4.a(((android.view.View) bVar).getContext())) != null) {
            a17.mo48674x36654fab();
        }
        if (bVar instanceof android.widget.EditText) {
            android.widget.EditText editText = (android.widget.EditText) bVar;
            editText.setShowSoftInputOnFocus(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.b(editText).hideSoftInputFromInputMethod(editText.getWindowToken(), 0);
        }
        if (z17) {
            ((android.view.View) bVar).requestFocus();
        }
        this.f172804y = bVar.a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1227x625824aa.C12780x42a41de6, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m53505xce4186ff(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1227x625824aa.C12780x42a41de6
    /* renamed from: setXMode */
    public void mo53428x53eb72f9(int i17) {
        super.mo53428x53eb72f9(i17);
        this.f172802w = i17;
    }

    public C12774xd6ab59bb(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f172802w = 0;
        this.f172803x = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p2(this);
        d();
    }
}
