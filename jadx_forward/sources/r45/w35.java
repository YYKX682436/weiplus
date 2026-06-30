package r45;

/* loaded from: classes15.dex */
public class w35 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f470383o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f470384p;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470375d = "";

    /* renamed from: e, reason: collision with root package name */
    public boolean f470376e = false;

    /* renamed from: f, reason: collision with root package name */
    public long f470377f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f470378g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f470379h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f470380i = -1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f470381m = "";

    /* renamed from: n, reason: collision with root package name */
    public int f470382n = 0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f470385q = "";

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w35)) {
            return false;
        }
        r45.w35 w35Var = (r45.w35) fVar;
        return n51.f.a(this.f470375d, w35Var.f470375d) && n51.f.a(java.lang.Boolean.valueOf(this.f470376e), java.lang.Boolean.valueOf(w35Var.f470376e)) && n51.f.a(java.lang.Long.valueOf(this.f470377f), java.lang.Long.valueOf(w35Var.f470377f)) && n51.f.a(java.lang.Long.valueOf(this.f470378g), java.lang.Long.valueOf(w35Var.f470378g)) && n51.f.a(java.lang.Long.valueOf(this.f470379h), java.lang.Long.valueOf(w35Var.f470379h)) && n51.f.a(java.lang.Integer.valueOf(this.f470380i), java.lang.Integer.valueOf(w35Var.f470380i)) && n51.f.a(this.f470381m, w35Var.f470381m) && n51.f.a(java.lang.Integer.valueOf(this.f470382n), java.lang.Integer.valueOf(w35Var.f470382n)) && n51.f.a(this.f470383o, w35Var.f470383o) && n51.f.a(java.lang.Boolean.valueOf(this.f470384p), java.lang.Boolean.valueOf(w35Var.f470384p)) && n51.f.a(this.f470385q, w35Var.f470385q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f470375d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.a(2, this.f470376e);
            fVar.h(3, this.f470377f);
            fVar.h(4, this.f470378g);
            fVar.h(5, this.f470379h);
            fVar.e(6, this.f470380i);
            java.lang.String str2 = this.f470381m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f470382n);
            java.lang.String str3 = this.f470383o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.a(10, this.f470384p);
            java.lang.String str4 = this.f470385q;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f470375d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.a(2, this.f470376e) + b36.f.h(3, this.f470377f) + b36.f.h(4, this.f470378g) + b36.f.h(5, this.f470379h) + b36.f.e(6, this.f470380i);
            java.lang.String str6 = this.f470381m;
            if (str6 != null) {
                j17 += b36.f.j(7, str6);
            }
            int e17 = j17 + b36.f.e(8, this.f470382n);
            java.lang.String str7 = this.f470383o;
            if (str7 != null) {
                e17 += b36.f.j(9, str7);
            }
            int a17 = e17 + b36.f.a(10, this.f470384p);
            java.lang.String str8 = this.f470385q;
            return str8 != null ? a17 + b36.f.j(11, str8) : a17;
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
        r45.w35 w35Var = (r45.w35) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                w35Var.f470375d = aVar2.k(intValue);
                return 0;
            case 2:
                w35Var.f470376e = aVar2.c(intValue);
                return 0;
            case 3:
                w35Var.f470377f = aVar2.i(intValue);
                return 0;
            case 4:
                w35Var.f470378g = aVar2.i(intValue);
                return 0;
            case 5:
                w35Var.f470379h = aVar2.i(intValue);
                return 0;
            case 6:
                w35Var.f470380i = aVar2.g(intValue);
                return 0;
            case 7:
                w35Var.f470381m = aVar2.k(intValue);
                return 0;
            case 8:
                w35Var.f470382n = aVar2.g(intValue);
                return 0;
            case 9:
                w35Var.f470383o = aVar2.k(intValue);
                return 0;
            case 10:
                w35Var.f470384p = aVar2.c(intValue);
                return 0;
            case 11:
                w35Var.f470385q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
