package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d;

/* loaded from: classes.dex */
class h implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private h() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("key_page_flow_name");
        int i17 = bundle.getInt("key_page_flow_type");
        int i18 = bundle.getInt("key_page_flow_hashcode", 0);
        long j17 = bundle.getLong("key_page_flow_time_stamp", 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPageFlowSenderByIPCInvoker", "MMPageFlowReceiver sync receive action name[%s-%d-%d] type[%d]", string, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.k) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.k.class);
        e42.l0 a17 = e42.l0.a(i17);
        kVar.getClass();
        kVar.Bi(string, a17, i18, j17, android.os.Process.myPid());
        return com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d;
    }
}
