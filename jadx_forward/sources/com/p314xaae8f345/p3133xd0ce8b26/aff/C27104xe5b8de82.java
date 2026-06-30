package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkNetProxyInfo */
/* loaded from: classes8.dex */
public class C27104xe5b8de82 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27104xe5b8de82 f59158xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27104xe5b8de82();

    /* renamed from: hasSetFields */
    private final boolean[] f59159xcb94b041 = new boolean[6];

    /* renamed from: ip, reason: collision with root package name */
    private java.lang.String f297258ip;

    /* renamed from: password */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f59160x4889ba9b;

    /* renamed from: port */
    private int f59161x349881;

    /* renamed from: proxytype */
    private int f59162xe3af72a8;

    /* renamed from: username */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f59163xf02988d6;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27104xe5b8de82 m110333xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27104xe5b8de82();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27104xe5b8de82 m110334x7c90cfc0() {
        return f59158xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27104xe5b8de82 m110335x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27104xe5b8de82();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27104xe5b8de82 m110336x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27104xe5b8de82)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27104xe5b8de82 c27104xe5b8de82 = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27104xe5b8de82) fVar;
        return n51.f.a(this.f297258ip, c27104xe5b8de82.f297258ip) && n51.f.a(java.lang.Integer.valueOf(this.f59161x349881), java.lang.Integer.valueOf(c27104xe5b8de82.f59161x349881)) && n51.f.a(this.f59163xf02988d6, c27104xe5b8de82.f59163xf02988d6) && n51.f.a(this.f59160x4889ba9b, c27104xe5b8de82.f59160x4889ba9b) && n51.f.a(java.lang.Integer.valueOf(this.f59162xe3af72a8), java.lang.Integer.valueOf(c27104xe5b8de82.f59162xe3af72a8));
    }

    /* renamed from: getIp */
    public java.lang.String m110337x5db1b1d() {
        return this.f59159xcb94b041[1] ? this.f297258ip : "";
    }

    /* renamed from: getPassword */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m110338xc463f811() {
        return this.f59159xcb94b041[4] ? this.f59160x4889ba9b : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getPort */
    public int m110339xfb8400f7() {
        return this.f59161x349881;
    }

    /* renamed from: getProxytype */
    public int m110340xe31ce3f2() {
        return this.f59162xe3af72a8;
    }

    /* renamed from: getUsername */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m110341x6c03c64c() {
        return this.f59159xcb94b041[3] ? this.f59163xf02988d6 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: hasFieldNumber */
    public boolean m110342x6e095e9(int i17) {
        return this.f59159xcb94b041[i17];
    }

    /* renamed from: hasIp */
    public boolean m110343x5e75d61() {
        return m110342x6e095e9(1);
    }

    /* renamed from: hasPassword */
    public boolean m110344xf3de7755() {
        return m110342x6e095e9(4);
    }

    /* renamed from: hasPort */
    public boolean m110345x2988c23b() {
        return m110342x6e095e9(2);
    }

    /* renamed from: hasProxytype */
    public boolean m110346xa2f24d2e() {
        return m110342x6e095e9(5);
    }

    /* renamed from: hasUsername */
    public boolean m110347x9b7e4590() {
        return m110342x6e095e9(3);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27104xe5b8de82 m110348x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27104xe5b8de82();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f297258ip;
            if (str != null && this.f59159xcb94b041[1]) {
                fVar.j(1, str);
            }
            if (this.f59159xcb94b041[2]) {
                fVar.e(2, this.f59161x349881);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f59163xf02988d6;
            if (gVar != null && this.f59159xcb94b041[3]) {
                fVar.b(3, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f59160x4889ba9b;
            if (gVar2 != null && this.f59159xcb94b041[4]) {
                fVar.b(4, gVar2);
            }
            if (this.f59159xcb94b041[5]) {
                fVar.e(5, this.f59162xe3af72a8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f297258ip;
            if (str2 != null && this.f59159xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (this.f59159xcb94b041[2]) {
                i18 += b36.f.e(2, this.f59161x349881);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f59163xf02988d6;
            if (gVar3 != null && this.f59159xcb94b041[3]) {
                i18 += b36.f.b(3, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f59160x4889ba9b;
            if (gVar4 != null && this.f59159xcb94b041[4]) {
                i18 += b36.f.b(4, gVar4);
            }
            return this.f59159xcb94b041[5] ? i18 + b36.f.e(5, this.f59162xe3af72a8) : i18;
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
            this.f297258ip = aVar2.k(intValue);
            this.f59159xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f59161x349881 = aVar2.g(intValue);
            this.f59159xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f59163xf02988d6 = aVar2.d(intValue);
            this.f59159xcb94b041[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f59160x4889ba9b = aVar2.d(intValue);
            this.f59159xcb94b041[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f59162xe3af72a8 = aVar2.g(intValue);
        this.f59159xcb94b041[5] = true;
        return 0;
    }

    /* renamed from: setIp */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27104xe5b8de82 m110350x6843529(java.lang.String str) {
        this.f297258ip = str;
        this.f59159xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setPassword */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27104xe5b8de82 m110351xbf1c591d(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59160x4889ba9b = gVar;
        this.f59159xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setPort */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27104xe5b8de82 m110352x764ec803(int i17) {
        this.f59161x349881 = i17;
        this.f59159xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setProxytype */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27104xe5b8de82 m110353x3f70a466(int i17) {
        this.f59162xe3af72a8 = i17;
        this.f59159xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setUsername */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27104xe5b8de82 m110354x66bc2758(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59163xf02988d6 = gVar;
        this.f59159xcb94b041[3] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27104xe5b8de82 m110349x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27104xe5b8de82 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27104xe5b8de82) super.mo11468x92b714fd(bArr);
    }
}
