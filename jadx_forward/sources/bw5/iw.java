package bw5;

/* loaded from: classes2.dex */
public class iw extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f110246d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.sw f110247e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.pg f110248f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f110249g = new boolean[4];

    static {
        new bw5.iw();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.iw mo11468x92b714fd(byte[] bArr) {
        return (bw5.iw) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.iw)) {
            return false;
        }
        bw5.iw iwVar = (bw5.iw) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f110246d), java.lang.Integer.valueOf(iwVar.f110246d)) && n51.f.a(this.f110247e, iwVar.f110247e) && n51.f.a(this.f110248f, iwVar.f110248f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.iw();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f110249g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f110246d);
            }
            bw5.sw swVar = this.f110247e;
            if (swVar != null && zArr[2]) {
                fVar.i(2, swVar.mo75928xcd1e8d8());
                this.f110247e.mo75956x3d5d1f78(fVar);
            }
            bw5.pg pgVar = this.f110248f;
            if (pgVar != null && zArr[3]) {
                fVar.i(3, pgVar.mo75928xcd1e8d8());
                this.f110248f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f110246d) : 0;
            bw5.sw swVar2 = this.f110247e;
            if (swVar2 != null && zArr[2]) {
                e17 += b36.f.i(2, swVar2.mo75928xcd1e8d8());
            }
            bw5.pg pgVar2 = this.f110248f;
            return (pgVar2 == null || !zArr[3]) ? e17 : e17 + b36.f.i(3, pgVar2.mo75928xcd1e8d8());
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
            this.f110246d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.sw swVar3 = new bw5.sw();
                if (bArr != null && bArr.length > 0) {
                    swVar3.mo11468x92b714fd(bArr);
                }
                this.f110247e = swVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.pg pgVar3 = new bw5.pg();
            if (bArr2 != null && bArr2.length > 0) {
                pgVar3.mo11468x92b714fd(bArr2);
            }
            this.f110248f = pgVar3;
        }
        zArr[3] = true;
        return 0;
    }
}
