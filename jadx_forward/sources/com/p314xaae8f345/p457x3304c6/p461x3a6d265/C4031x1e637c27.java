package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* renamed from: com.tencent.maas.camstudio.MJRenderNodeStatsResult */
/* loaded from: classes5.dex */
public class C4031x1e637c27 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f129456a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f129457b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f129458c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f129459d;

    public C4031x1e637c27(java.lang.String str, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2, boolean z17) {
        this.f129456a = str;
        this.f129457b = c4128x879fba0a;
        this.f129458c = c4128x879fba0a2;
        this.f129459d = z17;
    }

    /* renamed from: getFirstRenderTimeStamp */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m32888xb0e86ba6() {
        return this.f129457b;
    }

    /* renamed from: getLastRenderTimeStamp */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m32889x6c204354() {
        return this.f129458c;
    }

    /* renamed from: getSynthId */
    public java.lang.String m32890xd5f8a141() {
        return this.f129456a;
    }

    /* renamed from: isControlledByLua */
    public boolean m32891xfd7752a9() {
        return this.f129459d;
    }

    /* renamed from: toString */
    public java.lang.String m32892x9616526c() {
        return "MJRenderNodeStatsResult{synthId='" + this.f129456a + "', firstRenderTimeStamp=" + this.f129457b + ", lastRenderTimeStamp=" + this.f129458c + ", controlledByLua=" + this.f129459d + '}';
    }
}
