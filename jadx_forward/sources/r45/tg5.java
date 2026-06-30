package r45;

/* loaded from: classes9.dex */
public class tg5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f467938d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467939e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cx3 f467940f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f467941g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f467942h;

    /* renamed from: i, reason: collision with root package name */
    public r45.bs f467943i;

    /* renamed from: m, reason: collision with root package name */
    public r45.tw4 f467944m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f467945n;

    /* renamed from: o, reason: collision with root package name */
    public r45.xw3 f467946o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tg5)) {
            return false;
        }
        r45.tg5 tg5Var = (r45.tg5) fVar;
        return n51.f.a(this.f76492x92037252, tg5Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f467938d), java.lang.Integer.valueOf(tg5Var.f467938d)) && n51.f.a(this.f467939e, tg5Var.f467939e) && n51.f.a(this.f467940f, tg5Var.f467940f) && n51.f.a(this.f467941g, tg5Var.f467941g) && n51.f.a(this.f467942h, tg5Var.f467942h) && n51.f.a(this.f467943i, tg5Var.f467943i) && n51.f.a(this.f467944m, tg5Var.f467944m) && n51.f.a(java.lang.Boolean.valueOf(this.f467945n), java.lang.Boolean.valueOf(tg5Var.f467945n)) && n51.f.a(this.f467946o, tg5Var.f467946o);
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
            fVar.e(2, this.f467938d);
            java.lang.String str = this.f467939e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.cx3 cx3Var = this.f467940f;
            if (cx3Var != null) {
                fVar.i(4, cx3Var.mo75928xcd1e8d8());
                this.f467940f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f467941g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f467942h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            r45.bs bsVar = this.f467943i;
            if (bsVar != null) {
                fVar.i(7, bsVar.mo75928xcd1e8d8());
                this.f467943i.mo75956x3d5d1f78(fVar);
            }
            r45.tw4 tw4Var = this.f467944m;
            if (tw4Var != null) {
                fVar.i(8, tw4Var.mo75928xcd1e8d8());
                this.f467944m.mo75956x3d5d1f78(fVar);
            }
            fVar.a(9, this.f467945n);
            r45.xw3 xw3Var = this.f467946o;
            if (xw3Var != null) {
                fVar.i(10, xw3Var.mo75928xcd1e8d8());
                this.f467946o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f467938d);
            java.lang.String str4 = this.f467939e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            r45.cx3 cx3Var2 = this.f467940f;
            if (cx3Var2 != null) {
                i18 += b36.f.i(4, cx3Var2.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f467941g;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f467942h;
            if (str6 != null) {
                i18 += b36.f.j(6, str6);
            }
            r45.bs bsVar2 = this.f467943i;
            if (bsVar2 != null) {
                i18 += b36.f.i(7, bsVar2.mo75928xcd1e8d8());
            }
            r45.tw4 tw4Var2 = this.f467944m;
            if (tw4Var2 != null) {
                i18 += b36.f.i(8, tw4Var2.mo75928xcd1e8d8());
            }
            int a17 = i18 + b36.f.a(9, this.f467945n);
            r45.xw3 xw3Var2 = this.f467946o;
            return xw3Var2 != null ? a17 + b36.f.i(10, xw3Var2.mo75928xcd1e8d8()) : a17;
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
        r45.tg5 tg5Var = (r45.tg5) objArr[1];
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
                    tg5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                tg5Var.f467938d = aVar2.g(intValue);
                return 0;
            case 3:
                tg5Var.f467939e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cx3 cx3Var3 = new r45.cx3();
                    if (bArr2 != null && bArr2.length > 0) {
                        cx3Var3.mo11468x92b714fd(bArr2);
                    }
                    tg5Var.f467940f = cx3Var3;
                }
                return 0;
            case 5:
                tg5Var.f467941g = aVar2.k(intValue);
                return 0;
            case 6:
                tg5Var.f467942h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.bs bsVar3 = new r45.bs();
                    if (bArr3 != null && bArr3.length > 0) {
                        bsVar3.mo11468x92b714fd(bArr3);
                    }
                    tg5Var.f467943i = bsVar3;
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.tw4 tw4Var3 = new r45.tw4();
                    if (bArr4 != null && bArr4.length > 0) {
                        tw4Var3.mo11468x92b714fd(bArr4);
                    }
                    tg5Var.f467944m = tw4Var3;
                }
                return 0;
            case 9:
                tg5Var.f467945n = aVar2.c(intValue);
                return 0;
            case 10:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.xw3 xw3Var3 = new r45.xw3();
                    if (bArr5 != null && bArr5.length > 0) {
                        xw3Var3.mo11468x92b714fd(bArr5);
                    }
                    tg5Var.f467946o = xw3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
