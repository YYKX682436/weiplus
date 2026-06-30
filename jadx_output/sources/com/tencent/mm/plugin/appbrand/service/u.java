package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public class u implements dh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f88793a;

    public u(com.tencent.mm.plugin.appbrand.service.v vVar, java.lang.ref.WeakReference weakReference) {
        this.f88793a = weakReference;
    }

    @Override // dh.a
    public void a(java.lang.String str, yz5.l lVar) {
    }

    @Override // dh.a
    public java.lang.String getAbsolutePath(java.lang.String str) {
        return "";
    }

    @Override // dh.a
    public byte[] readDataFromURLSync(java.lang.String str) {
        byte[] a17 = wd.a.f444670a.a(str, (com.tencent.mm.plugin.appbrand.service.c0) this.f88793a.get());
        return a17 == null ? new byte[0] : a17;
    }
}
