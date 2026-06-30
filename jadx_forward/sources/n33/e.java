package n33;

/* loaded from: classes8.dex */
public class e extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f416027d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f416028e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f416029f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f416030g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f416031h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f416032i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f416033m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f416034n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f416035o;

    /* renamed from: p, reason: collision with root package name */
    public int f416036p;

    /* renamed from: q, reason: collision with root package name */
    public int f416037q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof n33.e)) {
            return false;
        }
        n33.e eVar = (n33.e) fVar;
        return n51.f.a(this.f76494x2de60e5e, eVar.f76494x2de60e5e) && n51.f.a(this.f416027d, eVar.f416027d) && n51.f.a(this.f416028e, eVar.f416028e) && n51.f.a(this.f416029f, eVar.f416029f) && n51.f.a(this.f416030g, eVar.f416030g) && n51.f.a(this.f416031h, eVar.f416031h) && n51.f.a(this.f416032i, eVar.f416032i) && n51.f.a(this.f416033m, eVar.f416033m) && n51.f.a(this.f416034n, eVar.f416034n) && n51.f.a(this.f416035o, eVar.f416035o) && n51.f.a(java.lang.Integer.valueOf(this.f416036p), java.lang.Integer.valueOf(eVar.f416036p)) && n51.f.a(java.lang.Integer.valueOf(this.f416037q), java.lang.Integer.valueOf(eVar.f416037q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f416027d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f416028e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f416029f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f416030g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f416031h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f416032i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f416033m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f416034n;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            java.lang.String str9 = this.f416035o;
            if (str9 != null) {
                fVar.j(10, str9);
            }
            fVar.e(11, this.f416036p);
            fVar.e(12, this.f416037q);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str10 = this.f416027d;
            if (str10 != null) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f416028e;
            if (str11 != null) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f416029f;
            if (str12 != null) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f416030g;
            if (str13 != null) {
                i18 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f416031h;
            if (str14 != null) {
                i18 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f416032i;
            if (str15 != null) {
                i18 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f416033m;
            if (str16 != null) {
                i18 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.f416034n;
            if (str17 != null) {
                i18 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.f416035o;
            if (str18 != null) {
                i18 += b36.f.j(10, str18);
            }
            return i18 + b36.f.e(11, this.f416036p) + b36.f.e(12, this.f416037q);
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
        n33.e eVar = (n33.e) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    eVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                eVar.f416027d = aVar2.k(intValue);
                return 0;
            case 3:
                eVar.f416028e = aVar2.k(intValue);
                return 0;
            case 4:
                eVar.f416029f = aVar2.k(intValue);
                return 0;
            case 5:
                eVar.f416030g = aVar2.k(intValue);
                return 0;
            case 6:
                eVar.f416031h = aVar2.k(intValue);
                return 0;
            case 7:
                eVar.f416032i = aVar2.k(intValue);
                return 0;
            case 8:
                eVar.f416033m = aVar2.k(intValue);
                return 0;
            case 9:
                eVar.f416034n = aVar2.k(intValue);
                return 0;
            case 10:
                eVar.f416035o = aVar2.k(intValue);
                return 0;
            case 11:
                eVar.f416036p = aVar2.g(intValue);
                return 0;
            case 12:
                eVar.f416037q = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
