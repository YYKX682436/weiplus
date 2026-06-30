package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes12.dex */
public class sc implements pe5.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21639xb2c1ee07 f284204a;

    public sc(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21639xb2c1ee07 activityC21639xb2c1ee07) {
        this.f284204a = activityC21639xb2c1ee07;
    }

    public void a() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21639xb2c1ee07 activityC21639xb2c1ee07 = this.f284204a;
        if (!activityC21639xb2c1ee07.isFinishing()) {
            activityC21639xb2c1ee07.f279849e.dismiss();
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21639xb2c1ee07.f279848g = false;
        activityC21639xb2c1ee07.setResult(-1, activityC21639xb2c1ee07.getIntent());
        if (activityC21639xb2c1ee07.isFinishing()) {
            return;
        }
        activityC21639xb2c1ee07.finish();
    }
}
