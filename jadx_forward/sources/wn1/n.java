package wn1;

/* loaded from: classes8.dex */
public class n extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f528974d;

    /* renamed from: e, reason: collision with root package name */
    public int f528975e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f528976f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.n)) {
            return false;
        }
        wn1.n nVar = (wn1.n) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f528974d), java.lang.Integer.valueOf(nVar.f528974d)) && n51.f.a(java.lang.Integer.valueOf(this.f528975e), java.lang.Integer.valueOf(nVar.f528975e)) && n51.f.a(this.f528976f, nVar.f528976f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f528974d);
            fVar.e(2, this.f528975e);
            java.lang.String str = this.f528976f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f528974d) + 0 + b36.f.e(2, this.f528975e);
            java.lang.String str2 = this.f528976f;
            return str2 != null ? e17 + b36.f.j(3, str2) : e17;
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
        wn1.n nVar = (wn1.n) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nVar.f528974d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            nVar.f528975e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        nVar.f528976f = aVar2.k(intValue);
        return 0;
    }
}
