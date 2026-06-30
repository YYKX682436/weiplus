package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class eh extends com.tencent.mapsdk.internal.el {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "detail")
    public com.tencent.mapsdk.internal.eh.a f49263a;

    /* loaded from: classes13.dex */
    public static class a extends com.tencent.mapsdk.internal.el.a {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "styleTable")
        public com.tencent.mapsdk.internal.eh.a.C0021a f49264a;

        /* renamed from: com.tencent.mapsdk.internal.eh$a$a, reason: collision with other inner class name */
        /* loaded from: classes13.dex */
        public static class C0021a extends com.tencent.mapsdk.internal.el.c {

            /* renamed from: a, reason: collision with root package name */
            @com.tencent.map.tools.json.annotation.Json(name = "theme")
            public com.tencent.mapsdk.internal.eh.a.C0021a.b f49265a;

            /* renamed from: b, reason: collision with root package name */
            @com.tencent.map.tools.json.annotation.Json(name = "control")
            public com.tencent.mapsdk.internal.eh.a.C0021a.C0022a f49266b;

            /* renamed from: com.tencent.mapsdk.internal.eh$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes13.dex */
            public static final class C0022a extends com.tencent.mapsdk.internal.el.c.a {

                /* renamed from: a, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "enable3D")
                public boolean f49267a;

                /* renamed from: b, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "animated")
                public boolean f49268b;

                /* renamed from: c, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "animation")
                public com.tencent.mapsdk.internal.eh.a.C0021a.C0022a.C0023a f49269c;

                /* renamed from: com.tencent.mapsdk.internal.eh$a$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes13.dex */
                public static class C0023a extends com.tencent.map.tools.json.JsonComposer {

                    /* renamed from: a, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "highlightDuration")
                    public double f49270a;

                    /* renamed from: b, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "highlightColor")
                    public int f49271b;

                    /* renamed from: c, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "duration")
                    public double f49272c;
                }
            }

            /* renamed from: com.tencent.mapsdk.internal.eh$a$a$b */
            /* loaded from: classes13.dex */
            public static class b extends com.tencent.map.tools.json.JsonComposer {

                /* renamed from: a, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "standard")
                public com.tencent.mapsdk.internal.eh.a.C0021a.b.C0026b f49273a;

                /* renamed from: com.tencent.mapsdk.internal.eh$a$a$b$a, reason: collision with other inner class name */
                /* loaded from: classes13.dex */
                public static final class C0024a extends com.tencent.mapsdk.internal.el.c.AbstractC0029c {

                    /* renamed from: a, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "width")
                    public int f49274a;

                    /* renamed from: b, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "radian")
                    public double f49275b;

                    /* renamed from: c, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "gradient")
                    public com.tencent.mapsdk.internal.el.c.e f49276c;

                    /* renamed from: d, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "animation")
                    public com.tencent.mapsdk.internal.eh.a.C0021a.b.C0024a.C0025a f49277d;

                    /* renamed from: com.tencent.mapsdk.internal.eh$a$a$b$a$a, reason: collision with other inner class name */
                    /* loaded from: classes13.dex */
                    public static final class C0025a extends com.tencent.mapsdk.internal.el.c.d {

                        /* renamed from: a, reason: collision with root package name */
                        @com.tencent.map.tools.json.annotation.Json(name = "highlightDuration")
                        public double f49278a;

                        /* renamed from: b, reason: collision with root package name */
                        @com.tencent.map.tools.json.annotation.Json(name = "highlightColor")
                        public int f49279b;
                    }
                }

                /* renamed from: com.tencent.mapsdk.internal.eh$a$a$b$b, reason: collision with other inner class name */
                /* loaded from: classes13.dex */
                public static class C0026b extends com.tencent.map.tools.json.JsonComposer {

                    /* renamed from: a, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "defaultStyle")
                    public com.tencent.mapsdk.internal.eh.a.C0021a.b.C0024a f49280a;
                }
            }
        }

        @Override // com.tencent.mapsdk.internal.el.a
        public final boolean a() {
            com.tencent.mapsdk.internal.eh.a.C0021a c0021a;
            return super.a() && com.tencent.mapsdk.internal.ef.ArcLine.a(this.f49293b) && (c0021a = this.f49264a) != null && c0021a.a();
        }
    }

    @Override // com.tencent.mapsdk.internal.el
    public final int a() {
        if (c()) {
            return this.f49263a.f49294c.f49295a;
        }
        return 0;
    }

    @Override // com.tencent.mapsdk.internal.el
    public final int b() {
        if (c()) {
            return this.f49263a.f49264a.f49313c;
        }
        return 0;
    }

    @Override // com.tencent.mapsdk.internal.el
    public final boolean c() {
        com.tencent.mapsdk.internal.eh.a aVar;
        return super.c() && (aVar = this.f49263a) != null && aVar.a();
    }
}
