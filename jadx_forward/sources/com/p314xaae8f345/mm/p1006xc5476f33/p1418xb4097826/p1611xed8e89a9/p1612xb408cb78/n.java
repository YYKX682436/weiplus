package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78;

/* loaded from: classes2.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6 f204911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.C14876x9baef275 f204912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f204913f;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6 c14879x7c6ab7a6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.C14876x9baef275 c14876x9baef275, boolean z17) {
        this.f204911d = c14879x7c6ab7a6;
        this.f204912e = c14876x9baef275;
        this.f204913f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f204912e.f204835m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6 c14879x7c6ab7a6 = this.f204911d;
        c14879x7c6ab7a6.m58627xb8dfca8a(i17 + i65.a.b(c14879x7c6ab7a6.getContext(), 8));
        if (this.f204913f) {
            c14879x7c6ab7a6.e(0, c14879x7c6ab7a6.foldHeight, 0.0f, 1.0f);
        } else {
            c14879x7c6ab7a6.e(c14879x7c6ab7a6.foldHeight, 0, 1.0f, 0.0f);
        }
    }
}
