package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class w0 implements android.content.ServiceConnection {
    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WVAGameService", "wvaPreload onServiceConnected name=" + componentName);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WVAGameService", "wvaPreload onServiceDisconnected name=" + componentName);
    }
}
