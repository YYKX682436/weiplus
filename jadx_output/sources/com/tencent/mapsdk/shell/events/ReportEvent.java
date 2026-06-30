package com.tencent.mapsdk.shell.events;

/* loaded from: classes13.dex */
public class ReportEvent {
    public java.lang.String code;
    public boolean isSucceed;
    public java.util.Map<java.lang.String, java.lang.String> params;
    public java.lang.String appKey = com.tencent.mapsdk.internal.tf.f51589k;
    public boolean realtime = false;

    public ReportEvent(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this.code = str;
        this.params = map;
    }
}
