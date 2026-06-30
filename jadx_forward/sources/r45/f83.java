package r45;

/* loaded from: classes15.dex */
public class f83 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f455618d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455619e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f455620f;

    /* renamed from: g, reason: collision with root package name */
    public int f455621g;

    /* renamed from: h, reason: collision with root package name */
    public int f455622h;

    /* renamed from: i, reason: collision with root package name */
    public int f455623i;

    /* renamed from: m, reason: collision with root package name */
    public int f455624m;

    /* renamed from: n, reason: collision with root package name */
    public long f455625n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f455626o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f455627p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f455628q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f455629r;

    /* renamed from: s, reason: collision with root package name */
    public int f455630s;

    /* renamed from: t, reason: collision with root package name */
    public int f455631t;

    /* renamed from: u, reason: collision with root package name */
    public int f455632u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f83)) {
            return false;
        }
        r45.f83 f83Var = (r45.f83) fVar;
        return n51.f.a(this.f455618d, f83Var.f455618d) && n51.f.a(this.f455619e, f83Var.f455619e) && n51.f.a(this.f455620f, f83Var.f455620f) && n51.f.a(java.lang.Integer.valueOf(this.f455621g), java.lang.Integer.valueOf(f83Var.f455621g)) && n51.f.a(java.lang.Integer.valueOf(this.f455622h), java.lang.Integer.valueOf(f83Var.f455622h)) && n51.f.a(java.lang.Integer.valueOf(this.f455623i), java.lang.Integer.valueOf(f83Var.f455623i)) && n51.f.a(java.lang.Integer.valueOf(this.f455624m), java.lang.Integer.valueOf(f83Var.f455624m)) && n51.f.a(java.lang.Long.valueOf(this.f455625n), java.lang.Long.valueOf(f83Var.f455625n)) && n51.f.a(java.lang.Boolean.valueOf(this.f455626o), java.lang.Boolean.valueOf(f83Var.f455626o)) && n51.f.a(this.f455627p, f83Var.f455627p) && n51.f.a(this.f455628q, f83Var.f455628q) && n51.f.a(this.f455629r, f83Var.f455629r) && n51.f.a(java.lang.Integer.valueOf(this.f455630s), java.lang.Integer.valueOf(f83Var.f455630s)) && n51.f.a(java.lang.Integer.valueOf(this.f455631t), java.lang.Integer.valueOf(f83Var.f455631t)) && n51.f.a(java.lang.Integer.valueOf(this.f455632u), java.lang.Integer.valueOf(f83Var.f455632u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f455627p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f455618d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f455619e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f455620f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f455621g);
            fVar.e(5, this.f455622h);
            fVar.e(6, this.f455623i);
            fVar.e(7, this.f455624m);
            fVar.h(8, this.f455625n);
            fVar.a(9, this.f455626o);
            fVar.g(10, 8, linkedList);
            java.lang.String str4 = this.f455628q;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f455629r;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            fVar.e(13, this.f455630s);
            fVar.e(14, this.f455631t);
            fVar.e(15, this.f455632u);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f455618d;
            int j17 = str6 != null ? b36.f.j(1, str6) + 0 : 0;
            java.lang.String str7 = this.f455619e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f455620f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int e17 = j17 + b36.f.e(4, this.f455621g) + b36.f.e(5, this.f455622h) + b36.f.e(6, this.f455623i) + b36.f.e(7, this.f455624m) + b36.f.h(8, this.f455625n) + b36.f.a(9, this.f455626o) + b36.f.g(10, 8, linkedList);
            java.lang.String str9 = this.f455628q;
            if (str9 != null) {
                e17 += b36.f.j(11, str9);
            }
            java.lang.String str10 = this.f455629r;
            if (str10 != null) {
                e17 += b36.f.j(12, str10);
            }
            return e17 + b36.f.e(13, this.f455630s) + b36.f.e(14, this.f455631t) + b36.f.e(15, this.f455632u);
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
        r45.f83 f83Var = (r45.f83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                f83Var.f455618d = aVar2.k(intValue);
                return 0;
            case 2:
                f83Var.f455619e = aVar2.k(intValue);
                return 0;
            case 3:
                f83Var.f455620f = aVar2.k(intValue);
                return 0;
            case 4:
                f83Var.f455621g = aVar2.g(intValue);
                return 0;
            case 5:
                f83Var.f455622h = aVar2.g(intValue);
                return 0;
            case 6:
                f83Var.f455623i = aVar2.g(intValue);
                return 0;
            case 7:
                f83Var.f455624m = aVar2.g(intValue);
                return 0;
            case 8:
                f83Var.f455625n = aVar2.i(intValue);
                return 0;
            case 9:
                f83Var.f455626o = aVar2.c(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.g83 g83Var = new r45.g83();
                    if (bArr2 != null && bArr2.length > 0) {
                        g83Var.mo11468x92b714fd(bArr2);
                    }
                    f83Var.f455627p.add(g83Var);
                }
                return 0;
            case 11:
                f83Var.f455628q = aVar2.k(intValue);
                return 0;
            case 12:
                f83Var.f455629r = aVar2.k(intValue);
                return 0;
            case 13:
                f83Var.f455630s = aVar2.g(intValue);
                return 0;
            case 14:
                f83Var.f455631t = aVar2.g(intValue);
                return 0;
            case 15:
                f83Var.f455632u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
