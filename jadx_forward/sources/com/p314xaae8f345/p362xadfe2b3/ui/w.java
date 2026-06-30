package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes15.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f127766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 f127767e;

    public w(com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 c3719xb0aa2063, boolean z17) {
        this.f127767e = c3719xb0aa2063;
        this.f127766d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f127767e.m7474xfb86a31b().setKeepScreenOn(this.f127766d);
    }
}
