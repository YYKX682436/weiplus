package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class el extends com.tencent.map.tools.json.JsonComposer {

    /* renamed from: b, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "info")
    public com.tencent.mapsdk.internal.el.b f49292b;

    /* loaded from: classes13.dex */
    public static class a extends com.tencent.map.tools.json.JsonComposer {

        /* renamed from: b, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "layerType")
        public java.lang.String f49293b;

        /* renamed from: c, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA)
        public com.tencent.mapsdk.internal.el.a.C0027a f49294c;

        /* renamed from: com.tencent.mapsdk.internal.el$a$a, reason: collision with other inner class name */
        /* loaded from: classes13.dex */
        public static class C0027a extends com.tencent.map.tools.json.JsonComposer {

            /* renamed from: a, reason: collision with root package name */
            @com.tencent.map.tools.json.annotation.Json(name = "version")
            public int f49295a;

            /* renamed from: b, reason: collision with root package name */
            @com.tencent.map.tools.json.annotation.Json(name = "default")
            public java.util.List<com.tencent.mapsdk.internal.el.a.C0027a.AbstractC0028a> f49296b;

            @com.tencent.map.tools.json.annotation.JsonType(deserializer = com.tencent.mapsdk.internal.ei.class)
            /* renamed from: com.tencent.mapsdk.internal.el$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes13.dex */
            public static abstract class AbstractC0028a extends com.tencent.map.tools.json.JsonComposer {

                /* renamed from: a, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "type")
                public java.lang.String f49297a;

                /* renamed from: b, reason: collision with root package name */
                public java.lang.String f49298b;
            }

            /* renamed from: com.tencent.mapsdk.internal.el$a$a$b */
            /* loaded from: classes13.dex */
            public static class b extends com.tencent.mapsdk.internal.el.a.C0027a.AbstractC0028a {

                /* renamed from: c, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(deserializer = com.tencent.tencentmap.mapsdk.maps.model.LatLngListDeserializer.class, name = "coordinates")
                public java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> f49299c;

                /* renamed from: d, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "weight")
                public int f49300d;
            }

            /* renamed from: com.tencent.mapsdk.internal.el$a$a$c */
            /* loaded from: classes13.dex */
            public static class c extends com.tencent.mapsdk.internal.el.a.C0027a.AbstractC0028a {

                /* renamed from: c, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "url")
                public java.lang.String f49301c;

                /* renamed from: d, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "astcUrl")
                public java.lang.String f49302d;

                /* renamed from: e, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "ktx2Url")
                public java.lang.String f49303e;

                /* renamed from: f, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FORMAT)
                public java.lang.String f49304f;

                /* renamed from: g, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME)
                public java.lang.String f49305g;

                /* renamed from: h, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "targetName")
                public java.lang.String f49306h;

                /* renamed from: i, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = dm.i4.COL_ID)
                public java.lang.String f49307i;
            }

            /* renamed from: com.tencent.mapsdk.internal.el$a$a$d */
            /* loaded from: classes13.dex */
            public static class d extends com.tencent.mapsdk.internal.el.a.C0027a.AbstractC0028a {

                /* renamed from: c, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(deserializer = com.tencent.tencentmap.mapsdk.maps.model.LatLngDeserializer.class, name = "coordinates")
                public com.tencent.tencentmap.mapsdk.maps.model.LatLng f49308c;

                /* renamed from: d, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "weight")
                public int f49309d;
            }

            /* renamed from: com.tencent.mapsdk.internal.el$a$a$e */
            /* loaded from: classes13.dex */
            public static class e extends com.tencent.mapsdk.internal.el.a.C0027a.AbstractC0028a {

                /* renamed from: c, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(deserializer = com.tencent.mapsdk.internal.eo.class, name = "coordinates")
                public java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng> f49310c;
            }

            private boolean a() {
                java.util.List<com.tencent.mapsdk.internal.el.a.C0027a.AbstractC0028a> list = this.f49296b;
                return list != null && list.size() > 0;
            }
        }

        public boolean a() {
            com.tencent.mapsdk.internal.el.a.C0027a c0027a = this.f49294c;
            if (c0027a != null) {
                java.util.List<com.tencent.mapsdk.internal.el.a.C0027a.AbstractC0028a> list = c0027a.f49296b;
                if (list != null && list.size() > 0) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes13.dex */
    public static class b extends com.tencent.map.tools.json.JsonComposer {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "error")
        public int f49311a;

        /* renamed from: b, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "msg")
        public java.lang.String f49312b;
    }

    /* loaded from: classes13.dex */
    public static abstract class c extends com.tencent.map.tools.json.JsonComposer {

        /* renamed from: c, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "version")
        public int f49313c;

        /* renamed from: d, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "mapping")
        public com.tencent.mapsdk.internal.el.c.b f49314d;

        /* loaded from: classes13.dex */
        public static abstract class a extends com.tencent.map.tools.json.JsonComposer {

            /* renamed from: f, reason: collision with root package name */
            @com.tencent.map.tools.json.annotation.Json(name = "displayLevel")
            public int f49315f;

            /* renamed from: g, reason: collision with root package name */
            @com.tencent.map.tools.json.annotation.Json(name = "zIndex")
            public int f49316g;

            /* renamed from: h, reason: collision with root package name */
            @com.tencent.map.tools.json.annotation.Json(name = "hidden")
            public boolean f49317h;

            /* renamed from: i, reason: collision with root package name */
            @com.tencent.map.tools.json.annotation.Json(name = "opacity")
            public double f49318i;

            /* renamed from: j, reason: collision with root package name */
            @com.tencent.map.tools.json.annotation.Json(name = "maxZoom")
            public int f49319j;

            /* renamed from: k, reason: collision with root package name */
            @com.tencent.map.tools.json.annotation.Json(name = "minZoom")
            public int f49320k;

            /* renamed from: l, reason: collision with root package name */
            @com.tencent.map.tools.json.annotation.Json(name = "themeName")
            public java.lang.String f49321l;

            public boolean a() {
                return true;
            }
        }

        /* loaded from: classes13.dex */
        public static class b extends com.tencent.map.tools.json.JsonComposer {

            /* renamed from: a, reason: collision with root package name */
            @com.tencent.map.tools.json.annotation.Json(name = "rule")
            public com.tencent.mapsdk.internal.el.c.b.a f49322a;

            /* loaded from: classes13.dex */
            public static class a extends com.tencent.map.tools.json.JsonComposer {

                /* renamed from: a, reason: collision with root package name */
                @com.tencent.map.tools.json.annotation.Json(name = "default")
                public java.lang.String f49323a;
            }
        }

        /* renamed from: com.tencent.mapsdk.internal.el$c$c, reason: collision with other inner class name */
        /* loaded from: classes13.dex */
        public static abstract class AbstractC0029c extends com.tencent.map.tools.json.JsonComposer {
        }

        /* loaded from: classes13.dex */
        public static class d extends com.tencent.map.tools.json.JsonComposer {

            /* renamed from: c, reason: collision with root package name */
            @com.tencent.map.tools.json.annotation.Json(name = "duration")
            public double f49324c;

            private boolean a() {
                return this.f49324c >= 0.0d;
            }
        }

        /* loaded from: classes13.dex */
        public static class e extends com.tencent.map.tools.json.JsonComposer {

            /* renamed from: a, reason: collision with root package name */
            @com.tencent.map.tools.json.annotation.Json(name = "points")
            public java.util.List<java.lang.Double> f49325a;

            /* renamed from: b, reason: collision with root package name */
            @com.tencent.map.tools.json.annotation.Json(name = "colors")
            public java.util.List<java.lang.Integer> f49326b;

            private boolean a() {
                java.util.List<java.lang.Integer> list;
                java.util.List<java.lang.Double> list2 = this.f49325a;
                return list2 != null && list2.size() > 0 && (list = this.f49326b) != null && list.size() > 0;
            }
        }

        /* loaded from: classes13.dex */
        public static class f extends com.tencent.map.tools.json.JsonComposer {

            /* renamed from: a, reason: collision with root package name */
            @com.tencent.map.tools.json.annotation.Json(name = "type")
            public int f49327a;

            private static boolean a() {
                return true;
            }
        }

        public boolean a() {
            return true;
        }
    }

    public abstract int a();

    public abstract int b();

    public boolean c() {
        com.tencent.mapsdk.internal.el.b bVar = this.f49292b;
        return bVar != null && bVar.f49311a == 0;
    }
}
