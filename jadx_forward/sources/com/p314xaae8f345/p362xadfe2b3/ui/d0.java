package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes9.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f127677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 f127678e;

    public d0(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 activityC3721x69b5f133, boolean z17) {
        this.f127678e = activityC3721x69b5f133;
        this.f127677d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f127677d;
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 activityC3721x69b5f133 = this.f127678e;
        if (z17) {
            activityC3721x69b5f133.getWindow().clearFlags(8192);
        } else {
            activityC3721x69b5f133.getWindow().addFlags(8192);
        }
    }
}
