package t45;

/* loaded from: classes9.dex */
public class d0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f497071d;

    /* renamed from: e, reason: collision with root package name */
    public t45.e0 f497072e;

    /* renamed from: f, reason: collision with root package name */
    public t45.f f497073f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof t45.d0)) {
            return false;
        }
        t45.d0 d0Var = (t45.d0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f497071d), java.lang.Integer.valueOf(d0Var.f497071d)) && n51.f.a(this.f497072e, d0Var.f497072e) && n51.f.a(this.f497073f, d0Var.f497073f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f497071d);
            t45.e0 e0Var = this.f497072e;
            if (e0Var != null) {
                fVar.i(2, e0Var.mo75928xcd1e8d8());
                this.f497072e.mo75956x3d5d1f78(fVar);
            }
            t45.f fVar2 = this.f497073f;
            if (fVar2 != null) {
                fVar.i(3, fVar2.mo75928xcd1e8d8());
                this.f497073f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f497071d) + 0;
            t45.e0 e0Var2 = this.f497072e;
            if (e0Var2 != null) {
                e17 += b36.f.i(2, e0Var2.mo75928xcd1e8d8());
            }
            t45.f fVar3 = this.f497073f;
            return fVar3 != null ? e17 + b36.f.i(3, fVar3.mo75928xcd1e8d8()) : e17;
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
        t45.d0 d0Var = (t45.d0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            d0Var.f497071d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                t45.e0 e0Var3 = new t45.e0();
                if (bArr != null && bArr.length > 0) {
                    e0Var3.mo11468x92b714fd(bArr);
                }
                d0Var.f497072e = e0Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            t45.f fVar4 = new t45.f();
            if (bArr2 != null && bArr2.length > 0) {
                fVar4.mo11468x92b714fd(bArr2);
            }
            d0Var.f497073f = fVar4;
        }
        return 0;
    }
}
