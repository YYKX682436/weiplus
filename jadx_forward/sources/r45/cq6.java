package r45;

/* loaded from: classes4.dex */
public class cq6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f453324d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453325e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f453326f;

    /* renamed from: g, reason: collision with root package name */
    public int f453327g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f453328h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f453329i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cq6)) {
            return false;
        }
        r45.cq6 cq6Var = (r45.cq6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f453324d), java.lang.Integer.valueOf(cq6Var.f453324d)) && n51.f.a(this.f453325e, cq6Var.f453325e) && n51.f.a(this.f453326f, cq6Var.f453326f) && n51.f.a(java.lang.Integer.valueOf(this.f453327g), java.lang.Integer.valueOf(cq6Var.f453327g)) && n51.f.a(this.f453328h, cq6Var.f453328h) && n51.f.a(this.f453329i, cq6Var.f453329i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f453324d);
            java.lang.String str = this.f453325e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f453326f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f453327g);
            r45.cu5 cu5Var = this.f453328h;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.mo75928xcd1e8d8());
                this.f453328h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f453329i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f453324d) + 0;
            java.lang.String str4 = this.f453325e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f453326f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            int e18 = e17 + b36.f.e(4, this.f453327g);
            r45.cu5 cu5Var2 = this.f453328h;
            if (cu5Var2 != null) {
                e18 += b36.f.i(5, cu5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f453329i;
            return str6 != null ? e18 + b36.f.j(6, str6) : e18;
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
        r45.cq6 cq6Var = (r45.cq6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cq6Var.f453324d = aVar2.g(intValue);
                return 0;
            case 2:
                cq6Var.f453325e = aVar2.k(intValue);
                return 0;
            case 3:
                cq6Var.f453326f = aVar2.k(intValue);
                return 0;
            case 4:
                cq6Var.f453327g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    cq6Var.f453328h = cu5Var3;
                }
                return 0;
            case 6:
                cq6Var.f453329i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
