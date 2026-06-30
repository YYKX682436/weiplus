package r45;

/* loaded from: classes12.dex */
public class vr5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f470001d;

    /* renamed from: e, reason: collision with root package name */
    public r45.bs5 f470002e;

    /* renamed from: f, reason: collision with root package name */
    public r45.as5 f470003f;

    /* renamed from: g, reason: collision with root package name */
    public int f470004g;

    /* renamed from: h, reason: collision with root package name */
    public int f470005h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f470006i;

    /* renamed from: m, reason: collision with root package name */
    public int f470007m;

    /* renamed from: n, reason: collision with root package name */
    public int f470008n;

    /* renamed from: o, reason: collision with root package name */
    public int f470009o;

    /* renamed from: p, reason: collision with root package name */
    public int f470010p;

    /* renamed from: q, reason: collision with root package name */
    public int f470011q;

    /* renamed from: r, reason: collision with root package name */
    public int f470012r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vr5)) {
            return false;
        }
        r45.vr5 vr5Var = (r45.vr5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f470001d), java.lang.Integer.valueOf(vr5Var.f470001d)) && n51.f.a(this.f470002e, vr5Var.f470002e) && n51.f.a(this.f470003f, vr5Var.f470003f) && n51.f.a(java.lang.Integer.valueOf(this.f470004g), java.lang.Integer.valueOf(vr5Var.f470004g)) && n51.f.a(java.lang.Integer.valueOf(this.f470005h), java.lang.Integer.valueOf(vr5Var.f470005h)) && n51.f.a(this.f470006i, vr5Var.f470006i) && n51.f.a(java.lang.Integer.valueOf(this.f470007m), java.lang.Integer.valueOf(vr5Var.f470007m)) && n51.f.a(java.lang.Integer.valueOf(this.f470008n), java.lang.Integer.valueOf(vr5Var.f470008n)) && n51.f.a(java.lang.Integer.valueOf(this.f470009o), java.lang.Integer.valueOf(vr5Var.f470009o)) && n51.f.a(java.lang.Integer.valueOf(this.f470010p), java.lang.Integer.valueOf(vr5Var.f470010p)) && n51.f.a(java.lang.Integer.valueOf(this.f470011q), java.lang.Integer.valueOf(vr5Var.f470011q)) && n51.f.a(java.lang.Integer.valueOf(this.f470012r), java.lang.Integer.valueOf(vr5Var.f470012r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f470001d);
            r45.bs5 bs5Var = this.f470002e;
            if (bs5Var != null) {
                fVar.i(2, bs5Var.mo75928xcd1e8d8());
                this.f470002e.mo75956x3d5d1f78(fVar);
            }
            r45.as5 as5Var = this.f470003f;
            if (as5Var != null) {
                fVar.i(3, as5Var.mo75928xcd1e8d8());
                this.f470003f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f470004g);
            fVar.e(5, this.f470005h);
            java.lang.String str = this.f470006i;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(7, this.f470007m);
            fVar.e(8, this.f470008n);
            fVar.e(9, this.f470009o);
            fVar.e(10, this.f470010p);
            fVar.e(11, this.f470011q);
            fVar.e(12, this.f470012r);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f470001d) + 0;
            r45.bs5 bs5Var2 = this.f470002e;
            if (bs5Var2 != null) {
                e17 += b36.f.i(2, bs5Var2.mo75928xcd1e8d8());
            }
            r45.as5 as5Var2 = this.f470003f;
            if (as5Var2 != null) {
                e17 += b36.f.i(3, as5Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(4, this.f470004g) + b36.f.e(5, this.f470005h);
            java.lang.String str2 = this.f470006i;
            if (str2 != null) {
                e18 += b36.f.j(6, str2);
            }
            return e18 + b36.f.e(7, this.f470007m) + b36.f.e(8, this.f470008n) + b36.f.e(9, this.f470009o) + b36.f.e(10, this.f470010p) + b36.f.e(11, this.f470011q) + b36.f.e(12, this.f470012r);
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
        r45.vr5 vr5Var = (r45.vr5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vr5Var.f470001d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.bs5 bs5Var3 = new r45.bs5();
                    if (bArr != null && bArr.length > 0) {
                        bs5Var3.mo11468x92b714fd(bArr);
                    }
                    vr5Var.f470002e = bs5Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.as5 as5Var3 = new r45.as5();
                    if (bArr2 != null && bArr2.length > 0) {
                        as5Var3.mo11468x92b714fd(bArr2);
                    }
                    vr5Var.f470003f = as5Var3;
                }
                return 0;
            case 4:
                vr5Var.f470004g = aVar2.g(intValue);
                return 0;
            case 5:
                vr5Var.f470005h = aVar2.g(intValue);
                return 0;
            case 6:
                vr5Var.f470006i = aVar2.k(intValue);
                return 0;
            case 7:
                vr5Var.f470007m = aVar2.g(intValue);
                return 0;
            case 8:
                vr5Var.f470008n = aVar2.g(intValue);
                return 0;
            case 9:
                vr5Var.f470009o = aVar2.g(intValue);
                return 0;
            case 10:
                vr5Var.f470010p = aVar2.g(intValue);
                return 0;
            case 11:
                vr5Var.f470011q = aVar2.g(intValue);
                return 0;
            case 12:
                vr5Var.f470012r = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
