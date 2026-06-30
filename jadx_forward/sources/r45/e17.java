package r45;

/* loaded from: classes9.dex */
public class e17 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f454449d;

    /* renamed from: e, reason: collision with root package name */
    public int f454450e;

    /* renamed from: f, reason: collision with root package name */
    public int f454451f;

    /* renamed from: g, reason: collision with root package name */
    public int f454452g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e17)) {
            return false;
        }
        r45.e17 e17Var = (r45.e17) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f454449d), java.lang.Integer.valueOf(e17Var.f454449d)) && n51.f.a(java.lang.Integer.valueOf(this.f454450e), java.lang.Integer.valueOf(e17Var.f454450e)) && n51.f.a(java.lang.Integer.valueOf(this.f454451f), java.lang.Integer.valueOf(e17Var.f454451f)) && n51.f.a(java.lang.Integer.valueOf(this.f454452g), java.lang.Integer.valueOf(e17Var.f454452g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f454449d);
            fVar.e(2, this.f454450e);
            fVar.e(3, this.f454451f);
            fVar.e(4, this.f454452g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f454449d) + 0 + b36.f.e(2, this.f454450e) + b36.f.e(3, this.f454451f) + b36.f.e(4, this.f454452g);
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
        r45.e17 e17Var = (r45.e17) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e17Var.f454449d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            e17Var.f454450e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            e17Var.f454451f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        e17Var.f454452g = aVar2.g(intValue);
        return 0;
    }
}
