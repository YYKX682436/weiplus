package r45;

/* loaded from: classes14.dex */
public class a6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451281d;

    /* renamed from: e, reason: collision with root package name */
    public int f451282e;

    /* renamed from: f, reason: collision with root package name */
    public int f451283f;

    /* renamed from: g, reason: collision with root package name */
    public int f451284g;

    /* renamed from: h, reason: collision with root package name */
    public long f451285h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f451286i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f451287m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f451288n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a6)) {
            return false;
        }
        r45.a6 a6Var = (r45.a6) fVar;
        return n51.f.a(this.f451281d, a6Var.f451281d) && n51.f.a(java.lang.Integer.valueOf(this.f451282e), java.lang.Integer.valueOf(a6Var.f451282e)) && n51.f.a(java.lang.Integer.valueOf(this.f451283f), java.lang.Integer.valueOf(a6Var.f451283f)) && n51.f.a(java.lang.Integer.valueOf(this.f451284g), java.lang.Integer.valueOf(a6Var.f451284g)) && n51.f.a(java.lang.Long.valueOf(this.f451285h), java.lang.Long.valueOf(a6Var.f451285h)) && n51.f.a(this.f451286i, a6Var.f451286i) && n51.f.a(java.lang.Boolean.valueOf(this.f451287m), java.lang.Boolean.valueOf(a6Var.f451287m)) && n51.f.a(this.f451288n, a6Var.f451288n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f451281d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f451282e);
            fVar.e(3, this.f451283f);
            fVar.e(4, this.f451284g);
            fVar.h(5, this.f451285h);
            java.lang.String str2 = this.f451286i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.a(7, this.f451287m);
            java.lang.String str3 = this.f451288n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f451281d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f451282e) + b36.f.e(3, this.f451283f) + b36.f.e(4, this.f451284g) + b36.f.h(5, this.f451285h);
            java.lang.String str5 = this.f451286i;
            if (str5 != null) {
                j17 += b36.f.j(6, str5);
            }
            int a17 = j17 + b36.f.a(7, this.f451287m);
            java.lang.String str6 = this.f451288n;
            return str6 != null ? a17 + b36.f.j(8, str6) : a17;
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
        r45.a6 a6Var = (r45.a6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                a6Var.f451281d = aVar2.k(intValue);
                return 0;
            case 2:
                a6Var.f451282e = aVar2.g(intValue);
                return 0;
            case 3:
                a6Var.f451283f = aVar2.g(intValue);
                return 0;
            case 4:
                a6Var.f451284g = aVar2.g(intValue);
                return 0;
            case 5:
                a6Var.f451285h = aVar2.i(intValue);
                return 0;
            case 6:
                a6Var.f451286i = aVar2.k(intValue);
                return 0;
            case 7:
                a6Var.f451287m = aVar2.c(intValue);
                return 0;
            case 8:
                a6Var.f451288n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
