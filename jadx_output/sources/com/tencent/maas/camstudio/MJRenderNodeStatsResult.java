package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJRenderNodeStatsResult {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f47923a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f47924b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f47925c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f47926d;

    public MJRenderNodeStatsResult(java.lang.String str, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, boolean z17) {
        this.f47923a = str;
        this.f47924b = mJTime;
        this.f47925c = mJTime2;
        this.f47926d = z17;
    }

    public com.tencent.maas.model.time.MJTime getFirstRenderTimeStamp() {
        return this.f47924b;
    }

    public com.tencent.maas.model.time.MJTime getLastRenderTimeStamp() {
        return this.f47925c;
    }

    public java.lang.String getSynthId() {
        return this.f47923a;
    }

    public boolean isControlledByLua() {
        return this.f47926d;
    }

    public java.lang.String toString() {
        return "MJRenderNodeStatsResult{synthId='" + this.f47923a + "', firstRenderTimeStamp=" + this.f47924b + ", lastRenderTimeStamp=" + this.f47925c + ", controlledByLua=" + this.f47926d + '}';
    }
}
