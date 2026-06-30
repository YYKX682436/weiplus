package com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061;

/* loaded from: classes5.dex */
public class n0 implements java.lang.Runnable {
    public n0(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p0 p0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = new java.lang.String[]{"MicroMsg.XIPC.MMProtoBufTransfer"}[0];
        try {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir().getAbsolutePath() + "/mmkv/" + str);
            if (r6Var.m()) {
                r6Var.l();
                com.p314xaae8f345.mm.vfs.w6.h(r6Var.o() + ".crc");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginIPC", "delete MMProtoBufTransfer dirty file[%s] e = %s", str, e17);
        }
    }
}
