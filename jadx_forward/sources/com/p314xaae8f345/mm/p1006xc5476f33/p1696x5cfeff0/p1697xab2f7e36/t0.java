package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* loaded from: classes14.dex */
public class t0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f218715d;

    public t0(android.app.Activity activity) {
        this.f218715d = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        vz2.c.k("msgVerify", "camera or mic 正在被占用");
        vz2.c.c().f137750s = 1;
        vz2.c.h(90033);
        android.content.Intent c76 = com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.ViewOnClickListenerC15534xde6dcfdd.c7(4, 90030, "finish by voip call");
        android.app.Activity activity = this.f218715d;
        activity.setResult(1, c76);
        activity.finish();
    }
}
