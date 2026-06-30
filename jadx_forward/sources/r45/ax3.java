package r45;

/* loaded from: classes9.dex */
public class ax3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451864d;

    /* renamed from: e, reason: collision with root package name */
    public long f451865e;

    /* renamed from: f, reason: collision with root package name */
    public int f451866f;

    /* renamed from: g, reason: collision with root package name */
    public long f451867g;

    /* renamed from: h, reason: collision with root package name */
    public long f451868h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f451869i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f451870m;

    /* renamed from: n, reason: collision with root package name */
    public int f451871n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f451872o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ax3)) {
            return false;
        }
        r45.ax3 ax3Var = (r45.ax3) fVar;
        return n51.f.a(this.f451864d, ax3Var.f451864d) && n51.f.a(java.lang.Long.valueOf(this.f451865e), java.lang.Long.valueOf(ax3Var.f451865e)) && n51.f.a(java.lang.Integer.valueOf(this.f451866f), java.lang.Integer.valueOf(ax3Var.f451866f)) && n51.f.a(java.lang.Long.valueOf(this.f451867g), java.lang.Long.valueOf(ax3Var.f451867g)) && n51.f.a(java.lang.Long.valueOf(this.f451868h), java.lang.Long.valueOf(ax3Var.f451868h)) && n51.f.a(this.f451869i, ax3Var.f451869i) && n51.f.a(this.f451870m, ax3Var.f451870m) && n51.f.a(java.lang.Integer.valueOf(this.f451871n), java.lang.Integer.valueOf(ax3Var.f451871n)) && n51.f.a(this.f451872o, ax3Var.f451872o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f451864d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f451865e);
            fVar.e(3, this.f451866f);
            fVar.h(4, this.f451867g);
            fVar.h(5, this.f451868h);
            java.lang.String str2 = this.f451869i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f451870m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f451871n);
            java.lang.String str4 = this.f451872o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f451864d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.h(2, this.f451865e) + b36.f.e(3, this.f451866f) + b36.f.h(4, this.f451867g) + b36.f.h(5, this.f451868h);
            java.lang.String str6 = this.f451869i;
            if (str6 != null) {
                j17 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f451870m;
            if (str7 != null) {
                j17 += b36.f.j(7, str7);
            }
            int e17 = j17 + b36.f.e(8, this.f451871n);
            java.lang.String str8 = this.f451872o;
            return str8 != null ? e17 + b36.f.j(9, str8) : e17;
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
        r45.ax3 ax3Var = (r45.ax3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ax3Var.f451864d = aVar2.k(intValue);
                return 0;
            case 2:
                ax3Var.f451865e = aVar2.i(intValue);
                return 0;
            case 3:
                ax3Var.f451866f = aVar2.g(intValue);
                return 0;
            case 4:
                ax3Var.f451867g = aVar2.i(intValue);
                return 0;
            case 5:
                ax3Var.f451868h = aVar2.i(intValue);
                return 0;
            case 6:
                ax3Var.f451869i = aVar2.k(intValue);
                return 0;
            case 7:
                ax3Var.f451870m = aVar2.k(intValue);
                return 0;
            case 8:
                ax3Var.f451871n = aVar2.g(intValue);
                return 0;
            case 9:
                ax3Var.f451872o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
