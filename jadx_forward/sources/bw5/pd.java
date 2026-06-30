package bw5;

/* loaded from: classes2.dex */
public class pd extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f113106d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113107e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113108f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.qd f113109g;

    /* renamed from: h, reason: collision with root package name */
    public int f113110h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f113111i = new boolean[7];

    static {
        new bw5.pd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pd mo11468x92b714fd(byte[] bArr) {
        return (bw5.pd) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pd)) {
            return false;
        }
        bw5.pd pdVar = (bw5.pd) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f113106d), java.lang.Integer.valueOf(pdVar.f113106d)) && n51.f.a(this.f113107e, pdVar.f113107e) && n51.f.a(this.f113108f, pdVar.f113108f) && n51.f.a(this.f113109g, pdVar.f113109g) && n51.f.a(java.lang.Integer.valueOf(this.f113110h), java.lang.Integer.valueOf(pdVar.f113110h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.pd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113111i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f113106d);
            }
            java.lang.String str = this.f113107e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f113108f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.qd qdVar = this.f113109g;
            if (qdVar != null && zArr[4]) {
                fVar.i(4, qdVar.mo75928xcd1e8d8());
                this.f113109g.mo75956x3d5d1f78(fVar);
            }
            if (zArr[6]) {
                fVar.e(6, this.f113110h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f113106d) : 0;
            java.lang.String str3 = this.f113107e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f113108f;
            if (str4 != null && zArr[3]) {
                e17 += b36.f.j(3, str4);
            }
            bw5.qd qdVar2 = this.f113109g;
            if (qdVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, qdVar2.mo75928xcd1e8d8());
            }
            return zArr[6] ? e17 + b36.f.e(6, this.f113110h) : e17;
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
            this.f113106d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f113107e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f113108f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 6) {
                return -1;
            }
            this.f113110h = aVar2.g(intValue);
            zArr[6] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.qd qdVar3 = new bw5.qd();
            if (bArr != null && bArr.length > 0) {
                qdVar3.mo11468x92b714fd(bArr);
            }
            this.f113109g = qdVar3;
        }
        zArr[4] = true;
        return 0;
    }
}
