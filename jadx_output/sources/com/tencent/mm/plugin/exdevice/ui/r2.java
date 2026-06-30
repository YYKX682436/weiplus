package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public final class r2 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final long f99638d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.e43 f99639e;

    public r2(com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI exdeviceFollowsUI, long j17, r45.e43 follow) {
        kotlin.jvm.internal.o.g(follow, "follow");
        this.f99638d = j17;
        this.f99639e = follow;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f99638d;
    }

    @Override // in5.c
    public int h() {
        return 4;
    }
}
