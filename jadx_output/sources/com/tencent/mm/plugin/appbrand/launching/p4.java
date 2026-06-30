package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class p4 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f84888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.q4 f84889e;

    public p4(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.tencent.mm.plugin.appbrand.launching.q4 q4Var) {
        this.f84888d = atomicBoolean;
        this.f84889e = q4Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        this.f84888d.set(true);
        ((com.tencent.mm.plugin.appbrand.launching.j4) this.f84889e.f85065h).invoke(com.tencent.mm.plugin.appbrand.launching.a6.f84494o, null);
        return true;
    }
}
