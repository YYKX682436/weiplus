package r45;

/* loaded from: classes4.dex */
public class s35 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f466999d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467000e;

    /* renamed from: f, reason: collision with root package name */
    public int f467001f;

    /* renamed from: g, reason: collision with root package name */
    public int f467002g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f467003h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f467004i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f467005m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f467006n;

    /* renamed from: o, reason: collision with root package name */
    public int f467007o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s35)) {
            return false;
        }
        r45.s35 s35Var = (r45.s35) fVar;
        return n51.f.a(this.f466999d, s35Var.f466999d) && n51.f.a(this.f467000e, s35Var.f467000e) && n51.f.a(java.lang.Integer.valueOf(this.f467001f), java.lang.Integer.valueOf(s35Var.f467001f)) && n51.f.a(java.lang.Integer.valueOf(this.f467002g), java.lang.Integer.valueOf(s35Var.f467002g)) && n51.f.a(this.f467003h, s35Var.f467003h) && n51.f.a(this.f467004i, s35Var.f467004i) && n51.f.a(java.lang.Boolean.valueOf(this.f467005m), java.lang.Boolean.valueOf(s35Var.f467005m)) && n51.f.a(java.lang.Boolean.valueOf(this.f467006n), java.lang.Boolean.valueOf(s35Var.f467006n)) && n51.f.a(java.lang.Integer.valueOf(this.f467007o), java.lang.Integer.valueOf(s35Var.f467007o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f466999d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f467000e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f467001f);
            fVar.e(4, this.f467002g);
            java.lang.String str3 = this.f467003h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f467004i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.a(20, this.f467005m);
            fVar.a(21, this.f467006n);
            fVar.e(22, this.f467007o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f466999d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f467000e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f467001f) + b36.f.e(4, this.f467002g);
            java.lang.String str7 = this.f467003h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f467004i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            return e17 + b36.f.a(20, this.f467005m) + b36.f.a(21, this.f467006n) + b36.f.e(22, this.f467007o);
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
        r45.s35 s35Var = (r45.s35) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                s35Var.f466999d = aVar2.k(intValue);
                return 0;
            case 2:
                s35Var.f467000e = aVar2.k(intValue);
                return 0;
            case 3:
                s35Var.f467001f = aVar2.g(intValue);
                return 0;
            case 4:
                s35Var.f467002g = aVar2.g(intValue);
                return 0;
            case 5:
                s35Var.f467003h = aVar2.k(intValue);
                return 0;
            case 6:
                s35Var.f467004i = aVar2.k(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 20:
                        s35Var.f467005m = aVar2.c(intValue);
                        return 0;
                    case 21:
                        s35Var.f467006n = aVar2.c(intValue);
                        return 0;
                    case 22:
                        s35Var.f467007o = aVar2.g(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
