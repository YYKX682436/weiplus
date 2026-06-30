package bw5;

/* loaded from: classes9.dex */
public class g1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f109136d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109137e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f109138f;

    /* renamed from: i, reason: collision with root package name */
    public bw5.b1 f109141i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.b1 f109142m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.b1 f109143n;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f109139g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f109140h = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f109144o = new boolean[9];

    static {
        new bw5.g1();
    }

    public bw5.b1 b() {
        return this.f109144o[6] ? this.f109141i : new bw5.b1();
    }

    public bw5.b1 c() {
        return this.f109144o[8] ? this.f109143n : new bw5.b1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.g1)) {
            return false;
        }
        bw5.g1 g1Var = (bw5.g1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f109136d), java.lang.Long.valueOf(g1Var.f109136d)) && n51.f.a(this.f109137e, g1Var.f109137e) && n51.f.a(this.f109138f, g1Var.f109138f) && n51.f.a(this.f109139g, g1Var.f109139g) && n51.f.a(this.f109140h, g1Var.f109140h) && n51.f.a(this.f109141i, g1Var.f109141i) && n51.f.a(this.f109142m, g1Var.f109142m) && n51.f.a(this.f109143n, g1Var.f109143n);
    }

    public bw5.b1 d() {
        return this.f109144o[7] ? this.f109142m : new bw5.b1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public bw5.g1 mo11468x92b714fd(byte[] bArr) {
        return (bw5.g1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.g1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f109140h;
        java.util.LinkedList linkedList2 = this.f109139g;
        boolean[] zArr = this.f109144o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f109136d);
            }
            java.lang.String str = this.f109137e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f109138f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            fVar.g(4, 8, linkedList2);
            fVar.g(5, 8, linkedList);
            bw5.b1 b1Var = this.f109141i;
            if (b1Var != null && zArr[6]) {
                fVar.i(6, b1Var.mo75928xcd1e8d8());
                this.f109141i.mo75956x3d5d1f78(fVar);
            }
            bw5.b1 b1Var2 = this.f109142m;
            if (b1Var2 != null && zArr[7]) {
                fVar.i(7, b1Var2.mo75928xcd1e8d8());
                this.f109142m.mo75956x3d5d1f78(fVar);
            }
            bw5.b1 b1Var3 = this.f109143n;
            if (b1Var3 != null && zArr[8]) {
                fVar.i(8, b1Var3.mo75928xcd1e8d8());
                this.f109143n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f109136d) : 0;
            java.lang.String str3 = this.f109137e;
            if (str3 != null && zArr[2]) {
                h17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f109138f;
            if (str4 != null && zArr[3]) {
                h17 += b36.f.j(3, str4);
            }
            int g17 = h17 + b36.f.g(4, 8, linkedList2) + b36.f.g(5, 8, linkedList);
            bw5.b1 b1Var4 = this.f109141i;
            if (b1Var4 != null && zArr[6]) {
                g17 += b36.f.i(6, b1Var4.mo75928xcd1e8d8());
            }
            bw5.b1 b1Var5 = this.f109142m;
            if (b1Var5 != null && zArr[7]) {
                g17 += b36.f.i(7, b1Var5.mo75928xcd1e8d8());
            }
            bw5.b1 b1Var6 = this.f109143n;
            return (b1Var6 == null || !zArr[8]) ? g17 : g17 + b36.f.i(8, b1Var6.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            linkedList2.clear();
            linkedList.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f109136d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109137e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109138f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.c1 c1Var = new bw5.c1();
                    if (bArr != null && bArr.length > 0) {
                        c1Var.mo11468x92b714fd(bArr);
                    }
                    linkedList2.add(c1Var);
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.d1 d1Var = new bw5.d1();
                    if (bArr2 != null && bArr2.length > 0) {
                        d1Var.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(d1Var);
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.b1 b1Var7 = new bw5.b1();
                    if (bArr3 != null && bArr3.length > 0) {
                        b1Var7.mo11468x92b714fd(bArr3);
                    }
                    this.f109141i = b1Var7;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.b1 b1Var8 = new bw5.b1();
                    if (bArr4 != null && bArr4.length > 0) {
                        b1Var8.mo11468x92b714fd(bArr4);
                    }
                    this.f109142m = b1Var8;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.b1 b1Var9 = new bw5.b1();
                    if (bArr5 != null && bArr5.length > 0) {
                        b1Var9.mo11468x92b714fd(bArr5);
                    }
                    this.f109143n = b1Var9;
                }
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
