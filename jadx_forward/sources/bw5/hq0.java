package bw5;

/* loaded from: classes8.dex */
public class hq0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f109859d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f109860e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f109861f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f109862g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f109863h = new boolean[5];

    static {
        new bw5.hq0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hq0)) {
            return false;
        }
        bw5.hq0 hq0Var = (bw5.hq0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f109859d), java.lang.Boolean.valueOf(hq0Var.f109859d)) && n51.f.a(java.lang.Boolean.valueOf(this.f109860e), java.lang.Boolean.valueOf(hq0Var.f109860e)) && n51.f.a(java.lang.Boolean.valueOf(this.f109861f), java.lang.Boolean.valueOf(hq0Var.f109861f)) && n51.f.a(java.lang.Boolean.valueOf(this.f109862g), java.lang.Boolean.valueOf(hq0Var.f109862g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.hq0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109863h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f109859d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f109860e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f109861f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f109862g);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f109859d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f109860e);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f109861f);
            }
            return zArr[4] ? a17 + b36.f.a(4, this.f109862g) : a17;
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
            this.f109859d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f109860e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f109861f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f109862g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.hq0) super.mo11468x92b714fd(bArr);
    }
}
