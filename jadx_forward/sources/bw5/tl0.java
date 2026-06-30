package bw5;

/* loaded from: classes2.dex */
public class tl0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: h, reason: collision with root package name */
    public static final bw5.tl0 f115040h = new bw5.tl0();

    /* renamed from: d, reason: collision with root package name */
    public int f115041d;

    /* renamed from: e, reason: collision with root package name */
    public int f115042e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f115043f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f115044g = new boolean[4];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tl0)) {
            return false;
        }
        bw5.tl0 tl0Var = (bw5.tl0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f115041d), java.lang.Integer.valueOf(tl0Var.f115041d)) && n51.f.a(java.lang.Integer.valueOf(this.f115042e), java.lang.Integer.valueOf(tl0Var.f115042e)) && n51.f.a(this.f115043f, tl0Var.f115043f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.tl0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115044g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f115041d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f115042e);
            }
            java.lang.String str = this.f115043f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f115041d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f115042e);
            }
            java.lang.String str2 = this.f115043f;
            return (str2 == null || !zArr[3]) ? e17 : e17 + b36.f.j(3, str2);
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
            this.f115041d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f115042e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f115043f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.tl0) super.mo11468x92b714fd(bArr);
    }
}
