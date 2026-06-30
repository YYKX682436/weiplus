package jy3;

/* loaded from: classes14.dex */
public class f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384039d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384040e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384041f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384042g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384043h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f384044i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f384045m;

    /* renamed from: n, reason: collision with root package name */
    public int f384046n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f384047o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f384048p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f384049q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f384050r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f384051s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f384052t;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof jy3.f)) {
            return false;
        }
        jy3.f fVar2 = (jy3.f) fVar;
        return n51.f.a(this.f384039d, fVar2.f384039d) && n51.f.a(this.f384040e, fVar2.f384040e) && n51.f.a(this.f384041f, fVar2.f384041f) && n51.f.a(this.f384042g, fVar2.f384042g) && n51.f.a(this.f384043h, fVar2.f384043h) && n51.f.a(this.f384044i, fVar2.f384044i) && n51.f.a(this.f384045m, fVar2.f384045m) && n51.f.a(java.lang.Integer.valueOf(this.f384046n), java.lang.Integer.valueOf(fVar2.f384046n)) && n51.f.a(java.lang.Boolean.valueOf(this.f384047o), java.lang.Boolean.valueOf(fVar2.f384047o)) && n51.f.a(java.lang.Boolean.valueOf(this.f384048p), java.lang.Boolean.valueOf(fVar2.f384048p)) && n51.f.a(this.f384049q, fVar2.f384049q) && n51.f.a(this.f384050r, fVar2.f384050r) && n51.f.a(this.f384051s, fVar2.f384051s) && n51.f.a(this.f384052t, fVar2.f384052t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f384039d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f384040e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f384041f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f384042g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f384043h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f384044i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f384045m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            fVar.e(8, this.f384046n);
            fVar.a(9, this.f384047o);
            fVar.a(10, this.f384048p);
            java.lang.String str8 = this.f384049q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f384050r;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            java.lang.String str10 = this.f384051s;
            if (str10 != null) {
                fVar.j(13, str10);
            }
            java.lang.String str11 = this.f384052t;
            if (str11 != null) {
                fVar.j(14, str11);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f384039d;
            int j17 = str12 != null ? b36.f.j(1, str12) + 0 : 0;
            java.lang.String str13 = this.f384040e;
            if (str13 != null) {
                j17 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f384041f;
            if (str14 != null) {
                j17 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f384042g;
            if (str15 != null) {
                j17 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f384043h;
            if (str16 != null) {
                j17 += b36.f.j(5, str16);
            }
            java.lang.String str17 = this.f384044i;
            if (str17 != null) {
                j17 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f384045m;
            if (str18 != null) {
                j17 += b36.f.j(7, str18);
            }
            int e17 = j17 + b36.f.e(8, this.f384046n) + b36.f.a(9, this.f384047o) + b36.f.a(10, this.f384048p);
            java.lang.String str19 = this.f384049q;
            if (str19 != null) {
                e17 += b36.f.j(11, str19);
            }
            java.lang.String str20 = this.f384050r;
            if (str20 != null) {
                e17 += b36.f.j(12, str20);
            }
            java.lang.String str21 = this.f384051s;
            if (str21 != null) {
                e17 += b36.f.j(13, str21);
            }
            java.lang.String str22 = this.f384052t;
            return str22 != null ? e17 + b36.f.j(14, str22) : e17;
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
        jy3.f fVar2 = (jy3.f) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fVar2.f384039d = aVar2.k(intValue);
                return 0;
            case 2:
                fVar2.f384040e = aVar2.k(intValue);
                return 0;
            case 3:
                fVar2.f384041f = aVar2.k(intValue);
                return 0;
            case 4:
                fVar2.f384042g = aVar2.k(intValue);
                return 0;
            case 5:
                fVar2.f384043h = aVar2.k(intValue);
                return 0;
            case 6:
                fVar2.f384044i = aVar2.k(intValue);
                return 0;
            case 7:
                fVar2.f384045m = aVar2.k(intValue);
                return 0;
            case 8:
                fVar2.f384046n = aVar2.g(intValue);
                return 0;
            case 9:
                fVar2.f384047o = aVar2.c(intValue);
                return 0;
            case 10:
                fVar2.f384048p = aVar2.c(intValue);
                return 0;
            case 11:
                fVar2.f384049q = aVar2.k(intValue);
                return 0;
            case 12:
                fVar2.f384050r = aVar2.k(intValue);
                return 0;
            case 13:
                fVar2.f384051s = aVar2.k(intValue);
                return 0;
            case 14:
                fVar2.f384052t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
