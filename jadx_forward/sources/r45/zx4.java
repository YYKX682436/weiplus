package r45;

/* loaded from: classes4.dex */
public class zx4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473988d;

    /* renamed from: e, reason: collision with root package name */
    public r45.va5 f473989e;

    /* renamed from: f, reason: collision with root package name */
    public double f473990f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f473991g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zx4)) {
            return false;
        }
        r45.zx4 zx4Var = (r45.zx4) fVar;
        return n51.f.a(this.f473988d, zx4Var.f473988d) && n51.f.a(this.f473989e, zx4Var.f473989e) && n51.f.a(java.lang.Double.valueOf(this.f473990f), java.lang.Double.valueOf(zx4Var.f473990f)) && n51.f.a(this.f473991g, zx4Var.f473991g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f473991g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473988d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.va5 va5Var = this.f473989e;
            if (va5Var != null) {
                fVar.i(2, va5Var.mo75928xcd1e8d8());
                this.f473989e.mo75956x3d5d1f78(fVar);
            }
            fVar.c(3, this.f473990f);
            fVar.g(4, 4, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f473988d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.va5 va5Var2 = this.f473989e;
            if (va5Var2 != null) {
                j17 += b36.f.i(2, va5Var2.mo75928xcd1e8d8());
            }
            return j17 + b36.f.c(3, this.f473990f) + b36.f.g(4, 4, linkedList);
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
        r45.zx4 zx4Var = (r45.zx4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zx4Var.f473988d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                zx4Var.f473990f = aVar2.e(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            zx4Var.f473991g.add(java.lang.Double.valueOf(aVar2.e(intValue)));
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.va5 va5Var3 = new r45.va5();
            if (bArr2 != null && bArr2.length > 0) {
                va5Var3.mo11468x92b714fd(bArr2);
            }
            zx4Var.f473989e = va5Var3;
        }
        return 0;
    }
}
