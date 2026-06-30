package p45;

/* loaded from: classes14.dex */
public class d extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f433423d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f433424e;

    /* renamed from: f, reason: collision with root package name */
    public int f433425f;

    /* renamed from: g, reason: collision with root package name */
    public int f433426g;

    /* renamed from: h, reason: collision with root package name */
    public int f433427h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p45.d)) {
            return false;
        }
        p45.d dVar = (p45.d) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f433423d), java.lang.Integer.valueOf(dVar.f433423d)) && n51.f.a(this.f433424e, dVar.f433424e) && n51.f.a(java.lang.Integer.valueOf(this.f433425f), java.lang.Integer.valueOf(dVar.f433425f)) && n51.f.a(java.lang.Integer.valueOf(this.f433426g), java.lang.Integer.valueOf(dVar.f433426g)) && n51.f.a(java.lang.Integer.valueOf(this.f433427h), java.lang.Integer.valueOf(dVar.f433427h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f433423d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f433424e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f433425f);
            fVar.e(4, this.f433426g);
            fVar.e(5, this.f433427h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f433423d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f433424e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            return e17 + b36.f.e(3, this.f433425f) + b36.f.e(4, this.f433426g) + b36.f.e(5, this.f433427h);
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
        p45.d dVar = (p45.d) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dVar.f433423d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            dVar.f433424e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            dVar.f433425f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            dVar.f433426g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        dVar.f433427h = aVar2.g(intValue);
        return 0;
    }
}
