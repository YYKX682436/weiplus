package r45;

/* loaded from: classes11.dex */
public class vz4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470252d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470253e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470254f;

    /* renamed from: g, reason: collision with root package name */
    public int f470255g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f470256h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f470257i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f470258m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f470259n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f470260o;

    /* renamed from: p, reason: collision with root package name */
    public int f470261p;

    /* renamed from: q, reason: collision with root package name */
    public int f470262q;

    /* renamed from: r, reason: collision with root package name */
    public int f470263r;

    /* renamed from: s, reason: collision with root package name */
    public long f470264s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vz4)) {
            return false;
        }
        r45.vz4 vz4Var = (r45.vz4) fVar;
        return n51.f.a(this.f470252d, vz4Var.f470252d) && n51.f.a(this.f470253e, vz4Var.f470253e) && n51.f.a(this.f470254f, vz4Var.f470254f) && n51.f.a(java.lang.Integer.valueOf(this.f470255g), java.lang.Integer.valueOf(vz4Var.f470255g)) && n51.f.a(this.f470256h, vz4Var.f470256h) && n51.f.a(this.f470257i, vz4Var.f470257i) && n51.f.a(this.f470258m, vz4Var.f470258m) && n51.f.a(this.f470259n, vz4Var.f470259n) && n51.f.a(this.f470260o, vz4Var.f470260o) && n51.f.a(java.lang.Integer.valueOf(this.f470261p), java.lang.Integer.valueOf(vz4Var.f470261p)) && n51.f.a(java.lang.Integer.valueOf(this.f470262q), java.lang.Integer.valueOf(vz4Var.f470262q)) && n51.f.a(java.lang.Integer.valueOf(this.f470263r), java.lang.Integer.valueOf(vz4Var.f470263r)) && n51.f.a(java.lang.Long.valueOf(this.f470264s), java.lang.Long.valueOf(vz4Var.f470264s));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f470252d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f470253e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f470254f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f470255g);
            java.lang.String str4 = this.f470256h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f470257i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f470258m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f470259n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f470260o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            fVar.e(10, this.f470261p);
            fVar.e(11, this.f470262q);
            fVar.e(12, this.f470263r);
            fVar.h(13, this.f470264s);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f470252d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f470253e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f470254f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            int e17 = j17 + b36.f.e(4, this.f470255g);
            java.lang.String str12 = this.f470256h;
            if (str12 != null) {
                e17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f470257i;
            if (str13 != null) {
                e17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f470258m;
            if (str14 != null) {
                e17 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f470259n;
            if (str15 != null) {
                e17 += b36.f.j(8, str15);
            }
            java.lang.String str16 = this.f470260o;
            if (str16 != null) {
                e17 += b36.f.j(9, str16);
            }
            return e17 + b36.f.e(10, this.f470261p) + b36.f.e(11, this.f470262q) + b36.f.e(12, this.f470263r) + b36.f.h(13, this.f470264s);
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
        r45.vz4 vz4Var = (r45.vz4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vz4Var.f470252d = aVar2.k(intValue);
                return 0;
            case 2:
                vz4Var.f470253e = aVar2.k(intValue);
                return 0;
            case 3:
                vz4Var.f470254f = aVar2.k(intValue);
                return 0;
            case 4:
                vz4Var.f470255g = aVar2.g(intValue);
                return 0;
            case 5:
                vz4Var.f470256h = aVar2.k(intValue);
                return 0;
            case 6:
                vz4Var.f470257i = aVar2.k(intValue);
                return 0;
            case 7:
                vz4Var.f470258m = aVar2.k(intValue);
                return 0;
            case 8:
                vz4Var.f470259n = aVar2.k(intValue);
                return 0;
            case 9:
                vz4Var.f470260o = aVar2.k(intValue);
                return 0;
            case 10:
                vz4Var.f470261p = aVar2.g(intValue);
                return 0;
            case 11:
                vz4Var.f470262q = aVar2.g(intValue);
                return 0;
            case 12:
                vz4Var.f470263r = aVar2.g(intValue);
                return 0;
            case 13:
                vz4Var.f470264s = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
