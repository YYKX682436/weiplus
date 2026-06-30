package r45;

/* loaded from: classes9.dex */
public class fb5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f455703d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455704e;

    /* renamed from: f, reason: collision with root package name */
    public int f455705f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f455706g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455707h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f455708i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f455709m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f455710n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f455711o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f455712p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f455713q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fb5)) {
            return false;
        }
        r45.fb5 fb5Var = (r45.fb5) fVar;
        return n51.f.a(this.f76492x92037252, fb5Var.f76492x92037252) && n51.f.a(this.f455703d, fb5Var.f455703d) && n51.f.a(this.f455704e, fb5Var.f455704e) && n51.f.a(java.lang.Integer.valueOf(this.f455705f), java.lang.Integer.valueOf(fb5Var.f455705f)) && n51.f.a(this.f455706g, fb5Var.f455706g) && n51.f.a(this.f455707h, fb5Var.f455707h) && n51.f.a(this.f455708i, fb5Var.f455708i) && n51.f.a(java.lang.Boolean.valueOf(this.f455709m), java.lang.Boolean.valueOf(fb5Var.f455709m)) && n51.f.a(this.f455710n, fb5Var.f455710n) && n51.f.a(this.f455711o, fb5Var.f455711o) && n51.f.a(this.f455712p, fb5Var.f455712p) && n51.f.a(this.f455713q, fb5Var.f455713q);
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
            java.lang.String str = this.f455703d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f455704e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f455705f);
            java.lang.String str3 = this.f455706g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f455707h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f455708i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.a(8, this.f455709m);
            java.lang.String str6 = this.f455710n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f455711o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f455712p;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f455713q;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str10 = this.f455703d;
            if (str10 != null) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f455704e;
            if (str11 != null) {
                i18 += b36.f.j(3, str11);
            }
            int e17 = i18 + b36.f.e(4, this.f455705f);
            java.lang.String str12 = this.f455706g;
            if (str12 != null) {
                e17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f455707h;
            if (str13 != null) {
                e17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f455708i;
            if (str14 != null) {
                e17 += b36.f.j(7, str14);
            }
            int a17 = e17 + b36.f.a(8, this.f455709m);
            java.lang.String str15 = this.f455710n;
            if (str15 != null) {
                a17 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f455711o;
            if (str16 != null) {
                a17 += b36.f.j(10, str16);
            }
            java.lang.String str17 = this.f455712p;
            if (str17 != null) {
                a17 += b36.f.j(11, str17);
            }
            java.lang.String str18 = this.f455713q;
            return str18 != null ? a17 + b36.f.j(12, str18) : a17;
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
        r45.fb5 fb5Var = (r45.fb5) objArr[1];
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
                    fb5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                fb5Var.f455703d = aVar2.k(intValue);
                return 0;
            case 3:
                fb5Var.f455704e = aVar2.k(intValue);
                return 0;
            case 4:
                fb5Var.f455705f = aVar2.g(intValue);
                return 0;
            case 5:
                fb5Var.f455706g = aVar2.k(intValue);
                return 0;
            case 6:
                fb5Var.f455707h = aVar2.k(intValue);
                return 0;
            case 7:
                fb5Var.f455708i = aVar2.k(intValue);
                return 0;
            case 8:
                fb5Var.f455709m = aVar2.c(intValue);
                return 0;
            case 9:
                fb5Var.f455710n = aVar2.k(intValue);
                return 0;
            case 10:
                fb5Var.f455711o = aVar2.k(intValue);
                return 0;
            case 11:
                fb5Var.f455712p = aVar2.k(intValue);
                return 0;
            case 12:
                fb5Var.f455713q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
