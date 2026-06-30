package r45;

/* loaded from: classes7.dex */
public class a60 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f451289d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f451290e;

    /* renamed from: f, reason: collision with root package name */
    public int f451291f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f451292g;

    /* renamed from: h, reason: collision with root package name */
    public int f451293h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f451294i;

    /* renamed from: m, reason: collision with root package name */
    public int f451295m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f451296n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f451297o;

    /* renamed from: p, reason: collision with root package name */
    public int f451298p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f451299q;

    /* renamed from: r, reason: collision with root package name */
    public int f451300r;

    /* renamed from: s, reason: collision with root package name */
    public r45.b60 f451301s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a60)) {
            return false;
        }
        r45.a60 a60Var = (r45.a60) fVar;
        return n51.f.a(this.f451289d, a60Var.f451289d) && n51.f.a(java.lang.Integer.valueOf(this.f451290e), java.lang.Integer.valueOf(a60Var.f451290e)) && n51.f.a(java.lang.Integer.valueOf(this.f451291f), java.lang.Integer.valueOf(a60Var.f451291f)) && n51.f.a(java.lang.Boolean.valueOf(this.f451292g), java.lang.Boolean.valueOf(a60Var.f451292g)) && n51.f.a(java.lang.Integer.valueOf(this.f451293h), java.lang.Integer.valueOf(a60Var.f451293h)) && n51.f.a(this.f451294i, a60Var.f451294i) && n51.f.a(java.lang.Integer.valueOf(this.f451295m), java.lang.Integer.valueOf(a60Var.f451295m)) && n51.f.a(java.lang.Boolean.valueOf(this.f451296n), java.lang.Boolean.valueOf(a60Var.f451296n)) && n51.f.a(java.lang.Boolean.valueOf(this.f451297o), java.lang.Boolean.valueOf(a60Var.f451297o)) && n51.f.a(java.lang.Integer.valueOf(this.f451298p), java.lang.Integer.valueOf(a60Var.f451298p)) && n51.f.a(this.f451299q, a60Var.f451299q) && n51.f.a(java.lang.Integer.valueOf(this.f451300r), java.lang.Integer.valueOf(a60Var.f451300r)) && n51.f.a(this.f451301s, a60Var.f451301s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f451289d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.e(2, this.f451290e);
            fVar.e(3, this.f451291f);
            fVar.a(4, this.f451292g);
            fVar.e(5, this.f451293h);
            java.lang.String str = this.f451294i;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(7, this.f451295m);
            fVar.a(8, this.f451296n);
            fVar.a(9, this.f451297o);
            fVar.e(10, this.f451298p);
            java.lang.String str2 = this.f451299q;
            if (str2 != null) {
                fVar.j(11, str2);
            }
            fVar.e(12, this.f451300r);
            r45.b60 b60Var = this.f451301s;
            if (b60Var != null) {
                fVar.i(13, b60Var.mo75928xcd1e8d8());
                this.f451301s.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0 + b36.f.e(2, this.f451290e) + b36.f.e(3, this.f451291f) + b36.f.a(4, this.f451292g) + b36.f.e(5, this.f451293h);
            java.lang.String str3 = this.f451294i;
            if (str3 != null) {
                g17 += b36.f.j(6, str3);
            }
            int e17 = g17 + b36.f.e(7, this.f451295m) + b36.f.a(8, this.f451296n) + b36.f.a(9, this.f451297o) + b36.f.e(10, this.f451298p);
            java.lang.String str4 = this.f451299q;
            if (str4 != null) {
                e17 += b36.f.j(11, str4);
            }
            int e18 = e17 + b36.f.e(12, this.f451300r);
            r45.b60 b60Var2 = this.f451301s;
            return b60Var2 != null ? e18 + b36.f.i(13, b60Var2.mo75928xcd1e8d8()) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.a60 a60Var = (r45.a60) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.fn5 fn5Var = new r45.fn5();
                    if (bArr2 != null && bArr2.length > 0) {
                        fn5Var.mo11468x92b714fd(bArr2);
                    }
                    a60Var.f451289d.add(fn5Var);
                }
                return 0;
            case 2:
                a60Var.f451290e = aVar2.g(intValue);
                return 0;
            case 3:
                a60Var.f451291f = aVar2.g(intValue);
                return 0;
            case 4:
                a60Var.f451292g = aVar2.c(intValue);
                return 0;
            case 5:
                a60Var.f451293h = aVar2.g(intValue);
                return 0;
            case 6:
                a60Var.f451294i = aVar2.k(intValue);
                return 0;
            case 7:
                a60Var.f451295m = aVar2.g(intValue);
                return 0;
            case 8:
                a60Var.f451296n = aVar2.c(intValue);
                return 0;
            case 9:
                a60Var.f451297o = aVar2.c(intValue);
                return 0;
            case 10:
                a60Var.f451298p = aVar2.g(intValue);
                return 0;
            case 11:
                a60Var.f451299q = aVar2.k(intValue);
                return 0;
            case 12:
                a60Var.f451300r = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.b60 b60Var3 = new r45.b60();
                    if (bArr3 != null && bArr3.length > 0) {
                        b60Var3.mo11468x92b714fd(bArr3);
                    }
                    a60Var.f451301s = b60Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
