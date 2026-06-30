package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class eg extends com.tencent.mapsdk.internal.el {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "detail")
    public com.tencent.mapsdk.internal.eg.a f49247a;

    /* loaded from: classes13.dex */
    public static class a extends com.tencent.mapsdk.internal.el.a {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "styleTable")
        public com.tencent.mapsdk.internal.eg.a.C0017a f49248a;

        /* renamed from: com.tencent.mapsdk.internal.eg$a$a, reason: collision with other inner class name */
        /* loaded from: classes13.dex */
        public static class C0017a extends com.tencent.mapsdk.internal.el.c {

            /* renamed from: a, reason: collision with root package name */
            @com.tencent.map.tools.json.annotation.Json(name = "theme")
            public com.tencent.mapsdk.internal.eg.a.C0017a.b f49249a;

            /* renamed from: b, reason: collision with root package name */
            @com.tencent.map.tools.json.annotation.Json(name = "control")
            public com.tencent.mapsdk.internal.eg.a.C0017a.C0018a f49250b;

            /* renamed from: com.tencent.mapsdk.internal.eg$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes13.dex */
            public static final class C0018a extends com.tencent.mapsdk.internal.el.c.a {

                /* renamed from: a, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "maxIntensity")
                public double f49251a;

                /* renamed from: b, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "minIntensity")
                public double f49252b;

                /* renamed from: c, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "enable3D")
                public boolean f49253c;

                /* renamed from: d, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "heightRange")
                public java.util.List<java.lang.Double> f49254d;

                /* renamed from: e, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "animated")
                public boolean f49255e;

                @Override // com.tencent.mapsdk.internal.el.c.a
                public final boolean a() {
                    java.util.List<java.lang.Double> list;
                    return super.a() && (list = this.f49254d) != null && list.size() > 0;
                }
            }

            /* renamed from: com.tencent.mapsdk.internal.eg$a$a$b */
            /* loaded from: classes13.dex */
            public static class b extends com.tencent.map.tools.json.JsonComposer {

                /* renamed from: a, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "standard")
                public com.tencent.mapsdk.internal.eg.a.C0017a.b.C0020b f49256a;

                /* renamed from: com.tencent.mapsdk.internal.eg$a$a$b$a, reason: collision with other inner class name */
                /* loaded from: classes13.dex */
                public static final class C0019a extends com.tencent.mapsdk.internal.el.c.AbstractC0029c {

                    /* renamed from: a, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "gap")
                    public int f49257a;

                    /* renamed from: b, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "radius")
                    public int f49258b;

                    /* renamed from: c, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "shapeType")
                    public java.lang.String f49259c;

                    /* renamed from: d, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "gradient")
                    public com.tencent.mapsdk.internal.el.c.e f49260d;

                    /* renamed from: e, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "animation")
                    public com.tencent.mapsdk.internal.el.c.d f49261e;
                }

                /* renamed from: com.tencent.mapsdk.internal.eg$a$a$b$b, reason: collision with other inner class name */
                /* loaded from: classes13.dex */
                public static class C0020b extends com.tencent.map.tools.json.JsonComposer {

                    /* renamed from: a, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "defaultStyle")
                    public com.tencent.mapsdk.internal.eg.a.C0017a.b.C0019a f49262a;
                }
            }

            @Override // com.tencent.mapsdk.internal.el.c
            public final boolean a() {
                return (!super.a() || this.f49249a == null || this.f49250b == null) ? false : true;
            }
        }

        @Override // com.tencent.mapsdk.internal.el.a
        public final boolean a() {
            com.tencent.mapsdk.internal.eg.a.C0017a c0017a;
            return super.a() && com.tencent.mapsdk.internal.ef.Aggregation.a(this.f49293b) && (c0017a = this.f49248a) != null && c0017a.a();
        }
    }

    @Override // com.tencent.mapsdk.internal.el
    public final int a() {
        if (c()) {
            return this.f49247a.f49294c.f49295a;
        }
        return 0;
    }

    @Override // com.tencent.mapsdk.internal.el
    public final int b() {
        if (c()) {
            return this.f49247a.f49248a.f49313c;
        }
        return 0;
    }

    @Override // com.tencent.mapsdk.internal.el
    public final boolean c() {
        com.tencent.mapsdk.internal.eg.a aVar;
        return super.c() && (aVar = this.f49247a) != null && aVar.a();
    }
}
