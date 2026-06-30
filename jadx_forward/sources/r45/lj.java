package r45;

/* loaded from: classes11.dex */
public class lj extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f461040d;

    /* renamed from: e, reason: collision with root package name */
    public int f461041e;

    /* renamed from: f, reason: collision with root package name */
    public int f461042f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f461043g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461044h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461045i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f461046m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f461047n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lj)) {
            return false;
        }
        r45.lj ljVar = (r45.lj) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f461040d), java.lang.Integer.valueOf(ljVar.f461040d)) && n51.f.a(java.lang.Integer.valueOf(this.f461041e), java.lang.Integer.valueOf(ljVar.f461041e)) && n51.f.a(java.lang.Integer.valueOf(this.f461042f), java.lang.Integer.valueOf(ljVar.f461042f)) && n51.f.a(this.f461043g, ljVar.f461043g) && n51.f.a(this.f461044h, ljVar.f461044h) && n51.f.a(this.f461045i, ljVar.f461045i) && n51.f.a(this.f461046m, ljVar.f461046m) && n51.f.a(this.f461047n, ljVar.f461047n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f461040d);
            fVar.e(2, this.f461041e);
            fVar.e(3, this.f461042f);
            java.lang.String str = this.f461043g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f461044h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f461045i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f461046m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f461047n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f461040d) + 0 + b36.f.e(2, this.f461041e) + b36.f.e(3, this.f461042f);
            java.lang.String str6 = this.f461043g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f461044h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f461045i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f461046m;
            if (str9 != null) {
                e17 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f461047n;
            return str10 != null ? e17 + b36.f.j(8, str10) : e17;
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
        r45.lj ljVar = (r45.lj) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ljVar.f461040d = aVar2.g(intValue);
                return 0;
            case 2:
                ljVar.f461041e = aVar2.g(intValue);
                return 0;
            case 3:
                ljVar.f461042f = aVar2.g(intValue);
                return 0;
            case 4:
                ljVar.f461043g = aVar2.k(intValue);
                return 0;
            case 5:
                ljVar.f461044h = aVar2.k(intValue);
                return 0;
            case 6:
                ljVar.f461045i = aVar2.k(intValue);
                return 0;
            case 7:
                ljVar.f461046m = aVar2.k(intValue);
                return 0;
            case 8:
                ljVar.f461047n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
