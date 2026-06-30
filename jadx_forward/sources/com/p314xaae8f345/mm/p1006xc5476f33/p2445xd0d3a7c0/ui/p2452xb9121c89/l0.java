package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class l0 implements mz4.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 f269766a;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3) {
        this.f269766a = activityC19519x7af4daf3;
    }

    @Override // mz4.q
    public void a(java.lang.String str, iz4.k kVar) {
        int i17;
        com.p314xaae8f345.mm.vfs.x1 m17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "compressNoteVideo onExportFinish");
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = this.f269766a;
        android.app.ProgressDialog progressDialog = activityC19519x7af4daf3.M;
        if (progressDialog != null) {
            progressDialog.dismiss();
            activityC19519x7af4daf3.M = null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !com.p314xaae8f345.mm.vfs.w6.j(str) || kVar == null || kVar.f377653w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "file not exist or user canceled");
        } else {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            int i18 = 0;
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).getClass();
            long g17 = ip.c.g();
            int vj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).vj();
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (((m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) ? m17.f294766c : 0L) < g17) {
                kVar.f377668s = str;
                com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.k0 k0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.k0(this, kVar);
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
                if (!dVar.s(k0Var, i18, i17, d17)) {
                    activityC19519x7af4daf3.J1.t(kVar, activityC19519x7af4daf3.f269680m.d(), true, true, false, true, false);
                }
            } else {
                dp.a.m125854x26a183b(activityC19519x7af4daf3.mo55332x76847179(), activityC19519x7af4daf3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cds, java.lang.Integer.valueOf(vj6)), 1).show();
            }
        }
        activityC19519x7af4daf3.z7(true, 100L);
        activityC19519x7af4daf3.y7(1, 0L);
    }

    @Override // mz4.q
    public void b(java.lang.String str, iz4.k kVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "compressNoteVideo onImportFinish");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !com.p314xaae8f345.mm.vfs.w6.j(str) || kVar == null) {
            return;
        }
        kVar.f377650t = str;
    }
}
