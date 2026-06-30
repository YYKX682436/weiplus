package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f295726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f295727e;

    public j0(com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e, android.view.View view, int i17) {
        this.f295726d = view;
        this.f295727e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f295726d.scrollBy(0, this.f295727e);
    }
}
