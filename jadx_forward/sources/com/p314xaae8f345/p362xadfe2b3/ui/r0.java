package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes5.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f127751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 f127752e;

    public r0(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7, int i17) {
        this.f127752e = activityC3722x408816c7;
        this.f127751d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f127752e.getWindow().getDecorView().setSystemUiVisibility(this.f127751d);
    }
}
