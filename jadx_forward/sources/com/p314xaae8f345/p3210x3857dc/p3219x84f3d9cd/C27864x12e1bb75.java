package com.p314xaae8f345.p3210x3857dc.p3219x84f3d9cd;

/* renamed from: com.tencent.xweb.remotedebug.XWebRemoteDebugServiceStopReceiver */
/* loaded from: classes13.dex */
public class C27864x12e1bb75 extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        by5.c4.f("XWebRemoteDebugServiceStopReceiver", "onReceive, stop remote debug service");
        tx5.h b17 = tx5.j.b(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120125x97d401de());
        if (b17 != null) {
            b17.mo120205xb04520a3(80032, new java.lang.Object[0]);
        } else {
            by5.c4.g("XWebRemoteDebugServiceStopReceiver", "onReceive, current process has not init core yet");
        }
    }
}
