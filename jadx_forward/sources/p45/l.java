package p45;

/* loaded from: classes15.dex */
public class l extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f433476d;

    /* renamed from: e, reason: collision with root package name */
    public int f433477e;

    /* renamed from: f, reason: collision with root package name */
    public int f433478f;

    /* renamed from: g, reason: collision with root package name */
    public int f433479g;

    /* renamed from: h, reason: collision with root package name */
    public int f433480h;

    /* renamed from: i, reason: collision with root package name */
    public int f433481i;

    /* renamed from: m, reason: collision with root package name */
    public int f433482m;

    /* renamed from: n, reason: collision with root package name */
    public int f433483n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p45.l)) {
            return false;
        }
        p45.l lVar = (p45.l) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f433476d), java.lang.Integer.valueOf(lVar.f433476d)) && n51.f.a(java.lang.Integer.valueOf(this.f433477e), java.lang.Integer.valueOf(lVar.f433477e)) && n51.f.a(java.lang.Integer.valueOf(this.f433478f), java.lang.Integer.valueOf(lVar.f433478f)) && n51.f.a(java.lang.Integer.valueOf(this.f433479g), java.lang.Integer.valueOf(lVar.f433479g)) && n51.f.a(java.lang.Integer.valueOf(this.f433480h), java.lang.Integer.valueOf(lVar.f433480h)) && n51.f.a(java.lang.Integer.valueOf(this.f433481i), java.lang.Integer.valueOf(lVar.f433481i)) && n51.f.a(java.lang.Integer.valueOf(this.f433482m), java.lang.Integer.valueOf(lVar.f433482m)) && n51.f.a(java.lang.Integer.valueOf(this.f433483n), java.lang.Integer.valueOf(lVar.f433483n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f433476d);
            fVar.e(2, this.f433477e);
            fVar.e(3, this.f433478f);
            fVar.e(4, this.f433479g);
            fVar.e(5, this.f433480h);
            fVar.e(6, this.f433481i);
            fVar.e(7, this.f433482m);
            fVar.e(8, this.f433483n);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f433476d) + 0 + b36.f.e(2, this.f433477e) + b36.f.e(3, this.f433478f) + b36.f.e(4, this.f433479g) + b36.f.e(5, this.f433480h) + b36.f.e(6, this.f433481i) + b36.f.e(7, this.f433482m) + b36.f.e(8, this.f433483n);
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
        p45.l lVar = (p45.l) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lVar.f433476d = aVar2.g(intValue);
                return 0;
            case 2:
                lVar.f433477e = aVar2.g(intValue);
                return 0;
            case 3:
                lVar.f433478f = aVar2.g(intValue);
                return 0;
            case 4:
                lVar.f433479g = aVar2.g(intValue);
                return 0;
            case 5:
                lVar.f433480h = aVar2.g(intValue);
                return 0;
            case 6:
                lVar.f433481i = aVar2.g(intValue);
                return 0;
            case 7:
                lVar.f433482m = aVar2.g(intValue);
                return 0;
            case 8:
                lVar.f433483n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
