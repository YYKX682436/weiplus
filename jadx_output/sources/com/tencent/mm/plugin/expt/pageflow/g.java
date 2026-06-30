package com.tencent.mm.plugin.expt.pageflow;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g implements com.tencent.mm.ipcinvoker.j {
    private g() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("key_page_flow_name");
        int i17 = bundle.getInt("key_page_flow_type");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPageFlowSenderByIPCInvoker", "MMPageFlowReceiver async receive action name[%s-%d-%d] type[%d]", string, java.lang.Integer.valueOf(bundle.getInt("key_page_flow_hashcode", 0)), java.lang.Long.valueOf(bundle.getLong("key_page_flow_time_stamp", 0L)), java.lang.Integer.valueOf(i17));
        try {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.expt.pageflow.f(this));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMPageFlowSenderByIPCInvoker", e17, "post to main thread error? [%s]", e17.toString());
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(932L, 101L, 1L, false);
    }
}
