package r45;

/* loaded from: classes9.dex */
public class go extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.j40 f456920d;

    /* renamed from: e, reason: collision with root package name */
    public r45.l40 f456921e;

    /* renamed from: f, reason: collision with root package name */
    public r45.c40 f456922f;

    /* renamed from: g, reason: collision with root package name */
    public int f456923g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.go)) {
            return false;
        }
        r45.go goVar = (r45.go) fVar;
        return n51.f.a(this.f76494x2de60e5e, goVar.f76494x2de60e5e) && n51.f.a(this.f456920d, goVar.f456920d) && n51.f.a(this.f456921e, goVar.f456921e) && n51.f.a(this.f456922f, goVar.f456922f) && n51.f.a(java.lang.Integer.valueOf(this.f456923g), java.lang.Integer.valueOf(goVar.f456923g));
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
            r45.j40 j40Var = this.f456920d;
            if (j40Var != null) {
                fVar.i(2, j40Var.mo75928xcd1e8d8());
                this.f456920d.mo75956x3d5d1f78(fVar);
            }
            r45.l40 l40Var = this.f456921e;
            if (l40Var != null) {
                fVar.i(3, l40Var.mo75928xcd1e8d8());
                this.f456921e.mo75956x3d5d1f78(fVar);
            }
            r45.c40 c40Var = this.f456922f;
            if (c40Var != null) {
                fVar.i(4, c40Var.mo75928xcd1e8d8());
                this.f456922f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f456923g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.j40 j40Var2 = this.f456920d;
            if (j40Var2 != null) {
                i18 += b36.f.i(2, j40Var2.mo75928xcd1e8d8());
            }
            r45.l40 l40Var2 = this.f456921e;
            if (l40Var2 != null) {
                i18 += b36.f.i(3, l40Var2.mo75928xcd1e8d8());
            }
            r45.c40 c40Var2 = this.f456922f;
            if (c40Var2 != null) {
                i18 += b36.f.i(4, c40Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(5, this.f456923g);
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
        r45.go goVar = (r45.go) objArr[1];
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
                goVar.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.j40 j40Var3 = new r45.j40();
                if (bArr2 != null && bArr2.length > 0) {
                    j40Var3.mo11468x92b714fd(bArr2);
                }
                goVar.f456920d = j40Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.l40 l40Var3 = new r45.l40();
                if (bArr3 != null && bArr3.length > 0) {
                    l40Var3.mo11468x92b714fd(bArr3);
                }
                goVar.f456921e = l40Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            goVar.f456923g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.c40 c40Var3 = new r45.c40();
            if (bArr4 != null && bArr4.length > 0) {
                c40Var3.mo11468x92b714fd(bArr4);
            }
            goVar.f456922f = c40Var3;
        }
        return 0;
    }
}
