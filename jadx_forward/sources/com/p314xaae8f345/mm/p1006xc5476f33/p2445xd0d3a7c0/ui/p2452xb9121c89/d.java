package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 f269722d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3) {
        this.f269722d = activityC19519x7af4daf3;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.bq0 bq0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = this.f269722d;
        mz4.d dVar = activityC19519x7af4daf3.J1;
        java.lang.String p17 = dVar.p(true);
        if (activityC19519x7af4daf3.f7(p17)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
            am.z9 z9Var = c5432x35bb364f.f135776g;
            z9Var.f90061a = 12;
            z9Var.f90080t = 23;
            z9Var.f90065e = activityC19519x7af4daf3.A;
            c5432x35bb364f.e();
        } else {
            if (activityC19519x7af4daf3.G || activityC19519x7af4daf3.E) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "syncWNNoteFavItem noteeditorui, do savewnnotefavitem %s", java.lang.Long.valueOf(activityC19519x7af4daf3.A));
                mz4.j0 j0Var = activityC19519x7af4daf3.f269680m;
                activityC19519x7af4daf3.A7(p17, true, true, j0Var.f414839n, j0Var.f414840o, j0Var.f414841p, dVar.n(p17));
            } else if (activityC19519x7af4daf3.F) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "syncWNNoteFavItem noteeditorui, do updateWNNoteFavitem %s", java.lang.Long.valueOf(activityC19519x7af4daf3.A));
                mz4.j0 j0Var2 = activityC19519x7af4daf3.f269680m;
                activityC19519x7af4daf3.A7(p17, false, true, j0Var2.f414839n, j0Var2.f414840o, j0Var2.f414841p, dVar.n(p17));
            } else {
                activityC19519x7af4daf3.G7(false);
            }
            activityC19519x7af4daf3.f269700z1 = true;
        }
        if (activityC19519x7af4daf3.V1 == null) {
            return;
        }
        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(activityC19519x7af4daf3.A);
        if (F != null && (bq0Var = F.f67640x5ab01132) != null) {
            java.util.Iterator it = bq0Var.f452497f.iterator();
            while (it.hasNext()) {
                r45.gp0 gp0Var = (r45.gp0) it.next();
                if (gp0Var.I == 3 && (gp0Var.f456968s2 != 0 || gp0Var.V1 != 0)) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.b(this));
                    return;
                }
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.c(this));
    }
}
