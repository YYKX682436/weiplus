package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f83506d;

    public v2(com.tencent.mm.plugin.appbrand.jsapi.y2 y2Var, android.content.Context context) {
        this.f83506d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f83506d;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f492209fm2), 0).show();
    }
}
