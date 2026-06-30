package com.p314xaae8f345.tav.p2965xf0edce24;

/* renamed from: com.tencent.tav.extractor.ApiExtractorDelegate */
/* loaded from: classes10.dex */
public class C25819x28cbdcef implements com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680 {
    private static final java.lang.String TAG = "ApiAssetExtractorDelegate";

    /* renamed from: released */
    private boolean f48538xdf23d93d = false;

    /* renamed from: mediaExtractor */
    private android.media.MediaExtractor f48537x50861ea0 = new android.media.MediaExtractor();

    @Override // com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680
    /* renamed from: advance */
    public synchronized boolean mo72439xbc8da882() {
        if (!this.f48538xdf23d93d) {
            this.f48537x50861ea0.advance();
        }
        return false;
    }

    @Override // com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680
    /* renamed from: getSampleTime */
    public synchronized long mo72441xf6c90f8d() {
        if (this.f48538xdf23d93d) {
            return -1L;
        }
        return this.f48537x50861ea0.getSampleTime();
    }

    @Override // com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680
    /* renamed from: getSampleTrackIndex */
    public synchronized int mo72442x452c8b07() {
        if (this.f48538xdf23d93d) {
            return -1;
        }
        return this.f48537x50861ea0.getSampleTrackIndex();
    }

    @Override // com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680
    /* renamed from: getTrackCount */
    public final synchronized int mo72443x31d73e7a() {
        if (this.f48538xdf23d93d) {
            return 0;
        }
        return this.f48537x50861ea0.getTrackCount();
    }

    @Override // com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680
    /* renamed from: getTrackFormat */
    public synchronized android.media.MediaFormat mo72444xe2db7ec(int i17) {
        return this.f48537x50861ea0.getTrackFormat(i17);
    }

    @Override // com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680
    /* renamed from: needMirror */
    public boolean mo72445xa5b697f5() {
        return true;
    }

    @Override // com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680
    /* renamed from: readSampleData */
    public synchronized int mo72446x416da6aa(java.nio.ByteBuffer byteBuffer, int i17) {
        if (this.f48538xdf23d93d) {
            return -1;
        }
        return this.f48537x50861ea0.readSampleData(byteBuffer, i17);
    }

    @Override // com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680
    /* renamed from: release */
    public final synchronized void mo72447x41012807() {
        this.f48537x50861ea0.release();
    }

    @Override // com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680
    /* renamed from: seekTo */
    public synchronized void mo72448xc9fc1b13(long j17, int i17) {
        if (!this.f48538xdf23d93d) {
            this.f48537x50861ea0.seekTo(j17, i17);
        }
    }

    @Override // com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680
    /* renamed from: selectTrack */
    public synchronized void mo72449xc3b89af(int i17) {
        if (!this.f48538xdf23d93d) {
            this.f48537x50861ea0.selectTrack(i17);
        }
    }

    @Override // com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680
    /* renamed from: setDataSource */
    public final synchronized void mo72450x683d6267(java.lang.String str) {
        try {
            this.f48537x50861ea0.setDataSource(str);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "setDataSource", e17);
        }
    }

    @Override // com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680
    /* renamed from: setIsSoft */
    public void mo72451x11f52776(boolean z17) {
    }

    @Override // com.p314xaae8f345.tav.p2965xf0edce24.InterfaceC25824xcbed6680
    /* renamed from: unselectTrack */
    public synchronized void mo72452x5c729176(int i17) {
        if (!this.f48538xdf23d93d) {
            this.f48537x50861ea0.unselectTrack(i17);
        }
    }
}
