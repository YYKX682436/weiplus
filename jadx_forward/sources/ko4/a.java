package ko4;

/* loaded from: classes14.dex */
public final class a implements com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f391565a;

    /* renamed from: b, reason: collision with root package name */
    public long f391566b;

    /* renamed from: c, reason: collision with root package name */
    public java.nio.ByteBuffer f391567c;

    /* renamed from: d, reason: collision with root package name */
    public java.nio.ByteBuffer f391568d;

    /* renamed from: e, reason: collision with root package name */
    public long f391569e;

    public a() {
        mq1.w0.wi();
        fp.d0.n("mediaplus");
        this.f391565a = "AudioSoftDecoder";
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: bindSurfaceTexture */
    public void mo96247x49c4954b(android.graphics.SurfaceTexture p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: configure */
    public void mo96248xd00d62e6(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17) {
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: createInputSurface */
    public android.view.Surface mo96249x4310109f() {
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: dequeueInputBuffer */
    public int mo96250x9a572d5a(long j17) {
        return 0;
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: dequeueOutputBuffer */
    public int mo96251x436dd5f1(android.media.MediaCodec.BufferInfo info, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        byte[] m46865xed73b4c9 = com.p314xaae8f345.mm.p871x7fa16b7e.C10907x6934c5e1.m46865xed73b4c9(this.f391566b);
        if (m46865xed73b4c9 == null) {
            return -1;
        }
        if (m46865xed73b4c9.length == 0) {
            return -1;
        }
        int length = m46865xed73b4c9.length;
        java.nio.ByteBuffer byteBuffer = this.f391568d;
        int min = java.lang.Math.min(length, byteBuffer != null ? byteBuffer.capacity() : 0);
        int length2 = m46865xed73b4c9.length;
        java.lang.String str = this.f391565a;
        if (min < length2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "output size not enough " + min + ", " + m46865xed73b4c9.length);
        }
        info.presentationTimeUs = this.f391569e;
        info.size = min;
        java.nio.ByteBuffer byteBuffer2 = this.f391568d;
        if (byteBuffer2 != null) {
            byteBuffer2.position(0);
            if (byteBuffer2.limit() != min) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "output buffer size changed " + byteBuffer2.limit() + " -> " + min);
            }
            byteBuffer2.limit(min);
            byteBuffer2.put(m46865xed73b4c9, 0, min);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: flush */
    public void mo96252x5d03b04() {
        com.p314xaae8f345.mm.p871x7fa16b7e.C10907x6934c5e1.m46863xbfc25f36(this.f391566b);
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: getInputBuffer */
    public java.nio.ByteBuffer mo96253xaa9f9f74(int i17) {
        java.nio.ByteBuffer byteBuffer = this.f391567c;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        return this.f391567c;
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: getInputFormat */
    public android.media.MediaFormat mo96254xb124032b() {
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: getOutputBuffer */
    public java.nio.ByteBuffer mo96255x3c33a717(int i17) {
        return this.f391568d;
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: getOutputFormat */
    public android.media.MediaFormat mo96256x42b80ace() {
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: isSoft */
    public boolean mo96257xb9a8d074() {
        return false;
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: queueInputBuffer */
    public void mo96258xfe5642d9(int i17, int i18, int i19, long j17, int i27) {
        this.f391569e = j17;
        java.nio.ByteBuffer byteBuffer = this.f391567c;
        if (byteBuffer != null) {
            com.p314xaae8f345.mm.p871x7fa16b7e.C10907x6934c5e1.m46861xdc168c6(this.f391566b, byteBuffer, i19);
        }
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: release */
    public void mo96259x41012807() {
        com.p314xaae8f345.mm.p871x7fa16b7e.C10907x6934c5e1.m46862x62cd7fac(this.f391566b);
        this.f391566b = 0L;
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: releaseOutputBuffer */
    public void mo96260xab26be48(int i17, boolean z17) {
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: reset */
    public void mo96261x6761d4f() {
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: setDataSource */
    public void mo96262x683d6267(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        long m46867x630f29e = com.p314xaae8f345.mm.p871x7fa16b7e.C10907x6934c5e1.m46867x630f29e(path);
        this.f391566b = m46867x630f29e;
        int m46866xefb17c6a = com.p314xaae8f345.mm.p871x7fa16b7e.C10907x6934c5e1.m46866xefb17c6a(m46867x630f29e);
        int m46864x56a857ca = com.p314xaae8f345.mm.p871x7fa16b7e.C10907x6934c5e1.m46864x56a857ca(this.f391566b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f391565a, "configure " + this.f391566b + ' ' + m46866xefb17c6a + ' ' + m46864x56a857ca);
        if (m46864x56a857ca != 0) {
            throw new com.p314xaae8f345.tav.p2947x2eaf9f.C25681xf4008f4b(new com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6(-202, null, ""));
        }
        this.f391567c = java.nio.ByteBuffer.allocateDirect(8192).order(java.nio.ByteOrder.nativeOrder());
        this.f391568d = java.nio.ByteBuffer.allocateDirect(m46866xefb17c6a).order(java.nio.ByteOrder.nativeOrder());
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: signalEndOfInputStream */
    public void mo96263x4cb1f740() {
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: start */
    public void mo96264x68ac462() {
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb
    /* renamed from: stop */
    public void mo96265x360802() {
    }
}
