package com.p314xaae8f345.p2845xc516c4b6.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u000f"}, d2 = {"Lcom/tencent/pigeon/biz/BizMediaApiCodec;", "Lio/flutter/plugin/common/StandardMessageCodec;", "", "type", "Ljava/nio/ByteBuffer;", "buffer", "", "readValueOfType", "Ljava/io/ByteArrayOutputStream;", "stream", "value", "Ljz5/f0;", "writeValue", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.pigeon.biz.BizMediaApiCodec */
/* loaded from: classes7.dex */
final class C23180x3225a3ed extends io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.p2845xc516c4b6.biz.C23180x3225a3ed f40681x4fbc8495 = new com.p314xaae8f345.p2845xc516c4b6.biz.C23180x3225a3ed();

    private C23180x3225a3ed() {
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc
    /* renamed from: readValueOfType */
    public java.lang.Object mo84732x8819c70c(byte type, java.nio.ByteBuffer buffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        if (type == Byte.MIN_VALUE) {
            java.lang.Object m138458xbd1ad57b = m138458xbd1ad57b(buffer);
            java.util.List<? extends java.lang.Object> list = m138458xbd1ad57b instanceof java.util.List ? (java.util.List) m138458xbd1ad57b : null;
            if (list != null) {
                return com.p314xaae8f345.p2845xc516c4b6.biz.C23092xb7b62965.INSTANCE.m84813xb5cc5768(list);
            }
            return null;
        }
        if (type == -127) {
            java.lang.Object m138458xbd1ad57b2 = m138458xbd1ad57b(buffer);
            java.util.List<? extends java.lang.Object> list2 = m138458xbd1ad57b2 instanceof java.util.List ? (java.util.List) m138458xbd1ad57b2 : null;
            if (list2 != null) {
                return com.p314xaae8f345.p2845xc516c4b6.biz.C23131x583ece12.INSTANCE.m85040xb5cc5768(list2);
            }
            return null;
        }
        if (type == -126) {
            java.lang.Object m138458xbd1ad57b3 = m138458xbd1ad57b(buffer);
            java.util.List<? extends java.lang.Object> list3 = m138458xbd1ad57b3 instanceof java.util.List ? (java.util.List) m138458xbd1ad57b3 : null;
            if (list3 != null) {
                return com.p314xaae8f345.p2845xc516c4b6.biz.C23190x983c4c70.INSTANCE.m85243xb5cc5768(list3);
            }
            return null;
        }
        if (type == -125) {
            java.lang.Object m138458xbd1ad57b4 = m138458xbd1ad57b(buffer);
            java.util.List<? extends java.lang.Object> list4 = m138458xbd1ad57b4 instanceof java.util.List ? (java.util.List) m138458xbd1ad57b4 : null;
            if (list4 != null) {
                return com.p314xaae8f345.p2845xc516c4b6.biz.C23226xb46742f1.INSTANCE.m85490xb5cc5768(list4);
            }
            return null;
        }
        if (type == -124) {
            java.lang.Object m138458xbd1ad57b5 = m138458xbd1ad57b(buffer);
            java.util.List<? extends java.lang.Object> list5 = m138458xbd1ad57b5 instanceof java.util.List ? (java.util.List) m138458xbd1ad57b5 : null;
            if (list5 != null) {
                return com.p314xaae8f345.p2845xc516c4b6.biz.C23235xb7425dff.INSTANCE.m85576xb5cc5768(list5);
            }
            return null;
        }
        if (type != -123) {
            return super.mo84732x8819c70c(type, buffer);
        }
        java.lang.Object m138458xbd1ad57b6 = m138458xbd1ad57b(buffer);
        java.util.List<? extends java.lang.Object> list6 = m138458xbd1ad57b6 instanceof java.util.List ? (java.util.List) m138458xbd1ad57b6 : null;
        if (list6 != null) {
            return com.p314xaae8f345.p2845xc516c4b6.biz.C23249xee57bcfe.INSTANCE.m85637xb5cc5768(list6);
        }
        return null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc
    /* renamed from: writeValue */
    public void mo84733xd98e5cd2(java.io.ByteArrayOutputStream stream, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stream, "stream");
        if (obj instanceof com.p314xaae8f345.p2845xc516c4b6.biz.C23092xb7b62965) {
            stream.write(128);
            mo84733xd98e5cd2(stream, ((com.p314xaae8f345.p2845xc516c4b6.biz.C23092xb7b62965) obj).m84811xcc327db9());
            return;
        }
        if (obj instanceof com.p314xaae8f345.p2845xc516c4b6.biz.C23131x583ece12) {
            stream.write(129);
            mo84733xd98e5cd2(stream, ((com.p314xaae8f345.p2845xc516c4b6.biz.C23131x583ece12) obj).m85038xcc327db9());
            return;
        }
        if (obj instanceof com.p314xaae8f345.p2845xc516c4b6.biz.C23190x983c4c70) {
            stream.write(130);
            mo84733xd98e5cd2(stream, ((com.p314xaae8f345.p2845xc516c4b6.biz.C23190x983c4c70) obj).m85241xcc327db9());
            return;
        }
        if (obj instanceof com.p314xaae8f345.p2845xc516c4b6.biz.C23226xb46742f1) {
            stream.write(131);
            mo84733xd98e5cd2(stream, ((com.p314xaae8f345.p2845xc516c4b6.biz.C23226xb46742f1) obj).m85488xcc327db9());
        } else if (obj instanceof com.p314xaae8f345.p2845xc516c4b6.biz.C23235xb7425dff) {
            stream.write(132);
            mo84733xd98e5cd2(stream, ((com.p314xaae8f345.p2845xc516c4b6.biz.C23235xb7425dff) obj).m85574xcc327db9());
        } else if (!(obj instanceof com.p314xaae8f345.p2845xc516c4b6.biz.C23249xee57bcfe)) {
            super.mo84733xd98e5cd2(stream, obj);
        } else {
            stream.write(133);
            mo84733xd98e5cd2(stream, ((com.p314xaae8f345.p2845xc516c4b6.biz.C23249xee57bcfe) obj).m85635xcc327db9());
        }
    }
}
