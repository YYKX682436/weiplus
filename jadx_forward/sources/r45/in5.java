package r45;

/* loaded from: classes7.dex */
public class in5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458705d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458706e;

    /* renamed from: f, reason: collision with root package name */
    public int f458707f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f458708g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f458709h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f458710i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f458711m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f458712n;

    /* renamed from: o, reason: collision with root package name */
    public int f458713o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.in5)) {
            return false;
        }
        r45.in5 in5Var = (r45.in5) fVar;
        return n51.f.a(this.f76494x2de60e5e, in5Var.f76494x2de60e5e) && n51.f.a(this.f458705d, in5Var.f458705d) && n51.f.a(this.f458706e, in5Var.f458706e) && n51.f.a(java.lang.Integer.valueOf(this.f458707f), java.lang.Integer.valueOf(in5Var.f458707f)) && n51.f.a(this.f458708g, in5Var.f458708g) && n51.f.a(this.f458709h, in5Var.f458709h) && n51.f.a(this.f458710i, in5Var.f458710i) && n51.f.a(this.f458711m, in5Var.f458711m) && n51.f.a(this.f458712n, in5Var.f458712n) && n51.f.a(java.lang.Integer.valueOf(this.f458713o), java.lang.Integer.valueOf(in5Var.f458713o));
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
            java.lang.String str = this.f458705d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f458706e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f458707f);
            java.lang.String str3 = this.f458708g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f458709h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f458710i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f458711m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f458712n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            fVar.e(10, this.f458713o);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str8 = this.f458705d;
            if (str8 != null) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f458706e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            int e17 = i18 + b36.f.e(4, this.f458707f);
            java.lang.String str10 = this.f458708g;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f458709h;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f458710i;
            if (str12 != null) {
                e17 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f458711m;
            if (str13 != null) {
                e17 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f458712n;
            if (str14 != null) {
                e17 += b36.f.j(9, str14);
            }
            return e17 + b36.f.e(10, this.f458713o);
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
        r45.in5 in5Var = (r45.in5) objArr[1];
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
                    in5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                in5Var.f458705d = aVar2.k(intValue);
                return 0;
            case 3:
                in5Var.f458706e = aVar2.k(intValue);
                return 0;
            case 4:
                in5Var.f458707f = aVar2.g(intValue);
                return 0;
            case 5:
                in5Var.f458708g = aVar2.k(intValue);
                return 0;
            case 6:
                in5Var.f458709h = aVar2.k(intValue);
                return 0;
            case 7:
                in5Var.f458710i = aVar2.k(intValue);
                return 0;
            case 8:
                in5Var.f458711m = aVar2.k(intValue);
                return 0;
            case 9:
                in5Var.f458712n = aVar2.k(intValue);
                return 0;
            case 10:
                in5Var.f458713o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
