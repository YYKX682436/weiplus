package r45;

/* loaded from: classes8.dex */
public class ya7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472464d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472465e;

    /* renamed from: f, reason: collision with root package name */
    public r45.qa7 f472466f;

    /* renamed from: g, reason: collision with root package name */
    public r45.xa7 f472467g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472468h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f472469i;

    /* renamed from: m, reason: collision with root package name */
    public int f472470m;

    /* renamed from: n, reason: collision with root package name */
    public int f472471n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ya7)) {
            return false;
        }
        r45.ya7 ya7Var = (r45.ya7) fVar;
        return n51.f.a(this.f472464d, ya7Var.f472464d) && n51.f.a(this.f472465e, ya7Var.f472465e) && n51.f.a(this.f472466f, ya7Var.f472466f) && n51.f.a(this.f472467g, ya7Var.f472467g) && n51.f.a(this.f472468h, ya7Var.f472468h) && n51.f.a(this.f472469i, ya7Var.f472469i) && n51.f.a(java.lang.Integer.valueOf(this.f472470m), java.lang.Integer.valueOf(ya7Var.f472470m)) && n51.f.a(java.lang.Integer.valueOf(this.f472471n), java.lang.Integer.valueOf(ya7Var.f472471n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472464d;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f472465e;
            if (str2 != null) {
                fVar.j(12, str2);
            }
            r45.qa7 qa7Var = this.f472466f;
            if (qa7Var != null) {
                fVar.i(9, qa7Var.mo75928xcd1e8d8());
                this.f472466f.mo75956x3d5d1f78(fVar);
            }
            r45.xa7 xa7Var = this.f472467g;
            if (xa7Var != null) {
                fVar.i(10, xa7Var.mo75928xcd1e8d8());
                this.f472467g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f472468h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f472469i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f472470m);
            fVar.e(8, this.f472471n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f472464d;
            int j17 = str5 != null ? 0 + b36.f.j(4, str5) : 0;
            java.lang.String str6 = this.f472465e;
            if (str6 != null) {
                j17 += b36.f.j(12, str6);
            }
            r45.qa7 qa7Var2 = this.f472466f;
            if (qa7Var2 != null) {
                j17 += b36.f.i(9, qa7Var2.mo75928xcd1e8d8());
            }
            r45.xa7 xa7Var2 = this.f472467g;
            if (xa7Var2 != null) {
                j17 += b36.f.i(10, xa7Var2.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f472468h;
            if (str7 != null) {
                j17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f472469i;
            if (str8 != null) {
                j17 += b36.f.j(6, str8);
            }
            return j17 + b36.f.e(7, this.f472470m) + b36.f.e(8, this.f472471n);
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
        r45.ya7 ya7Var = (r45.ya7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 4:
                ya7Var.f472464d = aVar2.k(intValue);
                return 0;
            case 5:
                ya7Var.f472468h = aVar2.k(intValue);
                return 0;
            case 6:
                ya7Var.f472469i = aVar2.k(intValue);
                return 0;
            case 7:
                ya7Var.f472470m = aVar2.g(intValue);
                return 0;
            case 8:
                ya7Var.f472471n = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.qa7 qa7Var3 = new r45.qa7();
                    if (bArr != null && bArr.length > 0) {
                        qa7Var3.mo11468x92b714fd(bArr);
                    }
                    ya7Var.f472466f = qa7Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.xa7 xa7Var3 = new r45.xa7();
                    if (bArr2 != null && bArr2.length > 0) {
                        xa7Var3.mo11468x92b714fd(bArr2);
                    }
                    ya7Var.f472467g = xa7Var3;
                }
                return 0;
            case 11:
            default:
                return -1;
            case 12:
                ya7Var.f472465e = aVar2.k(intValue);
                return 0;
        }
    }
}
