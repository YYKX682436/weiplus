package r45;

/* loaded from: classes9.dex */
public class fx extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f456198d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456199e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456200f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456201g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456202h;

    /* renamed from: i, reason: collision with root package name */
    public int f456203i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f456204m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f456205n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f456206o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fx)) {
            return false;
        }
        r45.fx fxVar = (r45.fx) fVar;
        return n51.f.a(this.f76492x92037252, fxVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f456198d), java.lang.Integer.valueOf(fxVar.f456198d)) && n51.f.a(this.f456199e, fxVar.f456199e) && n51.f.a(this.f456200f, fxVar.f456200f) && n51.f.a(this.f456201g, fxVar.f456201g) && n51.f.a(this.f456202h, fxVar.f456202h) && n51.f.a(java.lang.Integer.valueOf(this.f456203i), java.lang.Integer.valueOf(fxVar.f456203i)) && n51.f.a(this.f456204m, fxVar.f456204m) && n51.f.a(this.f456205n, fxVar.f456205n) && n51.f.a(this.f456206o, fxVar.f456206o);
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
            fVar.e(2, this.f456198d);
            java.lang.String str = this.f456199e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f456200f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f456201g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f456202h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f456203i);
            java.lang.String str5 = this.f456204m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f456205n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f456206o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f456198d);
            java.lang.String str8 = this.f456199e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f456200f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f456201g;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f456202h;
            if (str11 != null) {
                i18 += b36.f.j(6, str11);
            }
            int e17 = i18 + b36.f.e(7, this.f456203i);
            java.lang.String str12 = this.f456204m;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f456205n;
            if (str13 != null) {
                e17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f456206o;
            return str14 != null ? e17 + b36.f.j(10, str14) : e17;
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
        r45.fx fxVar = (r45.fx) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
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
                    fxVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                fxVar.f456198d = aVar2.g(intValue);
                return 0;
            case 3:
                fxVar.f456199e = aVar2.k(intValue);
                return 0;
            case 4:
                fxVar.f456200f = aVar2.k(intValue);
                return 0;
            case 5:
                fxVar.f456201g = aVar2.k(intValue);
                return 0;
            case 6:
                fxVar.f456202h = aVar2.k(intValue);
                return 0;
            case 7:
                fxVar.f456203i = aVar2.g(intValue);
                return 0;
            case 8:
                fxVar.f456204m = aVar2.k(intValue);
                return 0;
            case 9:
                fxVar.f456205n = aVar2.k(intValue);
                return 0;
            case 10:
                fxVar.f456206o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
