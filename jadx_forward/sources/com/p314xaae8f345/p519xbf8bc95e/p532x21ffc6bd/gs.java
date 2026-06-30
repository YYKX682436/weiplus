package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class gs extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hh {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map<java.lang.String, com.tencent.mapsdk.internal.gs.a> f131212a;

    /* renamed from: b, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "ct")
    private int f131213b;

    /* renamed from: c, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "fails")
    private final java.util.List<com.tencent.mapsdk.internal.gs.a> f131214c;

    /* loaded from: classes13.dex */
    public static class a extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hh {

        /* renamed from: a, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "rt")
        public int f131215a;

        /* renamed from: b, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "err")
        public int f131216b;

        /* renamed from: c, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "msg")
        public java.lang.String f131217c;

        public a() {
            super(java.lang.System.currentTimeMillis());
            this.f131215a = 0;
            this.f131216b = 0;
        }

        private static /* synthetic */ int a(com.tencent.mapsdk.internal.gs.a aVar) {
            int i17 = aVar.f131215a;
            aVar.f131215a = i17 + 1;
            return i17;
        }
    }

    public gs() {
        this.f131213b = 0;
        this.f131212a = new java.util.HashMap();
        this.f131214c = new java.util.ArrayList();
    }

    private boolean b() {
        return !this.f131214c.isEmpty();
    }

    private java.util.List<com.tencent.mapsdk.internal.gs.a> c() {
        return this.f131214c;
    }

    public final void a() {
        this.f131213b++;
    }

    private int a(int i17, java.lang.String str) {
        java.lang.String str2 = i17 + str;
        com.tencent.mapsdk.internal.gs.a aVar = this.f131212a.get(str2);
        if (aVar == null) {
            aVar = new com.tencent.mapsdk.internal.gs.a();
            this.f131212a.put(str2, aVar);
        }
        aVar.f131216b = i17;
        aVar.f131217c = str;
        int i18 = aVar.f131215a + 1;
        aVar.f131215a = i18;
        return i18;
    }

    public gs(long j17) {
        super(j17);
        this.f131213b = 0;
        this.f131212a = new java.util.HashMap();
        this.f131214c = new java.util.ArrayList();
    }
}
