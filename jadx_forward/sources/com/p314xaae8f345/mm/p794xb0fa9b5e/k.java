package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f149893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.q f149895f;

    public k(com.p314xaae8f345.mm.p794xb0fa9b5e.q qVar, java.lang.Class cls, java.lang.String str) {
        this.f149895f = qVar;
        this.f149893d = cls;
        this.f149894e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.l(this.f149893d);
        this.f149895f.a(this.f149894e, false);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.l(null);
    }
}
