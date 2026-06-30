package r45;

/* loaded from: classes7.dex */
public class m24 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461622d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f461623e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461624f;

    /* renamed from: g, reason: collision with root package name */
    public int f461625g;

    /* renamed from: h, reason: collision with root package name */
    public int f461626h;

    /* renamed from: i, reason: collision with root package name */
    public r45.nd7 f461627i;

    /* renamed from: m, reason: collision with root package name */
    public int f461628m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f461629n;

    /* renamed from: o, reason: collision with root package name */
    public int f461630o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f461631p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f461632q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m24)) {
            return false;
        }
        r45.m24 m24Var = (r45.m24) fVar;
        return n51.f.a(this.f76494x2de60e5e, m24Var.f76494x2de60e5e) && n51.f.a(this.f461622d, m24Var.f461622d) && n51.f.a(this.f461623e, m24Var.f461623e) && n51.f.a(this.f461624f, m24Var.f461624f) && n51.f.a(java.lang.Integer.valueOf(this.f461625g), java.lang.Integer.valueOf(m24Var.f461625g)) && n51.f.a(java.lang.Integer.valueOf(this.f461626h), java.lang.Integer.valueOf(m24Var.f461626h)) && n51.f.a(this.f461627i, m24Var.f461627i) && n51.f.a(java.lang.Integer.valueOf(this.f461628m), java.lang.Integer.valueOf(m24Var.f461628m)) && n51.f.a(this.f461629n, m24Var.f461629n) && n51.f.a(java.lang.Integer.valueOf(this.f461630o), java.lang.Integer.valueOf(m24Var.f461630o)) && n51.f.a(java.lang.Boolean.valueOf(this.f461631p), java.lang.Boolean.valueOf(m24Var.f461631p)) && n51.f.a(java.lang.Boolean.valueOf(this.f461632q), java.lang.Boolean.valueOf(m24Var.f461632q));
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
            java.lang.String str = this.f461622d;
            if (str != null) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f461623e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            java.lang.String str2 = this.f461624f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f461625g);
            fVar.e(6, this.f461626h);
            r45.nd7 nd7Var = this.f461627i;
            if (nd7Var != null) {
                fVar.i(7, nd7Var.mo75928xcd1e8d8());
                this.f461627i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(8, this.f461628m);
            java.lang.String str3 = this.f461629n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.e(10, this.f461630o);
            fVar.a(11, this.f461631p);
            fVar.a(12, this.f461632q);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f461622d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f461623e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            java.lang.String str5 = this.f461624f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            int e17 = i18 + b36.f.e(5, this.f461625g) + b36.f.e(6, this.f461626h);
            r45.nd7 nd7Var2 = this.f461627i;
            if (nd7Var2 != null) {
                e17 += b36.f.i(7, nd7Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(8, this.f461628m);
            java.lang.String str6 = this.f461629n;
            if (str6 != null) {
                e18 += b36.f.j(9, str6);
            }
            return e18 + b36.f.e(10, this.f461630o) + b36.f.a(11, this.f461631p) + b36.f.a(12, this.f461632q);
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
        r45.m24 m24Var = (r45.m24) objArr[1];
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
                    m24Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                m24Var.f461622d = aVar2.k(intValue);
                return 0;
            case 3:
                m24Var.f461623e = aVar2.d(intValue);
                return 0;
            case 4:
                m24Var.f461624f = aVar2.k(intValue);
                return 0;
            case 5:
                m24Var.f461625g = aVar2.g(intValue);
                return 0;
            case 6:
                m24Var.f461626h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.nd7 nd7Var3 = new r45.nd7();
                    if (bArr2 != null && bArr2.length > 0) {
                        nd7Var3.mo11468x92b714fd(bArr2);
                    }
                    m24Var.f461627i = nd7Var3;
                }
                return 0;
            case 8:
                m24Var.f461628m = aVar2.g(intValue);
                return 0;
            case 9:
                m24Var.f461629n = aVar2.k(intValue);
                return 0;
            case 10:
                m24Var.f461630o = aVar2.g(intValue);
                return 0;
            case 11:
                m24Var.f461631p = aVar2.c(intValue);
                return 0;
            case 12:
                m24Var.f461632q = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
