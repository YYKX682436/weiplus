package r45;

/* loaded from: classes2.dex */
public class dr0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454223d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454224e;

    /* renamed from: f, reason: collision with root package name */
    public long f454225f;

    /* renamed from: g, reason: collision with root package name */
    public float f454226g;

    /* renamed from: h, reason: collision with root package name */
    public float f454227h;

    /* renamed from: i, reason: collision with root package name */
    public int f454228i;

    /* renamed from: m, reason: collision with root package name */
    public int f454229m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f454230n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f454231o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dr0)) {
            return false;
        }
        r45.dr0 dr0Var = (r45.dr0) fVar;
        return n51.f.a(this.f454223d, dr0Var.f454223d) && n51.f.a(this.f454224e, dr0Var.f454224e) && n51.f.a(java.lang.Long.valueOf(this.f454225f), java.lang.Long.valueOf(dr0Var.f454225f)) && n51.f.a(java.lang.Float.valueOf(this.f454226g), java.lang.Float.valueOf(dr0Var.f454226g)) && n51.f.a(java.lang.Float.valueOf(this.f454227h), java.lang.Float.valueOf(dr0Var.f454227h)) && n51.f.a(java.lang.Integer.valueOf(this.f454228i), java.lang.Integer.valueOf(dr0Var.f454228i)) && n51.f.a(java.lang.Integer.valueOf(this.f454229m), java.lang.Integer.valueOf(dr0Var.f454229m)) && n51.f.a(this.f454230n, dr0Var.f454230n) && n51.f.a(this.f454231o, dr0Var.f454231o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f454223d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f454224e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f454225f);
            fVar.d(4, this.f454226g);
            fVar.d(5, this.f454227h);
            fVar.e(6, this.f454228i);
            fVar.e(7, this.f454229m);
            java.lang.String str3 = this.f454230n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f454231o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f454223d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f454224e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int h17 = j17 + b36.f.h(3, this.f454225f) + b36.f.d(4, this.f454226g) + b36.f.d(5, this.f454227h) + b36.f.e(6, this.f454228i) + b36.f.e(7, this.f454229m);
            java.lang.String str7 = this.f454230n;
            if (str7 != null) {
                h17 += b36.f.j(8, str7);
            }
            java.lang.String str8 = this.f454231o;
            return str8 != null ? h17 + b36.f.j(9, str8) : h17;
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
        r45.dr0 dr0Var = (r45.dr0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dr0Var.f454223d = aVar2.k(intValue);
                return 0;
            case 2:
                dr0Var.f454224e = aVar2.k(intValue);
                return 0;
            case 3:
                dr0Var.f454225f = aVar2.i(intValue);
                return 0;
            case 4:
                dr0Var.f454226g = aVar2.f(intValue);
                return 0;
            case 5:
                dr0Var.f454227h = aVar2.f(intValue);
                return 0;
            case 6:
                dr0Var.f454228i = aVar2.g(intValue);
                return 0;
            case 7:
                dr0Var.f454229m = aVar2.g(intValue);
                return 0;
            case 8:
                dr0Var.f454230n = aVar2.k(intValue);
                return 0;
            case 9:
                dr0Var.f454231o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
