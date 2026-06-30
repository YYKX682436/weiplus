package r45;

/* loaded from: classes4.dex */
public class kk5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f460314d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460315e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460316f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460317g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f460318h;

    /* renamed from: i, reason: collision with root package name */
    public int f460319i;

    /* renamed from: m, reason: collision with root package name */
    public int f460320m;

    /* renamed from: n, reason: collision with root package name */
    public int f460321n;

    /* renamed from: o, reason: collision with root package name */
    public int f460322o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f460323p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f460324q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f460325r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kk5)) {
            return false;
        }
        r45.kk5 kk5Var = (r45.kk5) fVar;
        return n51.f.a(this.f76492x92037252, kk5Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f460314d), java.lang.Integer.valueOf(kk5Var.f460314d)) && n51.f.a(this.f460315e, kk5Var.f460315e) && n51.f.a(this.f460316f, kk5Var.f460316f) && n51.f.a(this.f460317g, kk5Var.f460317g) && n51.f.a(this.f460318h, kk5Var.f460318h) && n51.f.a(java.lang.Integer.valueOf(this.f460319i), java.lang.Integer.valueOf(kk5Var.f460319i)) && n51.f.a(java.lang.Integer.valueOf(this.f460320m), java.lang.Integer.valueOf(kk5Var.f460320m)) && n51.f.a(java.lang.Integer.valueOf(this.f460321n), java.lang.Integer.valueOf(kk5Var.f460321n)) && n51.f.a(java.lang.Integer.valueOf(this.f460322o), java.lang.Integer.valueOf(kk5Var.f460322o)) && n51.f.a(this.f460323p, kk5Var.f460323p) && n51.f.a(this.f460324q, kk5Var.f460324q) && n51.f.a(this.f460325r, kk5Var.f460325r);
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
            fVar.e(2, this.f460314d);
            java.lang.String str = this.f460315e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f460316f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f460317g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f460318h;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            fVar.e(7, this.f460319i);
            fVar.e(8, this.f460320m);
            fVar.e(9, this.f460321n);
            fVar.e(10, this.f460322o);
            java.lang.String str4 = this.f460323p;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f460324q;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            java.lang.String str6 = this.f460325r;
            if (str6 == null) {
                return 0;
            }
            fVar.j(13, str6);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f460314d);
            java.lang.String str7 = this.f460315e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f460316f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f460317g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f460318h;
            if (gVar2 != null) {
                i18 += b36.f.b(6, gVar2);
            }
            int e17 = i18 + b36.f.e(7, this.f460319i) + b36.f.e(8, this.f460320m) + b36.f.e(9, this.f460321n) + b36.f.e(10, this.f460322o);
            java.lang.String str10 = this.f460323p;
            if (str10 != null) {
                e17 += b36.f.j(11, str10);
            }
            java.lang.String str11 = this.f460324q;
            if (str11 != null) {
                e17 += b36.f.j(12, str11);
            }
            java.lang.String str12 = this.f460325r;
            return str12 != null ? e17 + b36.f.j(13, str12) : e17;
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
        r45.kk5 kk5Var = (r45.kk5) objArr[1];
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
                    kk5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                kk5Var.f460314d = aVar2.g(intValue);
                return 0;
            case 3:
                kk5Var.f460315e = aVar2.k(intValue);
                return 0;
            case 4:
                kk5Var.f460316f = aVar2.k(intValue);
                return 0;
            case 5:
                kk5Var.f460317g = aVar2.k(intValue);
                return 0;
            case 6:
                kk5Var.f460318h = aVar2.d(intValue);
                return 0;
            case 7:
                kk5Var.f460319i = aVar2.g(intValue);
                return 0;
            case 8:
                kk5Var.f460320m = aVar2.g(intValue);
                return 0;
            case 9:
                kk5Var.f460321n = aVar2.g(intValue);
                return 0;
            case 10:
                kk5Var.f460322o = aVar2.g(intValue);
                return 0;
            case 11:
                kk5Var.f460323p = aVar2.k(intValue);
                return 0;
            case 12:
                kk5Var.f460324q = aVar2.k(intValue);
                return 0;
            case 13:
                kk5Var.f460325r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
