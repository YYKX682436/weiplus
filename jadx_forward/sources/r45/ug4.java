package r45;

/* loaded from: classes7.dex */
public class ug4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.pg4 f468880d;

    /* renamed from: e, reason: collision with root package name */
    public int f468881e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468882f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f468883g;

    /* renamed from: h, reason: collision with root package name */
    public long f468884h;

    /* renamed from: i, reason: collision with root package name */
    public long f468885i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f468886m;

    /* renamed from: n, reason: collision with root package name */
    public int f468887n;

    /* renamed from: o, reason: collision with root package name */
    public float f468888o;

    /* renamed from: p, reason: collision with root package name */
    public float f468889p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f468890q = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f468891r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public int f468892s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f468893t;

    /* renamed from: u, reason: collision with root package name */
    public int f468894u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f468895v;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ug4)) {
            return false;
        }
        r45.ug4 ug4Var = (r45.ug4) fVar;
        return n51.f.a(this.f468880d, ug4Var.f468880d) && n51.f.a(java.lang.Integer.valueOf(this.f468881e), java.lang.Integer.valueOf(ug4Var.f468881e)) && n51.f.a(this.f468882f, ug4Var.f468882f) && n51.f.a(java.lang.Boolean.valueOf(this.f468883g), java.lang.Boolean.valueOf(ug4Var.f468883g)) && n51.f.a(java.lang.Long.valueOf(this.f468884h), java.lang.Long.valueOf(ug4Var.f468884h)) && n51.f.a(java.lang.Long.valueOf(this.f468885i), java.lang.Long.valueOf(ug4Var.f468885i)) && n51.f.a(this.f468886m, ug4Var.f468886m) && n51.f.a(java.lang.Integer.valueOf(this.f468887n), java.lang.Integer.valueOf(ug4Var.f468887n)) && n51.f.a(java.lang.Float.valueOf(this.f468888o), java.lang.Float.valueOf(ug4Var.f468888o)) && n51.f.a(java.lang.Float.valueOf(this.f468889p), java.lang.Float.valueOf(ug4Var.f468889p)) && n51.f.a(this.f468890q, ug4Var.f468890q) && n51.f.a(this.f468891r, ug4Var.f468891r) && n51.f.a(java.lang.Integer.valueOf(this.f468892s), java.lang.Integer.valueOf(ug4Var.f468892s)) && n51.f.a(this.f468893t, ug4Var.f468893t) && n51.f.a(java.lang.Integer.valueOf(this.f468894u), java.lang.Integer.valueOf(ug4Var.f468894u)) && n51.f.a(this.f468895v, ug4Var.f468895v);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f468891r;
        java.util.LinkedList linkedList2 = this.f468890q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.pg4 pg4Var = this.f468880d;
            if (pg4Var != null) {
                fVar.i(1, pg4Var.mo75928xcd1e8d8());
                this.f468880d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f468881e);
            java.lang.String str = this.f468882f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.a(7, this.f468883g);
            fVar.h(4, this.f468884h);
            fVar.h(5, this.f468885i);
            java.lang.String str2 = this.f468886m;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(101, this.f468887n);
            fVar.d(102, this.f468888o);
            fVar.d(103, this.f468889p);
            fVar.g(105, 1, linkedList2);
            fVar.g(111, 8, linkedList);
            fVar.e(112, this.f468892s);
            java.lang.String str3 = this.f468893t;
            if (str3 != null) {
                fVar.j(115, str3);
            }
            fVar.e(116, this.f468894u);
            java.lang.String str4 = this.f468895v;
            if (str4 != null) {
                fVar.j(201, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.pg4 pg4Var2 = this.f468880d;
            int i18 = (pg4Var2 != null ? b36.f.i(1, pg4Var2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f468881e);
            java.lang.String str5 = this.f468882f;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int a17 = i18 + b36.f.a(7, this.f468883g) + b36.f.h(4, this.f468884h) + b36.f.h(5, this.f468885i);
            java.lang.String str6 = this.f468886m;
            if (str6 != null) {
                a17 += b36.f.j(6, str6);
            }
            int e17 = a17 + b36.f.e(101, this.f468887n) + b36.f.d(102, this.f468888o) + b36.f.d(103, this.f468889p) + b36.f.g(105, 1, linkedList2) + b36.f.g(111, 8, linkedList) + b36.f.e(112, this.f468892s);
            java.lang.String str7 = this.f468893t;
            if (str7 != null) {
                e17 += b36.f.j(115, str7);
            }
            int e18 = e17 + b36.f.e(116, this.f468894u);
            java.lang.String str8 = this.f468895v;
            return str8 != null ? e18 + b36.f.j(201, str8) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
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
        r45.ug4 ug4Var = (r45.ug4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 105) {
            ug4Var.f468890q.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 201) {
            ug4Var.f468895v = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 111) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.uw3 uw3Var = new r45.uw3();
                if (bArr2 != null && bArr2.length > 0) {
                    uw3Var.mo11468x92b714fd(bArr2);
                }
                ug4Var.f468891r.add(uw3Var);
            }
            return 0;
        }
        if (intValue == 112) {
            ug4Var.f468892s = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 115) {
            ug4Var.f468893t = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 116) {
            ug4Var.f468894u = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.pg4 pg4Var3 = new r45.pg4();
                    if (bArr3 != null && bArr3.length > 0) {
                        pg4Var3.mo11468x92b714fd(bArr3);
                    }
                    ug4Var.f468880d = pg4Var3;
                }
                return 0;
            case 2:
                ug4Var.f468881e = aVar2.g(intValue);
                return 0;
            case 3:
                ug4Var.f468882f = aVar2.k(intValue);
                return 0;
            case 4:
                ug4Var.f468884h = aVar2.i(intValue);
                return 0;
            case 5:
                ug4Var.f468885i = aVar2.i(intValue);
                return 0;
            case 6:
                ug4Var.f468886m = aVar2.k(intValue);
                return 0;
            case 7:
                ug4Var.f468883g = aVar2.c(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 101:
                        ug4Var.f468887n = aVar2.g(intValue);
                        return 0;
                    case 102:
                        ug4Var.f468888o = aVar2.f(intValue);
                        return 0;
                    case 103:
                        ug4Var.f468889p = aVar2.f(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
