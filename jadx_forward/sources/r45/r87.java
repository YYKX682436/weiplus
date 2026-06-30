package r45;

/* loaded from: classes4.dex */
public class r87 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f466177d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466178e;

    /* renamed from: f, reason: collision with root package name */
    public float f466179f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466180g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f466181h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r87)) {
            return false;
        }
        r45.r87 r87Var = (r45.r87) fVar;
        return n51.f.a(this.f466177d, r87Var.f466177d) && n51.f.a(this.f466178e, r87Var.f466178e) && n51.f.a(java.lang.Float.valueOf(this.f466179f), java.lang.Float.valueOf(r87Var.f466179f)) && n51.f.a(this.f466180g, r87Var.f466180g) && n51.f.a(this.f466181h, r87Var.f466181h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f466177d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f466178e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.d(3, this.f466179f);
            java.lang.String str3 = this.f466180g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f466181h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f466177d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f466178e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int d17 = j17 + b36.f.d(3, this.f466179f);
            java.lang.String str7 = this.f466180g;
            if (str7 != null) {
                d17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f466181h;
            return str8 != null ? d17 + b36.f.j(5, str8) : d17;
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
        r45.r87 r87Var = (r45.r87) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            r87Var.f466177d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            r87Var.f466178e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            r87Var.f466179f = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 4) {
            r87Var.f466180g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        r87Var.f466181h = aVar2.k(intValue);
        return 0;
    }
}
