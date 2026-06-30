package bw5;

/* loaded from: classes4.dex */
public class r extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f113869d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113870e;

    /* renamed from: f, reason: collision with root package name */
    public int f113871f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f113872g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f113873h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f113874i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.q f113875m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f113876n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.n1 f113877o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.q1 f113878p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.p1 f113879q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.p1 f113880r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f113881s = new boolean[13];

    static {
        new bw5.r();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.r mo11468x92b714fd(byte[] bArr) {
        return (bw5.r) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.r)) {
            return false;
        }
        bw5.r rVar = (bw5.r) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f113869d), java.lang.Integer.valueOf(rVar.f113869d)) && n51.f.a(this.f113870e, rVar.f113870e) && n51.f.a(java.lang.Integer.valueOf(this.f113871f), java.lang.Integer.valueOf(rVar.f113871f)) && n51.f.a(this.f113872g, rVar.f113872g) && n51.f.a(this.f113873h, rVar.f113873h) && n51.f.a(this.f113874i, rVar.f113874i) && n51.f.a(this.f113875m, rVar.f113875m) && n51.f.a(this.f113876n, rVar.f113876n) && n51.f.a(this.f113877o, rVar.f113877o) && n51.f.a(this.f113878p, rVar.f113878p) && n51.f.a(this.f113879q, rVar.f113879q) && n51.f.a(this.f113880r, rVar.f113880r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.r();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113881s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f113869d);
            }
            java.lang.String str = this.f113870e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f113871f);
            }
            java.lang.String str2 = this.f113872g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f113873h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f113874i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            bw5.q qVar = this.f113875m;
            if (qVar != null && zArr[7]) {
                fVar.i(7, qVar.mo75928xcd1e8d8());
                this.f113875m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f113876n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            bw5.n1 n1Var = this.f113877o;
            if (n1Var != null && zArr[9]) {
                fVar.i(9, n1Var.mo75928xcd1e8d8());
                this.f113877o.mo75956x3d5d1f78(fVar);
            }
            bw5.q1 q1Var = this.f113878p;
            if (q1Var != null && zArr[10]) {
                fVar.i(10, q1Var.mo75928xcd1e8d8());
                this.f113878p.mo75956x3d5d1f78(fVar);
            }
            bw5.p1 p1Var = this.f113879q;
            if (p1Var != null && zArr[11]) {
                fVar.i(11, p1Var.mo75928xcd1e8d8());
                this.f113879q.mo75956x3d5d1f78(fVar);
            }
            bw5.p1 p1Var2 = this.f113880r;
            if (p1Var2 == null || !zArr[12]) {
                return 0;
            }
            fVar.i(12, p1Var2.mo75928xcd1e8d8());
            this.f113880r.mo75956x3d5d1f78(fVar);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f113869d) : 0;
            java.lang.String str6 = this.f113870e;
            if (str6 != null && zArr[2]) {
                e17 += b36.f.j(2, str6);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f113871f);
            }
            java.lang.String str7 = this.f113872g;
            if (str7 != null && zArr[4]) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f113873h;
            if (str8 != null && zArr[5]) {
                e17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f113874i;
            if (str9 != null && zArr[6]) {
                e17 += b36.f.j(6, str9);
            }
            bw5.q qVar2 = this.f113875m;
            if (qVar2 != null && zArr[7]) {
                e17 += b36.f.i(7, qVar2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f113876n;
            if (str10 != null && zArr[8]) {
                e17 += b36.f.j(8, str10);
            }
            bw5.n1 n1Var2 = this.f113877o;
            if (n1Var2 != null && zArr[9]) {
                e17 += b36.f.i(9, n1Var2.mo75928xcd1e8d8());
            }
            bw5.q1 q1Var2 = this.f113878p;
            if (q1Var2 != null && zArr[10]) {
                e17 += b36.f.i(10, q1Var2.mo75928xcd1e8d8());
            }
            bw5.p1 p1Var3 = this.f113879q;
            if (p1Var3 != null && zArr[11]) {
                e17 += b36.f.i(11, p1Var3.mo75928xcd1e8d8());
            }
            bw5.p1 p1Var4 = this.f113880r;
            return (p1Var4 == null || !zArr[12]) ? e17 : e17 + b36.f.i(12, p1Var4.mo75928xcd1e8d8());
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
                this.f113869d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113870e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113871f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113872g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113873h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113874i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.q qVar3 = new bw5.q();
                    if (bArr != null && bArr.length > 0) {
                        qVar3.mo11468x92b714fd(bArr);
                    }
                    this.f113875m = qVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f113876n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.n1 n1Var3 = new bw5.n1();
                    if (bArr2 != null && bArr2.length > 0) {
                        n1Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f113877o = n1Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.q1 q1Var3 = new bw5.q1();
                    if (bArr3 != null && bArr3.length > 0) {
                        q1Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f113878p = q1Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.p1 p1Var5 = new bw5.p1();
                    if (bArr4 != null && bArr4.length > 0) {
                        p1Var5.mo11468x92b714fd(bArr4);
                    }
                    this.f113879q = p1Var5;
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.p1 p1Var6 = new bw5.p1();
                    if (bArr5 != null && bArr5.length > 0) {
                        p1Var6.mo11468x92b714fd(bArr5);
                    }
                    this.f113880r = p1Var6;
                }
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
