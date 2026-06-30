package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class a1 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c1 f213144d;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c1 c1Var) {
        this.f213144d = c1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public final void w2(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c1 c1Var = this.f213144d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c1Var.I, "KeyboardHeightObserver " + i17 + ' ' + z17);
        android.view.View view = c1Var.f293560f;
        if (view != null) {
            view.setPadding(0, 0, 0, i17);
        }
    }
}
