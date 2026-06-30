package r45;

/* loaded from: classes9.dex */
public class mz3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f462472d;

    /* renamed from: e, reason: collision with root package name */
    public long f462473e;

    /* renamed from: f, reason: collision with root package name */
    public int f462474f;

    /* renamed from: g, reason: collision with root package name */
    public int f462475g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mz3)) {
            return false;
        }
        r45.mz3 mz3Var = (r45.mz3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f462472d), java.lang.Integer.valueOf(mz3Var.f462472d)) && n51.f.a(java.lang.Long.valueOf(this.f462473e), java.lang.Long.valueOf(mz3Var.f462473e)) && n51.f.a(java.lang.Integer.valueOf(this.f462474f), java.lang.Integer.valueOf(mz3Var.f462474f)) && n51.f.a(java.lang.Integer.valueOf(this.f462475g), java.lang.Integer.valueOf(mz3Var.f462475g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f462472d);
            fVar.h(2, this.f462473e);
            fVar.e(3, this.f462474f);
            fVar.e(4, this.f462475g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f462472d) + 0 + b36.f.h(2, this.f462473e) + b36.f.e(3, this.f462474f) + b36.f.e(4, this.f462475g);
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
        r45.mz3 mz3Var = (r45.mz3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mz3Var.f462472d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            mz3Var.f462473e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            mz3Var.f462474f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        mz3Var.f462475g = aVar2.g(intValue);
        return 0;
    }
}
