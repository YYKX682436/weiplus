package r45;

/* loaded from: classes9.dex */
public class a53 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.bn6 f451265d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451266e = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f451267f = false;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451268g = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f451269h = false;

    /* renamed from: i, reason: collision with root package name */
    public long f451270i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f451271m = 0;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a53)) {
            return false;
        }
        r45.a53 a53Var = (r45.a53) fVar;
        return n51.f.a(this.f451265d, a53Var.f451265d) && n51.f.a(this.f451266e, a53Var.f451266e) && n51.f.a(java.lang.Boolean.valueOf(this.f451267f), java.lang.Boolean.valueOf(a53Var.f451267f)) && n51.f.a(this.f451268g, a53Var.f451268g) && n51.f.a(java.lang.Boolean.valueOf(this.f451269h), java.lang.Boolean.valueOf(a53Var.f451269h)) && n51.f.a(java.lang.Long.valueOf(this.f451270i), java.lang.Long.valueOf(a53Var.f451270i)) && n51.f.a(java.lang.Integer.valueOf(this.f451271m), java.lang.Integer.valueOf(a53Var.f451271m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.bn6 bn6Var = this.f451265d;
            if (bn6Var != null) {
                fVar.i(1, bn6Var.mo75928xcd1e8d8());
                this.f451265d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f451266e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f451267f);
            java.lang.String str2 = this.f451268g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.a(5, this.f451269h);
            fVar.h(6, this.f451270i);
            fVar.e(7, this.f451271m);
            return 0;
        }
        if (i17 == 1) {
            r45.bn6 bn6Var2 = this.f451265d;
            int i18 = bn6Var2 != null ? 0 + b36.f.i(1, bn6Var2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f451266e;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int a17 = i18 + b36.f.a(3, this.f451267f);
            java.lang.String str4 = this.f451268g;
            if (str4 != null) {
                a17 += b36.f.j(4, str4);
            }
            return a17 + b36.f.a(5, this.f451269h) + b36.f.h(6, this.f451270i) + b36.f.e(7, this.f451271m);
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
        r45.a53 a53Var = (r45.a53) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.bn6 bn6Var3 = new r45.bn6();
                    if (bArr != null && bArr.length > 0) {
                        bn6Var3.mo11468x92b714fd(bArr);
                    }
                    a53Var.f451265d = bn6Var3;
                }
                return 0;
            case 2:
                a53Var.f451266e = aVar2.k(intValue);
                return 0;
            case 3:
                a53Var.f451267f = aVar2.c(intValue);
                return 0;
            case 4:
                a53Var.f451268g = aVar2.k(intValue);
                return 0;
            case 5:
                a53Var.f451269h = aVar2.c(intValue);
                return 0;
            case 6:
                a53Var.f451270i = aVar2.i(intValue);
                return 0;
            case 7:
                a53Var.f451271m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
