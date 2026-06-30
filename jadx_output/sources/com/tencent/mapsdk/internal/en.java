package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class en extends com.tencent.mapsdk.internal.el {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "detail")
    public com.tencent.mapsdk.internal.en.a f49342a;

    /* loaded from: classes13.dex */
    public static class a extends com.tencent.mapsdk.internal.el.a {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "styleTable")
        public com.tencent.mapsdk.internal.en.a.C0034a f49343a;

        /* renamed from: com.tencent.mapsdk.internal.en$a$a, reason: collision with other inner class name */
        /* loaded from: classes13.dex */
        public static class C0034a extends com.tencent.mapsdk.internal.el.c {

            /* renamed from: a, reason: collision with root package name */
            @com.tencent.map.tools.json.annotation.Json(name = "theme")
            public com.tencent.mapsdk.internal.en.a.C0034a.b f49344a;

            /* renamed from: b, reason: collision with root package name */
            @com.tencent.map.tools.json.annotation.Json(name = "control")
            public com.tencent.mapsdk.internal.en.a.C0034a.C0035a f49345b;

            /* renamed from: com.tencent.mapsdk.internal.en$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes13.dex */
            public static final class C0035a extends com.tencent.mapsdk.internal.el.c.a {

                /* renamed from: a, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "maxIntensity")
                public double f49346a;

                /* renamed from: b, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "minIntensity")
                public double f49347b;

                /* renamed from: c, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "enable3D")
                public boolean f49348c;

                /* renamed from: d, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "heightRange")
                public java.util.List<java.lang.Double> f49349d;

                /* renamed from: e, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "animated")
                public boolean f49350e;

                @Override // com.tencent.mapsdk.internal.el.c.a
                public final boolean a() {
                    java.util.List<java.lang.Double> list;
                    return super.a() && (list = this.f49349d) != null && list.size() > 0;
                }
            }

            /* renamed from: com.tencent.mapsdk.internal.en$a$a$b */
            /* loaded from: classes13.dex */
            public static class b extends com.tencent.map.tools.json.JsonComposer {

                /* renamed from: a, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "standard")
                public com.tencent.mapsdk.internal.en.a.C0034a.b.C0037b f49351a;

                /* renamed from: com.tencent.mapsdk.internal.en$a$a$b$a, reason: collision with other inner class name */
                /* loaded from: classes13.dex */
                public static final class C0036a extends com.tencent.mapsdk.internal.el.c.AbstractC0029c {

                    /* renamed from: a, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "radius")
                    public int f49352a;

                    /* renamed from: b, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "gradient")
                    public com.tencent.mapsdk.internal.el.c.e f49353b;

                    /* renamed from: c, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "animation")
                    public com.tencent.mapsdk.internal.el.c.d f49354c;

                    private boolean a() {
                        com.tencent.mapsdk.internal.el.c.e eVar;
                        com.tencent.mapsdk.internal.el.c.d dVar;
                        java.util.List<java.lang.Integer> list;
                        if (this.f49352a > 0 && (eVar = this.f49353b) != null) {
                            java.util.List<java.lang.Double> list2 = eVar.f49325a;
                            if ((list2 != null && list2.size() > 0 && (list = eVar.f49326b) != null && list.size() > 0) && (dVar = this.f49354c) != null) {
                                if (dVar.f49324c >= 0.0d) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }

                /* renamed from: com.tencent.mapsdk.internal.en$a$a$b$b, reason: collision with other inner class name */
                /* loaded from: classes13.dex */
                public static class C0037b extends com.tencent.map.tools.json.JsonComposer {

                    /* renamed from: a, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "defaultStyle")
                    public com.tencent.mapsdk.internal.en.a.C0034a.b.C0036a f49355a;

                    /* JADX WARN: Removed duplicated region for block: B:25:0x003d A[RETURN] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    private boolean a() {
                        /*
                            r8 = this;
                            com.tencent.mapsdk.internal.en$a$a$b$a r0 = r8.f49355a
                            r1 = 0
                            if (r0 == 0) goto L3e
                            int r2 = r0.f49352a
                            r3 = 1
                            if (r2 <= 0) goto L3a
                            com.tencent.mapsdk.internal.el$c$e r2 = r0.f49353b
                            if (r2 == 0) goto L3a
                            java.util.List<java.lang.Double> r4 = r2.f49325a
                            if (r4 == 0) goto L24
                            int r4 = r4.size()
                            if (r4 <= 0) goto L24
                            java.util.List<java.lang.Integer> r2 = r2.f49326b
                            if (r2 == 0) goto L24
                            int r2 = r2.size()
                            if (r2 <= 0) goto L24
                            r2 = r3
                            goto L25
                        L24:
                            r2 = r1
                        L25:
                            if (r2 == 0) goto L3a
                            com.tencent.mapsdk.internal.el$c$d r0 = r0.f49354c
                            if (r0 == 0) goto L3a
                            double r4 = r0.f49324c
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
                        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.en.a.C0034a.b.C0037b.a():boolean");
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
                        com.tencent.mapsdk.internal.en$a$a$b$b r0 = r7.f49351a
                        r1 = 0
                        if (r0 == 0) goto L47
                        com.tencent.mapsdk.internal.en$a$a$b$a r0 = r0.f49355a
                        r2 = 1
                        if (r0 == 0) goto L43
                        int r3 = r0.f49352a
                        if (r3 <= 0) goto L3e
                        com.tencent.mapsdk.internal.el$c$e r3 = r0.f49353b
                        if (r3 == 0) goto L3e
                        java.util.List<java.lang.Double> r4 = r3.f49325a
                        if (r4 == 0) goto L28
                        int r4 = r4.size()
                        if (r4 <= 0) goto L28
                        java.util.List<java.lang.Integer> r3 = r3.f49326b
                        if (r3 == 0) goto L28
                        int r3 = r3.size()
                        if (r3 <= 0) goto L28
                        r3 = r2
                        goto L29
                    L28:
                        r3 = r1
                    L29:
                        if (r3 == 0) goto L3e
                        com.tencent.mapsdk.internal.el$c$d r0 = r0.f49354c
                        if (r0 == 0) goto L3e
                        double r3 = r0.f49324c
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
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.en.a.C0034a.b.a():boolean");
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
                    com.tencent.mapsdk.internal.en$a$a$b r0 = r7.f49344a
                    if (r0 == 0) goto L60
                    com.tencent.mapsdk.internal.en$a$a$b$b r0 = r0.f49351a
                    r2 = 1
                    if (r0 == 0) goto L52
                    com.tencent.mapsdk.internal.en$a$a$b$a r0 = r0.f49355a
                    if (r0 == 0) goto L4d
                    int r3 = r0.f49352a
                    if (r3 <= 0) goto L48
                    com.tencent.mapsdk.internal.el$c$e r3 = r0.f49353b
                    if (r3 == 0) goto L48
                    java.util.List<java.lang.Double> r4 = r3.f49325a
                    if (r4 == 0) goto L32
                    int r4 = r4.size()
                    if (r4 <= 0) goto L32
                    java.util.List<java.lang.Integer> r3 = r3.f49326b
                    if (r3 == 0) goto L32
                    int r3 = r3.size()
                    if (r3 <= 0) goto L32
                    r3 = r2
                    goto L33
                L32:
                    r3 = r1
                L33:
                    if (r3 == 0) goto L48
                    com.tencent.mapsdk.internal.el$c$d r0 = r0.f49354c
                    if (r0 == 0) goto L48
                    double r3 = r0.f49324c
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
                    com.tencent.mapsdk.internal.en$a$a$a r0 = r7.f49345b
                    if (r0 == 0) goto L60
                    boolean r0 = r0.a()
                    if (r0 == 0) goto L60
                    return r2
                L60:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.en.a.C0034a.a():boolean");
            }
        }

        @Override // com.tencent.mapsdk.internal.el.a
        public final boolean a() {
            com.tencent.mapsdk.internal.en.a.C0034a c0034a;
            return super.a() && com.tencent.mapsdk.internal.ef.Gradient.a(this.f49293b) && (c0034a = this.f49343a) != null && c0034a.a();
        }
    }

    @Override // com.tencent.mapsdk.internal.el
    public final int a() {
        if (c()) {
            return this.f49342a.f49294c.f49295a;
        }
        return 0;
    }

    @Override // com.tencent.mapsdk.internal.el
    public final int b() {
        if (c()) {
            return this.f49342a.f49343a.f49313c;
        }
        return 0;
    }

    @Override // com.tencent.mapsdk.internal.el
    public final boolean c() {
        com.tencent.mapsdk.internal.en.a aVar;
        return super.c() && (aVar = this.f49342a) != null && aVar.a();
    }
}
