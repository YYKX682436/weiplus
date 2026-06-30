package com.tencent.midas.api.request;

/* loaded from: classes13.dex */
public class APMidasDirectRequest extends com.tencent.midas.api.request.APMidasBaseRequest {
    public java.lang.String payInfo = "";
    public java.lang.String reportDomain = "";
    public java.lang.String reportSuffix = "";

    public java.lang.String getPayInfo() {
        return this.payInfo;
    }

    public java.lang.String getReportDomain() {
        return this.reportDomain;
    }

    public java.lang.String getReportSuffix() {
        return this.reportSuffix;
    }

    public void setPayInfo(java.lang.String str) {
        this.payInfo = str;
    }

    public void setReportDomain(java.lang.String str) {
        this.reportDomain = str;
    }

    public void setReportSuffix(java.lang.String str) {
        this.reportSuffix = str;
    }
}
