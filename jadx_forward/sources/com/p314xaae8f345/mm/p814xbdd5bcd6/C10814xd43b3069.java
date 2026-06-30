package com.p314xaae8f345.mm.p814xbdd5bcd6;

/* renamed from: com.tencent.mm.lan_cs.SmartServer$C2Java */
/* loaded from: classes.dex */
public class C10814xd43b3069 {
    /* renamed from: onSendFail */
    public static void m46369xef6e39c5(java.lang.String str, int i17) {
        sm0.e eVar = sm0.f.f490846a;
        if (eVar != null) {
            ((d35.i) eVar).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FileSmartServerMgr", "onSendFail " + str + ", " + i17);
            jx3.f.INSTANCE.mo68477x336bdfd8(1680L, 4L, 1L, false);
        }
    }

    /* renamed from: onSendProgressChange */
    public static void m46370x9a4c2a24(java.lang.String str, long j17, long j18) {
        sm0.e eVar = sm0.f.f490846a;
        if (eVar != null) {
            ((d35.i) eVar).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FileSmartServerMgr", "onSendProgressChange " + str + ' ' + j17 + ' ' + j18);
        }
    }

    /* renamed from: onSendSucc */
    public static void m46371xef746ce9(java.lang.String str) {
        sm0.e eVar = sm0.f.f490846a;
        if (eVar != null) {
            ((d35.i) eVar).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FileSmartServerMgr", "onSendSucc " + str);
            jx3.f.INSTANCE.mo68477x336bdfd8(1680L, 3L, 1L, false);
        }
    }
}
