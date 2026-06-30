package r45;

/* loaded from: classes4.dex */
public class cl4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f453184d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453185e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f453186f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453187g;

    /* renamed from: h, reason: collision with root package name */
    public r45.g04 f453188h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cl4)) {
            return false;
        }
        r45.cl4 cl4Var = (r45.cl4) fVar;
        return n51.f.a(this.f76492x92037252, cl4Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f453184d), java.lang.Integer.valueOf(cl4Var.f453184d)) && n51.f.a(this.f453185e, cl4Var.f453185e) && n51.f.a(this.f453186f, cl4Var.f453186f) && n51.f.a(this.f453187g, cl4Var.f453187g) && n51.f.a(this.f453188h, cl4Var.f453188h);
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
            fVar.e(2, this.f453184d);
            java.lang.String str = this.f453185e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f453186f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f453187g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.g04 g04Var = this.f453188h;
            if (g04Var != null) {
                fVar.i(6, g04Var.mo75928xcd1e8d8());
                this.f453188h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f453184d);
            java.lang.String str4 = this.f453185e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f453186f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f453187g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            r45.g04 g04Var2 = this.f453188h;
            return g04Var2 != null ? i18 + b36.f.i(6, g04Var2.mo75928xcd1e8d8()) : i18;
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
        r45.cl4 cl4Var = (r45.cl4) objArr[1];
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
                    cl4Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                cl4Var.f453184d = aVar2.g(intValue);
                return 0;
            case 3:
                cl4Var.f453185e = aVar2.k(intValue);
                return 0;
            case 4:
                cl4Var.f453186f = aVar2.k(intValue);
                return 0;
            case 5:
                cl4Var.f453187g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.g04 g04Var3 = new r45.g04();
                    if (bArr2 != null && bArr2.length > 0) {
                        g04Var3.mo11468x92b714fd(bArr2);
                    }
                    cl4Var.f453188h = g04Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
