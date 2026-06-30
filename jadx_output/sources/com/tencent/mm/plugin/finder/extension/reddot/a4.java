package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.c4 f105339d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.tencent.mm.plugin.finder.extension.reddot.c4 c4Var) {
        super(0);
        this.f105339d = c4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object m521constructorimpl;
        java.lang.String str = "";
        com.tencent.mm.plugin.finder.extension.reddot.c4 c4Var = this.f105339d;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            str = ((com.tencent.mm.plugin.finder.extension.reddot.y6) ((jz5.n) ((com.tencent.mm.plugin.finder.extension.reddot.x2) c4Var.f105438a).f105981i).getValue()).f106034a.t("KEY_FINDER_RED_DOT_EXPOSE_TIME_INFO_MAP");
            com.tencent.mars.xlog.Log.i("Finder.RedDotExposeHandler", "getExposeTimeInfoMap json= " + str);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) new com.google.gson.i().c(str, new com.tencent.mm.plugin.finder.extension.reddot.z3().f290022b);
            if (concurrentHashMap == null) {
                concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(concurrentHashMap);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.RedDotExposeHandler", m524exceptionOrNullimpl, "getExposeTimeInfoMap failed! json= " + str, new java.lang.Object[0]);
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) m521constructorimpl;
        return concurrentHashMap2 == null ? new java.util.concurrent.ConcurrentHashMap() : concurrentHashMap2;
    }
}
