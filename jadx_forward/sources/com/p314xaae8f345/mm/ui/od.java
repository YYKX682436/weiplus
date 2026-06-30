package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public final class od {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f291002a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.nd f291003b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f291004c;

    public od(com.p314xaae8f345.mm.ui.nd status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f291002a = new java.lang.Object();
        this.f291003b = status;
    }

    public final void a(com.p314xaae8f345.mm.ui.nd value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        synchronized (this.f291002a) {
            this.f291003b = value;
            this.f291002a.notifyAll();
        }
    }
}
