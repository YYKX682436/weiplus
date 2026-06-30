package r45;

/* loaded from: classes9.dex */
public class x25 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f471229d;

    /* renamed from: e, reason: collision with root package name */
    public int f471230e;

    /* renamed from: f, reason: collision with root package name */
    public int f471231f;

    /* renamed from: g, reason: collision with root package name */
    public int f471232g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x25)) {
            return false;
        }
        r45.x25 x25Var = (r45.x25) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f471229d), java.lang.Integer.valueOf(x25Var.f471229d)) && n51.f.a(java.lang.Integer.valueOf(this.f471230e), java.lang.Integer.valueOf(x25Var.f471230e)) && n51.f.a(java.lang.Integer.valueOf(this.f471231f), java.lang.Integer.valueOf(x25Var.f471231f)) && n51.f.a(java.lang.Integer.valueOf(this.f471232g), java.lang.Integer.valueOf(x25Var.f471232g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f471229d);
            fVar.e(2, this.f471230e);
            fVar.e(4, this.f471231f);
            fVar.e(5, this.f471232g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f471229d) + 0 + b36.f.e(2, this.f471230e) + b36.f.e(4, this.f471231f) + b36.f.e(5, this.f471232g);
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
        r45.x25 x25Var = (r45.x25) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            x25Var.f471229d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            x25Var.f471230e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            x25Var.f471231f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        x25Var.f471232g = aVar2.g(intValue);
        return 0;
    }
}
