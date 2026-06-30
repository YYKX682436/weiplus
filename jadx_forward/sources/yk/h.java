package yk;

@j95.b
/* loaded from: classes12.dex */
public final class h extends i95.w implements pt0.p {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f544280d = "MicroMsg.DBDataCleanService";

    public h() {
        jz5.h.b(new yk.e(this));
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pt0.f0.f439742b1.getClass();
        if (((java.lang.Boolean) ((jz5.n) pt0.e0.f439727b).mo141623x754a37bb()).booleanValue()) {
            try {
                b5.w.c(context);
                z17 = true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f544280d, "checkWorkManagerInit error", e17);
                z17 = false;
            }
            if (!z17) {
                return;
            }
            yk.o oVar = com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5088x5a5b06bb.f135231m;
            com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5088x5a5b06bb.f135233o = kz5.c0.i(yk.u.class, yk.b.class, yk.b0.class, yk.f0.class, yk.d0.class, yk.d.class);
            if (((java.lang.Number) ((jz5.n) com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5088x5a5b06bb.f135232n).mo141623x754a37bb()).intValue() != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBDataCleanWorkManger", "[WorkManager]startAutoDBDataClean closed.");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBDataCleanWorkManger", "use workManager.");
                long c17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2550x9e95ebc3.C20482xe8c4ed08()) * 60 * 1000;
                if (com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5088x5a5b06bb.f135234p == c17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBDataCleanWorkManger", "startAutoDBDataClean, timeThreshold not changed");
                } else {
                    com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5088x5a5b06bb.f135234p = c17;
                    long c18 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2550x9e95ebc3.C20480xf5e6070d()) * 60 * 1000;
                    if (c18 <= 0) {
                        java.util.Calendar calendar = java.util.Calendar.getInstance();
                        calendar.setTimeInMillis(java.lang.System.currentTimeMillis());
                        calendar.set(11, 1);
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        if (calendar.getTimeInMillis() <= java.lang.System.currentTimeMillis()) {
                            calendar.add(6, 1);
                        }
                        c18 = (calendar.getTimeInMillis() - java.lang.System.currentTimeMillis()) + 300000;
                    }
                    long j17 = com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5088x5a5b06bb.f135234p;
                    java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                    a5.t0 a17 = ((a5.l0) new a5.l0(com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5088x5a5b06bb.class, j17, timeUnit).e(c18, timeUnit)).a();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "build(...)");
                    new b5.h(b5.w.c(context), "auto_db_data_clean", a5.n.REPLACE, java.util.Collections.singletonList((a5.m0) a17)).a();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBDataCleanWorkManger", "enqueue work, initialDelay: " + c18);
                }
            }
        }
        ((ku5.t0) ku5.t0.f394148d).h(new yk.w(context), "MicroMsg.MsgRefactorReportService");
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if ((1 <= r0 && r0 <= 7) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void wi(android.content.Context r4, boolean r5) {
        /*
            r3 = this;
            pt0.e0 r0 = pt0.f0.f439742b1
            r0.getClass()
            jz5.g r0 = pt0.e0.f439727b
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.mo141623x754a37bb()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2b
            yk.o r0 = com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5088x5a5b06bb.f135231m
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 11
            int r0 = r0.get(r1)
            r1 = 1
            if (r1 > r0) goto L28
            r2 = 7
            if (r0 > r2) goto L28
            goto L29
        L28:
            r1 = 0
        L29:
            if (r1 != 0) goto L2d
        L2b:
            if (r5 == 0) goto L39
        L2d:
            ku5.u0 r5 = ku5.t0.f394148d
            yk.f r0 = new yk.f
            r0.<init>(r4)
            ku5.t0 r5 = (ku5.t0) r5
            r5.g(r0)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.h.wi(android.content.Context, boolean):void");
    }
}
