package bw5;

/* loaded from: classes2.dex */
public class j90 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.o50 f110411d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.a70 f110412e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.ja0 f110413f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.r50 f110414g;

    /* renamed from: h, reason: collision with root package name */
    public int f110415h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.v70 f110416i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.xa0 f110417m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f110418n = new boolean[8];

    static {
        new bw5.j90();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.j90 mo11468x92b714fd(byte[] bArr) {
        return (bw5.j90) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.j90)) {
            return false;
        }
        bw5.j90 j90Var = (bw5.j90) fVar;
        return n51.f.a(this.f110411d, j90Var.f110411d) && n51.f.a(this.f110412e, j90Var.f110412e) && n51.f.a(this.f110413f, j90Var.f110413f) && n51.f.a(this.f110414g, j90Var.f110414g) && n51.f.a(java.lang.Integer.valueOf(this.f110415h), java.lang.Integer.valueOf(j90Var.f110415h)) && n51.f.a(this.f110416i, j90Var.f110416i) && n51.f.a(this.f110417m, j90Var.f110417m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.j90();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f110418n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.o50 o50Var = this.f110411d;
            if (o50Var != null && zArr[1]) {
                fVar.i(1, o50Var.mo75928xcd1e8d8());
                this.f110411d.mo75956x3d5d1f78(fVar);
            }
            bw5.a70 a70Var = this.f110412e;
            if (a70Var != null && zArr[2]) {
                fVar.i(2, a70Var.mo75928xcd1e8d8());
                this.f110412e.mo75956x3d5d1f78(fVar);
            }
            bw5.ja0 ja0Var = this.f110413f;
            if (ja0Var != null && zArr[3]) {
                fVar.i(3, ja0Var.mo75928xcd1e8d8());
                this.f110413f.mo75956x3d5d1f78(fVar);
            }
            bw5.r50 r50Var = this.f110414g;
            if (r50Var != null && zArr[4]) {
                fVar.i(4, r50Var.mo75928xcd1e8d8());
                this.f110414g.mo75956x3d5d1f78(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f110415h);
            }
            bw5.v70 v70Var = this.f110416i;
            if (v70Var != null && zArr[6]) {
                fVar.i(6, v70Var.mo75928xcd1e8d8());
                this.f110416i.mo75956x3d5d1f78(fVar);
            }
            bw5.xa0 xa0Var = this.f110417m;
            if (xa0Var != null && zArr[7]) {
                fVar.i(7, xa0Var.mo75928xcd1e8d8());
                this.f110417m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.o50 o50Var2 = this.f110411d;
            if (o50Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, o50Var2.mo75928xcd1e8d8());
            }
            bw5.a70 a70Var2 = this.f110412e;
            if (a70Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, a70Var2.mo75928xcd1e8d8());
            }
            bw5.ja0 ja0Var2 = this.f110413f;
            if (ja0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, ja0Var2.mo75928xcd1e8d8());
            }
            bw5.r50 r50Var2 = this.f110414g;
            if (r50Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, r50Var2.mo75928xcd1e8d8());
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f110415h);
            }
            bw5.v70 v70Var2 = this.f110416i;
            if (v70Var2 != null && zArr[6]) {
                i18 += b36.f.i(6, v70Var2.mo75928xcd1e8d8());
            }
            bw5.xa0 xa0Var2 = this.f110417m;
            return (xa0Var2 == null || !zArr[7]) ? i18 : i18 + b36.f.i(7, xa0Var2.mo75928xcd1e8d8());
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
                    bw5.o50 o50Var3 = new bw5.o50();
                    if (bArr != null && bArr.length > 0) {
                        o50Var3.mo11468x92b714fd(bArr);
                    }
                    this.f110411d = o50Var3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.a70 a70Var3 = new bw5.a70();
                    if (bArr2 != null && bArr2.length > 0) {
                        a70Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f110412e = a70Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.ja0 ja0Var3 = new bw5.ja0();
                    if (bArr3 != null && bArr3.length > 0) {
                        ja0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f110413f = ja0Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.r50 r50Var3 = new bw5.r50();
                    if (bArr4 != null && bArr4.length > 0) {
                        r50Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f110414g = r50Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f110415h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.v70 v70Var3 = new bw5.v70();
                    if (bArr5 != null && bArr5.length > 0) {
                        v70Var3.mo11468x92b714fd(bArr5);
                    }
                    this.f110416i = v70Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.xa0 xa0Var3 = new bw5.xa0();
                    if (bArr6 != null && bArr6.length > 0) {
                        xa0Var3.mo11468x92b714fd(bArr6);
                    }
                    this.f110417m = xa0Var3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
