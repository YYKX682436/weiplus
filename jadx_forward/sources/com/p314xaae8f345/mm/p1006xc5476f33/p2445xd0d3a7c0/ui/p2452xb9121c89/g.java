package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class g implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 f269738d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3) {
        this.f269738d = activityC19519x7af4daf3;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mOnGlobalLayoutComplaintListener scrollRange:");
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = this.f269738d;
        sb6.append(activityC19519x7af4daf3.f269681n.computeVerticalScrollRange());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", sb6.toString());
        if (activityC19519x7af4daf3.f269690u != null) {
            if (activityC19519x7af4daf3.f269681n.computeVerticalScrollRange() + activityC19519x7af4daf3.f269690u.getMeasuredHeight() <= activityC19519x7af4daf3.f269681n.getMeasuredHeight()) {
                activityC19519x7af4daf3.f269690u.setVisibility(0);
                return;
            }
            rz4.b bVar = activityC19519x7af4daf3.f269682o;
            bVar.f483354h = true;
            bVar.m8146xced61ae5();
            activityC19519x7af4daf3.f269690u.setVisibility(8);
            activityC19519x7af4daf3.f269681n.getViewTreeObserver().removeOnGlobalLayoutListener(activityC19519x7af4daf3.Q1);
        }
    }
}
