package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f90109a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f90110b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.ui.recents.k f90111c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f90112d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f90113e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f90114f;

    public l(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.ui.recents.k kVar) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger();
        this.f90112d = atomicInteger;
        this.f90113e = null;
        this.f90114f = null;
        this.f90109a = str;
        this.f90110b = str2;
        this.f90111c = kVar;
        if (!android.text.TextUtils.isEmpty(str)) {
            atomicInteger.incrementAndGet();
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            atomicInteger.incrementAndGet();
        }
        if (atomicInteger.get() != 0 || kVar == null) {
            return;
        }
        ((com.tencent.mm.plugin.appbrand.ui.recents.h) kVar).a(null, null);
    }

    public void a() {
        com.tencent.mm.plugin.appbrand.ui.recents.k kVar;
        if (this.f90112d.decrementAndGet() != 0 || (kVar = this.f90111c) == null) {
            return;
        }
        ((com.tencent.mm.plugin.appbrand.ui.recents.h) kVar).a(this.f90113e, this.f90114f);
    }
}
