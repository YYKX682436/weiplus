package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class wo implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f281719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21680xcf828dda f281720e;

    public wo(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21680xcf828dda c21680xcf828dda, boolean z17) {
        this.f281720e = c21680xcf828dda;
        this.f281719d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21680xcf828dda c21680xcf828dda = this.f281720e;
        c21680xcf828dda.f280110d.f280113d.J();
        if (this.f281719d) {
            ((android.view.View) c21680xcf828dda.f280110d.f281403m.get()).performClick();
        }
    }
}
