package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ha extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hh {

    /* renamed from: a, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "ubs")
    public com.tencent.mapsdk.internal.ha.b f131240a;

    /* renamed from: b, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "ubds")
    private java.util.List<com.tencent.mapsdk.internal.ha.a> f131241b;

    /* renamed from: c, reason: collision with root package name */
    private long f131242c;

    /* loaded from: classes13.dex */
    public static class a extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hh {

        /* renamed from: a, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "buildingId")
        java.lang.String f131243a;

        /* renamed from: b, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "showCount")
        private int f131244b;

        /* renamed from: c, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "buttonClickCount")
        private int f131245c;

        /* renamed from: d, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "buttonShowCount")
        private int f131246d;

        public a() {
            this.f131243a = "";
            this.f131244b = 0;
            this.f131245c = 0;
            this.f131246d = 0;
        }

        public final int b() {
            int i17 = this.f131245c + 1;
            this.f131245c = i17;
            return i17;
        }

        public final int c() {
            int i17 = this.f131246d + 1;
            this.f131246d = i17;
            return i17;
        }

        public final int a() {
            int i17 = this.f131244b + 1;
            this.f131244b = i17;
            return i17;
        }

        public a(java.lang.String str, long j17) {
            super(j17);
            this.f131244b = 0;
            this.f131245c = 0;
            this.f131246d = 0;
            this.f131243a = str;
        }
    }

    public ha() {
    }

    private long a() {
        return this.f131242c;
    }

    private com.tencent.mapsdk.internal.ha.b b() {
        return this.f131240a;
    }

    /* loaded from: classes13.dex */
    public static class b extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hh {

        /* renamed from: a, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "showCount")
        private int f131247a;

        public b() {
            this.f131247a = 0;
        }

        public final int a() {
            int i17 = this.f131247a + 1;
            this.f131247a = i17;
            return i17;
        }

        public b(long j17) {
            super(j17);
            this.f131247a = 0;
        }
    }

    public ha(long j17, long j18) {
        super(j17);
        this.f131242c = j18;
        this.f131240a = new com.tencent.mapsdk.internal.ha.b(j17);
        this.f131241b = new java.util.ArrayList();
    }

    public final com.tencent.mapsdk.internal.ha.a a(java.lang.String str) {
        for (com.tencent.mapsdk.internal.ha.a aVar : this.f131241b) {
            if (!android.text.TextUtils.isEmpty(aVar.f131243a) && aVar.f131243a.equals(str)) {
                return aVar;
            }
        }
        com.tencent.mapsdk.internal.ha.a aVar2 = new com.tencent.mapsdk.internal.ha.a(str, java.lang.System.currentTimeMillis() - this.f131242c);
        this.f131241b.add(aVar2);
        return aVar2;
    }
}
