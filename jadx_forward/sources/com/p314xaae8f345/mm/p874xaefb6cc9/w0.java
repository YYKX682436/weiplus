package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes7.dex */
public final class w0 implements android.content.ServiceConnection {
    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVAGameService", "wvaPreload onServiceConnected name=" + componentName);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVAGameService", "wvaPreload onServiceDisconnected name=" + componentName);
    }
}
