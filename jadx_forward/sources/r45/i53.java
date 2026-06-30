package r45;

/* loaded from: classes11.dex */
public class i53 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f458273d = 7;

    /* renamed from: e, reason: collision with root package name */
    public long f458274e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f458275f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f458276g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f458277h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f458278i = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f458279m = false;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i53)) {
            return false;
        }
        r45.i53 i53Var = (r45.i53) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f458273d), java.lang.Integer.valueOf(i53Var.f458273d)) && n51.f.a(java.lang.Long.valueOf(this.f458274e), java.lang.Long.valueOf(i53Var.f458274e)) && n51.f.a(java.lang.Integer.valueOf(this.f458275f), java.lang.Integer.valueOf(i53Var.f458275f)) && n51.f.a(this.f458276g, i53Var.f458276g) && n51.f.a(java.lang.Integer.valueOf(this.f458277h), java.lang.Integer.valueOf(i53Var.f458277h)) && n51.f.a(java.lang.Integer.valueOf(this.f458278i), java.lang.Integer.valueOf(i53Var.f458278i)) && n51.f.a(java.lang.Boolean.valueOf(this.f458279m), java.lang.Boolean.valueOf(i53Var.f458279m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f458273d);
            fVar.h(2, this.f458274e);
            fVar.e(3, this.f458275f);
            java.lang.String str = this.f458276g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f458277h);
            fVar.e(6, this.f458278i);
            fVar.a(7, this.f458279m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f458273d) + 0 + b36.f.h(2, this.f458274e) + b36.f.e(3, this.f458275f);
            java.lang.String str2 = this.f458276g;
            if (str2 != null) {
                e17 += b36.f.j(4, str2);
            }
            return e17 + b36.f.e(5, this.f458277h) + b36.f.e(6, this.f458278i) + b36.f.a(7, this.f458279m);
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
        r45.i53 i53Var = (r45.i53) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                i53Var.f458273d = aVar2.g(intValue);
                return 0;
            case 2:
                i53Var.f458274e = aVar2.i(intValue);
                return 0;
            case 3:
                i53Var.f458275f = aVar2.g(intValue);
                return 0;
            case 4:
                i53Var.f458276g = aVar2.k(intValue);
                return 0;
            case 5:
                i53Var.f458277h = aVar2.g(intValue);
                return 0;
            case 6:
                i53Var.f458278i = aVar2.g(intValue);
                return 0;
            case 7:
                i53Var.f458279m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
