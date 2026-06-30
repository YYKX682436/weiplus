package r45;

/* loaded from: classes11.dex */
public class q17 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465106d;

    /* renamed from: e, reason: collision with root package name */
    public int f465107e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465108f;

    /* renamed from: g, reason: collision with root package name */
    public int f465109g;

    /* renamed from: h, reason: collision with root package name */
    public int f465110h;

    /* renamed from: i, reason: collision with root package name */
    public int f465111i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f465112m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q17)) {
            return false;
        }
        r45.q17 q17Var = (r45.q17) fVar;
        return n51.f.a(this.f465106d, q17Var.f465106d) && n51.f.a(java.lang.Integer.valueOf(this.f465107e), java.lang.Integer.valueOf(q17Var.f465107e)) && n51.f.a(this.f465108f, q17Var.f465108f) && n51.f.a(java.lang.Integer.valueOf(this.f465109g), java.lang.Integer.valueOf(q17Var.f465109g)) && n51.f.a(java.lang.Integer.valueOf(this.f465110h), java.lang.Integer.valueOf(q17Var.f465110h)) && n51.f.a(java.lang.Integer.valueOf(this.f465111i), java.lang.Integer.valueOf(q17Var.f465111i)) && n51.f.a(this.f465112m, q17Var.f465112m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465106d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f465107e);
            java.lang.String str2 = this.f465108f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f465109g);
            fVar.e(5, this.f465110h);
            fVar.e(6, this.f465111i);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f465112m;
            if (gVar != null) {
                fVar.b(100, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f465106d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f465107e);
            java.lang.String str4 = this.f465108f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            int e17 = j17 + b36.f.e(4, this.f465109g) + b36.f.e(5, this.f465110h) + b36.f.e(6, this.f465111i);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f465112m;
            return gVar2 != null ? e17 + b36.f.b(100, gVar2) : e17;
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
        r45.q17 q17Var = (r45.q17) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            q17Var.f465112m = aVar2.d(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                q17Var.f465106d = aVar2.k(intValue);
                return 0;
            case 2:
                q17Var.f465107e = aVar2.g(intValue);
                return 0;
            case 3:
                q17Var.f465108f = aVar2.k(intValue);
                return 0;
            case 4:
                q17Var.f465109g = aVar2.g(intValue);
                return 0;
            case 5:
                q17Var.f465110h = aVar2.g(intValue);
                return 0;
            case 6:
                q17Var.f465111i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
