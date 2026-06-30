package bw5;

/* loaded from: classes2.dex */
public class cl extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107660d;

    /* renamed from: e, reason: collision with root package name */
    public long f107661e;

    /* renamed from: f, reason: collision with root package name */
    public int f107662f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f107663g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.bl f107664h;

    /* renamed from: i, reason: collision with root package name */
    public long f107665i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f107666m;

    /* renamed from: n, reason: collision with root package name */
    public long f107667n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f107668o;

    /* renamed from: p, reason: collision with root package name */
    public int f107669p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f107670q;

    /* renamed from: r, reason: collision with root package name */
    public int f107671r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f107672s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f107673t = new boolean[14];

    static {
        new bw5.cl();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cl mo11468x92b714fd(byte[] bArr) {
        return (bw5.cl) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cl)) {
            return false;
        }
        bw5.cl clVar = (bw5.cl) fVar;
        return n51.f.a(this.f107660d, clVar.f107660d) && n51.f.a(java.lang.Long.valueOf(this.f107661e), java.lang.Long.valueOf(clVar.f107661e)) && n51.f.a(java.lang.Integer.valueOf(this.f107662f), java.lang.Integer.valueOf(clVar.f107662f)) && n51.f.a(java.lang.Boolean.valueOf(this.f107663g), java.lang.Boolean.valueOf(clVar.f107663g)) && n51.f.a(this.f107664h, clVar.f107664h) && n51.f.a(java.lang.Long.valueOf(this.f107665i), java.lang.Long.valueOf(clVar.f107665i)) && n51.f.a(java.lang.Boolean.valueOf(this.f107666m), java.lang.Boolean.valueOf(clVar.f107666m)) && n51.f.a(java.lang.Long.valueOf(this.f107667n), java.lang.Long.valueOf(clVar.f107667n)) && n51.f.a(this.f107668o, clVar.f107668o) && n51.f.a(java.lang.Integer.valueOf(this.f107669p), java.lang.Integer.valueOf(clVar.f107669p)) && n51.f.a(this.f107670q, clVar.f107670q) && n51.f.a(java.lang.Integer.valueOf(this.f107671r), java.lang.Integer.valueOf(clVar.f107671r)) && n51.f.a(this.f107672s, clVar.f107672s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.cl();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107673t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107660d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f107661e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f107662f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f107663g);
            }
            bw5.bl blVar = this.f107664h;
            if (blVar != null && zArr[5]) {
                fVar.i(5, blVar.mo75928xcd1e8d8());
                this.f107664h.mo75956x3d5d1f78(fVar);
            }
            if (zArr[6]) {
                fVar.h(6, this.f107665i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f107666m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f107667n);
            }
            java.lang.String str2 = this.f107668o;
            if (str2 != null && zArr[9]) {
                fVar.j(9, str2);
            }
            if (zArr[10]) {
                fVar.e(10, this.f107669p);
            }
            java.lang.String str3 = this.f107670q;
            if (str3 != null && zArr[11]) {
                fVar.j(11, str3);
            }
            if (zArr[12]) {
                fVar.e(12, this.f107671r);
            }
            java.lang.String str4 = this.f107672s;
            if (str4 == null || !zArr[13]) {
                return 0;
            }
            fVar.j(13, str4);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f107660d;
            int j17 = (str5 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str5);
            if (zArr[2]) {
                j17 += b36.f.h(2, this.f107661e);
            }
            if (zArr[3]) {
                j17 += b36.f.e(3, this.f107662f);
            }
            if (zArr[4]) {
                j17 += b36.f.a(4, this.f107663g);
            }
            bw5.bl blVar2 = this.f107664h;
            if (blVar2 != null && zArr[5]) {
                j17 += b36.f.i(5, blVar2.mo75928xcd1e8d8());
            }
            if (zArr[6]) {
                j17 += b36.f.h(6, this.f107665i);
            }
            if (zArr[7]) {
                j17 += b36.f.a(7, this.f107666m);
            }
            if (zArr[8]) {
                j17 += b36.f.h(8, this.f107667n);
            }
            java.lang.String str6 = this.f107668o;
            if (str6 != null && zArr[9]) {
                j17 += b36.f.j(9, str6);
            }
            if (zArr[10]) {
                j17 += b36.f.e(10, this.f107669p);
            }
            java.lang.String str7 = this.f107670q;
            if (str7 != null && zArr[11]) {
                j17 += b36.f.j(11, str7);
            }
            if (zArr[12]) {
                j17 += b36.f.e(12, this.f107671r);
            }
            java.lang.String str8 = this.f107672s;
            return (str8 == null || !zArr[13]) ? j17 : j17 + b36.f.j(13, str8);
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
                this.f107660d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107661e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107662f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107663g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.bl blVar3 = new bw5.bl();
                    if (bArr != null && bArr.length > 0) {
                        blVar3.mo11468x92b714fd(bArr);
                    }
                    this.f107664h = blVar3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f107665i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f107666m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f107667n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f107668o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f107669p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f107670q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f107671r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f107672s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
