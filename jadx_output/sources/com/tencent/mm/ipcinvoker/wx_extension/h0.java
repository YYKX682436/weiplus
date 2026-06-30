package com.tencent.mm.ipcinvoker.wx_extension;

/* loaded from: classes7.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f68431a = {1157, me1.a.CTRL_INDEX, 1133, 4602, 1912};

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.ipcinvoker.wx_extension.w f68432b = new com.tencent.mm.ipcinvoker.wx_extension.y();

    public static com.tencent.mm.modelbase.m1 a(com.tencent.mm.modelbase.o oVar, com.tencent.mm.ipcinvoker.wx_extension.v vVar) {
        return b(oVar, null, vVar, null);
    }

    public static com.tencent.mm.modelbase.m1 b(com.tencent.mm.modelbase.o oVar, com.tencent.mm.ipcinvoker.wx_extension.w wVar, com.tencent.mm.ipcinvoker.wx_extension.v vVar, im5.b bVar) {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            if (wVar != null && !qk0.c.a(wVar.getClass())) {
                java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "remoteCgiImpl in client process, invalid interceptor %s", wVar.getClass().getName());
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IPCRunCgi", new java.lang.Throwable(), format, new java.lang.Object[0]);
                wVar = null;
            }
            com.tencent.mm.ipcinvoker.wx_extension.IPCRunCgi$IPCRunCgiParamsWrapper iPCRunCgi$IPCRunCgiParamsWrapper = new com.tencent.mm.ipcinvoker.wx_extension.IPCRunCgi$IPCRunCgiParamsWrapper();
            iPCRunCgi$IPCRunCgiParamsWrapper.f68412d = wVar == null ? null : wVar.getClass().getName();
            iPCRunCgi$IPCRunCgiParamsWrapper.f68413e = oVar;
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, iPCRunCgi$IPCRunCgiParamsWrapper, com.tencent.mm.ipcinvoker.wx_extension.f0.class, vVar == null ? null : new com.tencent.mm.ipcinvoker.wx_extension.d0(vVar, bVar));
            return null;
        }
        if (wVar == null) {
            wVar = f68432b;
        }
        com.tencent.mm.ipcinvoker.wx_extension.z zVar = u46.a.a(f68431a, oVar.f70713d) ? new com.tencent.mm.ipcinvoker.wx_extension.z(vVar, oVar) : null;
        com.tencent.mm.modelbase.o a17 = wVar.a(oVar);
        com.tencent.mm.ipcinvoker.wx_extension.a0 a0Var = new com.tencent.mm.ipcinvoker.wx_extension.a0(vVar, zVar);
        java.util.concurrent.Executor executor = com.tencent.mm.ipcinvoker.wx_extension.g0.f68430a;
        android.os.HandlerThread handlerThread = com.tencent.mm.modelbase.z2.f70846a;
        com.tencent.mm.modelbase.g3 g3Var = new com.tencent.mm.modelbase.g3(a0Var);
        if (bVar != null) {
            bVar.keep(g3Var);
        }
        com.tencent.mm.modelbase.m1 f17 = com.tencent.mm.modelbase.z2.f(a17, g3Var, executor, false);
        if (f17 != null && zVar != null) {
            try {
                ((gm0.n) com.tencent.mm.modelbase.z2.f70847b).f273260a.f273288b.a(((com.tencent.mm.modelbase.c3) f17).f70602m.f70713d, zVar);
            } catch (java.lang.Exception unused) {
            }
        }
        return f17;
    }
}
