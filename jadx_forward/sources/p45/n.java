package p45;

/* loaded from: classes15.dex */
public class n extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f433487d;

    /* renamed from: e, reason: collision with root package name */
    public int f433488e;

    /* renamed from: f, reason: collision with root package name */
    public int f433489f;

    /* renamed from: g, reason: collision with root package name */
    public int f433490g;

    /* renamed from: h, reason: collision with root package name */
    public int f433491h;

    /* renamed from: i, reason: collision with root package name */
    public int f433492i;

    /* renamed from: m, reason: collision with root package name */
    public int f433493m;

    /* renamed from: n, reason: collision with root package name */
    public int f433494n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p45.n)) {
            return false;
        }
        p45.n nVar = (p45.n) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f433487d), java.lang.Integer.valueOf(nVar.f433487d)) && n51.f.a(java.lang.Integer.valueOf(this.f433488e), java.lang.Integer.valueOf(nVar.f433488e)) && n51.f.a(java.lang.Integer.valueOf(this.f433489f), java.lang.Integer.valueOf(nVar.f433489f)) && n51.f.a(java.lang.Integer.valueOf(this.f433490g), java.lang.Integer.valueOf(nVar.f433490g)) && n51.f.a(java.lang.Integer.valueOf(this.f433491h), java.lang.Integer.valueOf(nVar.f433491h)) && n51.f.a(java.lang.Integer.valueOf(this.f433492i), java.lang.Integer.valueOf(nVar.f433492i)) && n51.f.a(java.lang.Integer.valueOf(this.f433493m), java.lang.Integer.valueOf(nVar.f433493m)) && n51.f.a(java.lang.Integer.valueOf(this.f433494n), java.lang.Integer.valueOf(nVar.f433494n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f433487d);
            fVar.e(2, this.f433488e);
            fVar.e(3, this.f433489f);
            fVar.e(4, this.f433490g);
            fVar.e(5, this.f433491h);
            fVar.e(6, this.f433492i);
            fVar.e(7, this.f433493m);
            fVar.e(8, this.f433494n);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f433487d) + 0 + b36.f.e(2, this.f433488e) + b36.f.e(3, this.f433489f) + b36.f.e(4, this.f433490g) + b36.f.e(5, this.f433491h) + b36.f.e(6, this.f433492i) + b36.f.e(7, this.f433493m) + b36.f.e(8, this.f433494n);
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
        p45.n nVar = (p45.n) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                nVar.f433487d = aVar2.g(intValue);
                return 0;
            case 2:
                nVar.f433488e = aVar2.g(intValue);
                return 0;
            case 3:
                nVar.f433489f = aVar2.g(intValue);
                return 0;
            case 4:
                nVar.f433490g = aVar2.g(intValue);
                return 0;
            case 5:
                nVar.f433491h = aVar2.g(intValue);
                return 0;
            case 6:
                nVar.f433492i = aVar2.g(intValue);
                return 0;
            case 7:
                nVar.f433493m = aVar2.g(intValue);
                return 0;
            case 8:
                nVar.f433494n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
