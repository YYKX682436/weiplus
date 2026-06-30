package com.tencent.mm.ipcinvoker.wx_extension;

/* loaded from: classes5.dex */
public class n0 implements java.lang.Runnable {
    public n0(com.tencent.mm.ipcinvoker.wx_extension.p0 p0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = new java.lang.String[]{"MicroMsg.XIPC.MMProtoBufTransfer"}[0];
        try {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir().getAbsolutePath() + "/mmkv/" + str);
            if (r6Var.m()) {
                r6Var.l();
                com.tencent.mm.vfs.w6.h(r6Var.o() + ".crc");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PluginIPC", "delete MMProtoBufTransfer dirty file[%s] e = %s", str, e17);
        }
    }
}
