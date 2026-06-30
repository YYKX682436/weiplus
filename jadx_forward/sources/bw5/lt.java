package bw5;

/* loaded from: classes2.dex */
public class lt extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.nr f111490d;

    /* renamed from: e, reason: collision with root package name */
    public int f111491e;

    /* renamed from: f, reason: collision with root package name */
    public int f111492f;

    /* renamed from: g, reason: collision with root package name */
    public int f111493g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.or f111494h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f111495i = new boolean[6];

    static {
        new bw5.lt();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lt mo11468x92b714fd(byte[] bArr) {
        return (bw5.lt) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lt)) {
            return false;
        }
        bw5.lt ltVar = (bw5.lt) fVar;
        return n51.f.a(this.f111490d, ltVar.f111490d) && n51.f.a(java.lang.Integer.valueOf(this.f111491e), java.lang.Integer.valueOf(ltVar.f111491e)) && n51.f.a(java.lang.Integer.valueOf(this.f111492f), java.lang.Integer.valueOf(ltVar.f111492f)) && n51.f.a(java.lang.Integer.valueOf(this.f111493g), java.lang.Integer.valueOf(ltVar.f111493g)) && n51.f.a(this.f111494h, ltVar.f111494h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.lt();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f111495i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.nr nrVar = this.f111490d;
            if (nrVar != null && zArr[1]) {
                fVar.i(1, nrVar.mo75928xcd1e8d8());
                this.f111490d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f111491e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f111492f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f111493g);
            }
            bw5.or orVar = this.f111494h;
            if (orVar != null && zArr[5]) {
                fVar.i(5, orVar.mo75928xcd1e8d8());
                this.f111494h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.nr nrVar2 = this.f111490d;
            if (nrVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, nrVar2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f111491e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f111492f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f111493g);
            }
            bw5.or orVar2 = this.f111494h;
            return (orVar2 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, orVar2.mo75928xcd1e8d8());
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
                bw5.nr nrVar3 = new bw5.nr();
                if (bArr != null && bArr.length > 0) {
                    nrVar3.mo11468x92b714fd(bArr);
                }
                this.f111490d = nrVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f111491e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f111492f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f111493g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.or orVar3 = new bw5.or();
            if (bArr2 != null && bArr2.length > 0) {
                orVar3.mo11468x92b714fd(bArr2);
            }
            this.f111494h = orVar3;
        }
        zArr[5] = true;
        return 0;
    }
}
