package r45;

/* loaded from: classes4.dex */
public class o87 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f463572d;

    /* renamed from: e, reason: collision with root package name */
    public float f463573e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o87)) {
            return false;
        }
        r45.o87 o87Var = (r45.o87) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f463572d), java.lang.Float.valueOf(o87Var.f463572d)) && n51.f.a(java.lang.Float.valueOf(this.f463573e), java.lang.Float.valueOf(o87Var.f463573e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f463572d);
            fVar.d(2, this.f463573e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f463572d) + 0 + b36.f.d(2, this.f463573e);
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
        r45.o87 o87Var = (r45.o87) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o87Var.f463572d = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        o87Var.f463573e = aVar2.f(intValue);
        return 0;
    }
}
