package r45;

/* loaded from: classes2.dex */
public class ha6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457515d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f457516e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457517f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457518g;

    /* renamed from: h, reason: collision with root package name */
    public int f457519h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f457520i;

    /* renamed from: m, reason: collision with root package name */
    public int f457521m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f457522n;

    /* renamed from: o, reason: collision with root package name */
    public int f457523o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ha6)) {
            return false;
        }
        r45.ha6 ha6Var = (r45.ha6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457515d), java.lang.Integer.valueOf(ha6Var.f457515d)) && n51.f.a(java.lang.Boolean.valueOf(this.f457516e), java.lang.Boolean.valueOf(ha6Var.f457516e)) && n51.f.a(this.f457517f, ha6Var.f457517f) && n51.f.a(this.f457518g, ha6Var.f457518g) && n51.f.a(java.lang.Integer.valueOf(this.f457519h), java.lang.Integer.valueOf(ha6Var.f457519h)) && n51.f.a(this.f457520i, ha6Var.f457520i) && n51.f.a(java.lang.Integer.valueOf(this.f457521m), java.lang.Integer.valueOf(ha6Var.f457521m)) && n51.f.a(this.f457522n, ha6Var.f457522n) && n51.f.a(java.lang.Integer.valueOf(this.f457523o), java.lang.Integer.valueOf(ha6Var.f457523o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f457515d);
            fVar.a(2, this.f457516e);
            java.lang.String str = this.f457517f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f457518g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f457519h);
            java.lang.String str3 = this.f457520i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f457521m);
            java.lang.String str4 = this.f457522n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f457523o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f457515d) + 0 + b36.f.a(2, this.f457516e);
            java.lang.String str5 = this.f457517f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f457518g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            int e18 = e17 + b36.f.e(5, this.f457519h);
            java.lang.String str7 = this.f457520i;
            if (str7 != null) {
                e18 += b36.f.j(6, str7);
            }
            int e19 = e18 + b36.f.e(7, this.f457521m);
            java.lang.String str8 = this.f457522n;
            if (str8 != null) {
                e19 += b36.f.j(8, str8);
            }
            return e19 + b36.f.e(9, this.f457523o);
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
        r45.ha6 ha6Var = (r45.ha6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ha6Var.f457515d = aVar2.g(intValue);
                return 0;
            case 2:
                ha6Var.f457516e = aVar2.c(intValue);
                return 0;
            case 3:
                ha6Var.f457517f = aVar2.k(intValue);
                return 0;
            case 4:
                ha6Var.f457518g = aVar2.k(intValue);
                return 0;
            case 5:
                ha6Var.f457519h = aVar2.g(intValue);
                return 0;
            case 6:
                ha6Var.f457520i = aVar2.k(intValue);
                return 0;
            case 7:
                ha6Var.f457521m = aVar2.g(intValue);
                return 0;
            case 8:
                ha6Var.f457522n = aVar2.k(intValue);
                return 0;
            case 9:
                ha6Var.f457523o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
