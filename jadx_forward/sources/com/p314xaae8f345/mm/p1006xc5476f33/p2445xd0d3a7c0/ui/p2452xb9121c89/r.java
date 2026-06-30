package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f269791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 f269792e;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3, int i17) {
        this.f269792e = activityC19519x7af4daf3;
        this.f269791d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = this.f269792e;
        int i17 = this.f269791d;
        try {
            if (i17 < activityC19519x7af4daf3.f269682o.mo1894x7e414b06()) {
                activityC19519x7af4daf3.f269682o.m8155x27702c4(i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "[protected remove] correct position = " + i17 + ", item count = " + activityC19519x7af4daf3.f269682o.mo1894x7e414b06());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Note.NoteEditorUI", "[protected remove] error position = " + i17 + ", item count = " + activityC19519x7af4daf3.f269682o.mo1894x7e414b06());
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Note.NoteEditorUI", "onNotifyItemRemoved error,positionStart:%d", java.lang.Integer.valueOf(i17));
        }
    }
}
