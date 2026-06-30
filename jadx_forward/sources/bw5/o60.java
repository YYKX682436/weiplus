package bw5;

/* loaded from: classes2.dex */
public class o60 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112522d;

    /* renamed from: e, reason: collision with root package name */
    public int f112523e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f112524f;

    /* renamed from: h, reason: collision with root package name */
    public bw5.l60 f112526h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f112527i;

    /* renamed from: m, reason: collision with root package name */
    public int f112528m;

    /* renamed from: n, reason: collision with root package name */
    public int f112529n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f112530o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f112531p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.p60 f112532q;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f112525g = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f112533r = new boolean[12];

    static {
        new bw5.o60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.o60 mo11468x92b714fd(byte[] bArr) {
        return (bw5.o60) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o60)) {
            return false;
        }
        bw5.o60 o60Var = (bw5.o60) fVar;
        return n51.f.a(this.f112522d, o60Var.f112522d) && n51.f.a(java.lang.Integer.valueOf(this.f112523e), java.lang.Integer.valueOf(o60Var.f112523e)) && n51.f.a(this.f112524f, o60Var.f112524f) && n51.f.a(this.f112525g, o60Var.f112525g) && n51.f.a(this.f112526h, o60Var.f112526h) && n51.f.a(java.lang.Boolean.valueOf(this.f112527i), java.lang.Boolean.valueOf(o60Var.f112527i)) && n51.f.a(java.lang.Integer.valueOf(this.f112528m), java.lang.Integer.valueOf(o60Var.f112528m)) && n51.f.a(java.lang.Integer.valueOf(this.f112529n), java.lang.Integer.valueOf(o60Var.f112529n)) && n51.f.a(this.f112530o, o60Var.f112530o) && n51.f.a(java.lang.Boolean.valueOf(this.f112531p), java.lang.Boolean.valueOf(o60Var.f112531p)) && n51.f.a(this.f112532q, o60Var.f112532q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.o60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f112525g;
        boolean[] zArr = this.f112533r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112522d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f112523e);
            }
            java.lang.String str2 = this.f112524f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            fVar.g(4, 8, linkedList);
            bw5.l60 l60Var = this.f112526h;
            if (l60Var != null && zArr[5]) {
                fVar.i(5, l60Var.mo75928xcd1e8d8());
                this.f112526h.mo75956x3d5d1f78(fVar);
            }
            if (zArr[6]) {
                fVar.a(6, this.f112527i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f112528m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f112529n);
            }
            java.lang.String str3 = this.f112530o;
            if (str3 != null && zArr[9]) {
                fVar.j(9, str3);
            }
            if (zArr[10]) {
                fVar.a(10, this.f112531p);
            }
            bw5.p60 p60Var = this.f112532q;
            if (p60Var == null || !zArr[11]) {
                return 0;
            }
            fVar.i(11, p60Var.mo75928xcd1e8d8());
            this.f112532q.mo75956x3d5d1f78(fVar);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f112522d;
            int j17 = (str4 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str4);
            if (zArr[2]) {
                j17 += b36.f.e(2, this.f112523e);
            }
            java.lang.String str5 = this.f112524f;
            if (str5 != null && zArr[3]) {
                j17 += b36.f.j(3, str5);
            }
            int g17 = j17 + b36.f.g(4, 8, linkedList);
            bw5.l60 l60Var2 = this.f112526h;
            if (l60Var2 != null && zArr[5]) {
                g17 += b36.f.i(5, l60Var2.mo75928xcd1e8d8());
            }
            if (zArr[6]) {
                g17 += b36.f.a(6, this.f112527i);
            }
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f112528m);
            }
            if (zArr[8]) {
                g17 += b36.f.e(8, this.f112529n);
            }
            java.lang.String str6 = this.f112530o;
            if (str6 != null && zArr[9]) {
                g17 += b36.f.j(9, str6);
            }
            if (zArr[10]) {
                g17 += b36.f.a(10, this.f112531p);
            }
            bw5.p60 p60Var2 = this.f112532q;
            return (p60Var2 == null || !zArr[11]) ? g17 : g17 + b36.f.i(11, p60Var2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
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
                this.f112522d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112523e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112524f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.l60 l60Var3 = new bw5.l60();
                    if (bArr != null && bArr.length > 0) {
                        l60Var3.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(l60Var3);
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    bw5.l60 l60Var4 = new bw5.l60();
                    if (bArr2 != null && bArr2.length > 0) {
                        l60Var4.mo11468x92b714fd(bArr2);
                    }
                    this.f112526h = l60Var4;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f112527i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f112528m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f112529n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f112530o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f112531p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    bw5.p60 p60Var3 = new bw5.p60();
                    if (bArr3 != null && bArr3.length > 0) {
                        p60Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f112532q = p60Var3;
                }
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
