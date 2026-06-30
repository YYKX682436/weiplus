package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95;

/* renamed from: com.tencent.mm.plugin.report.kvdata.HeavyDetailInfo */
/* loaded from: classes12.dex */
public class C17185xe6ded8a6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: chatroom_ */
    public long f37808x619a5e8c;

    /* renamed from: contact_ */
    public long f37809xde2d603f;

    /* renamed from: conversation_ */
    public long f37810x579db43c;

    /* renamed from: dbSize_ */
    public long f37811x55ed42a0;

    /* renamed from: favDbSize_ */
    public long f37812x1e21ab05;

    /* renamed from: flag_ */
    public long f37813x5cfee73;

    /* renamed from: message_ */
    public long f37814xe4750138;

    /* renamed from: sdFileRatio_ */
    public long f37815x7d987f81;

    /* renamed from: sdFileSize_ */
    public long f37816x77bbe511;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17185xe6ded8a6)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17185xe6ded8a6 c17185xe6ded8a6 = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17185xe6ded8a6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f37813x5cfee73), java.lang.Long.valueOf(c17185xe6ded8a6.f37813x5cfee73)) && n51.f.a(java.lang.Long.valueOf(this.f37816x77bbe511), java.lang.Long.valueOf(c17185xe6ded8a6.f37816x77bbe511)) && n51.f.a(java.lang.Long.valueOf(this.f37815x7d987f81), java.lang.Long.valueOf(c17185xe6ded8a6.f37815x7d987f81)) && n51.f.a(java.lang.Long.valueOf(this.f37811x55ed42a0), java.lang.Long.valueOf(c17185xe6ded8a6.f37811x55ed42a0)) && n51.f.a(java.lang.Long.valueOf(this.f37814xe4750138), java.lang.Long.valueOf(c17185xe6ded8a6.f37814xe4750138)) && n51.f.a(java.lang.Long.valueOf(this.f37810x579db43c), java.lang.Long.valueOf(c17185xe6ded8a6.f37810x579db43c)) && n51.f.a(java.lang.Long.valueOf(this.f37809xde2d603f), java.lang.Long.valueOf(c17185xe6ded8a6.f37809xde2d603f)) && n51.f.a(java.lang.Long.valueOf(this.f37808x619a5e8c), java.lang.Long.valueOf(c17185xe6ded8a6.f37808x619a5e8c)) && n51.f.a(java.lang.Long.valueOf(this.f37812x1e21ab05), java.lang.Long.valueOf(c17185xe6ded8a6.f37812x1e21ab05));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f37813x5cfee73);
            fVar.h(2, this.f37816x77bbe511);
            fVar.h(3, this.f37815x7d987f81);
            fVar.h(4, this.f37811x55ed42a0);
            fVar.h(5, this.f37814xe4750138);
            fVar.h(6, this.f37810x579db43c);
            fVar.h(7, this.f37809xde2d603f);
            fVar.h(8, this.f37808x619a5e8c);
            fVar.h(9, this.f37812x1e21ab05);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f37813x5cfee73) + 0 + b36.f.h(2, this.f37816x77bbe511) + b36.f.h(3, this.f37815x7d987f81) + b36.f.h(4, this.f37811x55ed42a0) + b36.f.h(5, this.f37814xe4750138) + b36.f.h(6, this.f37810x579db43c) + b36.f.h(7, this.f37809xde2d603f) + b36.f.h(8, this.f37808x619a5e8c) + b36.f.h(9, this.f37812x1e21ab05);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17185xe6ded8a6 c17185xe6ded8a6 = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17185xe6ded8a6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c17185xe6ded8a6.f37813x5cfee73 = aVar2.i(intValue);
                return 0;
            case 2:
                c17185xe6ded8a6.f37816x77bbe511 = aVar2.i(intValue);
                return 0;
            case 3:
                c17185xe6ded8a6.f37815x7d987f81 = aVar2.i(intValue);
                return 0;
            case 4:
                c17185xe6ded8a6.f37811x55ed42a0 = aVar2.i(intValue);
                return 0;
            case 5:
                c17185xe6ded8a6.f37814xe4750138 = aVar2.i(intValue);
                return 0;
            case 6:
                c17185xe6ded8a6.f37810x579db43c = aVar2.i(intValue);
                return 0;
            case 7:
                c17185xe6ded8a6.f37809xde2d603f = aVar2.i(intValue);
                return 0;
            case 8:
                c17185xe6ded8a6.f37808x619a5e8c = aVar2.i(intValue);
                return 0;
            case 9:
                c17185xe6ded8a6.f37812x1e21ab05 = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
