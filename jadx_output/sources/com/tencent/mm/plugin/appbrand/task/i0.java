package com.tencent.mm.plugin.appbrand.task;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tencent/mm/plugin/appbrand/task/AppBrandProcessesManager$AppInitConfigParcelWrapper;", "it", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class i0<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.task.i0 f89031a = new com.tencent.mm.plugin.appbrand.task.i0();

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.o6 o6Var;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        try {
            kotlin.jvm.internal.o.d(iPCString);
            o6Var = com.tencent.mm.plugin.appbrand.l.b(iPCString.f68406d);
        } catch (java.lang.Exception unused) {
            o6Var = null;
        }
        if (o6Var == null) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = o6Var.u0();
        kotlin.jvm.internal.o.f(u07, "getInitConfig(...)");
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject l27 = o6Var.l2();
        kotlin.jvm.internal.o.f(l27, "getStatObject(...)");
        return new com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$AppInitConfigParcelWrapper(u07, l27);
    }
}
