package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f269797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 f269798e;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3, boolean z17) {
        this.f269798e = activityC19519x7af4daf3;
        this.f269797d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = this.f269798e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "onUpdateVKBVisibility 2 isVKBShow:%s", java.lang.Boolean.valueOf(activityC19519x7af4daf3.N));
        boolean z17 = this.f269797d;
        if (z17 && !activityC19519x7af4daf3.N) {
            activityC19519x7af4daf3.mo26063x7b383410();
        } else {
            if (z17 || !activityC19519x7af4daf3.N) {
                return;
            }
            activityC19519x7af4daf3.mo48674x36654fab();
        }
    }
}
