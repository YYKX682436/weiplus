package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class y8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.extension.reddot.y8 f106036a = new com.tencent.mm.plugin.finder.extension.reddot.y8();

    public final boolean a(java.lang.String source, java.lang.String path) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(path, "path");
        try {
            return b(source, path);
        } catch (c01.c e17) {
            com.tencent.mars.xlog.Log.e("Finder.RedDotManagerPathChecker", ya.b.SOURCE + source + ' ' + path + ' ' + e17.getMessage());
            return true;
        } catch (java.lang.IllegalStateException e18) {
            com.tencent.mars.xlog.Log.e("Finder.RedDotManagerPathChecker", ya.b.SOURCE + source + ' ' + path + "  " + e18.getMessage());
            return true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.y8.b(java.lang.String, java.lang.String):boolean");
    }
}
