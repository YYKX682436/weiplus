package com.tencent.mm.plugin.appbrand.video.player.thumb;

/* loaded from: classes10.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f90867a;

    static {
        java.lang.String str = com.tencent.mm.vfs.q7.c("finder") + '/';
        com.tencent.mars.xlog.Log.i("MMPMediaFileCachePathRouter", "FINDER_DATA_ROOT=" + str);
        com.tencent.mars.xlog.Log.i("MMPMediaFileCachePathRouter", "FINDER_LIVE_ROOT=" + (com.tencent.mm.vfs.q7.c("live") + '/'));
        com.tencent.mars.xlog.Log.i("MMPMediaFileCachePathRouter", "FINDER_POSTING_ROOT=" + (com.tencent.mm.vfs.q7.c("finderposting") + '/'));
        java.lang.String str2 = str + "video/";
        com.tencent.mars.xlog.Log.i("MMPMediaFileCachePathRouter", "FINDER_VIDEO_DIR=" + str2);
        f90867a = str2;
    }
}
