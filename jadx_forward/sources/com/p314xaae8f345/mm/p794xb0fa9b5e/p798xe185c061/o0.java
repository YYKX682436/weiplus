package com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061;

/* loaded from: classes5.dex */
public class o0 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        try {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPC_EXT_MM_PROTOBUF_TRANSFER_MMKV_LARGE_FILE_CLEAR_CHECK_TIMESTAMP_LONG;
            long t17 = c17.t(u3Var, 0L) + com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p0.f149973d;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (t17 <= java.lang.System.currentTimeMillis()) {
                try {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.k0.f149969a;
                    boolean z18 = o4Var.Y() >= 20971520;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginIPC", "do check MMProtoBuf mmkv file too large, needClear[%b]", java.lang.Boolean.valueOf(z18));
                    if (z18) {
                        o4Var.d();
                    }
                    gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                } catch (java.lang.Throwable th6) {
                    try {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginIPC", "do check MMProtoBuf mmkv file too large, exception = %s", th6);
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPC_EXT_MM_PROTOBUF_TRANSFER_MMKV_LARGE_FILE_CLEAR_CHECK_TIMESTAMP_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                    } catch (java.lang.Throwable th7) {
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPC_EXT_MM_PROTOBUF_TRANSFER_MMKV_LARGE_FILE_CLEAR_CHECK_TIMESTAMP_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                        throw th7;
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
