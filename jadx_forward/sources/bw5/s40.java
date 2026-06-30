package bw5;

/* loaded from: classes2.dex */
public class s40 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f114323d;

    /* renamed from: e, reason: collision with root package name */
    public int f114324e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.r40 f114325f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.q40 f114326g;

    /* renamed from: h, reason: collision with root package name */
    public int f114327h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.p40 f114328i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f114329m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f114330n = new boolean[10];

    static {
        new bw5.s40();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.s40 mo11468x92b714fd(byte[] bArr) {
        return (bw5.s40) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s40)) {
            return false;
        }
        bw5.s40 s40Var = (bw5.s40) fVar;
        return n51.f.a(this.f114323d, s40Var.f114323d) && n51.f.a(java.lang.Integer.valueOf(this.f114324e), java.lang.Integer.valueOf(s40Var.f114324e)) && n51.f.a(this.f114325f, s40Var.f114325f) && n51.f.a(this.f114326g, s40Var.f114326g) && n51.f.a(java.lang.Integer.valueOf(this.f114327h), java.lang.Integer.valueOf(s40Var.f114327h)) && n51.f.a(this.f114328i, s40Var.f114328i) && n51.f.a(this.f114329m, s40Var.f114329m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.s40();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f114330n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f114323d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f114324e);
            }
            bw5.r40 r40Var = this.f114325f;
            if (r40Var != null && zArr[5]) {
                fVar.i(5, r40Var.mo75928xcd1e8d8());
                this.f114325f.mo75956x3d5d1f78(fVar);
            }
            bw5.q40 q40Var = this.f114326g;
            if (q40Var != null && zArr[6]) {
                fVar.i(6, q40Var.mo75928xcd1e8d8());
                this.f114326g.mo75956x3d5d1f78(fVar);
            }
            if (zArr[7]) {
                fVar.e(7, this.f114327h);
            }
            bw5.p40 p40Var = this.f114328i;
            if (p40Var != null && zArr[8]) {
                fVar.i(8, p40Var.mo75928xcd1e8d8());
                this.f114328i.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f114329m;
            if (gVar != null && zArr[9]) {
                fVar.b(9, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f114323d;
            if (str2 != null && zArr[2]) {
                i18 = 0 + b36.f.j(2, str2);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f114324e);
            }
            bw5.r40 r40Var2 = this.f114325f;
            if (r40Var2 != null && zArr[5]) {
                i18 += b36.f.i(5, r40Var2.mo75928xcd1e8d8());
            }
            bw5.q40 q40Var2 = this.f114326g;
            if (q40Var2 != null && zArr[6]) {
                i18 += b36.f.i(6, q40Var2.mo75928xcd1e8d8());
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f114327h);
            }
            bw5.p40 p40Var2 = this.f114328i;
            if (p40Var2 != null && zArr[8]) {
                i18 += b36.f.i(8, p40Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f114329m;
            return (gVar2 == null || !zArr[9]) ? i18 : i18 + b36.f.b(9, gVar2);
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
        switch (intValue) {
            case 2:
                this.f114323d = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f114324e = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
            default:
                return -1;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.r40 r40Var3 = new bw5.r40();
                    if (bArr != null && bArr.length > 0) {
                        r40Var3.mo11468x92b714fd(bArr);
                    }
                    this.f114325f = r40Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.q40 q40Var3 = new bw5.q40();
                    if (bArr2 != null && bArr2.length > 0) {
                        q40Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f114326g = q40Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f114327h = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.p40 p40Var3 = new bw5.p40();
                    if (bArr3 != null && bArr3.length > 0) {
                        p40Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f114328i = p40Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f114329m = aVar2.d(intValue);
                zArr[9] = true;
                return 0;
        }
    }
}
