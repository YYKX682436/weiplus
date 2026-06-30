package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.d f269718d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.d dVar) {
        this.f269718d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.d dVar = this.f269718d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = dVar.f269722d;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3.f269673e2;
        activityC19519x7af4daf3.j7();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
        am.z9 z9Var = c5432x35bb364f.f135776g;
        z9Var.f90061a = 32;
        z9Var.f90065e = dVar.f269722d.A;
        c5432x35bb364f.e();
        am.aa aaVar = c5432x35bb364f.f135777h;
        boolean z17 = aaVar.f87675i;
        boolean z18 = aaVar.f87667a != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "filter itemInfo localId:%s isPause:%s ret:%s", java.lang.Long.valueOf(dVar.f269722d.A), java.lang.Boolean.valueOf(aaVar.f87675i), java.lang.Integer.valueOf(aaVar.f87667a));
        if (aaVar.f87669c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "[handleShareToFriend] path = null");
            db5.e1.T(dVar.f269722d.mo55332x76847179(), dVar.f269722d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cck));
            return;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "[handleShareToFriend] notDownload");
            db5.e1.T(dVar.f269722d.mo55332x76847179(), dVar.f269722d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571242i));
            return;
        }
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "[handleShareToFriend] notUpload");
            db5.e1.T(dVar.f269722d.mo55332x76847179(), dVar.f269722d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571243j));
            return;
        }
        long h17 = ip.c.h();
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf32 = dVar.f269722d;
        long j17 = activityC19519x7af4daf32.A;
        activityC19519x7af4daf32.getClass();
        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
        long j18 = F != null ? F.f67637x73e2be56 : 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "note2Send, totalSize:%s", java.lang.Long.valueOf(j18));
        if (j18 > h17) {
            db5.e1.T(dVar.f269722d.mo55332x76847179(), dVar.f269722d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572765cf0, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(h17)));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("scene_from", 1);
        intent.putExtra("mutil_select_is_ret", true);
        intent.putExtra("select_fav_local_id", dVar.f269722d.A);
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3.a7(dVar.f269722d, intent);
        j45.l.v(dVar.f269722d, ".ui.transmit.SelectConversationUI", intent, 4102);
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf33 = dVar.f269722d;
        activityC19519x7af4daf33.X6(activityC19519x7af4daf33.A, 1, 0);
        ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).qc(5);
        dVar.f269722d.f182133g.f425020l++;
    }
}
