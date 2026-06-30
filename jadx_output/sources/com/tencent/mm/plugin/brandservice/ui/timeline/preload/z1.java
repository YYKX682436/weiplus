package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public abstract class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f94488a = jz5.h.b(com.tencent.mm.plugin.brandservice.ui.timeline.preload.y1.f94483d);

    public static final java.lang.String a(r45.vm6 vm6Var) {
        kotlin.jvm.internal.o.g(vm6Var, "<this>");
        int i17 = vm6Var.f388372d;
        java.lang.String Uid = vm6Var.f388380o;
        kotlin.jvm.internal.o.f(Uid, "Uid");
        java.lang.String b17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.x1.b(i17, Uid, "");
        if (h(b17)) {
            return b17;
        }
        int i18 = vm6Var.f388372d;
        java.lang.String Uid2 = vm6Var.f388380o;
        kotlin.jvm.internal.o.f(Uid2, "Uid");
        return com.tencent.mm.plugin.brandservice.ui.timeline.preload.x1.a(i18, Uid2);
    }

    public static final java.lang.String b(r45.vm6 vm6Var) {
        kotlin.jvm.internal.o.g(vm6Var, "<this>");
        int i17 = vm6Var.f388372d;
        java.lang.String Uid = vm6Var.f388380o;
        kotlin.jvm.internal.o.f(Uid, "Uid");
        java.lang.String b17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.x1.b(i17, Uid, "index.html");
        if (h(b17)) {
            return b17;
        }
        int i18 = vm6Var.f388372d;
        java.lang.String Uid2 = vm6Var.f388380o;
        kotlin.jvm.internal.o.f(Uid2, "Uid");
        return com.tencent.mm.plugin.brandservice.ui.timeline.preload.x1.a(i18, Uid2);
    }

    public static final java.lang.String c(r45.vm6 vm6Var) {
        kotlin.jvm.internal.o.g(vm6Var, "<this>");
        return "_tmpl_info_latest_verified_-" + vm6Var.f388372d + '-' + vm6Var.f388382q;
    }

    public static final java.lang.String d(r45.vm6 vm6Var) {
        kotlin.jvm.internal.o.g(vm6Var, "<this>");
        return "_tmpl_info_latest_verified_time_-" + vm6Var.f388372d + '-' + vm6Var.f388382q;
    }

    public static final java.lang.String e(r45.vm6 vm6Var) {
        kotlin.jvm.internal.o.g(vm6Var, "<this>");
        return "_tmpl_info_-" + vm6Var.f388372d + '-' + vm6Var.f388380o;
    }

    public static final java.lang.String f(r45.vm6 vm6Var) {
        kotlin.jvm.internal.o.g(vm6Var, "<this>");
        return "_tmpl_info_version_list_-" + vm6Var.f388372d + '-' + vm6Var.f388382q;
    }

    public static final com.tencent.mm.sdk.platformtools.o4 g() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("_webview_tmpl_info");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        return M;
    }

    public static final boolean h(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        return l(str).m();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean i(java.lang.String r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.g(r2, r0)
            com.tencent.mm.vfs.r6 r2 = l(r2)
            boolean r0 = r2.y()
            if (r0 == 0) goto L2d
            boolean r0 = r2.m()
            r1 = 0
            if (r0 == 0) goto L31
            com.tencent.mm.vfs.r6[] r2 = r2.G()
            r0 = 1
            if (r2 == 0) goto L28
            int r2 = r2.length
            if (r2 != 0) goto L22
            r2 = r0
            goto L23
        L22:
            r2 = r1
        L23:
            if (r2 == 0) goto L26
            goto L28
        L26:
            r2 = r1
            goto L29
        L28:
            r2 = r0
        L29:
            if (r2 != 0) goto L31
            r1 = r0
            goto L31
        L2d:
            boolean r1 = r2.m()
        L31:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.i(java.lang.String):boolean");
    }

    public static final boolean j(r45.vm6 vm6Var) {
        kotlin.jvm.internal.o.g(vm6Var, "<this>");
        return vm6Var.f388373e != 0;
    }

    public static final boolean k(r45.vm6 vm6Var) {
        kotlin.jvm.internal.o.g(vm6Var, "<this>");
        java.lang.String b17 = b(vm6Var);
        int i17 = vm6Var.f388372d;
        java.lang.String Uid = vm6Var.f388380o;
        kotlin.jvm.internal.o.f(Uid, "Uid");
        return kotlin.jvm.internal.o.b(b17, com.tencent.mm.plugin.brandservice.ui.timeline.preload.x1.b(i17, Uid, "index.html"));
    }

    public static final com.tencent.mm.vfs.r6 l(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        return new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
    }
}
