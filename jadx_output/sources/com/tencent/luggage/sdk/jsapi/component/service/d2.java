package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public final class d2 extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.a2 f47397a;

    public d2(com.tencent.luggage.sdk.jsapi.component.service.a2 a2Var) {
        this.f47397a = a2Var;
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackFailAsync(j17, i17, i18, projectId, name, i19, type);
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("Luggage.WAUDRLogic", "no need to update: " + name + ", " + i19);
            return;
        }
        com.tencent.mars.xlog.Log.e("Luggage.WAUDRLogic", "download " + name + ": " + i19 + " fail, errno: " + i17 + ", errcode: " + i18);
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackSuccessAsync(j17, projectId, name, i17, type);
        com.tencent.mars.xlog.Log.i("Luggage.WAUDRLogic", "download " + name + ": " + i17 + " successfully");
        com.tencent.luggage.sdk.jsapi.component.service.g2 g2Var = com.tencent.luggage.sdk.jsapi.component.service.h2.f47439a;
        com.tencent.luggage.sdk.jsapi.component.service.a2 info = this.f47397a;
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_14beccb0", info.f47382a);
        java.lang.String path = Ui != null ? Ui.getPath() : null;
        if (path != null) {
            com.tencent.mars.xlog.Log.i("Luggage.WAUDRLogic", "save Path: ".concat(path));
            ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) com.tencent.luggage.sdk.jsapi.component.service.h2.f47440b).getValue()).putString(info.f47382a + info.f47383b, path);
        }
    }
}
