package com.tencent.midas.api.request;

/* loaded from: classes13.dex */
public class APMidasSubscribeRequest extends com.tencent.midas.api.request.APMidasMonthRequest {
    private static final long serialVersionUID = 6111439524338439638L;
    public int gameLogo = 0;
    public java.lang.String productId = "";

    @Override // com.tencent.midas.api.request.APMidasMonthRequest
    public int getGameLogo() {
        return this.gameLogo;
    }

    public java.lang.String getProductId() {
        return this.productId;
    }

    @Override // com.tencent.midas.api.request.APMidasMonthRequest
    public void setGameLogo(int i17) {
        this.gameLogo = i17;
    }

    public void setProductId(java.lang.String str) {
        this.productId = str;
    }
}
