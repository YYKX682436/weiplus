package r45;

/* loaded from: classes9.dex */
public class du4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454281d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454282e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454283f;

    /* renamed from: g, reason: collision with root package name */
    public int f454284g;

    /* renamed from: h, reason: collision with root package name */
    public int f454285h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f454286i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f454287m;

    /* renamed from: n, reason: collision with root package name */
    public r45.bm5 f454288n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.du4)) {
            return false;
        }
        r45.du4 du4Var = (r45.du4) fVar;
        return n51.f.a(this.f454281d, du4Var.f454281d) && n51.f.a(this.f454282e, du4Var.f454282e) && n51.f.a(this.f454283f, du4Var.f454283f) && n51.f.a(java.lang.Integer.valueOf(this.f454284g), java.lang.Integer.valueOf(du4Var.f454284g)) && n51.f.a(java.lang.Integer.valueOf(this.f454285h), java.lang.Integer.valueOf(du4Var.f454285h)) && n51.f.a(this.f454286i, du4Var.f454286i) && n51.f.a(this.f454287m, du4Var.f454287m) && n51.f.a(this.f454288n, du4Var.f454288n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f454281d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f454282e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f454283f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f454284g);
            fVar.e(5, this.f454285h);
            java.lang.String str4 = this.f454286i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f454287m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            r45.bm5 bm5Var = this.f454288n;
            if (bm5Var != null) {
                fVar.i(8, bm5Var.mo75928xcd1e8d8());
                this.f454288n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f454281d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f454282e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f454283f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int e17 = j17 + b36.f.e(4, this.f454284g) + b36.f.e(5, this.f454285h);
            java.lang.String str9 = this.f454286i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f454287m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            r45.bm5 bm5Var2 = this.f454288n;
            return bm5Var2 != null ? e17 + b36.f.i(8, bm5Var2.mo75928xcd1e8d8()) : e17;
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
        r45.du4 du4Var = (r45.du4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                du4Var.f454281d = aVar2.k(intValue);
                return 0;
            case 2:
                du4Var.f454282e = aVar2.k(intValue);
                return 0;
            case 3:
                du4Var.f454283f = aVar2.k(intValue);
                return 0;
            case 4:
                du4Var.f454284g = aVar2.g(intValue);
                return 0;
            case 5:
                du4Var.f454285h = aVar2.g(intValue);
                return 0;
            case 6:
                du4Var.f454286i = aVar2.k(intValue);
                return 0;
            case 7:
                du4Var.f454287m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.bm5 bm5Var3 = new r45.bm5();
                    if (bArr != null && bArr.length > 0) {
                        bm5Var3.mo11468x92b714fd(bArr);
                    }
                    du4Var.f454288n = bm5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
