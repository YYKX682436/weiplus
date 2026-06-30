package com.tencent.mm.plugin.appbrand.task.ipc;

/* loaded from: classes7.dex */
public abstract class l {
    public static final void a(java.lang.String appId, android.os.Parcelable data) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(data, "data");
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            throw new java.lang.IllegalStateException("Main process env is required for notify call".toString());
        }
        com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().N(new com.tencent.mm.plugin.appbrand.task.ipc.k(appId, data));
    }
}
