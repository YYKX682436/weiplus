package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 f179598d;

    public i5(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 activityC13326xc73ec7a9) {
        this.f179598d = activityC13326xc73ec7a9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 activityC13326xc73ec7a9 = this.f179598d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2 g2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2) kz5.n0.a0(activityC13326xc73ec7a9.f179416J, activityC13326xc73ec7a9.K);
        if (g2Var == null) {
            return;
        }
        activityC13326xc73ec7a9.u7();
        if (!g2Var.f179565d.isEmpty()) {
            activityC13326xc73ec7a9.d7().d();
            for (o12.u uVar : g2Var.f179565d) {
                if (uVar.f423721f.isEmpty()) {
                    uVar.f423721f.set(activityC13326xc73ec7a9.b7().m54744xe4c43e8c());
                }
                activityC13326xc73ec7a9.d7().a(uVar);
            }
            android.graphics.Rect rect = g2Var.f179564c;
            int width = rect != null ? rect.width() : ((android.graphics.Rect) activityC13326xc73ec7a9.d7().m54754x4efbe421().mo152xb9724478()).width();
            android.graphics.Rect rect2 = g2Var.f179564c;
            bitmap = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13260x7cd1df1e.c(activityC13326xc73ec7a9.d7(), width, rect2 != null ? rect2.height() : ((android.graphics.Rect) activityC13326xc73ec7a9.d7().m54754x4efbe421().mo152xb9724478()).height(), null, 4, null);
            activityC13326xc73ec7a9.d7().d();
            activityC13326xc73ec7a9.t7();
        } else {
            bitmap = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13326xc73ec7a9 activityC13326xc73ec7a92 = this.f179598d;
        p3325xe03a0797.p3326xc267989b.l.d(activityC13326xc73ec7a92.E, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.h5(activityC13326xc73ec7a92, g2Var, bitmap, activityC13326xc73ec7a92.K, null), 2, null);
        activityC13326xc73ec7a9.N = false;
    }
}
