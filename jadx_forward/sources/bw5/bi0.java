package bw5;

/* loaded from: classes15.dex */
public class bi0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107212d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.io0 f107213e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107214f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.f30 f107215g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.vi0 f107216h;

    /* renamed from: i, reason: collision with root package name */
    public int f107217i;

    /* renamed from: m, reason: collision with root package name */
    public int f107218m;

    /* renamed from: p, reason: collision with root package name */
    public int f107221p;

    /* renamed from: q, reason: collision with root package name */
    public int f107222q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f107223r;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f107219n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f107220o = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f107224s = new boolean[13];

    static {
        new bw5.bi0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bi0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.bi0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bi0)) {
            return false;
        }
        bw5.bi0 bi0Var = (bw5.bi0) fVar;
        return n51.f.a(this.f107212d, bi0Var.f107212d) && n51.f.a(this.f107213e, bi0Var.f107213e) && n51.f.a(this.f107214f, bi0Var.f107214f) && n51.f.a(this.f107215g, bi0Var.f107215g) && n51.f.a(this.f107216h, bi0Var.f107216h) && n51.f.a(java.lang.Integer.valueOf(this.f107217i), java.lang.Integer.valueOf(bi0Var.f107217i)) && n51.f.a(java.lang.Integer.valueOf(this.f107218m), java.lang.Integer.valueOf(bi0Var.f107218m)) && n51.f.a(this.f107219n, bi0Var.f107219n) && n51.f.a(this.f107220o, bi0Var.f107220o) && n51.f.a(java.lang.Integer.valueOf(this.f107221p), java.lang.Integer.valueOf(bi0Var.f107221p)) && n51.f.a(java.lang.Integer.valueOf(this.f107222q), java.lang.Integer.valueOf(bi0Var.f107222q)) && n51.f.a(this.f107223r, bi0Var.f107223r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.bi0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f107220o;
        java.util.LinkedList linkedList2 = this.f107219n;
        boolean[] zArr = this.f107224s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107212d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.io0 io0Var = this.f107213e;
            if (io0Var != null && zArr[2]) {
                fVar.e(2, io0Var.f110190d);
            }
            java.lang.String str2 = this.f107214f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.f30 f30Var = this.f107215g;
            if (f30Var != null && zArr[4]) {
                fVar.e(4, f30Var.f108674d);
            }
            bw5.vi0 vi0Var = this.f107216h;
            if (vi0Var != null && zArr[5]) {
                fVar.e(5, vi0Var.f115909d);
            }
            if (zArr[6]) {
                fVar.e(6, this.f107217i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f107218m);
            }
            fVar.g(8, 8, linkedList2);
            fVar.g(9, 8, linkedList);
            if (zArr[10]) {
                fVar.e(10, this.f107221p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f107222q);
            }
            java.lang.String str3 = this.f107223r;
            if (str3 == null || !zArr[12]) {
                return 0;
            }
            fVar.j(12, str3);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f107212d;
            int j17 = (str4 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str4);
            bw5.io0 io0Var2 = this.f107213e;
            if (io0Var2 != null && zArr[2]) {
                j17 += b36.f.e(2, io0Var2.f110190d);
            }
            java.lang.String str5 = this.f107214f;
            if (str5 != null && zArr[3]) {
                j17 += b36.f.j(3, str5);
            }
            bw5.f30 f30Var2 = this.f107215g;
            if (f30Var2 != null && zArr[4]) {
                j17 += b36.f.e(4, f30Var2.f108674d);
            }
            bw5.vi0 vi0Var2 = this.f107216h;
            if (vi0Var2 != null && zArr[5]) {
                j17 += b36.f.e(5, vi0Var2.f115909d);
            }
            if (zArr[6]) {
                j17 += b36.f.e(6, this.f107217i);
            }
            if (zArr[7]) {
                j17 += b36.f.e(7, this.f107218m);
            }
            int g17 = j17 + b36.f.g(8, 8, linkedList2) + b36.f.g(9, 8, linkedList);
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f107221p);
            }
            if (zArr[11]) {
                g17 += b36.f.e(11, this.f107222q);
            }
            java.lang.String str6 = this.f107223r;
            return (str6 == null || !zArr[12]) ? g17 : g17 + b36.f.j(12, str6);
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
        bw5.io0 io0Var3 = null;
        bw5.vi0 vi0Var3 = null;
        switch (intValue) {
            case 1:
                this.f107212d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                int g18 = aVar2.g(intValue);
                if (g18 == 0) {
                    io0Var3 = bw5.io0.PREVIEW_RUNNING;
                } else if (g18 == 1) {
                    io0Var3 = bw5.io0.PREVIEW_SUCCESS;
                } else if (g18 == 2) {
                    io0Var3 = bw5.io0.PREVIEW_NEED_PASSWORD;
                } else if (g18 == 3) {
                    io0Var3 = bw5.io0.PREVIEW_ERROR;
                }
                this.f107213e = io0Var3;
                zArr[2] = true;
                return 0;
            case 3:
                this.f107214f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107215g = bw5.f30.a(aVar2.g(intValue));
                zArr[4] = true;
                return 0;
            case 5:
                int g19 = aVar2.g(intValue);
                if (g19 == 0) {
                    vi0Var3 = bw5.vi0.PAGES;
                } else if (g19 == 1) {
                    vi0Var3 = bw5.vi0.SHEETS;
                }
                this.f107216h = vi0Var3;
                zArr[5] = true;
                return 0;
            case 6:
                this.f107217i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f107218m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.di0 di0Var = new bw5.di0();
                    if (bArr != null && bArr.length > 0) {
                        di0Var.mo11468x92b714fd(bArr);
                    }
                    linkedList2.add(di0Var);
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    bw5.ij0 ij0Var = new bw5.ij0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ij0Var.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(ij0Var);
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f107221p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f107222q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f107223r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
