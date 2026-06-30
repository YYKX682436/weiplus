package com.tencent.mm.plugin.expt.pageflow;

/* loaded from: classes.dex */
class h implements com.tencent.mm.ipcinvoker.k0 {
    private h() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("key_page_flow_name");
        int i17 = bundle.getInt("key_page_flow_type");
        int i18 = bundle.getInt("key_page_flow_hashcode", 0);
        long j17 = bundle.getLong("key_page_flow_time_stamp", 0L);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPageFlowSenderByIPCInvoker", "MMPageFlowReceiver sync receive action name[%s-%d-%d] type[%d]", string, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.expt.pageflow.k kVar = (com.tencent.mm.plugin.expt.pageflow.k) i95.n0.c(com.tencent.mm.plugin.expt.pageflow.k.class);
        e42.l0 a17 = e42.l0.a(i17);
        kVar.getClass();
        kVar.Bi(string, a17, i18, j17, android.os.Process.myPid());
        return com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d;
    }
}
