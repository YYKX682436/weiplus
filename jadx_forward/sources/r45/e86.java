package r45;

/* loaded from: classes4.dex */
public class e86 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454659d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454660e;

    /* renamed from: f, reason: collision with root package name */
    public int f454661f;

    /* renamed from: g, reason: collision with root package name */
    public int f454662g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454663h;

    /* renamed from: i, reason: collision with root package name */
    public int f454664i;

    /* renamed from: m, reason: collision with root package name */
    public int f454665m;

    /* renamed from: n, reason: collision with root package name */
    public int f454666n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f454667o;

    /* renamed from: p, reason: collision with root package name */
    public int f454668p;

    /* renamed from: q, reason: collision with root package name */
    public long f454669q;

    /* renamed from: r, reason: collision with root package name */
    public long f454670r;

    /* renamed from: s, reason: collision with root package name */
    public int f454671s;

    /* renamed from: t, reason: collision with root package name */
    public int f454672t;

    /* renamed from: v, reason: collision with root package name */
    public int f454674v;

    /* renamed from: w, reason: collision with root package name */
    public r45.cu5 f454675w;

    /* renamed from: x, reason: collision with root package name */
    public r45.cu5 f454676x;

    /* renamed from: y, reason: collision with root package name */
    public int f454677y;

    /* renamed from: z, reason: collision with root package name */
    public int f454678z;

    /* renamed from: u, reason: collision with root package name */
    public java.util.LinkedList f454673u = new java.util.LinkedList();
    public java.util.LinkedList A = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e86)) {
            return false;
        }
        r45.e86 e86Var = (r45.e86) fVar;
        return n51.f.a(this.f454659d, e86Var.f454659d) && n51.f.a(this.f454660e, e86Var.f454660e) && n51.f.a(java.lang.Integer.valueOf(this.f454661f), java.lang.Integer.valueOf(e86Var.f454661f)) && n51.f.a(java.lang.Integer.valueOf(this.f454662g), java.lang.Integer.valueOf(e86Var.f454662g)) && n51.f.a(this.f454663h, e86Var.f454663h) && n51.f.a(java.lang.Integer.valueOf(this.f454664i), java.lang.Integer.valueOf(e86Var.f454664i)) && n51.f.a(java.lang.Integer.valueOf(this.f454665m), java.lang.Integer.valueOf(e86Var.f454665m)) && n51.f.a(java.lang.Integer.valueOf(this.f454666n), java.lang.Integer.valueOf(e86Var.f454666n)) && n51.f.a(this.f454667o, e86Var.f454667o) && n51.f.a(java.lang.Integer.valueOf(this.f454668p), java.lang.Integer.valueOf(e86Var.f454668p)) && n51.f.a(java.lang.Long.valueOf(this.f454669q), java.lang.Long.valueOf(e86Var.f454669q)) && n51.f.a(java.lang.Long.valueOf(this.f454670r), java.lang.Long.valueOf(e86Var.f454670r)) && n51.f.a(java.lang.Integer.valueOf(this.f454671s), java.lang.Integer.valueOf(e86Var.f454671s)) && n51.f.a(java.lang.Integer.valueOf(this.f454672t), java.lang.Integer.valueOf(e86Var.f454672t)) && n51.f.a(this.f454673u, e86Var.f454673u) && n51.f.a(java.lang.Integer.valueOf(this.f454674v), java.lang.Integer.valueOf(e86Var.f454674v)) && n51.f.a(this.f454675w, e86Var.f454675w) && n51.f.a(this.f454676x, e86Var.f454676x) && n51.f.a(java.lang.Integer.valueOf(this.f454677y), java.lang.Integer.valueOf(e86Var.f454677y)) && n51.f.a(java.lang.Integer.valueOf(this.f454678z), java.lang.Integer.valueOf(e86Var.f454678z)) && n51.f.a(this.A, e86Var.A);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f454659d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f454660e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f454661f);
            fVar.e(4, this.f454662g);
            java.lang.String str3 = this.f454663h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f454664i);
            fVar.e(7, this.f454665m);
            fVar.e(8, this.f454666n);
            java.lang.String str4 = this.f454667o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.e(10, this.f454668p);
            fVar.h(11, this.f454669q);
            fVar.h(12, this.f454670r);
            fVar.e(13, this.f454671s);
            fVar.e(14, this.f454672t);
            fVar.g(15, 8, this.f454673u);
            fVar.e(16, this.f454674v);
            r45.cu5 cu5Var = this.f454675w;
            if (cu5Var != null) {
                fVar.i(17, cu5Var.mo75928xcd1e8d8());
                this.f454675w.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var2 = this.f454676x;
            if (cu5Var2 != null) {
                fVar.i(18, cu5Var2.mo75928xcd1e8d8());
                this.f454676x.mo75956x3d5d1f78(fVar);
            }
            fVar.e(19, this.f454677y);
            fVar.e(20, this.f454678z);
            fVar.g(21, 8, this.A);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f454659d;
            int j17 = str5 != null ? b36.f.j(1, str5) + 0 : 0;
            java.lang.String str6 = this.f454660e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f454661f) + b36.f.e(4, this.f454662g);
            java.lang.String str7 = this.f454663h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            int e18 = e17 + b36.f.e(6, this.f454664i) + b36.f.e(7, this.f454665m) + b36.f.e(8, this.f454666n);
            java.lang.String str8 = this.f454667o;
            if (str8 != null) {
                e18 += b36.f.j(9, str8);
            }
            int e19 = e18 + b36.f.e(10, this.f454668p) + b36.f.h(11, this.f454669q) + b36.f.h(12, this.f454670r) + b36.f.e(13, this.f454671s) + b36.f.e(14, this.f454672t) + b36.f.g(15, 8, this.f454673u) + b36.f.e(16, this.f454674v);
            r45.cu5 cu5Var3 = this.f454675w;
            if (cu5Var3 != null) {
                e19 += b36.f.i(17, cu5Var3.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var4 = this.f454676x;
            if (cu5Var4 != null) {
                e19 += b36.f.i(18, cu5Var4.mo75928xcd1e8d8());
            }
            return e19 + b36.f.e(19, this.f454677y) + b36.f.e(20, this.f454678z) + b36.f.g(21, 8, this.A);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f454673u.clear();
            this.A.clear();
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
        r45.e86 e86Var = (r45.e86) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                e86Var.f454659d = aVar2.k(intValue);
                return 0;
            case 2:
                e86Var.f454660e = aVar2.k(intValue);
                return 0;
            case 3:
                e86Var.f454661f = aVar2.g(intValue);
                return 0;
            case 4:
                e86Var.f454662g = aVar2.g(intValue);
                return 0;
            case 5:
                e86Var.f454663h = aVar2.k(intValue);
                return 0;
            case 6:
                e86Var.f454664i = aVar2.g(intValue);
                return 0;
            case 7:
                e86Var.f454665m = aVar2.g(intValue);
                return 0;
            case 8:
                e86Var.f454666n = aVar2.g(intValue);
                return 0;
            case 9:
                e86Var.f454667o = aVar2.k(intValue);
                return 0;
            case 10:
                e86Var.f454668p = aVar2.g(intValue);
                return 0;
            case 11:
                e86Var.f454669q = aVar2.i(intValue);
                return 0;
            case 12:
                e86Var.f454670r = aVar2.i(intValue);
                return 0;
            case 13:
                e86Var.f454671s = aVar2.g(intValue);
                return 0;
            case 14:
                e86Var.f454672t = aVar2.g(intValue);
                return 0;
            case 15:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.l86 l86Var = new r45.l86();
                    if (bArr2 != null && bArr2.length > 0) {
                        l86Var.mo11468x92b714fd(bArr2);
                    }
                    e86Var.f454673u.add(l86Var);
                }
                return 0;
            case 16:
                e86Var.f454674v = aVar2.g(intValue);
                return 0;
            case 17:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var5.b(bArr3);
                    }
                    e86Var.f454675w = cu5Var5;
                }
                return 0;
            case 18:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var6.b(bArr4);
                    }
                    e86Var.f454676x = cu5Var6;
                }
                return 0;
            case 19:
                e86Var.f454677y = aVar2.g(intValue);
                return 0;
            case 20:
                e86Var.f454678z = aVar2.g(intValue);
                return 0;
            case 21:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.d86 d86Var = new r45.d86();
                    if (bArr5 != null && bArr5.length > 0) {
                        d86Var.mo11468x92b714fd(bArr5);
                    }
                    e86Var.A.add(d86Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
