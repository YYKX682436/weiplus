package m53;

/* loaded from: classes2.dex */
public class s4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405586d;

    /* renamed from: e, reason: collision with root package name */
    public int f405587e;

    /* renamed from: f, reason: collision with root package name */
    public long f405588f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405589g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f405590h;

    /* renamed from: i, reason: collision with root package name */
    public int f405591i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f405592m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.s4)) {
            return false;
        }
        m53.s4 s4Var = (m53.s4) fVar;
        return n51.f.a(this.f405586d, s4Var.f405586d) && n51.f.a(java.lang.Integer.valueOf(this.f405587e), java.lang.Integer.valueOf(s4Var.f405587e)) && n51.f.a(java.lang.Long.valueOf(this.f405588f), java.lang.Long.valueOf(s4Var.f405588f)) && n51.f.a(this.f405589g, s4Var.f405589g) && n51.f.a(java.lang.Boolean.valueOf(this.f405590h), java.lang.Boolean.valueOf(s4Var.f405590h)) && n51.f.a(java.lang.Integer.valueOf(this.f405591i), java.lang.Integer.valueOf(s4Var.f405591i)) && n51.f.a(this.f405592m, s4Var.f405592m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405586d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f405587e);
            fVar.h(3, this.f405588f);
            java.lang.String str2 = this.f405589g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.a(5, this.f405590h);
            fVar.e(6, this.f405591i);
            java.lang.String str3 = this.f405592m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f405586d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f405587e) + b36.f.h(3, this.f405588f);
            java.lang.String str5 = this.f405589g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            int a17 = j17 + b36.f.a(5, this.f405590h) + b36.f.e(6, this.f405591i);
            java.lang.String str6 = this.f405592m;
            return str6 != null ? a17 + b36.f.j(7, str6) : a17;
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
        m53.s4 s4Var = (m53.s4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                s4Var.f405586d = aVar2.k(intValue);
                return 0;
            case 2:
                s4Var.f405587e = aVar2.g(intValue);
                return 0;
            case 3:
                s4Var.f405588f = aVar2.i(intValue);
                return 0;
            case 4:
                s4Var.f405589g = aVar2.k(intValue);
                return 0;
            case 5:
                s4Var.f405590h = aVar2.c(intValue);
                return 0;
            case 6:
                s4Var.f405591i = aVar2.g(intValue);
                return 0;
            case 7:
                s4Var.f405592m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
