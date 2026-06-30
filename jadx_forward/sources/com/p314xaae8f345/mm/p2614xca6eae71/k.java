package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes2.dex */
public class k extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f274827d;

    /* renamed from: e, reason: collision with root package name */
    public int f274828e;

    /* renamed from: f, reason: collision with root package name */
    public int f274829f;

    /* renamed from: g, reason: collision with root package name */
    public int f274830g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f274831h;

    /* renamed from: i, reason: collision with root package name */
    public int f274832i;

    /* renamed from: m, reason: collision with root package name */
    public int f274833m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p2614xca6eae71.k)) {
            return false;
        }
        com.p314xaae8f345.mm.p2614xca6eae71.k kVar = (com.p314xaae8f345.mm.p2614xca6eae71.k) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f274827d), java.lang.Integer.valueOf(kVar.f274827d)) && n51.f.a(java.lang.Integer.valueOf(this.f274828e), java.lang.Integer.valueOf(kVar.f274828e)) && n51.f.a(java.lang.Integer.valueOf(this.f274829f), java.lang.Integer.valueOf(kVar.f274829f)) && n51.f.a(java.lang.Integer.valueOf(this.f274830g), java.lang.Integer.valueOf(kVar.f274830g)) && n51.f.a(java.lang.Integer.valueOf(this.f274831h), java.lang.Integer.valueOf(kVar.f274831h)) && n51.f.a(java.lang.Integer.valueOf(this.f274832i), java.lang.Integer.valueOf(kVar.f274832i)) && n51.f.a(java.lang.Integer.valueOf(this.f274833m), java.lang.Integer.valueOf(kVar.f274833m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f274827d);
            fVar.e(2, this.f274828e);
            fVar.e(3, this.f274829f);
            fVar.e(41, this.f274830g);
            fVar.e(5, this.f274831h);
            fVar.e(6, this.f274832i);
            fVar.e(7, this.f274833m);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f274827d) + 0 + b36.f.e(2, this.f274828e) + b36.f.e(3, this.f274829f) + b36.f.e(41, this.f274830g) + b36.f.e(5, this.f274831h) + b36.f.e(6, this.f274832i) + b36.f.e(7, this.f274833m);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        com.p314xaae8f345.mm.p2614xca6eae71.k kVar = (com.p314xaae8f345.mm.p2614xca6eae71.k) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            kVar.f274827d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            kVar.f274828e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            kVar.f274829f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            kVar.f274831h = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 6) {
            kVar.f274832i = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 7) {
            kVar.f274833m = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 41) {
            return -1;
        }
        kVar.f274830g = aVar2.g(intValue);
        return 0;
    }
}
