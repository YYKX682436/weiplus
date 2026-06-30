package com.tencent.midas.api.request;

/* loaded from: classes13.dex */
public class APMidasMonthRequest extends com.tencent.midas.api.request.APMidasBaseRequest {
    public static final int SERVICETYPE_NORMAL = 1;
    public static final int SERVICETYPE_RENEW = 2;
    public static final int SERVICETYPE_UPGRADE = 3;
    private static final long serialVersionUID = -557287896140460926L;
    public java.lang.String provideType;
    public java.lang.String provideUin;
    public int gameLogo = 0;
    public java.lang.String serviceCode = "";
    public java.lang.String serviceName = "";
    public boolean autoPay = false;
    public int serviceType = 1;

    public boolean getAutoPay() {
        return this.autoPay;
    }

    public int getGameLogo() {
        return this.gameLogo;
    }

    public java.lang.String getProvideType() {
        return this.provideType;
    }

    public java.lang.String getProvideUin() {
        return this.provideUin;
    }

    public java.lang.String getServiceCode() {
        return this.serviceCode;
    }

    public java.lang.String getServiceName() {
        return this.serviceName;
    }

    public int getServiceType() {
        return this.serviceType;
    }

    public void setAutoPay(boolean z17) {
        this.autoPay = z17;
    }

    public void setGameLogo(int i17) {
        this.gameLogo = i17;
    }

    public void setProvideType(java.lang.String str) {
        this.provideType = str;
    }

    public void setProvideUin(java.lang.String str) {
        this.provideUin = str;
    }

    public void setServiceCode(java.lang.String str) {
        this.serviceCode = str;
    }

    public void setServiceName(java.lang.String str) {
        this.serviceName = str;
    }

    public void setServiceType(int i17) {
        this.serviceType = i17;
    }
}
