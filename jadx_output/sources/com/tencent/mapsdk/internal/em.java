package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class em extends com.tencent.mapsdk.internal.el {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "detail")
    public com.tencent.mapsdk.internal.em.a f49328a;

    /* loaded from: classes13.dex */
    public static class a extends com.tencent.mapsdk.internal.el.a {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "styleTable")
        public com.tencent.mapsdk.internal.em.a.C0030a f49329a;

        /* renamed from: com.tencent.mapsdk.internal.em$a$a, reason: collision with other inner class name */
        /* loaded from: classes13.dex */
        public static class C0030a extends com.tencent.mapsdk.internal.el.c {

            /* renamed from: a, reason: collision with root package name */
            @com.tencent.map.tools.json.annotation.Json(name = "theme")
            public com.tencent.mapsdk.internal.em.a.C0030a.b f49330a;

            /* renamed from: b, reason: collision with root package name */
            @com.tencent.map.tools.json.annotation.Json(name = "control")
            public com.tencent.mapsdk.internal.em.a.C0030a.C0031a f49331b;

            /* renamed from: com.tencent.mapsdk.internal.em$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes13.dex */
            public static final class C0031a extends com.tencent.mapsdk.internal.el.c.a {
            }

            /* renamed from: com.tencent.mapsdk.internal.em$a$a$b */
            /* loaded from: classes13.dex */
            public static class b extends com.tencent.map.tools.json.JsonComposer {

                /* renamed from: a, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "standard")
                public com.tencent.mapsdk.internal.em.a.C0030a.b.C0033b f49332a;

                /* renamed from: com.tencent.mapsdk.internal.em$a$a$b$a, reason: collision with other inner class name */
                /* loaded from: classes13.dex */
                public static final class C0032a extends com.tencent.mapsdk.internal.el.c.AbstractC0029c {

                    /* renamed from: a, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(deserializer = com.tencent.tencentmap.mapsdk.maps.model.LatLngDeserializer.class, name = "position")
                    public com.tencent.tencentmap.mapsdk.maps.model.LatLng f49333a;

                    /* renamed from: b, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION)
                    public java.util.List<java.lang.Double> f49334b;

                    /* renamed from: c, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "scale")
                    public double f49335c;

                    /* renamed from: d, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "autoScale")
                    public boolean f49336d;

                    /* renamed from: e, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "pixelBound")
                    public java.util.List<java.lang.Integer> f49337e;

                    /* renamed from: f, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(deserializer = com.tencent.tencentmap.mapsdk.maps.model.LatLngListDeserializer.class, name = "pedestal")
                    public java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> f49338f;

                    /* renamed from: g, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "animation")
                    public com.tencent.mapsdk.internal.el.c.f f49339g;

                    /* renamed from: h, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "exposure")
                    public double f49340h;
                }

                /* renamed from: com.tencent.mapsdk.internal.em$a$a$b$b, reason: collision with other inner class name */
                /* loaded from: classes13.dex */
                public static class C0033b extends com.tencent.map.tools.json.JsonComposer {

                    /* renamed from: a, reason: collision with root package name */
                    @com.tencent.map.tools.json.annotation.Json(name = "defaultStyle")
                    public com.tencent.mapsdk.internal.em.a.C0030a.b.C0032a f49341a;
                }
            }

            @Override // com.tencent.mapsdk.internal.el.c
            public final boolean a() {
                return (!super.a() || this.f49330a == null || this.f49331b == null) ? false : true;
            }
        }

        @Override // com.tencent.mapsdk.internal.el.a
        public final boolean a() {
            com.tencent.mapsdk.internal.em.a.C0030a c0030a;
            return super.a() && com.tencent.mapsdk.internal.ef.GLModel.a(this.f49293b) && (c0030a = this.f49329a) != null && c0030a.a();
        }
    }

    @Override // com.tencent.mapsdk.internal.el
    public final int a() {
        if (c()) {
            return this.f49328a.f49294c.f49295a;
        }
        return 0;
    }

    @Override // com.tencent.mapsdk.internal.el
    public final int b() {
        if (c()) {
            return this.f49328a.f49329a.f49313c;
        }
        return 0;
    }

    @Override // com.tencent.mapsdk.internal.el
    public final boolean c() {
        com.tencent.mapsdk.internal.em.a aVar;
        return super.c() && (aVar = this.f49328a) != null && aVar.a();
    }
}
