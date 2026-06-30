package com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa;

/* renamed from: com.tencent.thumbplayer.composition.TPMediaCompositionTrack */
/* loaded from: classes16.dex */
public class C26272x7f5cc8a9 extends com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26269xe91d43dd implements com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c, java.io.Serializable {
    private static final java.lang.String TAG = "TPMediaCompositionTrack";

    /* renamed from: mTrackClips */
    private java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c> f51501x1fc6f4e5;

    /* renamed from: mTrackId */
    private int f51502x5e798699;

    /* renamed from: mTrackType */
    private int f51503xa637a138;

    public C26272x7f5cc8a9(int i17) {
        this.f51502x5e798699 = -1;
        this.f51503xa637a138 = i17;
        this.f51501x1fc6f4e5 = new java.util.ArrayList();
    }

    /* renamed from: checkClipValid */
    private synchronized void m101608xd97f264(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c interfaceC26222x6835d79c) {
        try {
            if (interfaceC26222x6835d79c == null) {
                throw new java.lang.IllegalArgumentException("add track clip , clip can not be null");
            }
            if (interfaceC26222x6835d79c.mo101277x7f025288() != this.f51503xa637a138) {
                throw new java.lang.IllegalArgumentException("add track clip failed, media type is not same");
            }
        } catch (java.lang.Throwable th6) {
            throw th6;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c
    /* renamed from: addTrackClip */
    public synchronized int mo101312x2340379a(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c interfaceC26222x6835d79c) {
        m101608xd97f264(interfaceC26222x6835d79c);
        if (!this.f51501x1fc6f4e5.contains(interfaceC26222x6835d79c)) {
            this.f51501x1fc6f4e5.add(interfaceC26222x6835d79c);
            return interfaceC26222x6835d79c.mo101322x142a3b81();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "add track clip failed, clip already exists : " + interfaceC26222x6835d79c.mo101322x142a3b81());
        return interfaceC26222x6835d79c.mo101322x142a3b81();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c
    /* renamed from: getAllTrackClips */
    public synchronized java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c> mo101313xe6d93963() {
        return this.f51501x1fc6f4e5;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26269xe91d43dd, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1
    /* renamed from: getMediaType */
    public synchronized int mo101277x7f025288() {
        return this.f51503xa637a138;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c
    /* renamed from: getTimelineDurationMs */
    public synchronized long mo101314xa3e6b771() {
        long j17;
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c> it = this.f51501x1fc6f4e5.iterator();
        j17 = 0;
        while (it.hasNext()) {
            j17 += it.next().mo101325x81a6b901();
        }
        return j17;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c
    /* renamed from: getTrackClip */
    public synchronized com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c mo101315x2ae5dc85(int i17) {
        for (com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c interfaceC26222x6835d79c : this.f51501x1fc6f4e5) {
            if (interfaceC26222x6835d79c.mo101322x142a3b81() == i17) {
                return interfaceC26222x6835d79c;
            }
        }
        return null;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c
    /* renamed from: getTrackId */
    public synchronized int mo101316xfe2e0f90() {
        return this.f51502x5e798699;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26269xe91d43dd, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1
    /* renamed from: getUrl */
    public synchronized java.lang.String mo101278xb5887639() {
        try {
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            return null;
        }
        return com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26274xbc47d75e.m101620x19adc21(this.f51501x1fc6f4e5, this.f51503xa637a138);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c
    /* renamed from: insertTrackClip */
    public synchronized int mo101317xb846c882(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c interfaceC26222x6835d79c, int i17) {
        m101608xd97f264(interfaceC26222x6835d79c);
        if (this.f51501x1fc6f4e5.contains(interfaceC26222x6835d79c)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "add track clip failed, clip already exists : " + interfaceC26222x6835d79c.mo101322x142a3b81());
            return interfaceC26222x6835d79c.mo101322x142a3b81();
        }
        if (i17 == -1) {
            this.f51501x1fc6f4e5.add(0, interfaceC26222x6835d79c);
            return interfaceC26222x6835d79c.mo101322x142a3b81();
        }
        int size = this.f51501x1fc6f4e5.size();
        for (int i18 = 0; i18 < size; i18++) {
            if (this.f51501x1fc6f4e5.get(i18).mo101322x142a3b81() == i17) {
                this.f51501x1fc6f4e5.add(i18 + 1, interfaceC26222x6835d79c);
                return interfaceC26222x6835d79c.mo101322x142a3b81();
            }
        }
        this.f51501x1fc6f4e5.add(interfaceC26222x6835d79c);
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "insert track clip into the end, coz after clip not found :" + i17);
        return interfaceC26222x6835d79c.mo101322x142a3b81();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c
    /* renamed from: removeAllTrackClips */
    public synchronized void mo101318x2abcaaf5() {
        this.f51501x1fc6f4e5.clear();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c
    /* renamed from: removeTrackClip */
    public synchronized boolean mo101319xa954e717(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c interfaceC26222x6835d79c) {
        if (interfaceC26222x6835d79c == null) {
            throw new java.lang.IllegalArgumentException("remove track clip , clip can not be null");
        }
        return this.f51501x1fc6f4e5.remove(interfaceC26222x6835d79c);
    }

    /* renamed from: setTrackId */
    public void m101609x719f5d04(int i17) {
        this.f51502x5e798699 = i17;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c
    /* renamed from: swapTrackClip */
    public synchronized boolean mo101320xa6238ee8(int i17, int i18) {
        if (i17 >= 0) {
            if (i17 < this.f51501x1fc6f4e5.size()) {
                if (i18 >= 0 && i18 < this.f51501x1fc6f4e5.size()) {
                    java.util.Collections.swap(this.f51501x1fc6f4e5, i17, i18);
                    return true;
                }
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "swap clip failed, to pos invalid , to pos :" + i18);
                return false;
            }
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "swap clip failed, from pos invalid , from pos : " + i17);
        return false;
    }

    public C26272x7f5cc8a9(int i17, int i18) {
        this.f51502x5e798699 = i17;
        this.f51503xa637a138 = i18;
        this.f51501x1fc6f4e5 = new java.util.ArrayList();
    }
}
