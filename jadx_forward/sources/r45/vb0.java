package r45;

/* loaded from: classes4.dex */
public class vb0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f469601d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f469602e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469603f;

    /* renamed from: g, reason: collision with root package name */
    public int f469604g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vb0)) {
            return false;
        }
        r45.vb0 vb0Var = (r45.vb0) fVar;
        return n51.f.a(this.f76494x2de60e5e, vb0Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f469601d), java.lang.Integer.valueOf(vb0Var.f469601d)) && n51.f.a(this.f469602e, vb0Var.f469602e) && n51.f.a(this.f469603f, vb0Var.f469603f) && n51.f.a(java.lang.Integer.valueOf(this.f469604g), java.lang.Integer.valueOf(vb0Var.f469604g));
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
            fVar.e(2, this.f469601d);
            fVar.g(3, 8, this.f469602e);
            java.lang.String str = this.f469603f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f469604g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f469601d) + b36.f.g(3, 8, this.f469602e);
            java.lang.String str2 = this.f469603f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            return i18 + b36.f.e(5, this.f469604g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f469602e.clear();
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
        r45.vb0 vb0Var = (r45.vb0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.mo11468x92b714fd(bArr2);
                }
                vb0Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            vb0Var.f469601d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                vb0Var.f469603f = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            vb0Var.f469604g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.gc0 gc0Var = new r45.gc0();
            if (bArr3 != null && bArr3.length > 0) {
                gc0Var.mo11468x92b714fd(bArr3);
            }
            vb0Var.f469602e.add(gc0Var);
        }
        return 0;
    }
}
