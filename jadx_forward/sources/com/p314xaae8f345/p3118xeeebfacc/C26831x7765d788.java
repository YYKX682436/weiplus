package com.p314xaae8f345.p3118xeeebfacc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/unit_rc/ByteBuffer;", "Lcom/tencent/unit_rc/BaseObject;", "capacity", "", "(I)V", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)V", "getData", "()Ljava/nio/ByteBuffer;", "unit_rc_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: com.tencent.unit_rc.ByteBuffer */
/* loaded from: classes13.dex */
public class C26831x7765d788 extends com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190 {
    private final java.nio.ByteBuffer data;

    public C26831x7765d788(int i17) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(allocateDirect, "allocateDirect(capacity)");
        this.data = allocateDirect;
    }

    public final java.nio.ByteBuffer getData() {
        return this.data;
    }

    public C26831x7765d788(java.nio.ByteBuffer data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data.isDirect()) {
            this.data = data;
            return;
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(data.capacity());
        allocateDirect.put(data);
        this.data = allocateDirect;
    }
}
