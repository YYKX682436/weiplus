package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f269751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 f269752e;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3, java.util.ArrayList arrayList) {
        this.f269752e = activityC19519x7af4daf3;
        this.f269751d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3;
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i18 = 0;
        int i19 = 0;
        while (true) {
            java.util.ArrayList arrayList2 = this.f269751d;
            int size = arrayList2.size();
            activityC19519x7af4daf3 = this.f269752e;
            if (i19 >= size) {
                break;
            }
            java.lang.String str = (java.lang.String) arrayList2.get(i19);
            iz4.f fVar = new iz4.f();
            fVar.f377667r = true;
            fVar.f377666q = 2;
            fVar.f377664o = activityC19519x7af4daf3.J1.j();
            fVar.f377636a = hz4.l.b(fVar.toString(), 18);
            r45.gp0 gp0Var = new r45.gp0();
            activityC19519x7af4daf3.P = gp0Var;
            gp0Var.e0(fVar.f377636a);
            java.lang.String c17 = qz4.c.c(str, hz4.l.c(activityC19519x7af4daf3.P));
            fVar.f377671t = c17;
            fVar.f377668s = qz4.c.d(c17, hz4.l.e(activityC19519x7af4daf3.P));
            arrayList.add(fVar);
            i19++;
        }
        android.app.ProgressDialog progressDialog = activityC19519x7af4daf3.M;
        if (progressDialog == null || !progressDialog.isShowing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "user canceled");
            return;
        }
        mz4.j0 j0Var = activityC19519x7af4daf3.f269680m;
        mz4.d dVar = activityC19519x7af4daf3.J1;
        dVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a d17 = j0Var.d();
        if (d17 != null) {
            i18 = d17.m74969x1c481d6b();
            i17 = d17.f269647l1;
        } else {
            i17 = -1;
        }
        if (!dVar.s(arrayList, i18, i17, d17)) {
            activityC19519x7af4daf3.J1.u(arrayList, activityC19519x7af4daf3.f269680m.d(), true, true, false, true, false);
        }
        activityC19519x7af4daf3.z7(true, 100L);
        activityC19519x7af4daf3.y7(1, 0L);
    }
}
