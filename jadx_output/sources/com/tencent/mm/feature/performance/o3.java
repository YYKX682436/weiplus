package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class o3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f67621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f67622e;

    public o3(int i17, long j17) {
        this.f67621d = i17;
        this.f67622e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr0.t tVar = dr0.t0.f242539j;
        dr0.t0.f242540k.i().collectMarsStatus(this.f67621d, this.f67622e);
    }
}
