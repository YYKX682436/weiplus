package r45;

/* loaded from: classes8.dex */
public class an5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f451675d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451676e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f451677f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f451678g;

    /* renamed from: h, reason: collision with root package name */
    public int f451679h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f451680i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f451681m;

    /* renamed from: n, reason: collision with root package name */
    public int f451682n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f451683o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f451684p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f451685q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f451686r;

    /* renamed from: s, reason: collision with root package name */
    public r45.ce4 f451687s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f451688t;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.an5)) {
            return false;
        }
        r45.an5 an5Var = (r45.an5) fVar;
        return n51.f.a(this.f76492x92037252, an5Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f451675d), java.lang.Integer.valueOf(an5Var.f451675d)) && n51.f.a(this.f451676e, an5Var.f451676e) && n51.f.a(java.lang.Boolean.valueOf(this.f451677f), java.lang.Boolean.valueOf(an5Var.f451677f)) && n51.f.a(java.lang.Boolean.valueOf(this.f451678g), java.lang.Boolean.valueOf(an5Var.f451678g)) && n51.f.a(java.lang.Integer.valueOf(this.f451679h), java.lang.Integer.valueOf(an5Var.f451679h)) && n51.f.a(this.f451680i, an5Var.f451680i) && n51.f.a(this.f451681m, an5Var.f451681m) && n51.f.a(java.lang.Integer.valueOf(this.f451682n), java.lang.Integer.valueOf(an5Var.f451682n)) && n51.f.a(this.f451683o, an5Var.f451683o) && n51.f.a(this.f451684p, an5Var.f451684p) && n51.f.a(this.f451685q, an5Var.f451685q) && n51.f.a(this.f451686r, an5Var.f451686r) && n51.f.a(this.f451687s, an5Var.f451687s) && n51.f.a(this.f451688t, an5Var.f451688t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f451675d);
            java.lang.String str = this.f451676e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.a(4, this.f451677f);
            fVar.a(5, this.f451678g);
            fVar.e(6, this.f451679h);
            java.lang.String str2 = this.f451680i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f451681m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f451682n);
            java.lang.String str4 = this.f451683o;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            java.lang.String str5 = this.f451684p;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f451685q;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            java.lang.String str7 = this.f451686r;
            if (str7 != null) {
                fVar.j(13, str7);
            }
            r45.ce4 ce4Var = this.f451687s;
            if (ce4Var != null) {
                fVar.i(99, ce4Var.mo75928xcd1e8d8());
                this.f451687s.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str8 = this.f451688t;
            if (str8 != null) {
                fVar.j(100, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f451675d);
            java.lang.String str9 = this.f451676e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            int a17 = i18 + b36.f.a(4, this.f451677f) + b36.f.a(5, this.f451678g) + b36.f.e(6, this.f451679h);
            java.lang.String str10 = this.f451680i;
            if (str10 != null) {
                a17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f451681m;
            if (str11 != null) {
                a17 += b36.f.j(8, str11);
            }
            int e17 = a17 + b36.f.e(9, this.f451682n);
            java.lang.String str12 = this.f451683o;
            if (str12 != null) {
                e17 += b36.f.j(10, str12);
            }
            java.lang.String str13 = this.f451684p;
            if (str13 != null) {
                e17 += b36.f.j(11, str13);
            }
            java.lang.String str14 = this.f451685q;
            if (str14 != null) {
                e17 += b36.f.j(12, str14);
            }
            java.lang.String str15 = this.f451686r;
            if (str15 != null) {
                e17 += b36.f.j(13, str15);
            }
            r45.ce4 ce4Var2 = this.f451687s;
            if (ce4Var2 != null) {
                e17 += b36.f.i(99, ce4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str16 = this.f451688t;
            return str16 != null ? e17 + b36.f.j(100, str16) : e17;
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
        r45.an5 an5Var = (r45.an5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 99) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ce4 ce4Var3 = new r45.ce4();
                if (bArr != null && bArr.length > 0) {
                    ce4Var3.mo11468x92b714fd(bArr);
                }
                an5Var.f451687s = ce4Var3;
            }
            return 0;
        }
        if (intValue == 100) {
            an5Var.f451688t = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    an5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                an5Var.f451675d = aVar2.g(intValue);
                return 0;
            case 3:
                an5Var.f451676e = aVar2.k(intValue);
                return 0;
            case 4:
                an5Var.f451677f = aVar2.c(intValue);
                return 0;
            case 5:
                an5Var.f451678g = aVar2.c(intValue);
                return 0;
            case 6:
                an5Var.f451679h = aVar2.g(intValue);
                return 0;
            case 7:
                an5Var.f451680i = aVar2.k(intValue);
                return 0;
            case 8:
                an5Var.f451681m = aVar2.k(intValue);
                return 0;
            case 9:
                an5Var.f451682n = aVar2.g(intValue);
                return 0;
            case 10:
                an5Var.f451683o = aVar2.k(intValue);
                return 0;
            case 11:
                an5Var.f451684p = aVar2.k(intValue);
                return 0;
            case 12:
                an5Var.f451685q = aVar2.k(intValue);
                return 0;
            case 13:
                an5Var.f451686r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
