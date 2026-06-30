package r45;

/* loaded from: classes14.dex */
public class wv0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f471014d;

    /* renamed from: e, reason: collision with root package name */
    public int f471015e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f471016f;

    /* renamed from: g, reason: collision with root package name */
    public float f471017g;

    /* renamed from: h, reason: collision with root package name */
    public float f471018h;

    /* renamed from: i, reason: collision with root package name */
    public long f471019i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f471020m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f471022o;

    /* renamed from: p, reason: collision with root package name */
    public int f471023p;

    /* renamed from: q, reason: collision with root package name */
    public int f471024q;

    /* renamed from: r, reason: collision with root package name */
    public int f471025r;

    /* renamed from: s, reason: collision with root package name */
    public int f471026s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f471027t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f471028u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f471029v;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f471021n = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public java.util.LinkedList f471030w = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wv0)) {
            return false;
        }
        r45.wv0 wv0Var = (r45.wv0) fVar;
        return n51.f.a(this.f76494x2de60e5e, wv0Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f471014d), java.lang.Integer.valueOf(wv0Var.f471014d)) && n51.f.a(java.lang.Integer.valueOf(this.f471015e), java.lang.Integer.valueOf(wv0Var.f471015e)) && n51.f.a(this.f471016f, wv0Var.f471016f) && n51.f.a(java.lang.Float.valueOf(this.f471017g), java.lang.Float.valueOf(wv0Var.f471017g)) && n51.f.a(java.lang.Float.valueOf(this.f471018h), java.lang.Float.valueOf(wv0Var.f471018h)) && n51.f.a(java.lang.Long.valueOf(this.f471019i), java.lang.Long.valueOf(wv0Var.f471019i)) && n51.f.a(this.f471020m, wv0Var.f471020m) && n51.f.a(this.f471021n, wv0Var.f471021n) && n51.f.a(this.f471022o, wv0Var.f471022o) && n51.f.a(java.lang.Integer.valueOf(this.f471023p), java.lang.Integer.valueOf(wv0Var.f471023p)) && n51.f.a(java.lang.Integer.valueOf(this.f471024q), java.lang.Integer.valueOf(wv0Var.f471024q)) && n51.f.a(java.lang.Integer.valueOf(this.f471025r), java.lang.Integer.valueOf(wv0Var.f471025r)) && n51.f.a(java.lang.Integer.valueOf(this.f471026s), java.lang.Integer.valueOf(wv0Var.f471026s)) && n51.f.a(this.f471027t, wv0Var.f471027t) && n51.f.a(this.f471028u, wv0Var.f471028u) && n51.f.a(this.f471029v, wv0Var.f471029v) && n51.f.a(this.f471030w, wv0Var.f471030w);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f471021n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f471014d);
            fVar.e(3, this.f471015e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f471016f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.d(31, this.f471017g);
            fVar.d(32, this.f471018h);
            fVar.h(33, this.f471019i);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f471020m;
            if (gVar2 != null) {
                fVar.b(34, gVar2);
            }
            fVar.g(35, 1, linkedList);
            java.lang.String str = this.f471022o;
            if (str != null) {
                fVar.j(36, str);
            }
            fVar.e(41, this.f471023p);
            fVar.e(42, this.f471024q);
            fVar.e(43, this.f471025r);
            fVar.e(44, this.f471026s);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f471027t;
            if (gVar3 != null) {
                fVar.b(45, gVar3);
            }
            java.lang.String str2 = this.f471028u;
            if (str2 != null) {
                fVar.j(81, str2);
            }
            java.lang.String str3 = this.f471029v;
            if (str3 != null) {
                fVar.j(82, str3);
            }
            fVar.g(91, 8, this.f471030w);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f471014d) + b36.f.e(3, this.f471015e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f471016f;
            if (gVar4 != null) {
                i18 += b36.f.b(4, gVar4);
            }
            int d17 = i18 + b36.f.d(31, this.f471017g) + b36.f.d(32, this.f471018h) + b36.f.h(33, this.f471019i);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f471020m;
            if (gVar5 != null) {
                d17 += b36.f.b(34, gVar5);
            }
            int g17 = d17 + b36.f.g(35, 1, linkedList);
            java.lang.String str4 = this.f471022o;
            if (str4 != null) {
                g17 += b36.f.j(36, str4);
            }
            int e17 = g17 + b36.f.e(41, this.f471023p) + b36.f.e(42, this.f471024q) + b36.f.e(43, this.f471025r) + b36.f.e(44, this.f471026s);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f471027t;
            if (gVar6 != null) {
                e17 += b36.f.b(45, gVar6);
            }
            java.lang.String str5 = this.f471028u;
            if (str5 != null) {
                e17 += b36.f.j(81, str5);
            }
            java.lang.String str6 = this.f471029v;
            if (str6 != null) {
                e17 += b36.f.j(82, str6);
            }
            return e17 + b36.f.g(91, 8, this.f471030w);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f471030w.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.wv0 wv0Var = (r45.wv0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.mo11468x92b714fd(bArr2);
                }
                wv0Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            wv0Var.f471014d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            wv0Var.f471015e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            wv0Var.f471016f = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 81) {
            wv0Var.f471028u = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 82) {
            wv0Var.f471029v = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 91) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.gb gbVar = new r45.gb();
                if (bArr3 != null && bArr3.length > 0) {
                    gbVar.mo11468x92b714fd(bArr3);
                }
                wv0Var.f471030w.add(gbVar);
            }
            return 0;
        }
        switch (intValue) {
            case 31:
                wv0Var.f471017g = aVar2.f(intValue);
                return 0;
            case 32:
                wv0Var.f471018h = aVar2.f(intValue);
                return 0;
            case 33:
                wv0Var.f471019i = aVar2.i(intValue);
                return 0;
            case 34:
                wv0Var.f471020m = aVar2.d(intValue);
                return 0;
            case 35:
                wv0Var.f471021n.add(aVar2.k(intValue));
                return 0;
            case 36:
                wv0Var.f471022o = aVar2.k(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 41:
                        wv0Var.f471023p = aVar2.g(intValue);
                        return 0;
                    case 42:
                        wv0Var.f471024q = aVar2.g(intValue);
                        return 0;
                    case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
                        wv0Var.f471025r = aVar2.g(intValue);
                        return 0;
                    case 44:
                        wv0Var.f471026s = aVar2.g(intValue);
                        return 0;
                    case 45:
                        wv0Var.f471027t = aVar2.d(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
