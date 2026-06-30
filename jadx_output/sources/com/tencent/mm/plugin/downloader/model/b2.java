package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f96990d;

    public b2(android.content.Context context) {
        this.f96990d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f96990d;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f492210fm3), 0).show();
    }
}
