package r45;

/* loaded from: classes4.dex */
public class xz extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472136d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472137e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472138f;

    /* renamed from: g, reason: collision with root package name */
    public int f472139g;

    /* renamed from: h, reason: collision with root package name */
    public int f472140h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f472141i;

    /* renamed from: m, reason: collision with root package name */
    public int f472142m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xz)) {
            return false;
        }
        r45.xz xzVar = (r45.xz) fVar;
        return n51.f.a(this.f472136d, xzVar.f472136d) && n51.f.a(this.f472137e, xzVar.f472137e) && n51.f.a(this.f472138f, xzVar.f472138f) && n51.f.a(java.lang.Integer.valueOf(this.f472139g), java.lang.Integer.valueOf(xzVar.f472139g)) && n51.f.a(java.lang.Integer.valueOf(this.f472140h), java.lang.Integer.valueOf(xzVar.f472140h)) && n51.f.a(this.f472141i, xzVar.f472141i) && n51.f.a(java.lang.Integer.valueOf(this.f472142m), java.lang.Integer.valueOf(xzVar.f472142m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472136d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f472137e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f472138f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f472139g);
            fVar.e(5, this.f472140h);
            java.lang.String str4 = this.f472141i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f472142m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f472136d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f472137e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f472138f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f472139g) + b36.f.e(5, this.f472140h);
            java.lang.String str8 = this.f472141i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            return e17 + b36.f.e(7, this.f472142m);
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
        r45.xz xzVar = (r45.xz) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xzVar.f472136d = aVar2.k(intValue);
                return 0;
            case 2:
                xzVar.f472137e = aVar2.k(intValue);
                return 0;
            case 3:
                xzVar.f472138f = aVar2.k(intValue);
                return 0;
            case 4:
                xzVar.f472139g = aVar2.g(intValue);
                return 0;
            case 5:
                xzVar.f472140h = aVar2.g(intValue);
                return 0;
            case 6:
                xzVar.f472141i = aVar2.k(intValue);
                return 0;
            case 7:
                xzVar.f472142m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
