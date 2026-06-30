package bw5;

/* loaded from: classes2.dex */
public class o1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112405d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f112406e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f112407f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f112408g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f112409h;

    /* renamed from: i, reason: collision with root package name */
    public int f112410i;

    /* renamed from: m, reason: collision with root package name */
    public int f112411m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f112412n = new boolean[8];

    static {
        new bw5.o1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.o1 mo11468x92b714fd(byte[] bArr) {
        return (bw5.o1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o1)) {
            return false;
        }
        bw5.o1 o1Var = (bw5.o1) fVar;
        return n51.f.a(this.f112405d, o1Var.f112405d) && n51.f.a(this.f112406e, o1Var.f112406e) && n51.f.a(this.f112407f, o1Var.f112407f) && n51.f.a(this.f112408g, o1Var.f112408g) && n51.f.a(this.f112409h, o1Var.f112409h) && n51.f.a(java.lang.Integer.valueOf(this.f112410i), java.lang.Integer.valueOf(o1Var.f112410i)) && n51.f.a(java.lang.Integer.valueOf(this.f112411m), java.lang.Integer.valueOf(o1Var.f112411m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.o1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f112412n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112405d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f112406e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f112407f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f112408g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f112409h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f112410i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f112411m);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f112405d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f112406e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f112407f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f112408g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f112409h;
            if (str10 != null && zArr[5]) {
                i18 += b36.f.j(5, str10);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f112410i);
            }
            return zArr[7] ? i18 + b36.f.e(7, this.f112411m) : i18;
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
                this.f112405d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112406e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112407f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112408g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112409h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112410i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f112411m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
