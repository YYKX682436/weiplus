package bw5;

/* loaded from: classes4.dex */
public class vh0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f115895d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.x7 f115896e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f115897f;

    /* renamed from: g, reason: collision with root package name */
    public int f115898g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f115899h = new boolean[5];

    static {
        new bw5.vh0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vh0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.vh0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vh0)) {
            return false;
        }
        bw5.vh0 vh0Var = (bw5.vh0) fVar;
        return n51.f.a(this.f115895d, vh0Var.f115895d) && n51.f.a(this.f115896e, vh0Var.f115896e) && n51.f.a(this.f115897f, vh0Var.f115897f) && n51.f.a(java.lang.Integer.valueOf(this.f115898g), java.lang.Integer.valueOf(vh0Var.f115898g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.vh0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f115899h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f115895d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.x7 x7Var = this.f115896e;
            if (x7Var != null && zArr[2]) {
                fVar.i(2, x7Var.mo75928xcd1e8d8());
                this.f115896e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f115897f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f115898g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f115895d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            bw5.x7 x7Var2 = this.f115896e;
            if (x7Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, x7Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f115897f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f115898g) : i18;
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
            this.f115895d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f115897f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f115898g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.x7 x7Var3 = new bw5.x7();
            if (bArr != null && bArr.length > 0) {
                x7Var3.mo11468x92b714fd(bArr);
            }
            this.f115896e = x7Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
