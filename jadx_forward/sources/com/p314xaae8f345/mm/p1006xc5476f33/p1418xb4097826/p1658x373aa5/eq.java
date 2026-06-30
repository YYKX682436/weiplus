package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class eq implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gq f213584d;

    public eq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gq gqVar) {
        this.f213584d = gqVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public final void w2(int i17, boolean z17) {
        android.view.Window b17;
        android.view.View decorView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gq gqVar = this.f213584d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gqVar.f213719f, "KeyboardHeightObserver " + i17 + ' ' + z17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = gqVar.f293331d;
        if (y1Var == null || (b17 = y1Var.b()) == null || (decorView = b17.getDecorView()) == null) {
            return;
        }
        decorView.setPadding(0, 0, 0, i17);
    }
}
