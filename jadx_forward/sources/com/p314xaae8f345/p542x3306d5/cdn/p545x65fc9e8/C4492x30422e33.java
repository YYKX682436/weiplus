package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.FileUrl */
/* loaded from: classes8.dex */
public class C4492x30422e33 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 f18807xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33();

    /* renamed from: filetype */
    private int f18808xd43766b6;

    /* renamed from: hasSetFields */
    private final boolean[] f18809xcb94b041 = new boolean[4];

    /* renamed from: href */
    private java.lang.String f18810x30ff2b;

    /* renamed from: thumb_href */
    private java.lang.String f18811x99abbbf4;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 m38936xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 m38937x7c90cfc0() {
        return f18807xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 m38938x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 m38939x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 c4492x30422e33 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f18808xd43766b6), java.lang.Integer.valueOf(c4492x30422e33.f18808xd43766b6)) && n51.f.a(this.f18810x30ff2b, c4492x30422e33.f18810x30ff2b) && n51.f.a(this.f18811x99abbbf4, c4492x30422e33.f18811x99abbbf4);
    }

    /* renamed from: getFiletype */
    public int m38940x5011a42c() {
        return this.f18808xd43766b6;
    }

    /* renamed from: getHref */
    public java.lang.String m38941xfb8067a1() {
        return this.f18809xcb94b041[2] ? this.f18810x30ff2b : "";
    }

    /* renamed from: getThumbHref */
    public java.lang.String m38942x4eaabb6b() {
        return this.f18809xcb94b041[3] ? this.f18811x99abbbf4 : "";
    }

    /* renamed from: hasFieldNumber */
    public boolean m38943x6e095e9(int i17) {
        return this.f18809xcb94b041[i17];
    }

    /* renamed from: hasFiletype */
    public boolean m38944x7f8c2370() {
        return m38943x6e095e9(1);
    }

    /* renamed from: hasHref */
    public boolean m38945x298528e5() {
        return m38943x6e095e9(2);
    }

    /* renamed from: hasThumbHref */
    public boolean m38946xe8024a7() {
        return m38943x6e095e9(3);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 m38947x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18809xcb94b041[1]) {
                fVar.e(1, this.f18808xd43766b6);
            }
            java.lang.String str = this.f18810x30ff2b;
            if (str != null && this.f18809xcb94b041[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f18811x99abbbf4;
            if (str2 != null && this.f18809xcb94b041[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f18809xcb94b041[1] ? 0 + b36.f.e(1, this.f18808xd43766b6) : 0;
            java.lang.String str3 = this.f18810x30ff2b;
            if (str3 != null && this.f18809xcb94b041[2]) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f18811x99abbbf4;
            return (str4 == null || !this.f18809xcb94b041[3]) ? e17 : e17 + b36.f.j(3, str4);
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
            this.f18808xd43766b6 = aVar2.g(intValue);
            this.f18809xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f18810x30ff2b = aVar2.k(intValue);
            this.f18809xcb94b041[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f18811x99abbbf4 = aVar2.k(intValue);
        this.f18809xcb94b041[3] = true;
        return 0;
    }

    /* renamed from: setFiletype */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 m38949x4aca0538(int i17) {
        this.f18808xd43766b6 = i17;
        this.f18809xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setHref */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 m38950x764b2ead(java.lang.String str) {
        this.f18810x30ff2b = str;
        this.f18809xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setThumbHref */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 m38951xaafe7bdf(java.lang.String str) {
        this.f18811x99abbbf4 = str;
        this.f18809xcb94b041[3] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 m38948x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33) super.mo11468x92b714fd(bArr);
    }
}
