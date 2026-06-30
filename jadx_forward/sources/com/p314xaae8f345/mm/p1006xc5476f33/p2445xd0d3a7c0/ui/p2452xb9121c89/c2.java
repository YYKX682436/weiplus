package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class c2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 f269721d;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3) {
        this.f269721d = activityC19519x7af4daf3;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        boolean z17;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3.f269673e2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = this.f269721d;
        tz4.l lVar = activityC19519x7af4daf3.f269686q;
        if (lVar == null || !lVar.f504892e) {
            z17 = true;
        } else {
            activityC19519x7af4daf3.w7();
            z17 = false;
        }
        if (!z17) {
            return true;
        }
        activityC19519x7af4daf3.g7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "back btn click, bReadEnd=%b", java.lang.Boolean.valueOf(activityC19519x7af4daf3.I1));
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2451xb81dc63e.e eVar = activityC19519x7af4daf3.G1;
        if (eVar != null) {
            if (eVar.c0(1, activityC19519x7af4daf3.J1.r(activityC19519x7af4daf3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_l)), activityC19519x7af4daf3.I1)) {
                return true;
            }
        }
        cz4.f fVar = activityC19519x7af4daf3.F1;
        if (fVar != null && fVar.m0(1)) {
            return true;
        }
        activityC19519x7af4daf3.m7(1);
        activityC19519x7af4daf3.finish();
        return true;
    }
}
