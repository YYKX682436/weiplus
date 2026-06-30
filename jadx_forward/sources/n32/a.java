package n32;

/* loaded from: classes9.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f416006d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f416007e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f416008f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof n32.a)) {
            return false;
        }
        n32.a aVar = (n32.a) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f416006d), java.lang.Integer.valueOf(aVar.f416006d)) && n51.f.a(this.f416007e, aVar.f416007e) && n51.f.a(this.f416008f, aVar.f416008f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f416006d);
            java.lang.String str = this.f416007e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f416008f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f416006d) + 0;
            java.lang.String str3 = this.f416007e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f416008f;
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
        n32.a aVar3 = (n32.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            aVar3.f416006d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            aVar3.f416007e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        aVar3.f416008f = aVar2.k(intValue);
        return 0;
    }
}
