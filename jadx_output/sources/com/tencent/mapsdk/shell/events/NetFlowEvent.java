package com.tencent.mapsdk.shell.events;

/* loaded from: classes13.dex */
public class NetFlowEvent extends com.tencent.mapsdk.shell.events.ReportEvent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetFlowEvent(com.tencent.mapsdk.shell.events.NetFlowEventModel netFlowEventModel) {
        super("cm_nf", null);
        netFlowEventModel.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        this.params = hashMap;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(netFlowEventModel.uploadFlow);
        hashMap.put("up", sb6.toString());
        java.util.Map<java.lang.String, java.lang.String> map = this.params;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(netFlowEventModel.downloadFlow);
        map.put("dw", sb7.toString());
        java.util.Map<java.lang.String, java.lang.String> map2 = this.params;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(netFlowEventModel.uploadTime);
        map2.put("up_time", sb8.toString());
        java.util.Map<java.lang.String, java.lang.String> map3 = this.params;
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        sb9.append(netFlowEventModel.downloadTime);
        map3.put("dw_time", sb9.toString());
        java.util.Map<java.lang.String, java.lang.String> map4 = this.params;
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
        sb10.append(netFlowEventModel.downloadTime - netFlowEventModel.uploadTime);
        map4.put("rt", sb10.toString());
        this.params.put("biz_type", netFlowEventModel.bizType);
        this.params.put("url", netFlowEventModel.url);
        java.util.Map<java.lang.String, java.lang.String> map5 = this.params;
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
        sb11.append(netFlowEventModel.errorCode);
        map5.put("err", sb11.toString());
    }
}
