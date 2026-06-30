package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class f implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 f269734d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3) {
        this.f269734d = activityC19519x7af4daf3;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Long valueOf = java.lang.Long.valueOf(currentTimeMillis);
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = this.f269734d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "startnoteeditorui, onGlobalLayout, current time is %d,from oncreate to dataloading, cost %d", valueOf, java.lang.Long.valueOf(currentTimeMillis - activityC19519x7af4daf3.f269685p1));
        gm0.j1.e().k(new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.e(this), activityC19519x7af4daf3.f269697y0 == 1 ? 100L : 0L);
        activityC19519x7af4daf3.f269681n.getViewTreeObserver().removeGlobalOnLayoutListener(activityC19519x7af4daf3.P1);
    }
}
