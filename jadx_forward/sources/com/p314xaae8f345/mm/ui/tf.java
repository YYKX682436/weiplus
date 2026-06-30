package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class tf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21427xe5bb8a3 f291433d;

    public tf(com.p314xaae8f345.mm.ui.C21427xe5bb8a3 c21427xe5bb8a3) {
        this.f291433d = c21427xe5bb8a3;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Looper.myQueue().addIdleHandler(this.f291433d.f278551e);
    }
}
