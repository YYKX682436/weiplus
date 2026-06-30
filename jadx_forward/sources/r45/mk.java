package r45;

/* loaded from: classes10.dex */
public class mk extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f462129d;

    /* renamed from: e, reason: collision with root package name */
    public int f462130e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462131f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462132g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mk)) {
            return false;
        }
        r45.mk mkVar = (r45.mk) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f462129d), java.lang.Integer.valueOf(mkVar.f462129d)) && n51.f.a(java.lang.Integer.valueOf(this.f462130e), java.lang.Integer.valueOf(mkVar.f462130e)) && n51.f.a(this.f462131f, mkVar.f462131f) && n51.f.a(this.f462132g, mkVar.f462132g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f462129d);
            fVar.e(2, this.f462130e);
            java.lang.String str = this.f462131f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f462132g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f462129d) + 0 + b36.f.e(2, this.f462130e);
            java.lang.String str3 = this.f462131f;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f462132g;
            return str4 != null ? e17 + b36.f.j(4, str4) : e17;
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
        r45.mk mkVar = (r45.mk) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mkVar.f462129d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            mkVar.f462130e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            mkVar.f462131f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        mkVar.f462132g = aVar2.k(intValue);
        return 0;
    }
}
