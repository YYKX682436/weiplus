package bw5;

/* loaded from: classes2.dex */
public class fi extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f108811d;

    /* renamed from: e, reason: collision with root package name */
    public int f108812e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f108813f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108814g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f108815h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f108816i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f108817m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f108818n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.kh f108819o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.ei f108820p;

    /* renamed from: q, reason: collision with root package name */
    public int f108821q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f108822r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f108823s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f108824t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f108825u;

    /* renamed from: v, reason: collision with root package name */
    public int f108826v;

    /* renamed from: w, reason: collision with root package name */
    public int f108827w;

    /* renamed from: x, reason: collision with root package name */
    public int f108828x;

    /* renamed from: y, reason: collision with root package name */
    public int f108829y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean[] f108830z = new boolean[20];

    static {
        new bw5.fi();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fi mo11468x92b714fd(byte[] bArr) {
        return (bw5.fi) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fi)) {
            return false;
        }
        bw5.fi fiVar = (bw5.fi) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f108811d), java.lang.Integer.valueOf(fiVar.f108811d)) && n51.f.a(java.lang.Integer.valueOf(this.f108812e), java.lang.Integer.valueOf(fiVar.f108812e)) && n51.f.a(this.f108813f, fiVar.f108813f) && n51.f.a(this.f108814g, fiVar.f108814g) && n51.f.a(this.f108815h, fiVar.f108815h) && n51.f.a(this.f108816i, fiVar.f108816i) && n51.f.a(this.f108817m, fiVar.f108817m) && n51.f.a(this.f108818n, fiVar.f108818n) && n51.f.a(this.f108819o, fiVar.f108819o) && n51.f.a(this.f108820p, fiVar.f108820p) && n51.f.a(java.lang.Integer.valueOf(this.f108821q), java.lang.Integer.valueOf(fiVar.f108821q)) && n51.f.a(this.f108822r, fiVar.f108822r) && n51.f.a(this.f108823s, fiVar.f108823s) && n51.f.a(this.f108824t, fiVar.f108824t) && n51.f.a(this.f108825u, fiVar.f108825u) && n51.f.a(java.lang.Integer.valueOf(this.f108826v), java.lang.Integer.valueOf(fiVar.f108826v)) && n51.f.a(java.lang.Integer.valueOf(this.f108827w), java.lang.Integer.valueOf(fiVar.f108827w)) && n51.f.a(java.lang.Integer.valueOf(this.f108828x), java.lang.Integer.valueOf(fiVar.f108828x)) && n51.f.a(java.lang.Integer.valueOf(this.f108829y), java.lang.Integer.valueOf(fiVar.f108829y));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.fi();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f108830z;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f108811d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f108812e);
            }
            java.lang.String str = this.f108813f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f108814g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f108815h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f108816i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f108817m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f108818n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            bw5.kh khVar = this.f108819o;
            if (khVar != null && zArr[9]) {
                fVar.i(9, khVar.mo75928xcd1e8d8());
                this.f108819o.mo75956x3d5d1f78(fVar);
            }
            bw5.ei eiVar = this.f108820p;
            if (eiVar != null && zArr[10]) {
                fVar.i(10, eiVar.mo75928xcd1e8d8());
                this.f108820p.mo75956x3d5d1f78(fVar);
            }
            if (zArr[11]) {
                fVar.e(11, this.f108821q);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f108822r;
            if (gVar != null && zArr[12]) {
                fVar.b(12, gVar);
            }
            java.lang.String str7 = this.f108823s;
            if (str7 != null && zArr[13]) {
                fVar.j(13, str7);
            }
            java.lang.String str8 = this.f108824t;
            if (str8 != null && zArr[14]) {
                fVar.j(14, str8);
            }
            java.lang.String str9 = this.f108825u;
            if (str9 != null && zArr[15]) {
                fVar.j(15, str9);
            }
            if (zArr[16]) {
                fVar.e(16, this.f108826v);
            }
            if (zArr[17]) {
                fVar.e(17, this.f108827w);
            }
            if (zArr[18]) {
                fVar.e(18, this.f108828x);
            }
            if (zArr[19]) {
                fVar.e(19, this.f108829y);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f108811d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f108812e);
            }
            java.lang.String str10 = this.f108813f;
            if (str10 != null && zArr[3]) {
                e17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f108814g;
            if (str11 != null && zArr[4]) {
                e17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f108815h;
            if (str12 != null && zArr[5]) {
                e17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f108816i;
            if (str13 != null && zArr[6]) {
                e17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f108817m;
            if (str14 != null && zArr[7]) {
                e17 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f108818n;
            if (str15 != null && zArr[8]) {
                e17 += b36.f.j(8, str15);
            }
            bw5.kh khVar2 = this.f108819o;
            if (khVar2 != null && zArr[9]) {
                e17 += b36.f.i(9, khVar2.mo75928xcd1e8d8());
            }
            bw5.ei eiVar2 = this.f108820p;
            if (eiVar2 != null && zArr[10]) {
                e17 += b36.f.i(10, eiVar2.mo75928xcd1e8d8());
            }
            if (zArr[11]) {
                e17 += b36.f.e(11, this.f108821q);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f108822r;
            if (gVar2 != null && zArr[12]) {
                e17 += b36.f.b(12, gVar2);
            }
            java.lang.String str16 = this.f108823s;
            if (str16 != null && zArr[13]) {
                e17 += b36.f.j(13, str16);
            }
            java.lang.String str17 = this.f108824t;
            if (str17 != null && zArr[14]) {
                e17 += b36.f.j(14, str17);
            }
            java.lang.String str18 = this.f108825u;
            if (str18 != null && zArr[15]) {
                e17 += b36.f.j(15, str18);
            }
            if (zArr[16]) {
                e17 += b36.f.e(16, this.f108826v);
            }
            if (zArr[17]) {
                e17 += b36.f.e(17, this.f108827w);
            }
            if (zArr[18]) {
                e17 += b36.f.e(18, this.f108828x);
            }
            return zArr[19] ? e17 + b36.f.e(19, this.f108829y) : e17;
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
                this.f108811d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108812e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108813f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108814g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108815h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108816i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108817m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f108818n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.kh khVar3 = new bw5.kh();
                    if (bArr != null && bArr.length > 0) {
                        khVar3.mo11468x92b714fd(bArr);
                    }
                    this.f108819o = khVar3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.ei eiVar3 = new bw5.ei();
                    if (bArr2 != null && bArr2.length > 0) {
                        eiVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f108820p = eiVar3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f108821q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f108822r = aVar2.d(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f108823s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f108824t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f108825u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f108826v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f108827w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f108828x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f108829y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            default:
                return -1;
        }
    }
}
