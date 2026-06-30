package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class hc extends com.tencent.mapsdk.internal.hh {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "showCount")
    private int f49736a;

    public hc() {
        this.f49736a = 0;
    }

    public final int a() {
        int i17 = this.f49736a + 1;
        this.f49736a = i17;
        return i17;
    }

    public hc(long j17) {
        super(j17);
        this.f49736a = 0;
    }
}
