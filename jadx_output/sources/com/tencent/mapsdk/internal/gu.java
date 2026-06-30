package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class gu extends com.tencent.mapsdk.internal.hh {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "styles")
    private java.util.List<com.tencent.mapsdk.internal.gu.a> f49686a;

    public gu() {
        this.f49686a = new java.util.ArrayList();
    }

    public final int a(int i17) {
        for (com.tencent.mapsdk.internal.gu.a aVar : this.f49686a) {
            if (aVar.f49687a == i17) {
                int i18 = aVar.f49688b + 1;
                aVar.f49688b = i18;
                return i18;
            }
        }
        this.f49686a.add(new com.tencent.mapsdk.internal.gu.a(this.f49766g, i17));
        return 1;
    }

    /* loaded from: classes13.dex */
    public static class a extends com.tencent.mapsdk.internal.hh {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = dm.i4.COL_ID)
        int f49687a;

        /* renamed from: b, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "showCount")
        int f49688b;

        public a() {
            this.f49687a = 0;
            this.f49688b = 0;
        }

        private static /* synthetic */ int b(com.tencent.mapsdk.internal.gu.a aVar) {
            int i17 = aVar.f49688b + 1;
            aVar.f49688b = i17;
            return i17;
        }

        public a(long j17, int i17) {
            super(j17);
            this.f49687a = i17;
            this.f49688b = 1;
        }
    }

    public gu(long j17) {
        super(j17);
        this.f49686a = new java.util.ArrayList();
    }
}
