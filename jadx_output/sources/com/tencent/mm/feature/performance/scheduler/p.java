package com.tencent.mm.feature.performance.scheduler;

/* loaded from: classes9.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.performance.scheduler.r f67705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f67706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67707f;

    public p(com.tencent.mm.feature.performance.scheduler.r rVar, boolean z17, java.lang.String str) {
        this.f67705d = rVar;
        this.f67706e = z17;
        this.f67707f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f67705d.f67711e = this.f67706e;
        com.tencent.mm.feature.performance.scheduler.d.a(this.f67707f);
    }
}
