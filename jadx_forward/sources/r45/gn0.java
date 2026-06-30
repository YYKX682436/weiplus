package r45;

/* loaded from: classes7.dex */
public class gn0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456902d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456903e;

    /* renamed from: f, reason: collision with root package name */
    public int f456904f;

    /* renamed from: g, reason: collision with root package name */
    public int f456905g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456906h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f456907i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f456908m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f456909n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f456910o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gn0)) {
            return false;
        }
        r45.gn0 gn0Var = (r45.gn0) fVar;
        return n51.f.a(this.f76494x2de60e5e, gn0Var.f76494x2de60e5e) && n51.f.a(this.f456902d, gn0Var.f456902d) && n51.f.a(this.f456903e, gn0Var.f456903e) && n51.f.a(java.lang.Integer.valueOf(this.f456904f), java.lang.Integer.valueOf(gn0Var.f456904f)) && n51.f.a(java.lang.Integer.valueOf(this.f456905g), java.lang.Integer.valueOf(gn0Var.f456905g)) && n51.f.a(this.f456906h, gn0Var.f456906h) && n51.f.a(this.f456907i, gn0Var.f456907i) && n51.f.a(this.f456908m, gn0Var.f456908m) && n51.f.a(this.f456909n, gn0Var.f456909n) && n51.f.a(this.f456910o, gn0Var.f456910o);
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
            java.lang.String str = this.f456902d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f456903e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f456904f);
            fVar.e(5, this.f456905g);
            java.lang.String str3 = this.f456906h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f456907i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f456908m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f456909n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f456910o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str8 = this.f456902d;
            if (str8 != null) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f456903e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            int e17 = i18 + b36.f.e(4, this.f456904f) + b36.f.e(5, this.f456905g);
            java.lang.String str10 = this.f456906h;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f456907i;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f456908m;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f456909n;
            if (str13 != null) {
                e17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f456910o;
            return str14 != null ? e17 + b36.f.j(10, str14) : e17;
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
        r45.gn0 gn0Var = (r45.gn0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    gn0Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                gn0Var.f456902d = aVar2.k(intValue);
                return 0;
            case 3:
                gn0Var.f456903e = aVar2.k(intValue);
                return 0;
            case 4:
                gn0Var.f456904f = aVar2.g(intValue);
                return 0;
            case 5:
                gn0Var.f456905g = aVar2.g(intValue);
                return 0;
            case 6:
                gn0Var.f456906h = aVar2.k(intValue);
                return 0;
            case 7:
                gn0Var.f456907i = aVar2.k(intValue);
                return 0;
            case 8:
                gn0Var.f456908m = aVar2.k(intValue);
                return 0;
            case 9:
                gn0Var.f456909n = aVar2.k(intValue);
                return 0;
            case 10:
                gn0Var.f456910o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
