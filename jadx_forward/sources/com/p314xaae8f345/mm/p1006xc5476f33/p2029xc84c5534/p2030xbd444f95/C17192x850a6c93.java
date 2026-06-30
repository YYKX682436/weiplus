package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95;

/* renamed from: com.tencent.mm.plugin.report.kvdata.log_14375 */
/* loaded from: classes8.dex */
public class C17192x850a6c93 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: clientVersion_ */
    public int f37887x923cdb72;

    /* renamed from: dbStatusInfo_ */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17184xe2159a2 f37888x4a421941;

    /* renamed from: device_ */
    public int f37889x5cf8acc9;
    public int ds_;

    /* renamed from: heavyDetailInfo_ */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17185xe6ded8a6 f37890x2737f859;

    /* renamed from: import_ds_ */
    public int f37891x7eb1ce16;

    /* renamed from: sdStatusInfo_ */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17186x90ed54f1 f37892x5352c58e;

    /* renamed from: time_stamp_ */
    public long f37893x32f80eae;

    /* renamed from: type_ */
    public int f37894x69b5865;

    /* renamed from: uin_ */
    public long f37895x36c745;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17192x850a6c93)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17192x850a6c93 c17192x850a6c93 = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17192x850a6c93) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f37891x7eb1ce16), java.lang.Integer.valueOf(c17192x850a6c93.f37891x7eb1ce16)) && n51.f.a(java.lang.Integer.valueOf(this.ds_), java.lang.Integer.valueOf(c17192x850a6c93.ds_)) && n51.f.a(java.lang.Long.valueOf(this.f37895x36c745), java.lang.Long.valueOf(c17192x850a6c93.f37895x36c745)) && n51.f.a(java.lang.Integer.valueOf(this.f37889x5cf8acc9), java.lang.Integer.valueOf(c17192x850a6c93.f37889x5cf8acc9)) && n51.f.a(java.lang.Integer.valueOf(this.f37887x923cdb72), java.lang.Integer.valueOf(c17192x850a6c93.f37887x923cdb72)) && n51.f.a(java.lang.Long.valueOf(this.f37893x32f80eae), java.lang.Long.valueOf(c17192x850a6c93.f37893x32f80eae)) && n51.f.a(java.lang.Integer.valueOf(this.f37894x69b5865), java.lang.Integer.valueOf(c17192x850a6c93.f37894x69b5865)) && n51.f.a(this.f37888x4a421941, c17192x850a6c93.f37888x4a421941) && n51.f.a(this.f37892x5352c58e, c17192x850a6c93.f37892x5352c58e) && n51.f.a(this.f37890x2737f859, c17192x850a6c93.f37890x2737f859);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f37891x7eb1ce16);
            fVar.e(2, this.ds_);
            fVar.h(3, this.f37895x36c745);
            fVar.e(4, this.f37889x5cf8acc9);
            fVar.e(5, this.f37887x923cdb72);
            fVar.h(6, this.f37893x32f80eae);
            fVar.e(7, this.f37894x69b5865);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17184xe2159a2 c17184xe2159a2 = this.f37888x4a421941;
            if (c17184xe2159a2 != null) {
                fVar.i(8, c17184xe2159a2.mo75928xcd1e8d8());
                this.f37888x4a421941.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17186x90ed54f1 c17186x90ed54f1 = this.f37892x5352c58e;
            if (c17186x90ed54f1 != null) {
                fVar.i(9, c17186x90ed54f1.mo75928xcd1e8d8());
                this.f37892x5352c58e.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17185xe6ded8a6 c17185xe6ded8a6 = this.f37890x2737f859;
            if (c17185xe6ded8a6 != null) {
                fVar.i(10, c17185xe6ded8a6.mo75928xcd1e8d8());
                this.f37890x2737f859.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f37891x7eb1ce16) + 0 + b36.f.e(2, this.ds_) + b36.f.h(3, this.f37895x36c745) + b36.f.e(4, this.f37889x5cf8acc9) + b36.f.e(5, this.f37887x923cdb72) + b36.f.h(6, this.f37893x32f80eae) + b36.f.e(7, this.f37894x69b5865);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17184xe2159a2 c17184xe2159a22 = this.f37888x4a421941;
            if (c17184xe2159a22 != null) {
                e17 += b36.f.i(8, c17184xe2159a22.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17186x90ed54f1 c17186x90ed54f12 = this.f37892x5352c58e;
            if (c17186x90ed54f12 != null) {
                e17 += b36.f.i(9, c17186x90ed54f12.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17185xe6ded8a6 c17185xe6ded8a62 = this.f37890x2737f859;
            return c17185xe6ded8a62 != null ? e17 + b36.f.i(10, c17185xe6ded8a62.mo75928xcd1e8d8()) : e17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17192x850a6c93 c17192x850a6c93 = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17192x850a6c93) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c17192x850a6c93.f37891x7eb1ce16 = aVar2.g(intValue);
                return 0;
            case 2:
                c17192x850a6c93.ds_ = aVar2.g(intValue);
                return 0;
            case 3:
                c17192x850a6c93.f37895x36c745 = aVar2.i(intValue);
                return 0;
            case 4:
                c17192x850a6c93.f37889x5cf8acc9 = aVar2.g(intValue);
                return 0;
            case 5:
                c17192x850a6c93.f37887x923cdb72 = aVar2.g(intValue);
                return 0;
            case 6:
                c17192x850a6c93.f37893x32f80eae = aVar2.i(intValue);
                return 0;
            case 7:
                c17192x850a6c93.f37894x69b5865 = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17184xe2159a2 c17184xe2159a23 = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17184xe2159a2();
                    if (bArr != null && bArr.length > 0) {
                        c17184xe2159a23.mo11468x92b714fd(bArr);
                    }
                    c17192x850a6c93.f37888x4a421941 = c17184xe2159a23;
                }
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17186x90ed54f1 c17186x90ed54f13 = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17186x90ed54f1();
                    if (bArr2 != null && bArr2.length > 0) {
                        c17186x90ed54f13.mo11468x92b714fd(bArr2);
                    }
                    c17192x850a6c93.f37892x5352c58e = c17186x90ed54f13;
                }
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17185xe6ded8a6 c17185xe6ded8a63 = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17185xe6ded8a6();
                    if (bArr3 != null && bArr3.length > 0) {
                        c17185xe6ded8a63.mo11468x92b714fd(bArr3);
                    }
                    c17192x850a6c93.f37890x2737f859 = c17185xe6ded8a63;
                }
                return 0;
            default:
                return -1;
        }
    }
}
