package wl2;

/* loaded from: classes5.dex */
public abstract class e {
    public static final void a(java.lang.String zipFilePath, java.lang.String unzipFolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(zipFilePath, "zipFilePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unzipFolder, "unzipFolder");
        if (!(zipFilePath.length() == 0)) {
            if (!(unzipFolder.length() == 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveUnZip", "checkAndUnzip zipFilePath:" + zipFilePath + " unzipFolder: " + unzipFolder);
                if ((zipFilePath.length() == 0) || !com.p314xaae8f345.mm.vfs.w6.j(zipFilePath)) {
                    return;
                }
                java.lang.String concat = unzipFolder.concat("_temp");
                com.p314xaae8f345.mm.vfs.w6.f(concat);
                com.p314xaae8f345.mm.vfs.w6.f(unzipFolder);
                com.p314xaae8f345.mm.vfs.w6.u(concat);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveUnZip", "unZip result unzipStatus: " + com.p314xaae8f345.mm.vfs.w6.Q(zipFilePath, concat) + " moveDirStatus: " + com.p314xaae8f345.mm.vfs.w6.v(concat, unzipFolder));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveUnZip", "unZip fail path empty, zipFilePath: " + zipFilePath + " unzipFolder: " + unzipFolder);
    }
}
