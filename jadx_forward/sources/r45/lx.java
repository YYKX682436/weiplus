package r45;

/* loaded from: classes9.dex */
public class lx extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f461436d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461437e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461438f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f461439g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461440h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461441i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f461442m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f461443n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f461444o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f461445p;

    /* renamed from: q, reason: collision with root package name */
    public int f461446q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f461447r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f461448s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f461449t;

    /* renamed from: u, reason: collision with root package name */
    public r45.tw4 f461450u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lx)) {
            return false;
        }
        r45.lx lxVar = (r45.lx) fVar;
        return n51.f.a(this.f76492x92037252, lxVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f461436d), java.lang.Integer.valueOf(lxVar.f461436d)) && n51.f.a(this.f461437e, lxVar.f461437e) && n51.f.a(this.f461438f, lxVar.f461438f) && n51.f.a(this.f461439g, lxVar.f461439g) && n51.f.a(this.f461440h, lxVar.f461440h) && n51.f.a(this.f461441i, lxVar.f461441i) && n51.f.a(this.f461442m, lxVar.f461442m) && n51.f.a(this.f461443n, lxVar.f461443n) && n51.f.a(this.f461444o, lxVar.f461444o) && n51.f.a(this.f461445p, lxVar.f461445p) && n51.f.a(java.lang.Integer.valueOf(this.f461446q), java.lang.Integer.valueOf(lxVar.f461446q)) && n51.f.a(this.f461447r, lxVar.f461447r) && n51.f.a(this.f461448s, lxVar.f461448s) && n51.f.a(this.f461449t, lxVar.f461449t) && n51.f.a(this.f461450u, lxVar.f461450u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461439g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f461436d);
            java.lang.String str = this.f461437e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f461438f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.g(5, 2, linkedList);
            java.lang.String str3 = this.f461440h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f461441i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f461442m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f461443n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f461444o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f461445p;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            fVar.e(12, this.f461446q);
            java.lang.String str9 = this.f461447r;
            if (str9 != null) {
                fVar.j(13, str9);
            }
            java.lang.String str10 = this.f461448s;
            if (str10 != null) {
                fVar.j(14, str10);
            }
            java.lang.String str11 = this.f461449t;
            if (str11 != null) {
                fVar.j(15, str11);
            }
            r45.tw4 tw4Var = this.f461450u;
            if (tw4Var != null) {
                fVar.i(16, tw4Var.mo75928xcd1e8d8());
                this.f461450u.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f461436d);
            java.lang.String str12 = this.f461437e;
            if (str12 != null) {
                i18 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f461438f;
            if (str13 != null) {
                i18 += b36.f.j(4, str13);
            }
            int g17 = i18 + b36.f.g(5, 2, linkedList);
            java.lang.String str14 = this.f461440h;
            if (str14 != null) {
                g17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f461441i;
            if (str15 != null) {
                g17 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f461442m;
            if (str16 != null) {
                g17 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.f461443n;
            if (str17 != null) {
                g17 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.f461444o;
            if (str18 != null) {
                g17 += b36.f.j(10, str18);
            }
            java.lang.String str19 = this.f461445p;
            if (str19 != null) {
                g17 += b36.f.j(11, str19);
            }
            int e17 = g17 + b36.f.e(12, this.f461446q);
            java.lang.String str20 = this.f461447r;
            if (str20 != null) {
                e17 += b36.f.j(13, str20);
            }
            java.lang.String str21 = this.f461448s;
            if (str21 != null) {
                e17 += b36.f.j(14, str21);
            }
            java.lang.String str22 = this.f461449t;
            if (str22 != null) {
                e17 += b36.f.j(15, str22);
            }
            r45.tw4 tw4Var2 = this.f461450u;
            return tw4Var2 != null ? e17 + b36.f.i(16, tw4Var2.mo75928xcd1e8d8()) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.lx lxVar = (r45.lx) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    lxVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                lxVar.f461436d = aVar2.g(intValue);
                return 0;
            case 3:
                lxVar.f461437e = aVar2.k(intValue);
                return 0;
            case 4:
                lxVar.f461438f = aVar2.k(intValue);
                return 0;
            case 5:
                lxVar.f461439g.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 6:
                lxVar.f461440h = aVar2.k(intValue);
                return 0;
            case 7:
                lxVar.f461441i = aVar2.k(intValue);
                return 0;
            case 8:
                lxVar.f461442m = aVar2.k(intValue);
                return 0;
            case 9:
                lxVar.f461443n = aVar2.k(intValue);
                return 0;
            case 10:
                lxVar.f461444o = aVar2.k(intValue);
                return 0;
            case 11:
                lxVar.f461445p = aVar2.k(intValue);
                return 0;
            case 12:
                lxVar.f461446q = aVar2.g(intValue);
                return 0;
            case 13:
                lxVar.f461447r = aVar2.k(intValue);
                return 0;
            case 14:
                lxVar.f461448s = aVar2.k(intValue);
                return 0;
            case 15:
                lxVar.f461449t = aVar2.k(intValue);
                return 0;
            case 16:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.tw4 tw4Var3 = new r45.tw4();
                    if (bArr3 != null && bArr3.length > 0) {
                        tw4Var3.mo11468x92b714fd(bArr3);
                    }
                    lxVar.f461450u = tw4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
