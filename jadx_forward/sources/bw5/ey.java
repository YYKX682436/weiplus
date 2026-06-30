package bw5;

/* loaded from: classes8.dex */
public class ey extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.cy f108626d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ay f108627e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f108628f = new boolean[3];

    static {
        new bw5.ey();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ey mo11468x92b714fd(byte[] bArr) {
        return (bw5.ey) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ey)) {
            return false;
        }
        bw5.ey eyVar = (bw5.ey) fVar;
        return n51.f.a(this.f108626d, eyVar.f108626d) && n51.f.a(this.f108627e, eyVar.f108627e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ey();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f108628f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.cy cyVar = this.f108626d;
            if (cyVar != null && zArr[1]) {
                fVar.i(1, cyVar.mo75928xcd1e8d8());
                this.f108626d.mo75956x3d5d1f78(fVar);
            }
            bw5.ay ayVar = this.f108627e;
            if (ayVar != null && zArr[2]) {
                fVar.i(2, ayVar.mo75928xcd1e8d8());
                this.f108627e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.cy cyVar2 = this.f108626d;
            if (cyVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, cyVar2.mo75928xcd1e8d8());
            }
            bw5.ay ayVar2 = this.f108627e;
            return (ayVar2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, ayVar2.mo75928xcd1e8d8());
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
                bw5.cy cyVar3 = new bw5.cy();
                if (bArr != null && bArr.length > 0) {
                    cyVar3.mo11468x92b714fd(bArr);
                }
                this.f108626d = cyVar3;
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
            bw5.ay ayVar3 = new bw5.ay();
            if (bArr2 != null && bArr2.length > 0) {
                ayVar3.mo11468x92b714fd(bArr2);
            }
            this.f108627e = ayVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
