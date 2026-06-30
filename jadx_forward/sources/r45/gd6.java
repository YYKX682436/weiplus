package r45;

/* loaded from: classes4.dex */
public class gd6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f456675d;

    /* renamed from: e, reason: collision with root package name */
    public int f456676e;

    /* renamed from: f, reason: collision with root package name */
    public r45.r86 f456677f;

    /* renamed from: g, reason: collision with root package name */
    public int f456678g;

    /* renamed from: h, reason: collision with root package name */
    public int f456679h;

    /* renamed from: i, reason: collision with root package name */
    public int f456680i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f456681m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f456682n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f456683o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gd6)) {
            return false;
        }
        r45.gd6 gd6Var = (r45.gd6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f456675d), java.lang.Integer.valueOf(gd6Var.f456675d)) && n51.f.a(java.lang.Integer.valueOf(this.f456676e), java.lang.Integer.valueOf(gd6Var.f456676e)) && n51.f.a(this.f456677f, gd6Var.f456677f) && n51.f.a(java.lang.Integer.valueOf(this.f456678g), java.lang.Integer.valueOf(gd6Var.f456678g)) && n51.f.a(java.lang.Integer.valueOf(this.f456679h), java.lang.Integer.valueOf(gd6Var.f456679h)) && n51.f.a(java.lang.Integer.valueOf(this.f456680i), java.lang.Integer.valueOf(gd6Var.f456680i)) && n51.f.a(this.f456681m, gd6Var.f456681m) && n51.f.a(this.f456682n, gd6Var.f456682n) && n51.f.a(this.f456683o, gd6Var.f456683o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f456675d);
            fVar.e(2, this.f456676e);
            r45.r86 r86Var = this.f456677f;
            if (r86Var != null) {
                fVar.i(5, r86Var.mo75928xcd1e8d8());
                this.f456677f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f456678g);
            fVar.e(8, this.f456679h);
            fVar.e(9, this.f456680i);
            java.lang.String str = this.f456681m;
            if (str != null) {
                fVar.j(10, str);
            }
            java.lang.String str2 = this.f456682n;
            if (str2 != null) {
                fVar.j(11, str2);
            }
            java.lang.String str3 = this.f456683o;
            if (str3 != null) {
                fVar.j(12, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f456675d) + 0 + b36.f.e(2, this.f456676e);
            r45.r86 r86Var2 = this.f456677f;
            if (r86Var2 != null) {
                e17 += b36.f.i(5, r86Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(6, this.f456678g) + b36.f.e(8, this.f456679h) + b36.f.e(9, this.f456680i);
            java.lang.String str4 = this.f456681m;
            if (str4 != null) {
                e18 += b36.f.j(10, str4);
            }
            java.lang.String str5 = this.f456682n;
            if (str5 != null) {
                e18 += b36.f.j(11, str5);
            }
            java.lang.String str6 = this.f456683o;
            return str6 != null ? e18 + b36.f.j(12, str6) : e18;
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
        r45.gd6 gd6Var = (r45.gd6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gd6Var.f456675d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            gd6Var.f456676e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.r86 r86Var3 = new r45.r86();
                if (bArr != null && bArr.length > 0) {
                    r86Var3.mo11468x92b714fd(bArr);
                }
                gd6Var.f456677f = r86Var3;
            }
            return 0;
        }
        if (intValue == 6) {
            gd6Var.f456678g = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 8:
                gd6Var.f456679h = aVar2.g(intValue);
                return 0;
            case 9:
                gd6Var.f456680i = aVar2.g(intValue);
                return 0;
            case 10:
                gd6Var.f456681m = aVar2.k(intValue);
                return 0;
            case 11:
                gd6Var.f456682n = aVar2.k(intValue);
                return 0;
            case 12:
                gd6Var.f456683o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
