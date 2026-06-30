package bw5;

/* loaded from: classes2.dex */
public class rk0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: h, reason: collision with root package name */
    public static final bw5.rk0 f114093h = new bw5.rk0();

    /* renamed from: d, reason: collision with root package name */
    public long f114094d;

    /* renamed from: e, reason: collision with root package name */
    public int f114095e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.sk0 f114096f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f114097g = new boolean[4];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rk0)) {
            return false;
        }
        bw5.rk0 rk0Var = (bw5.rk0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f114094d), java.lang.Long.valueOf(rk0Var.f114094d)) && n51.f.a(java.lang.Integer.valueOf(this.f114095e), java.lang.Integer.valueOf(rk0Var.f114095e)) && n51.f.a(this.f114096f, rk0Var.f114096f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.rk0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114097g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f114094d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f114095e);
            }
            bw5.sk0 sk0Var = this.f114096f;
            if (sk0Var != null && zArr[3]) {
                fVar.i(3, sk0Var.mo75928xcd1e8d8());
                this.f114096f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f114094d) : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f114095e);
            }
            bw5.sk0 sk0Var2 = this.f114096f;
            return (sk0Var2 == null || !zArr[3]) ? h17 : h17 + b36.f.i(3, sk0Var2.mo75928xcd1e8d8());
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
            this.f114094d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f114095e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.sk0 sk0Var3 = new bw5.sk0();
            if (bArr != null && bArr.length > 0) {
                sk0Var3.mo11468x92b714fd(bArr);
            }
            this.f114096f = sk0Var3;
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.rk0) super.mo11468x92b714fd(bArr);
    }
}
