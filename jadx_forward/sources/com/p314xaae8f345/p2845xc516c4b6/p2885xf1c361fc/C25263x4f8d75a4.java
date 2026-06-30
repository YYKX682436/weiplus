package com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u000f"}, d2 = {"Lcom/tencent/pigeon/websearch/SearchResultFinderLivePlayersManagerCodec;", "Lio/flutter/plugin/common/StandardMessageCodec;", "", "type", "Ljava/nio/ByteBuffer;", "buffer", "", "readValueOfType", "Ljava/io/ByteArrayOutputStream;", "stream", "value", "Ljz5/f0;", "writeValue", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.pigeon.websearch.SearchResultFinderLivePlayersManagerCodec */
/* loaded from: classes11.dex */
final class C25263x4f8d75a4 extends io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25263x4f8d75a4 f45316x4fbc8495 = new com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25263x4f8d75a4();

    private C25263x4f8d75a4() {
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc
    /* renamed from: readValueOfType */
    public java.lang.Object mo84732x8819c70c(byte type, java.nio.ByteBuffer buffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        if (type == Byte.MIN_VALUE) {
            java.lang.Object m138458xbd1ad57b = m138458xbd1ad57b(buffer);
            java.util.List<? extends java.lang.Object> list = m138458xbd1ad57b instanceof java.util.List ? (java.util.List) m138458xbd1ad57b : null;
            if (list != null) {
                return com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25250xe2010b39.INSTANCE.m93397xb5cc5768(list);
            }
            return null;
        }
        if (type == -127) {
            java.lang.Object m138458xbd1ad57b2 = m138458xbd1ad57b(buffer);
            java.util.List<? extends java.lang.Object> list2 = m138458xbd1ad57b2 instanceof java.util.List ? (java.util.List) m138458xbd1ad57b2 : null;
            if (list2 != null) {
                return com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25288xea0efc4c.INSTANCE.m93463xb5cc5768(list2);
            }
            return null;
        }
        if (type != -126) {
            return super.mo84732x8819c70c(type, buffer);
        }
        java.lang.Object m138458xbd1ad57b3 = m138458xbd1ad57b(buffer);
        java.util.List<? extends java.lang.Object> list3 = m138458xbd1ad57b3 instanceof java.util.List ? (java.util.List) m138458xbd1ad57b3 : null;
        if (list3 != null) {
            return com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25289x97feeaec.INSTANCE.m93477xb5cc5768(list3);
        }
        return null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc
    /* renamed from: writeValue */
    public void mo84733xd98e5cd2(java.io.ByteArrayOutputStream stream, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stream, "stream");
        if (obj instanceof com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25250xe2010b39) {
            stream.write(128);
            mo84733xd98e5cd2(stream, ((com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25250xe2010b39) obj).m93395xcc327db9());
        } else if (obj instanceof com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25288xea0efc4c) {
            stream.write(129);
            mo84733xd98e5cd2(stream, ((com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25288xea0efc4c) obj).m93461xcc327db9());
        } else if (!(obj instanceof com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25289x97feeaec)) {
            super.mo84733xd98e5cd2(stream, obj);
        } else {
            stream.write(130);
            mo84733xd98e5cd2(stream, ((com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25289x97feeaec) obj).m93475xcc327db9());
        }
    }
}
