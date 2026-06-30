package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes.dex */
public class z6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f287815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.f7 f287816e;

    public z6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.f7 f7Var, android.content.Intent intent) {
        this.f287816e = f7Var;
        this.f287815d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = this.f287815d;
        if (intent != null) {
            intent.putExtra("curPageId", 1);
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        android.content.Context context = this.f287816e.f282022b;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.azq);
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.v(context, intent, string, null, null);
    }
}
