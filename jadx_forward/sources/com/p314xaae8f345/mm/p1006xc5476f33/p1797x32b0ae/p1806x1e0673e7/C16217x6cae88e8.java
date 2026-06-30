package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1806x1e0673e7;

/* renamed from: com.tencent.mm.plugin.lite.keyboard.LiteAppNumberKeyboardView */
/* loaded from: classes7.dex */
public final class C16217x6cae88e8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1227x625824aa.C12780x42a41de6 {

    /* renamed from: w, reason: collision with root package name */
    public int f225380w;

    /* renamed from: x, reason: collision with root package name */
    public final android.util.SparseIntArray f225381x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.inputmethod.InputConnection f225382y;

    public C16217x6cae88e8(android.content.Context context) {
        super(context);
        this.f225380w = 0;
        this.f225381x = new aa3.l0(this);
        d();
    }

    public static boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1806x1e0673e7.C16217x6cae88e8 c16217x6cae88e8) {
        if (c16217x6cae88e8.f225382y == null) {
            return false;
        }
        if (!android.text.TextUtils.isEmpty(r0.getTextBeforeCursor(1, 0))) {
            c16217x6cae88e8.f225382y.deleteSurroundingText(1, 0);
        } else {
            c16217x6cae88e8.f225382y.sendKeyEvent(new android.view.KeyEvent(0, 67));
            c16217x6cae88e8.f225382y.sendKeyEvent(new android.view.KeyEvent(1, 67));
        }
        return true;
    }

    public final void d() {
        aa3.m0 m0Var = new aa3.m0(this);
        int i17 = 0;
        while (true) {
            android.util.SparseIntArray sparseIntArray = this.f225381x;
            if (i17 >= sparseIntArray.size()) {
                findViewById(com.p314xaae8f345.mm.R.id.f78323xf2891774).setOnClickListener(m0Var);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.C12777x4fec1272) findViewById(com.p314xaae8f345.mm.R.id.f78321xf2891760)).m53431xf8346bb1(new aa3.n0(this));
                return;
            } else {
                findViewById(sparseIntArray.valueAt(i17)).setOnClickListener(m0Var);
                i17++;
            }
        }
    }

    public void e(nl1.b bVar) {
        if (bVar == null) {
            this.f225382y = null;
        } else {
            this.f225382y = bVar.a();
        }
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
        this.f225380w = i17;
    }

    public C16217x6cae88e8(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f225380w = 0;
        this.f225381x = new aa3.l0(this);
        d();
    }
}
