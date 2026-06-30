package r45;

/* loaded from: classes9.dex */
public class pb5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f464457d;

    /* renamed from: e, reason: collision with root package name */
    public int f464458e;

    /* renamed from: f, reason: collision with root package name */
    public r45.kd f464459f;

    /* renamed from: g, reason: collision with root package name */
    public int f464460g;

    /* renamed from: h, reason: collision with root package name */
    public int f464461h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f464462i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f464463m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pb5)) {
            return false;
        }
        r45.pb5 pb5Var = (r45.pb5) fVar;
        return n51.f.a(this.f76494x2de60e5e, pb5Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f464457d), java.lang.Integer.valueOf(pb5Var.f464457d)) && n51.f.a(java.lang.Integer.valueOf(this.f464458e), java.lang.Integer.valueOf(pb5Var.f464458e)) && n51.f.a(this.f464459f, pb5Var.f464459f) && n51.f.a(java.lang.Integer.valueOf(this.f464460g), java.lang.Integer.valueOf(pb5Var.f464460g)) && n51.f.a(java.lang.Integer.valueOf(this.f464461h), java.lang.Integer.valueOf(pb5Var.f464461h)) && n51.f.a(this.f464462i, pb5Var.f464462i) && n51.f.a(this.f464463m, pb5Var.f464463m);
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
            fVar.e(2, this.f464457d);
            fVar.e(3, this.f464458e);
            r45.kd kdVar = this.f464459f;
            if (kdVar != null) {
                fVar.i(4, kdVar.mo75928xcd1e8d8());
                this.f464459f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f464460g);
            fVar.e(6, this.f464461h);
            java.lang.String str = this.f464462i;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.f464463m;
            if (str2 != null) {
                fVar.j(100, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f464457d) + b36.f.e(3, this.f464458e);
            r45.kd kdVar2 = this.f464459f;
            if (kdVar2 != null) {
                i18 += b36.f.i(4, kdVar2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(5, this.f464460g) + b36.f.e(6, this.f464461h);
            java.lang.String str3 = this.f464462i;
            if (str3 != null) {
                e17 += b36.f.j(7, str3);
            }
            java.lang.String str4 = this.f464463m;
            return str4 != null ? e17 + b36.f.j(100, str4) : e17;
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
        r45.pb5 pb5Var = (r45.pb5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            pb5Var.f464463m = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    pb5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                pb5Var.f464457d = aVar2.g(intValue);
                return 0;
            case 3:
                pb5Var.f464458e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kd kdVar3 = new r45.kd();
                    if (bArr2 != null && bArr2.length > 0) {
                        kdVar3.mo11468x92b714fd(bArr2);
                    }
                    pb5Var.f464459f = kdVar3;
                }
                return 0;
            case 5:
                pb5Var.f464460g = aVar2.g(intValue);
                return 0;
            case 6:
                pb5Var.f464461h = aVar2.g(intValue);
                return 0;
            case 7:
                pb5Var.f464462i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
