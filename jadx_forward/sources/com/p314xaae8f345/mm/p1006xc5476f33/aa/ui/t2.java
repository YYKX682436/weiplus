package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.u2 f154341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.v2 f154342e;

    public t2(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.v2 v2Var, com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.u2 u2Var) {
        this.f154342e = v2Var;
        this.f154341d = u2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.u2 u2Var = this.f154341d;
        int top = (u2Var.f154362g.getTop() - u2Var.f154360e.getBottom()) - i65.a.b(this.f154342e.f154384e.mo55332x76847179(), 8);
        if (top < 0) {
            top = 0;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) u2Var.f154362g.getLayoutParams();
        layoutParams.topMargin = -top;
        u2Var.f154362g.setLayoutParams(layoutParams);
    }
}
