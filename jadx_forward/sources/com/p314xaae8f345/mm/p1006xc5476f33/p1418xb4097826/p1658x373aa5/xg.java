package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes5.dex */
public final class xg implements com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15333xd9276341 f214861a;

    public xg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15333xd9276341 c15333xd9276341) {
        this.f214861a = c15333xd9276341;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15333xd9276341 c15333xd9276341 = this.f214861a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 shortTitleEt = c15333xd9276341.getShortTitleEt();
        boolean z17 = false;
        if (shortTitleEt != null && shortTitleEt.hasFocus()) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 shortTitleEt2 = c15333xd9276341.getShortTitleEt();
            if (shortTitleEt2 != null) {
                shortTitleEt2.n(str);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 editText = c15333xd9276341.getEditText();
        if (editText != null) {
            editText.n(str);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void b() {
        android.view.inputmethod.InputConnection mo81352x6a67d012;
        android.view.inputmethod.InputConnection mo81352x6a67d0122;
        android.view.inputmethod.InputConnection mo81352x6a67d0123;
        android.view.inputmethod.InputConnection mo81352x6a67d0124;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15333xd9276341 c15333xd9276341 = this.f214861a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 shortTitleEt = c15333xd9276341.getShortTitleEt();
        if (shortTitleEt != null && shortTitleEt.hasFocus()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 shortTitleEt2 = c15333xd9276341.getShortTitleEt();
            if (shortTitleEt2 != null && (mo81352x6a67d0124 = shortTitleEt2.mo81352x6a67d012()) != null) {
                mo81352x6a67d0124.sendKeyEvent(new android.view.KeyEvent(0, 67));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 shortTitleEt3 = c15333xd9276341.getShortTitleEt();
            if (shortTitleEt3 == null || (mo81352x6a67d0123 = shortTitleEt3.mo81352x6a67d012()) == null) {
                return;
            }
            mo81352x6a67d0123.sendKeyEvent(new android.view.KeyEvent(1, 67));
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 editText = c15333xd9276341.getEditText();
        if (editText != null && (mo81352x6a67d0122 = editText.mo81352x6a67d012()) != null) {
            mo81352x6a67d0122.sendKeyEvent(new android.view.KeyEvent(0, 67));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 editText2 = c15333xd9276341.getEditText();
        if (editText2 == null || (mo81352x6a67d012 = editText2.mo81352x6a67d012()) == null) {
            return;
        }
        mo81352x6a67d012.sendKeyEvent(new android.view.KeyEvent(1, 67));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void d() {
    }
}
