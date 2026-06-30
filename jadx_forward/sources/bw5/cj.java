package bw5;

/* loaded from: classes2.dex */
public class cj extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107632d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107633e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107634f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f107635g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f107636h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f107637i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f107638m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.od f107639n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f107640o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f107641p;

    /* renamed from: q, reason: collision with root package name */
    public long f107642q;

    /* renamed from: r, reason: collision with root package name */
    public int f107643r;

    /* renamed from: s, reason: collision with root package name */
    public int f107644s;

    /* renamed from: t, reason: collision with root package name */
    public int f107645t;

    /* renamed from: u, reason: collision with root package name */
    public int f107646u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f107647v = new boolean[16];

    static {
        new bw5.cj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cj mo11468x92b714fd(byte[] bArr) {
        return (bw5.cj) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cj)) {
            return false;
        }
        bw5.cj cjVar = (bw5.cj) fVar;
        return n51.f.a(this.f107632d, cjVar.f107632d) && n51.f.a(this.f107633e, cjVar.f107633e) && n51.f.a(this.f107634f, cjVar.f107634f) && n51.f.a(this.f107635g, cjVar.f107635g) && n51.f.a(this.f107636h, cjVar.f107636h) && n51.f.a(this.f107637i, cjVar.f107637i) && n51.f.a(this.f107638m, cjVar.f107638m) && n51.f.a(this.f107639n, cjVar.f107639n) && n51.f.a(java.lang.Boolean.valueOf(this.f107640o), java.lang.Boolean.valueOf(cjVar.f107640o)) && n51.f.a(this.f107641p, cjVar.f107641p) && n51.f.a(java.lang.Long.valueOf(this.f107642q), java.lang.Long.valueOf(cjVar.f107642q)) && n51.f.a(java.lang.Integer.valueOf(this.f107643r), java.lang.Integer.valueOf(cjVar.f107643r)) && n51.f.a(java.lang.Integer.valueOf(this.f107644s), java.lang.Integer.valueOf(cjVar.f107644s)) && n51.f.a(java.lang.Integer.valueOf(this.f107645t), java.lang.Integer.valueOf(cjVar.f107645t)) && n51.f.a(java.lang.Integer.valueOf(this.f107646u), java.lang.Integer.valueOf(cjVar.f107646u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.cj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f107647v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107632d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f107633e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f107634f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f107635g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f107636h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f107637i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f107638m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            bw5.od odVar = this.f107639n;
            if (odVar != null && zArr[8]) {
                fVar.i(8, odVar.mo75928xcd1e8d8());
                this.f107639n.mo75956x3d5d1f78(fVar);
            }
            if (zArr[9]) {
                fVar.a(9, this.f107640o);
            }
            java.lang.String str8 = this.f107641p;
            if (str8 != null && zArr[10]) {
                fVar.j(10, str8);
            }
            if (zArr[11]) {
                fVar.h(11, this.f107642q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f107643r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f107644s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f107645t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f107646u);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f107632d;
            if (str9 != null && zArr[1]) {
                i18 = b36.f.j(1, str9) + 0;
            }
            java.lang.String str10 = this.f107633e;
            if (str10 != null && zArr[2]) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f107634f;
            if (str11 != null && zArr[3]) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f107635g;
            if (str12 != null && zArr[4]) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f107636h;
            if (str13 != null && zArr[5]) {
                i18 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f107637i;
            if (str14 != null && zArr[6]) {
                i18 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f107638m;
            if (str15 != null && zArr[7]) {
                i18 += b36.f.j(7, str15);
            }
            bw5.od odVar2 = this.f107639n;
            if (odVar2 != null && zArr[8]) {
                i18 += b36.f.i(8, odVar2.mo75928xcd1e8d8());
            }
            if (zArr[9]) {
                i18 += b36.f.a(9, this.f107640o);
            }
            java.lang.String str16 = this.f107641p;
            if (str16 != null && zArr[10]) {
                i18 += b36.f.j(10, str16);
            }
            if (zArr[11]) {
                i18 += b36.f.h(11, this.f107642q);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f107643r);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f107644s);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f107645t);
            }
            return zArr[15] ? i18 + b36.f.e(15, this.f107646u) : i18;
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
                this.f107632d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107633e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107634f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107635g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107636h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107637i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f107638m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.od odVar3 = new bw5.od();
                    if (bArr != null && bArr.length > 0) {
                        odVar3.mo11468x92b714fd(bArr);
                    }
                    this.f107639n = odVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f107640o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f107641p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f107642q = aVar2.i(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f107643r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f107644s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f107645t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f107646u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }
}
