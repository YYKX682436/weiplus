package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363 f219599d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363 activityC15592x3f0b3363) {
        this.f219599d = activityC15592x3f0b3363;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15592x3f0b3363 activityC15592x3f0b3363 = this.f219599d;
        android.app.Dialog dialog = activityC15592x3f0b3363.S1;
        if (dialog != null) {
            dialog.dismiss();
            activityC15592x3f0b3363.S1 = null;
        }
    }
}
