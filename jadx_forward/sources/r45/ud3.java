package r45;

/* loaded from: classes9.dex */
public class ud3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f468788d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468789e;

    /* renamed from: f, reason: collision with root package name */
    public int f468790f;

    /* renamed from: g, reason: collision with root package name */
    public int f468791g;

    /* renamed from: h, reason: collision with root package name */
    public r45.au f468792h;

    /* renamed from: i, reason: collision with root package name */
    public r45.iu f468793i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f468794m;

    /* renamed from: n, reason: collision with root package name */
    public int f468795n;

    /* renamed from: o, reason: collision with root package name */
    public int f468796o;

    /* renamed from: p, reason: collision with root package name */
    public r45.ru f468797p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ud3)) {
            return false;
        }
        r45.ud3 ud3Var = (r45.ud3) fVar;
        return n51.f.a(this.f76492x92037252, ud3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f468788d), java.lang.Integer.valueOf(ud3Var.f468788d)) && n51.f.a(this.f468789e, ud3Var.f468789e) && n51.f.a(java.lang.Integer.valueOf(this.f468790f), java.lang.Integer.valueOf(ud3Var.f468790f)) && n51.f.a(java.lang.Integer.valueOf(this.f468791g), java.lang.Integer.valueOf(ud3Var.f468791g)) && n51.f.a(this.f468792h, ud3Var.f468792h) && n51.f.a(this.f468793i, ud3Var.f468793i) && n51.f.a(this.f468794m, ud3Var.f468794m) && n51.f.a(java.lang.Integer.valueOf(this.f468795n), java.lang.Integer.valueOf(ud3Var.f468795n)) && n51.f.a(java.lang.Integer.valueOf(this.f468796o), java.lang.Integer.valueOf(ud3Var.f468796o)) && n51.f.a(this.f468797p, ud3Var.f468797p);
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
            fVar.e(2, this.f468788d);
            java.lang.String str = this.f468789e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f468790f);
            fVar.e(5, this.f468791g);
            r45.au auVar = this.f468792h;
            if (auVar != null) {
                fVar.i(6, auVar.mo75928xcd1e8d8());
                this.f468792h.mo75956x3d5d1f78(fVar);
            }
            r45.iu iuVar = this.f468793i;
            if (iuVar != null) {
                fVar.i(7, iuVar.mo75928xcd1e8d8());
                this.f468793i.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f468794m;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            fVar.e(9, this.f468795n);
            fVar.e(10, this.f468796o);
            r45.ru ruVar = this.f468797p;
            if (ruVar != null) {
                fVar.i(11, ruVar.mo75928xcd1e8d8());
                this.f468797p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f468788d);
            java.lang.String str3 = this.f468789e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int e17 = i18 + b36.f.e(4, this.f468790f) + b36.f.e(5, this.f468791g);
            r45.au auVar2 = this.f468792h;
            if (auVar2 != null) {
                e17 += b36.f.i(6, auVar2.mo75928xcd1e8d8());
            }
            r45.iu iuVar2 = this.f468793i;
            if (iuVar2 != null) {
                e17 += b36.f.i(7, iuVar2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f468794m;
            if (str4 != null) {
                e17 += b36.f.j(8, str4);
            }
            int e18 = e17 + b36.f.e(9, this.f468795n) + b36.f.e(10, this.f468796o);
            r45.ru ruVar2 = this.f468797p;
            return ruVar2 != null ? e18 + b36.f.i(11, ruVar2.mo75928xcd1e8d8()) : e18;
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
        r45.ud3 ud3Var = (r45.ud3) objArr[1];
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
                    ud3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                ud3Var.f468788d = aVar2.g(intValue);
                return 0;
            case 3:
                ud3Var.f468789e = aVar2.k(intValue);
                return 0;
            case 4:
                ud3Var.f468790f = aVar2.g(intValue);
                return 0;
            case 5:
                ud3Var.f468791g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.au auVar3 = new r45.au();
                    if (bArr2 != null && bArr2.length > 0) {
                        auVar3.mo11468x92b714fd(bArr2);
                    }
                    ud3Var.f468792h = auVar3;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.iu iuVar3 = new r45.iu();
                    if (bArr3 != null && bArr3.length > 0) {
                        iuVar3.mo11468x92b714fd(bArr3);
                    }
                    ud3Var.f468793i = iuVar3;
                }
                return 0;
            case 8:
                ud3Var.f468794m = aVar2.k(intValue);
                return 0;
            case 9:
                ud3Var.f468795n = aVar2.g(intValue);
                return 0;
            case 10:
                ud3Var.f468796o = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.ru ruVar3 = new r45.ru();
                    if (bArr4 != null && bArr4.length > 0) {
                        ruVar3.mo11468x92b714fd(bArr4);
                    }
                    ud3Var.f468797p = ruVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
