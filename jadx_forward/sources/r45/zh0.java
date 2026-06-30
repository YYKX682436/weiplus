package r45;

/* loaded from: classes15.dex */
public class zh0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473587d;

    /* renamed from: e, reason: collision with root package name */
    public int f473588e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f473589f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f473590g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f473591h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f473592i;

    /* renamed from: m, reason: collision with root package name */
    public int f473593m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f473594n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zh0)) {
            return false;
        }
        r45.zh0 zh0Var = (r45.zh0) fVar;
        return n51.f.a(this.f473587d, zh0Var.f473587d) && n51.f.a(java.lang.Integer.valueOf(this.f473588e), java.lang.Integer.valueOf(zh0Var.f473588e)) && n51.f.a(this.f473589f, zh0Var.f473589f) && n51.f.a(this.f473590g, zh0Var.f473590g) && n51.f.a(this.f473591h, zh0Var.f473591h) && n51.f.a(this.f473592i, zh0Var.f473592i) && n51.f.a(java.lang.Integer.valueOf(this.f473593m), java.lang.Integer.valueOf(zh0Var.f473593m)) && n51.f.a(this.f473594n, zh0Var.f473594n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473587d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f473588e);
            java.lang.String str2 = this.f473589f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f473590g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f473591h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f473592i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f473593m);
            java.lang.String str6 = this.f473594n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f473587d;
            int j17 = (str7 != null ? 0 + b36.f.j(1, str7) : 0) + b36.f.e(2, this.f473588e);
            java.lang.String str8 = this.f473589f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f473590g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f473591h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f473592i;
            if (str11 != null) {
                j17 += b36.f.j(6, str11);
            }
            int e17 = j17 + b36.f.e(7, this.f473593m);
            java.lang.String str12 = this.f473594n;
            return str12 != null ? e17 + b36.f.j(8, str12) : e17;
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
        r45.zh0 zh0Var = (r45.zh0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                zh0Var.f473587d = aVar2.k(intValue);
                return 0;
            case 2:
                zh0Var.f473588e = aVar2.g(intValue);
                return 0;
            case 3:
                zh0Var.f473589f = aVar2.k(intValue);
                return 0;
            case 4:
                zh0Var.f473590g = aVar2.k(intValue);
                return 0;
            case 5:
                zh0Var.f473591h = aVar2.k(intValue);
                return 0;
            case 6:
                zh0Var.f473592i = aVar2.k(intValue);
                return 0;
            case 7:
                zh0Var.f473593m = aVar2.g(intValue);
                return 0;
            case 8:
                zh0Var.f473594n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
