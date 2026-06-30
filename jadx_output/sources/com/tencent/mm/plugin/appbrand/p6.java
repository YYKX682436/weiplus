package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class p6 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy f86326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f86327e;

    public p6(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy weAppOpenUICallbackIPCProxy) {
        this.f86327e = o6Var;
        this.f86326d = weAppOpenUICallbackIPCProxy;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (u81.b.BACKGROUND == bVar) {
            this.f86327e.N.c(this);
            com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy weAppOpenUICallbackIPCProxy = this.f86326d;
            boolean z17 = this.f86327e.r0() != null && this.f86327e.r0().isFinishing();
            if (weAppOpenUICallbackIPCProxy.f84481i) {
                return;
            }
            weAppOpenUICallbackIPCProxy.f84477e.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(z17));
        }
    }
}
