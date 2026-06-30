package in;

/* loaded from: classes7.dex */
public class c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374254d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374255e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374256f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374257g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374258h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374259i;

    /* renamed from: m, reason: collision with root package name */
    public int f374260m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f374261n;

    /* renamed from: o, reason: collision with root package name */
    public long f374262o;

    /* renamed from: p, reason: collision with root package name */
    public int f374263p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof in.c)) {
            return false;
        }
        in.c cVar = (in.c) fVar;
        return n51.f.a(this.f374254d, cVar.f374254d) && n51.f.a(this.f374255e, cVar.f374255e) && n51.f.a(this.f374256f, cVar.f374256f) && n51.f.a(this.f374257g, cVar.f374257g) && n51.f.a(this.f374258h, cVar.f374258h) && n51.f.a(this.f374259i, cVar.f374259i) && n51.f.a(java.lang.Integer.valueOf(this.f374260m), java.lang.Integer.valueOf(cVar.f374260m)) && n51.f.a(this.f374261n, cVar.f374261n) && n51.f.a(java.lang.Long.valueOf(this.f374262o), java.lang.Long.valueOf(cVar.f374262o)) && n51.f.a(java.lang.Integer.valueOf(this.f374263p), java.lang.Integer.valueOf(cVar.f374263p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374254d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f374255e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f374256f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f374257g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f374258h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f374259i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.e(7, this.f374260m);
            java.lang.String str7 = this.f374261n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.h(9, this.f374262o);
            fVar.e(10, this.f374263p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f374254d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f374255e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f374256f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f374257g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f374258h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f374259i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            int e17 = j17 + b36.f.e(7, this.f374260m);
            java.lang.String str14 = this.f374261n;
            if (str14 != null) {
                e17 += b36.f.j(8, str14);
            }
            return e17 + b36.f.h(9, this.f374262o) + b36.f.e(10, this.f374263p);
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
        in.c cVar = (in.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cVar.f374254d = aVar2.k(intValue);
                return 0;
            case 2:
                cVar.f374255e = aVar2.k(intValue);
                return 0;
            case 3:
                cVar.f374256f = aVar2.k(intValue);
                return 0;
            case 4:
                cVar.f374257g = aVar2.k(intValue);
                return 0;
            case 5:
                cVar.f374258h = aVar2.k(intValue);
                return 0;
            case 6:
                cVar.f374259i = aVar2.k(intValue);
                return 0;
            case 7:
                cVar.f374260m = aVar2.g(intValue);
                return 0;
            case 8:
                cVar.f374261n = aVar2.k(intValue);
                return 0;
            case 9:
                cVar.f374262o = aVar2.i(intValue);
                return 0;
            case 10:
                cVar.f374263p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
