package com.tencent.mapsdk.shell.events;

/* loaded from: classes13.dex */
public class NetFlowEventModel {
    public java.lang.String bizType;
    public double downloadFlow;
    public long downloadTime;
    public int errorCode;
    public final java.lang.String eventCode = "cm_nf";
    public double uploadFlow;
    public long uploadTime;
    public java.lang.String url;

    public NetFlowEventModel(double d17, double d18, long j17, long j18, int i17, java.lang.String str, java.lang.String str2) {
        this.uploadFlow = d17;
        this.downloadFlow = d18;
        this.uploadTime = j17;
        this.downloadTime = j18;
        this.errorCode = i17;
        this.url = str;
        this.bizType = str2;
    }

    public NetFlowEventModel() {
    }
}
