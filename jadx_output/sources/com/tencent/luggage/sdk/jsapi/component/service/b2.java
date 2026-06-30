package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public final class b2 extends ea5.l {
    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_14beccb0";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void haveSpecifiedResourceAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        super.haveSpecifiedResourceAsync(j17, projectId, name, i17, i18, i19);
        com.tencent.mars.xlog.Log.i("Luggage.WAUDRFeatureService", "haveSpecifiedResource: " + projectId + ", " + name + ", " + i17 + ", " + i18 + ", " + i19);
    }
}
