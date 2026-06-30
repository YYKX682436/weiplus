package r45;

/* loaded from: classes9.dex */
public class ww6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f471080d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f471081e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ww6)) {
            return false;
        }
        r45.ww6 ww6Var = (r45.ww6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f471080d), java.lang.Integer.valueOf(ww6Var.f471080d)) && n51.f.a(this.f471081e, ww6Var.f471081e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f471080d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f471081e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f471080d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f471081e;
            return gVar2 != null ? e17 + b36.f.b(2, gVar2) : e17;
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
        r45.ww6 ww6Var = (r45.ww6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ww6Var.f471080d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        ww6Var.f471081e = aVar2.d(intValue);
        return 0;
    }
}
