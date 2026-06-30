package bw5;

/* loaded from: classes2.dex */
public class xo extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.rn f116742d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ae f116743e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f116744f = new boolean[3];

    static {
        new bw5.xo();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.xo mo11468x92b714fd(byte[] bArr) {
        return (bw5.xo) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xo)) {
            return false;
        }
        bw5.xo xoVar = (bw5.xo) fVar;
        return n51.f.a(this.f116742d, xoVar.f116742d) && n51.f.a(this.f116743e, xoVar.f116743e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.xo();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116744f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.rn rnVar = this.f116742d;
            if (rnVar != null && zArr[1]) {
                fVar.i(1, rnVar.mo75928xcd1e8d8());
                this.f116742d.mo75956x3d5d1f78(fVar);
            }
            bw5.ae aeVar = this.f116743e;
            if (aeVar != null && zArr[2]) {
                fVar.i(2, aeVar.mo75928xcd1e8d8());
                this.f116743e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.rn rnVar2 = this.f116742d;
            if (rnVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, rnVar2.mo75928xcd1e8d8());
            }
            bw5.ae aeVar2 = this.f116743e;
            return (aeVar2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, aeVar2.mo75928xcd1e8d8());
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
                bw5.rn rnVar3 = new bw5.rn();
                if (bArr != null && bArr.length > 0) {
                    rnVar3.mo11468x92b714fd(bArr);
                }
                this.f116742d = rnVar3;
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
            bw5.ae aeVar3 = new bw5.ae();
            if (bArr2 != null && bArr2.length > 0) {
                aeVar3.mo11468x92b714fd(bArr2);
            }
            this.f116743e = aeVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
