package bw5;

/* loaded from: classes2.dex */
public class kq0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.lp0 f111021d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.lp0 f111022e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.ip0 f111023f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.gq0 f111024g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.r50 f111025h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.br0 f111026i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f111027m = new boolean[7];

    static {
        new bw5.kq0();
    }

    public bw5.lp0 b() {
        return this.f111027m[1] ? this.f111021d : new bw5.lp0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.kq0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.kq0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kq0)) {
            return false;
        }
        bw5.kq0 kq0Var = (bw5.kq0) fVar;
        return n51.f.a(this.f111021d, kq0Var.f111021d) && n51.f.a(this.f111022e, kq0Var.f111022e) && n51.f.a(this.f111023f, kq0Var.f111023f) && n51.f.a(this.f111024g, kq0Var.f111024g) && n51.f.a(this.f111025h, kq0Var.f111025h) && n51.f.a(this.f111026i, kq0Var.f111026i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.kq0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f111027m;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.lp0 lp0Var = this.f111021d;
            if (lp0Var != null && zArr[1]) {
                fVar.i(1, lp0Var.mo75928xcd1e8d8());
                this.f111021d.mo75956x3d5d1f78(fVar);
            }
            bw5.lp0 lp0Var2 = this.f111022e;
            if (lp0Var2 != null && zArr[2]) {
                fVar.i(2, lp0Var2.mo75928xcd1e8d8());
                this.f111022e.mo75956x3d5d1f78(fVar);
            }
            bw5.ip0 ip0Var = this.f111023f;
            if (ip0Var != null && zArr[3]) {
                fVar.i(3, ip0Var.mo75928xcd1e8d8());
                this.f111023f.mo75956x3d5d1f78(fVar);
            }
            bw5.gq0 gq0Var = this.f111024g;
            if (gq0Var != null && zArr[4]) {
                fVar.i(4, gq0Var.mo75928xcd1e8d8());
                this.f111024g.mo75956x3d5d1f78(fVar);
            }
            bw5.r50 r50Var = this.f111025h;
            if (r50Var != null && zArr[5]) {
                fVar.i(5, r50Var.mo75928xcd1e8d8());
                this.f111025h.mo75956x3d5d1f78(fVar);
            }
            bw5.br0 br0Var = this.f111026i;
            if (br0Var != null && zArr[6]) {
                fVar.i(6, br0Var.mo75928xcd1e8d8());
                this.f111026i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.lp0 lp0Var3 = this.f111021d;
            if (lp0Var3 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, lp0Var3.mo75928xcd1e8d8());
            }
            bw5.lp0 lp0Var4 = this.f111022e;
            if (lp0Var4 != null && zArr[2]) {
                i18 += b36.f.i(2, lp0Var4.mo75928xcd1e8d8());
            }
            bw5.ip0 ip0Var2 = this.f111023f;
            if (ip0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, ip0Var2.mo75928xcd1e8d8());
            }
            bw5.gq0 gq0Var2 = this.f111024g;
            if (gq0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, gq0Var2.mo75928xcd1e8d8());
            }
            bw5.r50 r50Var2 = this.f111025h;
            if (r50Var2 != null && zArr[5]) {
                i18 += b36.f.i(5, r50Var2.mo75928xcd1e8d8());
            }
            bw5.br0 br0Var2 = this.f111026i;
            return (br0Var2 == null || !zArr[6]) ? i18 : i18 + b36.f.i(6, br0Var2.mo75928xcd1e8d8());
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
                    bw5.lp0 lp0Var5 = new bw5.lp0();
                    if (bArr != null && bArr.length > 0) {
                        lp0Var5.mo11468x92b714fd(bArr);
                    }
                    this.f111021d = lp0Var5;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.lp0 lp0Var6 = new bw5.lp0();
                    if (bArr2 != null && bArr2.length > 0) {
                        lp0Var6.mo11468x92b714fd(bArr2);
                    }
                    this.f111022e = lp0Var6;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.ip0 ip0Var3 = new bw5.ip0();
                    if (bArr3 != null && bArr3.length > 0) {
                        ip0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f111023f = ip0Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.gq0 gq0Var3 = new bw5.gq0();
                    if (bArr4 != null && bArr4.length > 0) {
                        gq0Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f111024g = gq0Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.r50 r50Var3 = new bw5.r50();
                    if (bArr5 != null && bArr5.length > 0) {
                        r50Var3.mo11468x92b714fd(bArr5);
                    }
                    this.f111025h = r50Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.br0 br0Var3 = new bw5.br0();
                    if (bArr6 != null && bArr6.length > 0) {
                        br0Var3.mo11468x92b714fd(bArr6);
                    }
                    this.f111026i = br0Var3;
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
