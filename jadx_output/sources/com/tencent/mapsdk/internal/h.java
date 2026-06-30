package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class h extends com.tencent.mapsdk.internal.p {

    /* renamed from: k, reason: collision with root package name */
    static byte[] f49694k = null;

    /* renamed from: l, reason: collision with root package name */
    static java.util.Map<java.lang.String, java.lang.String> f49695l = null;

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ boolean f49696m = true;

    /* renamed from: a, reason: collision with root package name */
    public short f49697a;

    /* renamed from: b, reason: collision with root package name */
    public byte f49698b;

    /* renamed from: c, reason: collision with root package name */
    public int f49699c;

    /* renamed from: d, reason: collision with root package name */
    public int f49700d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f49701e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f49702f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f49703g;

    /* renamed from: h, reason: collision with root package name */
    public int f49704h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.Map<java.lang.String, java.lang.String> f49705i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.Map<java.lang.String, java.lang.String> f49706j;

    public h() {
        this.f49697a = (short) 0;
        this.f49698b = (byte) 0;
        this.f49699c = 0;
        this.f49700d = 0;
        this.f49701e = null;
        this.f49702f = null;
        this.f49704h = 0;
    }

    public final java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            if (f49696m) {
                return null;
            }
            throw new java.lang.AssertionError();
        }
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void display(java.lang.StringBuilder sb6, int i17) {
        com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(sb6, i17);
        kVar.a(this.f49697a, "iVersion");
        kVar.a(this.f49698b, "cPacketType");
        kVar.a(this.f49699c, "iMessageType");
        kVar.a(this.f49700d, "iRequestId");
        kVar.a(this.f49701e, "sServantName");
        kVar.a(this.f49702f, "sFuncName");
        kVar.a(this.f49703g, "sBuffer");
        kVar.a(this.f49704h, "iTimeout");
        kVar.a((java.util.Map) this.f49705i, "context");
        kVar.a((java.util.Map) this.f49706j, "status");
    }

    public final boolean equals(java.lang.Object obj) {
        com.tencent.mapsdk.internal.h hVar = (com.tencent.mapsdk.internal.h) obj;
        return com.tencent.mapsdk.internal.q.a(1, (int) hVar.f49697a) && com.tencent.mapsdk.internal.q.a(1, (int) hVar.f49698b) && com.tencent.mapsdk.internal.q.a(1, hVar.f49699c) && com.tencent.mapsdk.internal.q.a(1, hVar.f49700d) && com.tencent.mapsdk.internal.q.a((java.lang.Object) 1, (java.lang.Object) hVar.f49701e) && com.tencent.mapsdk.internal.q.a((java.lang.Object) 1, (java.lang.Object) hVar.f49702f) && com.tencent.mapsdk.internal.q.a((java.lang.Object) 1, (java.lang.Object) hVar.f49703g) && com.tencent.mapsdk.internal.q.a(1, hVar.f49704h) && com.tencent.mapsdk.internal.q.a((java.lang.Object) 1, (java.lang.Object) hVar.f49705i) && com.tencent.mapsdk.internal.q.a((java.lang.Object) 1, (java.lang.Object) hVar.f49706j);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(com.tencent.mapsdk.internal.m mVar) {
        try {
            this.f49697a = mVar.a(this.f49697a, 1, true);
            this.f49698b = mVar.a(this.f49698b, 2, true);
            this.f49699c = mVar.a(this.f49699c, 3, true);
            this.f49700d = mVar.a(this.f49700d, 4, true);
            this.f49701e = mVar.b(5, true);
            this.f49702f = mVar.b(6, true);
            if (f49694k == null) {
                f49694k = new byte[]{0};
            }
            this.f49703g = mVar.c(7, true);
            this.f49704h = mVar.a(this.f49704h, 8, true);
            if (f49695l == null) {
                java.util.HashMap hashMap = new java.util.HashMap();
                f49695l = hashMap;
                hashMap.put("", "");
            }
            this.f49705i = (java.util.Map) mVar.a((com.tencent.mapsdk.internal.m) f49695l, 9, true);
            if (f49695l == null) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                f49695l = hashMap2;
                hashMap2.put("", "");
            }
            this.f49706j = (java.util.Map) mVar.a((com.tencent.mapsdk.internal.m) f49695l, 10, true);
        } catch (java.lang.Exception e17) {
            java.lang.System.out.println("RequestPacket decode error " + com.tencent.mapsdk.internal.i.a(this.f49703g));
            throw new java.lang.RuntimeException(e17);
        }
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(com.tencent.mapsdk.internal.n nVar) {
        nVar.a(this.f49697a, 1);
        nVar.a(this.f49698b, 2);
        nVar.a(this.f49699c, 3);
        nVar.a(this.f49700d, 4);
        nVar.a(this.f49701e, 5);
        nVar.a(this.f49702f, 6);
        nVar.a(this.f49703g, 7);
        nVar.a(this.f49704h, 8);
        nVar.a((java.util.Map) this.f49705i, 9);
        nVar.a((java.util.Map) this.f49706j, 10);
    }

    private h(short s17, byte b17, int i17, int i18, java.lang.String str, java.lang.String str2, byte[] bArr, int i19, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2) {
        this.f49697a = s17;
        this.f49698b = b17;
        this.f49699c = i17;
        this.f49700d = i18;
        this.f49701e = str;
        this.f49702f = str2;
        this.f49703g = bArr;
        this.f49704h = i19;
        this.f49705i = map;
        this.f49706j = map2;
    }
}
