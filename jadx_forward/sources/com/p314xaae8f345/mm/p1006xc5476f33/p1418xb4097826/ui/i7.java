package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes3.dex */
public final class i7 implements com.p314xaae8f345.mm.ui.p2740x696c9db.p5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15037x1b952727 f210886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f210887b;

    public i7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15037x1b952727 activityC15037x1b952727, java.util.ArrayList arrayList) {
        this.f210886a = activityC15037x1b952727;
        this.f210887b = arrayList;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.p5
    public final void a() {
        java.lang.String str;
        android.graphics.Bitmap bitmap;
        java.util.ArrayList arrayList = this.f210887b;
        if (arrayList == null || (str = (java.lang.String) kz5.n0.Z(arrayList)) == null) {
            str = "";
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15037x1b952727.H;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15037x1b952727 activityC15037x1b952727 = this.f210886a;
        activityC15037x1b952727.getClass();
        if ((str.length() == 0) || (bitmap = activityC15037x1b952727.G) == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC15037x1b952727, 1, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m7(activityC15037x1b952727);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o7(activityC15037x1b952727, str, bitmap);
        k0Var.v();
    }
}
