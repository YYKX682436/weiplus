package com.p314xaae8f345.mm.p1006xc5476f33.vqm;

/* loaded from: classes5.dex */
public enum s implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    VQMProfileInfoMatrixThermalStateNull(0),
    VQMProfileInfoMatrixThermalStateNominal(10000),
    VQMProfileInfoMatrixThermalStateFair(10001),
    VQMProfileInfoMatrixThermalStateSerious(10002),
    VQMProfileInfoMatrixThermalStateCritical(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6);


    /* renamed from: d, reason: collision with root package name */
    public final int f259010d;

    s(int i17) {
        this.f259010d = i17;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.vqm.s a(int i17) {
        if (i17 == 0) {
            return VQMProfileInfoMatrixThermalStateNull;
        }
        switch (i17) {
            case 10000:
                return VQMProfileInfoMatrixThermalStateNominal;
            case 10001:
                return VQMProfileInfoMatrixThermalStateFair;
            case 10002:
                return VQMProfileInfoMatrixThermalStateSerious;
            case com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6 /* 10003 */:
                return VQMProfileInfoMatrixThermalStateCritical;
            default:
                return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f259010d;
    }
}
