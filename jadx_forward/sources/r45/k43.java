package r45;

/* loaded from: classes8.dex */
public class k43 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459889d;

    /* renamed from: e, reason: collision with root package name */
    public int f459890e;

    /* renamed from: f, reason: collision with root package name */
    public int f459891f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459892g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f459893h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f459894i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f459895m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k43)) {
            return false;
        }
        r45.k43 k43Var = (r45.k43) fVar;
        return n51.f.a(this.f459889d, k43Var.f459889d) && n51.f.a(java.lang.Integer.valueOf(this.f459890e), java.lang.Integer.valueOf(k43Var.f459890e)) && n51.f.a(java.lang.Integer.valueOf(this.f459891f), java.lang.Integer.valueOf(k43Var.f459891f)) && n51.f.a(this.f459892g, k43Var.f459892g) && n51.f.a(this.f459893h, k43Var.f459893h) && n51.f.a(this.f459894i, k43Var.f459894i) && n51.f.a(this.f459895m, k43Var.f459895m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459889d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f459890e);
            fVar.e(3, this.f459891f);
            java.lang.String str2 = this.f459892g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f459893h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f459894i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f459895m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f459889d;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.e(2, this.f459890e) + b36.f.e(3, this.f459891f);
            java.lang.String str7 = this.f459892g;
            if (str7 != null) {
                j17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f459893h;
            if (str8 != null) {
                j17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f459894i;
            if (str9 != null) {
                j17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f459895m;
            return str10 != null ? j17 + b36.f.j(7, str10) : j17;
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
        r45.k43 k43Var = (r45.k43) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                k43Var.f459889d = aVar2.k(intValue);
                return 0;
            case 2:
                k43Var.f459890e = aVar2.g(intValue);
                return 0;
            case 3:
                k43Var.f459891f = aVar2.g(intValue);
                return 0;
            case 4:
                k43Var.f459892g = aVar2.k(intValue);
                return 0;
            case 5:
                k43Var.f459893h = aVar2.k(intValue);
                return 0;
            case 6:
                k43Var.f459894i = aVar2.k(intValue);
                return 0;
            case 7:
                k43Var.f459895m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
