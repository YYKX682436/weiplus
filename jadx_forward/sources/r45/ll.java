package r45;

/* loaded from: classes8.dex */
public class ll extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461096d;

    /* renamed from: e, reason: collision with root package name */
    public int f461097e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461098f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f461099g;

    /* renamed from: h, reason: collision with root package name */
    public int f461100h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461101i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f461102m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ll)) {
            return false;
        }
        r45.ll llVar = (r45.ll) fVar;
        return n51.f.a(this.f461096d, llVar.f461096d) && n51.f.a(java.lang.Integer.valueOf(this.f461097e), java.lang.Integer.valueOf(llVar.f461097e)) && n51.f.a(this.f461098f, llVar.f461098f) && n51.f.a(this.f461099g, llVar.f461099g) && n51.f.a(java.lang.Integer.valueOf(this.f461100h), java.lang.Integer.valueOf(llVar.f461100h)) && n51.f.a(this.f461101i, llVar.f461101i) && n51.f.a(this.f461102m, llVar.f461102m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461096d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f461097e);
            java.lang.String str2 = this.f461098f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f461099g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f461100h);
            java.lang.String str4 = this.f461101i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f461102m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f461096d;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.e(2, this.f461097e);
            java.lang.String str7 = this.f461098f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f461099g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            int e17 = j17 + b36.f.e(5, this.f461100h);
            java.lang.String str9 = this.f461101i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f461102m;
            return str10 != null ? e17 + b36.f.j(7, str10) : e17;
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
        r45.ll llVar = (r45.ll) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                llVar.f461096d = aVar2.k(intValue);
                return 0;
            case 2:
                llVar.f461097e = aVar2.g(intValue);
                return 0;
            case 3:
                llVar.f461098f = aVar2.k(intValue);
                return 0;
            case 4:
                llVar.f461099g = aVar2.k(intValue);
                return 0;
            case 5:
                llVar.f461100h = aVar2.g(intValue);
                return 0;
            case 6:
                llVar.f461101i = aVar2.k(intValue);
                return 0;
            case 7:
                llVar.f461102m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
