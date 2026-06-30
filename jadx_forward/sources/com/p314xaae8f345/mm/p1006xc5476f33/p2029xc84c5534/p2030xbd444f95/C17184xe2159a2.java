package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95;

/* renamed from: com.tencent.mm.plugin.report.kvdata.BDStatusInfo */
/* loaded from: classes8.dex */
public class C17184xe2159a2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: favDBSize_ */
    public long f37803xe7869725;

    /* renamed from: mmDBSize_ */
    public long f37804xde8e2500;

    /* renamed from: mmDBTableCount_ */
    public int f37805x1c0281a0;

    /* renamed from: snsDBSize_ */
    public long f37806x9f177228;

    /* renamed from: tableList_ */
    public java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17188xe69d7c> f37807xa5436853 = new java.util.LinkedList<>();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17184xe2159a2)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17184xe2159a2 c17184xe2159a2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17184xe2159a2) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f37804xde8e2500), java.lang.Long.valueOf(c17184xe2159a2.f37804xde8e2500)) && n51.f.a(java.lang.Long.valueOf(this.f37806x9f177228), java.lang.Long.valueOf(c17184xe2159a2.f37806x9f177228)) && n51.f.a(java.lang.Integer.valueOf(this.f37805x1c0281a0), java.lang.Integer.valueOf(c17184xe2159a2.f37805x1c0281a0)) && n51.f.a(this.f37807xa5436853, c17184xe2159a2.f37807xa5436853) && n51.f.a(java.lang.Long.valueOf(this.f37803xe7869725), java.lang.Long.valueOf(c17184xe2159a2.f37803xe7869725));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f37804xde8e2500);
            fVar.h(2, this.f37806x9f177228);
            fVar.e(3, this.f37805x1c0281a0);
            fVar.g(4, 8, this.f37807xa5436853);
            fVar.h(5, this.f37803xe7869725);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f37804xde8e2500) + 0 + b36.f.h(2, this.f37806x9f177228) + b36.f.e(3, this.f37805x1c0281a0) + b36.f.g(4, 8, this.f37807xa5436853) + b36.f.h(5, this.f37803xe7869725);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f37807xa5436853.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17184xe2159a2 c17184xe2159a2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17184xe2159a2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c17184xe2159a2.f37804xde8e2500 = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            c17184xe2159a2.f37806x9f177228 = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            c17184xe2159a2.f37805x1c0281a0 = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            c17184xe2159a2.f37803xe7869725 = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17188xe69d7c c17188xe69d7c = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17188xe69d7c();
            if (bArr2 != null && bArr2.length > 0) {
                c17188xe69d7c.mo11468x92b714fd(bArr2);
            }
            c17184xe2159a2.f37807xa5436853.add(c17188xe69d7c);
        }
        return 0;
    }
}
