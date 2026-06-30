package r45;

/* loaded from: classes4.dex */
public class fp0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f456033d;

    /* renamed from: e, reason: collision with root package name */
    public int f456034e;

    /* renamed from: f, reason: collision with root package name */
    public int f456035f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fp0)) {
            return false;
        }
        r45.fp0 fp0Var = (r45.fp0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f456033d), java.lang.Integer.valueOf(fp0Var.f456033d)) && n51.f.a(java.lang.Integer.valueOf(this.f456034e), java.lang.Integer.valueOf(fp0Var.f456034e)) && n51.f.a(java.lang.Integer.valueOf(this.f456035f), java.lang.Integer.valueOf(fp0Var.f456035f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f456033d);
            fVar.e(2, this.f456034e);
            fVar.e(3, this.f456035f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f456033d) + 0 + b36.f.e(2, this.f456034e) + b36.f.e(3, this.f456035f);
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
        r45.fp0 fp0Var = (r45.fp0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fp0Var.f456033d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            fp0Var.f456034e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        fp0Var.f456035f = aVar2.g(intValue);
        return 0;
    }
}
