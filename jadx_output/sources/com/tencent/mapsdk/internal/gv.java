package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class gv extends com.tencent.mapsdk.internal.hh {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "showCount")
    public int f49689a;

    public gv() {
        this.f49689a = 0;
    }

    private int a() {
        int i17 = this.f49689a + 1;
        this.f49689a = i17;
        return i17;
    }

    public gv(long j17) {
        super(j17);
        this.f49689a = 0;
    }
}
