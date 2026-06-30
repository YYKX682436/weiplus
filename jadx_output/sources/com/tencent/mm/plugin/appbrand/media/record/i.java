package com.tencent.mm.plugin.appbrand.media.record;

/* loaded from: classes.dex */
public class i implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordCacheClean", "clean audio record file");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(lp0.b.D(), "AudioRecord");
        if (!r6Var.m() || !r6Var.y()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordCacheClean", "AudioRecord is not exist or not Directory");
            return;
        }
        java.lang.String[] D = r6Var.D();
        if (D == null || D.length == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordCacheClean", "none files exist");
            return;
        }
        for (java.lang.String str : D) {
            java.util.Iterator it = ((java.util.ArrayList) com.tencent.mm.plugin.appbrand.media.record.j.f85820d).iterator();
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
                com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordCacheClean", "file is the block file, don't delete");
            } else {
                com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var + "/" + str);
                if (!r6Var2.m()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordCacheClean", "file not exist");
                } else if (r6Var2.y()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordCacheClean", "file is directory, don't delete");
                } else if (java.lang.System.currentTimeMillis() - r6Var2.B() > com.tencent.mm.plugin.appbrand.media.record.j.f85817a.longValue()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Record.AudioRecordCacheClean", "Clean 3 days file in record file name=%s, path:%s", r6Var2.getName(), r6Var2.o());
                    r6Var2.l();
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordCacheClean", "not delete the file, file is in valid time for 3 day");
                }
            }
        }
    }
}
