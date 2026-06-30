package r45;

/* loaded from: classes9.dex */
public class r17 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465972d;

    /* renamed from: e, reason: collision with root package name */
    public int f465973e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465974f;

    /* renamed from: g, reason: collision with root package name */
    public int f465975g;

    /* renamed from: h, reason: collision with root package name */
    public int f465976h;

    /* renamed from: i, reason: collision with root package name */
    public int f465977i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f465978m;

    /* renamed from: n, reason: collision with root package name */
    public int f465979n;

    /* renamed from: o, reason: collision with root package name */
    public int f465980o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f465981p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f465982q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f465983r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r17)) {
            return false;
        }
        r45.r17 r17Var = (r45.r17) fVar;
        return n51.f.a(this.f76492x92037252, r17Var.f76492x92037252) && n51.f.a(this.f465972d, r17Var.f465972d) && n51.f.a(java.lang.Integer.valueOf(this.f465973e), java.lang.Integer.valueOf(r17Var.f465973e)) && n51.f.a(this.f465974f, r17Var.f465974f) && n51.f.a(java.lang.Integer.valueOf(this.f465975g), java.lang.Integer.valueOf(r17Var.f465975g)) && n51.f.a(java.lang.Integer.valueOf(this.f465976h), java.lang.Integer.valueOf(r17Var.f465976h)) && n51.f.a(java.lang.Integer.valueOf(this.f465977i), java.lang.Integer.valueOf(r17Var.f465977i)) && n51.f.a(this.f465978m, r17Var.f465978m) && n51.f.a(java.lang.Integer.valueOf(this.f465979n), java.lang.Integer.valueOf(r17Var.f465979n)) && n51.f.a(java.lang.Integer.valueOf(this.f465980o), java.lang.Integer.valueOf(r17Var.f465980o)) && n51.f.a(java.lang.Boolean.valueOf(this.f465981p), java.lang.Boolean.valueOf(r17Var.f465981p)) && n51.f.a(this.f465982q, r17Var.f465982q) && n51.f.a(this.f465983r, r17Var.f465983r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f465972d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f465973e);
            java.lang.String str2 = this.f465974f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f465975g);
            fVar.e(6, this.f465976h);
            fVar.e(7, this.f465977i);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f465978m;
            if (gVar != null) {
                fVar.b(8, gVar);
            }
            fVar.e(100, this.f465979n);
            fVar.e(101, this.f465980o);
            fVar.a(200, this.f465981p);
            java.lang.String str3 = this.f465982q;
            if (str3 != null) {
                fVar.j(201, str3);
            }
            java.lang.String str4 = this.f465983r;
            if (str4 == null) {
                return 0;
            }
            fVar.j(202, str4);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f465972d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int e17 = i18 + b36.f.e(3, this.f465973e);
            java.lang.String str6 = this.f465974f;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            int e18 = e17 + b36.f.e(5, this.f465975g) + b36.f.e(6, this.f465976h) + b36.f.e(7, this.f465977i);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f465978m;
            if (gVar2 != null) {
                e18 += b36.f.b(8, gVar2);
            }
            int e19 = e18 + b36.f.e(100, this.f465979n) + b36.f.e(101, this.f465980o) + b36.f.a(200, this.f465981p);
            java.lang.String str7 = this.f465982q;
            if (str7 != null) {
                e19 += b36.f.j(201, str7);
            }
            java.lang.String str8 = this.f465983r;
            return str8 != null ? e19 + b36.f.j(202, str8) : e19;
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
        r45.r17 r17Var = (r45.r17) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            r17Var.f465979n = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 101) {
            r17Var.f465980o = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    r17Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                r17Var.f465972d = aVar2.k(intValue);
                return 0;
            case 3:
                r17Var.f465973e = aVar2.g(intValue);
                return 0;
            case 4:
                r17Var.f465974f = aVar2.k(intValue);
                return 0;
            case 5:
                r17Var.f465975g = aVar2.g(intValue);
                return 0;
            case 6:
                r17Var.f465976h = aVar2.g(intValue);
                return 0;
            case 7:
                r17Var.f465977i = aVar2.g(intValue);
                return 0;
            case 8:
                r17Var.f465978m = aVar2.d(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 200:
                        r17Var.f465981p = aVar2.c(intValue);
                        return 0;
                    case 201:
                        r17Var.f465982q = aVar2.k(intValue);
                        return 0;
                    case 202:
                        r17Var.f465983r = aVar2.k(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
