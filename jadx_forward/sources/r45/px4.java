package r45;

/* loaded from: classes7.dex */
public class px4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464991d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464992e;

    /* renamed from: f, reason: collision with root package name */
    public int f464993f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464994g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464995h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.px4)) {
            return false;
        }
        r45.px4 px4Var = (r45.px4) fVar;
        return n51.f.a(this.f464991d, px4Var.f464991d) && n51.f.a(this.f464992e, px4Var.f464992e) && n51.f.a(java.lang.Integer.valueOf(this.f464993f), java.lang.Integer.valueOf(px4Var.f464993f)) && n51.f.a(this.f464994g, px4Var.f464994g) && n51.f.a(this.f464995h, px4Var.f464995h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464991d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f464992e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f464993f);
            java.lang.String str3 = this.f464994g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f464995h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f464991d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f464992e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f464993f);
            java.lang.String str7 = this.f464994g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f464995h;
            return str8 != null ? e17 + b36.f.j(5, str8) : e17;
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
        r45.px4 px4Var = (r45.px4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            px4Var.f464991d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            px4Var.f464992e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            px4Var.f464993f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            px4Var.f464994g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        px4Var.f464995h = aVar2.k(intValue);
        return 0;
    }
}
