package p45;

/* loaded from: classes9.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f433409d;

    /* renamed from: e, reason: collision with root package name */
    public int f433410e;

    /* renamed from: f, reason: collision with root package name */
    public int f433411f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p45.a)) {
            return false;
        }
        p45.a aVar = (p45.a) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f433409d), java.lang.Integer.valueOf(aVar.f433409d)) && n51.f.a(java.lang.Integer.valueOf(this.f433410e), java.lang.Integer.valueOf(aVar.f433410e)) && n51.f.a(java.lang.Integer.valueOf(this.f433411f), java.lang.Integer.valueOf(aVar.f433411f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f433409d);
            fVar.e(2, this.f433410e);
            fVar.e(3, this.f433411f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f433409d) + 0 + b36.f.e(2, this.f433410e) + b36.f.e(3, this.f433411f);
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
        p45.a aVar3 = (p45.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            aVar3.f433409d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            aVar3.f433410e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        aVar3.f433411f = aVar2.g(intValue);
        return 0;
    }
}
