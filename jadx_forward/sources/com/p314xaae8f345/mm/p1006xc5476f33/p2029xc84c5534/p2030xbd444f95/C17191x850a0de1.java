package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95;

/* renamed from: com.tencent.mm.plugin.report.kvdata.log_13905 */
/* loaded from: classes8.dex */
public class C17191x850a0de1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: clientVersion_ */
    public int f37881x923cdb72;

    /* renamed from: device_ */
    public int f37882x5cf8acc9;
    public int ds_;

    /* renamed from: import_ds_ */
    public int f37883x7eb1ce16;

    /* renamed from: time_stamp_ */
    public long f37884x32f80eae;

    /* renamed from: uin_ */
    public long f37885x36c745;

    /* renamed from: viOp_ */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17189xc14104a f37886x6afc6eb;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17191x850a0de1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17191x850a0de1 c17191x850a0de1 = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17191x850a0de1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f37883x7eb1ce16), java.lang.Integer.valueOf(c17191x850a0de1.f37883x7eb1ce16)) && n51.f.a(java.lang.Integer.valueOf(this.ds_), java.lang.Integer.valueOf(c17191x850a0de1.ds_)) && n51.f.a(java.lang.Long.valueOf(this.f37885x36c745), java.lang.Long.valueOf(c17191x850a0de1.f37885x36c745)) && n51.f.a(java.lang.Integer.valueOf(this.f37882x5cf8acc9), java.lang.Integer.valueOf(c17191x850a0de1.f37882x5cf8acc9)) && n51.f.a(java.lang.Integer.valueOf(this.f37881x923cdb72), java.lang.Integer.valueOf(c17191x850a0de1.f37881x923cdb72)) && n51.f.a(java.lang.Long.valueOf(this.f37884x32f80eae), java.lang.Long.valueOf(c17191x850a0de1.f37884x32f80eae)) && n51.f.a(this.f37886x6afc6eb, c17191x850a0de1.f37886x6afc6eb);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f37883x7eb1ce16);
            fVar.e(2, this.ds_);
            fVar.h(3, this.f37885x36c745);
            fVar.e(4, this.f37882x5cf8acc9);
            fVar.e(5, this.f37881x923cdb72);
            fVar.h(6, this.f37884x32f80eae);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17189xc14104a c17189xc14104a = this.f37886x6afc6eb;
            if (c17189xc14104a != null) {
                fVar.i(7, c17189xc14104a.mo75928xcd1e8d8());
                this.f37886x6afc6eb.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f37883x7eb1ce16) + 0 + b36.f.e(2, this.ds_) + b36.f.h(3, this.f37885x36c745) + b36.f.e(4, this.f37882x5cf8acc9) + b36.f.e(5, this.f37881x923cdb72) + b36.f.h(6, this.f37884x32f80eae);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17189xc14104a c17189xc14104a2 = this.f37886x6afc6eb;
            return c17189xc14104a2 != null ? e17 + b36.f.i(7, c17189xc14104a2.mo75928xcd1e8d8()) : e17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17191x850a0de1 c17191x850a0de1 = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17191x850a0de1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c17191x850a0de1.f37883x7eb1ce16 = aVar2.g(intValue);
                return 0;
            case 2:
                c17191x850a0de1.ds_ = aVar2.g(intValue);
                return 0;
            case 3:
                c17191x850a0de1.f37885x36c745 = aVar2.i(intValue);
                return 0;
            case 4:
                c17191x850a0de1.f37882x5cf8acc9 = aVar2.g(intValue);
                return 0;
            case 5:
                c17191x850a0de1.f37881x923cdb72 = aVar2.g(intValue);
                return 0;
            case 6:
                c17191x850a0de1.f37884x32f80eae = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17189xc14104a c17189xc14104a3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17189xc14104a();
                    if (bArr != null && bArr.length > 0) {
                        c17189xc14104a3.mo11468x92b714fd(bArr);
                    }
                    c17191x850a0de1.f37886x6afc6eb = c17189xc14104a3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
