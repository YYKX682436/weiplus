package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad;

/* loaded from: classes.dex */
public final class r implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f283512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283513e;

    public r(java.lang.Runnable runnable, java.lang.String str) {
        this.f283512d = runnable;
        this.f283513e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.Runnable runnable = this.f283512d;
        if (runnable != null) {
            runnable.run();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17509, 2, this.f283513e);
    }
}
