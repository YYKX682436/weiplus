package r45;

/* loaded from: classes7.dex */
public class me3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f461931d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461932e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461933f;

    /* renamed from: g, reason: collision with root package name */
    public int f461934g;

    /* renamed from: h, reason: collision with root package name */
    public int f461935h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f461936i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f461937m;

    /* renamed from: n, reason: collision with root package name */
    public r45.jr5 f461938n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f461939o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f461940p;

    /* renamed from: q, reason: collision with root package name */
    public int f461941q;

    /* renamed from: r, reason: collision with root package name */
    public long f461942r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.me3)) {
            return false;
        }
        r45.me3 me3Var = (r45.me3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f461931d), java.lang.Integer.valueOf(me3Var.f461931d)) && n51.f.a(this.f461932e, me3Var.f461932e) && n51.f.a(this.f461933f, me3Var.f461933f) && n51.f.a(java.lang.Integer.valueOf(this.f461934g), java.lang.Integer.valueOf(me3Var.f461934g)) && n51.f.a(java.lang.Integer.valueOf(this.f461935h), java.lang.Integer.valueOf(me3Var.f461935h)) && n51.f.a(java.lang.Boolean.valueOf(this.f461936i), java.lang.Boolean.valueOf(me3Var.f461936i)) && n51.f.a(java.lang.Boolean.valueOf(this.f461937m), java.lang.Boolean.valueOf(me3Var.f461937m)) && n51.f.a(this.f461938n, me3Var.f461938n) && n51.f.a(this.f461939o, me3Var.f461939o) && n51.f.a(this.f461940p, me3Var.f461940p) && n51.f.a(java.lang.Integer.valueOf(this.f461941q), java.lang.Integer.valueOf(me3Var.f461941q)) && n51.f.a(java.lang.Long.valueOf(this.f461942r), java.lang.Long.valueOf(me3Var.f461942r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f461931d);
            java.lang.String str = this.f461932e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f461933f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f461934g);
            fVar.e(5, this.f461935h);
            fVar.a(6, this.f461936i);
            fVar.a(7, this.f461937m);
            r45.jr5 jr5Var = this.f461938n;
            if (jr5Var != null) {
                fVar.i(20, jr5Var.mo75928xcd1e8d8());
                this.f461938n.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f461939o;
            if (str3 != null) {
                fVar.j(21, str3);
            }
            java.lang.String str4 = this.f461940p;
            if (str4 != null) {
                fVar.j(22, str4);
            }
            fVar.e(23, this.f461941q);
            fVar.h(24, this.f461942r);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f461931d) + 0;
            java.lang.String str5 = this.f461932e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f461933f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            int e18 = e17 + b36.f.e(4, this.f461934g) + b36.f.e(5, this.f461935h) + b36.f.a(6, this.f461936i) + b36.f.a(7, this.f461937m);
            r45.jr5 jr5Var2 = this.f461938n;
            if (jr5Var2 != null) {
                e18 += b36.f.i(20, jr5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f461939o;
            if (str7 != null) {
                e18 += b36.f.j(21, str7);
            }
            java.lang.String str8 = this.f461940p;
            if (str8 != null) {
                e18 += b36.f.j(22, str8);
            }
            return e18 + b36.f.e(23, this.f461941q) + b36.f.h(24, this.f461942r);
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
        r45.me3 me3Var = (r45.me3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                me3Var.f461931d = aVar2.g(intValue);
                return 0;
            case 2:
                me3Var.f461932e = aVar2.k(intValue);
                return 0;
            case 3:
                me3Var.f461933f = aVar2.k(intValue);
                return 0;
            case 4:
                me3Var.f461934g = aVar2.g(intValue);
                return 0;
            case 5:
                me3Var.f461935h = aVar2.g(intValue);
                return 0;
            case 6:
                me3Var.f461936i = aVar2.c(intValue);
                return 0;
            case 7:
                me3Var.f461937m = aVar2.c(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 20:
                        java.util.LinkedList j17 = aVar2.j(intValue);
                        int size = j17.size();
                        for (int i18 = 0; i18 < size; i18++) {
                            byte[] bArr = (byte[]) j17.get(i18);
                            r45.jr5 jr5Var3 = new r45.jr5();
                            if (bArr != null && bArr.length > 0) {
                                jr5Var3.mo11468x92b714fd(bArr);
                            }
                            me3Var.f461938n = jr5Var3;
                        }
                        return 0;
                    case 21:
                        me3Var.f461939o = aVar2.k(intValue);
                        return 0;
                    case 22:
                        me3Var.f461940p = aVar2.k(intValue);
                        return 0;
                    case 23:
                        me3Var.f461941q = aVar2.g(intValue);
                        return 0;
                    case 24:
                        me3Var.f461942r = aVar2.i(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
