package com.tencent.midas.api.request;

/* loaded from: classes13.dex */
public class APMidasAccountRequest extends com.tencent.midas.api.request.APMidasBaseRequest {
    public static java.lang.String NET_REQ_ACCOUNT = "account";
    public java.lang.String provideUin = "";
    public java.lang.String provideType = "";
    public java.lang.String balanceType = "";
    public java.lang.String balanceExtras = "";

    public java.lang.String getBalanceExtras() {
        return this.balanceExtras;
    }

    public java.lang.String getBalanceType() {
        return this.balanceType;
    }

    public java.lang.String getProvideType() {
        return this.provideType;
    }

    public java.lang.String getProvideUin() {
        return this.provideUin;
    }

    public void setBalanceExtras(java.lang.String str) {
        this.balanceExtras = str;
    }

    public void setBalanceType(java.lang.String str) {
        this.balanceType = str;
    }

    public void setProvideType(java.lang.String str) {
        this.provideType = str;
    }

    public void setProvideUin(java.lang.String str) {
        this.provideUin = str;
    }

    public java.lang.String toString() {
        return super.toString() + "---{ provideUin=" + this.provideUin + " | provideType=" + this.provideType + " | balanceType=" + this.balanceType + " | balanceExtras=" + this.balanceExtras + " }";
    }
}
