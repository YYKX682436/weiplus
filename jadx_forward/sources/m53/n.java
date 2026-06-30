package m53;

/* loaded from: classes8.dex */
public class n extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f405446d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f405447e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f405448f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f405449g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f405450h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f405451i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f405452m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f405453n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.n)) {
            return false;
        }
        m53.n nVar = (m53.n) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f405446d), java.lang.Boolean.valueOf(nVar.f405446d)) && n51.f.a(java.lang.Boolean.valueOf(this.f405447e), java.lang.Boolean.valueOf(nVar.f405447e)) && n51.f.a(java.lang.Boolean.valueOf(this.f405448f), java.lang.Boolean.valueOf(nVar.f405448f)) && n51.f.a(java.lang.Boolean.valueOf(this.f405449g), java.lang.Boolean.valueOf(nVar.f405449g)) && n51.f.a(java.lang.Boolean.valueOf(this.f405450h), java.lang.Boolean.valueOf(nVar.f405450h)) && n51.f.a(java.lang.Boolean.valueOf(this.f405451i), java.lang.Boolean.valueOf(nVar.f405451i)) && n51.f.a(java.lang.Boolean.valueOf(this.f405452m), java.lang.Boolean.valueOf(nVar.f405452m)) && n51.f.a(java.lang.Boolean.valueOf(this.f405453n), java.lang.Boolean.valueOf(nVar.f405453n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f405446d);
            fVar.a(2, this.f405447e);
            fVar.a(3, this.f405448f);
            fVar.a(4, this.f405449g);
            fVar.a(5, this.f405450h);
            fVar.a(6, this.f405451i);
            fVar.a(7, this.f405452m);
            fVar.a(8, this.f405453n);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f405446d) + 0 + b36.f.a(2, this.f405447e) + b36.f.a(3, this.f405448f) + b36.f.a(4, this.f405449g) + b36.f.a(5, this.f405450h) + b36.f.a(6, this.f405451i) + b36.f.a(7, this.f405452m) + b36.f.a(8, this.f405453n);
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
        m53.n nVar = (m53.n) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                nVar.f405446d = aVar2.c(intValue);
                return 0;
            case 2:
                nVar.f405447e = aVar2.c(intValue);
                return 0;
            case 3:
                nVar.f405448f = aVar2.c(intValue);
                return 0;
            case 4:
                nVar.f405449g = aVar2.c(intValue);
                return 0;
            case 5:
                nVar.f405450h = aVar2.c(intValue);
                return 0;
            case 6:
                nVar.f405451i = aVar2.c(intValue);
                return 0;
            case 7:
                nVar.f405452m = aVar2.c(intValue);
                return 0;
            case 8:
                nVar.f405453n = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
