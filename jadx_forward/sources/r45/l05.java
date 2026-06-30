package r45;

/* loaded from: classes8.dex */
public class l05 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f460592d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460593e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460594f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l05)) {
            return false;
        }
        r45.l05 l05Var = (r45.l05) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f460592d), java.lang.Integer.valueOf(l05Var.f460592d)) && n51.f.a(this.f460593e, l05Var.f460593e) && n51.f.a(this.f460594f, l05Var.f460594f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f460592d);
            java.lang.String str = this.f460593e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f460594f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f460592d) + 0;
            java.lang.String str3 = this.f460593e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f460594f;
            return str4 != null ? e17 + b36.f.j(3, str4) : e17;
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
        r45.l05 l05Var = (r45.l05) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            l05Var.f460592d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            l05Var.f460593e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        l05Var.f460594f = aVar2.k(intValue);
        return 0;
    }
}
