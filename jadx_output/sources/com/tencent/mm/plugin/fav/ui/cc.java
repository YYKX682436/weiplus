package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class cc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f100555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f100556e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100557f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f100558g;

    public cc(android.app.Dialog dialog, android.app.Activity activity, java.lang.String str, java.util.List list) {
        this.f100555d = dialog;
        this.f100556e = activity;
        this.f100557f = str;
        this.f100558g = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f100555d.dismiss();
        android.app.Activity activity = this.f100556e;
        com.tencent.mm.ui.widget.snackbar.j.c(activity.getString(com.tencent.mm.R.string.c9u), null, activity, null, null);
        com.tencent.mm.plugin.fav.ui.ec.f(activity, this.f100557f, this.f100558g, true);
    }
}
