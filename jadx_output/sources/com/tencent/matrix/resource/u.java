package com.tencent.matrix.resource;

/* loaded from: classes12.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.ByteOrder f52970a;

    /* renamed from: b, reason: collision with root package name */
    public final java.io.InputStream f52971b;

    public u(java.nio.ByteOrder order, java.io.InputStream stream) {
        kotlin.jvm.internal.o.g(order, "order");
        kotlin.jvm.internal.o.g(stream, "stream");
        this.f52970a = order;
        this.f52971b = stream;
    }

    public final int a() {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
        allocate.order(this.f52970a);
        this.f52971b.read(allocate.array(), 0, 4);
        return allocate.getInt(0);
    }
}
