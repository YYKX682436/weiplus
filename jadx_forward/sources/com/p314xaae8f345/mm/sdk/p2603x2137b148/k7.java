package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes8.dex */
public final class k7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f274345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f274346f;

    public k7(java.lang.String str, long j17, boolean z17) {
        this.f274344d = str;
        this.f274345e = j17;
        this.f274346f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onContentChange fileAdded, filePath: ");
        java.lang.String str = this.f274344d;
        sb6.append(str);
        sb6.append(", screenShotTime: ");
        long j17 = this.f274345e;
        sb6.append(j17);
        sb6.append(", isPending: ");
        boolean z17 = this.f274346f;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotUtil", sb6.toString());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m7.a(str, j17, z17);
    }
}
