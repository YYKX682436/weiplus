package r45;

/* loaded from: classes7.dex */
public class gy5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457175d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457176e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457177f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457178g;

    /* renamed from: h, reason: collision with root package name */
    public int f457179h;

    /* renamed from: i, reason: collision with root package name */
    public int f457180i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f457181m;

    /* renamed from: n, reason: collision with root package name */
    public int f457182n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gy5)) {
            return false;
        }
        r45.gy5 gy5Var = (r45.gy5) fVar;
        return n51.f.a(this.f76494x2de60e5e, gy5Var.f76494x2de60e5e) && n51.f.a(this.f457175d, gy5Var.f457175d) && n51.f.a(this.f457176e, gy5Var.f457176e) && n51.f.a(this.f457177f, gy5Var.f457177f) && n51.f.a(this.f457178g, gy5Var.f457178g) && n51.f.a(java.lang.Integer.valueOf(this.f457179h), java.lang.Integer.valueOf(gy5Var.f457179h)) && n51.f.a(java.lang.Integer.valueOf(this.f457180i), java.lang.Integer.valueOf(gy5Var.f457180i)) && n51.f.a(this.f457181m, gy5Var.f457181m) && n51.f.a(java.lang.Integer.valueOf(this.f457182n), java.lang.Integer.valueOf(gy5Var.f457182n));
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
            java.lang.String str = this.f457175d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f457176e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f457177f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f457178g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f457179h);
            fVar.e(7, this.f457180i);
            java.lang.String str5 = this.f457181m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.e(9, this.f457182n);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str6 = this.f457175d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f457176e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f457177f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f457178g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            int e17 = i18 + b36.f.e(6, this.f457179h) + b36.f.e(7, this.f457180i);
            java.lang.String str10 = this.f457181m;
            if (str10 != null) {
                e17 += b36.f.j(8, str10);
            }
            return e17 + b36.f.e(9, this.f457182n);
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
        r45.gy5 gy5Var = (r45.gy5) objArr[1];
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
                    gy5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                gy5Var.f457175d = aVar2.k(intValue);
                return 0;
            case 3:
                gy5Var.f457176e = aVar2.k(intValue);
                return 0;
            case 4:
                gy5Var.f457177f = aVar2.k(intValue);
                return 0;
            case 5:
                gy5Var.f457178g = aVar2.k(intValue);
                return 0;
            case 6:
                gy5Var.f457179h = aVar2.g(intValue);
                return 0;
            case 7:
                gy5Var.f457180i = aVar2.g(intValue);
                return 0;
            case 8:
                gy5Var.f457181m = aVar2.k(intValue);
                return 0;
            case 9:
                gy5Var.f457182n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
