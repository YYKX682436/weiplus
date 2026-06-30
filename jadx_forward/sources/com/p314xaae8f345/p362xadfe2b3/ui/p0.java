package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes15.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f127745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 f127746e;

    public p0(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 activityC3721x69b5f133, boolean z17) {
        this.f127746e = activityC3721x69b5f133;
        this.f127745d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ox5.a aVar = this.f127746e.f127608e;
        if (aVar != null) {
            aVar.d(this.f127745d, true);
        }
    }
}
