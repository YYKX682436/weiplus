package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public class e3 implements fl1.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ui1.z f160980a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.m0 f160981b;

    public e3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f3 f3Var, ui1.z zVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.m0 m0Var) {
        this.f160980a = zVar;
        this.f160981b = m0Var;
    }

    @Override // fl1.j1
    public void a(android.view.View view, fl1.h1 h1Var, int i17) {
        android.view.MotionEvent mo2022x28e740ce = this.f160980a.mo2022x28e740ce();
        this.f160981b.b(view, i17, mo2022x28e740ce == null ? 0 : java.lang.Math.round(mo2022x28e740ce.getRawX()), mo2022x28e740ce != null ? java.lang.Math.round(mo2022x28e740ce.getRawY()) : 0);
    }
}
