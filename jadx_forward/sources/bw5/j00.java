package bw5;

/* loaded from: classes2.dex */
public class j00 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ae f110284d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f110285e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f110286f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f110287g;

    /* renamed from: h, reason: collision with root package name */
    public int f110288h;

    /* renamed from: i, reason: collision with root package name */
    public int f110289i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.pj f110290m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f110291n = new boolean[8];

    static {
        new bw5.j00();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.j00 mo11468x92b714fd(byte[] bArr) {
        return (bw5.j00) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.j00)) {
            return false;
        }
        bw5.j00 j00Var = (bw5.j00) fVar;
        return n51.f.a(this.f110284d, j00Var.f110284d) && n51.f.a(this.f110285e, j00Var.f110285e) && n51.f.a(this.f110286f, j00Var.f110286f) && n51.f.a(this.f110287g, j00Var.f110287g) && n51.f.a(java.lang.Integer.valueOf(this.f110288h), java.lang.Integer.valueOf(j00Var.f110288h)) && n51.f.a(java.lang.Integer.valueOf(this.f110289i), java.lang.Integer.valueOf(j00Var.f110289i)) && n51.f.a(this.f110290m, j00Var.f110290m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.j00();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f110291n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ae aeVar = this.f110284d;
            if (aeVar != null && zArr[1]) {
                fVar.i(1, aeVar.mo75928xcd1e8d8());
                this.f110284d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f110285e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            java.lang.String str = this.f110286f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f110287g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f110288h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f110289i);
            }
            bw5.pj pjVar = this.f110290m;
            if (pjVar != null && zArr[7]) {
                fVar.i(7, pjVar.mo75928xcd1e8d8());
                this.f110290m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ae aeVar2 = this.f110284d;
            if (aeVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, aeVar2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f110285e;
            if (gVar2 != null && zArr[2]) {
                i18 += b36.f.b(2, gVar2);
            }
            java.lang.String str3 = this.f110286f;
            if (str3 != null && zArr[3]) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f110287g;
            if (str4 != null && zArr[4]) {
                i18 += b36.f.j(4, str4);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f110288h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f110289i);
            }
            bw5.pj pjVar2 = this.f110290m;
            return (pjVar2 == null || !zArr[7]) ? i18 : i18 + b36.f.i(7, pjVar2.mo75928xcd1e8d8());
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
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.ae aeVar3 = new bw5.ae();
                    if (bArr != null && bArr.length > 0) {
                        aeVar3.mo11468x92b714fd(bArr);
                    }
                    this.f110284d = aeVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f110285e = aVar2.d(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f110286f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f110287g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f110288h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f110289i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.pj pjVar3 = new bw5.pj();
                    if (bArr2 != null && bArr2.length > 0) {
                        pjVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f110290m = pjVar3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
