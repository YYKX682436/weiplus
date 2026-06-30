package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class gy extends com.tencent.mapsdk.internal.hh {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "showCount")
    public int f49692a;

    public gy() {
        this.f49692a = 0;
    }

    private int a() {
        int i17 = this.f49692a + 1;
        this.f49692a = i17;
        return i17;
    }

    public gy(long j17) {
        super(j17);
        this.f49692a = 0;
    }
}
