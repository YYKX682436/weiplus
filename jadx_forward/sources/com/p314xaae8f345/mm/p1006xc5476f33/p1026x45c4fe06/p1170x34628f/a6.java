package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class a6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f167931d;

    public a6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        this.f167931d = v5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f167931d;
        if (!v5Var.mo50262x39e05d35()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPageView", "onInitReady but not running, return, appId[%s] url[%s]", v5Var.mo48798x74292566(), v5Var.X1());
            return;
        }
        fl1.g2 m48801x784fb1e3 = v5Var.mo32091x9a3f0ba2().m48801x784fb1e3();
        ((x.d) ((fl1.c0) m48801x784fb1e3).f345255q).add(v5Var.f168701y1);
        if (v5Var.Q1() != null) {
            v5Var.Q1().x();
        }
        v5Var.O2();
        v5Var.Z();
    }
}
