package com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627;

/* loaded from: classes8.dex */
public class k extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: p, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.k f298611p = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.k();

    /* renamed from: d, reason: collision with root package name */
    public long f298612d;

    /* renamed from: e, reason: collision with root package name */
    public long f298613e;

    /* renamed from: f, reason: collision with root package name */
    public long f298614f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.o f298615g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.z0 f298616h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.m f298617i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.m f298618m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.l f298619n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f298620o = new boolean[9];

    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.l b() {
        return this.f298620o[8] ? this.f298619n : new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.l();
    }

    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.z0 c() {
        return this.f298620o[5] ? this.f298616h : new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.z0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.k)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.k kVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.k) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f298612d), java.lang.Long.valueOf(kVar.f298612d)) && n51.f.a(java.lang.Long.valueOf(this.f298613e), java.lang.Long.valueOf(kVar.f298613e)) && n51.f.a(java.lang.Long.valueOf(this.f298614f), java.lang.Long.valueOf(kVar.f298614f)) && n51.f.a(this.f298615g, kVar.f298615g) && n51.f.a(this.f298616h, kVar.f298616h) && n51.f.a(this.f298617i, kVar.f298617i) && n51.f.a(this.f298618m, kVar.f298618m) && n51.f.a(this.f298619n, kVar.f298619n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.k();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f298620o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f298612d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f298613e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f298614f);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.o oVar = this.f298615g;
            if (oVar != null && zArr[4]) {
                fVar.e(4, oVar.f298646d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.z0 z0Var = this.f298616h;
            if (z0Var != null && zArr[5]) {
                fVar.i(5, z0Var.mo75928xcd1e8d8());
                this.f298616h.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.m mVar = this.f298617i;
            if (mVar != null && zArr[6]) {
                fVar.i(6, mVar.mo75928xcd1e8d8());
                this.f298617i.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.m mVar2 = this.f298618m;
            if (mVar2 != null && zArr[7]) {
                fVar.i(7, mVar2.mo75928xcd1e8d8());
                this.f298618m.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.l lVar = this.f298619n;
            if (lVar != null && zArr[8]) {
                fVar.i(8, lVar.mo75928xcd1e8d8());
                this.f298619n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f298612d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f298613e);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f298614f);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.o oVar2 = this.f298615g;
            if (oVar2 != null && zArr[4]) {
                h17 += b36.f.e(4, oVar2.f298646d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.z0 z0Var2 = this.f298616h;
            if (z0Var2 != null && zArr[5]) {
                h17 += b36.f.i(5, z0Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.m mVar3 = this.f298617i;
            if (mVar3 != null && zArr[6]) {
                h17 += b36.f.i(6, mVar3.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.m mVar4 = this.f298618m;
            if (mVar4 != null && zArr[7]) {
                h17 += b36.f.i(7, mVar4.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.l lVar2 = this.f298619n;
            return (lVar2 == null || !zArr[8]) ? h17 : h17 + b36.f.i(8, lVar2.mo75928xcd1e8d8());
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f298612d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f298613e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f298614f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                int g17 = aVar2.g(intValue);
                this.f298615g = g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 4 ? g17 != 5 ? null : com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.o.GOODS_STATUS_INIT_FAILED : com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.o.GOODS_STATUS_FAILED : com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.o.GOODS_STATUS_SUCCESS : com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.o.GOODS_STATUS_PROCESSING : com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.o.GOODS_STATUS_NOT_HANDLED;
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.z0 z0Var3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.z0();
                    if (bArr != null && bArr.length > 0) {
                        z0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f298616h = z0Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.m mVar5 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.m();
                    if (bArr2 != null && bArr2.length > 0) {
                        mVar5.mo11468x92b714fd(bArr2);
                    }
                    this.f298617i = mVar5;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.m mVar6 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.m();
                    if (bArr3 != null && bArr3.length > 0) {
                        mVar6.mo11468x92b714fd(bArr3);
                    }
                    this.f298618m = mVar6;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.l lVar3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.l();
                    if (bArr4 != null && bArr4.length > 0) {
                        lVar3.mo11468x92b714fd(bArr4);
                    }
                    this.f298619n = lVar3;
                }
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.k) super.mo11468x92b714fd(bArr);
    }
}
