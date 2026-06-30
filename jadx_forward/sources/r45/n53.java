package r45;

/* loaded from: classes8.dex */
public class n53 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.o67 f462615d;

    /* renamed from: e, reason: collision with root package name */
    public r45.l67 f462616e;

    /* renamed from: f, reason: collision with root package name */
    public r45.n67 f462617f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f462618g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f462619h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f462620i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f462621m;

    /* renamed from: n, reason: collision with root package name */
    public int f462622n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n53)) {
            return false;
        }
        r45.n53 n53Var = (r45.n53) fVar;
        return n51.f.a(this.f462615d, n53Var.f462615d) && n51.f.a(this.f462616e, n53Var.f462616e) && n51.f.a(this.f462617f, n53Var.f462617f) && n51.f.a(java.lang.Boolean.valueOf(this.f462618g), java.lang.Boolean.valueOf(n53Var.f462618g)) && n51.f.a(java.lang.Boolean.valueOf(this.f462619h), java.lang.Boolean.valueOf(n53Var.f462619h)) && n51.f.a(this.f462620i, n53Var.f462620i) && n51.f.a(this.f462621m, n53Var.f462621m) && n51.f.a(java.lang.Integer.valueOf(this.f462622n), java.lang.Integer.valueOf(n53Var.f462622n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.o67 o67Var = this.f462615d;
            if (o67Var != null) {
                fVar.i(1, o67Var.mo75928xcd1e8d8());
                this.f462615d.mo75956x3d5d1f78(fVar);
            }
            r45.l67 l67Var = this.f462616e;
            if (l67Var != null) {
                fVar.i(2, l67Var.mo75928xcd1e8d8());
                this.f462616e.mo75956x3d5d1f78(fVar);
            }
            r45.n67 n67Var = this.f462617f;
            if (n67Var != null) {
                fVar.i(3, n67Var.mo75928xcd1e8d8());
                this.f462617f.mo75956x3d5d1f78(fVar);
            }
            fVar.a(4, this.f462618g);
            fVar.a(5, this.f462619h);
            java.lang.String str = this.f462620i;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f462621m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(99, this.f462622n);
            return 0;
        }
        if (i17 == 1) {
            r45.o67 o67Var2 = this.f462615d;
            int i18 = o67Var2 != null ? 0 + b36.f.i(1, o67Var2.mo75928xcd1e8d8()) : 0;
            r45.l67 l67Var2 = this.f462616e;
            if (l67Var2 != null) {
                i18 += b36.f.i(2, l67Var2.mo75928xcd1e8d8());
            }
            r45.n67 n67Var2 = this.f462617f;
            if (n67Var2 != null) {
                i18 += b36.f.i(3, n67Var2.mo75928xcd1e8d8());
            }
            int a17 = i18 + b36.f.a(4, this.f462618g) + b36.f.a(5, this.f462619h);
            java.lang.String str3 = this.f462620i;
            if (str3 != null) {
                a17 += b36.f.j(6, str3);
            }
            java.lang.String str4 = this.f462621m;
            if (str4 != null) {
                a17 += b36.f.j(7, str4);
            }
            return a17 + b36.f.e(99, this.f462622n);
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
        r45.n53 n53Var = (r45.n53) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 99) {
            n53Var.f462622n = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.o67 o67Var3 = new r45.o67();
                    if (bArr != null && bArr.length > 0) {
                        o67Var3.mo11468x92b714fd(bArr);
                    }
                    n53Var.f462615d = o67Var3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.l67 l67Var3 = new r45.l67();
                    if (bArr2 != null && bArr2.length > 0) {
                        l67Var3.mo11468x92b714fd(bArr2);
                    }
                    n53Var.f462616e = l67Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.n67 n67Var3 = new r45.n67();
                    if (bArr3 != null && bArr3.length > 0) {
                        n67Var3.mo11468x92b714fd(bArr3);
                    }
                    n53Var.f462617f = n67Var3;
                }
                return 0;
            case 4:
                n53Var.f462618g = aVar2.c(intValue);
                return 0;
            case 5:
                n53Var.f462619h = aVar2.c(intValue);
                return 0;
            case 6:
                n53Var.f462620i = aVar2.k(intValue);
                return 0;
            case 7:
                n53Var.f462621m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
