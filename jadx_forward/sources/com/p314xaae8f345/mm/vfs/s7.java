package com.p314xaae8f345.mm.vfs;

/* loaded from: classes.dex */
public class s7 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        boolean booleanValue;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("VFSStrategy");
        long j17 = M.getLong("VFSSwitchReportTime", 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (j17 <= 0 || currentTimeMillis - j17 >= 259200000) {
            M.B("VFSSwitchReportTime", currentTimeMillis);
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.mo68477x336bdfd8(1317L, 0L, 1L, true);
            synchronized (com.p314xaae8f345.mm.vfs.t7.class) {
                if (com.p314xaae8f345.mm.vfs.t7.f294722a == null) {
                    com.p314xaae8f345.mm.vfs.t7.f294722a = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("extmig_status_memo_storage").getBoolean("key_is_olddata_ignored_v2", false));
                }
                booleanValue = com.p314xaae8f345.mm.vfs.t7.f294722a.booleanValue();
            }
            if (booleanValue) {
                fVar.mo68477x336bdfd8(1317L, 1L, 1L, true);
            }
            fVar.mo68477x336bdfd8(1317L, 3L, 1L, true);
            fVar.mo68477x336bdfd8(1317L, 5L, 1L, true);
            fVar.mo68477x336bdfd8(1317L, 7L, 1L, true);
            fVar.mo68477x336bdfd8(1317L, 9L, 1L, true);
        }
    }
}
