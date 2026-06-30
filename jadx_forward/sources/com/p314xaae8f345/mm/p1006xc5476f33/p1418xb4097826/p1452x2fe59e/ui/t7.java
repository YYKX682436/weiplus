package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class t7 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13988x6c27dc7b f192090d;

    public t7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13988x6c27dc7b activityC13988x6c27dc7b) {
        this.f192090d = activityC13988x6c27dc7b;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public final void w2(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13988x6c27dc7b activityC13988x6c27dc7b = this.f192090d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13988x6c27dc7b.f190865v, "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17);
        boolean z18 = i17 > 0;
        if (activityC13988x6c27dc7b.f190866w == z18) {
            return;
        }
        activityC13988x6c27dc7b.f190866w = z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1 v1Var = activityC13988x6c27dc7b.f190867x;
        if (v1Var != null) {
            v1Var.m57706xa21faa77(z18, i17);
        }
    }
}
