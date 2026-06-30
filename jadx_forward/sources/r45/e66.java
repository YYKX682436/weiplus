package r45;

/* loaded from: classes2.dex */
public class e66 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454588d;

    /* renamed from: e, reason: collision with root package name */
    public float f454589e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e66)) {
            return false;
        }
        r45.e66 e66Var = (r45.e66) fVar;
        return n51.f.a(this.f454588d, e66Var.f454588d) && n51.f.a(java.lang.Float.valueOf(this.f454589e), java.lang.Float.valueOf(e66Var.f454589e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f454588d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.d(2, this.f454589e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f454588d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.d(2, this.f454589e);
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
        r45.e66 e66Var = (r45.e66) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e66Var.f454588d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        e66Var.f454589e = aVar2.f(intValue);
        return 0;
    }
}
