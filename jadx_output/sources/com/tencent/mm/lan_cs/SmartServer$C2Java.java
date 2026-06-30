package com.tencent.mm.lan_cs;

/* loaded from: classes.dex */
public class SmartServer$C2Java {
    public static void onSendFail(java.lang.String str, int i17) {
        sm0.e eVar = sm0.f.f409313a;
        if (eVar != null) {
            ((d35.i) eVar).getClass();
            com.tencent.mars.xlog.Log.w("MicroMsg.FileSmartServerMgr", "onSendFail " + str + ", " + i17);
            jx3.f.INSTANCE.idkeyStat(1680L, 4L, 1L, false);
        }
    }

    public static void onSendProgressChange(java.lang.String str, long j17, long j18) {
        sm0.e eVar = sm0.f.f409313a;
        if (eVar != null) {
            ((d35.i) eVar).getClass();
            com.tencent.mars.xlog.Log.w("MicroMsg.FileSmartServerMgr", "onSendProgressChange " + str + ' ' + j17 + ' ' + j18);
        }
    }

    public static void onSendSucc(java.lang.String str) {
        sm0.e eVar = sm0.f.f409313a;
        if (eVar != null) {
            ((d35.i) eVar).getClass();
            com.tencent.mars.xlog.Log.w("MicroMsg.FileSmartServerMgr", "onSendSucc " + str);
            jx3.f.INSTANCE.idkeyStat(1680L, 3L, 1L, false);
        }
    }
}
