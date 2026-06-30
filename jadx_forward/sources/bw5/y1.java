package bw5;

/* loaded from: classes14.dex */
public class y1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.x1 f116837d;

    /* renamed from: e, reason: collision with root package name */
    public int f116838e;

    /* renamed from: f, reason: collision with root package name */
    public int f116839f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f116840g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f116841h = new boolean[5];

    static {
        new bw5.y1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.y1 mo11468x92b714fd(byte[] bArr) {
        return (bw5.y1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.y1)) {
            return false;
        }
        bw5.y1 y1Var = (bw5.y1) fVar;
        return n51.f.a(this.f116837d, y1Var.f116837d) && n51.f.a(java.lang.Integer.valueOf(this.f116838e), java.lang.Integer.valueOf(y1Var.f116838e)) && n51.f.a(java.lang.Integer.valueOf(this.f116839f), java.lang.Integer.valueOf(y1Var.f116839f)) && n51.f.a(java.lang.Boolean.valueOf(this.f116840g), java.lang.Boolean.valueOf(y1Var.f116840g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.y1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f116841h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.x1 x1Var = this.f116837d;
            if (x1Var != null && zArr[1]) {
                fVar.e(1, x1Var.f116439d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f116838e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f116839f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f116840g);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.x1 x1Var2 = this.f116837d;
            if (x1Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, x1Var2.f116439d);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f116838e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f116839f);
            }
            return zArr[4] ? i18 + b36.f.a(4, this.f116840g) : i18;
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
            int g17 = aVar2.g(intValue);
            this.f116837d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 4 ? null : bw5.x1.PCMFormatFloat32LE : bw5.x1.PCMFormatS24LE : bw5.x1.PCMFormatS16BE : bw5.x1.PCMFormatS16LE : bw5.x1.PCMFormatUnknown;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f116838e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f116839f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f116840g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }
}
