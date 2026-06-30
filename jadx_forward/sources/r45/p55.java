package r45;

/* loaded from: classes9.dex */
public class p55 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f464303d;

    /* renamed from: e, reason: collision with root package name */
    public int f464304e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f464305f;

    /* renamed from: g, reason: collision with root package name */
    public int f464306g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f464307h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p55)) {
            return false;
        }
        r45.p55 p55Var = (r45.p55) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f464303d), java.lang.Integer.valueOf(p55Var.f464303d)) && n51.f.a(java.lang.Integer.valueOf(this.f464304e), java.lang.Integer.valueOf(p55Var.f464304e)) && n51.f.a(this.f464305f, p55Var.f464305f) && n51.f.a(java.lang.Integer.valueOf(this.f464306g), java.lang.Integer.valueOf(p55Var.f464306g)) && n51.f.a(this.f464307h, p55Var.f464307h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f464303d);
            fVar.e(2, this.f464304e);
            r45.cu5 cu5Var = this.f464305f;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.mo75928xcd1e8d8());
                this.f464305f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f464306g);
            r45.cu5 cu5Var2 = this.f464307h;
            if (cu5Var2 != null) {
                fVar.i(5, cu5Var2.mo75928xcd1e8d8());
                this.f464307h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f464303d) + 0 + b36.f.e(2, this.f464304e);
            r45.cu5 cu5Var3 = this.f464305f;
            if (cu5Var3 != null) {
                e17 += b36.f.i(3, cu5Var3.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(4, this.f464306g);
            r45.cu5 cu5Var4 = this.f464307h;
            return cu5Var4 != null ? e18 + b36.f.i(5, cu5Var4.mo75928xcd1e8d8()) : e18;
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
        r45.p55 p55Var = (r45.p55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p55Var.f464303d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            p55Var.f464304e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.cu5 cu5Var5 = new r45.cu5();
                if (bArr != null && bArr.length > 0) {
                    cu5Var5.b(bArr);
                }
                p55Var.f464305f = cu5Var5;
            }
            return 0;
        }
        if (intValue == 4) {
            p55Var.f464306g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.cu5 cu5Var6 = new r45.cu5();
            if (bArr2 != null && bArr2.length > 0) {
                cu5Var6.b(bArr2);
            }
            p55Var.f464307h = cu5Var6;
        }
        return 0;
    }
}
