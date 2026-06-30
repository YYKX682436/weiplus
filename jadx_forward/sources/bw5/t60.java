package bw5;

/* loaded from: classes2.dex */
public class t60 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f114806d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f114807e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f114808f;

    /* renamed from: g, reason: collision with root package name */
    public int f114809g;

    /* renamed from: h, reason: collision with root package name */
    public int f114810h;

    /* renamed from: i, reason: collision with root package name */
    public int f114811i;

    /* renamed from: n, reason: collision with root package name */
    public boolean f114813n;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f114812m = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f114814o = new boolean[9];

    static {
        new bw5.t60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.t60 mo11468x92b714fd(byte[] bArr) {
        return (bw5.t60) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.t60)) {
            return false;
        }
        bw5.t60 t60Var = (bw5.t60) fVar;
        return n51.f.a(this.f114806d, t60Var.f114806d) && n51.f.a(this.f114807e, t60Var.f114807e) && n51.f.a(this.f114808f, t60Var.f114808f) && n51.f.a(java.lang.Integer.valueOf(this.f114809g), java.lang.Integer.valueOf(t60Var.f114809g)) && n51.f.a(java.lang.Integer.valueOf(this.f114810h), java.lang.Integer.valueOf(t60Var.f114810h)) && n51.f.a(java.lang.Integer.valueOf(this.f114811i), java.lang.Integer.valueOf(t60Var.f114811i)) && n51.f.a(this.f114812m, t60Var.f114812m) && n51.f.a(java.lang.Boolean.valueOf(this.f114813n), java.lang.Boolean.valueOf(t60Var.f114813n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.t60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f114812m;
        int i18 = 0;
        boolean[] zArr = this.f114814o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f114806d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f114807e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f114808f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f114809g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f114810h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f114811i);
            }
            fVar.g(7, 2, linkedList);
            if (zArr[8]) {
                fVar.a(8, this.f114813n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f114806d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f114807e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f114808f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f114809g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f114810h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f114811i);
            }
            int g17 = i18 + b36.f.g(7, 2, linkedList);
            return zArr[8] ? g17 + b36.f.a(8, this.f114813n) : g17;
        }
        if (i17 == 2) {
            linkedList.clear();
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
                this.f114806d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f114807e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f114808f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f114809g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f114810h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f114811i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[7] = true;
                return 0;
            case 8:
                this.f114813n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
