package bw5;

/* loaded from: classes9.dex */
public class p8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f113020d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f113021e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f113022f;

    /* renamed from: g, reason: collision with root package name */
    public long f113023g;

    /* renamed from: h, reason: collision with root package name */
    public long f113024h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f113025i = new boolean[6];

    static {
        new bw5.p8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.p8)) {
            return false;
        }
        bw5.p8 p8Var = (bw5.p8) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f113020d), java.lang.Boolean.valueOf(p8Var.f113020d)) && n51.f.a(java.lang.Boolean.valueOf(this.f113021e), java.lang.Boolean.valueOf(p8Var.f113021e)) && n51.f.a(java.lang.Boolean.valueOf(this.f113022f), java.lang.Boolean.valueOf(p8Var.f113022f)) && n51.f.a(java.lang.Long.valueOf(this.f113023g), java.lang.Long.valueOf(p8Var.f113023g)) && n51.f.a(java.lang.Long.valueOf(this.f113024h), java.lang.Long.valueOf(p8Var.f113024h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.p8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113025i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f113020d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f113021e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f113022f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f113023g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f113024h);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f113020d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f113021e);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f113022f);
            }
            if (zArr[4]) {
                a17 += b36.f.h(4, this.f113023g);
            }
            return zArr[5] ? a17 + b36.f.h(5, this.f113024h) : a17;
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
            this.f113020d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f113021e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f113022f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f113023g = aVar2.i(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f113024h = aVar2.i(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.p8) super.mo11468x92b714fd(bArr);
    }
}
