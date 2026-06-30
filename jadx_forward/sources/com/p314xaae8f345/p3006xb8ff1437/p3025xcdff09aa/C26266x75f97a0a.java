package com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa;

/* renamed from: com.tencent.thumbplayer.composition.TPEmptyTrackClip */
/* loaded from: classes16.dex */
public class C26266x75f97a0a extends com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26269xe91d43dd implements com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c, java.io.Serializable {

    /* renamed from: mClipId */
    private int f51447xfe7f3f58;

    /* renamed from: mClipType */
    private int f51448x5bb22637;

    /* renamed from: mStartPosition */
    private long f51450x8f34483e;

    /* renamed from: mStartTime */
    private long f51451xfbccd462 = 0;

    /* renamed from: mEndTime */
    private long f51449x3e4c1d1b = 0;

    public C26266x75f97a0a(int i17) {
        this.f51448x5bb22637 = i17;
        this.f51447xfe7f3f58 = com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26271x57102410.m101607x3c4d9901(i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c
    /* renamed from: clone */
    public com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c mo101321x5a5dd5d(int i17) {
        if (i17 != 3 && i17 != 2 && i17 != 1) {
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26266x75f97a0a c26266x75f97a0a = new com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26266x75f97a0a(i17);
        c26266x75f97a0a.f51447xfe7f3f58 = com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26271x57102410.m101607x3c4d9901(i17);
        c26266x75f97a0a.f51451xfbccd462 = this.f51451xfbccd462;
        c26266x75f97a0a.f51449x3e4c1d1b = this.f51449x3e4c1d1b;
        return c26266x75f97a0a;
    }

    /* renamed from: equals */
    public boolean m101595xb2c87fbf(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26266x75f97a0a)) {
            return false;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26266x75f97a0a c26266x75f97a0a = (com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26266x75f97a0a) obj;
        return this.f51447xfe7f3f58 == c26266x75f97a0a.mo101322x142a3b81() && this.f51448x5bb22637 == c26266x75f97a0a.mo101277x7f025288();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c
    /* renamed from: getClipId */
    public int mo101322x142a3b81() {
        return this.f51447xfe7f3f58;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c
    /* renamed from: getEndTimeMs */
    public long mo101323x606f7358() {
        return this.f51449x3e4c1d1b;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c
    /* renamed from: getFilePath */
    public java.lang.String mo101324x5000ed37() {
        return null;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26269xe91d43dd, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1
    /* renamed from: getMediaType */
    public int mo101277x7f025288() {
        return this.f51448x5bb22637;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c
    /* renamed from: getOriginalDurationMs */
    public long mo101325x81a6b901() {
        return this.f51449x3e4c1d1b - this.f51451xfbccd462;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c
    /* renamed from: getStartPositionMs */
    public long mo101326xa7f6dc7b() {
        return this.f51450x8f34483e;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c
    /* renamed from: getStartTimeMs */
    public long mo101327x6bb2831f() {
        return this.f51451xfbccd462;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26269xe91d43dd, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1
    /* renamed from: getUrl */
    public java.lang.String mo101278xb5887639() {
        return null;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c
    /* renamed from: setCutTimeRange */
    public void mo101328xc79d43d0(long j17, long j18) {
        if (j17 < 0) {
            j17 = 0;
        }
        if (j17 >= j18) {
            throw new java.lang.IllegalArgumentException("setCutTimeRange: Start time is greater than end time");
        }
        this.f51451xfbccd462 = j17;
        this.f51449x3e4c1d1b = j18;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c
    /* renamed from: setOriginalDurationMs */
    public void mo101329x18d23b0d(long j17) {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c
    /* renamed from: setStartPositionMs */
    public void mo101330xdecd75ef(long j17) {
        this.f51450x8f34483e = j17;
    }
}
