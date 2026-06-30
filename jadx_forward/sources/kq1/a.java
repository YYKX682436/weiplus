package kq1;

/* loaded from: classes13.dex */
public class a extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kq1.c f392769a;

    public a(kq1.c cVar) {
        this.f392769a = cVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("McroMsg.exdevice.BluetoohtStateMonitor", "null == intent");
            return;
        }
        if (!intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("McroMsg.exdevice.BluetoohtStateMonitor", "onReceive, action = " + intent.getAction());
        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
        if (10 != intExtra && 12 != intExtra) {
            return;
        }
        u32.a2 a2Var = (u32.a2) this.f392769a.f392770a;
        a2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "OnBluetoothStateChange, state = %d", java.lang.Integer.valueOf(intExtra));
        android.os.RemoteCallbackList remoteCallbackList = a2Var.f505798n;
        int beginBroadcast = remoteCallbackList.beginBroadcast();
        while (true) {
            beginBroadcast--;
            if (beginBroadcast < 0) {
                remoteCallbackList.finishBroadcast();
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("key_state", intExtra);
            try {
                ((u32.q0) remoteCallbackList.getBroadcastItem(beginBroadcast)).Rb(0, bundle);
            } catch (android.os.RemoteException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListIExDeviceInvoker.getBroadcastItem(%d).onExdeviceInvoke failed!!!", java.lang.Integer.valueOf(beginBroadcast));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.RemoteBTDeviceAdapter", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
