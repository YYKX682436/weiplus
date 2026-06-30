package r45;

/* loaded from: classes10.dex */
public class g94 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f456549d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456550e;

    /* renamed from: f, reason: collision with root package name */
    public int f456551f;

    /* renamed from: g, reason: collision with root package name */
    public r45.e94 f456552g;

    /* renamed from: h, reason: collision with root package name */
    public r45.f94 f456553h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f456554i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f456555m;

    /* renamed from: n, reason: collision with root package name */
    public int f456556n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f456557o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g94)) {
            return false;
        }
        r45.g94 g94Var = (r45.g94) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f456549d), java.lang.Long.valueOf(g94Var.f456549d)) && n51.f.a(this.f456550e, g94Var.f456550e) && n51.f.a(java.lang.Integer.valueOf(this.f456551f), java.lang.Integer.valueOf(g94Var.f456551f)) && n51.f.a(this.f456552g, g94Var.f456552g) && n51.f.a(this.f456553h, g94Var.f456553h) && n51.f.a(this.f456554i, g94Var.f456554i) && n51.f.a(java.lang.Boolean.valueOf(this.f456555m), java.lang.Boolean.valueOf(g94Var.f456555m)) && n51.f.a(java.lang.Integer.valueOf(this.f456556n), java.lang.Integer.valueOf(g94Var.f456556n)) && n51.f.a(this.f456557o, g94Var.f456557o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f456549d);
            java.lang.String str = this.f456550e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f456551f);
            r45.e94 e94Var = this.f456552g;
            if (e94Var != null) {
                fVar.i(4, e94Var.mo75928xcd1e8d8());
                this.f456552g.mo75956x3d5d1f78(fVar);
            }
            r45.f94 f94Var = this.f456553h;
            if (f94Var != null) {
                fVar.i(5, f94Var.mo75928xcd1e8d8());
                this.f456553h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f456554i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.a(7, this.f456555m);
            fVar.e(8, this.f456556n);
            java.lang.String str3 = this.f456557o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f456549d) + 0;
            java.lang.String str4 = this.f456550e;
            if (str4 != null) {
                h17 += b36.f.j(2, str4);
            }
            int e17 = h17 + b36.f.e(3, this.f456551f);
            r45.e94 e94Var2 = this.f456552g;
            if (e94Var2 != null) {
                e17 += b36.f.i(4, e94Var2.mo75928xcd1e8d8());
            }
            r45.f94 f94Var2 = this.f456553h;
            if (f94Var2 != null) {
                e17 += b36.f.i(5, f94Var2.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f456554i;
            if (str5 != null) {
                e17 += b36.f.j(6, str5);
            }
            int a17 = e17 + b36.f.a(7, this.f456555m) + b36.f.e(8, this.f456556n);
            java.lang.String str6 = this.f456557o;
            return str6 != null ? a17 + b36.f.j(9, str6) : a17;
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
        r45.g94 g94Var = (r45.g94) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                g94Var.f456549d = aVar2.i(intValue);
                return 0;
            case 2:
                g94Var.f456550e = aVar2.k(intValue);
                return 0;
            case 3:
                g94Var.f456551f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.e94 e94Var3 = new r45.e94();
                    if (bArr != null && bArr.length > 0) {
                        e94Var3.mo11468x92b714fd(bArr);
                    }
                    g94Var.f456552g = e94Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.f94 f94Var3 = new r45.f94();
                    if (bArr2 != null && bArr2.length > 0) {
                        f94Var3.mo11468x92b714fd(bArr2);
                    }
                    g94Var.f456553h = f94Var3;
                }
                return 0;
            case 6:
                g94Var.f456554i = aVar2.k(intValue);
                return 0;
            case 7:
                g94Var.f456555m = aVar2.c(intValue);
                return 0;
            case 8:
                g94Var.f456556n = aVar2.g(intValue);
                return 0;
            case 9:
                g94Var.f456557o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
