package r45;

/* loaded from: classes2.dex */
public class rw6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f466780d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466781e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466782f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466783g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f466784h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f466785i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f466786m;

    /* renamed from: n, reason: collision with root package name */
    public long f466787n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rw6)) {
            return false;
        }
        r45.rw6 rw6Var = (r45.rw6) fVar;
        return n51.f.a(this.f466780d, rw6Var.f466780d) && n51.f.a(this.f466781e, rw6Var.f466781e) && n51.f.a(this.f466782f, rw6Var.f466782f) && n51.f.a(this.f466783g, rw6Var.f466783g) && n51.f.a(this.f466784h, rw6Var.f466784h) && n51.f.a(this.f466785i, rw6Var.f466785i) && n51.f.a(this.f466786m, rw6Var.f466786m) && n51.f.a(java.lang.Long.valueOf(this.f466787n), java.lang.Long.valueOf(rw6Var.f466787n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f466780d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f466781e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f466782f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f466783g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f466784h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f466785i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f466786m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            fVar.h(8, this.f466787n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f466780d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f466781e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f466782f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f466783g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f466784h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f466785i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f466786m;
            if (str14 != null) {
                j17 += b36.f.j(7, str14);
            }
            return j17 + b36.f.h(8, this.f466787n);
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
        r45.rw6 rw6Var = (r45.rw6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rw6Var.f466780d = aVar2.k(intValue);
                return 0;
            case 2:
                rw6Var.f466781e = aVar2.k(intValue);
                return 0;
            case 3:
                rw6Var.f466782f = aVar2.k(intValue);
                return 0;
            case 4:
                rw6Var.f466783g = aVar2.k(intValue);
                return 0;
            case 5:
                rw6Var.f466784h = aVar2.k(intValue);
                return 0;
            case 6:
                rw6Var.f466785i = aVar2.k(intValue);
                return 0;
            case 7:
                rw6Var.f466786m = aVar2.k(intValue);
                return 0;
            case 8:
                rw6Var.f466787n = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
