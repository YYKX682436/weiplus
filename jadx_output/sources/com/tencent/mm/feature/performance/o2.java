package com.tencent.mm.feature.performance;

/* loaded from: classes3.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f67619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.BitmapFactory.Options f67620e;

    public o2(com.tencent.mm.feature.performance.p2 p2Var, int i17, android.graphics.BitmapFactory.Options options) {
        this.f67619d = i17;
        this.f67620e = options;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f67619d);
        android.graphics.BitmapFactory.Options options = this.f67620e;
        dp.a.makeText(context, java.lang.String.format("WARNING: large bitmap decode \n(%s B), [w:%s, h:%s]", valueOf, java.lang.Integer.valueOf(options.outWidth), java.lang.Integer.valueOf(options.outHeight)), 1).show();
    }
}
