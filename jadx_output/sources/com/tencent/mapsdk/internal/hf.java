package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class hf extends com.tencent.mapsdk.internal.hh {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f49740a = "PromoteImageRecord";

    /* renamed from: b, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "promote_images")
    private java.util.List<com.tencent.mapsdk.internal.hf.a> f49741b;

    /* loaded from: classes13.dex */
    public static class a extends com.tencent.mapsdk.internal.hh {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "image_id")
        java.lang.String f49742a;

        /* renamed from: b, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "showCount")
        int f49743b;

        public a() {
        }

        public static /* synthetic */ int a(com.tencent.mapsdk.internal.hf.a aVar) {
            int i17 = aVar.f49743b;
            aVar.f49743b = i17 + 1;
            return i17;
        }

        public a(long j17) {
            super(j17);
        }
    }

    public hf() {
    }

    public final void a(java.lang.String str) {
        boolean z17;
        if (this.f49741b == null) {
            this.f49741b = new java.util.ArrayList();
        }
        java.util.Iterator<com.tencent.mapsdk.internal.hf.a> it = this.f49741b.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            com.tencent.mapsdk.internal.hf.a next = it.next();
            if (next.f49742a.equals(str)) {
                com.tencent.mapsdk.internal.hf.a.a(next);
                com.tencent.mapsdk.core.utils.log.LogUtil.b(f49740a, "statisticData promoteRecord[" + str + "]... showInc:" + next.f49743b);
                z17 = true;
                break;
            }
        }
        if (z17) {
            return;
        }
        com.tencent.mapsdk.internal.hf.a aVar = new com.tencent.mapsdk.internal.hf.a(java.lang.System.currentTimeMillis());
        aVar.f49742a = str;
        com.tencent.mapsdk.internal.hf.a.a(aVar);
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f49740a, "statisticData promoteRecord[" + str + "]... showInc:" + aVar.f49743b);
        this.f49741b.add(aVar);
    }

    public hf(long j17) {
        super(j17);
    }
}
