package m53;

/* loaded from: classes8.dex */
public class o3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f405471d;

    /* renamed from: e, reason: collision with root package name */
    public int f405472e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405473f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.o3)) {
            return false;
        }
        m53.o3 o3Var = (m53.o3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f405471d), java.lang.Integer.valueOf(o3Var.f405471d)) && n51.f.a(java.lang.Integer.valueOf(this.f405472e), java.lang.Integer.valueOf(o3Var.f405472e)) && n51.f.a(this.f405473f, o3Var.f405473f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f405471d);
            fVar.e(2, this.f405472e);
            java.lang.String str = this.f405473f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f405471d) + 0 + b36.f.e(2, this.f405472e);
            java.lang.String str2 = this.f405473f;
            return str2 != null ? e17 + b36.f.j(3, str2) : e17;
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
        m53.o3 o3Var = (m53.o3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o3Var.f405471d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            o3Var.f405472e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        o3Var.f405473f = aVar2.k(intValue);
        return 0;
    }
}
