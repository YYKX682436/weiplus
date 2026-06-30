package r45;

/* loaded from: classes7.dex */
public class le3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.jr5 f460900d;

    /* renamed from: e, reason: collision with root package name */
    public r45.jc4 f460901e;

    /* renamed from: f, reason: collision with root package name */
    public int f460902f;

    /* renamed from: g, reason: collision with root package name */
    public int f460903g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f460904h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f460905i;

    /* renamed from: m, reason: collision with root package name */
    public int f460906m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f460907n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f460908o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f460909p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.le3)) {
            return false;
        }
        r45.le3 le3Var = (r45.le3) fVar;
        return n51.f.a(this.f460900d, le3Var.f460900d) && n51.f.a(this.f460901e, le3Var.f460901e) && n51.f.a(java.lang.Integer.valueOf(this.f460902f), java.lang.Integer.valueOf(le3Var.f460902f)) && n51.f.a(java.lang.Integer.valueOf(this.f460903g), java.lang.Integer.valueOf(le3Var.f460903g)) && n51.f.a(java.lang.Boolean.valueOf(this.f460904h), java.lang.Boolean.valueOf(le3Var.f460904h)) && n51.f.a(java.lang.Boolean.valueOf(this.f460905i), java.lang.Boolean.valueOf(le3Var.f460905i)) && n51.f.a(java.lang.Integer.valueOf(this.f460906m), java.lang.Integer.valueOf(le3Var.f460906m)) && n51.f.a(this.f460907n, le3Var.f460907n) && n51.f.a(this.f460908o, le3Var.f460908o) && n51.f.a(this.f460909p, le3Var.f460909p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.jr5 jr5Var = this.f460900d;
            if (jr5Var != null) {
                fVar.i(1, jr5Var.mo75928xcd1e8d8());
                this.f460900d.mo75956x3d5d1f78(fVar);
            }
            r45.jc4 jc4Var = this.f460901e;
            if (jc4Var != null) {
                fVar.i(2, jc4Var.mo75928xcd1e8d8());
                this.f460901e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f460902f);
            fVar.e(4, this.f460903g);
            fVar.a(5, this.f460904h);
            fVar.a(6, this.f460905i);
            fVar.e(7, this.f460906m);
            java.lang.String str = this.f460907n;
            if (str != null) {
                fVar.j(8, str);
            }
            java.lang.String str2 = this.f460908o;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            java.lang.String str3 = this.f460909p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.jr5 jr5Var2 = this.f460900d;
            int i18 = jr5Var2 != null ? 0 + b36.f.i(1, jr5Var2.mo75928xcd1e8d8()) : 0;
            r45.jc4 jc4Var2 = this.f460901e;
            if (jc4Var2 != null) {
                i18 += b36.f.i(2, jc4Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(3, this.f460902f) + b36.f.e(4, this.f460903g) + b36.f.a(5, this.f460904h) + b36.f.a(6, this.f460905i) + b36.f.e(7, this.f460906m);
            java.lang.String str4 = this.f460907n;
            if (str4 != null) {
                e17 += b36.f.j(8, str4);
            }
            java.lang.String str5 = this.f460908o;
            if (str5 != null) {
                e17 += b36.f.j(9, str5);
            }
            java.lang.String str6 = this.f460909p;
            return str6 != null ? e17 + b36.f.j(10, str6) : e17;
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
        r45.le3 le3Var = (r45.le3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.jr5 jr5Var3 = new r45.jr5();
                    if (bArr != null && bArr.length > 0) {
                        jr5Var3.mo11468x92b714fd(bArr);
                    }
                    le3Var.f460900d = jr5Var3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.jc4 jc4Var3 = new r45.jc4();
                    if (bArr2 != null && bArr2.length > 0) {
                        jc4Var3.mo11468x92b714fd(bArr2);
                    }
                    le3Var.f460901e = jc4Var3;
                }
                return 0;
            case 3:
                le3Var.f460902f = aVar2.g(intValue);
                return 0;
            case 4:
                le3Var.f460903g = aVar2.g(intValue);
                return 0;
            case 5:
                le3Var.f460904h = aVar2.c(intValue);
                return 0;
            case 6:
                le3Var.f460905i = aVar2.c(intValue);
                return 0;
            case 7:
                le3Var.f460906m = aVar2.g(intValue);
                return 0;
            case 8:
                le3Var.f460907n = aVar2.k(intValue);
                return 0;
            case 9:
                le3Var.f460908o = aVar2.k(intValue);
                return 0;
            case 10:
                le3Var.f460909p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
