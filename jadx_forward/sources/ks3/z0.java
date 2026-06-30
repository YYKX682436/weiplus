package ks3;

/* loaded from: classes8.dex */
public class z0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f393326d;

    /* renamed from: e, reason: collision with root package name */
    public ks3.x0 f393327e;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f393331i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f393332m;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f393335p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f393336q;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f393328f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f393329g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f393330h = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f393333n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f393334o = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.z0)) {
            return false;
        }
        ks3.z0 z0Var = (ks3.z0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f393326d), java.lang.Integer.valueOf(z0Var.f393326d)) && n51.f.a(this.f393327e, z0Var.f393327e) && n51.f.a(this.f393328f, z0Var.f393328f) && n51.f.a(this.f393329g, z0Var.f393329g) && n51.f.a(this.f393330h, z0Var.f393330h) && n51.f.a(this.f393331i, z0Var.f393331i) && n51.f.a(this.f393332m, z0Var.f393332m) && n51.f.a(this.f393333n, z0Var.f393333n) && n51.f.a(this.f393334o, z0Var.f393334o) && n51.f.a(this.f393335p, z0Var.f393335p) && n51.f.a(java.lang.Boolean.valueOf(this.f393336q), java.lang.Boolean.valueOf(z0Var.f393336q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f393334o;
        java.util.LinkedList linkedList2 = this.f393333n;
        java.util.LinkedList linkedList3 = this.f393330h;
        java.util.LinkedList linkedList4 = this.f393329g;
        java.util.LinkedList linkedList5 = this.f393328f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f393326d);
            ks3.x0 x0Var = this.f393327e;
            if (x0Var != null) {
                fVar.i(2, x0Var.mo75928xcd1e8d8());
                this.f393327e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList5);
            fVar.g(4, 8, linkedList4);
            fVar.g(5, 8, linkedList3);
            java.lang.String str = this.f393331i;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f393332m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.g(8, 8, linkedList2);
            fVar.g(9, 8, linkedList);
            java.lang.String str3 = this.f393335p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            fVar.a(11, this.f393336q);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f393326d) + 0;
            ks3.x0 x0Var2 = this.f393327e;
            if (x0Var2 != null) {
                e17 += b36.f.i(2, x0Var2.mo75928xcd1e8d8());
            }
            int g17 = e17 + b36.f.g(3, 8, linkedList5) + b36.f.g(4, 8, linkedList4) + b36.f.g(5, 8, linkedList3);
            java.lang.String str4 = this.f393331i;
            if (str4 != null) {
                g17 += b36.f.j(6, str4);
            }
            java.lang.String str5 = this.f393332m;
            if (str5 != null) {
                g17 += b36.f.j(7, str5);
            }
            int g18 = g17 + b36.f.g(8, 8, linkedList2) + b36.f.g(9, 8, linkedList);
            java.lang.String str6 = this.f393335p;
            if (str6 != null) {
                g18 += b36.f.j(10, str6);
            }
            return g18 + b36.f.a(11, this.f393336q);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
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
        ks3.z0 z0Var = (ks3.z0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                z0Var.f393326d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    ks3.x0 x0Var3 = new ks3.x0();
                    if (bArr2 != null && bArr2.length > 0) {
                        x0Var3.mo11468x92b714fd(bArr2);
                    }
                    z0Var.f393327e = x0Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    ks3.x0 x0Var4 = new ks3.x0();
                    if (bArr3 != null && bArr3.length > 0) {
                        x0Var4.mo11468x92b714fd(bArr3);
                    }
                    z0Var.f393328f.add(x0Var4);
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    ks3.x0 x0Var5 = new ks3.x0();
                    if (bArr4 != null && bArr4.length > 0) {
                        x0Var5.mo11468x92b714fd(bArr4);
                    }
                    z0Var.f393329g.add(x0Var5);
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    ks3.x0 x0Var6 = new ks3.x0();
                    if (bArr5 != null && bArr5.length > 0) {
                        x0Var6.mo11468x92b714fd(bArr5);
                    }
                    z0Var.f393330h.add(x0Var6);
                }
                return 0;
            case 6:
                z0Var.f393331i = aVar2.k(intValue);
                return 0;
            case 7:
                z0Var.f393332m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    ks3.w0 w0Var = new ks3.w0();
                    if (bArr6 != null && bArr6.length > 0) {
                        w0Var.mo11468x92b714fd(bArr6);
                    }
                    z0Var.f393333n.add(w0Var);
                }
                return 0;
            case 9:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    ks3.w0 w0Var2 = new ks3.w0();
                    if (bArr7 != null && bArr7.length > 0) {
                        w0Var2.mo11468x92b714fd(bArr7);
                    }
                    z0Var.f393334o.add(w0Var2);
                }
                return 0;
            case 10:
                z0Var.f393335p = aVar2.k(intValue);
                return 0;
            case 11:
                z0Var.f393336q = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
