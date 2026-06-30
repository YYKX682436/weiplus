package r45;

/* loaded from: classes4.dex */
public class v93 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f469534d;

    /* renamed from: f, reason: collision with root package name */
    public int f469536f;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f469535e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f469537g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v93)) {
            return false;
        }
        r45.v93 v93Var = (r45.v93) fVar;
        return n51.f.a(this.f76494x2de60e5e, v93Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f469534d), java.lang.Integer.valueOf(v93Var.f469534d)) && n51.f.a(this.f469535e, v93Var.f469535e) && n51.f.a(java.lang.Integer.valueOf(this.f469536f), java.lang.Integer.valueOf(v93Var.f469536f)) && n51.f.a(this.f469537g, v93Var.f469537g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f469534d);
            fVar.g(3, 8, this.f469535e);
            fVar.e(4, this.f469536f);
            fVar.g(5, 8, this.f469537g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f469534d) + b36.f.g(3, 8, this.f469535e) + b36.f.e(4, this.f469536f) + b36.f.g(5, 8, this.f469537g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f469535e.clear();
            this.f469537g.clear();
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
        r45.v93 v93Var = (r45.v93) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.mo11468x92b714fd(bArr2);
                }
                v93Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            v93Var.f469534d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.du5 du5Var = new r45.du5();
                if (bArr3 != null && bArr3.length > 0) {
                    du5Var.b(bArr3);
                }
                v93Var.f469535e.add(du5Var);
            }
            return 0;
        }
        if (intValue == 4) {
            v93Var.f469536f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            r45.du5 du5Var2 = new r45.du5();
            if (bArr4 != null && bArr4.length > 0) {
                du5Var2.b(bArr4);
            }
            v93Var.f469537g.add(du5Var2);
        }
        return 0;
    }
}
