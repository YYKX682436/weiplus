package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public abstract class x1 {
    public static final java.lang.String a(int i17, java.lang.String uid) {
        kotlin.jvm.internal.o.g(uid, "uid");
        java.lang.String str = is1.l.i() + i17 + '_' + uid + ".html";
        jz5.g gVar = com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.f94488a;
        return str;
    }

    public static final java.lang.String b(int i17, java.lang.String uid, java.lang.String file) {
        kotlin.jvm.internal.o.g(uid, "uid");
        kotlin.jvm.internal.o.g(file, "file");
        java.lang.String str = is1.l.i() + i17 + '_' + uid + '/' + file;
        jz5.g gVar = com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.f94488a;
        return str;
    }
}
