package r45;

/* loaded from: classes2.dex */
public class ag4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f451526d;

    /* renamed from: e, reason: collision with root package name */
    public int f451527e;

    /* renamed from: f, reason: collision with root package name */
    public int f451528f;

    /* renamed from: g, reason: collision with root package name */
    public int f451529g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ag4)) {
            return false;
        }
        r45.ag4 ag4Var = (r45.ag4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f451526d), java.lang.Integer.valueOf(ag4Var.f451526d)) && n51.f.a(java.lang.Integer.valueOf(this.f451527e), java.lang.Integer.valueOf(ag4Var.f451527e)) && n51.f.a(java.lang.Integer.valueOf(this.f451528f), java.lang.Integer.valueOf(ag4Var.f451528f)) && n51.f.a(java.lang.Integer.valueOf(this.f451529g), java.lang.Integer.valueOf(ag4Var.f451529g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f451526d);
            fVar.e(2, this.f451527e);
            fVar.e(3, this.f451528f);
            fVar.e(4, this.f451529g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f451526d) + 0 + b36.f.e(2, this.f451527e) + b36.f.e(3, this.f451528f) + b36.f.e(4, this.f451529g);
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
        r45.ag4 ag4Var = (r45.ag4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ag4Var.f451526d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ag4Var.f451527e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ag4Var.f451528f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ag4Var.f451529g = aVar2.g(intValue);
        return 0;
    }
}
