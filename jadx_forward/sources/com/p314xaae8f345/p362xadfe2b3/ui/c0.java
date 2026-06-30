package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes14.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f127673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 f127674e;

    public c0(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 activityC3721x69b5f133, boolean z17) {
        this.f127674e = activityC3721x69b5f133;
        this.f127673d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 activityC3721x69b5f133 = this.f127674e;
        boolean z17 = this.f127673d;
        activityC3721x69b5f133.N = z17;
        if (z17) {
            activityC3721x69b5f133.getWindow().addFlags(128);
        } else {
            activityC3721x69b5f133.getWindow().clearFlags(128);
        }
    }
}
