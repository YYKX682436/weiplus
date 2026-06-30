package r45;

/* loaded from: classes4.dex */
public class ek6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f455117d;

    /* renamed from: e, reason: collision with root package name */
    public int f455118e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f455119f;

    /* renamed from: g, reason: collision with root package name */
    public long f455120g;

    /* renamed from: h, reason: collision with root package name */
    public int f455121h;

    /* renamed from: i, reason: collision with root package name */
    public int f455122i;

    /* renamed from: m, reason: collision with root package name */
    public int f455123m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ek6)) {
            return false;
        }
        r45.ek6 ek6Var = (r45.ek6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f455117d), java.lang.Long.valueOf(ek6Var.f455117d)) && n51.f.a(java.lang.Integer.valueOf(this.f455118e), java.lang.Integer.valueOf(ek6Var.f455118e)) && n51.f.a(this.f455119f, ek6Var.f455119f) && n51.f.a(java.lang.Long.valueOf(this.f455120g), java.lang.Long.valueOf(ek6Var.f455120g)) && n51.f.a(java.lang.Integer.valueOf(this.f455121h), java.lang.Integer.valueOf(ek6Var.f455121h)) && n51.f.a(java.lang.Integer.valueOf(this.f455122i), java.lang.Integer.valueOf(ek6Var.f455122i)) && n51.f.a(java.lang.Integer.valueOf(this.f455123m), java.lang.Integer.valueOf(ek6Var.f455123m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f455117d);
            fVar.e(2, this.f455118e);
            java.lang.String str = this.f455119f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f455120g);
            fVar.e(5, this.f455121h);
            fVar.e(6, this.f455122i);
            fVar.e(7, this.f455123m);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f455117d) + 0 + b36.f.e(2, this.f455118e);
            java.lang.String str2 = this.f455119f;
            if (str2 != null) {
                h17 += b36.f.j(3, str2);
            }
            return h17 + b36.f.h(4, this.f455120g) + b36.f.e(5, this.f455121h) + b36.f.e(6, this.f455122i) + b36.f.e(7, this.f455123m);
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
        r45.ek6 ek6Var = (r45.ek6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ek6Var.f455117d = aVar2.i(intValue);
                return 0;
            case 2:
                ek6Var.f455118e = aVar2.g(intValue);
                return 0;
            case 3:
                ek6Var.f455119f = aVar2.k(intValue);
                return 0;
            case 4:
                ek6Var.f455120g = aVar2.i(intValue);
                return 0;
            case 5:
                ek6Var.f455121h = aVar2.g(intValue);
                return 0;
            case 6:
                ek6Var.f455122i = aVar2.g(intValue);
                return 0;
            case 7:
                ek6Var.f455123m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
