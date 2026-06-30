package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class gr extends com.tencent.mapsdk.internal.hh {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "showCount")
    public int f49678a;

    public gr() {
        this.f49678a = 0;
    }

    private int a() {
        int i17 = this.f49678a + 1;
        this.f49678a = i17;
        return i17;
    }

    public gr(long j17) {
        super(j17);
        this.f49678a = 0;
    }
}
