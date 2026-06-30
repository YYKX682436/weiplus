package r45;

/* loaded from: classes2.dex */
public class ac6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f451455d;

    /* renamed from: e, reason: collision with root package name */
    public int f451456e;

    /* renamed from: f, reason: collision with root package name */
    public int f451457f;

    /* renamed from: g, reason: collision with root package name */
    public int f451458g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ac6)) {
            return false;
        }
        r45.ac6 ac6Var = (r45.ac6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f451455d), java.lang.Integer.valueOf(ac6Var.f451455d)) && n51.f.a(java.lang.Integer.valueOf(this.f451456e), java.lang.Integer.valueOf(ac6Var.f451456e)) && n51.f.a(java.lang.Integer.valueOf(this.f451457f), java.lang.Integer.valueOf(ac6Var.f451457f)) && n51.f.a(java.lang.Integer.valueOf(this.f451458g), java.lang.Integer.valueOf(ac6Var.f451458g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f451455d);
            fVar.e(2, this.f451456e);
            fVar.e(3, this.f451457f);
            fVar.e(4, this.f451458g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f451455d) + 0 + b36.f.e(2, this.f451456e) + b36.f.e(3, this.f451457f) + b36.f.e(4, this.f451458g);
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
        r45.ac6 ac6Var = (r45.ac6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ac6Var.f451455d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ac6Var.f451456e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ac6Var.f451457f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ac6Var.f451458g = aVar2.g(intValue);
        return 0;
    }
}
