package bw5;

/* loaded from: classes2.dex */
public class dw extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ae f108163d;

    /* renamed from: e, reason: collision with root package name */
    public int f108164e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f108165f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.er f108166g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.yj f108167h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f108168i = new boolean[6];

    static {
        new bw5.dw();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dw mo11468x92b714fd(byte[] bArr) {
        return (bw5.dw) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dw)) {
            return false;
        }
        bw5.dw dwVar = (bw5.dw) fVar;
        return n51.f.a(this.f108163d, dwVar.f108163d) && n51.f.a(java.lang.Integer.valueOf(this.f108164e), java.lang.Integer.valueOf(dwVar.f108164e)) && n51.f.a(this.f108165f, dwVar.f108165f) && n51.f.a(this.f108166g, dwVar.f108166g) && n51.f.a(this.f108167h, dwVar.f108167h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.dw();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f108168i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ae aeVar = this.f108163d;
            if (aeVar != null && zArr[1]) {
                fVar.i(1, aeVar.mo75928xcd1e8d8());
                this.f108163d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f108164e);
            }
            java.lang.String str = this.f108165f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            bw5.er erVar = this.f108166g;
            if (erVar != null && zArr[4]) {
                fVar.i(4, erVar.mo75928xcd1e8d8());
                this.f108166g.mo75956x3d5d1f78(fVar);
            }
            bw5.yj yjVar = this.f108167h;
            if (yjVar != null && zArr[5]) {
                fVar.i(5, yjVar.mo75928xcd1e8d8());
                this.f108167h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ae aeVar2 = this.f108163d;
            if (aeVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, aeVar2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f108164e);
            }
            java.lang.String str2 = this.f108165f;
            if (str2 != null && zArr[3]) {
                i18 += b36.f.j(3, str2);
            }
            bw5.er erVar2 = this.f108166g;
            if (erVar2 != null && zArr[4]) {
                i18 += b36.f.i(4, erVar2.mo75928xcd1e8d8());
            }
            bw5.yj yjVar2 = this.f108167h;
            return (yjVar2 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, yjVar2.mo75928xcd1e8d8());
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
                bw5.ae aeVar3 = new bw5.ae();
                if (bArr != null && bArr.length > 0) {
                    aeVar3.mo11468x92b714fd(bArr);
                }
                this.f108163d = aeVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f108164e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f108165f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.er erVar3 = new bw5.er();
                if (bArr2 != null && bArr2.length > 0) {
                    erVar3.mo11468x92b714fd(bArr2);
                }
                this.f108166g = erVar3;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.yj yjVar3 = new bw5.yj();
            if (bArr3 != null && bArr3.length > 0) {
                yjVar3.mo11468x92b714fd(bArr3);
            }
            this.f108167h = yjVar3;
        }
        zArr[5] = true;
        return 0;
    }
}
