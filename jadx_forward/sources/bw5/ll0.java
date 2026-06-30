package bw5;

/* loaded from: classes4.dex */
public class ll0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: h, reason: collision with root package name */
    public static final bw5.ll0 f111379h = new bw5.ll0();

    /* renamed from: d, reason: collision with root package name */
    public int f111380d;

    /* renamed from: e, reason: collision with root package name */
    public int f111381e;

    /* renamed from: f, reason: collision with root package name */
    public int f111382f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f111383g = new boolean[4];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ll0)) {
            return false;
        }
        bw5.ll0 ll0Var = (bw5.ll0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f111380d), java.lang.Integer.valueOf(ll0Var.f111380d)) && n51.f.a(java.lang.Integer.valueOf(this.f111381e), java.lang.Integer.valueOf(ll0Var.f111381e)) && n51.f.a(java.lang.Integer.valueOf(this.f111382f), java.lang.Integer.valueOf(ll0Var.f111382f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ll0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f111383g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f111380d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f111381e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f111382f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f111380d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f111381e);
            }
            return zArr[3] ? e17 + b36.f.e(3, this.f111382f) : e17;
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
            this.f111380d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f111381e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f111382f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.ll0) super.mo11468x92b714fd(bArr);
    }
}
