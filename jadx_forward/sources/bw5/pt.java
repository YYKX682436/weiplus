package bw5;

/* loaded from: classes2.dex */
public class pt extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f113362d;

    /* renamed from: e, reason: collision with root package name */
    public int f113363e;

    /* renamed from: f, reason: collision with root package name */
    public int f113364f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f113365g;

    /* renamed from: h, reason: collision with root package name */
    public int f113366h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f113367i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f113368m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.yr f113369n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f113370o;

    /* renamed from: p, reason: collision with root package name */
    public int f113371p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.wr f113372q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.pd f113373r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f113374s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.gc f113375t;

    /* renamed from: u, reason: collision with root package name */
    public int f113376u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f113377v = new boolean[16];

    static {
        new bw5.pt();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pt mo11468x92b714fd(byte[] bArr) {
        return (bw5.pt) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pt)) {
            return false;
        }
        bw5.pt ptVar = (bw5.pt) fVar;
        return n51.f.a(this.f113362d, ptVar.f113362d) && n51.f.a(java.lang.Integer.valueOf(this.f113363e), java.lang.Integer.valueOf(ptVar.f113363e)) && n51.f.a(java.lang.Integer.valueOf(this.f113364f), java.lang.Integer.valueOf(ptVar.f113364f)) && n51.f.a(this.f113365g, ptVar.f113365g) && n51.f.a(java.lang.Integer.valueOf(this.f113366h), java.lang.Integer.valueOf(ptVar.f113366h)) && n51.f.a(this.f113367i, ptVar.f113367i) && n51.f.a(this.f113368m, ptVar.f113368m) && n51.f.a(this.f113369n, ptVar.f113369n) && n51.f.a(this.f113370o, ptVar.f113370o) && n51.f.a(java.lang.Integer.valueOf(this.f113371p), java.lang.Integer.valueOf(ptVar.f113371p)) && n51.f.a(this.f113372q, ptVar.f113372q) && n51.f.a(this.f113373r, ptVar.f113373r) && n51.f.a(this.f113374s, ptVar.f113374s) && n51.f.a(this.f113375t, ptVar.f113375t) && n51.f.a(java.lang.Integer.valueOf(this.f113376u), java.lang.Integer.valueOf(ptVar.f113376u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.pt();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f113377v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f113362d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f113363e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f113364f);
            }
            java.lang.String str2 = this.f113365g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f113366h);
            }
            java.lang.String str3 = this.f113367i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f113368m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            bw5.yr yrVar = this.f113369n;
            if (yrVar != null && zArr[8]) {
                fVar.i(8, yrVar.mo75928xcd1e8d8());
                this.f113369n.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f113370o;
            if (gVar != null && zArr[9]) {
                fVar.b(9, gVar);
            }
            if (zArr[10]) {
                fVar.e(10, this.f113371p);
            }
            bw5.wr wrVar = this.f113372q;
            if (wrVar != null && zArr[11]) {
                fVar.i(11, wrVar.mo75928xcd1e8d8());
                this.f113372q.mo75956x3d5d1f78(fVar);
            }
            bw5.pd pdVar = this.f113373r;
            if (pdVar != null && zArr[12]) {
                fVar.i(12, pdVar.mo75928xcd1e8d8());
                this.f113373r.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f113374s;
            if (str5 != null && zArr[13]) {
                fVar.j(13, str5);
            }
            bw5.gc gcVar = this.f113375t;
            if (gcVar != null && zArr[14]) {
                fVar.i(14, gcVar.mo75928xcd1e8d8());
                this.f113375t.mo75956x3d5d1f78(fVar);
            }
            if (zArr[15]) {
                fVar.e(15, this.f113376u);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f113362d;
            if (str6 != null && zArr[1]) {
                i18 = b36.f.j(1, str6) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f113363e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f113364f);
            }
            java.lang.String str7 = this.f113365g;
            if (str7 != null && zArr[4]) {
                i18 += b36.f.j(4, str7);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f113366h);
            }
            java.lang.String str8 = this.f113367i;
            if (str8 != null && zArr[6]) {
                i18 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f113368m;
            if (str9 != null && zArr[7]) {
                i18 += b36.f.j(7, str9);
            }
            bw5.yr yrVar2 = this.f113369n;
            if (yrVar2 != null && zArr[8]) {
                i18 += b36.f.i(8, yrVar2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f113370o;
            if (gVar2 != null && zArr[9]) {
                i18 += b36.f.b(9, gVar2);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f113371p);
            }
            bw5.wr wrVar2 = this.f113372q;
            if (wrVar2 != null && zArr[11]) {
                i18 += b36.f.i(11, wrVar2.mo75928xcd1e8d8());
            }
            bw5.pd pdVar2 = this.f113373r;
            if (pdVar2 != null && zArr[12]) {
                i18 += b36.f.i(12, pdVar2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f113374s;
            if (str10 != null && zArr[13]) {
                i18 += b36.f.j(13, str10);
            }
            bw5.gc gcVar2 = this.f113375t;
            if (gcVar2 != null && zArr[14]) {
                i18 += b36.f.i(14, gcVar2.mo75928xcd1e8d8());
            }
            return zArr[15] ? i18 + b36.f.e(15, this.f113376u) : i18;
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
                this.f113362d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113363e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113364f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113365g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113366h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113367i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f113368m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.yr yrVar3 = new bw5.yr();
                    if (bArr != null && bArr.length > 0) {
                        yrVar3.mo11468x92b714fd(bArr);
                    }
                    this.f113369n = yrVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f113370o = aVar2.d(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f113371p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.wr wrVar3 = new bw5.wr();
                    if (bArr2 != null && bArr2.length > 0) {
                        wrVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f113372q = wrVar3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.pd pdVar3 = new bw5.pd();
                    if (bArr3 != null && bArr3.length > 0) {
                        pdVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f113373r = pdVar3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                this.f113374s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.gc gcVar3 = new bw5.gc();
                    if (bArr4 != null && bArr4.length > 0) {
                        gcVar3.mo11468x92b714fd(bArr4);
                    }
                    this.f113375t = gcVar3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                this.f113376u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }
}
