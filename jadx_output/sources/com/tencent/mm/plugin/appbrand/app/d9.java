package com.tencent.mm.plugin.appbrand.app;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/mm/ipcinvoker/r;", "callback", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCString;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class d9<InputType, ResultType> implements com.tencent.mm.ipcinvoker.i {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.app.d9 f75056d = new com.tencent.mm.plugin.appbrand.app.d9();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        java.lang.String str = iPCString != null ? iPCString.f68406d : null;
        if (!(str == null || str.length() == 0)) {
            ((com.tencent.mm.plugin.appbrand.service.r5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.r5.class)).Eh(str, new com.tencent.mm.plugin.appbrand.app.c9(rVar));
        } else if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString("fail invalid appId"));
        }
    }
}
