package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes12.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f234668d;

    public u(long j17) {
        this.f234668d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.vfs.r6 r6Var;
        com.p314xaae8f345.mm.vfs.r6 r6Var2;
        com.p314xaae8f345.mm.vfs.q2 b17 = ((com.p314xaae8f345.mm.vfs.r5) com.p314xaae8f345.mm.vfs.a3.f294314a.a()).b("hprofs");
        if (b17 != null) {
            b17.q(new android.os.CancellationSignal());
        }
        java.lang.String format = ((java.text.SimpleDateFormat) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w.f234683g).mo141623x754a37bb()).format(java.util.Calendar.getInstance().getTime());
        try {
            r6Var = com.p314xaae8f345.mm.vfs.r6.j(xi.k.f536194e.f("MLP", false));
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.MemoryLimitPublisher", th6, "", new java.lang.Object[0]);
            r6Var = null;
        }
        if (r6Var != null) {
            if (r6Var.m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MemoryLimitPublisher", "HPROF file exists, delete and recreate: %s", r6Var.o());
                r6Var.l();
            }
            r6Var2 = r6Var;
        } else {
            r6Var2 = null;
        }
        if (r6Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MemoryLimitPublisher", "prepare hprof file failed, see log above");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MemoryLimitPublisher", "start fork dump heap: %s", r6Var2.o());
        byte[] bArr = com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.f181284a;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        try {
            java.lang.String u17 = r6Var2.u();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "getPath(...)");
            if (com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.C4705xed2494c3.h(u17, 600L)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MemoryLimitPublisher", "dump heap success");
                com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w wVar = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w.f234677a;
                java.lang.String o17 = r6Var2.o();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.s sVar = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.s.f234654e;
                long j17 = this.f234668d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
                com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w.c(wVar, o17, sVar, j17, format);
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w.f234678b) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MemoryLimitPublisher", "copy to external cache");
                    sp3.d.b(new com.p314xaae8f345.mm.vfs.r6(r6Var2.o()));
                } else {
                    int m82468x8cdac1b = r6Var2.m82468x8cdac1b();
                    long j18 = this.f234668d;
                    java.lang.String o18 = r6Var2.o();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w.b(wVar, m82468x8cdac1b, j18, o18);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MemoryLimitPublisher", "dump heap failed");
                com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w wVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w.f234677a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.s sVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.s.f234655f;
                long j19 = this.f234668d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
                com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w.c(wVar2, "[dump failed]", sVar2, j19, format);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w.f234679c.set(false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MemoryLimitPublisher", e17, "dump heap failed with exception", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w wVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w.f234677a;
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTraceString, "getStackTraceString(...)");
            java.lang.String t17 = r26.i0.t(r26.i0.u(stackTraceString, '\n', ';', false, 4, null), "\t", "", false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.s sVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.s.f234656g;
            long j27 = this.f234668d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w.c(wVar3, t17, sVar3, j27, format);
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w.f234679c.set(false);
        }
    }
}
