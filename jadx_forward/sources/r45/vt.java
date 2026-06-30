package r45;

/* loaded from: classes4.dex */
public class vt extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f470044d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f470045e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f470046f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vt)) {
            return false;
        }
        r45.vt vtVar = (r45.vt) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f470044d), java.lang.Integer.valueOf(vtVar.f470044d)) && n51.f.a(this.f470045e, vtVar.f470045e) && n51.f.a(java.lang.Boolean.valueOf(this.f470046f), java.lang.Boolean.valueOf(vtVar.f470046f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f470044d);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f470045e;
            if (c19786x6a1e2862 != null) {
                fVar.i(2, c19786x6a1e2862.mo75928xcd1e8d8());
                this.f470045e.mo75956x3d5d1f78(fVar);
            }
            fVar.a(3, this.f470046f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f470044d) + 0;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = this.f470045e;
            if (c19786x6a1e28622 != null) {
                e17 += b36.f.i(2, c19786x6a1e28622.mo75928xcd1e8d8());
            }
            return e17 + b36.f.a(3, this.f470046f);
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
        r45.vt vtVar = (r45.vt) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vtVar.f470044d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            vtVar.f470046f = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28623 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
            if (bArr != null && bArr.length > 0) {
                c19786x6a1e28623.mo11468x92b714fd(bArr);
            }
            vtVar.f470045e = c19786x6a1e28623;
        }
        return 0;
    }
}
