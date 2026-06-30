package bw5;

/* loaded from: classes4.dex */
public class tk0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f115030d;

    /* renamed from: e, reason: collision with root package name */
    public int f115031e;

    /* renamed from: f, reason: collision with root package name */
    public long f115032f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f115033g = new boolean[4];

    static {
        new bw5.tk0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tk0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.tk0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tk0)) {
            return false;
        }
        bw5.tk0 tk0Var = (bw5.tk0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f115030d), java.lang.Integer.valueOf(tk0Var.f115030d)) && n51.f.a(java.lang.Integer.valueOf(this.f115031e), java.lang.Integer.valueOf(tk0Var.f115031e)) && n51.f.a(java.lang.Long.valueOf(this.f115032f), java.lang.Long.valueOf(tk0Var.f115032f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.tk0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115033g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f115030d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f115031e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f115032f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f115030d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f115031e);
            }
            return zArr[3] ? e17 + b36.f.h(3, this.f115032f) : e17;
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
            this.f115030d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f115031e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f115032f = aVar2.i(intValue);
        zArr[3] = true;
        return 0;
    }
}
