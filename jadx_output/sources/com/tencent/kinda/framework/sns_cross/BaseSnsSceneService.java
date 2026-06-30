package com.tencent.kinda.framework.sns_cross;

/* loaded from: classes9.dex */
public abstract class BaseSnsSceneService implements com.tencent.kinda.framework.sns_cross.ISnsSceneService {
    com.tencent.kinda.framework.sns_cross.SnsServiceBean mBean;

    @Override // com.tencent.kinda.framework.sns_cross.ISnsSceneService
    public com.tencent.kinda.gen.ITransmitKvData generateSnsUseCaseData() {
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("req_key", this.mBean.getReqKey());
        create.putInt("payChannel", this.mBean.getChannel());
        create.putInt("payScene", this.mBean.getPayScene());
        return create;
    }

    @Override // com.tencent.kinda.framework.sns_cross.ISnsSceneService
    public void setData(android.content.Context context, com.tencent.mm.pluginsdk.wallet.PayInfo payInfo) {
        this.mBean = new com.tencent.kinda.framework.sns_cross.SnsServiceBean(context, payInfo);
    }
}
