package com.tencent.mm.plugin.appbrand.keepalive;

/* loaded from: classes7.dex */
public class g implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f84092d;

    public g(java.lang.Runnable runnable) {
        this.f84092d = runnable;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.Runnable runnable = this.f84092d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
