package bw5;

/* loaded from: classes2.dex */
public class vz extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f116062d;

    /* renamed from: e, reason: collision with root package name */
    public int f116063e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.xz f116064f;

    /* renamed from: g, reason: collision with root package name */
    public int f116065g;

    /* renamed from: h, reason: collision with root package name */
    public int f116066h;

    /* renamed from: i, reason: collision with root package name */
    public int f116067i;

    /* renamed from: m, reason: collision with root package name */
    public int f116068m;

    /* renamed from: n, reason: collision with root package name */
    public int f116069n;

    /* renamed from: o, reason: collision with root package name */
    public int f116070o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f116071p;

    /* renamed from: q, reason: collision with root package name */
    public long f116072q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f116073r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f116074s = new boolean[13];

    static {
        new bw5.vz();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vz mo11468x92b714fd(byte[] bArr) {
        return (bw5.vz) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vz)) {
            return false;
        }
        bw5.vz vzVar = (bw5.vz) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f116062d), java.lang.Long.valueOf(vzVar.f116062d)) && n51.f.a(java.lang.Integer.valueOf(this.f116063e), java.lang.Integer.valueOf(vzVar.f116063e)) && n51.f.a(this.f116064f, vzVar.f116064f) && n51.f.a(java.lang.Integer.valueOf(this.f116065g), java.lang.Integer.valueOf(vzVar.f116065g)) && n51.f.a(java.lang.Integer.valueOf(this.f116066h), java.lang.Integer.valueOf(vzVar.f116066h)) && n51.f.a(java.lang.Integer.valueOf(this.f116067i), java.lang.Integer.valueOf(vzVar.f116067i)) && n51.f.a(java.lang.Integer.valueOf(this.f116068m), java.lang.Integer.valueOf(vzVar.f116068m)) && n51.f.a(java.lang.Integer.valueOf(this.f116069n), java.lang.Integer.valueOf(vzVar.f116069n)) && n51.f.a(java.lang.Integer.valueOf(this.f116070o), java.lang.Integer.valueOf(vzVar.f116070o)) && n51.f.a(this.f116071p, vzVar.f116071p) && n51.f.a(java.lang.Long.valueOf(this.f116072q), java.lang.Long.valueOf(vzVar.f116072q)) && n51.f.a(java.lang.Boolean.valueOf(this.f116073r), java.lang.Boolean.valueOf(vzVar.f116073r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.vz();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116074s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f116062d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f116063e);
            }
            bw5.xz xzVar = this.f116064f;
            if (xzVar != null && zArr[3]) {
                fVar.i(3, xzVar.mo75928xcd1e8d8());
                this.f116064f.mo75956x3d5d1f78(fVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f116065g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f116066h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f116067i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f116068m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f116069n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f116070o);
            }
            java.lang.String str = this.f116071p;
            if (str != null && zArr[10]) {
                fVar.j(10, str);
            }
            if (zArr[11]) {
                fVar.h(11, this.f116072q);
            }
            if (zArr[12]) {
                fVar.a(12, this.f116073r);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f116062d) : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f116063e);
            }
            bw5.xz xzVar2 = this.f116064f;
            if (xzVar2 != null && zArr[3]) {
                h17 += b36.f.i(3, xzVar2.mo75928xcd1e8d8());
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f116065g);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f116066h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f116067i);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f116068m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f116069n);
            }
            if (zArr[9]) {
                h17 += b36.f.e(9, this.f116070o);
            }
            java.lang.String str2 = this.f116071p;
            if (str2 != null && zArr[10]) {
                h17 += b36.f.j(10, str2);
            }
            if (zArr[11]) {
                h17 += b36.f.h(11, this.f116072q);
            }
            return zArr[12] ? h17 + b36.f.a(12, this.f116073r) : h17;
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
                this.f116062d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f116063e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.xz xzVar3 = new bw5.xz();
                    if (bArr != null && bArr.length > 0) {
                        xzVar3.mo11468x92b714fd(bArr);
                    }
                    this.f116064f = xzVar3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f116065g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f116066h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f116067i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f116068m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f116069n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f116070o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f116071p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f116072q = aVar2.i(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f116073r = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
