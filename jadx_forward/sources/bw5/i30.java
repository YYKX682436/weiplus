package bw5;

/* loaded from: classes2.dex */
public class i30 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f109982d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109983e;

    /* renamed from: f, reason: collision with root package name */
    public long f109984f;

    /* renamed from: g, reason: collision with root package name */
    public long f109985g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f109986h;

    /* renamed from: i, reason: collision with root package name */
    public int f109987i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f109988m = new boolean[7];

    static {
        new bw5.i30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.i30 mo11468x92b714fd(byte[] bArr) {
        return (bw5.i30) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.i30)) {
            return false;
        }
        bw5.i30 i30Var = (bw5.i30) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f109982d), java.lang.Boolean.valueOf(i30Var.f109982d)) && n51.f.a(this.f109983e, i30Var.f109983e) && n51.f.a(java.lang.Long.valueOf(this.f109984f), java.lang.Long.valueOf(i30Var.f109984f)) && n51.f.a(java.lang.Long.valueOf(this.f109985g), java.lang.Long.valueOf(i30Var.f109985g)) && n51.f.a(java.lang.Boolean.valueOf(this.f109986h), java.lang.Boolean.valueOf(i30Var.f109986h)) && n51.f.a(java.lang.Integer.valueOf(this.f109987i), java.lang.Integer.valueOf(i30Var.f109987i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.i30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109988m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f109982d);
            }
            java.lang.String str = this.f109983e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f109984f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f109985g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f109986h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f109987i);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f109982d) : 0;
            java.lang.String str2 = this.f109983e;
            if (str2 != null && zArr[2]) {
                a17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                a17 += b36.f.h(3, this.f109984f);
            }
            if (zArr[4]) {
                a17 += b36.f.h(4, this.f109985g);
            }
            if (zArr[5]) {
                a17 += b36.f.a(5, this.f109986h);
            }
            return zArr[6] ? a17 + b36.f.e(6, this.f109987i) : a17;
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
                this.f109982d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109983e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109984f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109985g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109986h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109987i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
