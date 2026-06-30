package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* loaded from: classes7.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f169001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.i0 f169002e;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.i0 i0Var, android.graphics.Point point) {
        this.f169002e = i0Var;
        this.f169001d = point;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895 c12753x672cc895 = this.f169002e.f169030a.f169056f;
        if (c12753x672cc895 != null) {
            c12753x672cc895.m53325xc11fd2d7(this.f169001d);
        }
    }
}
