package ot0;

/* loaded from: classes8.dex */
public class n0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f430129d;

    /* renamed from: e, reason: collision with root package name */
    public long f430130e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f430131f;

    /* renamed from: g, reason: collision with root package name */
    public int f430132g;

    /* renamed from: h, reason: collision with root package name */
    public int f430133h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f430134i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f430135m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f430136n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f430137o;

    /* renamed from: p, reason: collision with root package name */
    public int f430138p;

    /* renamed from: q, reason: collision with root package name */
    public ot0.s0 f430139q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f430140r = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof ot0.n0)) {
            return false;
        }
        ot0.n0 n0Var = (ot0.n0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f430129d), java.lang.Long.valueOf(n0Var.f430129d)) && n51.f.a(java.lang.Long.valueOf(this.f430130e), java.lang.Long.valueOf(n0Var.f430130e)) && n51.f.a(this.f430131f, n0Var.f430131f) && n51.f.a(java.lang.Integer.valueOf(this.f430132g), java.lang.Integer.valueOf(n0Var.f430132g)) && n51.f.a(java.lang.Integer.valueOf(this.f430133h), java.lang.Integer.valueOf(n0Var.f430133h)) && n51.f.a(this.f430134i, n0Var.f430134i) && n51.f.a(this.f430135m, n0Var.f430135m) && n51.f.a(this.f430136n, n0Var.f430136n) && n51.f.a(this.f430137o, n0Var.f430137o) && n51.f.a(java.lang.Integer.valueOf(this.f430138p), java.lang.Integer.valueOf(n0Var.f430138p)) && n51.f.a(this.f430139q, n0Var.f430139q) && n51.f.a(this.f430140r, n0Var.f430140r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f430140r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f430129d);
            fVar.h(2, this.f430130e);
            java.lang.String str = this.f430131f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f430132g);
            fVar.e(5, this.f430133h);
            java.lang.String str2 = this.f430134i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f430135m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f430136n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f430137o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f430138p);
            ot0.s0 s0Var = this.f430139q;
            if (s0Var != null) {
                fVar.i(11, s0Var.mo75928xcd1e8d8());
                this.f430139q.mo75956x3d5d1f78(fVar);
            }
            fVar.g(12, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f430129d) + 0 + b36.f.h(2, this.f430130e);
            java.lang.String str6 = this.f430131f;
            if (str6 != null) {
                h17 += b36.f.j(3, str6);
            }
            int e17 = h17 + b36.f.e(4, this.f430132g) + b36.f.e(5, this.f430133h);
            java.lang.String str7 = this.f430134i;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f430135m;
            if (str8 != null) {
                e17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f430136n;
            if (str9 != null) {
                e17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f430137o;
            if (str10 != null) {
                e17 += b36.f.j(9, str10);
            }
            int e18 = e17 + b36.f.e(10, this.f430138p);
            ot0.s0 s0Var2 = this.f430139q;
            if (s0Var2 != null) {
                e18 += b36.f.i(11, s0Var2.mo75928xcd1e8d8());
            }
            return e18 + b36.f.g(12, 1, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        ot0.n0 n0Var = (ot0.n0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n0Var.f430129d = aVar2.i(intValue);
                return 0;
            case 2:
                n0Var.f430130e = aVar2.i(intValue);
                return 0;
            case 3:
                n0Var.f430131f = aVar2.k(intValue);
                return 0;
            case 4:
                n0Var.f430132g = aVar2.g(intValue);
                return 0;
            case 5:
                n0Var.f430133h = aVar2.g(intValue);
                return 0;
            case 6:
                n0Var.f430134i = aVar2.k(intValue);
                return 0;
            case 7:
                n0Var.f430135m = aVar2.k(intValue);
                return 0;
            case 8:
                n0Var.f430136n = aVar2.k(intValue);
                return 0;
            case 9:
                n0Var.f430137o = aVar2.k(intValue);
                return 0;
            case 10:
                n0Var.f430138p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    ot0.s0 s0Var3 = new ot0.s0();
                    if (bArr2 != null && bArr2.length > 0) {
                        s0Var3.mo11468x92b714fd(bArr2);
                    }
                    n0Var.f430139q = s0Var3;
                }
                return 0;
            case 12:
                n0Var.f430140r.add(aVar2.k(intValue));
                return 0;
            default:
                return -1;
        }
    }
}
