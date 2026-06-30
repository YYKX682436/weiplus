package com.tencent.liteapp.ui;

/* loaded from: classes5.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f46207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f46208e;

    public o(com.tencent.liteapp.ui.WxaLiteAppBaseView wxaLiteAppBaseView, boolean z17, android.app.Activity activity) {
        this.f46207d = z17;
        this.f46208e = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f46207d;
        android.app.Activity activity = this.f46208e;
        if (z17) {
            activity.getWindow().clearFlags(8192);
        } else {
            activity.getWindow().addFlags(8192);
        }
    }
}
