package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes8.dex */
public class p2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f81116d;

    public p2(com.tencent.mm.plugin.appbrand.jsapi.file.q2 q2Var, android.app.Activity activity) {
        this.f81116d = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Activity activity = this.f81116d;
        com.tencent.mm.ui.widget.snackbar.j.c(activity.getString(com.tencent.mm.R.string.cbq), null, activity, null, null);
    }
}
