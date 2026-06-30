package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.CloudCgiRequest */
/* loaded from: classes8.dex */
public class C27059xbcf84e3f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27059xbcf84e3f f58670xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27059xbcf84e3f();

    /* renamed from: cgi_type */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27060xa502518a f58671x2d5452b4;

    /* renamed from: cloud_taskid */
    private int f58672x7a319eaa;

    /* renamed from: hasSetFields */
    private final boolean[] f58673xcb94b041 = new boolean[6];

    /* renamed from: long_polling */
    private boolean f58674xe20aa500;

    /* renamed from: request_body */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f58675x4da64152;

    /* renamed from: timeout_ms */
    private int f58676x5f1f1d44;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27059xbcf84e3f m108934xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27059xbcf84e3f();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27059xbcf84e3f m108935x7c90cfc0() {
        return f58670xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27059xbcf84e3f m108936x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27059xbcf84e3f();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27059xbcf84e3f m108937x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27059xbcf84e3f)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27059xbcf84e3f c27059xbcf84e3f = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27059xbcf84e3f) fVar;
        return n51.f.a(this.f58671x2d5452b4, c27059xbcf84e3f.f58671x2d5452b4) && n51.f.a(java.lang.Integer.valueOf(this.f58672x7a319eaa), java.lang.Integer.valueOf(c27059xbcf84e3f.f58672x7a319eaa)) && n51.f.a(this.f58675x4da64152, c27059xbcf84e3f.f58675x4da64152) && n51.f.a(java.lang.Integer.valueOf(this.f58676x5f1f1d44), java.lang.Integer.valueOf(c27059xbcf84e3f.f58676x5f1f1d44)) && n51.f.a(java.lang.Boolean.valueOf(this.f58674xe20aa500), java.lang.Boolean.valueOf(c27059xbcf84e3f.f58674xe20aa500));
    }

    /* renamed from: getCgiType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27060xa502518a m108938x6888f529() {
        return this.f58673xcb94b041[1] ? this.f58671x2d5452b4 : com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27060xa502518a.kAuthRequest;
    }

    /* renamed from: getCloudTaskid */
    public int m108939x7fabcabf() {
        return this.f58672x7a319eaa;
    }

    /* renamed from: getLongPolling */
    public boolean m108940x62ab8871() {
        return this.f58674xe20aa500;
    }

    /* renamed from: getRequestBody */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m108941x1e5b079b() {
        return this.f58673xcb94b041[3] ? this.f58675x4da64152 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getTimeoutMs */
    public int m108942x27ef431() {
        return this.f58676x5f1f1d44;
    }

    /* renamed from: hasCgiType */
    public boolean m108943xa3df7d65() {
        return m108945x6e095e9(1);
    }

    /* renamed from: hasCloudTaskid */
    public boolean m108944x9fcbd4fb() {
        return m108945x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m108945x6e095e9(int i17) {
        return this.f58673xcb94b041[i17];
    }

    /* renamed from: hasLongPolling */
    public boolean m108946x82cb92ad() {
        return m108945x6e095e9(5);
    }

    /* renamed from: hasRequestBody */
    public boolean m108947x3e7b11d7() {
        return m108945x6e095e9(3);
    }

    /* renamed from: hasTimeoutMs */
    public boolean m108948xc2545d6d() {
        return m108945x6e095e9(4);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27059xbcf84e3f m108949x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27059xbcf84e3f();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27060xa502518a enumC27060xa502518a = this.f58671x2d5452b4;
            if (enumC27060xa502518a != null && this.f58673xcb94b041[1]) {
                fVar.e(1, enumC27060xa502518a.f58682x6ac9171);
            }
            if (this.f58673xcb94b041[2]) {
                fVar.e(2, this.f58672x7a319eaa);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f58675x4da64152;
            if (gVar != null && this.f58673xcb94b041[3]) {
                fVar.b(3, gVar);
            }
            if (this.f58673xcb94b041[4]) {
                fVar.e(4, this.f58676x5f1f1d44);
            }
            if (this.f58673xcb94b041[5]) {
                fVar.a(5, this.f58674xe20aa500);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27060xa502518a enumC27060xa502518a2 = this.f58671x2d5452b4;
            if (enumC27060xa502518a2 != null && this.f58673xcb94b041[1]) {
                i18 = 0 + b36.f.e(1, enumC27060xa502518a2.f58682x6ac9171);
            }
            if (this.f58673xcb94b041[2]) {
                i18 += b36.f.e(2, this.f58672x7a319eaa);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f58675x4da64152;
            if (gVar2 != null && this.f58673xcb94b041[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            if (this.f58673xcb94b041[4]) {
                i18 += b36.f.e(4, this.f58676x5f1f1d44);
            }
            return this.f58673xcb94b041[5] ? i18 + b36.f.a(5, this.f58674xe20aa500) : i18;
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
            this.f58671x2d5452b4 = com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27060xa502518a.m108958x382ad972(aVar2.g(intValue));
            this.f58673xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f58672x7a319eaa = aVar2.g(intValue);
            this.f58673xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f58675x4da64152 = aVar2.d(intValue);
            this.f58673xcb94b041[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f58676x5f1f1d44 = aVar2.g(intValue);
            this.f58673xcb94b041[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f58674xe20aa500 = aVar2.c(intValue);
        this.f58673xcb94b041[5] = true;
        return 0;
    }

    /* renamed from: setCgiType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27059xbcf84e3f m108951xdbfa429d(com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27060xa502518a enumC27060xa502518a) {
        this.f58671x2d5452b4 = enumC27060xa502518a;
        this.f58673xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setCloudTaskid */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27059xbcf84e3f m108952x16113e33(int i17) {
        this.f58672x7a319eaa = i17;
        this.f58673xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setLongPolling */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27059xbcf84e3f m108953xf910fbe5(boolean z17) {
        this.f58674xe20aa500 = z17;
        this.f58673xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setRequestBody */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27059xbcf84e3f m108954xb4c07b0f(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f58675x4da64152 = gVar;
        this.f58673xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setTimeoutMs */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27059xbcf84e3f m108955x5ed2b4a5(int i17) {
        this.f58676x5f1f1d44 = i17;
        this.f58673xcb94b041[4] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27059xbcf84e3f m108950x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27059xbcf84e3f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27059xbcf84e3f) super.mo11468x92b714fd(bArr);
    }
}
