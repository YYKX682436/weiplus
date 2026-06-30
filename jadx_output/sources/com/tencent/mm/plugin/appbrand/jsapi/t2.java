package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f83453d;

    public t2(com.tencent.mm.plugin.appbrand.jsapi.y2 y2Var, android.content.Context context) {
        this.f83453d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f83453d;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f492208fm1), 0).show();
    }
}
