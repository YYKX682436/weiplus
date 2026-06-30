package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f269807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f269808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 f269809f;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3, int i17, int i18) {
        this.f269809f = activityC19519x7af4daf3;
        this.f269807d = i17;
        this.f269808e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f269808e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = this.f269809f;
        int i18 = this.f269807d;
        int i19 = i18 + i17;
        try {
            int mo1894x7e414b06 = activityC19519x7af4daf3.f269682o.mo1894x7e414b06();
            if (i18 >= mo1894x7e414b06 || i19 >= mo1894x7e414b06) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "[protected batch change] correct position = " + i18 + ", change end = " + i19 + ", item count = " + activityC19519x7af4daf3.f269682o.mo1894x7e414b06());
            } else {
                activityC19519x7af4daf3.f269682o.m8151xc67946d3(i18, i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "[protected batch change] correct insert start = " + i18 + ", change end = " + i19 + ", item count = " + activityC19519x7af4daf3.f269682o.mo1894x7e414b06());
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Note.NoteEditorUI", "onNotifyItemRangeChanged error,positionStart:%d,count:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        }
    }
}
