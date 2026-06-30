package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f97179d;

    public u1(android.content.Context context) {
        this.f97179d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f97179d;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f492208fm1), 0).show();
    }
}
