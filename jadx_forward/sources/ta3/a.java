package ta3;

/* loaded from: classes9.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f498229d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f498230e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f498231f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f498232g;

    /* renamed from: h, reason: collision with root package name */
    public double f498233h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f498234i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f498235m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof ta3.a)) {
            return false;
        }
        ta3.a aVar = (ta3.a) fVar;
        return n51.f.a(this.f498229d, aVar.f498229d) && n51.f.a(this.f498230e, aVar.f498230e) && n51.f.a(this.f498231f, aVar.f498231f) && n51.f.a(java.lang.Boolean.valueOf(this.f498232g), java.lang.Boolean.valueOf(aVar.f498232g)) && n51.f.a(java.lang.Double.valueOf(this.f498233h), java.lang.Double.valueOf(aVar.f498233h)) && n51.f.a(java.lang.Boolean.valueOf(this.f498234i), java.lang.Boolean.valueOf(aVar.f498234i)) && n51.f.a(this.f498235m, aVar.f498235m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f498229d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f498230e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f498231f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.a(4, this.f498232g);
            fVar.c(5, this.f498233h);
            fVar.a(6, this.f498234i);
            java.lang.String str4 = this.f498235m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f498229d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f498230e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f498231f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int a17 = j17 + b36.f.a(4, this.f498232g) + b36.f.c(5, this.f498233h) + b36.f.a(6, this.f498234i);
            java.lang.String str8 = this.f498235m;
            return str8 != null ? a17 + b36.f.j(7, str8) : a17;
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
        ta3.a aVar3 = (ta3.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                aVar3.f498229d = aVar2.k(intValue);
                return 0;
            case 2:
                aVar3.f498230e = aVar2.k(intValue);
                return 0;
            case 3:
                aVar3.f498231f = aVar2.k(intValue);
                return 0;
            case 4:
                aVar3.f498232g = aVar2.c(intValue);
                return 0;
            case 5:
                aVar3.f498233h = aVar2.e(intValue);
                return 0;
            case 6:
                aVar3.f498234i = aVar2.c(intValue);
                return 0;
            case 7:
                aVar3.f498235m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
