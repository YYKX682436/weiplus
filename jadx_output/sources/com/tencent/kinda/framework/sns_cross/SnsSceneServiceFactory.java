package com.tencent.kinda.framework.sns_cross;

/* loaded from: classes9.dex */
public class SnsSceneServiceFactory {
    public static com.tencent.kinda.framework.sns_cross.ISnsUseCaseCallback createCallback(int i17) {
        if (i17 != 37) {
            if (i17 == 42) {
                return new com.tencent.kinda.framework.sns_cross.NewAAUseCaseCallback();
            }
            if (i17 == 56) {
                return new com.tencent.kinda.framework.sns_cross.MobileRemittanceCaseCallBack();
            }
            if (i17 != 65) {
                if (i17 != 78) {
                    if (i17 != 82 && i17 != 48) {
                        if (i17 == 49) {
                            return new com.tencent.kinda.framework.sns_cross.T2BUseCaseCallback();
                        }
                        switch (i17) {
                            case 31:
                            case 32:
                            case 33:
                                break;
                            default:
                                return new com.tencent.kinda.framework.sns_cross.ISnsUseCaseCallback() { // from class: com.tencent.kinda.framework.sns_cross.SnsSceneServiceFactory.1
                                    @Override // com.tencent.kinda.gen.UseCaseCallback
                                    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                                    }

                                    @Override // com.tencent.kinda.framework.sns_cross.ISnsUseCaseCallback
                                    public void setData(android.content.Context context, com.tencent.mm.pluginsdk.wallet.PayInfo payInfo) {
                                    }
                                };
                        }
                    }
                }
            }
            return new com.tencent.kinda.framework.sns_cross.TransferNormalUseCaseCallback();
        }
        return new com.tencent.kinda.framework.sns_cross.LuckMoneyUseCaseCallback();
    }

    public static com.tencent.kinda.framework.sns_cross.ISnsSceneService createService(int i17) {
        if (i17 != 37) {
            if (i17 == 42) {
                return new com.tencent.kinda.framework.sns_cross.NewAASceneServiceImpl();
            }
            if (i17 == 56) {
                return new com.tencent.kinda.framework.sns_cross.MobileRemittanceServiceImpl();
            }
            if (i17 != 78) {
                return i17 != 48 ? i17 != 49 ? new com.tencent.kinda.framework.sns_cross.DefaultSnsServiceImpl() : new com.tencent.kinda.framework.sns_cross.T2BSceneServiceImpl() : new com.tencent.kinda.framework.sns_cross.QRCodeRewardServiceImpl();
            }
        }
        return new com.tencent.kinda.framework.sns_cross.HongBaoServiceImpl();
    }
}
