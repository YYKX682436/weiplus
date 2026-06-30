package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51;

/* loaded from: classes.dex */
public class i implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordCacheClean", "clean audio record file");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(lp0.b.D(), "AudioRecord");
        if (!r6Var.m() || !r6Var.y()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordCacheClean", "AudioRecord is not exist or not Directory");
            return;
        }
        java.lang.String[] D = r6Var.D();
        if (D == null || D.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordCacheClean", "none files exist");
            return;
        }
        for (java.lang.String str : D) {
            java.util.Iterator it = ((java.util.ArrayList) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.j.f167353d).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (str.contains((java.lang.String) it.next())) {
                        z17 = true;
                        break;
                    }
                } else {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordCacheClean", "file is the block file, don't delete");
            } else {
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var + "/" + str);
                if (!r6Var2.m()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordCacheClean", "file not exist");
                } else if (r6Var2.y()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordCacheClean", "file is directory, don't delete");
                } else if (java.lang.System.currentTimeMillis() - r6Var2.B() > com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.j.f167350a.longValue()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioRecordCacheClean", "Clean 3 days file in record file name=%s, path:%s", r6Var2.m82467xfb82e301(), r6Var2.o());
                    r6Var2.l();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordCacheClean", "not delete the file, file is in valid time for 3 day");
                }
            }
        }
    }
}
