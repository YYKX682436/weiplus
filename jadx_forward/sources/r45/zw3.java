package r45;

/* loaded from: classes9.dex */
public class zw3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f473953d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473954e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f473955f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public r45.z75 f473956g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ft5 f473957h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f473958i;

    /* renamed from: m, reason: collision with root package name */
    public r45.rd f473959m;

    /* renamed from: n, reason: collision with root package name */
    public r45.tw4 f473960n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f473961o;

    /* renamed from: p, reason: collision with root package name */
    public r45.xw3 f473962p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zw3)) {
            return false;
        }
        r45.zw3 zw3Var = (r45.zw3) fVar;
        return n51.f.a(this.f76492x92037252, zw3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f473953d), java.lang.Integer.valueOf(zw3Var.f473953d)) && n51.f.a(this.f473954e, zw3Var.f473954e) && n51.f.a(this.f473955f, zw3Var.f473955f) && n51.f.a(this.f473956g, zw3Var.f473956g) && n51.f.a(this.f473957h, zw3Var.f473957h) && n51.f.a(java.lang.Boolean.valueOf(this.f473958i), java.lang.Boolean.valueOf(zw3Var.f473958i)) && n51.f.a(this.f473959m, zw3Var.f473959m) && n51.f.a(this.f473960n, zw3Var.f473960n) && n51.f.a(java.lang.Boolean.valueOf(this.f473961o), java.lang.Boolean.valueOf(zw3Var.f473961o)) && n51.f.a(this.f473962p, zw3Var.f473962p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f473955f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f473953d);
            java.lang.String str = this.f473954e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList);
            r45.z75 z75Var = this.f473956g;
            if (z75Var != null) {
                fVar.i(5, z75Var.mo75928xcd1e8d8());
                this.f473956g.mo75956x3d5d1f78(fVar);
            }
            r45.ft5 ft5Var = this.f473957h;
            if (ft5Var != null) {
                fVar.i(6, ft5Var.mo75928xcd1e8d8());
                this.f473957h.mo75956x3d5d1f78(fVar);
            }
            fVar.a(7, this.f473958i);
            r45.rd rdVar = this.f473959m;
            if (rdVar != null) {
                fVar.i(8, rdVar.mo75928xcd1e8d8());
                this.f473959m.mo75956x3d5d1f78(fVar);
            }
            r45.tw4 tw4Var = this.f473960n;
            if (tw4Var != null) {
                fVar.i(9, tw4Var.mo75928xcd1e8d8());
                this.f473960n.mo75956x3d5d1f78(fVar);
            }
            fVar.a(10, this.f473961o);
            r45.xw3 xw3Var = this.f473962p;
            if (xw3Var != null) {
                fVar.i(11, xw3Var.mo75928xcd1e8d8());
                this.f473962p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f473953d);
            java.lang.String str2 = this.f473954e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList);
            r45.z75 z75Var2 = this.f473956g;
            if (z75Var2 != null) {
                g17 += b36.f.i(5, z75Var2.mo75928xcd1e8d8());
            }
            r45.ft5 ft5Var2 = this.f473957h;
            if (ft5Var2 != null) {
                g17 += b36.f.i(6, ft5Var2.mo75928xcd1e8d8());
            }
            int a17 = g17 + b36.f.a(7, this.f473958i);
            r45.rd rdVar2 = this.f473959m;
            if (rdVar2 != null) {
                a17 += b36.f.i(8, rdVar2.mo75928xcd1e8d8());
            }
            r45.tw4 tw4Var2 = this.f473960n;
            if (tw4Var2 != null) {
                a17 += b36.f.i(9, tw4Var2.mo75928xcd1e8d8());
            }
            int a18 = a17 + b36.f.a(10, this.f473961o);
            r45.xw3 xw3Var2 = this.f473962p;
            return xw3Var2 != null ? a18 + b36.f.i(11, xw3Var2.mo75928xcd1e8d8()) : a18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.zw3 zw3Var = (r45.zw3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    zw3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                zw3Var.f473953d = aVar2.g(intValue);
                return 0;
            case 3:
                zw3Var.f473954e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.ax3 ax3Var = new r45.ax3();
                    if (bArr3 != null && bArr3.length > 0) {
                        ax3Var.mo11468x92b714fd(bArr3);
                    }
                    zw3Var.f473955f.add(ax3Var);
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.z75 z75Var3 = new r45.z75();
                    if (bArr4 != null && bArr4.length > 0) {
                        z75Var3.mo11468x92b714fd(bArr4);
                    }
                    zw3Var.f473956g = z75Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.ft5 ft5Var3 = new r45.ft5();
                    if (bArr5 != null && bArr5.length > 0) {
                        ft5Var3.mo11468x92b714fd(bArr5);
                    }
                    zw3Var.f473957h = ft5Var3;
                }
                return 0;
            case 7:
                zw3Var.f473958i = aVar2.c(intValue);
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.rd rdVar3 = new r45.rd();
                    if (bArr6 != null && bArr6.length > 0) {
                        rdVar3.mo11468x92b714fd(bArr6);
                    }
                    zw3Var.f473959m = rdVar3;
                }
                return 0;
            case 9:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.tw4 tw4Var3 = new r45.tw4();
                    if (bArr7 != null && bArr7.length > 0) {
                        tw4Var3.mo11468x92b714fd(bArr7);
                    }
                    zw3Var.f473960n = tw4Var3;
                }
                return 0;
            case 10:
                zw3Var.f473961o = aVar2.c(intValue);
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.xw3 xw3Var3 = new r45.xw3();
                    if (bArr8 != null && bArr8.length > 0) {
                        xw3Var3.mo11468x92b714fd(bArr8);
                    }
                    zw3Var.f473962p = xw3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
