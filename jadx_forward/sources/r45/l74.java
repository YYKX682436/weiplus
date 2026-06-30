package r45;

/* loaded from: classes8.dex */
public class l74 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460724d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460725e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460726f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460727g;

    /* renamed from: h, reason: collision with root package name */
    public int f460728h;

    /* renamed from: i, reason: collision with root package name */
    public int f460729i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l74)) {
            return false;
        }
        r45.l74 l74Var = (r45.l74) fVar;
        return n51.f.a(this.f460724d, l74Var.f460724d) && n51.f.a(this.f460725e, l74Var.f460725e) && n51.f.a(this.f460726f, l74Var.f460726f) && n51.f.a(this.f460727g, l74Var.f460727g) && n51.f.a(java.lang.Integer.valueOf(this.f460728h), java.lang.Integer.valueOf(l74Var.f460728h)) && n51.f.a(java.lang.Integer.valueOf(this.f460729i), java.lang.Integer.valueOf(l74Var.f460729i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460724d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f460725e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f460726f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f460727g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f460728h);
            fVar.e(6, this.f460729i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f460724d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f460725e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f460726f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f460727g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.e(5, this.f460728h) + b36.f.e(6, this.f460729i);
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
        r45.l74 l74Var = (r45.l74) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                l74Var.f460724d = aVar2.k(intValue);
                return 0;
            case 2:
                l74Var.f460725e = aVar2.k(intValue);
                return 0;
            case 3:
                l74Var.f460726f = aVar2.k(intValue);
                return 0;
            case 4:
                l74Var.f460727g = aVar2.k(intValue);
                return 0;
            case 5:
                l74Var.f460728h = aVar2.g(intValue);
                return 0;
            case 6:
                l74Var.f460729i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
