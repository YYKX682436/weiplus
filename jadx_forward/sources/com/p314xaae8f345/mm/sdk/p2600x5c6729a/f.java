package com.p314xaae8f345.mm.sdk.p2600x5c6729a;

/* loaded from: classes12.dex */
public class f implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 f273911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2600x5c6729a.d f273912e;

    public f(com.p314xaae8f345.mm.sdk.p2600x5c6729a.d dVar, com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        this.f273912e = dVar;
        this.f273911d = abstractC20979x809547d1;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return this.f273911d.getClass().getName();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f273912e.d(this.f273911d, false);
    }
}
