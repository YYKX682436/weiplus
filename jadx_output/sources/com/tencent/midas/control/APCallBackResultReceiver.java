package com.tencent.midas.control;

/* loaded from: classes13.dex */
public class APCallBackResultReceiver extends android.os.ResultReceiver {
    private com.tencent.midas.control.APCallBackResultReceiver.Receiver mReceiver;

    /* loaded from: classes13.dex */
    public interface Receiver {
        void onReceiveResult(int i17, android.os.Bundle bundle);
    }

    public APCallBackResultReceiver(android.os.Handler handler) {
        super(handler);
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i17, android.os.Bundle bundle) {
        com.tencent.midas.comm.APLog.i("APCallBackResultReceiver", "onReceiveResult resultCode:" + i17 + " mReceiver:" + this.mReceiver);
        com.tencent.midas.control.APCallBackResultReceiver.Receiver receiver = this.mReceiver;
        if (receiver != null) {
            receiver.onReceiveResult(i17, bundle);
        }
    }

    public void setReceiver(com.tencent.midas.control.APCallBackResultReceiver.Receiver receiver) {
        this.mReceiver = receiver;
    }
}
