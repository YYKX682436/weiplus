package com.tencent.mm.ipcinvoker.wx_extension;

/* loaded from: classes7.dex */
public final class d0 implements com.tencent.mm.ipcinvoker.s, im5.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ipcinvoker.wx_extension.v f68427d;

    public d0(com.tencent.mm.ipcinvoker.wx_extension.v vVar, im5.b bVar) {
        this.f68427d = vVar;
        if (bVar != null) {
            bVar.keep(this);
        }
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.wx_extension.service.IPCRunCgiRespWrapper iPCRunCgiRespWrapper = (com.tencent.mm.ipcinvoker.wx_extension.service.IPCRunCgiRespWrapper) obj;
        com.tencent.mm.ipcinvoker.wx_extension.v vVar = this.f68427d;
        if (vVar != null) {
            try {
                if (iPCRunCgiRespWrapper != null) {
                    try {
                        vVar.a(iPCRunCgiRespWrapper.f68455d, iPCRunCgiRespWrapper.f68456e, iPCRunCgiRespWrapper.f68457f, iPCRunCgiRespWrapper.f68458g);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IPCRunCgi", e17, "remoteCgiImpl do callback", new java.lang.Object[0]);
                    }
                }
            } finally {
                this.f68427d = null;
            }
        }
    }

    public final void b(java.lang.String str) {
        com.tencent.mm.ipcinvoker.wx_extension.v vVar = this.f68427d;
        if (vVar != null) {
            try {
                try {
                    vVar.a(3, -1, str, null);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IPCRunCgi", e17, "remoteCgiImpl do callbackUnexpectedError(%s)", str);
                }
            } finally {
                this.f68427d = null;
            }
        }
    }

    @Override // com.tencent.mm.ipcinvoker.s
    public void c(java.lang.Exception exc) {
        b(java.lang.String.format(java.util.Locale.ENGLISH, "onCaughtInvokeException(%s)", exc));
    }

    @Override // com.tencent.mm.ipcinvoker.s
    public void d() {
        b("onBridgeNotFound");
    }

    @Override // im5.a
    public void dead() {
        this.f68427d = null;
    }
}
