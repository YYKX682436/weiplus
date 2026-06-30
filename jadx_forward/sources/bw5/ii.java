package bw5;

/* loaded from: classes2.dex */
public class ii extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f110124d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f110125e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f110126f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f110127g;

    /* renamed from: h, reason: collision with root package name */
    public int f110128h;

    /* renamed from: i, reason: collision with root package name */
    public int f110129i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f110130m = new boolean[7];

    static {
        new bw5.ii();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ii mo11468x92b714fd(byte[] bArr) {
        return (bw5.ii) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ii)) {
            return false;
        }
        bw5.ii iiVar = (bw5.ii) fVar;
        return n51.f.a(this.f110124d, iiVar.f110124d) && n51.f.a(this.f110125e, iiVar.f110125e) && n51.f.a(this.f110126f, iiVar.f110126f) && n51.f.a(this.f110127g, iiVar.f110127g) && n51.f.a(java.lang.Integer.valueOf(this.f110128h), java.lang.Integer.valueOf(iiVar.f110128h)) && n51.f.a(java.lang.Integer.valueOf(this.f110129i), java.lang.Integer.valueOf(iiVar.f110129i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ii();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f110130m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f110124d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f110125e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f110126f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f110127g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.e(5, this.f110128h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f110129i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f110124d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f110125e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f110126f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f110127g;
            if (str8 != null && zArr[4]) {
                i18 += b36.f.j(4, str8);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f110128h);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f110129i) : i18;
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
                this.f110124d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f110125e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f110126f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f110127g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f110128h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f110129i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
