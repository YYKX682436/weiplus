package r45;

/* loaded from: classes8.dex */
public class ma4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f461827d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461828e;

    /* renamed from: f, reason: collision with root package name */
    public int f461829f;

    /* renamed from: g, reason: collision with root package name */
    public int f461830g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f461831h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f461832i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f461833m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f461834n;

    /* renamed from: o, reason: collision with root package name */
    public long f461835o;

    /* renamed from: p, reason: collision with root package name */
    public long f461836p;

    /* renamed from: q, reason: collision with root package name */
    public long f461837q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f461838r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ma4)) {
            return false;
        }
        r45.ma4 ma4Var = (r45.ma4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f461827d), java.lang.Integer.valueOf(ma4Var.f461827d)) && n51.f.a(this.f461828e, ma4Var.f461828e) && n51.f.a(java.lang.Integer.valueOf(this.f461829f), java.lang.Integer.valueOf(ma4Var.f461829f)) && n51.f.a(java.lang.Integer.valueOf(this.f461830g), java.lang.Integer.valueOf(ma4Var.f461830g)) && n51.f.a(this.f461831h, ma4Var.f461831h) && n51.f.a(this.f461832i, ma4Var.f461832i) && n51.f.a(this.f461833m, ma4Var.f461833m) && n51.f.a(this.f461834n, ma4Var.f461834n) && n51.f.a(java.lang.Long.valueOf(this.f461835o), java.lang.Long.valueOf(ma4Var.f461835o)) && n51.f.a(java.lang.Long.valueOf(this.f461836p), java.lang.Long.valueOf(ma4Var.f461836p)) && n51.f.a(java.lang.Long.valueOf(this.f461837q), java.lang.Long.valueOf(ma4Var.f461837q)) && n51.f.a(this.f461838r, ma4Var.f461838r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f461827d);
            java.lang.String str = this.f461828e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f461829f);
            fVar.e(4, this.f461830g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f461831h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f461832i;
            if (gVar2 != null) {
                fVar.b(6, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f461833m;
            if (gVar3 != null) {
                fVar.b(7, gVar3);
            }
            java.lang.String str2 = this.f461834n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            fVar.h(9, this.f461835o);
            fVar.h(10, this.f461836p);
            fVar.h(11, this.f461837q);
            java.lang.String str3 = this.f461838r;
            if (str3 != null) {
                fVar.j(12, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f461827d) + 0;
            java.lang.String str4 = this.f461828e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            int e18 = e17 + b36.f.e(3, this.f461829f) + b36.f.e(4, this.f461830g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f461831h;
            if (gVar4 != null) {
                e18 += b36.f.b(5, gVar4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f461832i;
            if (gVar5 != null) {
                e18 += b36.f.b(6, gVar5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f461833m;
            if (gVar6 != null) {
                e18 += b36.f.b(7, gVar6);
            }
            java.lang.String str5 = this.f461834n;
            if (str5 != null) {
                e18 += b36.f.j(8, str5);
            }
            int h17 = e18 + b36.f.h(9, this.f461835o) + b36.f.h(10, this.f461836p) + b36.f.h(11, this.f461837q);
            java.lang.String str6 = this.f461838r;
            return str6 != null ? h17 + b36.f.j(12, str6) : h17;
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
        r45.ma4 ma4Var = (r45.ma4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ma4Var.f461827d = aVar2.g(intValue);
                return 0;
            case 2:
                ma4Var.f461828e = aVar2.k(intValue);
                return 0;
            case 3:
                ma4Var.f461829f = aVar2.g(intValue);
                return 0;
            case 4:
                ma4Var.f461830g = aVar2.g(intValue);
                return 0;
            case 5:
                ma4Var.f461831h = aVar2.d(intValue);
                return 0;
            case 6:
                ma4Var.f461832i = aVar2.d(intValue);
                return 0;
            case 7:
                ma4Var.f461833m = aVar2.d(intValue);
                return 0;
            case 8:
                ma4Var.f461834n = aVar2.k(intValue);
                return 0;
            case 9:
                ma4Var.f461835o = aVar2.i(intValue);
                return 0;
            case 10:
                ma4Var.f461836p = aVar2.i(intValue);
                return 0;
            case 11:
                ma4Var.f461837q = aVar2.i(intValue);
                return 0;
            case 12:
                ma4Var.f461838r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
