package r45;

/* loaded from: classes4.dex */
public class tr extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f468252d;

    /* renamed from: e, reason: collision with root package name */
    public int f468253e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f468254f;

    /* renamed from: g, reason: collision with root package name */
    public int f468255g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tr)) {
            return false;
        }
        r45.tr trVar = (r45.tr) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f468252d), java.lang.Integer.valueOf(trVar.f468252d)) && n51.f.a(java.lang.Integer.valueOf(this.f468253e), java.lang.Integer.valueOf(trVar.f468253e)) && n51.f.a(this.f468254f, trVar.f468254f) && n51.f.a(java.lang.Integer.valueOf(this.f468255g), java.lang.Integer.valueOf(trVar.f468255g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f468252d);
            fVar.e(2, this.f468253e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f468254f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f468255g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f468252d) + 0 + b36.f.e(2, this.f468253e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f468254f;
            if (gVar2 != null) {
                e17 += b36.f.b(3, gVar2);
            }
            return e17 + b36.f.e(4, this.f468255g);
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
        r45.tr trVar = (r45.tr) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            trVar.f468252d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            trVar.f468253e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            trVar.f468254f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        trVar.f468255g = aVar2.g(intValue);
        return 0;
    }
}
