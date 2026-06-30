package org.p3343x72743996.net;

/* renamed from: org.chromium.net.ProxyBroadcastReceiver */
/* loaded from: classes13.dex */
final class C29541x7f017122 extends android.content.BroadcastReceiver {

    /* renamed from: mListener */
    private final org.p3343x72743996.net.C29542x701272 f74215x753a6c41;

    public C29541x7f017122(org.p3343x72743996.net.C29542x701272 c29542x701272) {
        this.f74215x753a6c41 = c29542x701272;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
            this.f74215x753a6c41.m153461xa0968f25(intent);
        }
    }
}
