package r45;

/* loaded from: classes7.dex */
public class o54 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f463475d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463476e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f463477f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463478g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f463479h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ie7 f463480i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f463481m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o54)) {
            return false;
        }
        r45.o54 o54Var = (r45.o54) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f463475d), java.lang.Integer.valueOf(o54Var.f463475d)) && n51.f.a(this.f463476e, o54Var.f463476e) && n51.f.a(java.lang.Boolean.valueOf(this.f463477f), java.lang.Boolean.valueOf(o54Var.f463477f)) && n51.f.a(this.f463478g, o54Var.f463478g) && n51.f.a(this.f463479h, o54Var.f463479h) && n51.f.a(this.f463480i, o54Var.f463480i) && n51.f.a(this.f463481m, o54Var.f463481m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f463475d);
            java.lang.String str = this.f463476e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f463477f);
            java.lang.String str2 = this.f463478g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f463479h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.ie7 ie7Var = this.f463480i;
            if (ie7Var != null) {
                fVar.i(6, ie7Var.mo75928xcd1e8d8());
                this.f463480i.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f463481m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f463475d) + 0;
            java.lang.String str5 = this.f463476e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            int a17 = e17 + b36.f.a(3, this.f463477f);
            java.lang.String str6 = this.f463478g;
            if (str6 != null) {
                a17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f463479h;
            if (str7 != null) {
                a17 += b36.f.j(5, str7);
            }
            r45.ie7 ie7Var2 = this.f463480i;
            if (ie7Var2 != null) {
                a17 += b36.f.i(6, ie7Var2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f463481m;
            return str8 != null ? a17 + b36.f.j(7, str8) : a17;
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
        r45.o54 o54Var = (r45.o54) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                o54Var.f463475d = aVar2.g(intValue);
                return 0;
            case 2:
                o54Var.f463476e = aVar2.k(intValue);
                return 0;
            case 3:
                o54Var.f463477f = aVar2.c(intValue);
                return 0;
            case 4:
                o54Var.f463478g = aVar2.k(intValue);
                return 0;
            case 5:
                o54Var.f463479h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.ie7 ie7Var3 = new r45.ie7();
                    if (bArr != null && bArr.length > 0) {
                        ie7Var3.mo11468x92b714fd(bArr);
                    }
                    o54Var.f463480i = ie7Var3;
                }
                return 0;
            case 7:
                o54Var.f463481m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
