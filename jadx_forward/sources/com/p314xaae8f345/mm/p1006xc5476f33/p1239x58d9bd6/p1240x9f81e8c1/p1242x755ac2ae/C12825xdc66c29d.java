package com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1240x9f81e8c1.p1242x755ac2ae;

/* renamed from: com.tencent.mm.plugin.audio.broadcast.bluetooth.BluetoothReceiver */
/* loaded from: classes13.dex */
public class C12825xdc66c29d extends android.content.BroadcastReceiver {
    public final java.lang.Boolean a(android.bluetooth.BluetoothAdapter bluetoothAdapter) {
        if (!fp.h.c(31)) {
            java.util.Set<android.bluetooth.BluetoothDevice> bondedDevices = bluetoothAdapter.getBondedDevices();
            if (bondedDevices == null || bondedDevices.size() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BluetoothReceiver", "getBondedDevices == null");
                return java.lang.Boolean.FALSE;
            }
        } else if (!((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ui()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BluetoothReceiver", "bluetooth sco not support");
            return java.lang.Boolean.FALSE;
        }
        return java.lang.Boolean.TRUE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r25, android.content.Intent r26) {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1240x9f81e8c1.p1242x755ac2ae.C12825xdc66c29d.onReceive(android.content.Context, android.content.Intent):void");
    }
}
