package r45;

/* loaded from: classes4.dex */
public class e93 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f454685d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454686e;

    /* renamed from: f, reason: collision with root package name */
    public int f454687f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454688g;

    /* renamed from: h, reason: collision with root package name */
    public int f454689h;

    /* renamed from: i, reason: collision with root package name */
    public int f454690i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f454691m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f454692n;

    /* renamed from: o, reason: collision with root package name */
    public int f454693o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f454694p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e93)) {
            return false;
        }
        r45.e93 e93Var = (r45.e93) fVar;
        return n51.f.a(this.f76494x2de60e5e, e93Var.f76494x2de60e5e) && n51.f.a(java.lang.Long.valueOf(this.f454685d), java.lang.Long.valueOf(e93Var.f454685d)) && n51.f.a(this.f454686e, e93Var.f454686e) && n51.f.a(java.lang.Integer.valueOf(this.f454687f), java.lang.Integer.valueOf(e93Var.f454687f)) && n51.f.a(this.f454688g, e93Var.f454688g) && n51.f.a(java.lang.Integer.valueOf(this.f454689h), java.lang.Integer.valueOf(e93Var.f454689h)) && n51.f.a(java.lang.Integer.valueOf(this.f454690i), java.lang.Integer.valueOf(e93Var.f454690i)) && n51.f.a(this.f454691m, e93Var.f454691m) && n51.f.a(this.f454692n, e93Var.f454692n) && n51.f.a(java.lang.Integer.valueOf(this.f454693o), java.lang.Integer.valueOf(e93Var.f454693o)) && n51.f.a(this.f454694p, e93Var.f454694p);
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
            fVar.h(2, this.f454685d);
            java.lang.String str = this.f454686e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f454687f);
            java.lang.String str2 = this.f454688g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f454689h);
            fVar.e(7, this.f454690i);
            java.lang.String str3 = this.f454691m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f454692n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.e(10, this.f454693o);
            java.lang.String str5 = this.f454694p;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.h(2, this.f454685d);
            java.lang.String str6 = this.f454686e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            int e17 = i18 + b36.f.e(4, this.f454687f);
            java.lang.String str7 = this.f454688g;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            int e18 = e17 + b36.f.e(6, this.f454689h) + b36.f.e(7, this.f454690i);
            java.lang.String str8 = this.f454691m;
            if (str8 != null) {
                e18 += b36.f.j(8, str8);
            }
            java.lang.String str9 = this.f454692n;
            if (str9 != null) {
                e18 += b36.f.j(9, str9);
            }
            int e19 = e18 + b36.f.e(10, this.f454693o);
            java.lang.String str10 = this.f454694p;
            return str10 != null ? e19 + b36.f.j(11, str10) : e19;
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
        r45.e93 e93Var = (r45.e93) objArr[1];
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
                    e93Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                e93Var.f454685d = aVar2.i(intValue);
                return 0;
            case 3:
                e93Var.f454686e = aVar2.k(intValue);
                return 0;
            case 4:
                e93Var.f454687f = aVar2.g(intValue);
                return 0;
            case 5:
                e93Var.f454688g = aVar2.k(intValue);
                return 0;
            case 6:
                e93Var.f454689h = aVar2.g(intValue);
                return 0;
            case 7:
                e93Var.f454690i = aVar2.g(intValue);
                return 0;
            case 8:
                e93Var.f454691m = aVar2.k(intValue);
                return 0;
            case 9:
                e93Var.f454692n = aVar2.k(intValue);
                return 0;
            case 10:
                e93Var.f454693o = aVar2.g(intValue);
                return 0;
            case 11:
                e93Var.f454694p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
