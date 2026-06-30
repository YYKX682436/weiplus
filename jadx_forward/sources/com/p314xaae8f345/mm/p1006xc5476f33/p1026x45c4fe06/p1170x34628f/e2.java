package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.j2 f168086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean[] f168087e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168088f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 f168089g;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 y1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.j2 j2Var, boolean[] zArr, java.lang.String str) {
        this.f168089g = y1Var;
        this.f168086d = j2Var;
        this.f168087e = zArr;
        this.f168088f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.j2 j2Var = this.f168086d;
        if (j2Var != null) {
            boolean z17 = this.f168087e[0];
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 y1Var = this.f168089g;
            if (z17) {
                j2Var.a(y1Var, this.f168088f);
            } else {
                y1Var.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d2(this));
            }
        }
    }
}
