package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class w1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 f230973d;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 a2Var) {
        this.f230973d = a2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.h
    public void d(boolean z17, float f17, float f18) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.h
    public void j(boolean z17, float f17, float f18) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = this.f230973d.f230805h;
        if (c19745xad58a1a4 == null) {
            return;
        }
        c19745xad58a1a4.mo69313x65825f6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.h
    public void p(boolean z17, float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 a2Var = this.f230973d;
        if (a2Var.f230805h == null) {
            return;
        }
        float f19 = a2Var.f230800c;
        a2Var.f230801d = java.lang.Math.round(f19 * f17);
        a2Var.f230802e = java.lang.Math.round(f19 * f18);
        if (a2Var.f230802e <= 0) {
            a2Var.f230802e = 1000;
        }
        a2Var.f230805h.a(a2Var.f230801d, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightVideoEditor", "onUp, start: %s, end: %s %s %s", java.lang.Integer.valueOf(a2Var.f230801d), java.lang.Integer.valueOf(a2Var.f230802e), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.h
    public void u(float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 a2Var = this.f230973d;
        if (a2Var.f230805h == null) {
            return;
        }
        float f19 = a2Var.f230800c;
        a2Var.f230801d = java.lang.Math.round(f19 * f17);
        a2Var.f230802e = java.lang.Math.round(f19 * f18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightVideoEditor", "onRecyclerChanged, start: %s, end: %s %s %s", java.lang.Integer.valueOf(a2Var.f230801d), java.lang.Integer.valueOf(a2Var.f230802e), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        a2Var.f230805h.a(a2Var.f230801d, true);
    }
}
