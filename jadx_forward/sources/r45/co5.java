package r45;

/* loaded from: classes14.dex */
public class co5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f453257d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453258e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f453259f;

    /* renamed from: g, reason: collision with root package name */
    public int f453260g;

    /* renamed from: h, reason: collision with root package name */
    public int f453261h;

    /* renamed from: i, reason: collision with root package name */
    public int f453262i;

    /* renamed from: m, reason: collision with root package name */
    public r45.c27 f453263m;

    /* renamed from: n, reason: collision with root package name */
    public r45.c27 f453264n;

    /* renamed from: o, reason: collision with root package name */
    public int f453265o;

    /* renamed from: p, reason: collision with root package name */
    public int f453266p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.co5)) {
            return false;
        }
        r45.co5 co5Var = (r45.co5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f453257d), java.lang.Integer.valueOf(co5Var.f453257d)) && n51.f.a(this.f453258e, co5Var.f453258e) && n51.f.a(this.f453259f, co5Var.f453259f) && n51.f.a(java.lang.Integer.valueOf(this.f453260g), java.lang.Integer.valueOf(co5Var.f453260g)) && n51.f.a(java.lang.Integer.valueOf(this.f453261h), java.lang.Integer.valueOf(co5Var.f453261h)) && n51.f.a(java.lang.Integer.valueOf(this.f453262i), java.lang.Integer.valueOf(co5Var.f453262i)) && n51.f.a(this.f453263m, co5Var.f453263m) && n51.f.a(this.f453264n, co5Var.f453264n) && n51.f.a(java.lang.Integer.valueOf(this.f453265o), java.lang.Integer.valueOf(co5Var.f453265o)) && n51.f.a(java.lang.Integer.valueOf(this.f453266p), java.lang.Integer.valueOf(co5Var.f453266p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f453257d);
            java.lang.String str = this.f453258e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f453259f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f453260g);
            fVar.e(5, this.f453261h);
            fVar.e(6, this.f453262i);
            r45.c27 c27Var = this.f453263m;
            if (c27Var != null) {
                fVar.i(7, c27Var.mo75928xcd1e8d8());
                this.f453263m.mo75956x3d5d1f78(fVar);
            }
            r45.c27 c27Var2 = this.f453264n;
            if (c27Var2 != null) {
                fVar.i(8, c27Var2.mo75928xcd1e8d8());
                this.f453264n.mo75956x3d5d1f78(fVar);
            }
            fVar.e(9, this.f453265o);
            fVar.e(10, this.f453266p);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f453257d) + 0;
            java.lang.String str3 = this.f453258e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f453259f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            int e18 = e17 + b36.f.e(4, this.f453260g) + b36.f.e(5, this.f453261h) + b36.f.e(6, this.f453262i);
            r45.c27 c27Var3 = this.f453263m;
            if (c27Var3 != null) {
                e18 += b36.f.i(7, c27Var3.mo75928xcd1e8d8());
            }
            r45.c27 c27Var4 = this.f453264n;
            if (c27Var4 != null) {
                e18 += b36.f.i(8, c27Var4.mo75928xcd1e8d8());
            }
            return e18 + b36.f.e(9, this.f453265o) + b36.f.e(10, this.f453266p);
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
        r45.co5 co5Var = (r45.co5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                co5Var.f453257d = aVar2.g(intValue);
                return 0;
            case 2:
                co5Var.f453258e = aVar2.k(intValue);
                return 0;
            case 3:
                co5Var.f453259f = aVar2.k(intValue);
                return 0;
            case 4:
                co5Var.f453260g = aVar2.g(intValue);
                return 0;
            case 5:
                co5Var.f453261h = aVar2.g(intValue);
                return 0;
            case 6:
                co5Var.f453262i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.c27 c27Var5 = new r45.c27();
                    if (bArr != null && bArr.length > 0) {
                        c27Var5.mo11468x92b714fd(bArr);
                    }
                    co5Var.f453263m = c27Var5;
                }
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.c27 c27Var6 = new r45.c27();
                    if (bArr2 != null && bArr2.length > 0) {
                        c27Var6.mo11468x92b714fd(bArr2);
                    }
                    co5Var.f453264n = c27Var6;
                }
                return 0;
            case 9:
                co5Var.f453265o = aVar2.g(intValue);
                return 0;
            case 10:
                co5Var.f453266p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
