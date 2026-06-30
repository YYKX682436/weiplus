package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes.dex */
public abstract class w1 {
    public static void a(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mars.xlog.Log.getLogLevel() == 0 && z65.c.a()) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.brandservice.ui.timeline.preload.v1(str2));
        }
        com.tencent.mars.xlog.Log.i(str, str2);
    }
}
