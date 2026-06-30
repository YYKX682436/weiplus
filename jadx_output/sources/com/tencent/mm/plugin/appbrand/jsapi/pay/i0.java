package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes.dex */
public final class i0 implements com.tencent.kinda.gen.UseCaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f82607a;

    public i0(com.tencent.mm.ipcinvoker.r rVar) {
        this.f82607a = rVar;
    }

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public final void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("callbackSource", iTransmitKvData.getString("callbackSource"));
        bundle.putBoolean("result", iTransmitKvData.getBool("result"));
        com.tencent.mm.ipcinvoker.r rVar = this.f82607a;
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
