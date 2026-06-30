package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class en extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el {

    /* renamed from: a, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "detail")
    public com.tencent.mapsdk.internal.en.a f130875a;

    /* loaded from: classes13.dex */
    public static class a extends com.tencent.mapsdk.internal.el.a {

        /* renamed from: a, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "styleTable")
        public com.tencent.mapsdk.internal.en.a.C30904a f130876a;

        /* renamed from: com.tencent.mapsdk.internal.en$a$a, reason: collision with other inner class name */
        /* loaded from: classes13.dex */
        public static class C30904a extends com.tencent.mapsdk.internal.el.c {

            /* renamed from: a, reason: collision with root package name */
            @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "theme")
            public com.tencent.mapsdk.internal.en.a.C30904a.b f130877a;

            /* renamed from: b, reason: collision with root package name */
            @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "control")
            public com.tencent.mapsdk.internal.en.a.C30904a.C30905a f130878b;

            /* renamed from: com.tencent.mapsdk.internal.en$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes13.dex */
            public static final class C30905a extends com.tencent.mapsdk.internal.el.c.a {

                /* renamed from: a, reason: collision with root package name */
                @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "maxIntensity")
                public double f130879a;

                /* renamed from: b, reason: collision with root package name */
                @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "minIntensity")
                public double f130880b;

                /* renamed from: c, reason: collision with root package name */
                @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "enable3D")
                public boolean f130881c;

                /* renamed from: d, reason: collision with root package name */
                @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "heightRange")
                public java.util.List<java.lang.Double> f130882d;

                /* renamed from: e, reason: collision with root package name */
                @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "animated")
                public boolean f130883e;

                @Override // com.tencent.mapsdk.internal.el.c.a
                public final boolean a() {
                    java.util.List<java.lang.Double> list;
                    return super.a() && (list = this.f130882d) != null && list.size() > 0;
                }
            }

            /* renamed from: com.tencent.mapsdk.internal.en$a$a$b */
            /* loaded from: classes13.dex */
            public static class b extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48 {

                /* renamed from: a, reason: collision with root package name */
                @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "standard")
                public com.tencent.mapsdk.internal.en.a.C30904a.b.C30907b f130884a;

                /* renamed from: com.tencent.mapsdk.internal.en$a$a$b$a, reason: collision with other inner class name */
                /* loaded from: classes13.dex */
                public static final class C30906a extends com.tencent.mapsdk.internal.el.c.AbstractC30899c {

                    /* renamed from: a, reason: collision with root package name */
                    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "radius")
                    public int f130885a;

                    /* renamed from: b, reason: collision with root package name */
                    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "gradient")
                    public com.tencent.mapsdk.internal.el.c.e f130886b;

                    /* renamed from: c, reason: collision with root package name */
                    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "animation")
                    public com.tencent.mapsdk.internal.el.c.d f130887c;

                    private boolean a() {
                        com.tencent.mapsdk.internal.el.c.e eVar;
                        com.tencent.mapsdk.internal.el.c.d dVar;
                        java.util.List<java.lang.Integer> list;
                        if (this.f130885a > 0 && (eVar = this.f130886b) != null) {
                            java.util.List<java.lang.Double> list2 = eVar.f130858a;
                            if ((list2 != null && list2.size() > 0 && (list = eVar.f130859b) != null && list.size() > 0) && (dVar = this.f130887c) != null) {
                                if (dVar.f130857c >= 0.0d) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }

                /* renamed from: com.tencent.mapsdk.internal.en$a$a$b$b, reason: collision with other inner class name */
                /* loaded from: classes13.dex */
                public static class C30907b extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48 {

                    /* renamed from: a, reason: collision with root package name */
                    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "defaultStyle")
                    public com.tencent.mapsdk.internal.en.a.C30904a.b.C30906a f130888a;

                    /* JADX WARN: Removed duplicated region for block: B:25:0x003d A[RETURN] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    private boolean a() {
                        /*
                            r8 = this;
                            com.tencent.mapsdk.internal.en$a$a$b$a r0 = r8.f130888a
                            r1 = 0
                            if (r0 == 0) goto L3e
                            int r2 = r0.f130885a
                            r3 = 1
                            if (r2 <= 0) goto L3a
                            com.tencent.mapsdk.internal.el$c$e r2 = r0.f130886b
                            if (r2 == 0) goto L3a
                            java.util.List<java.lang.Double> r4 = r2.f130858a
                            if (r4 == 0) goto L24
                            int r4 = r4.size()
                            if (r4 <= 0) goto L24
                            java.util.List<java.lang.Integer> r2 = r2.f130859b
                            if (r2 == 0) goto L24
                            int r2 = r2.size()
                            if (r2 <= 0) goto L24
                            r2 = r3
                            goto L25
                        L24:
                            r2 = r1
                        L25:
                            if (r2 == 0) goto L3a
                            com.tencent.mapsdk.internal.el$c$d r0 = r0.f130887c
                            if (r0 == 0) goto L3a
                            double r4 = r0.f130857c
                            r6 = 0
                            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                            if (r0 < 0) goto L35
                            r0 = r3
                            goto L36
                        L35:
                            r0 = r1
                        L36:
                            if (r0 == 0) goto L3a
                            r0 = r3
                            goto L3b
                        L3a:
                            r0 = r1
                        L3b:
                            if (r0 == 0) goto L3e
                            return r3
                        L3e:
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.en.a.C30904a.b.C30907b.a():boolean");
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0046 A[RETURN] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                private boolean a() {
                    /*
                        r7 = this;
                        com.tencent.mapsdk.internal.en$a$a$b$b r0 = r7.f130884a
                        r1 = 0
                        if (r0 == 0) goto L47
                        com.tencent.mapsdk.internal.en$a$a$b$a r0 = r0.f130888a
                        r2 = 1
                        if (r0 == 0) goto L43
                        int r3 = r0.f130885a
                        if (r3 <= 0) goto L3e
                        com.tencent.mapsdk.internal.el$c$e r3 = r0.f130886b
                        if (r3 == 0) goto L3e
                        java.util.List<java.lang.Double> r4 = r3.f130858a
                        if (r4 == 0) goto L28
                        int r4 = r4.size()
                        if (r4 <= 0) goto L28
                        java.util.List<java.lang.Integer> r3 = r3.f130859b
                        if (r3 == 0) goto L28
                        int r3 = r3.size()
                        if (r3 <= 0) goto L28
                        r3 = r2
                        goto L29
                    L28:
                        r3 = r1
                    L29:
                        if (r3 == 0) goto L3e
                        com.tencent.mapsdk.internal.el$c$d r0 = r0.f130887c
                        if (r0 == 0) goto L3e
                        double r3 = r0.f130857c
                        r5 = 0
                        int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                        if (r0 < 0) goto L39
                        r0 = r2
                        goto L3a
                    L39:
                        r0 = r1
                    L3a:
                        if (r0 == 0) goto L3e
                        r0 = r2
                        goto L3f
                    L3e:
                        r0 = r1
                    L3f:
                        if (r0 == 0) goto L43
                        r0 = r2
                        goto L44
                    L43:
                        r0 = r1
                    L44:
                        if (r0 == 0) goto L47
                        return r2
                    L47:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.en.a.C30904a.b.a():boolean");
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0050  */
            @Override // com.tencent.mapsdk.internal.el.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean a() {
                /*
                    r7 = this;
                    boolean r0 = super.a()
                    r1 = 0
                    if (r0 == 0) goto L60
                    com.tencent.mapsdk.internal.en$a$a$b r0 = r7.f130877a
                    if (r0 == 0) goto L60
                    com.tencent.mapsdk.internal.en$a$a$b$b r0 = r0.f130884a
                    r2 = 1
                    if (r0 == 0) goto L52
                    com.tencent.mapsdk.internal.en$a$a$b$a r0 = r0.f130888a
                    if (r0 == 0) goto L4d
                    int r3 = r0.f130885a
                    if (r3 <= 0) goto L48
                    com.tencent.mapsdk.internal.el$c$e r3 = r0.f130886b
                    if (r3 == 0) goto L48
                    java.util.List<java.lang.Double> r4 = r3.f130858a
                    if (r4 == 0) goto L32
                    int r4 = r4.size()
                    if (r4 <= 0) goto L32
                    java.util.List<java.lang.Integer> r3 = r3.f130859b
                    if (r3 == 0) goto L32
                    int r3 = r3.size()
                    if (r3 <= 0) goto L32
                    r3 = r2
                    goto L33
                L32:
                    r3 = r1
                L33:
                    if (r3 == 0) goto L48
                    com.tencent.mapsdk.internal.el$c$d r0 = r0.f130887c
                    if (r0 == 0) goto L48
                    double r3 = r0.f130857c
                    r5 = 0
                    int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r0 < 0) goto L43
                    r0 = r2
                    goto L44
                L43:
                    r0 = r1
                L44:
                    if (r0 == 0) goto L48
                    r0 = r2
                    goto L49
                L48:
                    r0 = r1
                L49:
                    if (r0 == 0) goto L4d
                    r0 = r2
                    goto L4e
                L4d:
                    r0 = r1
                L4e:
                    if (r0 == 0) goto L52
                    r0 = r2
                    goto L53
                L52:
                    r0 = r1
                L53:
                    if (r0 == 0) goto L60
                    com.tencent.mapsdk.internal.en$a$a$a r0 = r7.f130878b
                    if (r0 == 0) goto L60
                    boolean r0 = r0.a()
                    if (r0 == 0) goto L60
                    return r2
                L60:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.en.a.C30904a.a():boolean");
            }
        }

        @Override // com.tencent.mapsdk.internal.el.a
        public final boolean a() {
            com.tencent.mapsdk.internal.en.a.C30904a c30904a;
            return super.a() && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ef.Gradient.a(this.f130826b) && (c30904a = this.f130876a) != null && c30904a.a();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el
    public final int a() {
        if (c()) {
            return this.f130875a.f130827c.f130828a;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el
    public final int b() {
        if (c()) {
            return this.f130875a.f130876a.f130846c;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el
    public final boolean c() {
        com.tencent.mapsdk.internal.en.a aVar;
        return super.c() && (aVar = this.f130875a) != null && aVar.a();
    }
}
