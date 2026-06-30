package com.tencent.midas.api.request;

/* loaded from: classes13.dex */
public class APMidasGoodsRequest extends com.tencent.midas.api.request.APMidasBaseRequest {
    public static final int GETTOKENTYPE_CLIENT = 3;
    public static final int GETTOKENTYPE_SDK = 2;
    public static final int GETTOKENTYPE_SERVER = 1;
    private static final long serialVersionUID = -4326761659903564582L;
    public int gameLogo = 0;
    public java.lang.String developerPayload = "";
    public boolean mIsReceiptMode = false;
    public int tokenType = -1;
    public java.lang.String goodsTokenUrl = "";
    public java.lang.String prodcutId = "";

    public java.lang.String getDeveloperPayload() {
        return this.developerPayload;
    }

    public int getGameLogo() {
        return this.gameLogo;
    }

    public java.lang.String getGoodsTokenUrl() {
        return this.goodsTokenUrl;
    }

    public boolean getIsReceiptMode() {
        return this.mIsReceiptMode;
    }

    public java.lang.String getProdcutId() {
        return this.prodcutId;
    }

    public int getTokenType() {
        return this.tokenType;
    }

    public void setDeveloperPayload(java.lang.String str) {
        this.developerPayload = str;
    }

    public void setGameLogo(int i17) {
        this.gameLogo = i17;
    }

    public void setGoodsTokenUrl(java.lang.String str) {
        this.goodsTokenUrl = str;
    }

    public void setIsReceiptMode(boolean z17) {
        this.mIsReceiptMode = z17;
    }

    public void setProdcutId(java.lang.String str) {
        this.prodcutId = str;
    }

    public void setTokenType(int i17) {
        this.tokenType = i17;
    }
}
