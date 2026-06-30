package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15591x5482e11c f219558d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15591x5482e11c activityC15591x5482e11c) {
        this.f219558d = activityC15591x5482e11c;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15591x5482e11c activityC15591x5482e11c = this.f219558d;
        android.app.Dialog dialog = activityC15591x5482e11c.L;
        if (dialog != null) {
            dialog.dismiss();
            activityC15591x5482e11c.L = null;
        }
    }
}
