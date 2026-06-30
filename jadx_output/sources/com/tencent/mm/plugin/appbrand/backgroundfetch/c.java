package com.tencent.mm.plugin.appbrand.backgroundfetch;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76807e;

    public c(java.lang.String str, java.lang.String str2) {
        this.f76806d = str;
        this.f76807e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(this.f76806d, this.f76807e);
        com.tencent.mm.plugin.appbrand.backgroundfetch.h.a(hashMap, new com.tencent.mm.plugin.appbrand.backgroundfetch.t0());
    }
}
