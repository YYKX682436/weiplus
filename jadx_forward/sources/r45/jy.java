package r45;

/* loaded from: classes9.dex */
public class jy extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f459738d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459739e;

    /* renamed from: f, reason: collision with root package name */
    public r45.g04 f459740f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459741g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f459742h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f459743i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f459744m;

    /* renamed from: n, reason: collision with root package name */
    public int f459745n;

    /* renamed from: o, reason: collision with root package name */
    public r45.tr6 f459746o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jy)) {
            return false;
        }
        r45.jy jyVar = (r45.jy) fVar;
        return n51.f.a(this.f76492x92037252, jyVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f459738d), java.lang.Integer.valueOf(jyVar.f459738d)) && n51.f.a(this.f459739e, jyVar.f459739e) && n51.f.a(this.f459740f, jyVar.f459740f) && n51.f.a(this.f459741g, jyVar.f459741g) && n51.f.a(this.f459742h, jyVar.f459742h) && n51.f.a(this.f459743i, jyVar.f459743i) && n51.f.a(this.f459744m, jyVar.f459744m) && n51.f.a(java.lang.Integer.valueOf(this.f459745n), java.lang.Integer.valueOf(jyVar.f459745n)) && n51.f.a(this.f459746o, jyVar.f459746o);
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
            fVar.e(2, this.f459738d);
            java.lang.String str = this.f459739e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.g04 g04Var = this.f459740f;
            if (g04Var != null) {
                fVar.i(4, g04Var.mo75928xcd1e8d8());
                this.f459740f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f459741g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f459742h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f459743i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f459744m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.e(9, this.f459745n);
            r45.tr6 tr6Var = this.f459746o;
            if (tr6Var != null) {
                fVar.i(10, tr6Var.mo75928xcd1e8d8());
                this.f459746o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f459738d);
            java.lang.String str6 = this.f459739e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            r45.g04 g04Var2 = this.f459740f;
            if (g04Var2 != null) {
                i18 += b36.f.i(4, g04Var2.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f459741g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f459742h;
            if (str8 != null) {
                i18 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f459743i;
            if (str9 != null) {
                i18 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f459744m;
            if (str10 != null) {
                i18 += b36.f.j(8, str10);
            }
            int e17 = i18 + b36.f.e(9, this.f459745n);
            r45.tr6 tr6Var2 = this.f459746o;
            return tr6Var2 != null ? e17 + b36.f.i(10, tr6Var2.mo75928xcd1e8d8()) : e17;
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
        r45.jy jyVar = (r45.jy) objArr[1];
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
                    jyVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                jyVar.f459738d = aVar2.g(intValue);
                return 0;
            case 3:
                jyVar.f459739e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.g04 g04Var3 = new r45.g04();
                    if (bArr2 != null && bArr2.length > 0) {
                        g04Var3.mo11468x92b714fd(bArr2);
                    }
                    jyVar.f459740f = g04Var3;
                }
                return 0;
            case 5:
                jyVar.f459741g = aVar2.k(intValue);
                return 0;
            case 6:
                jyVar.f459742h = aVar2.k(intValue);
                return 0;
            case 7:
                jyVar.f459743i = aVar2.k(intValue);
                return 0;
            case 8:
                jyVar.f459744m = aVar2.k(intValue);
                return 0;
            case 9:
                jyVar.f459745n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.tr6 tr6Var3 = new r45.tr6();
                    if (bArr3 != null && bArr3.length > 0) {
                        tr6Var3.mo11468x92b714fd(bArr3);
                    }
                    jyVar.f459746o = tr6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
