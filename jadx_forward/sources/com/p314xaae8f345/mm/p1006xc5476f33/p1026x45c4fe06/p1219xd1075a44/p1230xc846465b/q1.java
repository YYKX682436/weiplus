package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* loaded from: classes7.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.r1 f173573d;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.r1 r1Var) {
        this.f173573d = r1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12805xabdd4ef7 abstractC12805xabdd4ef7;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.r1 r1Var;
        ((java.util.ArrayList) this.f173573d.f173579h.f173441f2).clear();
        ((java.util.ArrayList) this.f173573d.f173579h.f173445j2).clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.r1 r1Var2 = this.f173573d;
        ((java.util.ArrayList) r1Var2.f173579h.f173441f2).addAll(r1Var2.f173576e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.r1 r1Var3 = this.f173573d;
        ((java.util.ArrayList) r1Var3.f173579h.f173445j2).addAll(r1Var3.f173577f);
        ((java.util.ArrayList) this.f173573d.f173576e).clear();
        ((java.util.ArrayList) this.f173573d.f173577f).clear();
        if (this.f173573d.f173579h.m53621x85048279() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.r1 r1Var4 = this.f173573d;
            if (r1Var4.f173578g) {
                r1Var4.f173579h.m53621x85048279().b(((java.util.ArrayList) this.f173573d.f173579h.f173441f2).size());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.r1 r1Var5 = this.f173573d;
        if (r1Var5.f173578g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseAppBrandRecentView", "refresh done dispatch diffResult, mType: %s", r1Var5.f173579h.f173446k2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12805xabdd4ef7 abstractC12805xabdd4ef72 = this.f173573d.f173579h;
            if (abstractC12805xabdd4ef72.f173446k2 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.l0.RECENT_APP_BRAND) {
                abstractC12805xabdd4ef72.mo7946xf939df19().m8146xced61ae5();
            } else {
                abstractC12805xabdd4ef72.mo7946xf939df19().m8146xced61ae5();
            }
        }
        synchronized (this.f173573d.f173579h.f173447l2) {
            abstractC12805xabdd4ef7 = this.f173573d.f173579h;
            abstractC12805xabdd4ef7.f173448m2 = false;
        }
        synchronized (abstractC12805xabdd4ef7.f173447l2) {
            if (abstractC12805xabdd4ef7.f173450o2.size() > 0 && (r1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.r1) abstractC12805xabdd4ef7.f173450o2.poll()) != null) {
                abstractC12805xabdd4ef7.f173449n2.m77784x795fa299(r1Var);
            }
        }
    }
}
