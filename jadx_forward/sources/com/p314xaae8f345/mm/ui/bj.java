package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public class bj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21440xfcb6d020 f279510e;

    public bj(com.p314xaae8f345.mm.ui.C21440xfcb6d020 c21440xfcb6d020, java.lang.String str) {
        this.f279510e = c21440xfcb6d020;
        this.f279509d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.C21440xfcb6d020 c21440xfcb6d020;
        if (!com.p314xaae8f345.mm.vfs.w6.j(this.f279509d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SplashWelcomeView", "cannot find %s", this.f279509d);
            return;
        }
        try {
            try {
                java.lang.String str = this.f279509d;
                byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, 0, (int) com.p314xaae8f345.mm.vfs.w6.k(str));
                if (N != null && N.length > 0) {
                    com.p314xaae8f345.mm.ui.C21440xfcb6d020 c21440xfcb6d0202 = this.f279510e;
                    int length = N.length;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(length));
                    arrayList.add(0);
                    arrayList.add(N);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/SplashWelcomeView$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
                    yj0.a.e(obj, decodeByteArray, "com/tencent/mm/ui/SplashWelcomeView$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                    c21440xfcb6d0202.f278627g = decodeByteArray;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SplashWelcomeView", "ready to play animation, hasDrawed %s", java.lang.Boolean.valueOf(this.f279510e.f278624d));
                    this.f279510e.f278626f = true;
                }
                c21440xfcb6d020 = this.f279510e;
                if (!c21440xfcb6d020.f278624d) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SplashWelcomeView", e17, "decode new welcome image error: %s", e17.getMessage());
                c21440xfcb6d020 = this.f279510e;
                if (!c21440xfcb6d020.f278624d) {
                    return;
                }
            }
            c21440xfcb6d020.d();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.ui.C21440xfcb6d020 c21440xfcb6d0203 = this.f279510e;
            if (c21440xfcb6d0203.f278624d) {
                c21440xfcb6d0203.d();
            }
            throw th6;
        }
    }
}
