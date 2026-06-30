package r45;

/* loaded from: classes7.dex */
public class dz extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454397d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454398e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454399f;

    /* renamed from: g, reason: collision with root package name */
    public int f454400g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dz)) {
            return false;
        }
        r45.dz dzVar = (r45.dz) fVar;
        return n51.f.a(this.f454397d, dzVar.f454397d) && n51.f.a(this.f454398e, dzVar.f454398e) && n51.f.a(this.f454399f, dzVar.f454399f) && n51.f.a(java.lang.Integer.valueOf(this.f454400g), java.lang.Integer.valueOf(dzVar.f454400g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f454397d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f454398e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f454399f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f454400g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f454397d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f454398e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f454399f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f454400g);
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
        r45.dz dzVar = (r45.dz) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dzVar.f454397d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            dzVar.f454398e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            dzVar.f454399f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        dzVar.f454400g = aVar2.g(intValue);
        return 0;
    }
}
