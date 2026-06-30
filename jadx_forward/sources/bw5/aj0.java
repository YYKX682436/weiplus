package bw5;

/* loaded from: classes8.dex */
public class aj0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f106754d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f106755e;

    /* renamed from: f, reason: collision with root package name */
    public long f106756f;

    /* renamed from: g, reason: collision with root package name */
    public int f106757g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f106758h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f106759i = new boolean[6];

    static {
        new bw5.aj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.aj0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.aj0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.aj0)) {
            return false;
        }
        bw5.aj0 aj0Var = (bw5.aj0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f106754d), java.lang.Integer.valueOf(aj0Var.f106754d)) && n51.f.a(java.lang.Boolean.valueOf(this.f106755e), java.lang.Boolean.valueOf(aj0Var.f106755e)) && n51.f.a(java.lang.Long.valueOf(this.f106756f), java.lang.Long.valueOf(aj0Var.f106756f)) && n51.f.a(java.lang.Integer.valueOf(this.f106757g), java.lang.Integer.valueOf(aj0Var.f106757g)) && n51.f.a(this.f106758h, aj0Var.f106758h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.aj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f106759i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f106754d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f106755e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f106756f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f106757g);
            }
            java.lang.String str = this.f106758h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f106754d) : 0;
            if (zArr[2]) {
                e17 += b36.f.a(2, this.f106755e);
            }
            if (zArr[3]) {
                e17 += b36.f.h(3, this.f106756f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f106757g);
            }
            java.lang.String str2 = this.f106758h;
            return (str2 == null || !zArr[5]) ? e17 : e17 + b36.f.j(5, str2);
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
            this.f106754d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f106755e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f106756f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f106757g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f106758h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
