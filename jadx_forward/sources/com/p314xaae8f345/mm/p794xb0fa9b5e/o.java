package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes7.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f149911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.q f149913f;

    public o(com.p314xaae8f345.mm.p794xb0fa9b5e.q qVar, java.lang.Class cls, java.lang.String str) {
        this.f149913f = qVar;
        this.f149911d = cls;
        this.f149912e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.l(this.f149911d);
        this.f149913f.a(this.f149912e, false);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.l(null);
    }
}
