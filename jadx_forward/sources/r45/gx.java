package r45;

/* loaded from: classes9.dex */
public class gx extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457116d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457117e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457118f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457119g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f457120h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f457121i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f457122m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f457123n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f457124o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f457125p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gx)) {
            return false;
        }
        r45.gx gxVar = (r45.gx) fVar;
        return n51.f.a(this.f76494x2de60e5e, gxVar.f76494x2de60e5e) && n51.f.a(this.f457116d, gxVar.f457116d) && n51.f.a(this.f457117e, gxVar.f457117e) && n51.f.a(this.f457118f, gxVar.f457118f) && n51.f.a(this.f457119g, gxVar.f457119g) && n51.f.a(this.f457120h, gxVar.f457120h) && n51.f.a(this.f457121i, gxVar.f457121i) && n51.f.a(this.f457122m, gxVar.f457122m) && n51.f.a(this.f457123n, gxVar.f457123n) && n51.f.a(java.lang.Boolean.valueOf(this.f457124o), java.lang.Boolean.valueOf(gxVar.f457124o)) && n51.f.a(this.f457125p, gxVar.f457125p);
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
            java.lang.String str = this.f457116d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f457117e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f457118f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f457119g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f457120h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f457121i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f457122m;
            if (gVar != null) {
                fVar.b(8, gVar);
            }
            java.lang.String str7 = this.f457123n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            fVar.a(10, this.f457124o);
            java.lang.String str8 = this.f457125p;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str9 = this.f457116d;
            if (str9 != null) {
                i18 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f457117e;
            if (str10 != null) {
                i18 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f457118f;
            if (str11 != null) {
                i18 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f457119g;
            if (str12 != null) {
                i18 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f457120h;
            if (str13 != null) {
                i18 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f457121i;
            if (str14 != null) {
                i18 += b36.f.j(7, str14);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f457122m;
            if (gVar2 != null) {
                i18 += b36.f.b(8, gVar2);
            }
            java.lang.String str15 = this.f457123n;
            if (str15 != null) {
                i18 += b36.f.j(9, str15);
            }
            int a17 = i18 + b36.f.a(10, this.f457124o);
            java.lang.String str16 = this.f457125p;
            return str16 != null ? a17 + b36.f.j(11, str16) : a17;
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
        r45.gx gxVar = (r45.gx) objArr[1];
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
                    gxVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                gxVar.f457116d = aVar2.k(intValue);
                return 0;
            case 3:
                gxVar.f457117e = aVar2.k(intValue);
                return 0;
            case 4:
                gxVar.f457118f = aVar2.k(intValue);
                return 0;
            case 5:
                gxVar.f457119g = aVar2.k(intValue);
                return 0;
            case 6:
                gxVar.f457120h = aVar2.k(intValue);
                return 0;
            case 7:
                gxVar.f457121i = aVar2.k(intValue);
                return 0;
            case 8:
                gxVar.f457122m = aVar2.d(intValue);
                return 0;
            case 9:
                gxVar.f457123n = aVar2.k(intValue);
                return 0;
            case 10:
                gxVar.f457124o = aVar2.c(intValue);
                return 0;
            case 11:
                gxVar.f457125p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
