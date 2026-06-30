package r45;

/* loaded from: classes12.dex */
public class si extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f467276d;

    /* renamed from: e, reason: collision with root package name */
    public int f467277e;

    /* renamed from: f, reason: collision with root package name */
    public int f467278f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f467279g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f467280h;

    /* renamed from: i, reason: collision with root package name */
    public int f467281i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f467282m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f467283n;

    /* renamed from: o, reason: collision with root package name */
    public int f467284o;

    /* renamed from: p, reason: collision with root package name */
    public long f467285p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.si)) {
            return false;
        }
        r45.si siVar = (r45.si) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f467276d), java.lang.Integer.valueOf(siVar.f467276d)) && n51.f.a(java.lang.Integer.valueOf(this.f467277e), java.lang.Integer.valueOf(siVar.f467277e)) && n51.f.a(java.lang.Integer.valueOf(this.f467278f), java.lang.Integer.valueOf(siVar.f467278f)) && n51.f.a(this.f467279g, siVar.f467279g) && n51.f.a(this.f467280h, siVar.f467280h) && n51.f.a(java.lang.Integer.valueOf(this.f467281i), java.lang.Integer.valueOf(siVar.f467281i)) && n51.f.a(this.f467282m, siVar.f467282m) && n51.f.a(this.f467283n, siVar.f467283n) && n51.f.a(java.lang.Integer.valueOf(this.f467284o), java.lang.Integer.valueOf(siVar.f467284o)) && n51.f.a(java.lang.Long.valueOf(this.f467285p), java.lang.Long.valueOf(siVar.f467285p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f467276d);
            fVar.e(2, this.f467277e);
            fVar.e(3, this.f467278f);
            java.lang.String str = this.f467279g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f467280h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f467281i);
            java.lang.String str3 = this.f467282m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f467283n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f467284o);
            fVar.h(10, this.f467285p);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f467276d) + 0 + b36.f.e(2, this.f467277e) + b36.f.e(3, this.f467278f);
            java.lang.String str5 = this.f467279g;
            if (str5 != null) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f467280h;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            int e18 = e17 + b36.f.e(6, this.f467281i);
            java.lang.String str7 = this.f467282m;
            if (str7 != null) {
                e18 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f467283n;
            if (str8 != null) {
                e18 += b36.f.j(8, str8);
            }
            return e18 + b36.f.e(9, this.f467284o) + b36.f.h(10, this.f467285p);
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
        r45.si siVar = (r45.si) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                siVar.f467276d = aVar2.g(intValue);
                return 0;
            case 2:
                siVar.f467277e = aVar2.g(intValue);
                return 0;
            case 3:
                siVar.f467278f = aVar2.g(intValue);
                return 0;
            case 4:
                siVar.f467279g = aVar2.k(intValue);
                return 0;
            case 5:
                siVar.f467280h = aVar2.k(intValue);
                return 0;
            case 6:
                siVar.f467281i = aVar2.g(intValue);
                return 0;
            case 7:
                siVar.f467282m = aVar2.k(intValue);
                return 0;
            case 8:
                siVar.f467283n = aVar2.k(intValue);
                return 0;
            case 9:
                siVar.f467284o = aVar2.g(intValue);
                return 0;
            case 10:
                siVar.f467285p = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
