package bw5;

/* loaded from: classes9.dex */
public class yc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f116964d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f116965e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f116966f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f116967g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f116968h = new boolean[5];

    static {
        new bw5.yc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yc mo11468x92b714fd(byte[] bArr) {
        return (bw5.yc) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yc)) {
            return false;
        }
        bw5.yc ycVar = (bw5.yc) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f116964d), java.lang.Boolean.valueOf(ycVar.f116964d)) && n51.f.a(java.lang.Boolean.valueOf(this.f116965e), java.lang.Boolean.valueOf(ycVar.f116965e)) && n51.f.a(java.lang.Boolean.valueOf(this.f116966f), java.lang.Boolean.valueOf(ycVar.f116966f)) && n51.f.a(java.lang.Boolean.valueOf(this.f116967g), java.lang.Boolean.valueOf(ycVar.f116967g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.yc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116968h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f116964d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f116965e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f116966f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f116967g);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f116964d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f116965e);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f116966f);
            }
            return zArr[4] ? a17 + b36.f.a(4, this.f116967g) : a17;
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
            this.f116964d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f116965e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f116966f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f116967g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }
}
