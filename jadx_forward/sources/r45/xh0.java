package r45;

/* loaded from: classes15.dex */
public class xh0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471625d;

    /* renamed from: e, reason: collision with root package name */
    public int f471626e;

    /* renamed from: f, reason: collision with root package name */
    public int f471627f;

    /* renamed from: g, reason: collision with root package name */
    public int f471628g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f471629h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f471630i;

    /* renamed from: m, reason: collision with root package name */
    public int f471631m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f471632n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f471633o;

    /* renamed from: p, reason: collision with root package name */
    public int f471634p;

    /* renamed from: q, reason: collision with root package name */
    public int f471635q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f471636r;

    /* renamed from: s, reason: collision with root package name */
    public int f471637s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f471638t;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xh0)) {
            return false;
        }
        r45.xh0 xh0Var = (r45.xh0) fVar;
        return n51.f.a(this.f471625d, xh0Var.f471625d) && n51.f.a(java.lang.Integer.valueOf(this.f471626e), java.lang.Integer.valueOf(xh0Var.f471626e)) && n51.f.a(java.lang.Integer.valueOf(this.f471627f), java.lang.Integer.valueOf(xh0Var.f471627f)) && n51.f.a(java.lang.Integer.valueOf(this.f471628g), java.lang.Integer.valueOf(xh0Var.f471628g)) && n51.f.a(this.f471629h, xh0Var.f471629h) && n51.f.a(java.lang.Integer.valueOf(this.f471630i), java.lang.Integer.valueOf(xh0Var.f471630i)) && n51.f.a(java.lang.Integer.valueOf(this.f471631m), java.lang.Integer.valueOf(xh0Var.f471631m)) && n51.f.a(this.f471632n, xh0Var.f471632n) && n51.f.a(this.f471633o, xh0Var.f471633o) && n51.f.a(java.lang.Integer.valueOf(this.f471634p), java.lang.Integer.valueOf(xh0Var.f471634p)) && n51.f.a(java.lang.Integer.valueOf(this.f471635q), java.lang.Integer.valueOf(xh0Var.f471635q)) && n51.f.a(this.f471636r, xh0Var.f471636r) && n51.f.a(java.lang.Integer.valueOf(this.f471637s), java.lang.Integer.valueOf(xh0Var.f471637s)) && n51.f.a(this.f471638t, xh0Var.f471638t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f471629h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f471625d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f471626e);
            fVar.e(3, this.f471627f);
            fVar.e(4, this.f471628g);
            fVar.g(5, 8, linkedList);
            fVar.e(6, this.f471630i);
            fVar.e(7, this.f471631m);
            java.lang.String str2 = this.f471632n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            java.lang.String str3 = this.f471633o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.e(10, this.f471634p);
            fVar.e(11, this.f471635q);
            java.lang.String str4 = this.f471636r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            fVar.e(13, this.f471637s);
            java.lang.String str5 = this.f471638t;
            if (str5 != null) {
                fVar.j(14, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f471625d;
            int j17 = (str6 != null ? b36.f.j(1, str6) + 0 : 0) + b36.f.e(2, this.f471626e) + b36.f.e(3, this.f471627f) + b36.f.e(4, this.f471628g) + b36.f.g(5, 8, linkedList) + b36.f.e(6, this.f471630i) + b36.f.e(7, this.f471631m);
            java.lang.String str7 = this.f471632n;
            if (str7 != null) {
                j17 += b36.f.j(8, str7);
            }
            java.lang.String str8 = this.f471633o;
            if (str8 != null) {
                j17 += b36.f.j(9, str8);
            }
            int e17 = j17 + b36.f.e(10, this.f471634p) + b36.f.e(11, this.f471635q);
            java.lang.String str9 = this.f471636r;
            if (str9 != null) {
                e17 += b36.f.j(12, str9);
            }
            int e18 = e17 + b36.f.e(13, this.f471637s);
            java.lang.String str10 = this.f471638t;
            return str10 != null ? e18 + b36.f.j(14, str10) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.xh0 xh0Var = (r45.xh0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xh0Var.f471625d = aVar2.k(intValue);
                return 0;
            case 2:
                xh0Var.f471626e = aVar2.g(intValue);
                return 0;
            case 3:
                xh0Var.f471627f = aVar2.g(intValue);
                return 0;
            case 4:
                xh0Var.f471628g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.sh0 sh0Var = new r45.sh0();
                    if (bArr2 != null && bArr2.length > 0) {
                        sh0Var.mo11468x92b714fd(bArr2);
                    }
                    xh0Var.f471629h.add(sh0Var);
                }
                return 0;
            case 6:
                xh0Var.f471630i = aVar2.g(intValue);
                return 0;
            case 7:
                xh0Var.f471631m = aVar2.g(intValue);
                return 0;
            case 8:
                xh0Var.f471632n = aVar2.k(intValue);
                return 0;
            case 9:
                xh0Var.f471633o = aVar2.k(intValue);
                return 0;
            case 10:
                xh0Var.f471634p = aVar2.g(intValue);
                return 0;
            case 11:
                xh0Var.f471635q = aVar2.g(intValue);
                return 0;
            case 12:
                xh0Var.f471636r = aVar2.k(intValue);
                return 0;
            case 13:
                xh0Var.f471637s = aVar2.g(intValue);
                return 0;
            case 14:
                xh0Var.f471638t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
