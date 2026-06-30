package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes3.dex */
public class n2 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f228748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d f228749b;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d, android.app.Dialog dialog) {
        this.f228749b = activityC16363x8a0a619d;
        this.f228748a = dialog;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        android.app.Dialog dialog = this.f228748a;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "fetch detail failed: %s", obj);
        if (obj != null) {
            boolean z17 = obj instanceof java.lang.String;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = this.f228749b;
            dp.a.m125854x26a183b(activityC16363x8a0a619d.mo55332x76847179(), z17 ? obj.toString() : activityC16363x8a0a619d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kpu), 1).show();
        }
    }
}
