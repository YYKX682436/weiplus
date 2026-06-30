package bw5;

/* loaded from: classes2.dex */
public class xg0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f116638d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f116639e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f116640f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f116641g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f116642h;

    /* renamed from: i, reason: collision with root package name */
    public long f116643i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f116644m = new boolean[7];

    static {
        new bw5.xg0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.xg0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.xg0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xg0)) {
            return false;
        }
        bw5.xg0 xg0Var = (bw5.xg0) fVar;
        return n51.f.a(this.f116638d, xg0Var.f116638d) && n51.f.a(this.f116639e, xg0Var.f116639e) && n51.f.a(this.f116640f, xg0Var.f116640f) && n51.f.a(this.f116641g, xg0Var.f116641g) && n51.f.a(this.f116642h, xg0Var.f116642h) && n51.f.a(java.lang.Long.valueOf(this.f116643i), java.lang.Long.valueOf(xg0Var.f116643i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.xg0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f116644m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f116638d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f116639e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f116640f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f116641g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f116642h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.h(6, this.f116643i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f116638d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f116639e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f116640f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f116641g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f116642h;
            if (str10 != null && zArr[5]) {
                i18 += b36.f.j(5, str10);
            }
            return zArr[6] ? i18 + b36.f.h(6, this.f116643i) : i18;
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
                this.f116638d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f116639e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f116640f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f116641g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f116642h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f116643i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
