package r45;

/* loaded from: classes2.dex */
public class tb extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f467797d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467798e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467799f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f467800g;

    /* renamed from: h, reason: collision with root package name */
    public int f467801h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f467802i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tb)) {
            return false;
        }
        r45.tb tbVar = (r45.tb) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f467797d), java.lang.Integer.valueOf(tbVar.f467797d)) && n51.f.a(this.f467798e, tbVar.f467798e) && n51.f.a(this.f467799f, tbVar.f467799f) && n51.f.a(this.f467800g, tbVar.f467800g) && n51.f.a(java.lang.Integer.valueOf(this.f467801h), java.lang.Integer.valueOf(tbVar.f467801h)) && n51.f.a(this.f467802i, tbVar.f467802i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f467797d);
            java.lang.String str = this.f467798e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f467799f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f467800g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f467801h);
            java.lang.String str4 = this.f467802i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f467797d) + 0;
            java.lang.String str5 = this.f467798e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f467799f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f467800g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            int e18 = e17 + b36.f.e(5, this.f467801h);
            java.lang.String str8 = this.f467802i;
            return str8 != null ? e18 + b36.f.j(6, str8) : e18;
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
        r45.tb tbVar = (r45.tb) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tbVar.f467797d = aVar2.g(intValue);
                return 0;
            case 2:
                tbVar.f467798e = aVar2.k(intValue);
                return 0;
            case 3:
                tbVar.f467799f = aVar2.k(intValue);
                return 0;
            case 4:
                tbVar.f467800g = aVar2.k(intValue);
                return 0;
            case 5:
                tbVar.f467801h = aVar2.g(intValue);
                return 0;
            case 6:
                tbVar.f467802i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
