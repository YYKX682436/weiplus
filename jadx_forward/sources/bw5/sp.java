package bw5;

/* loaded from: classes2.dex */
public class sp extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f114620d;

    /* renamed from: e, reason: collision with root package name */
    public float f114621e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f114622f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f114623g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f114624h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f114625i;

    /* renamed from: m, reason: collision with root package name */
    public int f114626m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f114627n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f114628o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f114629p;

    /* renamed from: q, reason: collision with root package name */
    public int f114630q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f114631r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f114632s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f114633t;

    /* renamed from: u, reason: collision with root package name */
    public long f114634u;

    /* renamed from: w, reason: collision with root package name */
    public int f114636w;

    /* renamed from: v, reason: collision with root package name */
    public java.util.LinkedList f114635v = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f114637x = new boolean[18];

    static {
        new bw5.sp();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sp mo11468x92b714fd(byte[] bArr) {
        return (bw5.sp) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sp)) {
            return false;
        }
        bw5.sp spVar = (bw5.sp) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f114620d), java.lang.Float.valueOf(spVar.f114620d)) && n51.f.a(java.lang.Float.valueOf(this.f114621e), java.lang.Float.valueOf(spVar.f114621e)) && n51.f.a(this.f114622f, spVar.f114622f) && n51.f.a(this.f114623g, spVar.f114623g) && n51.f.a(this.f114624h, spVar.f114624h) && n51.f.a(this.f114625i, spVar.f114625i) && n51.f.a(java.lang.Integer.valueOf(this.f114626m), java.lang.Integer.valueOf(spVar.f114626m)) && n51.f.a(this.f114627n, spVar.f114627n) && n51.f.a(this.f114628o, spVar.f114628o) && n51.f.a(this.f114629p, spVar.f114629p) && n51.f.a(java.lang.Integer.valueOf(this.f114630q), java.lang.Integer.valueOf(spVar.f114630q)) && n51.f.a(this.f114631r, spVar.f114631r) && n51.f.a(this.f114632s, spVar.f114632s) && n51.f.a(this.f114633t, spVar.f114633t) && n51.f.a(java.lang.Long.valueOf(this.f114634u), java.lang.Long.valueOf(spVar.f114634u)) && n51.f.a(this.f114635v, spVar.f114635v) && n51.f.a(java.lang.Integer.valueOf(this.f114636w), java.lang.Integer.valueOf(spVar.f114636w));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.sp();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114637x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f114620d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f114621e);
            }
            java.lang.String str = this.f114622f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f114623g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f114624h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f114625i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            if (zArr[7]) {
                fVar.e(7, this.f114626m);
            }
            java.lang.String str5 = this.f114627n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f114628o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f114629p;
            if (str7 != null && zArr[10]) {
                fVar.j(10, str7);
            }
            if (zArr[11]) {
                fVar.e(11, this.f114630q);
            }
            java.lang.String str8 = this.f114631r;
            if (str8 != null && zArr[12]) {
                fVar.j(12, str8);
            }
            java.lang.String str9 = this.f114632s;
            if (str9 != null && zArr[13]) {
                fVar.j(13, str9);
            }
            java.lang.String str10 = this.f114633t;
            if (str10 != null && zArr[14]) {
                fVar.j(14, str10);
            }
            if (zArr[15]) {
                fVar.h(15, this.f114634u);
            }
            fVar.g(16, 3, this.f114635v);
            if (zArr[17]) {
                fVar.e(17, this.f114636w);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? b36.f.d(1, this.f114620d) + 0 : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f114621e);
            }
            java.lang.String str11 = this.f114622f;
            if (str11 != null && zArr[3]) {
                d17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f114623g;
            if (str12 != null && zArr[4]) {
                d17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f114624h;
            if (str13 != null && zArr[5]) {
                d17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f114625i;
            if (str14 != null && zArr[6]) {
                d17 += b36.f.j(6, str14);
            }
            if (zArr[7]) {
                d17 += b36.f.e(7, this.f114626m);
            }
            java.lang.String str15 = this.f114627n;
            if (str15 != null && zArr[8]) {
                d17 += b36.f.j(8, str15);
            }
            java.lang.String str16 = this.f114628o;
            if (str16 != null && zArr[9]) {
                d17 += b36.f.j(9, str16);
            }
            java.lang.String str17 = this.f114629p;
            if (str17 != null && zArr[10]) {
                d17 += b36.f.j(10, str17);
            }
            if (zArr[11]) {
                d17 += b36.f.e(11, this.f114630q);
            }
            java.lang.String str18 = this.f114631r;
            if (str18 != null && zArr[12]) {
                d17 += b36.f.j(12, str18);
            }
            java.lang.String str19 = this.f114632s;
            if (str19 != null && zArr[13]) {
                d17 += b36.f.j(13, str19);
            }
            java.lang.String str20 = this.f114633t;
            if (str20 != null && zArr[14]) {
                d17 += b36.f.j(14, str20);
            }
            if (zArr[15]) {
                d17 += b36.f.h(15, this.f114634u);
            }
            int g17 = d17 + b36.f.g(16, 3, this.f114635v);
            return zArr[17] ? g17 + b36.f.e(17, this.f114636w) : g17;
        }
        if (i17 == 2) {
            this.f114635v.clear();
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
                this.f114620d = aVar2.f(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f114621e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f114622f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f114623g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f114624h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f114625i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f114626m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f114627n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f114628o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f114629p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f114630q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f114631r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f114632s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f114633t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f114634u = aVar2.i(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f114635v.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                zArr[16] = true;
                return 0;
            case 17:
                this.f114636w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            default:
                return -1;
        }
    }
}
