package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class hk extends com.tencent.mapsdk.internal.hh {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "showCount")
    private int f49769a;

    public hk() {
        this.f49769a = 0;
    }

    public final int a() {
        int i17 = this.f49769a + 1;
        this.f49769a = i17;
        return i17;
    }

    public hk(long j17) {
        super(j17);
        this.f49769a = 0;
    }
}
