package r45;

/* loaded from: classes9.dex */
public class al4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f451626d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451627e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451628f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451629g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f451630h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f451631i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f451632m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f451633n;

    /* renamed from: o, reason: collision with root package name */
    public r45.g04 f451634o;

    /* renamed from: p, reason: collision with root package name */
    public int f451635p;

    /* renamed from: q, reason: collision with root package name */
    public long f451636q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f451637r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f451638s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f451639t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f451640u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f451641v;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.al4)) {
            return false;
        }
        r45.al4 al4Var = (r45.al4) fVar;
        return n51.f.a(this.f76492x92037252, al4Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f451626d), java.lang.Integer.valueOf(al4Var.f451626d)) && n51.f.a(this.f451627e, al4Var.f451627e) && n51.f.a(this.f451628f, al4Var.f451628f) && n51.f.a(this.f451629g, al4Var.f451629g) && n51.f.a(this.f451630h, al4Var.f451630h) && n51.f.a(this.f451631i, al4Var.f451631i) && n51.f.a(this.f451632m, al4Var.f451632m) && n51.f.a(this.f451633n, al4Var.f451633n) && n51.f.a(this.f451634o, al4Var.f451634o) && n51.f.a(java.lang.Integer.valueOf(this.f451635p), java.lang.Integer.valueOf(al4Var.f451635p)) && n51.f.a(java.lang.Long.valueOf(this.f451636q), java.lang.Long.valueOf(al4Var.f451636q)) && n51.f.a(this.f451637r, al4Var.f451637r) && n51.f.a(java.lang.Boolean.valueOf(this.f451638s), java.lang.Boolean.valueOf(al4Var.f451638s)) && n51.f.a(this.f451639t, al4Var.f451639t) && n51.f.a(java.lang.Boolean.valueOf(this.f451640u), java.lang.Boolean.valueOf(al4Var.f451640u)) && n51.f.a(this.f451641v, al4Var.f451641v);
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
            fVar.e(2, this.f451626d);
            java.lang.String str = this.f451627e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f451628f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f451629g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f451630h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f451631i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f451632m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f451633n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            r45.g04 g04Var = this.f451634o;
            if (g04Var != null) {
                fVar.i(10, g04Var.mo75928xcd1e8d8());
                this.f451634o.mo75956x3d5d1f78(fVar);
            }
            fVar.e(11, this.f451635p);
            fVar.h(12, this.f451636q);
            java.lang.String str8 = this.f451637r;
            if (str8 != null) {
                fVar.j(13, str8);
            }
            fVar.a(14, this.f451638s);
            java.lang.String str9 = this.f451639t;
            if (str9 != null) {
                fVar.j(15, str9);
            }
            fVar.a(16, this.f451640u);
            java.lang.String str10 = this.f451641v;
            if (str10 != null) {
                fVar.j(17, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f451626d);
            java.lang.String str11 = this.f451627e;
            if (str11 != null) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f451628f;
            if (str12 != null) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f451629g;
            if (str13 != null) {
                i18 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f451630h;
            if (str14 != null) {
                i18 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f451631i;
            if (str15 != null) {
                i18 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f451632m;
            if (str16 != null) {
                i18 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.f451633n;
            if (str17 != null) {
                i18 += b36.f.j(9, str17);
            }
            r45.g04 g04Var2 = this.f451634o;
            if (g04Var2 != null) {
                i18 += b36.f.i(10, g04Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(11, this.f451635p) + b36.f.h(12, this.f451636q);
            java.lang.String str18 = this.f451637r;
            if (str18 != null) {
                e17 += b36.f.j(13, str18);
            }
            int a17 = e17 + b36.f.a(14, this.f451638s);
            java.lang.String str19 = this.f451639t;
            if (str19 != null) {
                a17 += b36.f.j(15, str19);
            }
            int a18 = a17 + b36.f.a(16, this.f451640u);
            java.lang.String str20 = this.f451641v;
            return str20 != null ? a18 + b36.f.j(17, str20) : a18;
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
        r45.al4 al4Var = (r45.al4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    al4Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                al4Var.f451626d = aVar2.g(intValue);
                return 0;
            case 3:
                al4Var.f451627e = aVar2.k(intValue);
                return 0;
            case 4:
                al4Var.f451628f = aVar2.k(intValue);
                return 0;
            case 5:
                al4Var.f451629g = aVar2.k(intValue);
                return 0;
            case 6:
                al4Var.f451630h = aVar2.k(intValue);
                return 0;
            case 7:
                al4Var.f451631i = aVar2.k(intValue);
                return 0;
            case 8:
                al4Var.f451632m = aVar2.k(intValue);
                return 0;
            case 9:
                al4Var.f451633n = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.g04 g04Var3 = new r45.g04();
                    if (bArr2 != null && bArr2.length > 0) {
                        g04Var3.mo11468x92b714fd(bArr2);
                    }
                    al4Var.f451634o = g04Var3;
                }
                return 0;
            case 11:
                al4Var.f451635p = aVar2.g(intValue);
                return 0;
            case 12:
                al4Var.f451636q = aVar2.i(intValue);
                return 0;
            case 13:
                al4Var.f451637r = aVar2.k(intValue);
                return 0;
            case 14:
                al4Var.f451638s = aVar2.c(intValue);
                return 0;
            case 15:
                al4Var.f451639t = aVar2.k(intValue);
                return 0;
            case 16:
                al4Var.f451640u = aVar2.c(intValue);
                return 0;
            case 17:
                al4Var.f451641v = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
