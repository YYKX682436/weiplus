package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* loaded from: classes7.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.x0 f173616d;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.x0 x0Var) {
        this.f173616d = x0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12801xf64f5416 c12801xf64f5416;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.x0 x0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.x0 x0Var2 = this.f173616d;
        x0Var2.f173622h.f173419f.m53618x76491f2c(x0Var2.f173619e);
        ((java.util.ArrayList) this.f173616d.f173619e).clear();
        ((java.util.ArrayList) this.f173616d.f173620f).clear();
        if (this.f173616d.f173622h.mo53632x59d4c014() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.x0 x0Var3 = this.f173616d;
            if (x0Var3.f173621g) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.h1 mo53632x59d4c014 = x0Var3.f173622h.mo53632x59d4c014();
                ((java.util.ArrayList) this.f173616d.f173619e).size();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t7 t7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t7) mo53632x59d4c014;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = t7Var.f168649c;
                if (!n7Var.T1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7.F3(n7Var, t7Var.f168647a, false, t7Var.f168648b);
                }
            }
        }
        if (this.f173616d.f173621g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "refresh done dispatch diffResult,");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12799x63f4f4eb c12799x63f4f4eb = this.f173616d.f173622h.f173419f;
            c12799x63f4f4eb.f173412i.m8146xced61ae5();
            c12799x63f4f4eb.f173414n.m8146xced61ae5();
        }
        synchronized (this.f173616d.f173622h.f173426p) {
            c12801xf64f5416 = this.f173616d.f173622h;
            c12801xf64f5416.f173427q = false;
        }
        c12801xf64f5416.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "delayRefresh");
        synchronized (c12801xf64f5416.f173426p) {
            if (!c12801xf64f5416.f173429s.isEmpty() && (x0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.x0) c12801xf64f5416.f173429s.poll()) != null) {
                c12801xf64f5416.f173428r.m77784x795fa299(x0Var);
            }
        }
    }
}
