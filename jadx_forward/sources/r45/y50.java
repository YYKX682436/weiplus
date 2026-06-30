package r45;

/* loaded from: classes7.dex */
public class y50 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f472330d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f472331e;

    /* renamed from: f, reason: collision with root package name */
    public int f472332f;

    /* renamed from: g, reason: collision with root package name */
    public int f472333g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y50)) {
            return false;
        }
        r45.y50 y50Var = (r45.y50) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f472330d), java.lang.Integer.valueOf(y50Var.f472330d)) && n51.f.a(java.lang.Boolean.valueOf(this.f472331e), java.lang.Boolean.valueOf(y50Var.f472331e)) && n51.f.a(java.lang.Integer.valueOf(this.f472332f), java.lang.Integer.valueOf(y50Var.f472332f)) && n51.f.a(java.lang.Integer.valueOf(this.f472333g), java.lang.Integer.valueOf(y50Var.f472333g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f472330d);
            fVar.a(2, this.f472331e);
            fVar.e(3, this.f472332f);
            fVar.e(4, this.f472333g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f472330d) + 0 + b36.f.a(2, this.f472331e) + b36.f.e(3, this.f472332f) + b36.f.e(4, this.f472333g);
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
        r45.y50 y50Var = (r45.y50) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            y50Var.f472330d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            y50Var.f472331e = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            y50Var.f472332f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        y50Var.f472333g = aVar2.g(intValue);
        return 0;
    }
}
