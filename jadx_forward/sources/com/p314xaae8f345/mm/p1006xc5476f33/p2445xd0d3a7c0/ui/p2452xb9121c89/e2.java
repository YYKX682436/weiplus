package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class e2 implements gh5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 f269733a;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3) {
        this.f269733a = activityC19519x7af4daf3;
    }

    @Override // gh5.a
    public void b(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onKeyboardChangeAfter newKeyboardState=");
        sb6.append(z17);
        sb6.append(" contentHeight=");
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = this.f269733a;
        sb6.append(activityC19519x7af4daf3.f269681n.getMeasuredHeight());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", sb6.toString());
        activityC19519x7af4daf3.N = z17;
        if (z17 && !activityC19519x7af4daf3.F7()) {
            activityC19519x7af4daf3.y7(1, 0L);
        }
        if (activityC19519x7af4daf3.C1) {
            activityC19519x7af4daf3.E7();
        }
    }
}
