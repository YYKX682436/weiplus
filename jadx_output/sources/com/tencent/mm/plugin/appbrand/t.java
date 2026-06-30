package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class t implements com.tencent.mm.plugin.appbrand.appcache.i6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f88959a;

    public t(com.tencent.mm.plugin.appbrand.p pVar, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        this.f88959a = atomicBoolean;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.i6
    public boolean a() {
        return this.f88959a.get();
    }
}
