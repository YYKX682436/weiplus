package r45;

/* loaded from: classes4.dex */
public class pi extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464598d;

    /* renamed from: e, reason: collision with root package name */
    public int f464599e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464600f;

    /* renamed from: g, reason: collision with root package name */
    public int f464601g;

    /* renamed from: h, reason: collision with root package name */
    public int f464602h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pi)) {
            return false;
        }
        r45.pi piVar = (r45.pi) fVar;
        return n51.f.a(this.f464598d, piVar.f464598d) && n51.f.a(java.lang.Integer.valueOf(this.f464599e), java.lang.Integer.valueOf(piVar.f464599e)) && n51.f.a(this.f464600f, piVar.f464600f) && n51.f.a(java.lang.Integer.valueOf(this.f464601g), java.lang.Integer.valueOf(piVar.f464601g)) && n51.f.a(java.lang.Integer.valueOf(this.f464602h), java.lang.Integer.valueOf(piVar.f464602h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464598d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f464599e);
            java.lang.String str2 = this.f464600f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f464601g);
            fVar.e(5, this.f464602h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f464598d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f464599e);
            java.lang.String str4 = this.f464600f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.e(4, this.f464601g) + b36.f.e(5, this.f464602h);
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
        r45.pi piVar = (r45.pi) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            piVar.f464598d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            piVar.f464599e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            piVar.f464600f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            piVar.f464601g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        piVar.f464602h = aVar2.g(intValue);
        return 0;
    }
}
