package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.precondition.p f85017a = new com.tencent.mm.plugin.appbrand.launching.precondition.p();

    public final boolean a(java.lang.String appId, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(appId, "appId");
        boolean z19 = (z18 || z17 || ((java.lang.Boolean) com.tencent.mm.plugin.appbrand.launching.precondition.o.f85016d.invoke()).booleanValue()) ? false : true;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOverseaServiceAuthorizationHelper", "shouldTriggerOverseaServiceUserAuthorization, appId:" + appId + ", isHalfScreenMode:" + z17 + ", isPluginApp:" + z18 + ", ret:" + z19);
        return z19;
    }
}
