package r45;

/* loaded from: classes4.dex */
public class xt3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471924d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f471925e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f471926f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f471927g;

    /* renamed from: h, reason: collision with root package name */
    public int f471928h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f471929i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f471930m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xt3)) {
            return false;
        }
        r45.xt3 xt3Var = (r45.xt3) fVar;
        return n51.f.a(this.f471924d, xt3Var.f471924d) && n51.f.a(this.f471925e, xt3Var.f471925e) && n51.f.a(this.f471926f, xt3Var.f471926f) && n51.f.a(this.f471927g, xt3Var.f471927g) && n51.f.a(java.lang.Integer.valueOf(this.f471928h), java.lang.Integer.valueOf(xt3Var.f471928h)) && n51.f.a(this.f471929i, xt3Var.f471929i) && n51.f.a(this.f471930m, xt3Var.f471930m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f471924d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f471925e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f471926f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f471927g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f471928h);
            java.lang.String str5 = this.f471929i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f471930m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f471924d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f471925e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f471926f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f471927g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            int e17 = j17 + b36.f.e(5, this.f471928h);
            java.lang.String str11 = this.f471929i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f471930m;
            return str12 != null ? e17 + b36.f.j(7, str12) : e17;
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
        r45.xt3 xt3Var = (r45.xt3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xt3Var.f471924d = aVar2.k(intValue);
                return 0;
            case 2:
                xt3Var.f471925e = aVar2.k(intValue);
                return 0;
            case 3:
                xt3Var.f471926f = aVar2.k(intValue);
                return 0;
            case 4:
                xt3Var.f471927g = aVar2.k(intValue);
                return 0;
            case 5:
                xt3Var.f471928h = aVar2.g(intValue);
                return 0;
            case 6:
                xt3Var.f471929i = aVar2.k(intValue);
                return 0;
            case 7:
                xt3Var.f471930m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
