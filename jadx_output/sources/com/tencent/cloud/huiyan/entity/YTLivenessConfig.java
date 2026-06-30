package com.tencent.cloud.huiyan.entity;

/* loaded from: classes14.dex */
public class YTLivenessConfig {
    private java.lang.String ytLightData = "";
    private boolean needEncrypt = true;
    private int enhanceEncryptMethod = 0;
    private long prepareTimeout = 30000;
    private long actionTimeout = 30000;
    private int livenessMode = 4;
    private boolean landscape = false;
    private java.lang.String ratio4_3 = "0.020833, 0.140625, 0.020833, 0.140625";
    private java.lang.String ratio16_9 = "0.013889, 0.226563, 0.013889, 0.226563";
    private java.lang.String resourceDownloadPath = "";

    public long getActionTimeout() {
        return this.actionTimeout;
    }

    public int getEnhanceEncryptMethod() {
        return this.enhanceEncryptMethod;
    }

    public int getLivenessMode() {
        return this.livenessMode;
    }

    public long getPrepareTimeout() {
        return this.prepareTimeout;
    }

    public java.lang.String getRatio16_9() {
        return this.ratio16_9;
    }

    public java.lang.String getRatio4_3() {
        return this.ratio4_3;
    }

    public java.lang.String getResourceDownloadPath() {
        return this.resourceDownloadPath;
    }

    public java.lang.String getYtLightData() {
        return this.ytLightData;
    }

    public boolean isLandscape() {
        return this.landscape;
    }

    public boolean isNeedEncrypt() {
        return this.needEncrypt;
    }

    public void setActionTimeout(long j17) {
        this.actionTimeout = j17;
    }

    public void setEnhanceEncryptMethod(com.tencent.cloud.huiyan.enums.HuiYanEncryptMode huiYanEncryptMode) {
        if (huiYanEncryptMode == com.tencent.cloud.huiyan.enums.HuiYanEncryptMode.AES) {
            this.enhanceEncryptMethod = 0;
        }
        if (huiYanEncryptMode == com.tencent.cloud.huiyan.enums.HuiYanEncryptMode.SM4) {
            this.enhanceEncryptMethod = 1;
        }
    }

    public void setLandscape(boolean z17) {
        this.landscape = z17;
    }

    public void setLivenessMode(int i17) {
        this.livenessMode = i17;
    }

    public void setNeedEncrypt(boolean z17) {
        this.needEncrypt = z17;
    }

    public void setPrepareTimeout(long j17) {
        this.prepareTimeout = j17;
    }

    public void setRatio16_9(java.lang.String str) {
        this.ratio16_9 = str;
    }

    public void setRatio4_3(java.lang.String str) {
        this.ratio4_3 = str;
    }

    public void setResourceDownloadPath(java.lang.String str) {
        this.resourceDownloadPath = str;
    }

    public void setYtLightData(java.lang.String str) {
        this.ytLightData = str;
    }
}
