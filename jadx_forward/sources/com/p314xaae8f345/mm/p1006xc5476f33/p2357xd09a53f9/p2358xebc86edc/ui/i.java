package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class i implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.k f259434d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.k kVar) {
        this.f259434d = kVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        int i17 = 0;
        for (at4.e eVar : this.f259434d.f259441d.f95375j.f95348a) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar.f95358a)) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar.f95359b)) {
                    g4Var.f(i17, eVar.f95358a);
                } else {
                    g4Var.p(i17, eVar.f95358a, eVar.f95359b, 0);
                }
            }
            i17++;
        }
    }
}
