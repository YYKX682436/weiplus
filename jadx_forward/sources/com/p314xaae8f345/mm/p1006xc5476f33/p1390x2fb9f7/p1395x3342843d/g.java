package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private g() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("key_page_flow_name");
        int i17 = bundle.getInt("key_page_flow_type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPageFlowSenderByIPCInvoker", "MMPageFlowReceiver async receive action name[%s-%d-%d] type[%d]", string, java.lang.Integer.valueOf(bundle.getInt("key_page_flow_hashcode", 0)), java.lang.Long.valueOf(bundle.getLong("key_page_flow_time_stamp", 0L)), java.lang.Integer.valueOf(i17));
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.f(this));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMPageFlowSenderByIPCInvoker", e17, "post to main thread error? [%s]", e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(932L, 101L, 1L, false);
    }
}
