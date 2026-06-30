package bw5;

/* loaded from: classes7.dex */
public class as0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.wd0 f106958d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ge0 f106959e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f106960f = new boolean[3];

    static {
        new bw5.as0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.as0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.as0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.as0)) {
            return false;
        }
        bw5.as0 as0Var = (bw5.as0) fVar;
        return n51.f.a(this.f106958d, as0Var.f106958d) && n51.f.a(this.f106959e, as0Var.f106959e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.as0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f106960f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.wd0 wd0Var = this.f106958d;
            if (wd0Var != null && zArr[1]) {
                fVar.i(1, wd0Var.mo75928xcd1e8d8());
                this.f106958d.mo75956x3d5d1f78(fVar);
            }
            bw5.ge0 ge0Var = this.f106959e;
            if (ge0Var != null && zArr[2]) {
                fVar.i(2, ge0Var.mo75928xcd1e8d8());
                this.f106959e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.wd0 wd0Var2 = this.f106958d;
            if (wd0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, wd0Var2.mo75928xcd1e8d8());
            }
            bw5.ge0 ge0Var2 = this.f106959e;
            return (ge0Var2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, ge0Var2.mo75928xcd1e8d8());
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.wd0 wd0Var3 = new bw5.wd0();
                if (bArr != null && bArr.length > 0) {
                    wd0Var3.mo11468x92b714fd(bArr);
                }
                this.f106958d = wd0Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.ge0 ge0Var3 = new bw5.ge0();
            if (bArr2 != null && bArr2.length > 0) {
                ge0Var3.mo11468x92b714fd(bArr2);
            }
            this.f106959e = ge0Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
