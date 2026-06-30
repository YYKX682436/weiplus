package com.p314xaae8f345.p3118xeeebfacc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\f\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/tencent/unit_rc/SharedMemoryInt64;", "Lcom/tencent/unit_rc/SharedMemoryBase;", "", "Ljava/nio/ByteBuffer;", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "valueFromData", "(Ljava/nio/ByteBuffer;)Ljava/lang/Long;", "value", "Ljz5/f0;", "valueToData", "getBuffer", "()Ljava/nio/ByteBuffer;", "buffer", "Lcom/tencent/unit_rc/ByteBuffer;", "byteBuffer", "", "cacheSize", "<init>", "(Lcom/tencent/unit_rc/ByteBuffer;I)V", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.tencent.unit_rc.SharedMemoryInt64 */
/* loaded from: classes13.dex */
public final class C26842x3d14a4a7 extends com.p314xaae8f345.p3118xeeebfacc.AbstractC26840x8e5821d7<java.lang.Long> {
    /* JADX WARN: Multi-variable type inference failed */
    public C26842x3d14a4a7() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: getBuffer */
    private final java.nio.ByteBuffer m106042x12f2b736() {
        return getByteBuffer().getData();
    }

    @Override // com.p314xaae8f345.p3118xeeebfacc.AbstractC26840x8e5821d7
    /* renamed from: valueToData */
    public /* bridge */ /* synthetic */ void mo106033xac6fa196(java.nio.ByteBuffer byteBuffer, java.lang.Long l17) {
        m106043xac6fa196(byteBuffer, l17.longValue());
    }

    public /* synthetic */ C26842x3d14a4a7(com.p314xaae8f345.p3118xeeebfacc.C26831x7765d788 c26831x7765d788, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? null : c26831x7765d788, (i18 & 2) != 0 ? 3 : i17);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.p314xaae8f345.p3118xeeebfacc.AbstractC26840x8e5821d7
    /* renamed from: valueFromData */
    public java.lang.Long mo106032x89638b05(java.nio.ByteBuffer data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return java.lang.Long.valueOf(m106042x12f2b736().asLongBuffer().get());
    }

    /* renamed from: valueToData */
    public void m106043xac6fa196(java.nio.ByteBuffer data, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        data.asLongBuffer().put(j17);
    }

    public C26842x3d14a4a7(com.p314xaae8f345.p3118xeeebfacc.C26831x7765d788 c26831x7765d788, int i17) {
        super(c26831x7765d788, 8, i17);
    }
}
