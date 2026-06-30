package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 f269813d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3) {
        this.f269813d = activityC19519x7af4daf3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = this.f269813d;
        try {
            activityC19519x7af4daf3.f269682o.m8146xced61ae5();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Note.NoteEditorUI", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteEditorUI", "onNotifyDataChanged error");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2451xb81dc63e.e eVar = activityC19519x7af4daf3.G1;
        if (eVar != null) {
            int i17 = ((hz4.f) hz4.f.wi()).f367940d.f367956q;
            java.lang.String jsonData = ((hz4.f) hz4.f.wi()).f367940d.f367955p;
            java.lang.String title = activityC19519x7af4daf3.J1.r(activityC19519x7af4daf3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_l));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonData, "jsonData");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
            eVar.f269666y = i17;
            eVar.f269667z = jsonData;
            eVar.A = title;
        }
    }
}
