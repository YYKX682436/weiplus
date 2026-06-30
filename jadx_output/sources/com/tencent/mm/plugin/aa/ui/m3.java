package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes5.dex */
public class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f72733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.n3 f72734e;

    public m3(com.tencent.mm.plugin.aa.ui.n3 n3Var, android.graphics.Bitmap bitmap) {
        this.f72734e = n3Var;
        this.f72733d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.aa.ui.n3 n3Var = this.f72734e;
        android.graphics.Bitmap bitmap = this.f72733d;
        if (bitmap != null) {
            n3Var.f72745a.A.setImageBitmap(bitmap);
            return;
        }
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = n3Var.f72745a;
        launchAAUI.f72506l1 = 2;
        launchAAUI.A.setVisibility(8);
        n3Var.f72745a.f72523y.setVisibility(0);
        n3Var.f72745a.f72526z.setVisibility(0);
    }
}
