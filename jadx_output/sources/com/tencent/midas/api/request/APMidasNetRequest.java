package com.tencent.midas.api.request;

/* loaded from: classes13.dex */
public class APMidasNetRequest extends com.tencent.midas.api.request.APMidasBaseRequest {
    public static java.lang.String NET_REQ_MP = "mp";
    private static final long serialVersionUID = 5582061948778338484L;
    public java.lang.String reqType = "";

    public java.lang.String getReqType() {
        return this.reqType;
    }

    public void setReqType(java.lang.String str) {
        this.reqType = str;
    }
}
