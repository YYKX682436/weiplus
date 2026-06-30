package r45;

/* loaded from: classes11.dex */
public class w06 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470300d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470301e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470302f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470303g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f470304h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w06)) {
            return false;
        }
        r45.w06 w06Var = (r45.w06) fVar;
        return n51.f.a(this.f470300d, w06Var.f470300d) && n51.f.a(this.f470301e, w06Var.f470301e) && n51.f.a(this.f470302f, w06Var.f470302f) && n51.f.a(this.f470303g, w06Var.f470303g) && n51.f.a(this.f470304h, w06Var.f470304h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f470300d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f470301e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f470302f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f470303g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f470304h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f470300d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f470301e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f470302f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f470303g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f470304h;
            return str10 != null ? j17 + b36.f.j(5, str10) : j17;
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
        r45.w06 w06Var = (r45.w06) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            w06Var.f470300d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            w06Var.f470301e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            w06Var.f470302f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            w06Var.f470303g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        w06Var.f470304h = aVar2.k(intValue);
        return 0;
    }
}
