package r45;

/* loaded from: classes7.dex */
public class s04 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f466895d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466896e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466897f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466898g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f466899h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f466900i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s04)) {
            return false;
        }
        r45.s04 s04Var = (r45.s04) fVar;
        return n51.f.a(this.f466895d, s04Var.f466895d) && n51.f.a(this.f466896e, s04Var.f466896e) && n51.f.a(this.f466897f, s04Var.f466897f) && n51.f.a(this.f466898g, s04Var.f466898g) && n51.f.a(this.f466899h, s04Var.f466899h) && n51.f.a(this.f466900i, s04Var.f466900i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f466895d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f466896e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f466897f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f466898g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f466899h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f466900i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f466895d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f466896e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f466897f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f466898g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f466899h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f466900i;
            return str12 != null ? j17 + b36.f.j(6, str12) : j17;
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
        r45.s04 s04Var = (r45.s04) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                s04Var.f466895d = aVar2.k(intValue);
                return 0;
            case 2:
                s04Var.f466896e = aVar2.k(intValue);
                return 0;
            case 3:
                s04Var.f466897f = aVar2.k(intValue);
                return 0;
            case 4:
                s04Var.f466898g = aVar2.k(intValue);
                return 0;
            case 5:
                s04Var.f466899h = aVar2.k(intValue);
                return 0;
            case 6:
                s04Var.f466900i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
