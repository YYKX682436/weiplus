package r45;

/* loaded from: classes9.dex */
public class am extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f451646d;

    /* renamed from: e, reason: collision with root package name */
    public int f451647e;

    /* renamed from: f, reason: collision with root package name */
    public int f451648f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451649g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.am)) {
            return false;
        }
        r45.am amVar = (r45.am) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f451646d), java.lang.Integer.valueOf(amVar.f451646d)) && n51.f.a(java.lang.Integer.valueOf(this.f451647e), java.lang.Integer.valueOf(amVar.f451647e)) && n51.f.a(java.lang.Integer.valueOf(this.f451648f), java.lang.Integer.valueOf(amVar.f451648f)) && n51.f.a(this.f451649g, amVar.f451649g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f451646d);
            fVar.e(2, this.f451647e);
            fVar.e(3, this.f451648f);
            java.lang.String str = this.f451649g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f451646d) + 0 + b36.f.e(2, this.f451647e) + b36.f.e(3, this.f451648f);
            java.lang.String str2 = this.f451649g;
            return str2 != null ? e17 + b36.f.j(4, str2) : e17;
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
        r45.am amVar = (r45.am) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            amVar.f451646d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            amVar.f451647e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            amVar.f451648f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        amVar.f451649g = aVar2.k(intValue);
        return 0;
    }
}
