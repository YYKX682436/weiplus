package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f94467d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.tencent.mm.ipcinvoker.r rVar) {
        super(1);
        this.f94467d = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle it = (android.os.Bundle) obj;
        kotlin.jvm.internal.o.g(it, "it");
        try {
            this.f94467d.a(it);
        } catch (java.lang.Exception e17) {
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1 t1Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PreloadLogic", e17, "ipc invoke callback", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
