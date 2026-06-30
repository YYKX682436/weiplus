package r45;

/* loaded from: classes8.dex */
public class z55 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473261d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473262e;

    /* renamed from: f, reason: collision with root package name */
    public double f473263f;

    /* renamed from: g, reason: collision with root package name */
    public double f473264g;

    /* renamed from: h, reason: collision with root package name */
    public long f473265h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f473266i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f473267m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f473268n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f473269o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z55)) {
            return false;
        }
        r45.z55 z55Var = (r45.z55) fVar;
        return n51.f.a(this.f473261d, z55Var.f473261d) && n51.f.a(this.f473262e, z55Var.f473262e) && n51.f.a(java.lang.Double.valueOf(this.f473263f), java.lang.Double.valueOf(z55Var.f473263f)) && n51.f.a(java.lang.Double.valueOf(this.f473264g), java.lang.Double.valueOf(z55Var.f473264g)) && n51.f.a(java.lang.Long.valueOf(this.f473265h), java.lang.Long.valueOf(z55Var.f473265h)) && n51.f.a(this.f473266i, z55Var.f473266i) && n51.f.a(this.f473267m, z55Var.f473267m) && n51.f.a(this.f473268n, z55Var.f473268n) && n51.f.a(this.f473269o, z55Var.f473269o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473261d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f473262e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.c(3, this.f473263f);
            fVar.c(4, this.f473264g);
            fVar.h(5, this.f473265h);
            java.lang.String str3 = this.f473266i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f473267m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f473268n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f473269o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f473261d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f473262e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            int c17 = j17 + b36.f.c(3, this.f473263f) + b36.f.c(4, this.f473264g) + b36.f.h(5, this.f473265h);
            java.lang.String str9 = this.f473266i;
            if (str9 != null) {
                c17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f473267m;
            if (str10 != null) {
                c17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f473268n;
            if (str11 != null) {
                c17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f473269o;
            return str12 != null ? c17 + b36.f.j(9, str12) : c17;
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
        r45.z55 z55Var = (r45.z55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                z55Var.f473261d = aVar2.k(intValue);
                return 0;
            case 2:
                z55Var.f473262e = aVar2.k(intValue);
                return 0;
            case 3:
                z55Var.f473263f = aVar2.e(intValue);
                return 0;
            case 4:
                z55Var.f473264g = aVar2.e(intValue);
                return 0;
            case 5:
                z55Var.f473265h = aVar2.i(intValue);
                return 0;
            case 6:
                z55Var.f473266i = aVar2.k(intValue);
                return 0;
            case 7:
                z55Var.f473267m = aVar2.k(intValue);
                return 0;
            case 8:
                z55Var.f473268n = aVar2.k(intValue);
                return 0;
            case 9:
                z55Var.f473269o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
