package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f171642a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f171643b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.k f171644c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f171645d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f171646e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f171647f;

    public l(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.k kVar) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger();
        this.f171645d = atomicInteger;
        this.f171646e = null;
        this.f171647f = null;
        this.f171642a = str;
        this.f171643b = str2;
        this.f171644c = kVar;
        if (!android.text.TextUtils.isEmpty(str)) {
            atomicInteger.incrementAndGet();
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            atomicInteger.incrementAndGet();
        }
        if (atomicInteger.get() != 0 || kVar == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.h) kVar).a(null, null);
    }

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.k kVar;
        if (this.f171645d.decrementAndGet() != 0 || (kVar = this.f171644c) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.h) kVar).a(this.f171646e, this.f171647f);
    }
}
