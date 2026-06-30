package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes.dex */
public class p0 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f99040a;

    public p0(long j17, java.lang.Runnable runnable) {
        this.f99040a = runnable;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        if (!z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.ExdeviceLogic", "getContact failed");
            return;
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.System.currentTimeMillis();
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        com.tencent.mm.modelavatar.g.f(str, 3);
        java.lang.Runnable runnable = this.f99040a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
