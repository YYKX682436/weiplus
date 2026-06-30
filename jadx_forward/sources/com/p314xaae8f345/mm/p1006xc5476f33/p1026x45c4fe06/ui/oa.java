package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes5.dex */
public final class oa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f171439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f171440e;

    public oa(android.content.Context context, yz5.l lVar) {
        this.f171439d = context;
        this.f171440e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object systemService = this.f171439d.getSystemService("power");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        this.f171440e.mo146xb9724478(java.lang.Boolean.valueOf(((android.os.PowerManager) systemService).isInteractive()));
    }
}
