package bw5;

/* loaded from: classes4.dex */
public class tp0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public double f115103d;

    /* renamed from: e, reason: collision with root package name */
    public double f115104e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f115105f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f115106g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f115107h = new boolean[5];

    static {
        new bw5.tp0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tp0)) {
            return false;
        }
        bw5.tp0 tp0Var = (bw5.tp0) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f115103d), java.lang.Double.valueOf(tp0Var.f115103d)) && n51.f.a(java.lang.Double.valueOf(this.f115104e), java.lang.Double.valueOf(tp0Var.f115104e)) && n51.f.a(this.f115105f, tp0Var.f115105f) && n51.f.a(this.f115106g, tp0Var.f115106g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.tp0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115107h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.c(1, this.f115103d);
            }
            if (zArr[2]) {
                fVar.c(2, this.f115104e);
            }
            java.lang.String str = this.f115105f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f115106g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int c17 = zArr[1] ? 0 + b36.f.c(1, this.f115103d) : 0;
            if (zArr[2]) {
                c17 += b36.f.c(2, this.f115104e);
            }
            java.lang.String str3 = this.f115105f;
            if (str3 != null && zArr[3]) {
                c17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f115106g;
            return (str4 == null || !zArr[4]) ? c17 : c17 + b36.f.j(4, str4);
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
            this.f115103d = aVar2.e(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f115104e = aVar2.e(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f115105f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f115106g = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.tp0) super.mo11468x92b714fd(bArr);
    }
}
