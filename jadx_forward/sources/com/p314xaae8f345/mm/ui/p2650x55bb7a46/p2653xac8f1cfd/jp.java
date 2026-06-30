package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class jp implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qp f280854d;

    public jp(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qp qpVar) {
        this.f280854d = qpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qp qpVar = this.f280854d;
        qpVar.f281338q = null;
        java.lang.Long l17 = qpVar.f281337p;
        if (l17 != null) {
            long longValue = l17.longValue();
            qpVar.f281337p = null;
            java.lang.String x17 = qpVar.f280113d.x();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawStream.ChattingComponent", "[STREAM_TRACE] doPublishMessageUpdate: publishing ChatMsgNotifyEvent, msgId=%d, talker=%s, thread=%s", java.lang.Long.valueOf(longValue), x17, java.lang.Thread.currentThread().getName());
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5236x8e0a6828 c5236x8e0a6828 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5236x8e0a6828();
            am.a2 a2Var = c5236x8e0a6828.f135569g;
            a2Var.f87650a = longValue;
            a2Var.f87651b = x17;
            a2Var.f87652c = false;
            c5236x8e0a6828.e();
        }
    }
}
