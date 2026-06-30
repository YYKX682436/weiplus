package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes3.dex */
public class s4 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f239465a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 f239466b;

    public s4(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d21883, android.app.Dialog dialog) {
        this.f239466b = activityC17133x39d21883;
        this.f239465a = dialog;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        android.app.Dialog dialog = this.f239465a;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailUI", "fetch detail failed: %s", obj);
        if (obj != null) {
            boolean z17 = obj instanceof java.lang.String;
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d21883 = this.f239466b;
            dp.a.m125854x26a183b(activityC17133x39d21883, z17 ? obj.toString() : activityC17133x39d21883.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kpu), 1).show();
        }
    }
}
