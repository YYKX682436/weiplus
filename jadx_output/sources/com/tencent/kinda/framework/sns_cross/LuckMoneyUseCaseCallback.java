package com.tencent.kinda.framework.sns_cross;

/* loaded from: classes9.dex */
public class LuckMoneyUseCaseCallback implements com.tencent.kinda.framework.sns_cross.ISnsUseCaseCallback {
    private com.tencent.kinda.framework.sns_cross.SnsServiceBean mBean;

    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03d5  */
    @Override // com.tencent.kinda.gen.UseCaseCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void call(com.tencent.kinda.gen.ITransmitKvData r34) {
        /*
            Method dump skipped, instructions count: 1307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.sns_cross.LuckMoneyUseCaseCallback.call(com.tencent.kinda.gen.ITransmitKvData):void");
    }

    @Override // com.tencent.kinda.framework.sns_cross.ISnsUseCaseCallback
    public void setData(android.content.Context context, com.tencent.mm.pluginsdk.wallet.PayInfo payInfo) {
        this.mBean = new com.tencent.kinda.framework.sns_cross.SnsServiceBean(context, payInfo);
    }
}
