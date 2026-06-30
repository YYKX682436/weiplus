package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public class g4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f290150e;

    public g4(android.content.Context context, android.content.Intent intent) {
        this.f290149d = context;
        this.f290150e = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            android.content.Context context = this.f290149d;
            android.content.Intent intent = this.f290150e;
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c1n);
            ((kt.c) i0Var).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.v(context, intent, string, null, null);
        } catch (java.lang.Throwable unused) {
        }
    }
}
