package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes15.dex */
public class l7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f162897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.l14 f162898e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w7 f162899f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n7 f162900g;

    public l7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n7 n7Var, android.content.Intent intent, r45.l14 l14Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w7 w7Var) {
        this.f162900g = n7Var;
        this.f162897d = intent;
        this.f162898e = l14Var;
        this.f162899f = w7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v7 v7Var;
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n7 n7Var = this.f162900g;
        boolean cj6 = ((kt.c) i0Var).cj(n7Var.f163913g.f163981a.getF229340d(), this.f162897d, null, this.f162898e.f460605f, this.f162899f, n7Var.f163913g.f163991k);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w7 w7Var = this.f162899f;
        w7Var.f165247a = cj6;
        w7Var.f165250d = true;
        if (!w7Var.f165249c || (v7Var = w7Var.f165251e) == null) {
            return;
        }
        v7Var.a(cj6, w7Var.f165248b);
    }
}
