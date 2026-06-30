package com.tencent.kinda.framework.sns_cross;

/* loaded from: classes9.dex */
public interface ISnsSceneService {
    com.tencent.kinda.gen.ITransmitKvData generateSnsUseCaseData();

    void setData(android.content.Context context, com.tencent.mm.pluginsdk.wallet.PayInfo payInfo);
}
