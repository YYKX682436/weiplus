package bw5;

/* loaded from: classes8.dex */
public class zk0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f117572d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.fl0 f117573e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.gl0 f117574f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.el0 f117575g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.hl0 f117576h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.il0 f117577i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f117578m = new boolean[8];

    static {
        new bw5.zk0();
    }

    public bw5.hl0 b() {
        return this.f117578m[6] ? this.f117576h : new bw5.hl0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.zk0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.zk0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zk0)) {
            return false;
        }
        bw5.zk0 zk0Var = (bw5.zk0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f117572d), java.lang.Integer.valueOf(zk0Var.f117572d)) && n51.f.a(this.f117573e, zk0Var.f117573e) && n51.f.a(this.f117574f, zk0Var.f117574f) && n51.f.a(this.f117575g, zk0Var.f117575g) && n51.f.a(this.f117576h, zk0Var.f117576h) && n51.f.a(this.f117577i, zk0Var.f117577i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.zk0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f117578m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f117572d);
            }
            bw5.fl0 fl0Var = this.f117573e;
            if (fl0Var != null && zArr[2]) {
                fVar.i(2, fl0Var.mo75928xcd1e8d8());
                this.f117573e.mo75956x3d5d1f78(fVar);
            }
            bw5.gl0 gl0Var = this.f117574f;
            if (gl0Var != null && zArr[4]) {
                fVar.i(4, gl0Var.mo75928xcd1e8d8());
                this.f117574f.mo75956x3d5d1f78(fVar);
            }
            bw5.el0 el0Var = this.f117575g;
            if (el0Var != null && zArr[5]) {
                fVar.i(5, el0Var.mo75928xcd1e8d8());
                this.f117575g.mo75956x3d5d1f78(fVar);
            }
            bw5.hl0 hl0Var = this.f117576h;
            if (hl0Var != null && zArr[6]) {
                fVar.i(6, hl0Var.mo75928xcd1e8d8());
                this.f117576h.mo75956x3d5d1f78(fVar);
            }
            bw5.il0 il0Var = this.f117577i;
            if (il0Var != null && zArr[7]) {
                fVar.i(7, il0Var.mo75928xcd1e8d8());
                this.f117577i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f117572d) : 0;
            bw5.fl0 fl0Var2 = this.f117573e;
            if (fl0Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, fl0Var2.mo75928xcd1e8d8());
            }
            bw5.gl0 gl0Var2 = this.f117574f;
            if (gl0Var2 != null && zArr[4]) {
                e17 += b36.f.i(4, gl0Var2.mo75928xcd1e8d8());
            }
            bw5.el0 el0Var2 = this.f117575g;
            if (el0Var2 != null && zArr[5]) {
                e17 += b36.f.i(5, el0Var2.mo75928xcd1e8d8());
            }
            bw5.hl0 hl0Var2 = this.f117576h;
            if (hl0Var2 != null && zArr[6]) {
                e17 += b36.f.i(6, hl0Var2.mo75928xcd1e8d8());
            }
            bw5.il0 il0Var2 = this.f117577i;
            return (il0Var2 == null || !zArr[7]) ? e17 : e17 + b36.f.i(7, il0Var2.mo75928xcd1e8d8());
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
        if (intValue == 1) {
            this.f117572d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.fl0 fl0Var3 = new bw5.fl0();
                if (bArr != null && bArr.length > 0) {
                    fl0Var3.mo11468x92b714fd(bArr);
                }
                this.f117573e = fl0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.gl0 gl0Var3 = new bw5.gl0();
                if (bArr2 != null && bArr2.length > 0) {
                    gl0Var3.mo11468x92b714fd(bArr2);
                }
                this.f117574f = gl0Var3;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue == 5) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                bw5.el0 el0Var3 = new bw5.el0();
                if (bArr3 != null && bArr3.length > 0) {
                    el0Var3.mo11468x92b714fd(bArr3);
                }
                this.f117575g = el0Var3;
            }
            zArr[5] = true;
            return 0;
        }
        if (intValue == 6) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i28 = 0; i28 < size4; i28++) {
                byte[] bArr4 = (byte[]) j27.get(i28);
                bw5.hl0 hl0Var3 = new bw5.hl0();
                if (bArr4 != null && bArr4.length > 0) {
                    hl0Var3.mo11468x92b714fd(bArr4);
                }
                this.f117576h = hl0Var3;
            }
            zArr[6] = true;
            return 0;
        }
        if (intValue != 7) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i29 = 0; i29 < size5; i29++) {
            byte[] bArr5 = (byte[]) j28.get(i29);
            bw5.il0 il0Var3 = new bw5.il0();
            if (bArr5 != null && bArr5.length > 0) {
                il0Var3.mo11468x92b714fd(bArr5);
            }
            this.f117577i = il0Var3;
        }
        zArr[7] = true;
        return 0;
    }
}
