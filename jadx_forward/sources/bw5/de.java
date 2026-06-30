package bw5;

/* loaded from: classes2.dex */
public class de extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f107985d;

    /* renamed from: e, reason: collision with root package name */
    public int f107986e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.qd0 f107987f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.n30 f107988g;

    /* renamed from: h, reason: collision with root package name */
    public int f107989h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f107990i;

    /* renamed from: n, reason: collision with root package name */
    public int f107992n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f107993o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f107994p;

    /* renamed from: q, reason: collision with root package name */
    public long f107995q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.s30 f107996r;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f107991m = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f107997s = new boolean[14];

    static {
        new bw5.de();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.de mo11468x92b714fd(byte[] bArr) {
        return (bw5.de) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.de)) {
            return false;
        }
        bw5.de deVar = (bw5.de) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f107985d), java.lang.Long.valueOf(deVar.f107985d)) && n51.f.a(java.lang.Integer.valueOf(this.f107986e), java.lang.Integer.valueOf(deVar.f107986e)) && n51.f.a(this.f107987f, deVar.f107987f) && n51.f.a(this.f107988g, deVar.f107988g) && n51.f.a(java.lang.Integer.valueOf(this.f107989h), java.lang.Integer.valueOf(deVar.f107989h)) && n51.f.a(java.lang.Boolean.valueOf(this.f107990i), java.lang.Boolean.valueOf(deVar.f107990i)) && n51.f.a(this.f107991m, deVar.f107991m) && n51.f.a(java.lang.Integer.valueOf(this.f107992n), java.lang.Integer.valueOf(deVar.f107992n)) && n51.f.a(this.f107993o, deVar.f107993o) && n51.f.a(this.f107994p, deVar.f107994p) && n51.f.a(java.lang.Long.valueOf(this.f107995q), java.lang.Long.valueOf(deVar.f107995q)) && n51.f.a(this.f107996r, deVar.f107996r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.de();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f107991m;
        boolean[] zArr = this.f107997s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f107985d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f107986e);
            }
            bw5.qd0 qd0Var = this.f107987f;
            if (qd0Var != null && zArr[4]) {
                fVar.i(4, qd0Var.mo75928xcd1e8d8());
                this.f107987f.mo75956x3d5d1f78(fVar);
            }
            bw5.n30 n30Var = this.f107988g;
            if (n30Var != null && zArr[5]) {
                fVar.i(5, n30Var.mo75928xcd1e8d8());
                this.f107988g.mo75956x3d5d1f78(fVar);
            }
            if (zArr[6]) {
                fVar.e(6, this.f107989h);
            }
            if (zArr[7]) {
                fVar.a(7, this.f107990i);
            }
            fVar.g(8, 8, linkedList);
            if (zArr[9]) {
                fVar.e(9, this.f107992n);
            }
            java.lang.String str = this.f107993o;
            if (str != null && zArr[10]) {
                fVar.j(10, str);
            }
            java.lang.String str2 = this.f107994p;
            if (str2 != null && zArr[11]) {
                fVar.j(11, str2);
            }
            if (zArr[12]) {
                fVar.h(12, this.f107995q);
            }
            bw5.s30 s30Var = this.f107996r;
            if (s30Var != null && zArr[13]) {
                fVar.i(13, s30Var.mo75928xcd1e8d8());
                this.f107996r.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f107985d) : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f107986e);
            }
            bw5.qd0 qd0Var2 = this.f107987f;
            if (qd0Var2 != null && zArr[4]) {
                h17 += b36.f.i(4, qd0Var2.mo75928xcd1e8d8());
            }
            bw5.n30 n30Var2 = this.f107988g;
            if (n30Var2 != null && zArr[5]) {
                h17 += b36.f.i(5, n30Var2.mo75928xcd1e8d8());
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f107989h);
            }
            if (zArr[7]) {
                h17 += b36.f.a(7, this.f107990i);
            }
            int g17 = h17 + b36.f.g(8, 8, linkedList);
            if (zArr[9]) {
                g17 += b36.f.e(9, this.f107992n);
            }
            java.lang.String str3 = this.f107993o;
            if (str3 != null && zArr[10]) {
                g17 += b36.f.j(10, str3);
            }
            java.lang.String str4 = this.f107994p;
            if (str4 != null && zArr[11]) {
                g17 += b36.f.j(11, str4);
            }
            if (zArr[12]) {
                g17 += b36.f.h(12, this.f107995q);
            }
            bw5.s30 s30Var2 = this.f107996r;
            return (s30Var2 == null || !zArr[13]) ? g17 : g17 + b36.f.i(13, s30Var2.mo75928xcd1e8d8());
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
                this.f107985d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107986e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
            default:
                return -1;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.qd0 qd0Var3 = new bw5.qd0();
                    if (bArr != null && bArr.length > 0) {
                        qd0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f107987f = qd0Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.n30 n30Var3 = new bw5.n30();
                    if (bArr2 != null && bArr2.length > 0) {
                        n30Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f107988g = n30Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f107989h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f107990i = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.lm lmVar = new bw5.lm();
                    if (bArr3 != null && bArr3.length > 0) {
                        lmVar.mo11468x92b714fd(bArr3);
                    }
                    linkedList.add(lmVar);
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f107992n = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f107993o = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f107994p = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f107995q = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.s30 s30Var3 = new bw5.s30();
                    if (bArr4 != null && bArr4.length > 0) {
                        s30Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f107996r = s30Var3;
                }
                zArr[13] = true;
                return 0;
        }
    }
}
