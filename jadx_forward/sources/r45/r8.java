package r45;

/* loaded from: classes8.dex */
public class r8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f466134d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466135e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466136f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466137g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f466138h;

    /* renamed from: i, reason: collision with root package name */
    public int f466139i;

    /* renamed from: m, reason: collision with root package name */
    public int f466140m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r8)) {
            return false;
        }
        r45.r8 r8Var = (r45.r8) fVar;
        return n51.f.a(this.f466134d, r8Var.f466134d) && n51.f.a(this.f466135e, r8Var.f466135e) && n51.f.a(this.f466136f, r8Var.f466136f) && n51.f.a(this.f466137g, r8Var.f466137g) && n51.f.a(this.f466138h, r8Var.f466138h) && n51.f.a(java.lang.Integer.valueOf(this.f466139i), java.lang.Integer.valueOf(r8Var.f466139i)) && n51.f.a(java.lang.Integer.valueOf(this.f466140m), java.lang.Integer.valueOf(r8Var.f466140m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f466134d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f466135e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f466136f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f466137g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f466138h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f466139i);
            fVar.e(7, this.f466140m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f466134d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f466135e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f466136f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f466137g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f466138h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            return j17 + b36.f.e(6, this.f466139i) + b36.f.e(7, this.f466140m);
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
        r45.r8 r8Var = (r45.r8) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                r8Var.f466134d = aVar2.k(intValue);
                return 0;
            case 2:
                r8Var.f466135e = aVar2.k(intValue);
                return 0;
            case 3:
                r8Var.f466136f = aVar2.k(intValue);
                return 0;
            case 4:
                r8Var.f466137g = aVar2.k(intValue);
                return 0;
            case 5:
                r8Var.f466138h = aVar2.k(intValue);
                return 0;
            case 6:
                r8Var.f466139i = aVar2.g(intValue);
                return 0;
            case 7:
                r8Var.f466140m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
