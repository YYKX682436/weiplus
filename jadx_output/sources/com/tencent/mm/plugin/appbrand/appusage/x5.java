package com.tencent.mm.plugin.appbrand.appusage;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/appusage/x5;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class x5 implements com.tencent.mm.ipcinvoker.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f76650a = "AppBrandAutoPullGuideLogic";

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        boolean z17 = com.tencent.mm.plugin.appbrand.appusage.d.f76408c;
        java.lang.String str = this.f76650a;
        if (!z17) {
            com.tencent.mars.xlog.Log.i(str, "switch=false");
            return new com.tencent.mm.ipcinvoker.type.IPCInteger(-1);
        }
        if (iPCString == null) {
            com.tencent.mars.xlog.Log.w(str, "data is null");
            return new com.tencent.mm.ipcinvoker.type.IPCInteger(-1);
        }
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w(str, "accHasReady false");
            return new com.tencent.mm.ipcinvoker.type.IPCInteger(-1);
        }
        boolean compareAndSet = com.tencent.mm.plugin.appbrand.appusage.e.f76420a.compareAndSet(true, false);
        if (compareAndSet) {
            hh4.m mVar = (hh4.m) i95.n0.c(hh4.m.class);
            if (mVar != null) {
                ((java.util.concurrent.CopyOnWriteArrayList) ((gh4.s0) mVar).f271955e).add(new com.tencent.mm.plugin.appbrand.appusage.w5(mVar, this, iPCString));
            } else {
                com.tencent.mars.xlog.Log.w(str, "not find ITaskBarViewService");
            }
        }
        com.tencent.mars.xlog.Log.w(str, "UsedWeAppQueryAndMarkUsedCall shouldShowGuide:" + (compareAndSet ? 1 : 0));
        return new com.tencent.mm.ipcinvoker.type.IPCInteger(compareAndSet ? 1 : 0);
    }
}
