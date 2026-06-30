package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f89821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f89822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.l4 f89823f;

    public k4(com.tencent.mm.plugin.appbrand.ui.l4 l4Var, android.graphics.Bitmap bitmap, long j17) {
        this.f89823f = l4Var;
        this.f89821d = bitmap;
        this.f89822e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap = this.f89821d;
        if (bitmap != null) {
            com.tencent.mm.plugin.appbrand.ui.l4 l4Var = this.f89823f;
            l4Var.f89845b.W.setImageBitmap(bitmap);
            com.tencent.mm.plugin.appbrand.ui.w4 w4Var = l4Var.f89845b;
            if (w4Var.R) {
                com.tencent.mm.plugin.appbrand.ui.w4.K(w4Var);
            }
            com.tencent.mm.plugin.appbrand.game.preload.j a17 = com.tencent.mm.plugin.appbrand.game.preload.j.a();
            long j17 = l4Var.f89844a;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            a17.b(1002, (int) (android.os.SystemClock.elapsedRealtime() - j17));
            com.tencent.mm.plugin.appbrand.game.preload.j.a().b(1001, (int) this.f89822e);
        }
    }
}
