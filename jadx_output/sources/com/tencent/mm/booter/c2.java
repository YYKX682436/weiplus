package com.tencent.mm.booter;

/* loaded from: classes.dex */
public class c2 {
    public void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PostTaskLightweightJob", "CrashStatus report: key %s ", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(25L, i17, i18, false);
    }
}
