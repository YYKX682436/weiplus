package com.tencent.mm.booter;

/* loaded from: classes5.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f63377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f63378e;

    public h1(java.lang.String str, long j17) {
        this.f63377d = str;
        this.f63378e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ap.a.a(1, "notifyDisorderFail", null, null, this.f63377d, java.lang.String.valueOf(this.f63378e));
    }
}
