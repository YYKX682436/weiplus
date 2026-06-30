package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkNetProxyInfo */
/* loaded from: classes8.dex */
public class C3059xe5b8de82 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3059xe5b8de82 f11068xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3059xe5b8de82();

    /* renamed from: hasSetFields */
    private final boolean[] f11069xcb94b041 = new boolean[6];

    /* renamed from: ip, reason: collision with root package name */
    private java.lang.String f127483ip;

    /* renamed from: password */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f11070x4889ba9b;

    /* renamed from: port */
    private int f11071x349881;

    /* renamed from: proxytype */
    private int f11072xe3af72a8;

    /* renamed from: username */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f11073xf02988d6;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3059xe5b8de82 m24337xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3059xe5b8de82();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3059xe5b8de82 m24338x7c90cfc0() {
        return f11068xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3059xe5b8de82 m24339x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3059xe5b8de82();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3059xe5b8de82 m24340x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3059xe5b8de82)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3059xe5b8de82 c3059xe5b8de82 = (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3059xe5b8de82) fVar;
        return n51.f.a(this.f127483ip, c3059xe5b8de82.f127483ip) && n51.f.a(java.lang.Integer.valueOf(this.f11071x349881), java.lang.Integer.valueOf(c3059xe5b8de82.f11071x349881)) && n51.f.a(this.f11073xf02988d6, c3059xe5b8de82.f11073xf02988d6) && n51.f.a(this.f11070x4889ba9b, c3059xe5b8de82.f11070x4889ba9b) && n51.f.a(java.lang.Integer.valueOf(this.f11072xe3af72a8), java.lang.Integer.valueOf(c3059xe5b8de82.f11072xe3af72a8));
    }

    /* renamed from: getIp */
    public java.lang.String m24341x5db1b1d() {
        return this.f11069xcb94b041[1] ? this.f127483ip : "";
    }

    /* renamed from: getPassword */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m24342xc463f811() {
        return this.f11069xcb94b041[4] ? this.f11070x4889ba9b : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getPort */
    public int m24343xfb8400f7() {
        return this.f11071x349881;
    }

    /* renamed from: getProxytype */
    public int m24344xe31ce3f2() {
        return this.f11072xe3af72a8;
    }

    /* renamed from: getUsername */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m24345x6c03c64c() {
        return this.f11069xcb94b041[3] ? this.f11073xf02988d6 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: hasFieldNumber */
    public boolean m24346x6e095e9(int i17) {
        return this.f11069xcb94b041[i17];
    }

    /* renamed from: hasIp */
    public boolean m24347x5e75d61() {
        return m24346x6e095e9(1);
    }

    /* renamed from: hasPassword */
    public boolean m24348xf3de7755() {
        return m24346x6e095e9(4);
    }

    /* renamed from: hasPort */
    public boolean m24349x2988c23b() {
        return m24346x6e095e9(2);
    }

    /* renamed from: hasProxytype */
    public boolean m24350xa2f24d2e() {
        return m24346x6e095e9(5);
    }

    /* renamed from: hasUsername */
    public boolean m24351x9b7e4590() {
        return m24346x6e095e9(3);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3059xe5b8de82 m24352x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3059xe5b8de82();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f127483ip;
            if (str != null && this.f11069xcb94b041[1]) {
                fVar.j(1, str);
            }
            if (this.f11069xcb94b041[2]) {
                fVar.e(2, this.f11071x349881);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f11073xf02988d6;
            if (gVar != null && this.f11069xcb94b041[3]) {
                fVar.b(3, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f11070x4889ba9b;
            if (gVar2 != null && this.f11069xcb94b041[4]) {
                fVar.b(4, gVar2);
            }
            if (this.f11069xcb94b041[5]) {
                fVar.e(5, this.f11072xe3af72a8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f127483ip;
            if (str2 != null && this.f11069xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (this.f11069xcb94b041[2]) {
                i18 += b36.f.e(2, this.f11071x349881);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f11073xf02988d6;
            if (gVar3 != null && this.f11069xcb94b041[3]) {
                i18 += b36.f.b(3, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f11070x4889ba9b;
            if (gVar4 != null && this.f11069xcb94b041[4]) {
                i18 += b36.f.b(4, gVar4);
            }
            return this.f11069xcb94b041[5] ? i18 + b36.f.e(5, this.f11072xe3af72a8) : i18;
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
            this.f127483ip = aVar2.k(intValue);
            this.f11069xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f11071x349881 = aVar2.g(intValue);
            this.f11069xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f11073xf02988d6 = aVar2.d(intValue);
            this.f11069xcb94b041[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f11070x4889ba9b = aVar2.d(intValue);
            this.f11069xcb94b041[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f11072xe3af72a8 = aVar2.g(intValue);
        this.f11069xcb94b041[5] = true;
        return 0;
    }

    /* renamed from: setIp */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3059xe5b8de82 m24354x6843529(java.lang.String str) {
        this.f127483ip = str;
        this.f11069xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setPassword */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3059xe5b8de82 m24355xbf1c591d(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f11070x4889ba9b = gVar;
        this.f11069xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setPort */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3059xe5b8de82 m24356x764ec803(int i17) {
        this.f11071x349881 = i17;
        this.f11069xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setProxytype */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3059xe5b8de82 m24357x3f70a466(int i17) {
        this.f11072xe3af72a8 = i17;
        this.f11069xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setUsername */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3059xe5b8de82 m24358x66bc2758(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f11073xf02988d6 = gVar;
        this.f11069xcb94b041[3] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3059xe5b8de82 m24353x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3059xe5b8de82 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3059xe5b8de82) super.mo11468x92b714fd(bArr);
    }
}
