package com.tencent.mm.ipcinvoker.wx_extension;

/* loaded from: classes5.dex */
public class o0 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_IPC_EXT_MM_PROTOBUF_TRANSFER_MMKV_LARGE_FILE_CLEAR_CHECK_TIMESTAMP_LONG;
            long t17 = c17.t(u3Var, 0L) + com.tencent.mm.ipcinvoker.wx_extension.p0.f68440d;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (t17 <= java.lang.System.currentTimeMillis()) {
                try {
                    com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.ipcinvoker.wx_extension.k0.f68436a;
                    boolean z18 = o4Var.Y() >= 20971520;
                    com.tencent.mars.xlog.Log.i("MicroMsg.PluginIPC", "do check MMProtoBuf mmkv file too large, needClear[%b]", java.lang.Boolean.valueOf(z18));
                    if (z18) {
                        o4Var.d();
                    }
                    gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                } catch (java.lang.Throwable th6) {
                    try {
                        com.tencent.mars.xlog.Log.e("MicroMsg.PluginIPC", "do check MMProtoBuf mmkv file too large, exception = %s", th6);
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_IPC_EXT_MM_PROTOBUF_TRANSFER_MMKV_LARGE_FILE_CLEAR_CHECK_TIMESTAMP_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                    } catch (java.lang.Throwable th7) {
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_IPC_EXT_MM_PROTOBUF_TRANSFER_MMKV_LARGE_FILE_CLEAR_CHECK_TIMESTAMP_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                        throw th7;
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
