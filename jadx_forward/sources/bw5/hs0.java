package bw5;

/* loaded from: classes14.dex */
public class hs0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.is0 f109875d;

    /* renamed from: e, reason: collision with root package name */
    public int f109876e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f109877f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f109878g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f109879h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f109880i = new boolean[6];

    static {
        new bw5.hs0();
    }

    public bw5.hs0 b(int i17) {
        this.f109876e = i17;
        this.f109880i[2] = true;
        return this;
    }

    public bw5.hs0 c(java.lang.String str) {
        this.f109877f = str;
        this.f109880i[3] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hs0)) {
            return false;
        }
        bw5.hs0 hs0Var = (bw5.hs0) fVar;
        return n51.f.a(this.f109875d, hs0Var.f109875d) && n51.f.a(java.lang.Integer.valueOf(this.f109876e), java.lang.Integer.valueOf(hs0Var.f109876e)) && n51.f.a(this.f109877f, hs0Var.f109877f) && n51.f.a(this.f109878g, hs0Var.f109878g) && n51.f.a(this.f109879h, hs0Var.f109879h);
    }

    public bw5.hs0 d(java.lang.String str) {
        this.f109878g = str;
        this.f109880i[4] = true;
        return this;
    }

    public bw5.hs0 e(bw5.is0 is0Var) {
        this.f109875d = is0Var;
        this.f109880i[1] = true;
        return this;
    }

    public bw5.hs0 f(java.lang.String str) {
        this.f109879h = str;
        this.f109880i[5] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.hs0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f109880i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.is0 is0Var = this.f109875d;
            if (is0Var != null && zArr[1]) {
                fVar.e(1, is0Var.f110234d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f109876e);
            }
            java.lang.String str = this.f109877f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f109878g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f109879h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.is0 is0Var2 = this.f109875d;
            if (is0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, is0Var2.f110234d);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f109876e);
            }
            java.lang.String str4 = this.f109877f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f109878g;
            if (str5 != null && zArr[4]) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f109879h;
            return (str6 == null || !zArr[5]) ? i18 : i18 + b36.f.j(5, str6);
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
            int g17 = aVar2.g(intValue);
            this.f109875d = g17 != 1 ? g17 != 2 ? null : bw5.is0.WIFI_DIRECT_OP_TYPE_CONNECT : bw5.is0.WIFI_DIRECT_OP_TYPE_CREATE;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f109876e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f109877f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f109878g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f109879h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.hs0) super.mo11468x92b714fd(bArr);
    }
}
