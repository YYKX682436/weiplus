package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f269761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269762f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f269763g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.bq0 f269764h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 f269765i;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3, java.lang.String str, int i17, java.lang.String str2, long j17, r45.bq0 bq0Var) {
        this.f269765i = activityC19519x7af4daf3;
        this.f269760d = str;
        this.f269761e = i17;
        this.f269762f = str2;
        this.f269763g = j17;
        this.f269764h = bq0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "saveWNNoteFavitem");
        this.f269765i.A7(this.f269760d, true, false, this.f269761e, this.f269762f, this.f269763g, this.f269764h);
    }
}
