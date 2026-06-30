package r45;

/* loaded from: classes9.dex */
public class bm5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f452405d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452406e;

    /* renamed from: f, reason: collision with root package name */
    public r45.rl6 f452407f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bm5)) {
            return false;
        }
        r45.bm5 bm5Var = (r45.bm5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f452405d), java.lang.Integer.valueOf(bm5Var.f452405d)) && n51.f.a(this.f452406e, bm5Var.f452406e) && n51.f.a(this.f452407f, bm5Var.f452407f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f452405d);
            java.lang.String str = this.f452406e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.rl6 rl6Var = this.f452407f;
            if (rl6Var != null) {
                fVar.i(3, rl6Var.mo75928xcd1e8d8());
                this.f452407f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f452405d) + 0;
            java.lang.String str2 = this.f452406e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            r45.rl6 rl6Var2 = this.f452407f;
            return rl6Var2 != null ? e17 + b36.f.i(3, rl6Var2.mo75928xcd1e8d8()) : e17;
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
        r45.bm5 bm5Var = (r45.bm5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bm5Var.f452405d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            bm5Var.f452406e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.rl6 rl6Var3 = new r45.rl6();
            if (bArr != null && bArr.length > 0) {
                rl6Var3.mo11468x92b714fd(bArr);
            }
            bm5Var.f452407f = rl6Var3;
        }
        return 0;
    }
}
