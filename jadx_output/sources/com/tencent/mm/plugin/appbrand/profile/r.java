package com.tencent.mm.plugin.appbrand.profile;

/* loaded from: classes7.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.profile.v f87704d;

    public r(com.tencent.mm.plugin.appbrand.profile.v vVar) {
        this.f87704d = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Debug.MemoryInfo memoryInfo = new android.os.Debug.MemoryInfo();
        android.os.Debug.getMemoryInfo(memoryInfo);
        int i17 = yd.c0.a(memoryInfo).f460918a * 1024 * 1024;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f87704d.f87696e;
        sj1.b c17 = sj1.l.c(java.lang.String.valueOf(e9Var != null ? java.lang.Integer.valueOf(e9Var.getComponentId()) : null));
        if (c17 != null) {
            c17.a(0L, i17, sj1.l.a());
        }
    }
}
