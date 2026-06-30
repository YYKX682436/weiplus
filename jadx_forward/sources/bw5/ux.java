package bw5;

/* loaded from: classes2.dex */
public class ux extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f115602d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f115603e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f115604f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f115605g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f115606h = new boolean[5];

    static {
        new bw5.ux();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ux mo11468x92b714fd(byte[] bArr) {
        return (bw5.ux) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ux)) {
            return false;
        }
        bw5.ux uxVar = (bw5.ux) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f115602d), java.lang.Boolean.valueOf(uxVar.f115602d)) && n51.f.a(this.f115603e, uxVar.f115603e) && n51.f.a(java.lang.Boolean.valueOf(this.f115604f), java.lang.Boolean.valueOf(uxVar.f115604f)) && n51.f.a(java.lang.Boolean.valueOf(this.f115605g), java.lang.Boolean.valueOf(uxVar.f115605g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ux();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115606h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f115602d);
            }
            java.lang.String str = this.f115603e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.a(3, this.f115604f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f115605g);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f115602d) : 0;
            java.lang.String str2 = this.f115603e;
            if (str2 != null && zArr[2]) {
                a17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f115604f);
            }
            return zArr[4] ? a17 + b36.f.a(4, this.f115605g) : a17;
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
            this.f115602d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f115603e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f115604f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f115605g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }
}
