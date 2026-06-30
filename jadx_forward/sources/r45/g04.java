package r45;

/* loaded from: classes9.dex */
public class g04 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456310d;

    /* renamed from: e, reason: collision with root package name */
    public r45.n34 f456311e;

    /* renamed from: f, reason: collision with root package name */
    public r45.n34 f456312f;

    /* renamed from: g, reason: collision with root package name */
    public int f456313g;

    /* renamed from: h, reason: collision with root package name */
    public int f456314h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f456315i;

    /* renamed from: m, reason: collision with root package name */
    public int f456316m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g04)) {
            return false;
        }
        r45.g04 g04Var = (r45.g04) fVar;
        return n51.f.a(this.f456310d, g04Var.f456310d) && n51.f.a(this.f456311e, g04Var.f456311e) && n51.f.a(this.f456312f, g04Var.f456312f) && n51.f.a(java.lang.Integer.valueOf(this.f456313g), java.lang.Integer.valueOf(g04Var.f456313g)) && n51.f.a(java.lang.Integer.valueOf(this.f456314h), java.lang.Integer.valueOf(g04Var.f456314h)) && n51.f.a(this.f456315i, g04Var.f456315i) && n51.f.a(java.lang.Integer.valueOf(this.f456316m), java.lang.Integer.valueOf(g04Var.f456316m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456310d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.n34 n34Var = this.f456311e;
            if (n34Var != null) {
                fVar.i(2, n34Var.mo75928xcd1e8d8());
                this.f456311e.mo75956x3d5d1f78(fVar);
            }
            r45.n34 n34Var2 = this.f456312f;
            if (n34Var2 != null) {
                fVar.i(3, n34Var2.mo75928xcd1e8d8());
                this.f456312f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f456313g);
            fVar.e(5, this.f456314h);
            java.lang.String str2 = this.f456315i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f456316m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f456310d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            r45.n34 n34Var3 = this.f456311e;
            if (n34Var3 != null) {
                j17 += b36.f.i(2, n34Var3.mo75928xcd1e8d8());
            }
            r45.n34 n34Var4 = this.f456312f;
            if (n34Var4 != null) {
                j17 += b36.f.i(3, n34Var4.mo75928xcd1e8d8());
            }
            int e17 = j17 + b36.f.e(4, this.f456313g) + b36.f.e(5, this.f456314h);
            java.lang.String str4 = this.f456315i;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            return e17 + b36.f.e(7, this.f456316m);
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
        r45.g04 g04Var = (r45.g04) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                g04Var.f456310d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.n34 n34Var5 = new r45.n34();
                    if (bArr != null && bArr.length > 0) {
                        n34Var5.mo11468x92b714fd(bArr);
                    }
                    g04Var.f456311e = n34Var5;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.n34 n34Var6 = new r45.n34();
                    if (bArr2 != null && bArr2.length > 0) {
                        n34Var6.mo11468x92b714fd(bArr2);
                    }
                    g04Var.f456312f = n34Var6;
                }
                return 0;
            case 4:
                g04Var.f456313g = aVar2.g(intValue);
                return 0;
            case 5:
                g04Var.f456314h = aVar2.g(intValue);
                return 0;
            case 6:
                g04Var.f456315i = aVar2.k(intValue);
                return 0;
            case 7:
                g04Var.f456316m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
