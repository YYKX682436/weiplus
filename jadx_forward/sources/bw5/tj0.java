package bw5;

/* loaded from: classes4.dex */
public class tj0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f115004d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f115005e;

    /* renamed from: f, reason: collision with root package name */
    public int f115006f;

    /* renamed from: g, reason: collision with root package name */
    public int f115007g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f115008h;

    /* renamed from: i, reason: collision with root package name */
    public int f115009i;

    /* renamed from: m, reason: collision with root package name */
    public int f115010m;

    /* renamed from: n, reason: collision with root package name */
    public int f115011n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f115012o;

    /* renamed from: p, reason: collision with root package name */
    public int f115013p;

    /* renamed from: q, reason: collision with root package name */
    public long f115014q;

    /* renamed from: r, reason: collision with root package name */
    public long f115015r;

    /* renamed from: s, reason: collision with root package name */
    public int f115016s;

    /* renamed from: t, reason: collision with root package name */
    public int f115017t;

    /* renamed from: v, reason: collision with root package name */
    public int f115019v;

    /* renamed from: w, reason: collision with root package name */
    public r45.cu5 f115020w;

    /* renamed from: x, reason: collision with root package name */
    public r45.cu5 f115021x;

    /* renamed from: y, reason: collision with root package name */
    public int f115022y;

    /* renamed from: z, reason: collision with root package name */
    public int f115023z;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f115018u = new java.util.LinkedList();
    public final java.util.LinkedList A = new java.util.LinkedList();
    public final boolean[] B = new boolean[22];

    static {
        new bw5.tj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tj0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.tj0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tj0)) {
            return false;
        }
        bw5.tj0 tj0Var = (bw5.tj0) fVar;
        return n51.f.a(this.f115004d, tj0Var.f115004d) && n51.f.a(this.f115005e, tj0Var.f115005e) && n51.f.a(java.lang.Integer.valueOf(this.f115006f), java.lang.Integer.valueOf(tj0Var.f115006f)) && n51.f.a(java.lang.Integer.valueOf(this.f115007g), java.lang.Integer.valueOf(tj0Var.f115007g)) && n51.f.a(this.f115008h, tj0Var.f115008h) && n51.f.a(java.lang.Integer.valueOf(this.f115009i), java.lang.Integer.valueOf(tj0Var.f115009i)) && n51.f.a(java.lang.Integer.valueOf(this.f115010m), java.lang.Integer.valueOf(tj0Var.f115010m)) && n51.f.a(java.lang.Integer.valueOf(this.f115011n), java.lang.Integer.valueOf(tj0Var.f115011n)) && n51.f.a(this.f115012o, tj0Var.f115012o) && n51.f.a(java.lang.Integer.valueOf(this.f115013p), java.lang.Integer.valueOf(tj0Var.f115013p)) && n51.f.a(java.lang.Long.valueOf(this.f115014q), java.lang.Long.valueOf(tj0Var.f115014q)) && n51.f.a(java.lang.Long.valueOf(this.f115015r), java.lang.Long.valueOf(tj0Var.f115015r)) && n51.f.a(java.lang.Integer.valueOf(this.f115016s), java.lang.Integer.valueOf(tj0Var.f115016s)) && n51.f.a(java.lang.Integer.valueOf(this.f115017t), java.lang.Integer.valueOf(tj0Var.f115017t)) && n51.f.a(this.f115018u, tj0Var.f115018u) && n51.f.a(java.lang.Integer.valueOf(this.f115019v), java.lang.Integer.valueOf(tj0Var.f115019v)) && n51.f.a(this.f115020w, tj0Var.f115020w) && n51.f.a(this.f115021x, tj0Var.f115021x) && n51.f.a(java.lang.Integer.valueOf(this.f115022y), java.lang.Integer.valueOf(tj0Var.f115022y)) && n51.f.a(java.lang.Integer.valueOf(this.f115023z), java.lang.Integer.valueOf(tj0Var.f115023z)) && n51.f.a(this.A, tj0Var.A);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.tj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f115018u;
        int i18 = 0;
        boolean[] zArr = this.B;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f115004d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f115005e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f115006f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f115007g);
            }
            java.lang.String str3 = this.f115008h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.e(6, this.f115009i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f115010m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f115011n);
            }
            java.lang.String str4 = this.f115012o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            if (zArr[10]) {
                fVar.e(10, this.f115013p);
            }
            if (zArr[11]) {
                fVar.h(11, this.f115014q);
            }
            if (zArr[12]) {
                fVar.h(12, this.f115015r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f115016s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f115017t);
            }
            fVar.g(15, 8, linkedList);
            if (zArr[16]) {
                fVar.e(16, this.f115019v);
            }
            r45.cu5 cu5Var = this.f115020w;
            if (cu5Var != null && zArr[17]) {
                fVar.i(17, cu5Var.mo75928xcd1e8d8());
                this.f115020w.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var2 = this.f115021x;
            if (cu5Var2 != null && zArr[18]) {
                fVar.i(18, cu5Var2.mo75928xcd1e8d8());
                this.f115021x.mo75956x3d5d1f78(fVar);
            }
            if (zArr[19]) {
                fVar.e(19, this.f115022y);
            }
            if (zArr[20]) {
                fVar.e(20, this.f115023z);
            }
            fVar.g(21, 8, this.A);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f115004d;
            if (str5 != null && zArr[1]) {
                i18 = b36.f.j(1, str5) + 0;
            }
            java.lang.String str6 = this.f115005e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f115006f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f115007g);
            }
            java.lang.String str7 = this.f115008h;
            if (str7 != null && zArr[5]) {
                i18 += b36.f.j(5, str7);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f115009i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f115010m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f115011n);
            }
            java.lang.String str8 = this.f115012o;
            if (str8 != null && zArr[9]) {
                i18 += b36.f.j(9, str8);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f115013p);
            }
            if (zArr[11]) {
                i18 += b36.f.h(11, this.f115014q);
            }
            if (zArr[12]) {
                i18 += b36.f.h(12, this.f115015r);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f115016s);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f115017t);
            }
            int g17 = i18 + b36.f.g(15, 8, linkedList);
            if (zArr[16]) {
                g17 += b36.f.e(16, this.f115019v);
            }
            r45.cu5 cu5Var3 = this.f115020w;
            if (cu5Var3 != null && zArr[17]) {
                g17 += b36.f.i(17, cu5Var3.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var4 = this.f115021x;
            if (cu5Var4 != null && zArr[18]) {
                g17 += b36.f.i(18, cu5Var4.mo75928xcd1e8d8());
            }
            if (zArr[19]) {
                g17 += b36.f.e(19, this.f115022y);
            }
            if (zArr[20]) {
                g17 += b36.f.e(20, this.f115023z);
            }
            return g17 + b36.f.g(21, 8, this.A);
        }
        if (i17 == 2) {
            linkedList.clear();
            this.A.clear();
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
                this.f115004d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f115005e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f115006f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f115007g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115008h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f115009i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f115010m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f115011n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f115012o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f115013p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f115014q = aVar2.i(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f115015r = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f115016s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f115017t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.xj0 xj0Var = new bw5.xj0();
                    if (bArr != null && bArr.length > 0) {
                        xj0Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(xj0Var);
                }
                zArr[15] = true;
                return 0;
            case 16:
                this.f115019v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    this.f115020w = cu5Var5;
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var6.b(bArr3);
                    }
                    this.f115021x = cu5Var6;
                }
                zArr[18] = true;
                return 0;
            case 19:
                this.f115022y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f115023z = aVar2.g(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.sj0 sj0Var = new bw5.sj0();
                    if (bArr4 != null && bArr4.length > 0) {
                        sj0Var.mo11468x92b714fd(bArr4);
                    }
                    this.A.add(sj0Var);
                }
                zArr[21] = true;
                return 0;
            default:
                return -1;
        }
    }
}
