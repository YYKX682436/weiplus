package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes3.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f149152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.BitmapFactory.Options f149153e;

    public o2(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p2 p2Var, int i17, android.graphics.BitmapFactory.Options options) {
        this.f149152d = i17;
        this.f149153e = options;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f149152d);
        android.graphics.BitmapFactory.Options options = this.f149153e;
        dp.a.m125854x26a183b(context, java.lang.String.format("WARNING: large bitmap decode \n(%s B), [w:%s, h:%s]", valueOf, java.lang.Integer.valueOf(options.outWidth), java.lang.Integer.valueOf(options.outHeight)), 1).show();
    }
}
