package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7;

/* loaded from: classes12.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f234451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d f234453f;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d dVar, long j17, java.lang.String str) {
        this.f234453f = dVar;
        this.f234451d = j17;
        this.f234452e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f234453f.h().e()) {
            this.f234453f.s(false);
            ((ku5.t0) ku5.t0.f394148d).l(this, this.f234451d, this.f234452e);
        }
    }
}
