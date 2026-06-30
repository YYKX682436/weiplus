package r45;

/* loaded from: classes9.dex */
public class lp6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f461237d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461238e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f461239f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f461240g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461241h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461242i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f461243m;

    /* renamed from: n, reason: collision with root package name */
    public r45.d70 f461244n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lp6)) {
            return false;
        }
        r45.lp6 lp6Var = (r45.lp6) fVar;
        return n51.f.a(this.f76492x92037252, lp6Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f461237d), java.lang.Integer.valueOf(lp6Var.f461237d)) && n51.f.a(this.f461238e, lp6Var.f461238e) && n51.f.a(java.lang.Boolean.valueOf(this.f461239f), java.lang.Boolean.valueOf(lp6Var.f461239f)) && n51.f.a(java.lang.Boolean.valueOf(this.f461240g), java.lang.Boolean.valueOf(lp6Var.f461240g)) && n51.f.a(this.f461241h, lp6Var.f461241h) && n51.f.a(this.f461242i, lp6Var.f461242i) && n51.f.a(java.lang.Boolean.valueOf(this.f461243m), java.lang.Boolean.valueOf(lp6Var.f461243m)) && n51.f.a(this.f461244n, lp6Var.f461244n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f461237d);
            java.lang.String str = this.f461238e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.a(4, this.f461239f);
            fVar.a(5, this.f461240g);
            java.lang.String str2 = this.f461241h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f461242i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.a(11, this.f461243m);
            r45.d70 d70Var = this.f461244n;
            if (d70Var != null) {
                fVar.i(12, d70Var.mo75928xcd1e8d8());
                this.f461244n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f461237d);
            java.lang.String str4 = this.f461238e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int a17 = i18 + b36.f.a(4, this.f461239f) + b36.f.a(5, this.f461240g);
            java.lang.String str5 = this.f461241h;
            if (str5 != null) {
                a17 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f461242i;
            if (str6 != null) {
                a17 += b36.f.j(7, str6);
            }
            int a18 = a17 + b36.f.a(11, this.f461243m);
            r45.d70 d70Var2 = this.f461244n;
            return d70Var2 != null ? a18 + b36.f.i(12, d70Var2.mo75928xcd1e8d8()) : a18;
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
        r45.lp6 lp6Var = (r45.lp6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 11) {
            lp6Var.f461243m = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 12) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.d70 d70Var3 = new r45.d70();
                if (bArr != null && bArr.length > 0) {
                    d70Var3.mo11468x92b714fd(bArr);
                }
                lp6Var.f461244n = d70Var3;
            }
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    lp6Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                lp6Var.f461237d = aVar2.g(intValue);
                return 0;
            case 3:
                lp6Var.f461238e = aVar2.k(intValue);
                return 0;
            case 4:
                lp6Var.f461239f = aVar2.c(intValue);
                return 0;
            case 5:
                lp6Var.f461240g = aVar2.c(intValue);
                return 0;
            case 6:
                lp6Var.f461241h = aVar2.k(intValue);
                return 0;
            case 7:
                lp6Var.f461242i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
