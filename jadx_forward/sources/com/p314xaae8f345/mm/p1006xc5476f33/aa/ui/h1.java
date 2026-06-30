package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes11.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.g1 f154201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f154202e;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.i1 i1Var, com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.g1 g1Var, android.content.Context context) {
        this.f154201d = g1Var;
        this.f154202e = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.g1 g1Var = this.f154201d;
        int top = g1Var.f154187f.getTop() - g1Var.f154185d.getBottom();
        android.content.Context context = this.f154202e;
        int b17 = top - i65.a.b(context, 4);
        if (b17 < 0) {
            b17 = 0;
        }
        if (g1Var.f154187f.getTop() - g1Var.f154185d.getBottom() == i65.a.b(context, 4)) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) g1Var.f154187f.getLayoutParams();
        layoutParams.topMargin = -b17;
        g1Var.f154187f.setLayoutParams(layoutParams);
    }
}
