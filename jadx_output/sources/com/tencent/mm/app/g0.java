package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.k0 f53422d;

    public g0(com.tencent.mm.app.k0 k0Var) {
        this.f53422d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (ih.a.f(e42.d0.clicfg_crash_push_double_upload_v2, true)) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            com.tencent.mm.app.k0 k0Var = this.f53422d;
            k0Var.a(context);
            k0Var.f53479d.postDelayed(k0Var.f53480e, 3600000L);
        }
    }
}
