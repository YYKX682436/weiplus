package r45;

/* loaded from: classes9.dex */
public class ds5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f454265d;

    /* renamed from: e, reason: collision with root package name */
    public int f454266e;

    /* renamed from: f, reason: collision with root package name */
    public int f454267f;

    /* renamed from: g, reason: collision with root package name */
    public int f454268g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ds5)) {
            return false;
        }
        r45.ds5 ds5Var = (r45.ds5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f454265d), java.lang.Integer.valueOf(ds5Var.f454265d)) && n51.f.a(java.lang.Integer.valueOf(this.f454266e), java.lang.Integer.valueOf(ds5Var.f454266e)) && n51.f.a(java.lang.Integer.valueOf(this.f454267f), java.lang.Integer.valueOf(ds5Var.f454267f)) && n51.f.a(java.lang.Integer.valueOf(this.f454268g), java.lang.Integer.valueOf(ds5Var.f454268g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f454265d);
            fVar.e(2, this.f454266e);
            fVar.e(3, this.f454267f);
            fVar.e(4, this.f454268g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f454265d) + 0 + b36.f.e(2, this.f454266e) + b36.f.e(3, this.f454267f) + b36.f.e(4, this.f454268g);
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
        r45.ds5 ds5Var = (r45.ds5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ds5Var.f454265d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ds5Var.f454266e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ds5Var.f454267f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ds5Var.f454268g = aVar2.g(intValue);
        return 0;
    }
}
