package bw5;

/* loaded from: classes2.dex */
public class ig0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f110110d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.rr f110111e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.qr f110112f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.sp f110113g;

    /* renamed from: h, reason: collision with root package name */
    public int f110114h;

    /* renamed from: i, reason: collision with root package name */
    public int f110115i;

    /* renamed from: m, reason: collision with root package name */
    public int f110116m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f110117n = new boolean[8];

    static {
        new bw5.ig0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ig0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ig0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ig0)) {
            return false;
        }
        bw5.ig0 ig0Var = (bw5.ig0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f110110d), java.lang.Integer.valueOf(ig0Var.f110110d)) && n51.f.a(this.f110111e, ig0Var.f110111e) && n51.f.a(this.f110112f, ig0Var.f110112f) && n51.f.a(this.f110113g, ig0Var.f110113g) && n51.f.a(java.lang.Integer.valueOf(this.f110114h), java.lang.Integer.valueOf(ig0Var.f110114h)) && n51.f.a(java.lang.Integer.valueOf(this.f110115i), java.lang.Integer.valueOf(ig0Var.f110115i)) && n51.f.a(java.lang.Integer.valueOf(this.f110116m), java.lang.Integer.valueOf(ig0Var.f110116m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ig0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f110117n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f110110d);
            }
            bw5.rr rrVar = this.f110111e;
            if (rrVar != null && zArr[2]) {
                fVar.i(2, rrVar.mo75928xcd1e8d8());
                this.f110111e.mo75956x3d5d1f78(fVar);
            }
            bw5.qr qrVar = this.f110112f;
            if (qrVar != null && zArr[3]) {
                fVar.i(3, qrVar.mo75928xcd1e8d8());
                this.f110112f.mo75956x3d5d1f78(fVar);
            }
            bw5.sp spVar = this.f110113g;
            if (spVar != null && zArr[4]) {
                fVar.i(4, spVar.mo75928xcd1e8d8());
                this.f110113g.mo75956x3d5d1f78(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f110114h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f110115i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f110116m);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f110110d) : 0;
            bw5.rr rrVar2 = this.f110111e;
            if (rrVar2 != null && zArr[2]) {
                e17 += b36.f.i(2, rrVar2.mo75928xcd1e8d8());
            }
            bw5.qr qrVar2 = this.f110112f;
            if (qrVar2 != null && zArr[3]) {
                e17 += b36.f.i(3, qrVar2.mo75928xcd1e8d8());
            }
            bw5.sp spVar2 = this.f110113g;
            if (spVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, spVar2.mo75928xcd1e8d8());
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f110114h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f110115i);
            }
            return zArr[7] ? e17 + b36.f.e(7, this.f110116m) : e17;
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
                this.f110110d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.rr rrVar3 = new bw5.rr();
                    if (bArr != null && bArr.length > 0) {
                        rrVar3.mo11468x92b714fd(bArr);
                    }
                    this.f110111e = rrVar3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.qr qrVar3 = new bw5.qr();
                    if (bArr2 != null && bArr2.length > 0) {
                        qrVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f110112f = qrVar3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.sp spVar3 = new bw5.sp();
                    if (bArr3 != null && bArr3.length > 0) {
                        spVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f110113g = spVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f110114h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f110115i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f110116m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
