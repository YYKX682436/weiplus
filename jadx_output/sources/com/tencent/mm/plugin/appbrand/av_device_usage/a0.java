package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class a0 implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.av_device_usage.c0 f76685d;

    public a0(com.tencent.mm.plugin.appbrand.av_device_usage.c0 c0Var) {
        this.f76685d = c0Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        nf.e.f(new com.tencent.mm.plugin.appbrand.av_device_usage.z(this.f76685d));
    }
}
