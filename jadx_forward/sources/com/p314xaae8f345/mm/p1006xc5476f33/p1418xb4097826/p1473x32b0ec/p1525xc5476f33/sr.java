package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes5.dex */
public final class sr implements com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et f195835a;

    public sr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar) {
        this.f195835a = etVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = this.f195835a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = etVar.f193994y;
        if (c22621x7603e017 != null) {
            if (com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(((java.lang.Object) c22621x7603e017.getText()) + str, com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2) <= etVar.f193987t) {
                c22621x7603e017.n(str);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void b() {
        android.view.inputmethod.InputConnection mo81352x6a67d012;
        android.view.inputmethod.InputConnection mo81352x6a67d0122;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = this.f195835a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = etVar.f193994y;
        if (c22621x7603e017 != null && (mo81352x6a67d0122 = c22621x7603e017.mo81352x6a67d012()) != null) {
            mo81352x6a67d0122.sendKeyEvent(new android.view.KeyEvent(0, 67));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = etVar.f193994y;
        if (c22621x7603e0172 == null || (mo81352x6a67d012 = c22621x7603e0172.mo81352x6a67d012()) == null) {
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
