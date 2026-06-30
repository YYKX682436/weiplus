package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class h extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p {

    /* renamed from: k, reason: collision with root package name */
    static byte[] f131227k = null;

    /* renamed from: l, reason: collision with root package name */
    static java.util.Map<java.lang.String, java.lang.String> f131228l = null;

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ boolean f131229m = true;

    /* renamed from: a, reason: collision with root package name */
    public short f131230a;

    /* renamed from: b, reason: collision with root package name */
    public byte f131231b;

    /* renamed from: c, reason: collision with root package name */
    public int f131232c;

    /* renamed from: d, reason: collision with root package name */
    public int f131233d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f131234e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f131235f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f131236g;

    /* renamed from: h, reason: collision with root package name */
    public int f131237h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.Map<java.lang.String, java.lang.String> f131238i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.Map<java.lang.String, java.lang.String> f131239j;

    public h() {
        this.f131230a = (short) 0;
        this.f131231b = (byte) 0;
        this.f131232c = 0;
        this.f131233d = 0;
        this.f131234e = null;
        this.f131235f = null;
        this.f131237h = 0;
    }

    /* renamed from: clone */
    public final java.lang.Object m36762x5a5dd5d() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            if (f131229m) {
                return null;
            }
            throw new java.lang.AssertionError();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: display */
    public final void mo36080x63a518c2(java.lang.StringBuilder sb6, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k kVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k(sb6, i17);
        kVar.a(this.f131230a, "iVersion");
        kVar.a(this.f131231b, "cPacketType");
        kVar.a(this.f131232c, "iMessageType");
        kVar.a(this.f131233d, "iRequestId");
        kVar.a(this.f131234e, "sServantName");
        kVar.a(this.f131235f, "sFuncName");
        kVar.a(this.f131236g, "sBuffer");
        kVar.a(this.f131237h, "iTimeout");
        kVar.a((java.util.Map) this.f131238i, "context");
        kVar.a((java.util.Map) this.f131239j, "status");
    }

    /* renamed from: equals */
    public final boolean m36763xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.h hVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.h) obj;
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(1, (int) hVar.f131230a) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(1, (int) hVar.f131231b) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(1, hVar.f131232c) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(1, hVar.f131233d) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) 1, (java.lang.Object) hVar.f131234e) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) 1, (java.lang.Object) hVar.f131235f) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) 1, (java.lang.Object) hVar.f131236g) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(1, hVar.f131237h) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) 1, (java.lang.Object) hVar.f131238i) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) 1, (java.lang.Object) hVar.f131239j);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: readFrom */
    public final void mo36074xcc442a60(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar) {
        try {
            this.f131230a = mVar.a(this.f131230a, 1, true);
            this.f131231b = mVar.a(this.f131231b, 2, true);
            this.f131232c = mVar.a(this.f131232c, 3, true);
            this.f131233d = mVar.a(this.f131233d, 4, true);
            this.f131234e = mVar.b(5, true);
            this.f131235f = mVar.b(6, true);
            if (f131227k == null) {
                f131227k = new byte[]{0};
            }
            this.f131236g = mVar.c(7, true);
            this.f131237h = mVar.a(this.f131237h, 8, true);
            if (f131228l == null) {
                java.util.HashMap hashMap = new java.util.HashMap();
                f131228l = hashMap;
                hashMap.put("", "");
            }
            this.f131238i = (java.util.Map) mVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m) f131228l, 9, true);
            if (f131228l == null) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                f131228l = hashMap2;
                hashMap2.put("", "");
            }
            this.f131239j = (java.util.Map) mVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m) f131228l, 10, true);
        } catch (java.lang.Exception e17) {
            java.lang.System.out.println("RequestPacket decode error " + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.i.a(this.f131236g));
            throw new java.lang.RuntimeException(e17);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: writeTo */
    public final void mo36076x5f8be6ba(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar) {
        nVar.a(this.f131230a, 1);
        nVar.a(this.f131231b, 2);
        nVar.a(this.f131232c, 3);
        nVar.a(this.f131233d, 4);
        nVar.a(this.f131234e, 5);
        nVar.a(this.f131235f, 6);
        nVar.a(this.f131236g, 7);
        nVar.a(this.f131237h, 8);
        nVar.a((java.util.Map) this.f131238i, 9);
        nVar.a((java.util.Map) this.f131239j, 10);
    }

    private h(short s17, byte b17, int i17, int i18, java.lang.String str, java.lang.String str2, byte[] bArr, int i19, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2) {
        this.f131230a = s17;
        this.f131231b = b17;
        this.f131232c = i17;
        this.f131233d = i18;
        this.f131234e = str;
        this.f131235f = str2;
        this.f131236g = bArr;
        this.f131237h = i19;
        this.f131238i = map;
        this.f131239j = map2;
    }
}
