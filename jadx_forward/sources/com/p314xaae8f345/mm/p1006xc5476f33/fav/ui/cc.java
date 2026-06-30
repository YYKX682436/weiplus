package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class cc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f182088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f182089e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182090f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f182091g;

    public cc(android.app.Dialog dialog, android.app.Activity activity, java.lang.String str, java.util.List list) {
        this.f182088d = dialog;
        this.f182089e = activity;
        this.f182090f = str;
        this.f182091g = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f182088d.dismiss();
        android.app.Activity activity = this.f182089e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c9u), null, activity, null, null);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.f(activity, this.f182090f, this.f182091g, true);
    }
}
