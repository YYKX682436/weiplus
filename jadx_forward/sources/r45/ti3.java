package r45;

/* loaded from: classes9.dex */
public class ti3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f467997d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467998e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu f467999f;

    /* renamed from: g, reason: collision with root package name */
    public int f468000g;

    /* renamed from: h, reason: collision with root package name */
    public int f468001h;

    /* renamed from: i, reason: collision with root package name */
    public r45.zt f468002i;

    /* renamed from: m, reason: collision with root package name */
    public r45.xt f468003m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f468004n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ti3)) {
            return false;
        }
        r45.ti3 ti3Var = (r45.ti3) fVar;
        return n51.f.a(this.f76492x92037252, ti3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f467997d), java.lang.Integer.valueOf(ti3Var.f467997d)) && n51.f.a(this.f467998e, ti3Var.f467998e) && n51.f.a(this.f467999f, ti3Var.f467999f) && n51.f.a(java.lang.Integer.valueOf(this.f468000g), java.lang.Integer.valueOf(ti3Var.f468000g)) && n51.f.a(java.lang.Integer.valueOf(this.f468001h), java.lang.Integer.valueOf(ti3Var.f468001h)) && n51.f.a(this.f468002i, ti3Var.f468002i) && n51.f.a(this.f468003m, ti3Var.f468003m) && n51.f.a(this.f468004n, ti3Var.f468004n);
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
            fVar.e(2, this.f467997d);
            java.lang.String str = this.f467998e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.cu cuVar = this.f467999f;
            if (cuVar != null) {
                fVar.i(4, cuVar.mo75928xcd1e8d8());
                this.f467999f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f468000g);
            fVar.e(6, this.f468001h);
            r45.zt ztVar = this.f468002i;
            if (ztVar != null) {
                fVar.i(7, ztVar.mo75928xcd1e8d8());
                this.f468002i.mo75956x3d5d1f78(fVar);
            }
            r45.xt xtVar = this.f468003m;
            if (xtVar != null) {
                fVar.i(8, xtVar.mo75928xcd1e8d8());
                this.f468003m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f468004n;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f467997d);
            java.lang.String str3 = this.f467998e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            r45.cu cuVar2 = this.f467999f;
            if (cuVar2 != null) {
                i18 += b36.f.i(4, cuVar2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(5, this.f468000g) + b36.f.e(6, this.f468001h);
            r45.zt ztVar2 = this.f468002i;
            if (ztVar2 != null) {
                e17 += b36.f.i(7, ztVar2.mo75928xcd1e8d8());
            }
            r45.xt xtVar2 = this.f468003m;
            if (xtVar2 != null) {
                e17 += b36.f.i(8, xtVar2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f468004n;
            return str4 != null ? e17 + b36.f.j(9, str4) : e17;
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
        r45.ti3 ti3Var = (r45.ti3) objArr[1];
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
                    ti3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                ti3Var.f467997d = aVar2.g(intValue);
                return 0;
            case 3:
                ti3Var.f467998e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu cuVar3 = new r45.cu();
                    if (bArr2 != null && bArr2.length > 0) {
                        cuVar3.mo11468x92b714fd(bArr2);
                    }
                    ti3Var.f467999f = cuVar3;
                }
                return 0;
            case 5:
                ti3Var.f468000g = aVar2.g(intValue);
                return 0;
            case 6:
                ti3Var.f468001h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.zt ztVar3 = new r45.zt();
                    if (bArr3 != null && bArr3.length > 0) {
                        ztVar3.mo11468x92b714fd(bArr3);
                    }
                    ti3Var.f468002i = ztVar3;
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.xt xtVar3 = new r45.xt();
                    if (bArr4 != null && bArr4.length > 0) {
                        xtVar3.mo11468x92b714fd(bArr4);
                    }
                    ti3Var.f468003m = xtVar3;
                }
                return 0;
            case 9:
                ti3Var.f468004n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
