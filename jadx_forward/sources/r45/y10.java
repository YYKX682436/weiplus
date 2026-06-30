package r45;

/* loaded from: classes9.dex */
public class y10 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f472233d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472234e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472235f;

    /* renamed from: g, reason: collision with root package name */
    public r45.r65 f472236g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472237h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f472238i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f472239m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f472240n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f472241o;

    /* renamed from: p, reason: collision with root package name */
    public r45.w10 f472242p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y10)) {
            return false;
        }
        r45.y10 y10Var = (r45.y10) fVar;
        return n51.f.a(this.f76492x92037252, y10Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f472233d), java.lang.Integer.valueOf(y10Var.f472233d)) && n51.f.a(this.f472234e, y10Var.f472234e) && n51.f.a(this.f472235f, y10Var.f472235f) && n51.f.a(this.f472236g, y10Var.f472236g) && n51.f.a(this.f472237h, y10Var.f472237h) && n51.f.a(java.lang.Boolean.valueOf(this.f472238i), java.lang.Boolean.valueOf(y10Var.f472238i)) && n51.f.a(this.f472239m, y10Var.f472239m) && n51.f.a(this.f472240n, y10Var.f472240n) && n51.f.a(this.f472241o, y10Var.f472241o) && n51.f.a(this.f472242p, y10Var.f472242p);
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
            fVar.e(2, this.f472233d);
            java.lang.String str = this.f472234e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f472235f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.r65 r65Var = this.f472236g;
            if (r65Var != null) {
                fVar.i(5, r65Var.mo75928xcd1e8d8());
                this.f472236g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f472237h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.a(7, this.f472238i);
            java.lang.String str4 = this.f472239m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f472240n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f472241o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            r45.w10 w10Var = this.f472242p;
            if (w10Var != null) {
                fVar.i(11, w10Var.mo75928xcd1e8d8());
                this.f472242p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f472233d);
            java.lang.String str7 = this.f472234e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f472235f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            r45.r65 r65Var2 = this.f472236g;
            if (r65Var2 != null) {
                i18 += b36.f.i(5, r65Var2.mo75928xcd1e8d8());
            }
            java.lang.String str9 = this.f472237h;
            if (str9 != null) {
                i18 += b36.f.j(6, str9);
            }
            int a17 = i18 + b36.f.a(7, this.f472238i);
            java.lang.String str10 = this.f472239m;
            if (str10 != null) {
                a17 += b36.f.j(8, str10);
            }
            java.lang.String str11 = this.f472240n;
            if (str11 != null) {
                a17 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f472241o;
            if (str12 != null) {
                a17 += b36.f.j(10, str12);
            }
            r45.w10 w10Var2 = this.f472242p;
            return w10Var2 != null ? a17 + b36.f.i(11, w10Var2.mo75928xcd1e8d8()) : a17;
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
        r45.y10 y10Var = (r45.y10) objArr[1];
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
                    y10Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                y10Var.f472233d = aVar2.g(intValue);
                return 0;
            case 3:
                y10Var.f472234e = aVar2.k(intValue);
                return 0;
            case 4:
                y10Var.f472235f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.r65 r65Var3 = new r45.r65();
                    if (bArr2 != null && bArr2.length > 0) {
                        r65Var3.mo11468x92b714fd(bArr2);
                    }
                    y10Var.f472236g = r65Var3;
                }
                return 0;
            case 6:
                y10Var.f472237h = aVar2.k(intValue);
                return 0;
            case 7:
                y10Var.f472238i = aVar2.c(intValue);
                return 0;
            case 8:
                y10Var.f472239m = aVar2.k(intValue);
                return 0;
            case 9:
                y10Var.f472240n = aVar2.k(intValue);
                return 0;
            case 10:
                y10Var.f472241o = aVar2.k(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.w10 w10Var3 = new r45.w10();
                    if (bArr3 != null && bArr3.length > 0) {
                        w10Var3.mo11468x92b714fd(bArr3);
                    }
                    y10Var.f472242p = w10Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
