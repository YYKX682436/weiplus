package r45;

/* loaded from: classes11.dex */
public class hv3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f458000d;

    /* renamed from: e, reason: collision with root package name */
    public int f458001e;

    /* renamed from: f, reason: collision with root package name */
    public long f458002f;

    /* renamed from: g, reason: collision with root package name */
    public int f458003g;

    /* renamed from: h, reason: collision with root package name */
    public long f458004h;

    /* renamed from: i, reason: collision with root package name */
    public int f458005i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hv3)) {
            return false;
        }
        r45.hv3 hv3Var = (r45.hv3) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f458000d), java.lang.Long.valueOf(hv3Var.f458000d)) && n51.f.a(java.lang.Integer.valueOf(this.f458001e), java.lang.Integer.valueOf(hv3Var.f458001e)) && n51.f.a(java.lang.Long.valueOf(this.f458002f), java.lang.Long.valueOf(hv3Var.f458002f)) && n51.f.a(java.lang.Integer.valueOf(this.f458003g), java.lang.Integer.valueOf(hv3Var.f458003g)) && n51.f.a(java.lang.Long.valueOf(this.f458004h), java.lang.Long.valueOf(hv3Var.f458004h)) && n51.f.a(java.lang.Integer.valueOf(this.f458005i), java.lang.Integer.valueOf(hv3Var.f458005i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f458000d);
            fVar.e(2, this.f458001e);
            fVar.h(3, this.f458002f);
            fVar.e(4, this.f458003g);
            fVar.h(5, this.f458004h);
            fVar.e(6, this.f458005i);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f458000d) + 0 + b36.f.e(2, this.f458001e) + b36.f.h(3, this.f458002f) + b36.f.e(4, this.f458003g) + b36.f.h(5, this.f458004h) + b36.f.e(6, this.f458005i);
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
        r45.hv3 hv3Var = (r45.hv3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hv3Var.f458000d = aVar2.i(intValue);
                return 0;
            case 2:
                hv3Var.f458001e = aVar2.g(intValue);
                return 0;
            case 3:
                hv3Var.f458002f = aVar2.i(intValue);
                return 0;
            case 4:
                hv3Var.f458003g = aVar2.g(intValue);
                return 0;
            case 5:
                hv3Var.f458004h = aVar2.i(intValue);
                return 0;
            case 6:
                hv3Var.f458005i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
