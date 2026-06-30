package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes10.dex */
public final class w5 implements android.app.Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x5.f206970b.length() > 0) {
            java.lang.String localClassName = activity.getLocalClassName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(localClassName, "getLocalClassName(...)");
            if (r26.n0.B(localClassName, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x5.f206970b, false)) {
                long c17 = c01.id.c();
                if (c17 - com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x5.f206969a > u04.d.f505010c) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t5 t5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x5.f206970b);
                t5Var.f206900b = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x5.f206969a;
                t5Var.f206901c = c17;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x5.f206972d = t5Var;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x5.f206969a = 0L;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x5.f206970b = "";
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t5 t5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x5.f206972d;
        if (t5Var != null) {
            java.lang.String localClassName = activity.getLocalClassName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(localClassName, "getLocalClassName(...)");
            boolean z17 = false;
            if (r26.n0.B(localClassName, t5Var.f206899a, false) && t5Var.f206903e == 0) {
                z17 = true;
            }
            if (!z17) {
                t5Var = null;
            }
            if (t5Var != null) {
                t5Var.f206903e = c01.id.c();
                activity.getWindow().getDecorView().post(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v5.f206941d);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r3 != false) goto L12;
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityStarted(android.app.Activity r9) {
        /*
            r8 = this;
            java.lang.String r0 = "activity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            com.tencent.mm.plugin.finder.report.t5 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x5.f206972d
            r1 = 0
            if (r0 == 0) goto L28
            java.lang.String r9 = r9.getLocalClassName()
            java.lang.String r2 = "getLocalClassName(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r9, r2)
            java.lang.String r2 = r0.f206899a
            r3 = 0
            boolean r9 = r26.n0.B(r9, r2, r3)
            if (r9 == 0) goto L25
            long r4 = r0.f206902d
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L25
            r3 = 1
        L25:
            if (r3 == 0) goto L28
            goto L29
        L28:
            r0 = r1
        L29:
            if (r0 != 0) goto L2c
            goto L32
        L2c:
            long r1 = c01.id.c()
            r0.f206902d = r1
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w5.onActivityStarted(android.app.Activity):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }
}
