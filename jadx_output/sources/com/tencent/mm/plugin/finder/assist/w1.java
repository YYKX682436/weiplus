package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class w1 {
    public w1(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a() {
        java.lang.String str = com.tencent.mm.vfs.q7.c("finder") + '/';
        com.tencent.mars.xlog.Log.i("CoverResultHelper", "FINDER_DATA_ROOT=" + str);
        java.lang.String str2 = str + "image/";
        com.tencent.mars.xlog.Log.i("CoverResultHelper", "FINDER_IMG_DIR=" + str2);
        return str2 + "cover_edit_for_output";
    }
}
