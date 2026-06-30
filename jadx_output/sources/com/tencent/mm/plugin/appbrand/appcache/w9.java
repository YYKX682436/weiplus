package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class w9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f76031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76032f;

    public w9(com.tencent.mm.plugin.appbrand.appcache.x9 x9Var, java.lang.String str, int i17, java.lang.String str2) {
        this.f76030d = str;
        this.f76031e = i17;
        this.f76032f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.task.u0 C = com.tencent.mm.plugin.appbrand.task.u0.C();
        int i17 = this.f76031e;
        java.lang.String str = this.f76030d;
        C.s(str, i17);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.Object[] objArr = new java.lang.Object[1];
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str2 = this.f76032f;
        if (str2 != null) {
            str = str2;
        }
        objArr[0] = str;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f490247p7, objArr), 1).show();
    }
}
