package r45;

/* loaded from: classes8.dex */
public class yx6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473014d;

    /* renamed from: e, reason: collision with root package name */
    public int f473015e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f473016f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public long f473017g;

    /* renamed from: h, reason: collision with root package name */
    public r45.mx6 f473018h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yx6)) {
            return false;
        }
        r45.yx6 yx6Var = (r45.yx6) fVar;
        return n51.f.a(this.f473014d, yx6Var.f473014d) && n51.f.a(java.lang.Integer.valueOf(this.f473015e), java.lang.Integer.valueOf(yx6Var.f473015e)) && n51.f.a(this.f473016f, yx6Var.f473016f) && n51.f.a(java.lang.Long.valueOf(this.f473017g), java.lang.Long.valueOf(yx6Var.f473017g)) && n51.f.a(this.f473018h, yx6Var.f473018h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f473016f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473014d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f473015e);
            fVar.g(3, 8, linkedList);
            fVar.h(4, this.f473017g);
            r45.mx6 mx6Var = this.f473018h;
            if (mx6Var != null) {
                fVar.i(5, mx6Var.mo75928xcd1e8d8());
                this.f473018h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f473014d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f473015e) + b36.f.g(3, 8, linkedList) + b36.f.h(4, this.f473017g);
            r45.mx6 mx6Var2 = this.f473018h;
            return mx6Var2 != null ? j17 + b36.f.i(5, mx6Var2.mo75928xcd1e8d8()) : j17;
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
        r45.yx6 yx6Var = (r45.yx6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            yx6Var.f473014d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            yx6Var.f473015e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                r45.mx6 mx6Var3 = new r45.mx6();
                if (bArr2 != null && bArr2.length > 0) {
                    mx6Var3.mo11468x92b714fd(bArr2);
                }
                yx6Var.f473016f.add(mx6Var3);
            }
            return 0;
        }
        if (intValue == 4) {
            yx6Var.f473017g = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j19.get(i19);
            r45.mx6 mx6Var4 = new r45.mx6();
            if (bArr3 != null && bArr3.length > 0) {
                mx6Var4.mo11468x92b714fd(bArr3);
            }
            yx6Var.f473018h = mx6Var4;
        }
        return 0;
    }
}
