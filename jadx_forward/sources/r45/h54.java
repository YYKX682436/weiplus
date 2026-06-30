package r45;

/* loaded from: classes9.dex */
public class h54 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457387d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457388e;

    /* renamed from: f, reason: collision with root package name */
    public int f457389f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h54)) {
            return false;
        }
        r45.h54 h54Var = (r45.h54) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457387d), java.lang.Integer.valueOf(h54Var.f457387d)) && n51.f.a(this.f457388e, h54Var.f457388e) && n51.f.a(java.lang.Integer.valueOf(this.f457389f), java.lang.Integer.valueOf(h54Var.f457389f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f457387d);
            java.lang.String str = this.f457388e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f457389f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f457387d) + 0;
            java.lang.String str2 = this.f457388e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.e(3, this.f457389f);
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
        r45.h54 h54Var = (r45.h54) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h54Var.f457387d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            h54Var.f457388e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        h54Var.f457389f = aVar2.g(intValue);
        return 0;
    }
}
