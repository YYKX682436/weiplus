package r45;

/* loaded from: classes15.dex */
public class hw3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public r45.bn6 f458029e;

    /* renamed from: f, reason: collision with root package name */
    public r45.bn6 f458030f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f458032h;

    /* renamed from: i, reason: collision with root package name */
    public int f458033i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f458034m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f458035n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f458036o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f458038q;

    /* renamed from: s, reason: collision with root package name */
    public r45.kw3 f458040s;

    /* renamed from: u, reason: collision with root package name */
    public r45.a07 f458042u;

    /* renamed from: v, reason: collision with root package name */
    public int f458043v;

    /* renamed from: d, reason: collision with root package name */
    public int f458028d = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f458031g = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f458037p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f458039r = false;

    /* renamed from: t, reason: collision with root package name */
    public long f458041t = 0;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hw3)) {
            return false;
        }
        r45.hw3 hw3Var = (r45.hw3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f458028d), java.lang.Integer.valueOf(hw3Var.f458028d)) && n51.f.a(this.f458029e, hw3Var.f458029e) && n51.f.a(this.f458030f, hw3Var.f458030f) && n51.f.a(java.lang.Boolean.valueOf(this.f458031g), java.lang.Boolean.valueOf(hw3Var.f458031g)) && n51.f.a(this.f458032h, hw3Var.f458032h) && n51.f.a(java.lang.Integer.valueOf(this.f458033i), java.lang.Integer.valueOf(hw3Var.f458033i)) && n51.f.a(this.f458034m, hw3Var.f458034m) && n51.f.a(this.f458035n, hw3Var.f458035n) && n51.f.a(this.f458036o, hw3Var.f458036o) && n51.f.a(java.lang.Boolean.valueOf(this.f458037p), java.lang.Boolean.valueOf(hw3Var.f458037p)) && n51.f.a(java.lang.Boolean.valueOf(this.f458038q), java.lang.Boolean.valueOf(hw3Var.f458038q)) && n51.f.a(java.lang.Boolean.valueOf(this.f458039r), java.lang.Boolean.valueOf(hw3Var.f458039r)) && n51.f.a(this.f458040s, hw3Var.f458040s) && n51.f.a(java.lang.Long.valueOf(this.f458041t), java.lang.Long.valueOf(hw3Var.f458041t)) && n51.f.a(this.f458042u, hw3Var.f458042u) && n51.f.a(java.lang.Integer.valueOf(this.f458043v), java.lang.Integer.valueOf(hw3Var.f458043v));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f458028d);
            r45.bn6 bn6Var = this.f458029e;
            if (bn6Var != null) {
                fVar.i(2, bn6Var.mo75928xcd1e8d8());
                this.f458029e.mo75956x3d5d1f78(fVar);
            }
            r45.bn6 bn6Var2 = this.f458030f;
            if (bn6Var2 != null) {
                fVar.i(3, bn6Var2.mo75928xcd1e8d8());
                this.f458030f.mo75956x3d5d1f78(fVar);
            }
            fVar.a(4, this.f458031g);
            java.lang.String str = this.f458032h;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f458033i);
            java.lang.String str2 = this.f458034m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f458035n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f458036o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.a(10, this.f458037p);
            fVar.a(11, this.f458038q);
            fVar.a(12, this.f458039r);
            r45.kw3 kw3Var = this.f458040s;
            if (kw3Var != null) {
                fVar.i(13, kw3Var.mo75928xcd1e8d8());
                this.f458040s.mo75956x3d5d1f78(fVar);
            }
            fVar.h(14, this.f458041t);
            r45.a07 a07Var = this.f458042u;
            if (a07Var != null) {
                fVar.i(15, a07Var.mo75928xcd1e8d8());
                this.f458042u.mo75956x3d5d1f78(fVar);
            }
            fVar.e(16, this.f458043v);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f458028d) + 0;
            r45.bn6 bn6Var3 = this.f458029e;
            if (bn6Var3 != null) {
                e17 += b36.f.i(2, bn6Var3.mo75928xcd1e8d8());
            }
            r45.bn6 bn6Var4 = this.f458030f;
            if (bn6Var4 != null) {
                e17 += b36.f.i(3, bn6Var4.mo75928xcd1e8d8());
            }
            int a17 = e17 + b36.f.a(4, this.f458031g);
            java.lang.String str5 = this.f458032h;
            if (str5 != null) {
                a17 += b36.f.j(5, str5);
            }
            int e18 = a17 + b36.f.e(6, this.f458033i);
            java.lang.String str6 = this.f458034m;
            if (str6 != null) {
                e18 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f458035n;
            if (str7 != null) {
                e18 += b36.f.j(8, str7);
            }
            java.lang.String str8 = this.f458036o;
            if (str8 != null) {
                e18 += b36.f.j(9, str8);
            }
            int a18 = e18 + b36.f.a(10, this.f458037p) + b36.f.a(11, this.f458038q) + b36.f.a(12, this.f458039r);
            r45.kw3 kw3Var2 = this.f458040s;
            if (kw3Var2 != null) {
                a18 += b36.f.i(13, kw3Var2.mo75928xcd1e8d8());
            }
            int h17 = a18 + b36.f.h(14, this.f458041t);
            r45.a07 a07Var2 = this.f458042u;
            if (a07Var2 != null) {
                h17 += b36.f.i(15, a07Var2.mo75928xcd1e8d8());
            }
            return h17 + b36.f.e(16, this.f458043v);
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
        r45.hw3 hw3Var = (r45.hw3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hw3Var.f458028d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.bn6 bn6Var5 = new r45.bn6();
                    if (bArr != null && bArr.length > 0) {
                        bn6Var5.mo11468x92b714fd(bArr);
                    }
                    hw3Var.f458029e = bn6Var5;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.bn6 bn6Var6 = new r45.bn6();
                    if (bArr2 != null && bArr2.length > 0) {
                        bn6Var6.mo11468x92b714fd(bArr2);
                    }
                    hw3Var.f458030f = bn6Var6;
                }
                return 0;
            case 4:
                hw3Var.f458031g = aVar2.c(intValue);
                return 0;
            case 5:
                hw3Var.f458032h = aVar2.k(intValue);
                return 0;
            case 6:
                hw3Var.f458033i = aVar2.g(intValue);
                return 0;
            case 7:
                hw3Var.f458034m = aVar2.k(intValue);
                return 0;
            case 8:
                hw3Var.f458035n = aVar2.k(intValue);
                return 0;
            case 9:
                hw3Var.f458036o = aVar2.k(intValue);
                return 0;
            case 10:
                hw3Var.f458037p = aVar2.c(intValue);
                return 0;
            case 11:
                hw3Var.f458038q = aVar2.c(intValue);
                return 0;
            case 12:
                hw3Var.f458039r = aVar2.c(intValue);
                return 0;
            case 13:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.kw3 kw3Var3 = new r45.kw3();
                    if (bArr3 != null && bArr3.length > 0) {
                        kw3Var3.mo11468x92b714fd(bArr3);
                    }
                    hw3Var.f458040s = kw3Var3;
                }
                return 0;
            case 14:
                hw3Var.f458041t = aVar2.i(intValue);
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.a07 a07Var3 = new r45.a07();
                    if (bArr4 != null && bArr4.length > 0) {
                        a07Var3.mo11468x92b714fd(bArr4);
                    }
                    hw3Var.f458042u = a07Var3;
                }
                return 0;
            case 16:
                hw3Var.f458043v = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
