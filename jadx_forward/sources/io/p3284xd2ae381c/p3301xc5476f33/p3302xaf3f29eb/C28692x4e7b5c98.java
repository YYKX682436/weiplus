package io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb;

/* renamed from: io.flutter.plugin.common.StandardMethodCodec */
/* loaded from: classes13.dex */
public final class C28692x4e7b5c98 implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28689x2a9c5b95 {

    /* renamed from: INSTANCE */
    public static final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28692x4e7b5c98 f71637x4fbc8495 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28692x4e7b5c98(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.f71627x4fbc8495);

    /* renamed from: messageCodec */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc f71638xb1cb0c4f;

    public C28692x4e7b5c98(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc c28691x13977fcc) {
        this.f71638xb1cb0c4f = c28691x13977fcc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28689x2a9c5b95
    /* renamed from: decodeEnvelope */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo138424x529d37de(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L11
            r1 = 1
            if (r0 != r1) goto L4a
            goto L1e
        L11:
            io.flutter.plugin.common.StandardMessageCodec r0 = r4.f71638xb1cb0c4f
            java.lang.Object r0 = r0.m138458xbd1ad57b(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L1e
            return r0
        L1e:
            io.flutter.plugin.common.StandardMessageCodec r0 = r4.f71638xb1cb0c4f
            java.lang.Object r0 = r0.m138458xbd1ad57b(r5)
            io.flutter.plugin.common.StandardMessageCodec r1 = r4.f71638xb1cb0c4f
            java.lang.Object r1 = r1.m138458xbd1ad57b(r5)
            io.flutter.plugin.common.StandardMessageCodec r2 = r4.f71638xb1cb0c4f
            java.lang.Object r2 = r2.m138458xbd1ad57b(r5)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L4a
            if (r1 == 0) goto L3a
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L4a
        L3a:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L4a
            io.flutter.plugin.common.FlutterException r5 = new io.flutter.plugin.common.FlutterException
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = (java.lang.String) r1
            r5.<init>(r0, r1, r2)
            throw r5
        L4a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28692x4e7b5c98.mo138424x529d37de(java.nio.ByteBuffer):java.lang.Object");
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28689x2a9c5b95
    /* renamed from: decodeMethodCall */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff mo138425x5f71c36d(java.nio.ByteBuffer byteBuffer) {
        byteBuffer.order(java.nio.ByteOrder.nativeOrder());
        java.lang.Object m138458xbd1ad57b = this.f71638xb1cb0c4f.m138458xbd1ad57b(byteBuffer);
        java.lang.Object m138458xbd1ad57b2 = this.f71638xb1cb0c4f.m138458xbd1ad57b(byteBuffer);
        if (!(m138458xbd1ad57b instanceof java.lang.String) || byteBuffer.hasRemaining()) {
            throw new java.lang.IllegalArgumentException("Method call corrupted");
        }
        return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff((java.lang.String) m138458xbd1ad57b, m138458xbd1ad57b2);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28689x2a9c5b95
    /* renamed from: encodeErrorEnvelope */
    public java.nio.ByteBuffer mo138426x515fc382(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.ExposedByteArrayOutputStream exposedByteArrayOutputStream = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.ExposedByteArrayOutputStream();
        exposedByteArrayOutputStream.write(1);
        this.f71638xb1cb0c4f.mo84733xd98e5cd2(exposedByteArrayOutputStream, str);
        this.f71638xb1cb0c4f.mo84733xd98e5cd2(exposedByteArrayOutputStream, str2);
        if (obj instanceof java.lang.Throwable) {
            this.f71638xb1cb0c4f.mo84733xd98e5cd2(exposedByteArrayOutputStream, io.p3284xd2ae381c.Log.m136959x2d915d84((java.lang.Throwable) obj));
        } else {
            this.f71638xb1cb0c4f.mo84733xd98e5cd2(exposedByteArrayOutputStream, obj);
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(exposedByteArrayOutputStream.size());
        allocateDirect.put(exposedByteArrayOutputStream.m138459xaddb9440(), 0, exposedByteArrayOutputStream.size());
        return allocateDirect;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28689x2a9c5b95
    /* renamed from: encodeErrorEnvelopeWithStacktrace */
    public java.nio.ByteBuffer mo138427x435a9545(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.String str3) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.ExposedByteArrayOutputStream exposedByteArrayOutputStream = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.ExposedByteArrayOutputStream();
        exposedByteArrayOutputStream.write(1);
        this.f71638xb1cb0c4f.mo84733xd98e5cd2(exposedByteArrayOutputStream, str);
        this.f71638xb1cb0c4f.mo84733xd98e5cd2(exposedByteArrayOutputStream, str2);
        if (obj instanceof java.lang.Throwable) {
            this.f71638xb1cb0c4f.mo84733xd98e5cd2(exposedByteArrayOutputStream, io.p3284xd2ae381c.Log.m136959x2d915d84((java.lang.Throwable) obj));
        } else {
            this.f71638xb1cb0c4f.mo84733xd98e5cd2(exposedByteArrayOutputStream, obj);
        }
        this.f71638xb1cb0c4f.mo84733xd98e5cd2(exposedByteArrayOutputStream, str3);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(exposedByteArrayOutputStream.size());
        allocateDirect.put(exposedByteArrayOutputStream.m138459xaddb9440(), 0, exposedByteArrayOutputStream.size());
        return allocateDirect;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28689x2a9c5b95
    /* renamed from: encodeMethodCall */
    public java.nio.ByteBuffer mo138428x69ba5d95(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.ExposedByteArrayOutputStream exposedByteArrayOutputStream = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.ExposedByteArrayOutputStream();
        this.f71638xb1cb0c4f.mo84733xd98e5cd2(exposedByteArrayOutputStream, c28687x4bb242ff.f71610xbfc5d0e1);
        this.f71638xb1cb0c4f.mo84733xd98e5cd2(exposedByteArrayOutputStream, c28687x4bb242ff.f71609x86ac7956);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(exposedByteArrayOutputStream.size());
        allocateDirect.put(exposedByteArrayOutputStream.m138459xaddb9440(), 0, exposedByteArrayOutputStream.size());
        return allocateDirect;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28689x2a9c5b95
    /* renamed from: encodeSuccessEnvelope */
    public java.nio.ByteBuffer mo138429xf780cbfd(java.lang.Object obj) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.ExposedByteArrayOutputStream exposedByteArrayOutputStream = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.ExposedByteArrayOutputStream();
        exposedByteArrayOutputStream.write(0);
        this.f71638xb1cb0c4f.mo84733xd98e5cd2(exposedByteArrayOutputStream, obj);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(exposedByteArrayOutputStream.size());
        allocateDirect.put(exposedByteArrayOutputStream.m138459xaddb9440(), 0, exposedByteArrayOutputStream.size());
        return allocateDirect;
    }
}
