package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes14.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f127764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 f127765e;

    public v0(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7, boolean z17) {
        this.f127765e = activityC3722x408816c7;
        this.f127764d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7 = this.f127765e;
        boolean z17 = this.f127764d;
        activityC3722x408816c7.V = z17;
        if (z17) {
            activityC3722x408816c7.getWindow().addFlags(128);
        } else {
            activityC3722x408816c7.getWindow().clearFlags(128);
        }
    }
}
