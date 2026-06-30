package com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57;

/* loaded from: classes2.dex */
public class i extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.i f298324m = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.i();

    /* renamed from: d, reason: collision with root package name */
    public int f298325d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f298326e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f298327f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f298328g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f298329h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f298330i = new boolean[6];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.i)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.i iVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.i) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f298325d), java.lang.Integer.valueOf(iVar.f298325d)) && n51.f.a(java.lang.Boolean.valueOf(this.f298326e), java.lang.Boolean.valueOf(iVar.f298326e)) && n51.f.a(java.lang.Boolean.valueOf(this.f298327f), java.lang.Boolean.valueOf(iVar.f298327f)) && n51.f.a(java.lang.Boolean.valueOf(this.f298328g), java.lang.Boolean.valueOf(iVar.f298328g)) && n51.f.a(java.lang.Boolean.valueOf(this.f298329h), java.lang.Boolean.valueOf(iVar.f298329h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.i();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f298330i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f298325d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f298326e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f298327f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f298328g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f298329h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f298325d) : 0;
            if (zArr[2]) {
                e17 += b36.f.a(2, this.f298326e);
            }
            if (zArr[3]) {
                e17 += b36.f.a(3, this.f298327f);
            }
            if (zArr[4]) {
                e17 += b36.f.a(4, this.f298328g);
            }
            return zArr[5] ? e17 + b36.f.a(5, this.f298329h) : e17;
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
            this.f298325d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f298326e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f298327f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f298328g = aVar2.c(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f298329h = aVar2.c(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.i) super.mo11468x92b714fd(bArr);
    }
}
