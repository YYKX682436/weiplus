package r45;

/* loaded from: classes8.dex */
public class j4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f459090d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f459091e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f459092f;

    /* renamed from: g, reason: collision with root package name */
    public int f459093g;

    /* renamed from: h, reason: collision with root package name */
    public r45.du5 f459094h;

    /* renamed from: i, reason: collision with root package name */
    public int f459095i;

    /* renamed from: m, reason: collision with root package name */
    public int f459096m;

    /* renamed from: n, reason: collision with root package name */
    public r45.cu5 f459097n;

    /* renamed from: o, reason: collision with root package name */
    public int f459098o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f459099p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f459100q;

    /* renamed from: r, reason: collision with root package name */
    public long f459101r;

    /* renamed from: s, reason: collision with root package name */
    public int f459102s;

    /* renamed from: t, reason: collision with root package name */
    public long f459103t;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j4)) {
            return false;
        }
        r45.j4 j4Var = (r45.j4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f459090d), java.lang.Integer.valueOf(j4Var.f459090d)) && n51.f.a(this.f459091e, j4Var.f459091e) && n51.f.a(this.f459092f, j4Var.f459092f) && n51.f.a(java.lang.Integer.valueOf(this.f459093g), java.lang.Integer.valueOf(j4Var.f459093g)) && n51.f.a(this.f459094h, j4Var.f459094h) && n51.f.a(java.lang.Integer.valueOf(this.f459095i), java.lang.Integer.valueOf(j4Var.f459095i)) && n51.f.a(java.lang.Integer.valueOf(this.f459096m), java.lang.Integer.valueOf(j4Var.f459096m)) && n51.f.a(this.f459097n, j4Var.f459097n) && n51.f.a(java.lang.Integer.valueOf(this.f459098o), java.lang.Integer.valueOf(j4Var.f459098o)) && n51.f.a(this.f459099p, j4Var.f459099p) && n51.f.a(this.f459100q, j4Var.f459100q) && n51.f.a(java.lang.Long.valueOf(this.f459101r), java.lang.Long.valueOf(j4Var.f459101r)) && n51.f.a(java.lang.Integer.valueOf(this.f459102s), java.lang.Integer.valueOf(j4Var.f459102s)) && n51.f.a(java.lang.Long.valueOf(this.f459103t), java.lang.Long.valueOf(j4Var.f459103t));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f459090d);
            r45.du5 du5Var = this.f459091e;
            if (du5Var != null) {
                fVar.i(2, du5Var.mo75928xcd1e8d8());
                this.f459091e.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var2 = this.f459092f;
            if (du5Var2 != null) {
                fVar.i(3, du5Var2.mo75928xcd1e8d8());
                this.f459092f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f459093g);
            r45.du5 du5Var3 = this.f459094h;
            if (du5Var3 != null) {
                fVar.i(5, du5Var3.mo75928xcd1e8d8());
                this.f459094h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f459095i);
            fVar.e(7, this.f459096m);
            r45.cu5 cu5Var = this.f459097n;
            if (cu5Var != null) {
                fVar.i(8, cu5Var.mo75928xcd1e8d8());
                this.f459097n.mo75956x3d5d1f78(fVar);
            }
            fVar.e(9, this.f459098o);
            java.lang.String str = this.f459099p;
            if (str != null) {
                fVar.j(10, str);
            }
            java.lang.String str2 = this.f459100q;
            if (str2 != null) {
                fVar.j(11, str2);
            }
            fVar.h(12, this.f459101r);
            fVar.e(13, this.f459102s);
            fVar.h(15, this.f459103t);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f459090d) + 0;
            r45.du5 du5Var4 = this.f459091e;
            if (du5Var4 != null) {
                e17 += b36.f.i(2, du5Var4.mo75928xcd1e8d8());
            }
            r45.du5 du5Var5 = this.f459092f;
            if (du5Var5 != null) {
                e17 += b36.f.i(3, du5Var5.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(4, this.f459093g);
            r45.du5 du5Var6 = this.f459094h;
            if (du5Var6 != null) {
                e18 += b36.f.i(5, du5Var6.mo75928xcd1e8d8());
            }
            int e19 = e18 + b36.f.e(6, this.f459095i) + b36.f.e(7, this.f459096m);
            r45.cu5 cu5Var2 = this.f459097n;
            if (cu5Var2 != null) {
                e19 += b36.f.i(8, cu5Var2.mo75928xcd1e8d8());
            }
            int e27 = e19 + b36.f.e(9, this.f459098o);
            java.lang.String str3 = this.f459099p;
            if (str3 != null) {
                e27 += b36.f.j(10, str3);
            }
            java.lang.String str4 = this.f459100q;
            if (str4 != null) {
                e27 += b36.f.j(11, str4);
            }
            return e27 + b36.f.h(12, this.f459101r) + b36.f.e(13, this.f459102s) + b36.f.h(15, this.f459103t);
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
        r45.j4 j4Var = (r45.j4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                j4Var.f459090d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.du5 du5Var7 = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var7.b(bArr);
                    }
                    j4Var.f459091e = du5Var7;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.du5 du5Var8 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var8.b(bArr2);
                    }
                    j4Var.f459092f = du5Var8;
                }
                return 0;
            case 4:
                j4Var.f459093g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.du5 du5Var9 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var9.b(bArr3);
                    }
                    j4Var.f459094h = du5Var9;
                }
                return 0;
            case 6:
                j4Var.f459095i = aVar2.g(intValue);
                return 0;
            case 7:
                j4Var.f459096m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var3.b(bArr4);
                    }
                    j4Var.f459097n = cu5Var3;
                }
                return 0;
            case 9:
                j4Var.f459098o = aVar2.g(intValue);
                return 0;
            case 10:
                j4Var.f459099p = aVar2.k(intValue);
                return 0;
            case 11:
                j4Var.f459100q = aVar2.k(intValue);
                return 0;
            case 12:
                j4Var.f459101r = aVar2.i(intValue);
                return 0;
            case 13:
                j4Var.f459102s = aVar2.g(intValue);
                return 0;
            case 14:
            default:
                return -1;
            case 15:
                j4Var.f459103t = aVar2.i(intValue);
                return 0;
        }
    }
}
