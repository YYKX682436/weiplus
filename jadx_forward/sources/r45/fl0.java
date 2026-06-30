package r45;

/* loaded from: classes7.dex */
public class fl0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f455951d;

    /* renamed from: e, reason: collision with root package name */
    public int f455952e;

    /* renamed from: f, reason: collision with root package name */
    public int f455953f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f455954g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455955h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f455956i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fl0)) {
            return false;
        }
        r45.fl0 fl0Var = (r45.fl0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f455951d), java.lang.Integer.valueOf(fl0Var.f455951d)) && n51.f.a(java.lang.Integer.valueOf(this.f455952e), java.lang.Integer.valueOf(fl0Var.f455952e)) && n51.f.a(java.lang.Integer.valueOf(this.f455953f), java.lang.Integer.valueOf(fl0Var.f455953f)) && n51.f.a(this.f455954g, fl0Var.f455954g) && n51.f.a(this.f455955h, fl0Var.f455955h) && n51.f.a(this.f455956i, fl0Var.f455956i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f455951d);
            fVar.e(2, this.f455952e);
            fVar.e(3, this.f455953f);
            java.lang.String str = this.f455954g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f455955h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f455956i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f455951d) + 0 + b36.f.e(2, this.f455952e) + b36.f.e(3, this.f455953f);
            java.lang.String str4 = this.f455954g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f455955h;
            if (str5 != null) {
                e17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f455956i;
            return str6 != null ? e17 + b36.f.j(6, str6) : e17;
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
        r45.fl0 fl0Var = (r45.fl0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fl0Var.f455951d = aVar2.g(intValue);
                return 0;
            case 2:
                fl0Var.f455952e = aVar2.g(intValue);
                return 0;
            case 3:
                fl0Var.f455953f = aVar2.g(intValue);
                return 0;
            case 4:
                fl0Var.f455954g = aVar2.k(intValue);
                return 0;
            case 5:
                fl0Var.f455955h = aVar2.k(intValue);
                return 0;
            case 6:
                fl0Var.f455956i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
