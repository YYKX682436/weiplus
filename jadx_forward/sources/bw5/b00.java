package bw5;

/* loaded from: classes2.dex */
public class b00 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107004d;

    /* renamed from: e, reason: collision with root package name */
    public long f107005e;

    /* renamed from: f, reason: collision with root package name */
    public long f107006f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f107007g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f107008h = new boolean[5];

    static {
        new bw5.b00();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.b00 mo11468x92b714fd(byte[] bArr) {
        return (bw5.b00) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.b00)) {
            return false;
        }
        bw5.b00 b00Var = (bw5.b00) fVar;
        return n51.f.a(this.f107004d, b00Var.f107004d) && n51.f.a(java.lang.Long.valueOf(this.f107005e), java.lang.Long.valueOf(b00Var.f107005e)) && n51.f.a(java.lang.Long.valueOf(this.f107006f), java.lang.Long.valueOf(b00Var.f107006f)) && n51.f.a(java.lang.Boolean.valueOf(this.f107007g), java.lang.Boolean.valueOf(b00Var.f107007g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.b00();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f107008h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107004d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f107005e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f107006f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f107007g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f107004d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f107005e);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f107006f);
            }
            return zArr[4] ? i18 + b36.f.a(4, this.f107007g) : i18;
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
            this.f107004d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f107005e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f107006f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f107007g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }
}
