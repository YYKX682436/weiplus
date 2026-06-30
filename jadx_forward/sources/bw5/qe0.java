package bw5;

/* loaded from: classes9.dex */
public class qe0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.q5 f113592d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.pe0 f113593e;

    /* renamed from: f, reason: collision with root package name */
    public int f113594f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f113595g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f113596h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.a9 f113597i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.a9 f113598m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f113599n = new boolean[8];

    static {
        new bw5.qe0();
    }

    public bw5.pe0 b() {
        return this.f113599n[2] ? this.f113593e : new bw5.pe0();
    }

    public bw5.q5 c() {
        return this.f113599n[1] ? this.f113592d : new bw5.q5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qe0)) {
            return false;
        }
        bw5.qe0 qe0Var = (bw5.qe0) fVar;
        return n51.f.a(this.f113592d, qe0Var.f113592d) && n51.f.a(this.f113593e, qe0Var.f113593e) && n51.f.a(java.lang.Integer.valueOf(this.f113594f), java.lang.Integer.valueOf(qe0Var.f113594f)) && n51.f.a(java.lang.Boolean.valueOf(this.f113595g), java.lang.Boolean.valueOf(qe0Var.f113595g)) && n51.f.a(this.f113596h, qe0Var.f113596h) && n51.f.a(this.f113597i, qe0Var.f113597i) && n51.f.a(this.f113598m, qe0Var.f113598m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.qe0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.qe0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.qe0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f113599n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.q5 q5Var = this.f113592d;
            if (q5Var != null && zArr[1]) {
                fVar.i(1, q5Var.mo75928xcd1e8d8());
                this.f113592d.mo75956x3d5d1f78(fVar);
            }
            bw5.pe0 pe0Var = this.f113593e;
            if (pe0Var != null && zArr[2]) {
                fVar.i(2, pe0Var.mo75928xcd1e8d8());
                this.f113593e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f113594f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f113595g);
            }
            java.lang.String str = this.f113596h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            bw5.a9 a9Var = this.f113597i;
            if (a9Var != null && zArr[6]) {
                fVar.i(6, a9Var.mo75928xcd1e8d8());
                this.f113597i.mo75956x3d5d1f78(fVar);
            }
            bw5.a9 a9Var2 = this.f113598m;
            if (a9Var2 != null && zArr[7]) {
                fVar.i(7, a9Var2.mo75928xcd1e8d8());
                this.f113598m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.q5 q5Var2 = this.f113592d;
            if (q5Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, q5Var2.mo75928xcd1e8d8());
            }
            bw5.pe0 pe0Var2 = this.f113593e;
            if (pe0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, pe0Var2.mo75928xcd1e8d8());
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f113594f);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f113595g);
            }
            java.lang.String str2 = this.f113596h;
            if (str2 != null && zArr[5]) {
                i18 += b36.f.j(5, str2);
            }
            bw5.a9 a9Var3 = this.f113597i;
            if (a9Var3 != null && zArr[6]) {
                i18 += b36.f.i(6, a9Var3.mo75928xcd1e8d8());
            }
            bw5.a9 a9Var4 = this.f113598m;
            return (a9Var4 == null || !zArr[7]) ? i18 : i18 + b36.f.i(7, a9Var4.mo75928xcd1e8d8());
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.q5 q5Var3 = new bw5.q5();
                    if (bArr != null && bArr.length > 0) {
                        q5Var3.mo11468x92b714fd(bArr);
                    }
                    this.f113592d = q5Var3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.pe0 pe0Var3 = new bw5.pe0();
                    if (bArr2 != null && bArr2.length > 0) {
                        pe0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f113593e = pe0Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f113594f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113595g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113596h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.a9 a9Var5 = new bw5.a9();
                    if (bArr3 != null && bArr3.length > 0) {
                        a9Var5.mo11468x92b714fd(bArr3);
                    }
                    this.f113597i = a9Var5;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.a9 a9Var6 = new bw5.a9();
                    if (bArr4 != null && bArr4.length > 0) {
                        a9Var6.mo11468x92b714fd(bArr4);
                    }
                    this.f113598m = a9Var6;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
