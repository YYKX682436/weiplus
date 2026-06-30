package r45;

/* loaded from: classes2.dex */
public class pr6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464873d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464874e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464875f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464876g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464877h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f464878i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pr6)) {
            return false;
        }
        r45.pr6 pr6Var = (r45.pr6) fVar;
        return n51.f.a(this.f464873d, pr6Var.f464873d) && n51.f.a(this.f464874e, pr6Var.f464874e) && n51.f.a(this.f464875f, pr6Var.f464875f) && n51.f.a(this.f464876g, pr6Var.f464876g) && n51.f.a(this.f464877h, pr6Var.f464877h) && n51.f.a(this.f464878i, pr6Var.f464878i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464873d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f464874e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f464875f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f464876g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f464877h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f464878i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f464873d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f464874e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f464875f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f464876g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f464877h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f464878i;
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
        r45.pr6 pr6Var = (r45.pr6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pr6Var.f464873d = aVar2.k(intValue);
                return 0;
            case 2:
                pr6Var.f464874e = aVar2.k(intValue);
                return 0;
            case 3:
                pr6Var.f464875f = aVar2.k(intValue);
                return 0;
            case 4:
                pr6Var.f464876g = aVar2.k(intValue);
                return 0;
            case 5:
                pr6Var.f464877h = aVar2.k(intValue);
                return 0;
            case 6:
                pr6Var.f464878i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
