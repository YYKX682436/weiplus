package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public class z2 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.b3 f90634b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f90635c;

    public z2(java.lang.String str, com.tencent.mm.plugin.appbrand.utils.b3 b3Var, long j17) {
        this.f90633a = str;
        this.f90634b = b3Var;
        this.f90635c = j17;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        long j17 = this.f90635c;
        com.tencent.mm.plugin.appbrand.utils.d3.a(this.f90633a, this.f90634b, (java.lang.String) obj, j17);
    }
}
