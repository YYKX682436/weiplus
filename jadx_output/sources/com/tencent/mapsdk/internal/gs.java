package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class gs extends com.tencent.mapsdk.internal.hh {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map<java.lang.String, com.tencent.mapsdk.internal.gs.a> f49679a;

    /* renamed from: b, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "ct")
    private int f49680b;

    /* renamed from: c, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "fails")
    private final java.util.List<com.tencent.mapsdk.internal.gs.a> f49681c;

    /* loaded from: classes13.dex */
    public static class a extends com.tencent.mapsdk.internal.hh {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "rt")
        public int f49682a;

        /* renamed from: b, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "err")
        public int f49683b;

        /* renamed from: c, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "msg")
        public java.lang.String f49684c;

        public a() {
            super(java.lang.System.currentTimeMillis());
            this.f49682a = 0;
            this.f49683b = 0;
        }

        private static /* synthetic */ int a(com.tencent.mapsdk.internal.gs.a aVar) {
            int i17 = aVar.f49682a;
            aVar.f49682a = i17 + 1;
            return i17;
        }
    }

    public gs() {
        this.f49680b = 0;
        this.f49679a = new java.util.HashMap();
        this.f49681c = new java.util.ArrayList();
    }

    private boolean b() {
        return !this.f49681c.isEmpty();
    }

    private java.util.List<com.tencent.mapsdk.internal.gs.a> c() {
        return this.f49681c;
    }

    public final void a() {
        this.f49680b++;
    }

    private int a(int i17, java.lang.String str) {
        java.lang.String str2 = i17 + str;
        com.tencent.mapsdk.internal.gs.a aVar = this.f49679a.get(str2);
        if (aVar == null) {
            aVar = new com.tencent.mapsdk.internal.gs.a();
            this.f49679a.put(str2, aVar);
        }
        aVar.f49683b = i17;
        aVar.f49684c = str;
        int i18 = aVar.f49682a + 1;
        aVar.f49682a = i18;
        return i18;
    }

    public gs(long j17) {
        super(j17);
        this.f49680b = 0;
        this.f49679a = new java.util.HashMap();
        this.f49681c = new java.util.ArrayList();
    }
}
