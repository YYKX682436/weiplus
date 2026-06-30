package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f269787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 f269788e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3, int i17) {
        this.f269788e = activityC19519x7af4daf3;
        this.f269787d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f269787d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = this.f269788e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "huahuastart: onNotifyItemChanged,position is %d %s", valueOf, java.lang.Long.valueOf(activityC19519x7af4daf3.A));
        if (i17 < activityC19519x7af4daf3.f269682o.mo1894x7e414b06()) {
            activityC19519x7af4daf3.f269682o.m8147xed6e4d18(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "[protected change] correct position = " + i17 + ", item count = " + activityC19519x7af4daf3.f269682o.mo1894x7e414b06());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Note.NoteEditorUI", "[protected change] error position = " + i17 + ", item count = " + activityC19519x7af4daf3.f269682o.mo1894x7e414b06());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "huahuaend: onNotifyItemChanged,position is %d", java.lang.Integer.valueOf(i17));
    }
}
