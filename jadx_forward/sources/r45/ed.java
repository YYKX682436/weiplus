package r45;

/* loaded from: classes11.dex */
public class ed extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f454812d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454813e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f454814f;

    /* renamed from: g, reason: collision with root package name */
    public r45.du5 f454815g;

    /* renamed from: h, reason: collision with root package name */
    public r45.du5 f454816h;

    /* renamed from: i, reason: collision with root package name */
    public int f454817i;

    /* renamed from: m, reason: collision with root package name */
    public int f454818m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f454819n;

    /* renamed from: o, reason: collision with root package name */
    public int f454820o;

    /* renamed from: p, reason: collision with root package name */
    public int f454821p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f454822q = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f454823r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public r45.cu5 f454824s;

    /* renamed from: t, reason: collision with root package name */
    public int f454825t;

    /* renamed from: u, reason: collision with root package name */
    public int f454826u;

    /* renamed from: v, reason: collision with root package name */
    public long f454827v;

    /* renamed from: w, reason: collision with root package name */
    public int f454828w;

    /* renamed from: x, reason: collision with root package name */
    public long f454829x;

    /* renamed from: y, reason: collision with root package name */
    public int f454830y;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ed)) {
            return false;
        }
        r45.ed edVar = (r45.ed) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f454812d), java.lang.Integer.valueOf(edVar.f454812d)) && n51.f.a(this.f454813e, edVar.f454813e) && n51.f.a(this.f454814f, edVar.f454814f) && n51.f.a(this.f454815g, edVar.f454815g) && n51.f.a(this.f454816h, edVar.f454816h) && n51.f.a(java.lang.Integer.valueOf(this.f454817i), java.lang.Integer.valueOf(edVar.f454817i)) && n51.f.a(java.lang.Integer.valueOf(this.f454818m), java.lang.Integer.valueOf(edVar.f454818m)) && n51.f.a(this.f454819n, edVar.f454819n) && n51.f.a(java.lang.Integer.valueOf(this.f454820o), java.lang.Integer.valueOf(edVar.f454820o)) && n51.f.a(java.lang.Integer.valueOf(this.f454821p), java.lang.Integer.valueOf(edVar.f454821p)) && n51.f.a(this.f454822q, edVar.f454822q) && n51.f.a(this.f454823r, edVar.f454823r) && n51.f.a(this.f454824s, edVar.f454824s) && n51.f.a(java.lang.Integer.valueOf(this.f454825t), java.lang.Integer.valueOf(edVar.f454825t)) && n51.f.a(java.lang.Integer.valueOf(this.f454826u), java.lang.Integer.valueOf(edVar.f454826u)) && n51.f.a(java.lang.Long.valueOf(this.f454827v), java.lang.Long.valueOf(edVar.f454827v)) && n51.f.a(java.lang.Integer.valueOf(this.f454828w), java.lang.Integer.valueOf(edVar.f454828w)) && n51.f.a(java.lang.Long.valueOf(this.f454829x), java.lang.Long.valueOf(edVar.f454829x)) && n51.f.a(java.lang.Integer.valueOf(this.f454830y), java.lang.Integer.valueOf(edVar.f454830y));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f454823r;
        java.util.LinkedList linkedList2 = this.f454822q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f454812d);
            java.lang.String str = this.f454813e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.du5 du5Var = this.f454814f;
            if (du5Var != null) {
                fVar.i(3, du5Var.mo75928xcd1e8d8());
                this.f454814f.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var2 = this.f454815g;
            if (du5Var2 != null) {
                fVar.i(4, du5Var2.mo75928xcd1e8d8());
                this.f454815g.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var3 = this.f454816h;
            if (du5Var3 != null) {
                fVar.i(5, du5Var3.mo75928xcd1e8d8());
                this.f454816h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f454817i);
            fVar.e(7, this.f454818m);
            java.lang.String str2 = this.f454819n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            fVar.e(9, this.f454820o);
            fVar.e(10, this.f454821p);
            fVar.g(11, 8, linkedList2);
            fVar.g(12, 8, linkedList);
            r45.cu5 cu5Var = this.f454824s;
            if (cu5Var != null) {
                fVar.i(13, cu5Var.mo75928xcd1e8d8());
                this.f454824s.mo75956x3d5d1f78(fVar);
            }
            fVar.e(14, this.f454825t);
            fVar.e(15, this.f454826u);
            fVar.h(16, this.f454827v);
            fVar.e(17, this.f454828w);
            fVar.h(18, this.f454829x);
            fVar.e(19, this.f454830y);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f454812d) + 0;
            java.lang.String str3 = this.f454813e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            r45.du5 du5Var4 = this.f454814f;
            if (du5Var4 != null) {
                e17 += b36.f.i(3, du5Var4.mo75928xcd1e8d8());
            }
            r45.du5 du5Var5 = this.f454815g;
            if (du5Var5 != null) {
                e17 += b36.f.i(4, du5Var5.mo75928xcd1e8d8());
            }
            r45.du5 du5Var6 = this.f454816h;
            if (du5Var6 != null) {
                e17 += b36.f.i(5, du5Var6.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(6, this.f454817i) + b36.f.e(7, this.f454818m);
            java.lang.String str4 = this.f454819n;
            if (str4 != null) {
                e18 += b36.f.j(8, str4);
            }
            int e19 = e18 + b36.f.e(9, this.f454820o) + b36.f.e(10, this.f454821p) + b36.f.g(11, 8, linkedList2) + b36.f.g(12, 8, linkedList);
            r45.cu5 cu5Var2 = this.f454824s;
            if (cu5Var2 != null) {
                e19 += b36.f.i(13, cu5Var2.mo75928xcd1e8d8());
            }
            return e19 + b36.f.e(14, this.f454825t) + b36.f.e(15, this.f454826u) + b36.f.h(16, this.f454827v) + b36.f.e(17, this.f454828w) + b36.f.h(18, this.f454829x) + b36.f.e(19, this.f454830y);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.ed edVar = (r45.ed) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                edVar.f454812d = aVar2.g(intValue);
                return 0;
            case 2:
                edVar.f454813e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.du5 du5Var7 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var7.b(bArr2);
                    }
                    edVar.f454814f = du5Var7;
                }
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.du5 du5Var8 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var8.b(bArr3);
                    }
                    edVar.f454815g = du5Var8;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.du5 du5Var9 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var9.b(bArr4);
                    }
                    edVar.f454816h = du5Var9;
                }
                return 0;
            case 6:
                edVar.f454817i = aVar2.g(intValue);
                return 0;
            case 7:
                edVar.f454818m = aVar2.g(intValue);
                return 0;
            case 8:
                edVar.f454819n = aVar2.k(intValue);
                return 0;
            case 9:
                edVar.f454820o = aVar2.g(intValue);
                return 0;
            case 10:
                edVar.f454821p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.du5 du5Var10 = new r45.du5();
                    if (bArr5 != null && bArr5.length > 0) {
                        du5Var10.b(bArr5);
                    }
                    edVar.f454822q.add(du5Var10);
                }
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.eu5 eu5Var = new r45.eu5();
                    if (bArr6 != null && bArr6.length > 0) {
                        eu5Var.b(bArr6);
                    }
                    edVar.f454823r.add(eu5Var);
                }
                return 0;
            case 13:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cu5Var3.b(bArr7);
                    }
                    edVar.f454824s = cu5Var3;
                }
                return 0;
            case 14:
                edVar.f454825t = aVar2.g(intValue);
                return 0;
            case 15:
                edVar.f454826u = aVar2.g(intValue);
                return 0;
            case 16:
                edVar.f454827v = aVar2.i(intValue);
                return 0;
            case 17:
                edVar.f454828w = aVar2.g(intValue);
                return 0;
            case 18:
                edVar.f454829x = aVar2.i(intValue);
                return 0;
            case 19:
                edVar.f454830y = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
