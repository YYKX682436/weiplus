package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ha extends com.tencent.mapsdk.internal.hh {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "ubs")
    public com.tencent.mapsdk.internal.ha.b f49707a;

    /* renamed from: b, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "ubds")
    private java.util.List<com.tencent.mapsdk.internal.ha.a> f49708b;

    /* renamed from: c, reason: collision with root package name */
    private long f49709c;

    /* loaded from: classes13.dex */
    public static class a extends com.tencent.mapsdk.internal.hh {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "buildingId")
        java.lang.String f49710a;

        /* renamed from: b, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "showCount")
        private int f49711b;

        /* renamed from: c, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "buttonClickCount")
        private int f49712c;

        /* renamed from: d, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "buttonShowCount")
        private int f49713d;

        public a() {
            this.f49710a = "";
            this.f49711b = 0;
            this.f49712c = 0;
            this.f49713d = 0;
        }

        public final int b() {
            int i17 = this.f49712c + 1;
            this.f49712c = i17;
            return i17;
        }

        public final int c() {
            int i17 = this.f49713d + 1;
            this.f49713d = i17;
            return i17;
        }

        public final int a() {
            int i17 = this.f49711b + 1;
            this.f49711b = i17;
            return i17;
        }

        public a(java.lang.String str, long j17) {
            super(j17);
            this.f49711b = 0;
            this.f49712c = 0;
            this.f49713d = 0;
            this.f49710a = str;
        }
    }

    public ha() {
    }

    private long a() {
        return this.f49709c;
    }

    private com.tencent.mapsdk.internal.ha.b b() {
        return this.f49707a;
    }

    /* loaded from: classes13.dex */
    public static class b extends com.tencent.mapsdk.internal.hh {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "showCount")
        private int f49714a;

        public b() {
            this.f49714a = 0;
        }

        public final int a() {
            int i17 = this.f49714a + 1;
            this.f49714a = i17;
            return i17;
        }

        public b(long j17) {
            super(j17);
            this.f49714a = 0;
        }
    }

    public ha(long j17, long j18) {
        super(j17);
        this.f49709c = j18;
        this.f49707a = new com.tencent.mapsdk.internal.ha.b(j17);
        this.f49708b = new java.util.ArrayList();
    }

    public final com.tencent.mapsdk.internal.ha.a a(java.lang.String str) {
        for (com.tencent.mapsdk.internal.ha.a aVar : this.f49708b) {
            if (!android.text.TextUtils.isEmpty(aVar.f49710a) && aVar.f49710a.equals(str)) {
                return aVar;
            }
        }
        com.tencent.mapsdk.internal.ha.a aVar2 = new com.tencent.mapsdk.internal.ha.a(str, java.lang.System.currentTimeMillis() - this.f49709c);
        this.f49708b.add(aVar2);
        return aVar2;
    }
}
