package com.tencent.kinda.framework.app;

/* loaded from: classes11.dex */
public class KindaAddPayCardServiceImpl implements com.tencent.kinda.gen.KAddPayCardService {
    @Override // com.tencent.kinda.gen.KAddPayCardService
    public boolean clearBindCardProcess() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KAddPayCardService
    public com.tencent.kinda.gen.BindCardContext enterBindCardProcess(int i17) {
        return new com.tencent.kinda.gen.BindCardContext();
    }

    @Override // com.tencent.kinda.gen.KAddPayCardService
    public java.lang.String getBanBindCardTitle() {
        return "todo: @zhihongwang";
    }

    @Override // com.tencent.kinda.gen.KAddPayCardService
    public boolean isBanBindCard() {
        return false;
    }
}
