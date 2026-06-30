package com.tencent.mm.feature.performance.scheduler;

/* loaded from: classes9.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.performance.scheduler.y f67717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f67718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67719f;

    public w(com.tencent.mm.feature.performance.scheduler.y yVar, boolean z17, java.lang.String str) {
        this.f67717d = yVar;
        this.f67718e = z17;
        this.f67719f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f67717d.f67724f = this.f67718e;
        com.tencent.mm.feature.performance.scheduler.d.a(this.f67719f);
    }
}
