package r45;

/* loaded from: classes9.dex */
public class cx6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f453447d;

    /* renamed from: e, reason: collision with root package name */
    public int f453448e;

    /* renamed from: f, reason: collision with root package name */
    public r45.oy3 f453449f;

    /* renamed from: g, reason: collision with root package name */
    public r45.py3 f453450g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cx6)) {
            return false;
        }
        r45.cx6 cx6Var = (r45.cx6) fVar;
        return n51.f.a(this.f76494x2de60e5e, cx6Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f453447d), java.lang.Integer.valueOf(cx6Var.f453447d)) && n51.f.a(java.lang.Integer.valueOf(this.f453448e), java.lang.Integer.valueOf(cx6Var.f453448e)) && n51.f.a(this.f453449f, cx6Var.f453449f) && n51.f.a(this.f453450g, cx6Var.f453450g);
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
            fVar.e(2, this.f453447d);
            fVar.e(3, this.f453448e);
            r45.oy3 oy3Var = this.f453449f;
            if (oy3Var != null) {
                fVar.i(4, oy3Var.mo75928xcd1e8d8());
                this.f453449f.mo75956x3d5d1f78(fVar);
            }
            r45.py3 py3Var = this.f453450g;
            if (py3Var != null) {
                fVar.i(5, py3Var.mo75928xcd1e8d8());
                this.f453450g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f453447d) + b36.f.e(3, this.f453448e);
            r45.oy3 oy3Var2 = this.f453449f;
            if (oy3Var2 != null) {
                i18 += b36.f.i(4, oy3Var2.mo75928xcd1e8d8());
            }
            r45.py3 py3Var2 = this.f453450g;
            return py3Var2 != null ? i18 + b36.f.i(5, py3Var2.mo75928xcd1e8d8()) : i18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.cx6 cx6Var = (r45.cx6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                cx6Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            cx6Var.f453447d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            cx6Var.f453448e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.oy3 oy3Var3 = new r45.oy3();
                if (bArr2 != null && bArr2.length > 0) {
                    oy3Var3.mo11468x92b714fd(bArr2);
                }
                cx6Var.f453449f = oy3Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.py3 py3Var3 = new r45.py3();
            if (bArr3 != null && bArr3.length > 0) {
                py3Var3.mo11468x92b714fd(bArr3);
            }
            cx6Var.f453450g = py3Var3;
        }
        return 0;
    }
}
