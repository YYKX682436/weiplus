package r45;

/* loaded from: classes9.dex */
public class dq0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f454186d;

    /* renamed from: e, reason: collision with root package name */
    public int f454187e;

    /* renamed from: f, reason: collision with root package name */
    public int f454188f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454189g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454190h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f454191i;

    /* renamed from: m, reason: collision with root package name */
    public int f454192m;

    /* renamed from: n, reason: collision with root package name */
    public int f454193n;

    /* renamed from: o, reason: collision with root package name */
    public int f454194o;

    /* renamed from: p, reason: collision with root package name */
    public int f454195p;

    /* renamed from: q, reason: collision with root package name */
    public int f454196q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dq0)) {
            return false;
        }
        r45.dq0 dq0Var = (r45.dq0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f454186d), java.lang.Integer.valueOf(dq0Var.f454186d)) && n51.f.a(java.lang.Integer.valueOf(this.f454187e), java.lang.Integer.valueOf(dq0Var.f454187e)) && n51.f.a(java.lang.Integer.valueOf(this.f454188f), java.lang.Integer.valueOf(dq0Var.f454188f)) && n51.f.a(this.f454189g, dq0Var.f454189g) && n51.f.a(this.f454190h, dq0Var.f454190h) && n51.f.a(this.f454191i, dq0Var.f454191i) && n51.f.a(java.lang.Integer.valueOf(this.f454192m), java.lang.Integer.valueOf(dq0Var.f454192m)) && n51.f.a(java.lang.Integer.valueOf(this.f454193n), java.lang.Integer.valueOf(dq0Var.f454193n)) && n51.f.a(java.lang.Integer.valueOf(this.f454194o), java.lang.Integer.valueOf(dq0Var.f454194o)) && n51.f.a(java.lang.Integer.valueOf(this.f454195p), java.lang.Integer.valueOf(dq0Var.f454195p)) && n51.f.a(java.lang.Integer.valueOf(this.f454196q), java.lang.Integer.valueOf(dq0Var.f454196q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f454186d);
            fVar.e(2, this.f454187e);
            fVar.e(3, this.f454188f);
            java.lang.String str = this.f454189g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f454190h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f454191i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f454192m);
            fVar.e(8, this.f454193n);
            fVar.e(9, this.f454194o);
            fVar.e(10, this.f454195p);
            fVar.e(11, this.f454196q);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f454186d) + 0 + b36.f.e(2, this.f454187e) + b36.f.e(3, this.f454188f);
            java.lang.String str4 = this.f454189g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f454190h;
            if (str5 != null) {
                e17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f454191i;
            if (str6 != null) {
                e17 += b36.f.j(6, str6);
            }
            return e17 + b36.f.e(7, this.f454192m) + b36.f.e(8, this.f454193n) + b36.f.e(9, this.f454194o) + b36.f.e(10, this.f454195p) + b36.f.e(11, this.f454196q);
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
        r45.dq0 dq0Var = (r45.dq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dq0Var.f454186d = aVar2.g(intValue);
                return 0;
            case 2:
                dq0Var.f454187e = aVar2.g(intValue);
                return 0;
            case 3:
                dq0Var.f454188f = aVar2.g(intValue);
                return 0;
            case 4:
                dq0Var.f454189g = aVar2.k(intValue);
                return 0;
            case 5:
                dq0Var.f454190h = aVar2.k(intValue);
                return 0;
            case 6:
                dq0Var.f454191i = aVar2.k(intValue);
                return 0;
            case 7:
                dq0Var.f454192m = aVar2.g(intValue);
                return 0;
            case 8:
                dq0Var.f454193n = aVar2.g(intValue);
                return 0;
            case 9:
                dq0Var.f454194o = aVar2.g(intValue);
                return 0;
            case 10:
                dq0Var.f454195p = aVar2.g(intValue);
                return 0;
            case 11:
                dq0Var.f454196q = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
