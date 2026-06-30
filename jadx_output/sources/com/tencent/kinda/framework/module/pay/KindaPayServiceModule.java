package com.tencent.kinda.framework.module.pay;

/* loaded from: classes9.dex */
public class KindaPayServiceModule extends com.tencent.kinda.modularize.KindaModule {
    @Override // com.tencent.kinda.modularize.KindaModule
    public void configModule() {
        registerNativeModule("TenpayCgi", com.tencent.kinda.framework.module.impl.TenpayCgiImpl.class);
    }

    @Override // com.tencent.kinda.modularize.KindaModule
    public void onAppCreate() {
    }
}
