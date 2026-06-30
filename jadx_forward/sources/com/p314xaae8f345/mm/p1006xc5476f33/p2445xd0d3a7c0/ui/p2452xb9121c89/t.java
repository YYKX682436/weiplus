package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f269801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f269802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 f269803f;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3, int i17, int i18) {
        this.f269803f = activityC19519x7af4daf3;
        this.f269801d = i17;
        this.f269802e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f269802e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = this.f269803f;
        int i18 = this.f269801d;
        int i19 = i18 + i17;
        try {
            int mo1894x7e414b06 = activityC19519x7af4daf3.f269682o.mo1894x7e414b06();
            if (i18 >= mo1894x7e414b06 || i19 >= mo1894x7e414b06) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "[protected batch insert] correct position = " + i18 + ", insert end = " + i19 + ", item count = " + activityC19519x7af4daf3.f269682o.mo1894x7e414b06());
            } else {
                activityC19519x7af4daf3.f269682o.m8153xd399a4d9(i18, i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "[protected batch insert] correct insert start = " + i18 + ", insert end = " + i19 + ", item count = " + activityC19519x7af4daf3.f269682o.mo1894x7e414b06());
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Note.NoteEditorUI", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Note.NoteEditorUI", "onNotifyitemRangeInsert error,positionStart:%d,count:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        }
    }
}
