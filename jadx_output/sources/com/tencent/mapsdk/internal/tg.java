package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class tg extends com.tencent.mapsdk.shell.events.ReportEvent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private tg(com.tencent.mapsdk.shell.events.EngineWriteDataModel engineWriteDataModel) {
        super("map_engine_writeData", null);
        engineWriteDataModel.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        this.params = hashMap;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(engineWriteDataModel.resultCode);
        hashMap.put("err", sb6.toString());
        java.util.Map<java.lang.String, java.lang.String> map = this.params;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(engineWriteDataModel.totalWriteCount);
        map.put("writeCount", sb7.toString());
        java.util.Map<java.lang.String, java.lang.String> map2 = this.params;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(engineWriteDataModel.dataSize);
        map2.put("size", sb8.toString());
        java.util.Map<java.lang.String, java.lang.String> map3 = this.params;
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        sb9.append(engineWriteDataModel.ptr);
        map3.put("ptr", sb9.toString());
        this.params.put("url", engineWriteDataModel.url);
    }
}
