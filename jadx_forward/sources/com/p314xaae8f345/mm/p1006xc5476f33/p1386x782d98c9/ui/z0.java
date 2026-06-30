package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes15.dex */
public class z0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.a1 f181266d;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.a1 a1Var) {
        this.f181266d = a1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "On progress cancel, stop airkiss");
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13462x5ea70b8a activityC13462x5ea70b8a = this.f181266d.f180930d;
        if (activityC13462x5ea70b8a.C != com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s1.FINISH) {
            activityC13462x5ea70b8a.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.jni.C13411x69f9c21c.m55036x65e0ef62();
            activityC13462x5ea70b8a.Z6(true);
            if (activityC13462x5ea70b8a.F.isHeld()) {
                activityC13462x5ea70b8a.F.release();
            }
        }
    }
}
