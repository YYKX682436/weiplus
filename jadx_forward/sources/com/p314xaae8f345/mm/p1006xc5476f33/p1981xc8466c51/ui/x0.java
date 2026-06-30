package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes9.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f237131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f237132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f237133f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 f237134g;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 activityC16969x3ace7680, int i17, long j17, long j18) {
        this.f237134g = activityC16969x3ace7680;
        this.f237131d = i17;
        this.f237132e = j17;
        this.f237133f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 activityC16969x3ace7680 = this.f237134g;
        activityC16969x3ace7680.f236824m.setProgress(this.f237131d);
        activityC16969x3ace7680.f236825n.setText(activityC16969x3ace7680.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572726ca2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.T((float) this.f237132e), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.T((float) this.f237133f)));
    }
}
