package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class gl extends com.tencent.map.tools.json.JsonComposer {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "logs")
    java.util.List<com.tencent.mapsdk.internal.gl.b> f49592a;

    /* loaded from: classes13.dex */
    public static class a extends com.tencent.map.tools.json.JsonComposer {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "type")
        private java.lang.String f49593a;

        /* renamed from: b, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "err")
        private int f49594b;

        /* renamed from: c, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "msg")
        private java.lang.String f49595c;

        /* renamed from: d, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "rt")
        private int f49596d;

        /* renamed from: com.tencent.mapsdk.internal.gl$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public enum EnumC0038a {
            AUTH;


            /* renamed from: b, reason: collision with root package name */
            final java.lang.String f49599b;

            EnumC0038a() {
                this.f49599b = r3;
            }

            private java.lang.String a() {
                return this.f49599b;
            }
        }

        public a() {
        }

        public a(com.tencent.mapsdk.internal.gl.a.EnumC0038a enumC0038a, int i17, java.lang.String str, int i18) {
            this.f49593a = enumC0038a.f49599b;
            this.f49594b = i17;
            this.f49595c = str;
            this.f49596d = i18;
        }
    }

    /* loaded from: classes13.dex */
    public static class b extends com.tencent.map.tools.json.JsonComposer {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "report")
        com.tencent.mapsdk.internal.gl.a f49600a;

        /* renamed from: b, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "key")
        private java.lang.String f49601b;

        /* renamed from: c, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "key2")
        private java.lang.String f49602c;

        /* renamed from: d, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "pid")
        private java.lang.String f49603d;

        /* renamed from: e, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "pid2")
        private java.lang.String f49604e;

        /* renamed from: f, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "hm")
        private java.lang.String f49605f;

        /* renamed from: g, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "suid")
        private java.lang.String f49606g;

        /* renamed from: h, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "os")
        private java.lang.String f49607h;

        /* renamed from: i, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "psv")
        private java.lang.String f49608i;

        /* renamed from: j, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "ver")
        private java.lang.String f49609j;

        /* renamed from: k, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "pf")
        private java.lang.String f49610k;

        /* renamed from: l, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "nt")
        private java.lang.String f49611l;

        /* renamed from: m, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "time")
        private long f49612m;

        public b() {
        }

        public b(com.tencent.mapsdk.internal.gl.b bVar) {
            this.f49601b = bVar.f49601b;
            this.f49602c = bVar.f49602c;
            this.f49603d = bVar.f49603d;
            this.f49604e = bVar.f49604e;
            this.f49605f = bVar.f49605f;
            this.f49606g = bVar.f49606g;
            this.f49607h = bVar.f49607h;
            this.f49608i = bVar.f49608i;
            this.f49609j = bVar.f49609j;
            this.f49610k = bVar.f49610k;
            this.f49611l = bVar.f49611l;
            this.f49612m = java.lang.System.currentTimeMillis();
        }

        public b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11) {
            this.f49601b = str;
            this.f49602c = str2;
            this.f49603d = str3;
            this.f49604e = str4;
            this.f49605f = str5;
            this.f49606g = str6;
            this.f49607h = str7;
            this.f49608i = str8;
            this.f49609j = str9;
            this.f49610k = str10;
            this.f49611l = str11;
            this.f49612m = java.lang.System.currentTimeMillis();
        }
    }

    private java.util.List<com.tencent.mapsdk.internal.gl.b> a() {
        return this.f49592a;
    }

    private boolean b() {
        java.util.List<com.tencent.mapsdk.internal.gl.b> list = this.f49592a;
        if (list != null) {
            return list.isEmpty();
        }
        return true;
    }

    private void c() {
        java.util.List<com.tencent.mapsdk.internal.gl.b> list = this.f49592a;
        if (list != null) {
            list.clear();
        }
    }

    public final synchronized void a(java.util.List<com.tencent.mapsdk.internal.gl.b> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                if (this.f49592a == null) {
                    this.f49592a = new java.util.ArrayList();
                }
                this.f49592a.addAll(list);
            }
        }
    }

    public final synchronized void a(com.tencent.mapsdk.internal.gl.b bVar) {
        if (this.f49592a == null) {
            this.f49592a = new java.util.ArrayList();
        }
        this.f49592a.add(bVar);
    }
}
