package bw5;

/* loaded from: classes11.dex */
public class z extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f117276d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f117277e;

    /* renamed from: f, reason: collision with root package name */
    public int f117278f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.x f117279g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.x f117280h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.y f117281i;

    /* renamed from: m, reason: collision with root package name */
    public int f117282m;

    /* renamed from: n, reason: collision with root package name */
    public long f117283n;

    /* renamed from: o, reason: collision with root package name */
    public int f117284o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f117285p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f117286q = new boolean[16];

    static {
        new bw5.z();
    }

    public bw5.x b() {
        return this.f117286q[9] ? this.f117279g : new bw5.x();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.z)) {
            return false;
        }
        bw5.z zVar = (bw5.z) fVar;
        return n51.f.a(this.f117276d, zVar.f117276d) && n51.f.a(java.lang.Boolean.valueOf(this.f117277e), java.lang.Boolean.valueOf(zVar.f117277e)) && n51.f.a(java.lang.Integer.valueOf(this.f117278f), java.lang.Integer.valueOf(zVar.f117278f)) && n51.f.a(this.f117279g, zVar.f117279g) && n51.f.a(this.f117280h, zVar.f117280h) && n51.f.a(this.f117281i, zVar.f117281i) && n51.f.a(java.lang.Integer.valueOf(this.f117282m), java.lang.Integer.valueOf(zVar.f117282m)) && n51.f.a(java.lang.Long.valueOf(this.f117283n), java.lang.Long.valueOf(zVar.f117283n)) && n51.f.a(java.lang.Integer.valueOf(this.f117284o), java.lang.Integer.valueOf(zVar.f117284o)) && n51.f.a(java.lang.Boolean.valueOf(this.f117285p), java.lang.Boolean.valueOf(zVar.f117285p));
    }

    /* renamed from: getData_ */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m13447x744cac3f() {
        return this.f117286q[4] ? this.f117276d : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.z();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f117286q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f117276d;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            if (zArr[7]) {
                fVar.a(7, this.f117277e);
            }
            if (zArr[8]) {
                fVar.e(8, this.f117278f);
            }
            bw5.x xVar = this.f117279g;
            if (xVar != null && zArr[9]) {
                fVar.i(9, xVar.mo75928xcd1e8d8());
                this.f117279g.mo75956x3d5d1f78(fVar);
            }
            bw5.x xVar2 = this.f117280h;
            if (xVar2 != null && zArr[10]) {
                fVar.i(10, xVar2.mo75928xcd1e8d8());
                this.f117280h.mo75956x3d5d1f78(fVar);
            }
            bw5.y yVar = this.f117281i;
            if (yVar != null && zArr[11]) {
                fVar.i(11, yVar.mo75928xcd1e8d8());
                this.f117281i.mo75956x3d5d1f78(fVar);
            }
            if (zArr[12]) {
                fVar.e(12, this.f117282m);
            }
            if (zArr[13]) {
                fVar.h(13, this.f117283n);
            }
            if (zArr[14]) {
                fVar.e(14, this.f117284o);
            }
            if (zArr[15]) {
                fVar.a(15, this.f117285p);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f117276d;
            if (gVar2 != null && zArr[4]) {
                i18 = 0 + b36.f.b(4, gVar2);
            }
            if (zArr[7]) {
                i18 += b36.f.a(7, this.f117277e);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f117278f);
            }
            bw5.x xVar3 = this.f117279g;
            if (xVar3 != null && zArr[9]) {
                i18 += b36.f.i(9, xVar3.mo75928xcd1e8d8());
            }
            bw5.x xVar4 = this.f117280h;
            if (xVar4 != null && zArr[10]) {
                i18 += b36.f.i(10, xVar4.mo75928xcd1e8d8());
            }
            bw5.y yVar2 = this.f117281i;
            if (yVar2 != null && zArr[11]) {
                i18 += b36.f.i(11, yVar2.mo75928xcd1e8d8());
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f117282m);
            }
            if (zArr[13]) {
                i18 += b36.f.h(13, this.f117283n);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f117284o);
            }
            return zArr[15] ? i18 + b36.f.a(15, this.f117285p) : i18;
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
        if (intValue == 4) {
            this.f117276d = aVar2.d(intValue);
            zArr[4] = true;
            return 0;
        }
        switch (intValue) {
            case 7:
                this.f117277e = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f117278f = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.x xVar5 = new bw5.x();
                    if (bArr != null && bArr.length > 0) {
                        xVar5.mo11468x92b714fd(bArr);
                    }
                    this.f117279g = xVar5;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.x xVar6 = new bw5.x();
                    if (bArr2 != null && bArr2.length > 0) {
                        xVar6.mo11468x92b714fd(bArr2);
                    }
                    this.f117280h = xVar6;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.y yVar3 = new bw5.y();
                    if (bArr3 != null && bArr3.length > 0) {
                        yVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f117281i = yVar3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f117282m = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f117283n = aVar2.i(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f117284o = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f117285p = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.z) super.mo11468x92b714fd(bArr);
    }
}
