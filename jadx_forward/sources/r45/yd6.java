package r45;

/* loaded from: classes9.dex */
public class yd6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f472527d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472528e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472529f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472530g;

    /* renamed from: h, reason: collision with root package name */
    public int f472531h;

    /* renamed from: m, reason: collision with root package name */
    public r45.xd6 f472533m;

    /* renamed from: n, reason: collision with root package name */
    public int f472534n;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f472532i = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f472535o = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yd6)) {
            return false;
        }
        r45.yd6 yd6Var = (r45.yd6) fVar;
        return n51.f.a(this.f76494x2de60e5e, yd6Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f472527d), java.lang.Integer.valueOf(yd6Var.f472527d)) && n51.f.a(this.f472528e, yd6Var.f472528e) && n51.f.a(this.f472529f, yd6Var.f472529f) && n51.f.a(this.f472530g, yd6Var.f472530g) && n51.f.a(java.lang.Integer.valueOf(this.f472531h), java.lang.Integer.valueOf(yd6Var.f472531h)) && n51.f.a(this.f472532i, yd6Var.f472532i) && n51.f.a(this.f472533m, yd6Var.f472533m) && n51.f.a(java.lang.Integer.valueOf(this.f472534n), java.lang.Integer.valueOf(yd6Var.f472534n)) && n51.f.a(this.f472535o, yd6Var.f472535o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f472535o;
        java.util.LinkedList linkedList2 = this.f472532i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f472527d);
            java.lang.String str = this.f472528e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f472529f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f472530g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f472531h);
            fVar.g(7, 8, linkedList2);
            r45.xd6 xd6Var = this.f472533m;
            if (xd6Var != null) {
                fVar.i(8, xd6Var.mo75928xcd1e8d8());
                this.f472533m.mo75956x3d5d1f78(fVar);
            }
            fVar.e(9, this.f472534n);
            fVar.g(10, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f472527d);
            java.lang.String str4 = this.f472528e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f472529f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f472530g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            int e17 = i18 + b36.f.e(6, this.f472531h) + b36.f.g(7, 8, linkedList2);
            r45.xd6 xd6Var2 = this.f472533m;
            if (xd6Var2 != null) {
                e17 += b36.f.i(8, xd6Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(9, this.f472534n) + b36.f.g(10, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.yd6 yd6Var = (r45.yd6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    yd6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                yd6Var.f472527d = aVar2.g(intValue);
                return 0;
            case 3:
                yd6Var.f472528e = aVar2.k(intValue);
                return 0;
            case 4:
                yd6Var.f472529f = aVar2.k(intValue);
                return 0;
            case 5:
                yd6Var.f472530g = aVar2.k(intValue);
                return 0;
            case 6:
                yd6Var.f472531h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.ae6 ae6Var = new r45.ae6();
                    if (bArr3 != null && bArr3.length > 0) {
                        ae6Var.mo11468x92b714fd(bArr3);
                    }
                    yd6Var.f472532i.add(ae6Var);
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.xd6 xd6Var3 = new r45.xd6();
                    if (bArr4 != null && bArr4.length > 0) {
                        xd6Var3.mo11468x92b714fd(bArr4);
                    }
                    yd6Var.f472533m = xd6Var3;
                }
                return 0;
            case 9:
                yd6Var.f472534n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.xd6 xd6Var4 = new r45.xd6();
                    if (bArr5 != null && bArr5.length > 0) {
                        xd6Var4.mo11468x92b714fd(bArr5);
                    }
                    yd6Var.f472535o.add(xd6Var4);
                }
                return 0;
            default:
                return -1;
        }
    }
}
