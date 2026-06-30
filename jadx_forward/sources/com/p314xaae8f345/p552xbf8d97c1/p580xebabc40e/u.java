package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e;

/* loaded from: classes12.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.ByteOrder f134503a;

    /* renamed from: b, reason: collision with root package name */
    public final java.io.InputStream f134504b;

    public u(java.nio.ByteOrder order, java.io.InputStream stream) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(order, "order");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stream, "stream");
        this.f134503a = order;
        this.f134504b = stream;
    }

    public final int a() {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
        allocate.order(this.f134503a);
        this.f134504b.read(allocate.array(), 0, 4);
        return allocate.getInt(0);
    }
}
