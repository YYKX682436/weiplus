package r45;

/* loaded from: classes9.dex */
public class i extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f458115d;

    /* renamed from: e, reason: collision with root package name */
    public long f458116e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458117f;

    /* renamed from: h, reason: collision with root package name */
    public int f458119h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f458120i;

    /* renamed from: m, reason: collision with root package name */
    public r45.r1 f458121m;

    /* renamed from: n, reason: collision with root package name */
    public long f458122n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f458123o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f458124p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f458125q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f458126r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f458127s;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f458118g = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public java.util.LinkedList f458128t = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i)) {
            return false;
        }
        r45.i iVar = (r45.i) fVar;
        return n51.f.a(this.f76494x2de60e5e, iVar.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f458115d), java.lang.Integer.valueOf(iVar.f458115d)) && n51.f.a(java.lang.Long.valueOf(this.f458116e), java.lang.Long.valueOf(iVar.f458116e)) && n51.f.a(this.f458117f, iVar.f458117f) && n51.f.a(this.f458118g, iVar.f458118g) && n51.f.a(java.lang.Integer.valueOf(this.f458119h), java.lang.Integer.valueOf(iVar.f458119h)) && n51.f.a(this.f458120i, iVar.f458120i) && n51.f.a(this.f458121m, iVar.f458121m) && n51.f.a(java.lang.Long.valueOf(this.f458122n), java.lang.Long.valueOf(iVar.f458122n)) && n51.f.a(this.f458123o, iVar.f458123o) && n51.f.a(this.f458124p, iVar.f458124p) && n51.f.a(this.f458125q, iVar.f458125q) && n51.f.a(this.f458126r, iVar.f458126r) && n51.f.a(java.lang.Boolean.valueOf(this.f458127s), java.lang.Boolean.valueOf(iVar.f458127s)) && n51.f.a(this.f458128t, iVar.f458128t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f458115d);
            fVar.h(3, this.f458116e);
            java.lang.String str = this.f458117f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.g(5, 1, this.f458118g);
            fVar.e(6, this.f458119h);
            java.lang.String str2 = this.f458120i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            r45.r1 r1Var = this.f458121m;
            if (r1Var != null) {
                fVar.i(8, r1Var.mo75928xcd1e8d8());
                this.f458121m.mo75956x3d5d1f78(fVar);
            }
            fVar.h(9, this.f458122n);
            java.lang.String str3 = this.f458123o;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            java.lang.String str4 = this.f458124p;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f458125q;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            java.lang.String str6 = this.f458126r;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            fVar.a(14, this.f458127s);
            fVar.g(15, 8, this.f458128t);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f458115d) + b36.f.h(3, this.f458116e);
            java.lang.String str7 = this.f458117f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            int g17 = i18 + b36.f.g(5, 1, this.f458118g) + b36.f.e(6, this.f458119h);
            java.lang.String str8 = this.f458120i;
            if (str8 != null) {
                g17 += b36.f.j(7, str8);
            }
            r45.r1 r1Var2 = this.f458121m;
            if (r1Var2 != null) {
                g17 += b36.f.i(8, r1Var2.mo75928xcd1e8d8());
            }
            int h17 = g17 + b36.f.h(9, this.f458122n);
            java.lang.String str9 = this.f458123o;
            if (str9 != null) {
                h17 += b36.f.j(10, str9);
            }
            java.lang.String str10 = this.f458124p;
            if (str10 != null) {
                h17 += b36.f.j(11, str10);
            }
            java.lang.String str11 = this.f458125q;
            if (str11 != null) {
                h17 += b36.f.j(12, str11);
            }
            java.lang.String str12 = this.f458126r;
            if (str12 != null) {
                h17 += b36.f.j(13, str12);
            }
            return h17 + b36.f.a(14, this.f458127s) + b36.f.g(15, 8, this.f458128t);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f458118g.clear();
            this.f458128t.clear();
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
        r45.i iVar = (r45.i) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    iVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                iVar.f458115d = aVar2.g(intValue);
                return 0;
            case 3:
                iVar.f458116e = aVar2.i(intValue);
                return 0;
            case 4:
                iVar.f458117f = aVar2.k(intValue);
                return 0;
            case 5:
                iVar.f458118g.add(aVar2.k(intValue));
                return 0;
            case 6:
                iVar.f458119h = aVar2.g(intValue);
                return 0;
            case 7:
                iVar.f458120i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.r1 r1Var3 = new r45.r1();
                    if (bArr3 != null && bArr3.length > 0) {
                        r1Var3.mo11468x92b714fd(bArr3);
                    }
                    iVar.f458121m = r1Var3;
                }
                return 0;
            case 9:
                iVar.f458122n = aVar2.i(intValue);
                return 0;
            case 10:
                iVar.f458123o = aVar2.k(intValue);
                return 0;
            case 11:
                iVar.f458124p = aVar2.k(intValue);
                return 0;
            case 12:
                iVar.f458125q = aVar2.k(intValue);
                return 0;
            case 13:
                iVar.f458126r = aVar2.k(intValue);
                return 0;
            case 14:
                iVar.f458127s = aVar2.c(intValue);
                return 0;
            case 15:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.bc6 bc6Var = new r45.bc6();
                    if (bArr4 != null && bArr4.length > 0) {
                        bc6Var.mo11468x92b714fd(bArr4);
                    }
                    iVar.f458128t.add(bc6Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
