package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f262155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u2 f262156e;

    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u2 u2Var, int i17) {
        this.f262156e = u2Var;
        this.f262155d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.u2 u2Var = this.f262156e;
        int visibility = u2Var.f262166a.f261475e.getVisibility();
        int i17 = this.f262155d;
        if (i17 != visibility) {
            u2Var.f262166a.f261475e.setVisibility(i17);
        }
    }
}
