package r45;

/* loaded from: classes12.dex */
public class u30 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f468511d;

    /* renamed from: e, reason: collision with root package name */
    public int f468512e;

    /* renamed from: f, reason: collision with root package name */
    public int f468513f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f468514g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f468515h;

    /* renamed from: i, reason: collision with root package name */
    public r45.fw3 f468516i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u30)) {
            return false;
        }
        r45.u30 u30Var = (r45.u30) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f468511d), java.lang.Integer.valueOf(u30Var.f468511d)) && n51.f.a(java.lang.Integer.valueOf(this.f468512e), java.lang.Integer.valueOf(u30Var.f468512e)) && n51.f.a(java.lang.Integer.valueOf(this.f468513f), java.lang.Integer.valueOf(u30Var.f468513f)) && n51.f.a(this.f468514g, u30Var.f468514g) && n51.f.a(this.f468515h, u30Var.f468515h) && n51.f.a(this.f468516i, u30Var.f468516i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f468514g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f468511d);
            fVar.e(2, this.f468512e);
            fVar.e(3, this.f468513f);
            fVar.g(4, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f468515h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            r45.fw3 fw3Var = this.f468516i;
            if (fw3Var != null) {
                fVar.i(6, fw3Var.mo75928xcd1e8d8());
                this.f468516i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f468511d) + 0 + b36.f.e(2, this.f468512e) + b36.f.e(3, this.f468513f) + b36.f.g(4, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f468515h;
            if (gVar2 != null) {
                e17 += b36.f.b(5, gVar2);
            }
            r45.fw3 fw3Var2 = this.f468516i;
            return fw3Var2 != null ? e17 + b36.f.i(6, fw3Var2.mo75928xcd1e8d8()) : e17;
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
        r45.u30 u30Var = (r45.u30) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                u30Var.f468511d = aVar2.g(intValue);
                return 0;
            case 2:
                u30Var.f468512e = aVar2.g(intValue);
                return 0;
            case 3:
                u30Var.f468513f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.t30 t30Var = new r45.t30();
                    if (bArr2 != null && bArr2.length > 0) {
                        t30Var.mo11468x92b714fd(bArr2);
                    }
                    u30Var.f468514g.add(t30Var);
                }
                return 0;
            case 5:
                u30Var.f468515h = aVar2.d(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.fw3 fw3Var3 = new r45.fw3();
                    if (bArr3 != null && bArr3.length > 0) {
                        fw3Var3.mo11468x92b714fd(bArr3);
                    }
                    u30Var.f468516i = fw3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
