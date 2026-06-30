package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee f219645d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee activityC15588x58c11aee) {
        this.f219645d = activityC15588x58c11aee;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee activityC15588x58c11aee = this.f219645d;
        android.app.Dialog dialog = activityC15588x58c11aee.f219415x0;
        if (dialog != null) {
            dialog.dismiss();
            activityC15588x58c11aee.f219415x0 = null;
        }
    }
}
