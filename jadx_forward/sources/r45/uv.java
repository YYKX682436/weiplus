package r45;

/* loaded from: classes9.dex */
public class uv extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f469188d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469189e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469190f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469191g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f469192h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f469193i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f469194m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f469195n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f469196o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uv)) {
            return false;
        }
        r45.uv uvVar = (r45.uv) fVar;
        return n51.f.a(this.f76494x2de60e5e, uvVar.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f469188d), java.lang.Integer.valueOf(uvVar.f469188d)) && n51.f.a(this.f469189e, uvVar.f469189e) && n51.f.a(this.f469190f, uvVar.f469190f) && n51.f.a(this.f469191g, uvVar.f469191g) && n51.f.a(this.f469192h, uvVar.f469192h) && n51.f.a(this.f469193i, uvVar.f469193i) && n51.f.a(this.f469194m, uvVar.f469194m) && n51.f.a(this.f469195n, uvVar.f469195n) && n51.f.a(this.f469196o, uvVar.f469196o);
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
            fVar.e(2, this.f469188d);
            java.lang.String str = this.f469189e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f469190f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f469191g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f469192h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f469193i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f469194m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f469195n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f469196o;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f469188d);
            java.lang.String str9 = this.f469189e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f469190f;
            if (str10 != null) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f469191g;
            if (str11 != null) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f469192h;
            if (str12 != null) {
                i18 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f469193i;
            if (str13 != null) {
                i18 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f469194m;
            if (str14 != null) {
                i18 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f469195n;
            if (str15 != null) {
                i18 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f469196o;
            return str16 != null ? i18 + b36.f.j(10, str16) : i18;
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
        r45.uv uvVar = (r45.uv) objArr[1];
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
                    uvVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                uvVar.f469188d = aVar2.g(intValue);
                return 0;
            case 3:
                uvVar.f469189e = aVar2.k(intValue);
                return 0;
            case 4:
                uvVar.f469190f = aVar2.k(intValue);
                return 0;
            case 5:
                uvVar.f469191g = aVar2.k(intValue);
                return 0;
            case 6:
                uvVar.f469192h = aVar2.k(intValue);
                return 0;
            case 7:
                uvVar.f469193i = aVar2.k(intValue);
                return 0;
            case 8:
                uvVar.f469194m = aVar2.k(intValue);
                return 0;
            case 9:
                uvVar.f469195n = aVar2.k(intValue);
                return 0;
            case 10:
                uvVar.f469196o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
