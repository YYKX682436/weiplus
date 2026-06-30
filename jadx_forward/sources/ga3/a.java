package ga3;

/* loaded from: classes.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351371d;

    public a(java.lang.String str) {
        this.f351371d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordCacheClean", "clean audio record file");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y2.f(this.f351371d, "bundle", null), "LiteAppAudioRecorder");
        if (!r6Var.m() || !r6Var.y()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordCacheClean", "AudioRecord is not exist or not Directory");
            return;
        }
        java.lang.String[] D = r6Var.D();
        if (D == null || D.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordCacheClean", "none files exist");
            return;
        }
        for (java.lang.String str : D) {
            java.util.Iterator it = ((java.util.ArrayList) ga3.b.f351375d).iterator();
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordCacheClean", "file is the block file, don't delete");
            } else {
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var + "/" + str);
                if (!r6Var2.m()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordCacheClean", "file not exist");
                } else if (r6Var2.y()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordCacheClean", "file is directory, don't delete");
                } else if (java.lang.System.currentTimeMillis() - r6Var2.B() > ga3.b.f351372a.longValue()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordCacheClean", "Clean 1 day file in record file name=%s, path:%s", r6Var2.m82467xfb82e301(), r6Var2.o());
                    r6Var2.l();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordCacheClean", "not delete the file, file is in valid time for 1 day");
                }
            }
        }
    }
}
