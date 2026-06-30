package com.p314xaae8f345.p592x631407a.p600x38b7655d;

/* renamed from: com.tencent.midas.control.APCallBackResultReceiver */
/* loaded from: classes13.dex */
public class ResultReceiverC4775xb0cccc00 extends android.os.ResultReceiver {

    /* renamed from: mReceiver */
    private com.p314xaae8f345.p592x631407a.p600x38b7655d.ResultReceiverC4775xb0cccc00.Receiver f20391xf4c9917c;

    /* renamed from: com.tencent.midas.control.APCallBackResultReceiver$Receiver */
    /* loaded from: classes13.dex */
    public interface Receiver {
        /* renamed from: onReceiveResult */
        void mo41751x8a4d1541(int i17, android.os.Bundle bundle);
    }

    public ResultReceiverC4775xb0cccc00(android.os.Handler handler) {
        super(handler);
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APCallBackResultReceiver", "onReceiveResult resultCode:" + i17 + " mReceiver:" + this.f20391xf4c9917c);
        com.p314xaae8f345.p592x631407a.p600x38b7655d.ResultReceiverC4775xb0cccc00.Receiver receiver = this.f20391xf4c9917c;
        if (receiver != null) {
            receiver.mo41751x8a4d1541(i17, bundle);
        }
    }

    /* renamed from: setReceiver */
    public void m41750x465e8871(com.p314xaae8f345.p592x631407a.p600x38b7655d.ResultReceiverC4775xb0cccc00.Receiver receiver) {
        this.f20391xf4c9917c = receiver;
    }
}
