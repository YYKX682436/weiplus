package r45;

/* loaded from: classes9.dex */
public class q93 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f465302d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465303e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465304f;

    /* renamed from: g, reason: collision with root package name */
    public int f465305g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465306h;

    /* renamed from: i, reason: collision with root package name */
    public int f465307i;

    /* renamed from: m, reason: collision with root package name */
    public int f465308m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f465309n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f465310o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f465311p;

    /* renamed from: q, reason: collision with root package name */
    public int f465312q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f465313r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q93)) {
            return false;
        }
        r45.q93 q93Var = (r45.q93) fVar;
        return n51.f.a(this.f76494x2de60e5e, q93Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f465302d), java.lang.Integer.valueOf(q93Var.f465302d)) && n51.f.a(this.f465303e, q93Var.f465303e) && n51.f.a(this.f465304f, q93Var.f465304f) && n51.f.a(java.lang.Integer.valueOf(this.f465305g), java.lang.Integer.valueOf(q93Var.f465305g)) && n51.f.a(this.f465306h, q93Var.f465306h) && n51.f.a(java.lang.Integer.valueOf(this.f465307i), java.lang.Integer.valueOf(q93Var.f465307i)) && n51.f.a(java.lang.Integer.valueOf(this.f465308m), java.lang.Integer.valueOf(q93Var.f465308m)) && n51.f.a(this.f465309n, q93Var.f465309n) && n51.f.a(this.f465310o, q93Var.f465310o) && n51.f.a(this.f465311p, q93Var.f465311p) && n51.f.a(java.lang.Integer.valueOf(this.f465312q), java.lang.Integer.valueOf(q93Var.f465312q)) && n51.f.a(this.f465313r, q93Var.f465313r);
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
            fVar.e(2, this.f465302d);
            java.lang.String str = this.f465303e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f465304f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f465305g);
            java.lang.String str3 = this.f465306h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f465307i);
            fVar.e(8, this.f465308m);
            java.lang.String str4 = this.f465309n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f465310o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f465311p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            fVar.e(12, this.f465312q);
            java.lang.String str7 = this.f465313r;
            if (str7 == null) {
                return 0;
            }
            fVar.j(13, str7);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f465302d);
            java.lang.String str8 = this.f465303e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f465304f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            int e17 = i18 + b36.f.e(5, this.f465305g);
            java.lang.String str10 = this.f465306h;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            int e18 = e17 + b36.f.e(7, this.f465307i) + b36.f.e(8, this.f465308m);
            java.lang.String str11 = this.f465309n;
            if (str11 != null) {
                e18 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f465310o;
            if (str12 != null) {
                e18 += b36.f.j(10, str12);
            }
            java.lang.String str13 = this.f465311p;
            if (str13 != null) {
                e18 += b36.f.j(11, str13);
            }
            int e19 = e18 + b36.f.e(12, this.f465312q);
            java.lang.String str14 = this.f465313r;
            return str14 != null ? e19 + b36.f.j(13, str14) : e19;
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
        r45.q93 q93Var = (r45.q93) objArr[1];
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
                    q93Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                q93Var.f465302d = aVar2.g(intValue);
                return 0;
            case 3:
                q93Var.f465303e = aVar2.k(intValue);
                return 0;
            case 4:
                q93Var.f465304f = aVar2.k(intValue);
                return 0;
            case 5:
                q93Var.f465305g = aVar2.g(intValue);
                return 0;
            case 6:
                q93Var.f465306h = aVar2.k(intValue);
                return 0;
            case 7:
                q93Var.f465307i = aVar2.g(intValue);
                return 0;
            case 8:
                q93Var.f465308m = aVar2.g(intValue);
                return 0;
            case 9:
                q93Var.f465309n = aVar2.k(intValue);
                return 0;
            case 10:
                q93Var.f465310o = aVar2.k(intValue);
                return 0;
            case 11:
                q93Var.f465311p = aVar2.k(intValue);
                return 0;
            case 12:
                q93Var.f465312q = aVar2.g(intValue);
                return 0;
            case 13:
                q93Var.f465313r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
