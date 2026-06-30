package r45;

/* loaded from: classes9.dex */
public class xv extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f471998d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f471999e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472000f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472001g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472002h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f472003i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f472004m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f472005n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xv)) {
            return false;
        }
        r45.xv xvVar = (r45.xv) fVar;
        return n51.f.a(this.f76492x92037252, xvVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f471998d), java.lang.Integer.valueOf(xvVar.f471998d)) && n51.f.a(this.f471999e, xvVar.f471999e) && n51.f.a(this.f472000f, xvVar.f472000f) && n51.f.a(this.f472001g, xvVar.f472001g) && n51.f.a(this.f472002h, xvVar.f472002h) && n51.f.a(this.f472003i, xvVar.f472003i) && n51.f.a(this.f472004m, xvVar.f472004m) && n51.f.a(this.f472005n, xvVar.f472005n);
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
            fVar.e(2, this.f471998d);
            java.lang.String str = this.f471999e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f472000f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f472001g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f472002h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f472003i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f472004m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f472005n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f471998d);
            java.lang.String str8 = this.f471999e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f472000f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f472001g;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f472002h;
            if (str11 != null) {
                i18 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f472003i;
            if (str12 != null) {
                i18 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f472004m;
            if (str13 != null) {
                i18 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f472005n;
            return str14 != null ? i18 + b36.f.j(9, str14) : i18;
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
        r45.xv xvVar = (r45.xv) objArr[1];
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
                    xvVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                xvVar.f471998d = aVar2.g(intValue);
                return 0;
            case 3:
                xvVar.f471999e = aVar2.k(intValue);
                return 0;
            case 4:
                xvVar.f472000f = aVar2.k(intValue);
                return 0;
            case 5:
                xvVar.f472001g = aVar2.k(intValue);
                return 0;
            case 6:
                xvVar.f472002h = aVar2.k(intValue);
                return 0;
            case 7:
                xvVar.f472003i = aVar2.k(intValue);
                return 0;
            case 8:
                xvVar.f472004m = aVar2.k(intValue);
                return 0;
            case 9:
                xvVar.f472005n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
