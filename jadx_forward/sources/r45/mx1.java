package r45;

/* loaded from: classes10.dex */
public class mx1 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.yx1 f462414d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f462415e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f462416f;

    /* renamed from: g, reason: collision with root package name */
    public int f462417g;

    /* renamed from: h, reason: collision with root package name */
    public r45.qx1 f462418h;

    /* renamed from: i, reason: collision with root package name */
    public long f462419i;

    /* renamed from: m, reason: collision with root package name */
    public int f462420m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f462421n;

    /* renamed from: o, reason: collision with root package name */
    public int f462422o;

    /* renamed from: p, reason: collision with root package name */
    public r45.fw1 f462423p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mx1)) {
            return false;
        }
        r45.mx1 mx1Var = (r45.mx1) fVar;
        return n51.f.a(this.f76492x92037252, mx1Var.f76492x92037252) && n51.f.a(this.f462414d, mx1Var.f462414d) && n51.f.a(this.f462415e, mx1Var.f462415e) && n51.f.a(java.lang.Integer.valueOf(this.f462416f), java.lang.Integer.valueOf(mx1Var.f462416f)) && n51.f.a(java.lang.Integer.valueOf(this.f462417g), java.lang.Integer.valueOf(mx1Var.f462417g)) && n51.f.a(this.f462418h, mx1Var.f462418h) && n51.f.a(java.lang.Long.valueOf(this.f462419i), java.lang.Long.valueOf(mx1Var.f462419i)) && n51.f.a(java.lang.Integer.valueOf(this.f462420m), java.lang.Integer.valueOf(mx1Var.f462420m)) && n51.f.a(this.f462421n, mx1Var.f462421n) && n51.f.a(java.lang.Integer.valueOf(this.f462422o), java.lang.Integer.valueOf(mx1Var.f462422o)) && n51.f.a(this.f462423p, mx1Var.f462423p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f462415e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.yx1 yx1Var = this.f462414d;
            if (yx1Var != null) {
                fVar.i(2, yx1Var.mo75928xcd1e8d8());
                this.f462414d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f462416f);
            fVar.e(5, this.f462417g);
            r45.qx1 qx1Var = this.f462418h;
            if (qx1Var != null) {
                fVar.i(6, qx1Var.mo75928xcd1e8d8());
                this.f462418h.mo75956x3d5d1f78(fVar);
            }
            fVar.h(7, this.f462419i);
            fVar.e(8, this.f462420m);
            java.lang.String str = this.f462421n;
            if (str != null) {
                fVar.j(9, str);
            }
            fVar.e(10, this.f462422o);
            r45.fw1 fw1Var = this.f462423p;
            if (fw1Var != null) {
                fVar.i(11, fw1Var.mo75928xcd1e8d8());
                this.f462423p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.yx1 yx1Var2 = this.f462414d;
            if (yx1Var2 != null) {
                i18 += b36.f.i(2, yx1Var2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f462416f) + b36.f.e(5, this.f462417g);
            r45.qx1 qx1Var2 = this.f462418h;
            if (qx1Var2 != null) {
                g17 += b36.f.i(6, qx1Var2.mo75928xcd1e8d8());
            }
            int h17 = g17 + b36.f.h(7, this.f462419i) + b36.f.e(8, this.f462420m);
            java.lang.String str2 = this.f462421n;
            if (str2 != null) {
                h17 += b36.f.j(9, str2);
            }
            int e17 = h17 + b36.f.e(10, this.f462422o);
            r45.fw1 fw1Var2 = this.f462423p;
            return fw1Var2 != null ? e17 + b36.f.i(11, fw1Var2.mo75928xcd1e8d8()) : e17;
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
        r45.mx1 mx1Var = (r45.mx1) objArr[1];
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
                    mx1Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.yx1 yx1Var3 = new r45.yx1();
                    if (bArr3 != null && bArr3.length > 0) {
                        yx1Var3.mo11468x92b714fd(bArr3);
                    }
                    mx1Var.f462414d = yx1Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.yx1 yx1Var4 = new r45.yx1();
                    if (bArr4 != null && bArr4.length > 0) {
                        yx1Var4.mo11468x92b714fd(bArr4);
                    }
                    mx1Var.f462415e.add(yx1Var4);
                }
                return 0;
            case 4:
                mx1Var.f462416f = aVar2.g(intValue);
                return 0;
            case 5:
                mx1Var.f462417g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.qx1 qx1Var3 = new r45.qx1();
                    if (bArr5 != null && bArr5.length > 0) {
                        qx1Var3.mo11468x92b714fd(bArr5);
                    }
                    mx1Var.f462418h = qx1Var3;
                }
                return 0;
            case 7:
                mx1Var.f462419i = aVar2.i(intValue);
                return 0;
            case 8:
                mx1Var.f462420m = aVar2.g(intValue);
                return 0;
            case 9:
                mx1Var.f462421n = aVar2.k(intValue);
                return 0;
            case 10:
                mx1Var.f462422o = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.fw1 fw1Var3 = new r45.fw1();
                    if (bArr6 != null && bArr6.length > 0) {
                        fw1Var3.mo11468x92b714fd(bArr6);
                    }
                    mx1Var.f462423p = fw1Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
