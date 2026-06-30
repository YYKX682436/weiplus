package r45;

/* loaded from: classes9.dex */
public class bj4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f452337d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452338e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452339f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bj4)) {
            return false;
        }
        r45.bj4 bj4Var = (r45.bj4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f452337d), java.lang.Long.valueOf(bj4Var.f452337d)) && n51.f.a(this.f452338e, bj4Var.f452338e) && n51.f.a(this.f452339f, bj4Var.f452339f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f452337d);
            java.lang.String str = this.f452338e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f452339f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f452337d) + 0;
            java.lang.String str3 = this.f452338e;
            if (str3 != null) {
                h17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f452339f;
            return str4 != null ? h17 + b36.f.j(3, str4) : h17;
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
        r45.bj4 bj4Var = (r45.bj4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bj4Var.f452337d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            bj4Var.f452338e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        bj4Var.f452339f = aVar2.k(intValue);
        return 0;
    }
}
