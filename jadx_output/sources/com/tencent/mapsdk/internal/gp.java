package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class gp extends com.tencent.mapsdk.internal.md {
    public gp() {
    }

    private void a() {
        com.tencent.mapsdk.internal.u.a();
        new com.tencent.mapsdk.shell.events.NetFlowEvent(this.f50414a);
    }

    @Override // com.tencent.mapsdk.internal.md, com.tencent.map.tools.net.processor.ResponseProcessor
    public void onResponse(com.tencent.map.tools.net.NetResponse netResponse) {
        super.onResponse(netResponse);
        com.tencent.mapsdk.internal.u.a();
        new com.tencent.mapsdk.shell.events.NetFlowEvent(this.f50414a);
    }

    private gp(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        super(hashMap);
    }
}
