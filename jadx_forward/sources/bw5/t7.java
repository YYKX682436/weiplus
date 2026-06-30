package bw5;

/* loaded from: classes8.dex */
public class t7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f114815d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f114816e;

    /* renamed from: f, reason: collision with root package name */
    public double f114817f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f114818g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f114819h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f114820i = new boolean[6];

    static {
        new bw5.t7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.t7 mo11468x92b714fd(byte[] bArr) {
        return (bw5.t7) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.t7)) {
            return false;
        }
        bw5.t7 t7Var = (bw5.t7) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f114815d), java.lang.Boolean.valueOf(t7Var.f114815d)) && n51.f.a(java.lang.Boolean.valueOf(this.f114816e), java.lang.Boolean.valueOf(t7Var.f114816e)) && n51.f.a(java.lang.Double.valueOf(this.f114817f), java.lang.Double.valueOf(t7Var.f114817f)) && n51.f.a(java.lang.Boolean.valueOf(this.f114818g), java.lang.Boolean.valueOf(t7Var.f114818g)) && n51.f.a(java.lang.Boolean.valueOf(this.f114819h), java.lang.Boolean.valueOf(t7Var.f114819h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.t7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114820i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f114815d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f114816e);
            }
            if (zArr[3]) {
                fVar.c(3, this.f114817f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f114818g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f114819h);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f114815d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f114816e);
            }
            if (zArr[3]) {
                a17 += b36.f.c(3, this.f114817f);
            }
            if (zArr[4]) {
                a17 += b36.f.a(4, this.f114818g);
            }
            return zArr[5] ? a17 + b36.f.a(5, this.f114819h) : a17;
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
            this.f114815d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f114816e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f114817f = aVar2.e(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f114818g = aVar2.c(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f114819h = aVar2.c(intValue);
        zArr[5] = true;
        return 0;
    }
}
