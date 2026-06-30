package bw5;

/* loaded from: classes2.dex */
public class cj0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107648d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f107649e;

    /* renamed from: f, reason: collision with root package name */
    public float f107650f;

    /* renamed from: g, reason: collision with root package name */
    public float f107651g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f107652h = new boolean[5];

    static {
        new bw5.cj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cj0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.cj0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cj0)) {
            return false;
        }
        bw5.cj0 cj0Var = (bw5.cj0) fVar;
        return n51.f.a(this.f107648d, cj0Var.f107648d) && n51.f.a(java.lang.Boolean.valueOf(this.f107649e), java.lang.Boolean.valueOf(cj0Var.f107649e)) && n51.f.a(java.lang.Float.valueOf(this.f107650f), java.lang.Float.valueOf(cj0Var.f107650f)) && n51.f.a(java.lang.Float.valueOf(this.f107651g), java.lang.Float.valueOf(cj0Var.f107651g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.cj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f107652h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107648d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.a(2, this.f107649e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f107650f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f107651g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f107648d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f107649e);
            }
            if (zArr[3]) {
                i18 += b36.f.d(3, this.f107650f);
            }
            return zArr[4] ? i18 + b36.f.d(4, this.f107651g) : i18;
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
            this.f107648d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f107649e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f107650f = aVar2.f(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f107651g = aVar2.f(intValue);
        zArr[4] = true;
        return 0;
    }
}
