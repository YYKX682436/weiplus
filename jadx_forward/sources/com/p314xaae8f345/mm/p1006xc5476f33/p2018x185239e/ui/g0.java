package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class g0 implements com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0 f239249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17128x8dd0c05 f239250b;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17128x8dd0c05 activityC17128x8dd0c05, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0 l0Var) {
        this.f239250b = activityC17128x8dd0c05;
        this.f239249a = l0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.k0
    public void a(r45.n34 n34Var) {
        int i17 = n34Var.f462582e;
        if (i17 == 0 || i17 == 1) {
            this.f239250b.finish();
        } else if (i17 == 3 || i17 == 4) {
            this.f239249a.f262454a = true;
        }
    }
}
