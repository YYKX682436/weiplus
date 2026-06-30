package bw5;

/* loaded from: classes2.dex */
public class ky extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ev f111107d;

    /* renamed from: e, reason: collision with root package name */
    public long f111108e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f111109f;

    /* renamed from: g, reason: collision with root package name */
    public int f111110g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f111111h = new boolean[5];

    static {
        new bw5.ky();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ky mo11468x92b714fd(byte[] bArr) {
        return (bw5.ky) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ky)) {
            return false;
        }
        bw5.ky kyVar = (bw5.ky) fVar;
        return n51.f.a(this.f111107d, kyVar.f111107d) && n51.f.a(java.lang.Long.valueOf(this.f111108e), java.lang.Long.valueOf(kyVar.f111108e)) && n51.f.a(this.f111109f, kyVar.f111109f) && n51.f.a(java.lang.Integer.valueOf(this.f111110g), java.lang.Integer.valueOf(kyVar.f111110g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ky();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f111111h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ev evVar = this.f111107d;
            if (evVar != null && zArr[1]) {
                fVar.i(1, evVar.mo75928xcd1e8d8());
                this.f111107d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.h(2, this.f111108e);
            }
            java.lang.String str = this.f111109f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.e(4, this.f111110g);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ev evVar2 = this.f111107d;
            if (evVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, evVar2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f111108e);
            }
            java.lang.String str2 = this.f111109f;
            if (str2 != null && zArr[3]) {
                i18 += b36.f.j(3, str2);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f111110g) : i18;
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f111108e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f111109f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f111110g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.ev evVar3 = new bw5.ev();
            if (bArr != null && bArr.length > 0) {
                evVar3.mo11468x92b714fd(bArr);
            }
            this.f111107d = evVar3;
        }
        zArr[1] = true;
        return 0;
    }
}
