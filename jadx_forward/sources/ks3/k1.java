package ks3;

/* loaded from: classes8.dex */
public class k1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f393244d;

    /* renamed from: e, reason: collision with root package name */
    public ks3.z0 f393245e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.k1)) {
            return false;
        }
        ks3.k1 k1Var = (ks3.k1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f393244d), java.lang.Long.valueOf(k1Var.f393244d)) && n51.f.a(this.f393245e, k1Var.f393245e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f393244d);
            ks3.z0 z0Var = this.f393245e;
            if (z0Var != null) {
                fVar.i(2, z0Var.mo75928xcd1e8d8());
                this.f393245e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f393244d) + 0;
            ks3.z0 z0Var2 = this.f393245e;
            return z0Var2 != null ? h17 + b36.f.i(2, z0Var2.mo75928xcd1e8d8()) : h17;
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
        ks3.k1 k1Var = (ks3.k1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            k1Var.f393244d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            ks3.z0 z0Var3 = new ks3.z0();
            if (bArr != null && bArr.length > 0) {
                z0Var3.mo11468x92b714fd(bArr);
            }
            k1Var.f393245e = z0Var3;
        }
        return 0;
    }
}
