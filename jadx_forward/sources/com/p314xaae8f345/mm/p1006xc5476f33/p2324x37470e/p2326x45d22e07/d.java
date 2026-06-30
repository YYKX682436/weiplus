package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07;

/* loaded from: classes10.dex */
public final class d extends com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.C18788x9408116c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f257359a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f257360b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f257361c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b f257362d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String path, int i17) {
        super(path, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f257359a = path;
        this.f257360b = "MicroMsg.ParallelSoftWriter[" + hashCode() + ']';
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.C18788x9408116c, com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: addTrack */
    public int mo72369xb5bac52a(android.media.MediaFormat mediaFormat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaFormat, "mediaFormat");
        boolean z17 = false;
        if (mediaFormat.containsKey("mime")) {
            java.lang.String string = mediaFormat.getString("mime");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            if (r26.n0.B(string, "video", false)) {
                z17 = true;
            }
        }
        if (z17) {
            return super.mo72369xb5bac52a(mediaFormat);
        }
        m72389x742381ab(mediaFormat);
        this.f257362d = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b.f257336l.a(mediaFormat, java.lang.String.valueOf(hashCode()));
        return getAudioId();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.C18788x9408116c, com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: audioTrackIndex */
    public int getAudioId() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b bVar = this.f257362d;
        if (bVar != null) {
            return bVar.f257338b;
        }
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.C18788x9408116c, com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: clearResource */
    public void mo72372xbfab417b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f257360b, "clearResource");
        super.mo72372xbfab417b();
        super.mo72388x41012807();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.C18788x9408116c, com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: release */
    public void mo72388x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f257360b, "release");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.C18788x9408116c, com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: stop */
    public boolean mo72398x360802(boolean z17) {
        if (this.f257361c) {
            return true;
        }
        this.f257361c = true;
        com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24 encoder = getEncoder();
        if (encoder != null) {
            encoder.mo72511x360802();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b bVar = this.f257362d;
        if (bVar != null) {
            try {
                java.nio.channels.WritableByteChannel writableByteChannel = bVar.f257346j;
                if (writableByteChannel != null) {
                    writableByteChannel.close();
                }
            } catch (java.lang.Exception unused) {
            }
        }
        if (getDuration() > 0) {
            m72394x4029c9bf(false);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f257360b, "error duration is 0");
        m72394x4029c9bf(false);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.C18788x9408116c, com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: writeSampleData */
    public void mo72400xe78c1db3(int i17, java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(byteBuffer, "byteBuffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferInfo, "bufferInfo");
        if (i17 != getAudioId()) {
            super.mo72400xe78c1db3(i17, byteBuffer, bufferInfo);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b bVar = this.f257362d;
        if (bVar != null) {
            bVar.a(byteBuffer, bufferInfo);
        }
    }
}
