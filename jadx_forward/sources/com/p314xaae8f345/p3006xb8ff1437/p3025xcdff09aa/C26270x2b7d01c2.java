package com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa;

/* renamed from: com.tencent.thumbplayer.composition.TPMediaComposition */
/* loaded from: classes16.dex */
public class C26270x2b7d01c2 extends com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26269xe91d43dd implements com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26218xd112e1cb {
    private static final java.lang.String TAG = "TPMediaComposition";

    /* renamed from: mVideoTrackSequence */
    private int f51460xffd28be = 0;

    /* renamed from: mAudioTrackSequence */
    private int f51458x1f69ad43 = 0;

    /* renamed from: mAVTrackSequence */
    private int f51456x9c60afea = 0;

    /* renamed from: mVideoTracks */
    private java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c> f51461xe9c7c236 = new java.util.ArrayList(1);

    /* renamed from: mAudioTracks */
    private java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c> f51459xc5fb1951 = new java.util.ArrayList(1);

    /* renamed from: mAVTracks */
    private java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c> f51457xdc72b48a = new java.util.ArrayList(1);

    /* renamed from: generateAVTrackSequence */
    private synchronized int m101596xe73ae9e2() {
        int i17;
        i17 = this.f51456x9c60afea + 1;
        this.f51456x9c60afea = i17;
        return i17;
    }

    /* renamed from: generateAudioTrackSequence */
    private synchronized int m101597xc8a9904b() {
        int i17;
        i17 = this.f51458x1f69ad43 + 1;
        this.f51458x1f69ad43 = i17;
        return i17;
    }

    /* renamed from: generateVideoTrackSequence */
    private synchronized int m101598xb93d0bc6() {
        int i17;
        i17 = this.f51460xffd28be + 1;
        this.f51460xffd28be = i17;
        return i17;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26218xd112e1cb
    /* renamed from: addAVTrack */
    public synchronized com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c mo101289x148f9255() {
        com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26272x7f5cc8a9 c26272x7f5cc8a9;
        c26272x7f5cc8a9 = new com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26272x7f5cc8a9(m101596xe73ae9e2(), 1);
        this.f51457xdc72b48a.add(c26272x7f5cc8a9);
        return c26272x7f5cc8a9;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26218xd112e1cb
    /* renamed from: addAudioTrack */
    public synchronized com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c mo101290x5cef1a96() {
        com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26272x7f5cc8a9 c26272x7f5cc8a9;
        c26272x7f5cc8a9 = new com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26272x7f5cc8a9(m101597xc8a9904b(), 3);
        this.f51459xc5fb1951.add(c26272x7f5cc8a9);
        return c26272x7f5cc8a9;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26218xd112e1cb
    /* renamed from: addVideoTrack */
    public synchronized com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c mo101291xa0274111() {
        com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26272x7f5cc8a9 c26272x7f5cc8a9;
        c26272x7f5cc8a9 = new com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26272x7f5cc8a9(m101598xb93d0bc6(), 2);
        this.f51461xe9c7c236.add(c26272x7f5cc8a9);
        return c26272x7f5cc8a9;
    }

    /* renamed from: getAVDuration */
    public long m101599xda3090bf() {
        java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c> list = this.f51457xdc72b48a;
        long j17 = 0;
        if (list != null) {
            for (com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c interfaceC26221xfaf4b62c : list) {
                if (j17 < interfaceC26221xfaf4b62c.mo101314xa3e6b771()) {
                    j17 = interfaceC26221xfaf4b62c.mo101314xa3e6b771();
                }
            }
        }
        return j17;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26218xd112e1cb
    /* renamed from: getAllAVTracks */
    public java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c> mo101292x9ba80088() {
        return this.f51457xdc72b48a;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26218xd112e1cb
    /* renamed from: getAllAudioTracks */
    public synchronized java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c> mo101293xe1316493() {
        return this.f51459xc5fb1951;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26218xd112e1cb
    /* renamed from: getAllVideoTracks */
    public synchronized java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c> mo101294x4fe0d78() {
        return this.f51461xe9c7c236;
    }

    /* renamed from: getAudioDuration */
    public long m101600xd375d3d4() {
        java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c> list = this.f51459xc5fb1951;
        long j17 = 0;
        if (list != null) {
            for (com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c interfaceC26221xfaf4b62c : list) {
                if (j17 < interfaceC26221xfaf4b62c.mo101314xa3e6b771()) {
                    j17 = interfaceC26221xfaf4b62c.mo101314xa3e6b771();
                }
            }
        }
        return j17;
    }

    /* renamed from: getAudioTrack */
    public synchronized com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c m101601x49fe130b(int i17) {
        return this.f51459xc5fb1951.get(i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26218xd112e1cb
    /* renamed from: getDurationMs */
    public long mo101295x37a7fa50() {
        if (!com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(this.f51457xdc72b48a)) {
            return m101599xda3090bf();
        }
        long m101600xd375d3d4 = m101600xd375d3d4();
        long m101602x36bbd779 = m101602x36bbd779();
        long j17 = m101602x36bbd779 > m101600xd375d3d4 ? m101602x36bbd779 : m101600xd375d3d4;
        java.lang.String str = com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26271x57102410.f51499xd3a32a69;
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -2046821033:
                if (str.equals("base_longer")) {
                    c17 = 0;
                    break;
                }
                break;
            case -491658008:
                if (str.equals("base_audio")) {
                    c17 = 1;
                    break;
                }
                break;
            case -472621683:
                if (str.equals("base_video")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                if (m101602x36bbd779 <= m101600xd375d3d4) {
                    return m101600xd375d3d4;
                }
                break;
            case 1:
                return m101600xd375d3d4;
            case 2:
                break;
            default:
                return j17;
        }
        return m101602x36bbd779;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26269xe91d43dd, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1
    /* renamed from: getMediaType */
    public int mo101277x7f025288() {
        return 4;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26269xe91d43dd, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1
    /* renamed from: getUrl */
    public java.lang.String mo101278xb5887639() {
        try {
            return com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26274xbc47d75e.m101614xf841634b(this);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            return null;
        }
    }

    /* renamed from: getVideoDuration */
    public long m101602x36bbd779() {
        java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c> list = this.f51461xe9c7c236;
        long j17 = 0;
        if (list != null) {
            for (com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c interfaceC26221xfaf4b62c : list) {
                if (j17 < interfaceC26221xfaf4b62c.mo101314xa3e6b771()) {
                    j17 = interfaceC26221xfaf4b62c.mo101314xa3e6b771();
                }
            }
        }
        return j17;
    }

    /* renamed from: getVideoTrack */
    public synchronized com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c m101603x8d363986(int i17) {
        return this.f51461xe9c7c236.get(i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26218xd112e1cb
    /* renamed from: release */
    public void mo101296x41012807() {
        java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c> list = this.f51461xe9c7c236;
        if (list != null) {
            list.clear();
            this.f51461xe9c7c236 = null;
        }
        java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c> list2 = this.f51459xc5fb1951;
        if (list2 != null) {
            list2.clear();
            this.f51459xc5fb1951 = null;
        }
        java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c> list3 = this.f51457xdc72b48a;
        if (list3 != null) {
            list3.clear();
            this.f51457xdc72b48a = null;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26218xd112e1cb
    /* renamed from: removeAVTrack */
    public boolean mo101297xea13fd12(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c interfaceC26221xfaf4b62c) {
        if (interfaceC26221xfaf4b62c != null) {
            return this.f51457xdc72b48a.remove(interfaceC26221xfaf4b62c);
        }
        throw new java.lang.IllegalArgumentException("remove audio track , track is null .");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26218xd112e1cb
    /* renamed from: removeAudioTrack */
    public synchronized boolean mo101298x99705ab9(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c interfaceC26221xfaf4b62c) {
        if (interfaceC26221xfaf4b62c == null) {
            throw new java.lang.IllegalArgumentException("remove audio track , track is null .");
        }
        return this.f51459xc5fb1951.remove(interfaceC26221xfaf4b62c);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26218xd112e1cb
    /* renamed from: removeVideoTrack */
    public synchronized boolean mo101299xdca88134(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c interfaceC26221xfaf4b62c) {
        if (interfaceC26221xfaf4b62c == null) {
            throw new java.lang.IllegalArgumentException("remove video track , track is null .");
        }
        return this.f51461xe9c7c236.remove(interfaceC26221xfaf4b62c);
    }

    /* renamed from: setAVTracks */
    public void m101604x2e07ab7f(java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c> list) {
        this.f51457xdc72b48a = list;
    }

    /* renamed from: setAudioTracks */
    public void m101605x8c29c23c(java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c> list) {
        this.f51459xc5fb1951 = list;
    }

    /* renamed from: setVideoTracks */
    public void m101606xaff66b21(java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c> list) {
        this.f51461xe9c7c236 = list;
    }
}
