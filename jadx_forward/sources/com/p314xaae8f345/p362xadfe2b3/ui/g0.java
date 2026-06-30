package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes9.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f127690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 f127691e;

    public g0(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 activityC3721x69b5f133, int i17) {
        this.f127691e = activityC3721x69b5f133;
        this.f127690d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f127691e.getWindow().getDecorView().setSystemUiVisibility(this.f127690d);
    }
}
