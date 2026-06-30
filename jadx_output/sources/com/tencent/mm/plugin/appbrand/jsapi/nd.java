package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class nd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f82387d;

    public nd(com.tencent.mm.plugin.appbrand.jsapi.od odVar, android.content.Context context) {
        this.f82387d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f82387d;
        com.tencent.mm.ui.widget.snackbar.j.c(context.getString(com.tencent.mm.R.string.cbq), null, (android.app.Activity) context, null, null);
    }
}
