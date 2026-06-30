package r45;

/* loaded from: classes10.dex */
public class yx5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473009d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473010e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cy5 f473011f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f473012g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public r45.dy5 f473013h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yx5)) {
            return false;
        }
        r45.yx5 yx5Var = (r45.yx5) fVar;
        return n51.f.a(this.f473009d, yx5Var.f473009d) && n51.f.a(this.f473010e, yx5Var.f473010e) && n51.f.a(this.f473011f, yx5Var.f473011f) && n51.f.a(this.f473012g, yx5Var.f473012g) && n51.f.a(this.f473013h, yx5Var.f473013h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f473012g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473009d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f473010e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            r45.cy5 cy5Var = this.f473011f;
            if (cy5Var != null) {
                fVar.i(3, cy5Var.mo75928xcd1e8d8());
                this.f473011f.mo75956x3d5d1f78(fVar);
            }
            fVar.g(4, 8, linkedList);
            r45.dy5 dy5Var = this.f473013h;
            if (dy5Var != null) {
                fVar.i(5, dy5Var.mo75928xcd1e8d8());
                this.f473013h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f473009d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f473010e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            r45.cy5 cy5Var2 = this.f473011f;
            if (cy5Var2 != null) {
                j17 += b36.f.i(3, cy5Var2.mo75928xcd1e8d8());
            }
            int g17 = j17 + b36.f.g(4, 8, linkedList);
            r45.dy5 dy5Var2 = this.f473013h;
            return dy5Var2 != null ? g17 + b36.f.i(5, dy5Var2.mo75928xcd1e8d8()) : g17;
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
        r45.yx5 yx5Var = (r45.yx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            yx5Var.f473009d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            yx5Var.f473010e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                r45.cy5 cy5Var3 = new r45.cy5();
                if (bArr2 != null && bArr2.length > 0) {
                    cy5Var3.mo11468x92b714fd(bArr2);
                }
                yx5Var.f473011f = cy5Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size2 = j19.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j19.get(i19);
                r45.cy5 cy5Var4 = new r45.cy5();
                if (bArr3 != null && bArr3.length > 0) {
                    cy5Var4.mo11468x92b714fd(bArr3);
                }
                yx5Var.f473012g.add(cy5Var4);
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size3 = j27.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j27.get(i27);
            r45.dy5 dy5Var3 = new r45.dy5();
            if (bArr4 != null && bArr4.length > 0) {
                dy5Var3.mo11468x92b714fd(bArr4);
            }
            yx5Var.f473013h = dy5Var3;
        }
        return 0;
    }
}
