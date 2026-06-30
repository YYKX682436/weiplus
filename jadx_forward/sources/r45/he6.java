package r45;

/* loaded from: classes9.dex */
public class he6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f457631d;

    /* renamed from: e, reason: collision with root package name */
    public int f457632e;

    /* renamed from: f, reason: collision with root package name */
    public int f457633f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.he6)) {
            return false;
        }
        r45.he6 he6Var = (r45.he6) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f457631d), java.lang.Boolean.valueOf(he6Var.f457631d)) && n51.f.a(java.lang.Integer.valueOf(this.f457632e), java.lang.Integer.valueOf(he6Var.f457632e)) && n51.f.a(java.lang.Integer.valueOf(this.f457633f), java.lang.Integer.valueOf(he6Var.f457633f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f457631d);
            fVar.e(2, this.f457632e);
            fVar.e(3, this.f457633f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f457631d) + 0 + b36.f.e(2, this.f457632e) + b36.f.e(3, this.f457633f);
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
        r45.he6 he6Var = (r45.he6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            he6Var.f457631d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            he6Var.f457632e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        he6Var.f457633f = aVar2.g(intValue);
        return 0;
    }
}
