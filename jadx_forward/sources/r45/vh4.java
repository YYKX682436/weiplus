package r45;

/* loaded from: classes4.dex */
public class vh4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f469767d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f469768e;

    /* renamed from: f, reason: collision with root package name */
    public int f469769f;

    /* renamed from: g, reason: collision with root package name */
    public int f469770g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f469771h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f469772i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f469773m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f469774n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f469775o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f469776p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vh4)) {
            return false;
        }
        r45.vh4 vh4Var = (r45.vh4) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f469767d), java.lang.Boolean.valueOf(vh4Var.f469767d)) && n51.f.a(java.lang.Boolean.valueOf(this.f469768e), java.lang.Boolean.valueOf(vh4Var.f469768e)) && n51.f.a(java.lang.Integer.valueOf(this.f469769f), java.lang.Integer.valueOf(vh4Var.f469769f)) && n51.f.a(java.lang.Integer.valueOf(this.f469770g), java.lang.Integer.valueOf(vh4Var.f469770g)) && n51.f.a(this.f469771h, vh4Var.f469771h) && n51.f.a(java.lang.Boolean.valueOf(this.f469772i), java.lang.Boolean.valueOf(vh4Var.f469772i)) && n51.f.a(this.f469773m, vh4Var.f469773m) && n51.f.a(java.lang.Boolean.valueOf(this.f469774n), java.lang.Boolean.valueOf(vh4Var.f469774n)) && n51.f.a(this.f469775o, vh4Var.f469775o) && n51.f.a(java.lang.Boolean.valueOf(this.f469776p), java.lang.Boolean.valueOf(vh4Var.f469776p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f469767d);
            fVar.a(2, this.f469768e);
            fVar.e(3, this.f469769f);
            fVar.e(4, this.f469770g);
            java.lang.String str = this.f469771h;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.a(6, this.f469772i);
            java.lang.String str2 = this.f469773m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.a(8, this.f469774n);
            java.lang.String str3 = this.f469775o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.a(10, this.f469776p);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f469767d) + 0 + b36.f.a(2, this.f469768e) + b36.f.e(3, this.f469769f) + b36.f.e(4, this.f469770g);
            java.lang.String str4 = this.f469771h;
            if (str4 != null) {
                a17 += b36.f.j(5, str4);
            }
            int a18 = a17 + b36.f.a(6, this.f469772i);
            java.lang.String str5 = this.f469773m;
            if (str5 != null) {
                a18 += b36.f.j(7, str5);
            }
            int a19 = a18 + b36.f.a(8, this.f469774n);
            java.lang.String str6 = this.f469775o;
            if (str6 != null) {
                a19 += b36.f.j(9, str6);
            }
            return a19 + b36.f.a(10, this.f469776p);
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
        r45.vh4 vh4Var = (r45.vh4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vh4Var.f469767d = aVar2.c(intValue);
                return 0;
            case 2:
                vh4Var.f469768e = aVar2.c(intValue);
                return 0;
            case 3:
                vh4Var.f469769f = aVar2.g(intValue);
                return 0;
            case 4:
                vh4Var.f469770g = aVar2.g(intValue);
                return 0;
            case 5:
                vh4Var.f469771h = aVar2.k(intValue);
                return 0;
            case 6:
                vh4Var.f469772i = aVar2.c(intValue);
                return 0;
            case 7:
                vh4Var.f469773m = aVar2.k(intValue);
                return 0;
            case 8:
                vh4Var.f469774n = aVar2.c(intValue);
                return 0;
            case 9:
                vh4Var.f469775o = aVar2.k(intValue);
                return 0;
            case 10:
                vh4Var.f469776p = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
