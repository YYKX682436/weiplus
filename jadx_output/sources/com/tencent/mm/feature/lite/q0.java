package com.tencent.mm.feature.lite;

/* loaded from: classes8.dex */
public class q0 implements kh0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.h f67255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67256b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.i f67257c;

    public q0(com.tencent.mm.feature.lite.i iVar, com.tencent.mm.plugin.lite.api.h hVar, java.lang.String str) {
        this.f67257c = iVar;
        this.f67255a = hVar;
        this.f67256b = str;
    }

    @Override // kh0.e
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "checkGameLiteApp onError: " + str);
        com.tencent.mm.plugin.lite.api.h hVar = this.f67255a;
        if (hVar != null) {
            hVar.fail(this.f67256b, 2);
        }
    }

    @Override // kh0.e
    public void onSuccess(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "checkGameLiteApp onSuccess: " + str);
        com.tencent.liteapp.storage.WxaLiteAppInfo Bj = this.f67257c.Bj(str);
        com.tencent.mm.plugin.lite.api.h hVar = this.f67255a;
        if (hVar != null) {
            hVar.success(Bj, 0);
        }
    }
}
