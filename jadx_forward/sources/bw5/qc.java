package bw5;

/* loaded from: classes2.dex */
public class qc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f113570d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.xg f113571e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f113572f = new boolean[3];

    static {
        new bw5.qc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qc mo11468x92b714fd(byte[] bArr) {
        return (bw5.qc) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qc)) {
            return false;
        }
        bw5.qc qcVar = (bw5.qc) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f113570d), java.lang.Integer.valueOf(qcVar.f113570d)) && n51.f.a(this.f113571e, qcVar.f113571e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.qc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113572f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f113570d);
            }
            bw5.xg xgVar = this.f113571e;
            if (xgVar != null && zArr[2]) {
                fVar.i(2, xgVar.mo75928xcd1e8d8());
                this.f113571e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f113570d) : 0;
            bw5.xg xgVar2 = this.f113571e;
            return (xgVar2 == null || !zArr[2]) ? e17 : e17 + b36.f.i(2, xgVar2.mo75928xcd1e8d8());
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
            this.f113570d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.xg xgVar3 = new bw5.xg();
            if (bArr != null && bArr.length > 0) {
                xgVar3.mo11468x92b714fd(bArr);
            }
            this.f113571e = xgVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
