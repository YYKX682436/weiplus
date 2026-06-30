package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.report.d f87824a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f87825b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f87826c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f87827d;

    static {
        com.tencent.mm.plugin.appbrand.report.d dVar = new com.tencent.mm.plugin.appbrand.report.d();
        f87824a = dVar;
        f87825b = new java.util.LinkedList();
        f87826c = dVar.hashCode();
        f87827d = new com.tencent.mm.sdk.platformtools.n3("AppBrandCrossProcessSafeReporter$H", com.tencent.mm.plugin.appbrand.report.a.f87805d);
    }

    public static final void a(com.tencent.mm.plugin.appbrand.report.d dVar, r45.l8 l8Var, java.lang.String str) {
        dVar.getClass();
        java.util.List<r45.m8> list = l8Var != null ? l8Var.f379218d : null;
        if (list == null) {
            list = kz5.p0.f313996d;
        }
        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
            list.size();
        }
        for (r45.m8 m8Var : list) {
            try {
                if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
                    int i17 = m8Var.f380222d;
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.e(m8Var.f380222d, m8Var.f380227i, m8Var.f380223e, m8Var.f380224f, m8Var.f380225g, m8Var.f380226h);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandCrossProcessSafeReporter", "reportMM logid=" + m8Var.f380222d + ", e=" + e17);
            }
        }
    }

    public static final void f(boolean z17) {
        r45.l8 l8Var;
        java.util.LinkedList linkedList = f87825b;
        synchronized (linkedList) {
            l8Var = new r45.l8();
            l8Var.f379218d.addAll(linkedList);
            linkedList.clear();
        }
        f87824a.g(l8Var, z17);
    }

    public final void b(int i17, java.lang.Object... vals) {
        kotlin.jvm.internal.o.g(vals, "vals");
        java.lang.String w17 = com.tencent.mm.plugin.report.service.g0.INSTANCE.w(java.util.Arrays.copyOf(vals, vals.length));
        kotlin.jvm.internal.o.d(w17);
        c(i17, 0, false, false, false, w17);
    }

    public final void c(int i17, int i18, boolean z17, boolean z18, boolean z19, java.lang.String vals) {
        r45.l8 l8Var;
        kotlin.jvm.internal.o.g(vals, "vals");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.getLogLevel();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.e(i17, i18, vals, z17, z18, z19);
            return;
        }
        java.util.LinkedList linkedList = f87825b;
        synchronized (linkedList) {
            r45.m8 m8Var = new r45.m8();
            m8Var.f380222d = i17;
            m8Var.f380223e = vals;
            m8Var.f380224f = z17;
            m8Var.f380225g = z18;
            m8Var.f380226h = z19;
            m8Var.f380227i = i18;
            linkedList.add(m8Var);
            if (linkedList.size() >= 1000) {
                l8Var = new r45.l8();
                l8Var.f379218d.addAll(linkedList);
                linkedList.clear();
            } else {
                l8Var = null;
            }
        }
        boolean z27 = false;
        if (l8Var != null && g(l8Var, false)) {
            z27 = true;
        }
        if (z27) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = f87827d;
            int i19 = f87826c;
            n3Var.removeMessages(i19);
            n3Var.sendEmptyMessageDelayed(i19, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            return;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var2 = f87827d;
        int i27 = f87826c;
        if (n3Var2.hasMessages(i27)) {
            return;
        }
        n3Var2.sendEmptyMessageDelayed(i27, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
    }

    public final void d(int i17, boolean z17, java.lang.Object... vals) {
        kotlin.jvm.internal.o.g(vals, "vals");
        java.lang.String w17 = com.tencent.mm.plugin.report.service.g0.INSTANCE.w(java.util.Arrays.copyOf(vals, vals.length));
        kotlin.jvm.internal.o.d(w17);
        c(i17, 0, false, false, z17, w17);
    }

    public final void e(int i17, int i18, java.lang.Object... vals) {
        kotlin.jvm.internal.o.g(vals, "vals");
        java.lang.String w17 = com.tencent.mm.plugin.report.service.g0.INSTANCE.w(java.util.Arrays.copyOf(vals, vals.length));
        kotlin.jvm.internal.o.d(w17);
        c(i17, i18, false, false, false, w17);
    }

    public final boolean g(r45.l8 l8Var, boolean z17) {
        java.util.LinkedList linkedList = l8Var.f379218d;
        if (linkedList == null || linkedList.isEmpty()) {
            return false;
        }
        if (z17) {
            uk0.a.d(l8Var, com.tencent.mm.plugin.appbrand.report.b.f87810a);
        } else {
            uk0.a.c(l8Var, com.tencent.mm.plugin.appbrand.report.c.f87815d, null, 4, null);
        }
        return true;
    }
}
