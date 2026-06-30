package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes14.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f127700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 f127701e;

    public h1(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7, boolean z17) {
        this.f127701e = activityC3722x408816c7;
        this.f127700d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f127701e.f127565g.d(java.lang.Boolean.valueOf(this.f127700d).booleanValue(), true);
    }
}
