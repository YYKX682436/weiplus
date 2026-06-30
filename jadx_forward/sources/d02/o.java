package d02;

/* loaded from: classes2.dex */
public class o extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f306877d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f306878e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f306879f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f306880g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f306881h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f306882i;

    /* renamed from: m, reason: collision with root package name */
    public int f306883m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f306884n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f306885o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof d02.o)) {
            return false;
        }
        d02.o oVar = (d02.o) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f306877d), java.lang.Integer.valueOf(oVar.f306877d)) && n51.f.a(this.f306878e, oVar.f306878e) && n51.f.a(this.f306879f, oVar.f306879f) && n51.f.a(this.f306880g, oVar.f306880g) && n51.f.a(this.f306881h, oVar.f306881h) && n51.f.a(this.f306882i, oVar.f306882i) && n51.f.a(java.lang.Integer.valueOf(this.f306883m), java.lang.Integer.valueOf(oVar.f306883m)) && n51.f.a(this.f306884n, oVar.f306884n) && n51.f.a(this.f306885o, oVar.f306885o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f306877d);
            java.lang.String str = this.f306878e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f306879f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f306880g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f306881h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f306882i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f306883m);
            java.lang.String str6 = this.f306884n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f306885o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f306877d) + 0;
            java.lang.String str8 = this.f306878e;
            if (str8 != null) {
                e17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f306879f;
            if (str9 != null) {
                e17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f306880g;
            if (str10 != null) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f306881h;
            if (str11 != null) {
                e17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f306882i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            int e18 = e17 + b36.f.e(7, this.f306883m);
            java.lang.String str13 = this.f306884n;
            if (str13 != null) {
                e18 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f306885o;
            return str14 != null ? e18 + b36.f.j(9, str14) : e18;
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
        d02.o oVar = (d02.o) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                oVar.f306877d = aVar2.g(intValue);
                return 0;
            case 2:
                oVar.f306878e = aVar2.k(intValue);
                return 0;
            case 3:
                oVar.f306879f = aVar2.k(intValue);
                return 0;
            case 4:
                oVar.f306880g = aVar2.k(intValue);
                return 0;
            case 5:
                oVar.f306881h = aVar2.k(intValue);
                return 0;
            case 6:
                oVar.f306882i = aVar2.k(intValue);
                return 0;
            case 7:
                oVar.f306883m = aVar2.g(intValue);
                return 0;
            case 8:
                oVar.f306884n = aVar2.k(intValue);
                return 0;
            case 9:
                oVar.f306885o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
