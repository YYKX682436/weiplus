package r45;

/* loaded from: classes4.dex */
public class qd6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f465398d;

    /* renamed from: e, reason: collision with root package name */
    public int f465399e;

    /* renamed from: f, reason: collision with root package name */
    public int f465400f;

    /* renamed from: g, reason: collision with root package name */
    public long f465401g;

    /* renamed from: h, reason: collision with root package name */
    public int f465402h;

    /* renamed from: i, reason: collision with root package name */
    public int f465403i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f465404m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f465405n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f465406o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f465407p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qd6)) {
            return false;
        }
        r45.qd6 qd6Var = (r45.qd6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f465398d), java.lang.Integer.valueOf(qd6Var.f465398d)) && n51.f.a(java.lang.Integer.valueOf(this.f465399e), java.lang.Integer.valueOf(qd6Var.f465399e)) && n51.f.a(java.lang.Integer.valueOf(this.f465400f), java.lang.Integer.valueOf(qd6Var.f465400f)) && n51.f.a(java.lang.Long.valueOf(this.f465401g), java.lang.Long.valueOf(qd6Var.f465401g)) && n51.f.a(java.lang.Integer.valueOf(this.f465402h), java.lang.Integer.valueOf(qd6Var.f465402h)) && n51.f.a(java.lang.Integer.valueOf(this.f465403i), java.lang.Integer.valueOf(qd6Var.f465403i)) && n51.f.a(this.f465404m, qd6Var.f465404m) && n51.f.a(this.f465405n, qd6Var.f465405n) && n51.f.a(this.f465406o, qd6Var.f465406o) && n51.f.a(this.f465407p, qd6Var.f465407p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f465398d);
            fVar.e(2, this.f465399e);
            fVar.e(3, this.f465400f);
            fVar.h(4, this.f465401g);
            fVar.e(5, this.f465402h);
            fVar.e(6, this.f465403i);
            java.lang.String str = this.f465404m;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.f465405n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            java.lang.String str3 = this.f465406o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            java.lang.String str4 = this.f465407p;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f465398d) + 0 + b36.f.e(2, this.f465399e) + b36.f.e(3, this.f465400f) + b36.f.h(4, this.f465401g) + b36.f.e(5, this.f465402h) + b36.f.e(6, this.f465403i);
            java.lang.String str5 = this.f465404m;
            if (str5 != null) {
                e17 += b36.f.j(7, str5);
            }
            java.lang.String str6 = this.f465405n;
            if (str6 != null) {
                e17 += b36.f.j(8, str6);
            }
            java.lang.String str7 = this.f465406o;
            if (str7 != null) {
                e17 += b36.f.j(9, str7);
            }
            java.lang.String str8 = this.f465407p;
            return str8 != null ? e17 + b36.f.j(10, str8) : e17;
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
        r45.qd6 qd6Var = (r45.qd6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qd6Var.f465398d = aVar2.g(intValue);
                return 0;
            case 2:
                qd6Var.f465399e = aVar2.g(intValue);
                return 0;
            case 3:
                qd6Var.f465400f = aVar2.g(intValue);
                return 0;
            case 4:
                qd6Var.f465401g = aVar2.i(intValue);
                return 0;
            case 5:
                qd6Var.f465402h = aVar2.g(intValue);
                return 0;
            case 6:
                qd6Var.f465403i = aVar2.g(intValue);
                return 0;
            case 7:
                qd6Var.f465404m = aVar2.k(intValue);
                return 0;
            case 8:
                qd6Var.f465405n = aVar2.k(intValue);
                return 0;
            case 9:
                qd6Var.f465406o = aVar2.k(intValue);
                return 0;
            case 10:
                qd6Var.f465407p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
