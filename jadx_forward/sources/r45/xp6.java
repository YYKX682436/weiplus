package r45;

/* loaded from: classes2.dex */
public class xp6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f471852d;

    /* renamed from: e, reason: collision with root package name */
    public long f471853e;

    /* renamed from: f, reason: collision with root package name */
    public long f471854f;

    /* renamed from: g, reason: collision with root package name */
    public double f471855g;

    /* renamed from: h, reason: collision with root package name */
    public double f471856h;

    /* renamed from: i, reason: collision with root package name */
    public double f471857i;

    /* renamed from: m, reason: collision with root package name */
    public double f471858m;

    /* renamed from: n, reason: collision with root package name */
    public long f471859n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xp6)) {
            return false;
        }
        r45.xp6 xp6Var = (r45.xp6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f471852d), java.lang.Long.valueOf(xp6Var.f471852d)) && n51.f.a(java.lang.Long.valueOf(this.f471853e), java.lang.Long.valueOf(xp6Var.f471853e)) && n51.f.a(java.lang.Long.valueOf(this.f471854f), java.lang.Long.valueOf(xp6Var.f471854f)) && n51.f.a(java.lang.Double.valueOf(this.f471855g), java.lang.Double.valueOf(xp6Var.f471855g)) && n51.f.a(java.lang.Double.valueOf(this.f471856h), java.lang.Double.valueOf(xp6Var.f471856h)) && n51.f.a(java.lang.Double.valueOf(this.f471857i), java.lang.Double.valueOf(xp6Var.f471857i)) && n51.f.a(java.lang.Double.valueOf(this.f471858m), java.lang.Double.valueOf(xp6Var.f471858m)) && n51.f.a(java.lang.Long.valueOf(this.f471859n), java.lang.Long.valueOf(xp6Var.f471859n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f471852d);
            fVar.h(2, this.f471853e);
            fVar.h(3, this.f471854f);
            fVar.c(4, this.f471855g);
            fVar.c(5, this.f471856h);
            fVar.c(6, this.f471857i);
            fVar.c(7, this.f471858m);
            fVar.h(8, this.f471859n);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f471852d) + 0 + b36.f.h(2, this.f471853e) + b36.f.h(3, this.f471854f) + b36.f.c(4, this.f471855g) + b36.f.c(5, this.f471856h) + b36.f.c(6, this.f471857i) + b36.f.c(7, this.f471858m) + b36.f.h(8, this.f471859n);
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
        r45.xp6 xp6Var = (r45.xp6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xp6Var.f471852d = aVar2.i(intValue);
                return 0;
            case 2:
                xp6Var.f471853e = aVar2.i(intValue);
                return 0;
            case 3:
                xp6Var.f471854f = aVar2.i(intValue);
                return 0;
            case 4:
                xp6Var.f471855g = aVar2.e(intValue);
                return 0;
            case 5:
                xp6Var.f471856h = aVar2.e(intValue);
                return 0;
            case 6:
                xp6Var.f471857i = aVar2.e(intValue);
                return 0;
            case 7:
                xp6Var.f471858m = aVar2.e(intValue);
                return 0;
            case 8:
                xp6Var.f471859n = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
