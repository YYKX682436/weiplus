package com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d;

/* renamed from: com.tencent.tav.decoder.muxer.DefaultMediaMuxer */
/* loaded from: classes10.dex */
public class C25802x700ac3fa implements com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 {

    /* renamed from: muxer */
    private android.media.MediaMuxer f48385x637007d;
    private final java.lang.String TAG = "DefaultMediaMuxer";

    /* renamed from: isStarted */
    private boolean f48384x6c5c87f7 = false;

    /* renamed from: videoTrackIndex */
    private int f48386x8d453122 = -1;

    /* renamed from: audioTrackIndex */
    private int f48383xe37182bd = -1;

    public C25802x700ac3fa(java.lang.String str, int i17) {
        this.f48385x637007d = new android.media.MediaMuxer(str, i17);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: addTrack */
    public int mo72369xb5bac52a(android.media.MediaFormat mediaFormat) {
        int addTrack = this.f48385x637007d.addTrack(mediaFormat);
        if (mediaFormat.containsKey("mime")) {
            java.lang.String string = mediaFormat.getString("mime");
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i("DefaultMediaMuxer", "add track mime:" + string);
            if (string.contains("video")) {
                this.f48386x8d453122 = addTrack;
            } else if (string.contains("audio")) {
                this.f48383xe37182bd = addTrack;
            }
        }
        return addTrack;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: audioTrackIndex */
    public int mo72370xe37182bd() {
        return this.f48383xe37182bd;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: clearResource */
    public void mo72372xbfab417b() {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: getExportConfig */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 mo72379x12477e8c() {
        return null;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: ignoreHeader */
    public boolean mo72384xf2d0a6ff() {
        return true;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: isMuxerStarted */
    public boolean mo72385x5b9eb38e() {
        return this.f48384x6c5c87f7;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: prepareParallelSegmentInfo */
    public void mo72387x60565d73(int i17, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d262) {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: release */
    public void mo72388x41012807() {
        this.f48385x637007d.release();
        this.f48384x6c5c87f7 = false;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i("DefaultMediaMuxer", "release muxer");
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: setExportConfig */
    public void mo72392x48907998(com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 c25679xbb204036) {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: start */
    public void mo72397x68ac462() {
        this.f48385x637007d.start();
        this.f48384x6c5c87f7 = true;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: stop */
    public boolean mo72398x360802(boolean z17) {
        this.f48385x637007d.stop();
        this.f48384x6c5c87f7 = false;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i("DefaultMediaMuxer", "stop muxer");
        return true;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: videoTrackIndex */
    public int mo72399x8d453122() {
        return this.f48386x8d453122;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: writeSampleData */
    public void mo72400xe78c1db3(int i17, java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) {
        this.f48385x637007d.writeSampleData(i17, byteBuffer, bufferInfo);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: writeSampleDataTime */
    public void mo72401xe437d320(boolean z17, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
    }
}
