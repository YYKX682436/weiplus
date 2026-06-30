package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f97010d;

    public c2(android.content.Context context) {
        this.f97010d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f97010d;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f492209fm2), 0).show();
    }
}
