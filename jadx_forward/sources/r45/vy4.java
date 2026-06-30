package r45;

/* loaded from: classes11.dex */
public class vy4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470196d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470197e;

    /* renamed from: f, reason: collision with root package name */
    public int f470198f;

    /* renamed from: g, reason: collision with root package name */
    public int f470199g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f470200h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f470201i;

    /* renamed from: m, reason: collision with root package name */
    public int f470202m;

    /* renamed from: n, reason: collision with root package name */
    public r45.kk0 f470203n;

    /* renamed from: o, reason: collision with root package name */
    public r45.fn0 f470204o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f470205p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f470206q = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vy4)) {
            return false;
        }
        r45.vy4 vy4Var = (r45.vy4) fVar;
        return n51.f.a(this.f470196d, vy4Var.f470196d) && n51.f.a(this.f470197e, vy4Var.f470197e) && n51.f.a(java.lang.Integer.valueOf(this.f470198f), java.lang.Integer.valueOf(vy4Var.f470198f)) && n51.f.a(java.lang.Integer.valueOf(this.f470199g), java.lang.Integer.valueOf(vy4Var.f470199g)) && n51.f.a(this.f470200h, vy4Var.f470200h) && n51.f.a(this.f470201i, vy4Var.f470201i) && n51.f.a(java.lang.Integer.valueOf(this.f470202m), java.lang.Integer.valueOf(vy4Var.f470202m)) && n51.f.a(this.f470203n, vy4Var.f470203n) && n51.f.a(this.f470204o, vy4Var.f470204o) && n51.f.a(this.f470205p, vy4Var.f470205p) && n51.f.a(this.f470206q, vy4Var.f470206q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f470206q;
        java.util.LinkedList linkedList2 = this.f470205p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f470196d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f470197e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f470198f);
            fVar.e(4, this.f470199g);
            java.lang.String str3 = this.f470200h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f470201i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f470202m);
            r45.kk0 kk0Var = this.f470203n;
            if (kk0Var != null) {
                fVar.i(8, kk0Var.mo75928xcd1e8d8());
                this.f470203n.mo75956x3d5d1f78(fVar);
            }
            r45.fn0 fn0Var = this.f470204o;
            if (fn0Var != null) {
                fVar.i(9, fn0Var.mo75928xcd1e8d8());
                this.f470204o.mo75956x3d5d1f78(fVar);
            }
            fVar.g(10, 8, linkedList2);
            fVar.g(11, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f470196d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f470197e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f470198f) + b36.f.e(4, this.f470199g);
            java.lang.String str7 = this.f470200h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f470201i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            int e18 = e17 + b36.f.e(7, this.f470202m);
            r45.kk0 kk0Var2 = this.f470203n;
            if (kk0Var2 != null) {
                e18 += b36.f.i(8, kk0Var2.mo75928xcd1e8d8());
            }
            r45.fn0 fn0Var2 = this.f470204o;
            if (fn0Var2 != null) {
                e18 += b36.f.i(9, fn0Var2.mo75928xcd1e8d8());
            }
            return e18 + b36.f.g(10, 8, linkedList2) + b36.f.g(11, 8, linkedList);
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
        r45.vy4 vy4Var = (r45.vy4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vy4Var.f470196d = aVar2.k(intValue);
                return 0;
            case 2:
                vy4Var.f470197e = aVar2.k(intValue);
                return 0;
            case 3:
                vy4Var.f470198f = aVar2.g(intValue);
                return 0;
            case 4:
                vy4Var.f470199g = aVar2.g(intValue);
                return 0;
            case 5:
                vy4Var.f470200h = aVar2.k(intValue);
                return 0;
            case 6:
                vy4Var.f470201i = aVar2.k(intValue);
                return 0;
            case 7:
                vy4Var.f470202m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.kk0 kk0Var3 = new r45.kk0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kk0Var3.mo11468x92b714fd(bArr2);
                    }
                    vy4Var.f470203n = kk0Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.fn0 fn0Var3 = new r45.fn0();
                    if (bArr3 != null && bArr3.length > 0) {
                        fn0Var3.mo11468x92b714fd(bArr3);
                    }
                    vy4Var.f470204o = fn0Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.hs5 hs5Var = new r45.hs5();
                    if (bArr4 != null && bArr4.length > 0) {
                        hs5Var.mo11468x92b714fd(bArr4);
                    }
                    vy4Var.f470205p.add(hs5Var);
                }
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.hs5 hs5Var2 = new r45.hs5();
                    if (bArr5 != null && bArr5.length > 0) {
                        hs5Var2.mo11468x92b714fd(bArr5);
                    }
                    vy4Var.f470206q.add(hs5Var2);
                }
                return 0;
            default:
                return -1;
        }
    }
}
