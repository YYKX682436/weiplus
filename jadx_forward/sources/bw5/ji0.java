package bw5;

/* loaded from: classes2.dex */
public class ji0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f110520d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f110521e;

    /* renamed from: f, reason: collision with root package name */
    public long f110522f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f110523g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f110524h = new boolean[5];

    static {
        new bw5.ji0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ji0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ji0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ji0)) {
            return false;
        }
        bw5.ji0 ji0Var = (bw5.ji0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f110520d), java.lang.Boolean.valueOf(ji0Var.f110520d)) && n51.f.a(java.lang.Boolean.valueOf(this.f110521e), java.lang.Boolean.valueOf(ji0Var.f110521e)) && n51.f.a(java.lang.Long.valueOf(this.f110522f), java.lang.Long.valueOf(ji0Var.f110522f)) && n51.f.a(this.f110523g, ji0Var.f110523g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ji0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f110524h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f110520d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f110521e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f110522f);
            }
            java.lang.String str = this.f110523g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f110520d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f110521e);
            }
            if (zArr[3]) {
                a17 += b36.f.h(3, this.f110522f);
            }
            java.lang.String str2 = this.f110523g;
            return (str2 == null || !zArr[4]) ? a17 : a17 + b36.f.j(4, str2);
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
            this.f110520d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f110521e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f110522f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f110523g = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }
}
