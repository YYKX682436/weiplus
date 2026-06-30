package r45;

/* loaded from: classes4.dex */
public class j3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f459059d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f459060e;

    /* renamed from: f, reason: collision with root package name */
    public long f459061f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j3)) {
            return false;
        }
        r45.j3 j3Var = (r45.j3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f459059d), java.lang.Integer.valueOf(j3Var.f459059d)) && n51.f.a(this.f459060e, j3Var.f459060e) && n51.f.a(java.lang.Long.valueOf(this.f459061f), java.lang.Long.valueOf(j3Var.f459061f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f459059d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f459060e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.h(3, this.f459061f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f459059d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f459060e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            return e17 + b36.f.h(3, this.f459061f);
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
        r45.j3 j3Var = (r45.j3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            j3Var.f459059d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            j3Var.f459060e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        j3Var.f459061f = aVar2.i(intValue);
        return 0;
    }
}
