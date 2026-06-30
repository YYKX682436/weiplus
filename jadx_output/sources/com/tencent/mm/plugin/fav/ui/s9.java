package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes8.dex */
public final class s9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f101439d;

    public s9(android.app.Dialog dialog) {
        this.f101439d = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f101439d.dismiss();
    }
}
