package bw5;

/* loaded from: classes2.dex */
public class uc0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f115375d;

    /* renamed from: e, reason: collision with root package name */
    public float f115376e;

    /* renamed from: f, reason: collision with root package name */
    public float f115377f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f115378g = new boolean[4];

    static {
        new bw5.uc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.uc0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.uc0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.uc0)) {
            return false;
        }
        bw5.uc0 uc0Var = (bw5.uc0) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f115375d), java.lang.Float.valueOf(uc0Var.f115375d)) && n51.f.a(java.lang.Float.valueOf(this.f115376e), java.lang.Float.valueOf(uc0Var.f115376e)) && n51.f.a(java.lang.Float.valueOf(this.f115377f), java.lang.Float.valueOf(uc0Var.f115377f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.uc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115378g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f115375d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f115376e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f115377f);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f115375d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f115376e);
            }
            return zArr[3] ? d17 + b36.f.d(3, this.f115377f) : d17;
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
            this.f115375d = aVar2.f(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f115376e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f115377f = aVar2.f(intValue);
        zArr[3] = true;
        return 0;
    }
}
