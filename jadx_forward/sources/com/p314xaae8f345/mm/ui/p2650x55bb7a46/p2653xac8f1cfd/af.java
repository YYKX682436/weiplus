package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class af implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem.OnMenuItemClickListener f280153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe f280154e;

    public af(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe peVar, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f280154e = peVar;
        this.f280153d = onMenuItemClickListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f280153d;
        if (onMenuItemClickListener != null) {
            onMenuItemClickListener.onMenuItemClick(new db5.h4(this.f280154e.f280113d.g(), 0, 0));
        }
    }
}
