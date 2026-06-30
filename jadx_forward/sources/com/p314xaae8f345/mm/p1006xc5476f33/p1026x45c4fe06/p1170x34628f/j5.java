package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class j5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf.a2 f168322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe f168323e;

    public j5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 d5Var, gf.a2 a2Var, com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe c3955x2d990bfe) {
        this.f168322d = a2Var;
        this.f168323e = c3955x2d990bfe;
    }

    @Override // java.lang.Runnable
    public void run() {
        gf.a2 a2Var = this.f168322d;
        df.w1 t17 = a2Var.t();
        if (t17 != null ? t17.f311128v : false) {
            return;
        }
        a2Var.u(this.f168323e);
    }
}
