package r45;

/* loaded from: classes8.dex */
public class bd6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.b27 f452212d;

    /* renamed from: e, reason: collision with root package name */
    public int f452213e;

    /* renamed from: f, reason: collision with root package name */
    public int f452214f;

    /* renamed from: g, reason: collision with root package name */
    public int f452215g;

    /* renamed from: h, reason: collision with root package name */
    public int f452216h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bd6)) {
            return false;
        }
        r45.bd6 bd6Var = (r45.bd6) fVar;
        return n51.f.a(this.f452212d, bd6Var.f452212d) && n51.f.a(java.lang.Integer.valueOf(this.f452213e), java.lang.Integer.valueOf(bd6Var.f452213e)) && n51.f.a(java.lang.Integer.valueOf(this.f452214f), java.lang.Integer.valueOf(bd6Var.f452214f)) && n51.f.a(java.lang.Integer.valueOf(this.f452215g), java.lang.Integer.valueOf(bd6Var.f452215g)) && n51.f.a(java.lang.Integer.valueOf(this.f452216h), java.lang.Integer.valueOf(bd6Var.f452216h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.b27 b27Var = this.f452212d;
            if (b27Var != null) {
                fVar.i(1, b27Var.mo75928xcd1e8d8());
                this.f452212d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f452213e);
            fVar.e(3, this.f452214f);
            fVar.e(4, this.f452215g);
            fVar.e(5, this.f452216h);
            return 0;
        }
        if (i17 == 1) {
            r45.b27 b27Var2 = this.f452212d;
            return (b27Var2 != null ? 0 + b36.f.i(1, b27Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f452213e) + b36.f.e(3, this.f452214f) + b36.f.e(4, this.f452215g) + b36.f.e(5, this.f452216h);
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
        r45.bd6 bd6Var = (r45.bd6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.b27 b27Var3 = new r45.b27();
                if (bArr != null && bArr.length > 0) {
                    b27Var3.mo11468x92b714fd(bArr);
                }
                bd6Var.f452212d = b27Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            bd6Var.f452213e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            bd6Var.f452214f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            bd6Var.f452215g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        bd6Var.f452216h = aVar2.g(intValue);
        return 0;
    }
}
