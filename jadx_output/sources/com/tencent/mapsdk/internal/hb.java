package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class hb extends com.tencent.mapsdk.internal.hh {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "loadSuccess")
    private boolean f49715a;

    /* renamed from: b, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "loadSuccessTime")
    private long f49716b;

    /* renamed from: c, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "firstLoadTime")
    private long f49717c;

    /* renamed from: d, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "configUpdate")
    private com.tencent.mapsdk.internal.hb.b f49718d;

    /* renamed from: e, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "tileErrors")
    private java.util.Set<com.tencent.mapsdk.internal.hb.e> f49719e;

    /* renamed from: f, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "configError")
    private com.tencent.mapsdk.internal.hb.a f49720f;

    /* loaded from: classes13.dex */
    public static class a extends com.tencent.mapsdk.internal.hh {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "failUpdates")
        java.util.Set<com.tencent.mapsdk.internal.hb.c> f49721a;

        /* renamed from: b, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "missFiles")
        java.util.Set<com.tencent.mapsdk.internal.hb.d> f49722b;

        public a() {
        }

        public a(long j17) {
            super(j17);
        }
    }

    /* loaded from: classes13.dex */
    public static class b extends com.tencent.mapsdk.internal.hh {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = ya.b.SUCCESS)
        boolean f49723a;

        /* renamed from: b, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "loadBeginTime")
        long f49724b;

        public b() {
            this.f49723a = false;
            this.f49724b = 0L;
        }

        public b(long j17) {
            super(j17);
            this.f49723a = false;
            this.f49724b = 0L;
        }
    }

    /* loaded from: classes13.dex */
    public static class c extends com.tencent.mapsdk.internal.hh {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME)
        public java.lang.String f49725a;

        /* renamed from: b, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "time")
        public long f49726b;

        /* renamed from: c, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "expectMd5")
        public java.lang.String f49727c;

        /* renamed from: d, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "actualMd5")
        public java.lang.String f49728d;

        /* renamed from: e, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "localVer")
        public int f49729e;

        /* renamed from: f, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "netError")
        public int f49730f;

        public c() {
            this(0L);
        }

        public final boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof com.tencent.mapsdk.internal.hb.c) {
                return com.tencent.mapsdk.internal.hr.a(this.f49725a, ((com.tencent.mapsdk.internal.hb.c) obj).f49725a);
            }
            return false;
        }

        public final int hashCode() {
            java.lang.String str = this.f49725a;
            return str == null ? super.hashCode() : str.hashCode();
        }

        public c(long j17) {
            super(j17);
        }
    }

    /* loaded from: classes13.dex */
    public static class d extends com.tencent.mapsdk.internal.hh {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME)
        java.lang.String f49731a;

        /* renamed from: b, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "time")
        long f49732b;

        public d() {
        }

        public final boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof com.tencent.mapsdk.internal.hb.d) {
                return com.tencent.mapsdk.internal.hr.a(this.f49731a, ((com.tencent.mapsdk.internal.hb.d) obj).f49731a);
            }
            return false;
        }

        public final int hashCode() {
            java.lang.String str = this.f49731a;
            return str == null ? super.hashCode() : str.hashCode();
        }

        public d(long j17) {
            super(j17);
        }
    }

    /* loaded from: classes13.dex */
    public static class e extends com.tencent.mapsdk.internal.hh {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "time")
        long f49733a;

        /* renamed from: b, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "tid")
        java.lang.String f49734b;

        /* renamed from: c, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "netError")
        int f49735c;

        public e() {
        }

        public final boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof com.tencent.mapsdk.internal.hb.e) {
                return com.tencent.mapsdk.internal.hr.a(this.f49734b, ((com.tencent.mapsdk.internal.hb.e) obj).f49734b);
            }
            return false;
        }

        public final int hashCode() {
            java.lang.String str = this.f49734b;
            return str == null ? super.hashCode() : str.hashCode();
        }

        public e(long j17) {
            super(j17);
        }
    }

    public hb() {
        this.f49715a = false;
        this.f49716b = 0L;
        this.f49717c = 0L;
    }

    public final void a(boolean z17, long j17) {
        this.f49715a = z17;
        if (this.f49717c > 0) {
            this.f49716b = j17 - this.f49766g;
        } else {
            this.f49717c = j17 - this.f49766g;
        }
        this.f49716b = j17;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(ya.b.SUCCESS, java.lang.String.valueOf(z17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f49766g);
        hashMap.put("startTime", sb6.toString());
        hashMap.put("endTime", java.lang.String.valueOf(j17));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(this.f49716b);
        hashMap.put("duration", sb7.toString());
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(this.f49717c);
        hashMap.put("firstDuration", sb8.toString());
        com.tencent.mapsdk.internal.u.a();
        new com.tencent.mapsdk.shell.events.ReportEvent("mapload", hashMap);
    }

    public final void b(boolean z17, long j17) {
        com.tencent.mapsdk.internal.hb.b bVar = new com.tencent.mapsdk.internal.hb.b(t());
        this.f49718d = bVar;
        bVar.f49723a = z17;
        long j18 = this.f49766g;
        if (j17 - j18 > 0) {
            bVar.f49724b = j17 - j18;
        }
    }

    public hb(long j17) {
        super(j17);
        this.f49715a = false;
        this.f49716b = 0L;
        this.f49717c = 0L;
    }

    public final void a(long j17, java.lang.String str, int i17) {
        if (this.f49719e == null) {
            this.f49719e = new java.util.concurrent.CopyOnWriteArraySet();
        }
        if (this.f49719e.size() > 9) {
            return;
        }
        com.tencent.mapsdk.internal.hb.e eVar = new com.tencent.mapsdk.internal.hb.e(j17);
        eVar.f49733a = j17 - this.f49766g;
        eVar.f49734b = str;
        eVar.f49735c = i17;
        this.f49719e.add(eVar);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("tid", str);
        hashMap.put("netError", java.lang.String.valueOf(i17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f49766g);
        hashMap.put("startTime", sb6.toString());
        hashMap.put("endTime", java.lang.String.valueOf(j17));
        com.tencent.mapsdk.internal.u.a();
        new com.tencent.mapsdk.shell.events.ReportEvent("mapload-tile", hashMap);
    }

    public final void a(com.tencent.mapsdk.internal.hb.c cVar) {
        if (this.f49720f == null) {
            this.f49720f = new com.tencent.mapsdk.internal.hb.a(t());
        }
        com.tencent.mapsdk.internal.hb.a aVar = this.f49720f;
        if (aVar.f49721a == null) {
            aVar.f49721a = new java.util.concurrent.CopyOnWriteArraySet();
        }
        if (this.f49720f.f49721a.size() > 9) {
            return;
        }
        this.f49720f.f49721a.add(cVar);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, cVar.f49725a);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(cVar.f49729e);
        hashMap.put("localVer", sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(cVar.f49730f);
        hashMap.put("netError", sb7.toString());
        hashMap.put("expectMd5", cVar.f49727c);
        hashMap.put("actualMd5", cVar.f49728d);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(this.f49766g);
        hashMap.put("startTime", sb8.toString());
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        sb9.append(this.f49766g);
        sb9.append(cVar.f49726b);
        hashMap.put("endTime", sb9.toString());
        com.tencent.mapsdk.internal.u.a();
        new com.tencent.mapsdk.shell.events.ReportEvent("mapload-configfile", hashMap);
    }

    public final void a(long j17, java.lang.String str) {
        if (this.f49720f == null) {
            this.f49720f = new com.tencent.mapsdk.internal.hb.a(t());
        }
        com.tencent.mapsdk.internal.hb.a aVar = this.f49720f;
        if (aVar.f49722b == null) {
            aVar.f49722b = new java.util.concurrent.CopyOnWriteArraySet();
        }
        if (this.f49720f.f49722b.size() > 9) {
            return;
        }
        com.tencent.mapsdk.internal.hb.d dVar = new com.tencent.mapsdk.internal.hb.d(this.f49766g);
        dVar.f49732b = j17 - this.f49766g;
        dVar.f49731a = str;
        this.f49720f.f49722b.add(dVar);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f49766g);
        hashMap.put("startTime", sb6.toString());
        hashMap.put("endTime", java.lang.String.valueOf(j17));
        com.tencent.mapsdk.internal.u.a();
        new com.tencent.mapsdk.shell.events.ReportEvent("mapload-missfile", hashMap);
    }
}
