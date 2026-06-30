package bw5;

/* loaded from: classes14.dex */
public class kp0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.rq0 f110993d;

    /* renamed from: e, reason: collision with root package name */
    public int f110994e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.rq0 f110995f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.rq0 f110996g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.rq0 f110997h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.rq0 f110998i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.rq0 f110999m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f111000n = new boolean[8];

    static {
        new bw5.kp0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kp0)) {
            return false;
        }
        bw5.kp0 kp0Var = (bw5.kp0) fVar;
        return n51.f.a(this.f110993d, kp0Var.f110993d) && n51.f.a(java.lang.Integer.valueOf(this.f110994e), java.lang.Integer.valueOf(kp0Var.f110994e)) && n51.f.a(this.f110995f, kp0Var.f110995f) && n51.f.a(this.f110996g, kp0Var.f110996g) && n51.f.a(this.f110997h, kp0Var.f110997h) && n51.f.a(this.f110998i, kp0Var.f110998i) && n51.f.a(this.f110999m, kp0Var.f110999m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.kp0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f111000n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.rq0 rq0Var = this.f110993d;
            if (rq0Var != null && zArr[1]) {
                fVar.i(1, rq0Var.mo75928xcd1e8d8());
                this.f110993d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f110994e);
            }
            bw5.rq0 rq0Var2 = this.f110995f;
            if (rq0Var2 != null && zArr[3]) {
                fVar.i(3, rq0Var2.mo75928xcd1e8d8());
                this.f110995f.mo75956x3d5d1f78(fVar);
            }
            bw5.rq0 rq0Var3 = this.f110996g;
            if (rq0Var3 != null && zArr[4]) {
                fVar.i(4, rq0Var3.mo75928xcd1e8d8());
                this.f110996g.mo75956x3d5d1f78(fVar);
            }
            bw5.rq0 rq0Var4 = this.f110997h;
            if (rq0Var4 != null && zArr[5]) {
                fVar.i(5, rq0Var4.mo75928xcd1e8d8());
                this.f110997h.mo75956x3d5d1f78(fVar);
            }
            bw5.rq0 rq0Var5 = this.f110998i;
            if (rq0Var5 != null && zArr[6]) {
                fVar.i(6, rq0Var5.mo75928xcd1e8d8());
                this.f110998i.mo75956x3d5d1f78(fVar);
            }
            bw5.rq0 rq0Var6 = this.f110999m;
            if (rq0Var6 != null && zArr[7]) {
                fVar.i(7, rq0Var6.mo75928xcd1e8d8());
                this.f110999m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.rq0 rq0Var7 = this.f110993d;
            if (rq0Var7 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, rq0Var7.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f110994e);
            }
            bw5.rq0 rq0Var8 = this.f110995f;
            if (rq0Var8 != null && zArr[3]) {
                i18 += b36.f.i(3, rq0Var8.mo75928xcd1e8d8());
            }
            bw5.rq0 rq0Var9 = this.f110996g;
            if (rq0Var9 != null && zArr[4]) {
                i18 += b36.f.i(4, rq0Var9.mo75928xcd1e8d8());
            }
            bw5.rq0 rq0Var10 = this.f110997h;
            if (rq0Var10 != null && zArr[5]) {
                i18 += b36.f.i(5, rq0Var10.mo75928xcd1e8d8());
            }
            bw5.rq0 rq0Var11 = this.f110998i;
            if (rq0Var11 != null && zArr[6]) {
                i18 += b36.f.i(6, rq0Var11.mo75928xcd1e8d8());
            }
            bw5.rq0 rq0Var12 = this.f110999m;
            return (rq0Var12 == null || !zArr[7]) ? i18 : i18 + b36.f.i(7, rq0Var12.mo75928xcd1e8d8());
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
                    bw5.rq0 rq0Var13 = new bw5.rq0();
                    if (bArr != null && bArr.length > 0) {
                        rq0Var13.mo11468x92b714fd(bArr);
                    }
                    this.f110993d = rq0Var13;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f110994e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.rq0 rq0Var14 = new bw5.rq0();
                    if (bArr2 != null && bArr2.length > 0) {
                        rq0Var14.mo11468x92b714fd(bArr2);
                    }
                    this.f110995f = rq0Var14;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.rq0 rq0Var15 = new bw5.rq0();
                    if (bArr3 != null && bArr3.length > 0) {
                        rq0Var15.mo11468x92b714fd(bArr3);
                    }
                    this.f110996g = rq0Var15;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.rq0 rq0Var16 = new bw5.rq0();
                    if (bArr4 != null && bArr4.length > 0) {
                        rq0Var16.mo11468x92b714fd(bArr4);
                    }
                    this.f110997h = rq0Var16;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.rq0 rq0Var17 = new bw5.rq0();
                    if (bArr5 != null && bArr5.length > 0) {
                        rq0Var17.mo11468x92b714fd(bArr5);
                    }
                    this.f110998i = rq0Var17;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.rq0 rq0Var18 = new bw5.rq0();
                    if (bArr6 != null && bArr6.length > 0) {
                        rq0Var18.mo11468x92b714fd(bArr6);
                    }
                    this.f110999m = rq0Var18;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.kp0) super.mo11468x92b714fd(bArr);
    }
}
