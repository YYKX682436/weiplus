package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes5.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f127740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f127741e;

    public o(com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 c3717xac6c2329, boolean z17, android.app.Activity activity) {
        this.f127740d = z17;
        this.f127741e = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f127740d;
        android.app.Activity activity = this.f127741e;
        if (z17) {
            activity.getWindow().clearFlags(8192);
        } else {
            activity.getWindow().addFlags(8192);
        }
    }
}
