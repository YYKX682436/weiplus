package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public class a3 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90381a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.b3 f90382b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f90383c;

    public a3(java.lang.String str, com.tencent.mm.plugin.appbrand.utils.b3 b3Var, long j17) {
        this.f90381a = str;
        this.f90382b = b3Var;
        this.f90383c = j17;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        long j17 = this.f90383c;
        com.tencent.mm.plugin.appbrand.utils.d3.a(this.f90381a, this.f90382b, (java.lang.String) obj, j17);
    }
}
