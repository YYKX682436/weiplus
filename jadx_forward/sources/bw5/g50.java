package bw5;

/* loaded from: classes2.dex */
public class g50 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f109224d;

    /* renamed from: e, reason: collision with root package name */
    public long f109225e;

    /* renamed from: f, reason: collision with root package name */
    public int f109226f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f109227g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f109228h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f109229i = new boolean[6];

    static {
        new bw5.g50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.g50 mo11468x92b714fd(byte[] bArr) {
        return (bw5.g50) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.g50)) {
            return false;
        }
        bw5.g50 g50Var = (bw5.g50) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f109224d), java.lang.Boolean.valueOf(g50Var.f109224d)) && n51.f.a(java.lang.Long.valueOf(this.f109225e), java.lang.Long.valueOf(g50Var.f109225e)) && n51.f.a(java.lang.Integer.valueOf(this.f109226f), java.lang.Integer.valueOf(g50Var.f109226f)) && n51.f.a(this.f109227g, g50Var.f109227g) && n51.f.a(java.lang.Boolean.valueOf(this.f109228h), java.lang.Boolean.valueOf(g50Var.f109228h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.g50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109229i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f109224d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f109225e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f109226f);
            }
            java.lang.String str = this.f109227g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.a(5, this.f109228h);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f109224d) : 0;
            if (zArr[2]) {
                a17 += b36.f.h(2, this.f109225e);
            }
            if (zArr[3]) {
                a17 += b36.f.e(3, this.f109226f);
            }
            java.lang.String str2 = this.f109227g;
            if (str2 != null && zArr[4]) {
                a17 += b36.f.j(4, str2);
            }
            return zArr[5] ? a17 + b36.f.a(5, this.f109228h) : a17;
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
            this.f109224d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f109225e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f109226f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f109227g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f109228h = aVar2.c(intValue);
        zArr[5] = true;
        return 0;
    }
}
