package r45;

/* loaded from: classes9.dex */
public class s43 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467026d;

    /* renamed from: e, reason: collision with root package name */
    public int f467027e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467028f;

    /* renamed from: g, reason: collision with root package name */
    public int f467029g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f467030h;

    /* renamed from: i, reason: collision with root package name */
    public int f467031i;

    /* renamed from: m, reason: collision with root package name */
    public int f467032m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s43)) {
            return false;
        }
        r45.s43 s43Var = (r45.s43) fVar;
        return n51.f.a(this.f467026d, s43Var.f467026d) && n51.f.a(java.lang.Integer.valueOf(this.f467027e), java.lang.Integer.valueOf(s43Var.f467027e)) && n51.f.a(this.f467028f, s43Var.f467028f) && n51.f.a(java.lang.Integer.valueOf(this.f467029g), java.lang.Integer.valueOf(s43Var.f467029g)) && n51.f.a(this.f467030h, s43Var.f467030h) && n51.f.a(java.lang.Integer.valueOf(this.f467031i), java.lang.Integer.valueOf(s43Var.f467031i)) && n51.f.a(java.lang.Integer.valueOf(this.f467032m), java.lang.Integer.valueOf(s43Var.f467032m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467026d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f467027e);
            java.lang.String str2 = this.f467028f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f467029g);
            java.lang.String str3 = this.f467030h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f467031i);
            fVar.e(7, this.f467032m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f467026d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f467027e);
            java.lang.String str5 = this.f467028f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            int e17 = j17 + b36.f.e(4, this.f467029g);
            java.lang.String str6 = this.f467030h;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            return e17 + b36.f.e(6, this.f467031i) + b36.f.e(7, this.f467032m);
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
        r45.s43 s43Var = (r45.s43) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                s43Var.f467026d = aVar2.k(intValue);
                return 0;
            case 2:
                s43Var.f467027e = aVar2.g(intValue);
                return 0;
            case 3:
                s43Var.f467028f = aVar2.k(intValue);
                return 0;
            case 4:
                s43Var.f467029g = aVar2.g(intValue);
                return 0;
            case 5:
                s43Var.f467030h = aVar2.k(intValue);
                return 0;
            case 6:
                s43Var.f467031i = aVar2.g(intValue);
                return 0;
            case 7:
                s43Var.f467032m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
