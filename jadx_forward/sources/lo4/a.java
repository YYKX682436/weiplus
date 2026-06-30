package lo4;

/* loaded from: classes14.dex */
public final class a implements com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69 {

    /* renamed from: a, reason: collision with root package name */
    public android.media.MediaFormat f401724a;

    /* renamed from: b, reason: collision with root package name */
    public int f401725b;

    /* renamed from: c, reason: collision with root package name */
    public long f401726c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 f401727d;

    /* renamed from: e, reason: collision with root package name */
    public int f401728e;

    /* renamed from: f, reason: collision with root package name */
    public java.nio.ByteBuffer f401729f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 f401730g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f401731h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 f401732i = new com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1();

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69
    /* renamed from: endWriteAudioSample */
    public boolean mo97320x6affabc() {
        this.f401732i.i("MicroMsg.CompositionAudioSoftEncoder", "endWriteAudioSample: ", new java.lang.Object[0]);
        java.nio.ByteBuffer byteBuffer = this.f401729f;
        if (byteBuffer == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dataBuffer");
            throw null;
        }
        int position = byteBuffer.position();
        if (position > 0) {
            java.nio.ByteBuffer byteBuffer2 = this.f401729f;
            if (byteBuffer2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dataBuffer");
                throw null;
            }
            byteBuffer2.position(0);
            int i17 = this.f401725b;
            java.nio.ByteBuffer byteBuffer3 = this.f401729f;
            if (byteBuffer3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dataBuffer");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17685x166cb3fc.m69152x926aec4f(i17, byteBuffer3, position, this.f401726c);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17685x166cb3fc.m69147xd8eddf6e(this.f401725b);
        return true;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69
    /* renamed from: getEncodeFormat */
    public android.media.MediaFormat mo97321x16f04c23() {
        android.media.MediaFormat mediaFormat = this.f401724a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mediaFormat);
        return mediaFormat;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69
    /* renamed from: getEncodePresentationTimeUs */
    public long mo97322xaafb0031() {
        return this.f401726c;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69
    /* renamed from: isEncodeToEndOfStream */
    public boolean mo97323xa79748b7() {
        return this.f401731h;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69
    /* renamed from: prepare */
    public boolean mo97324xed060d07(com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 outputConfig, android.media.MediaFormat mediaFormat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputConfig, "outputConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaFormat, "mediaFormat");
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25800x8b670e73 c25800x8b670e73 = outputConfig.f47466xc231f8f2;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1 = this.f401732i;
        if (c25800x8b670e73 != null) {
            c25799x4a77fd1.m97816x78bda44(c25800x8b670e73);
        }
        this.f401727d = outputConfig;
        this.f401724a = mediaFormat;
        int m69151x630f29e = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17685x166cb3fc.m69151x630f29e(mediaFormat.getInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63), outputConfig.m96735x317dfe9c(), outputConfig.m96733x2721f40c(), mediaFormat.getInteger("aac-profile"));
        this.f401725b = m69151x630f29e;
        int m69149x56a857ca = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17685x166cb3fc.m69149x56a857ca(m69151x630f29e);
        int m69148x9ccb5289 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17685x166cb3fc.m69148x9ccb5289(this.f401725b);
        this.f401728e = m69148x9ccb5289;
        java.nio.ByteBuffer order = java.nio.ByteBuffer.allocateDirect(m69148x9ccb5289).order(java.nio.ByteOrder.nativeOrder());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(order, "order(...)");
        this.f401729f = order;
        c25799x4a77fd1.i("MicroMsg.CompositionAudioSoftEncoder", "prepare: " + this.f401725b + ' ' + this.f401728e + ", " + m69149x56a857ca, new java.lang.Object[0]);
        if (m69149x56a857ca == 0) {
            return true;
        }
        throw new com.p314xaae8f345.tav.p2947x2eaf9f.C25681xf4008f4b(new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(-104, null, mediaFormat.toString()));
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69
    /* renamed from: release */
    public void mo97325x41012807() {
        this.f401732i.i("MicroMsg.CompositionAudioSoftEncoder", "release: " + this.f401725b, new java.lang.Object[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17685x166cb3fc.m69146x62cd7fac(this.f401725b);
        this.f401725b = 0;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69
    /* renamed from: setMediaMuxer */
    public void mo97326x8f07f4fb(com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 interfaceC25803x5eabc422) {
        this.f401730g = interfaceC25803x5eabc422;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69
    /* renamed from: start */
    public boolean mo97327x68ac462() {
        return true;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69
    /* renamed from: stop */
    public void mo97328x360802() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69
    /* renamed from: writeAudioFrame */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo97329x3a033c76(boolean r9) {
        /*
            r8 = this;
            com.tencent.tav.decoder.muxer.IMediaMuxer r0 = r8.f401730g
            r1 = -1
            if (r0 == 0) goto La
            int r0 = r0.getAudioId()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 1
            if (r0 != r1) goto Lf
            return r2
        Lf:
            long[] r1 = new long[r2]
            r3 = 0
            r5 = 0
            r1[r5] = r3
            int r3 = r8.f401725b
            byte[] r3 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17685x166cb3fc.m69150xed73b4c9(r3, r1)
            if (r3 == 0) goto L4e
            int r4 = r3.length
            if (r4 != 0) goto L23
            r4 = r2
            goto L24
        L23:
            r4 = r5
        L24:
            r4 = r4 ^ r2
            if (r4 == 0) goto L4e
            android.media.MediaCodec$BufferInfo r4 = new android.media.MediaCodec$BufferInfo
            r4.<init>()
            r6 = r1[r5]
            r4.presentationTimeUs = r6
            int r1 = r3.length
            r4.size = r1
            int r1 = r3.length
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r6 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r1 = r1.order(r6)
            r1.put(r3)
            r1.position(r5)
            com.tencent.tav.decoder.muxer.IMediaMuxer r3 = r8.f401730g
            if (r3 == 0) goto L4f
            r3.mo72400xe78c1db3(r0, r1, r4)
            goto L4f
        L4e:
            r5 = r2
        L4f:
            if (r9 == 0) goto L53
            r8.f401731h = r2
        L53:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lo4.a.mo97329x3a033c76(boolean):boolean");
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69
    /* renamed from: writeAudioSample */
    public long mo97330x1ba943c1(long j17, java.nio.ByteBuffer audioBuffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioBuffer, "audioBuffer");
        int position = audioBuffer.position();
        int limit = audioBuffer.limit();
        java.nio.ByteBuffer byteBuffer = this.f401729f;
        if (byteBuffer == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dataBuffer");
            throw null;
        }
        int position2 = byteBuffer.position();
        java.nio.ByteBuffer byteBuffer2 = this.f401729f;
        if (byteBuffer2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dataBuffer");
            throw null;
        }
        int min = java.lang.Math.min(byteBuffer2.capacity() - position2, limit - position);
        int i17 = position + min;
        audioBuffer.limit(i17);
        java.nio.ByteBuffer byteBuffer3 = this.f401729f;
        if (byteBuffer3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dataBuffer");
            throw null;
        }
        byteBuffer3.put(audioBuffer);
        int i18 = position2 + min;
        java.nio.ByteBuffer byteBuffer4 = this.f401729f;
        if (byteBuffer4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dataBuffer");
            throw null;
        }
        if (i18 >= byteBuffer4.capacity()) {
            java.nio.ByteBuffer byteBuffer5 = this.f401729f;
            if (byteBuffer5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dataBuffer");
                throw null;
            }
            byteBuffer5.position(0);
            int i19 = this.f401725b;
            java.nio.ByteBuffer byteBuffer6 = this.f401729f;
            if (byteBuffer6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dataBuffer");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17685x166cb3fc.m69152x926aec4f(i19, byteBuffer6, this.f401728e, j17);
            this.f401726c = j17;
        } else {
            java.nio.ByteBuffer byteBuffer7 = this.f401729f;
            if (byteBuffer7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dataBuffer");
                throw null;
            }
            byteBuffer7.position(min);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("writeAudioSample: write size is ");
        sb6.append(position);
        sb6.append(", ");
        java.nio.ByteBuffer byteBuffer8 = this.f401729f;
        if (byteBuffer8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dataBuffer");
            throw null;
        }
        sb6.append(byteBuffer8.position());
        sb6.append(", ");
        sb6.append(min);
        sb6.append('}');
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25799x4a77fd1 c25799x4a77fd1 = this.f401732i;
        c25799x4a77fd1.m97814x5d2a96d("MicroMsg.CompositionAudioSoftEncoder", sb7);
        if (min <= 0) {
            c25799x4a77fd1.w("MicroMsg.CompositionAudioSoftEncoder", "writeAudioSample: error");
            return 0L;
        }
        audioBuffer.position(i17);
        com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 c25679xbb204036 = this.f401727d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c25679xbb204036);
        int m96733x2721f40c = c25679xbb204036.m96733x2721f40c();
        com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 c25679xbb2040362 = this.f401727d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c25679xbb2040362);
        return com.p314xaae8f345.tav.p2959x5befac44.C25762xc5b4d2ed.m97459xd375d3d4(min, m96733x2721f40c, c25679xbb2040362.m96735x317dfe9c());
    }
}
