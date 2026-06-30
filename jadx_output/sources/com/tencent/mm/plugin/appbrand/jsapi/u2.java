package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f83500d;

    public u2(com.tencent.mm.plugin.appbrand.jsapi.y2 y2Var, android.content.Context context) {
        this.f83500d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f83500d;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f492210fm3), 0).show();
    }
}
