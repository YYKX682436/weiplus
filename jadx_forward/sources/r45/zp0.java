package r45;

/* loaded from: classes9.dex */
public class zp0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473794d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473795e;

    /* renamed from: f, reason: collision with root package name */
    public int f473796f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f473797g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f473798h;

    /* renamed from: i, reason: collision with root package name */
    public int f473799i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zp0)) {
            return false;
        }
        r45.zp0 zp0Var = (r45.zp0) fVar;
        return n51.f.a(this.f473794d, zp0Var.f473794d) && n51.f.a(this.f473795e, zp0Var.f473795e) && n51.f.a(java.lang.Integer.valueOf(this.f473796f), java.lang.Integer.valueOf(zp0Var.f473796f)) && n51.f.a(this.f473797g, zp0Var.f473797g) && n51.f.a(this.f473798h, zp0Var.f473798h) && n51.f.a(java.lang.Integer.valueOf(this.f473799i), java.lang.Integer.valueOf(zp0Var.f473799i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473794d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f473795e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f473796f);
            java.lang.String str3 = this.f473797g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f473798h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f473799i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f473794d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f473795e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f473796f);
            java.lang.String str7 = this.f473797g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f473798h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            return e17 + b36.f.e(6, this.f473799i);
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
        r45.zp0 zp0Var = (r45.zp0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                zp0Var.f473794d = aVar2.k(intValue);
                return 0;
            case 2:
                zp0Var.f473795e = aVar2.k(intValue);
                return 0;
            case 3:
                zp0Var.f473796f = aVar2.g(intValue);
                return 0;
            case 4:
                zp0Var.f473797g = aVar2.k(intValue);
                return 0;
            case 5:
                zp0Var.f473798h = aVar2.k(intValue);
                return 0;
            case 6:
                zp0Var.f473799i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
