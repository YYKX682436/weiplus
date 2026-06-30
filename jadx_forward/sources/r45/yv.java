package r45;

/* loaded from: classes9.dex */
public class yv extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472918d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472919e;

    /* renamed from: f, reason: collision with root package name */
    public int f472920f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472921g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472922h;

    /* renamed from: i, reason: collision with root package name */
    public int f472923i;

    /* renamed from: m, reason: collision with root package name */
    public int f472924m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f472925n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f472926o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yv)) {
            return false;
        }
        r45.yv yvVar = (r45.yv) fVar;
        return n51.f.a(this.f76494x2de60e5e, yvVar.f76494x2de60e5e) && n51.f.a(this.f472918d, yvVar.f472918d) && n51.f.a(this.f472919e, yvVar.f472919e) && n51.f.a(java.lang.Integer.valueOf(this.f472920f), java.lang.Integer.valueOf(yvVar.f472920f)) && n51.f.a(this.f472921g, yvVar.f472921g) && n51.f.a(this.f472922h, yvVar.f472922h) && n51.f.a(java.lang.Integer.valueOf(this.f472923i), java.lang.Integer.valueOf(yvVar.f472923i)) && n51.f.a(java.lang.Integer.valueOf(this.f472924m), java.lang.Integer.valueOf(yvVar.f472924m)) && n51.f.a(this.f472925n, yvVar.f472925n) && n51.f.a(this.f472926o, yvVar.f472926o);
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
            java.lang.String str = this.f472918d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f472919e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f472920f);
            java.lang.String str3 = this.f472921g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f472922h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f472923i);
            fVar.e(8, this.f472924m);
            java.lang.String str5 = this.f472925n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f472926o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str7 = this.f472918d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f472919e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            int e17 = i18 + b36.f.e(4, this.f472920f);
            java.lang.String str9 = this.f472921g;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f472922h;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            int e18 = e17 + b36.f.e(7, this.f472923i) + b36.f.e(8, this.f472924m);
            java.lang.String str11 = this.f472925n;
            if (str11 != null) {
                e18 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f472926o;
            return str12 != null ? e18 + b36.f.j(10, str12) : e18;
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
        r45.yv yvVar = (r45.yv) objArr[1];
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
                    yvVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                yvVar.f472918d = aVar2.k(intValue);
                return 0;
            case 3:
                yvVar.f472919e = aVar2.k(intValue);
                return 0;
            case 4:
                yvVar.f472920f = aVar2.g(intValue);
                return 0;
            case 5:
                yvVar.f472921g = aVar2.k(intValue);
                return 0;
            case 6:
                yvVar.f472922h = aVar2.k(intValue);
                return 0;
            case 7:
                yvVar.f472923i = aVar2.g(intValue);
                return 0;
            case 8:
                yvVar.f472924m = aVar2.g(intValue);
                return 0;
            case 9:
                yvVar.f472925n = aVar2.k(intValue);
                return 0;
            case 10:
                yvVar.f472926o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
