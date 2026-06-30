package r45;

/* loaded from: classes9.dex */
public class ln0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f461182d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461183e;

    /* renamed from: f, reason: collision with root package name */
    public long f461184f;

    /* renamed from: g, reason: collision with root package name */
    public long f461185g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461186h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461187i;

    /* renamed from: m, reason: collision with root package name */
    public int f461188m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f461189n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f461190o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ln0)) {
            return false;
        }
        r45.ln0 ln0Var = (r45.ln0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f461182d), java.lang.Long.valueOf(ln0Var.f461182d)) && n51.f.a(this.f461183e, ln0Var.f461183e) && n51.f.a(java.lang.Long.valueOf(this.f461184f), java.lang.Long.valueOf(ln0Var.f461184f)) && n51.f.a(java.lang.Long.valueOf(this.f461185g), java.lang.Long.valueOf(ln0Var.f461185g)) && n51.f.a(this.f461186h, ln0Var.f461186h) && n51.f.a(this.f461187i, ln0Var.f461187i) && n51.f.a(java.lang.Integer.valueOf(this.f461188m), java.lang.Integer.valueOf(ln0Var.f461188m)) && n51.f.a(this.f461189n, ln0Var.f461189n) && n51.f.a(java.lang.Boolean.valueOf(this.f461190o), java.lang.Boolean.valueOf(ln0Var.f461190o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(5, this.f461182d);
            java.lang.String str = this.f461183e;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.h(10, this.f461184f);
            fVar.h(11, this.f461185g);
            java.lang.String str2 = this.f461186h;
            if (str2 != null) {
                fVar.j(12, str2);
            }
            java.lang.String str3 = this.f461187i;
            if (str3 != null) {
                fVar.j(13, str3);
            }
            fVar.e(16, this.f461188m);
            java.lang.String str4 = this.f461189n;
            if (str4 != null) {
                fVar.j(17, str4);
            }
            fVar.a(18, this.f461190o);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(5, this.f461182d) + 0;
            java.lang.String str5 = this.f461183e;
            if (str5 != null) {
                h17 += b36.f.j(6, str5);
            }
            int h18 = h17 + b36.f.h(10, this.f461184f) + b36.f.h(11, this.f461185g);
            java.lang.String str6 = this.f461186h;
            if (str6 != null) {
                h18 += b36.f.j(12, str6);
            }
            java.lang.String str7 = this.f461187i;
            if (str7 != null) {
                h18 += b36.f.j(13, str7);
            }
            int e17 = h18 + b36.f.e(16, this.f461188m);
            java.lang.String str8 = this.f461189n;
            if (str8 != null) {
                e17 += b36.f.j(17, str8);
            }
            return e17 + b36.f.a(18, this.f461190o);
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
        r45.ln0 ln0Var = (r45.ln0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 5:
                ln0Var.f461182d = aVar2.i(intValue);
                return 0;
            case 6:
                ln0Var.f461183e = aVar2.k(intValue);
                return 0;
            case 7:
            case 8:
            case 9:
            case 14:
            case 15:
            default:
                return -1;
            case 10:
                ln0Var.f461184f = aVar2.i(intValue);
                return 0;
            case 11:
                ln0Var.f461185g = aVar2.i(intValue);
                return 0;
            case 12:
                ln0Var.f461186h = aVar2.k(intValue);
                return 0;
            case 13:
                ln0Var.f461187i = aVar2.k(intValue);
                return 0;
            case 16:
                ln0Var.f461188m = aVar2.g(intValue);
                return 0;
            case 17:
                ln0Var.f461189n = aVar2.k(intValue);
                return 0;
            case 18:
                ln0Var.f461190o = aVar2.c(intValue);
                return 0;
        }
    }
}
