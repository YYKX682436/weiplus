package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes5.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f144911e;

    public h1(java.lang.String str, long j17) {
        this.f144910d = str;
        this.f144911e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ap.a.a(1, "notifyDisorderFail", null, null, this.f144910d, java.lang.String.valueOf(this.f144911e));
    }
}
