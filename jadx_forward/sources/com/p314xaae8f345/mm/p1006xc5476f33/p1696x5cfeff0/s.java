package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0;

/* loaded from: classes14.dex */
public class s implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f218783d;

    public s(android.app.Activity activity) {
        this.f218783d = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        vz2.c.k("msgVerify", "camera or mic 正在被占用");
        vz2.c.b().B = 1;
        vz2.c.f(90033);
        android.content.Intent b76 = com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.ViewOnClickListenerC15531xcd76b547.b7(4, 90033, "finish by voip call");
        android.app.Activity activity = this.f218783d;
        activity.setResult(1, b76);
        activity.finish();
    }
}
