package com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa;

/* renamed from: com.tencent.thumbplayer.composition.TPMediaCompositionTrackClip */
/* loaded from: classes16.dex */
public class C26273x7d266399 extends com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26269xe91d43dd implements com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c, java.io.Serializable {

    /* renamed from: mClipId */
    private int f51504xfe7f3f58;

    /* renamed from: mClipPath */
    private java.lang.String f51505x5baffb22;

    /* renamed from: mClipType */
    private int f51506x5bb22637;

    /* renamed from: mEndTime */
    private long f51507x3e4c1d1b;

    /* renamed from: mOriginalDuration */
    private long f51508x5eaea512;

    /* renamed from: mStartPosition */
    private long f51509x8f34483e;

    /* renamed from: mStartTime */
    private long f51510xfbccd462;

    private C26273x7d266399() {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c
    /* renamed from: clone */
    public com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c mo101321x5a5dd5d(int i17) {
        if (i17 != 3 && i17 != 2 && i17 != 1) {
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26273x7d266399 c26273x7d266399 = new com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26273x7d266399();
        c26273x7d266399.f51506x5bb22637 = i17;
        c26273x7d266399.f51504xfe7f3f58 = com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26271x57102410.m101607x3c4d9901(this.f51506x5bb22637);
        c26273x7d266399.f51510xfbccd462 = this.f51510xfbccd462;
        c26273x7d266399.f51507x3e4c1d1b = this.f51507x3e4c1d1b;
        c26273x7d266399.f51505x5baffb22 = this.f51505x5baffb22;
        return c26273x7d266399;
    }

    /* renamed from: equals */
    public boolean m101610xb2c87fbf(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26273x7d266399)) {
            return false;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26273x7d266399 c26273x7d266399 = (com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26273x7d266399) obj;
        return this.f51504xfe7f3f58 == c26273x7d266399.mo101322x142a3b81() && this.f51506x5bb22637 == c26273x7d266399.mo101277x7f025288();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c
    /* renamed from: getClipId */
    public int mo101322x142a3b81() {
        return this.f51504xfe7f3f58;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c
    /* renamed from: getEndTimeMs */
    public long mo101323x606f7358() {
        return this.f51507x3e4c1d1b;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c
    /* renamed from: getFilePath */
    public java.lang.String mo101324x5000ed37() {
        return this.f51505x5baffb22;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26269xe91d43dd, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1
    /* renamed from: getMediaType */
    public int mo101277x7f025288() {
        return this.f51506x5bb22637;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c
    /* renamed from: getOriginalDurationMs */
    public long mo101325x81a6b901() {
        return this.f51508x5eaea512;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c
    /* renamed from: getStartPositionMs */
    public long mo101326xa7f6dc7b() {
        return this.f51509x8f34483e;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c
    /* renamed from: getStartTimeMs */
    public long mo101327x6bb2831f() {
        return this.f51510xfbccd462;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26269xe91d43dd, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1
    /* renamed from: getUrl */
    public java.lang.String mo101278xb5887639() {
        return this.f51505x5baffb22;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c
    /* renamed from: setCutTimeRange */
    public void mo101328xc79d43d0(long j17, long j18) {
        if (j17 >= mo101325x81a6b901()) {
            throw new java.lang.IllegalArgumentException("setCutTimeRange: Start time is greater than duration");
        }
        if (j18 > mo101325x81a6b901()) {
            throw new java.lang.IllegalArgumentException("setCutTimeRange: Start time is greater than duration");
        }
        if (j17 < 0) {
            j17 = 0;
        }
        if (j18 <= 0) {
            j18 = mo101325x81a6b901();
        }
        if (j17 >= j18) {
            throw new java.lang.IllegalArgumentException("setCutTimeRange: Start time is greater than end time");
        }
        this.f51510xfbccd462 = j17;
        this.f51507x3e4c1d1b = j18;
    }

    /* renamed from: setFilePath */
    public void m101611x4ab94e43(java.lang.String str) {
        this.f51505x5baffb22 = str;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c
    /* renamed from: setOriginalDurationMs */
    public void mo101329x18d23b0d(long j17) {
        this.f51508x5eaea512 = j17;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c
    /* renamed from: setStartPositionMs */
    public void mo101330xdecd75ef(long j17) {
        this.f51509x8f34483e = j17;
    }

    public C26273x7d266399(java.lang.String str, int i17) {
        this(str, i17, 0L, -1L);
    }

    public C26273x7d266399(java.lang.String str, int i17, long j17, long j18) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.f51506x5bb22637 = i17;
            this.f51505x5baffb22 = str;
            this.f51510xfbccd462 = j17;
            this.f51507x3e4c1d1b = j18;
            if (j17 < 0) {
                this.f51510xfbccd462 = 0L;
            }
            if (j18 <= 0) {
                this.f51507x3e4c1d1b = mo101325x81a6b901();
            }
            this.f51504xfe7f3f58 = com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26271x57102410.m101607x3c4d9901(this.f51506x5bb22637);
            return;
        }
        throw new java.lang.IllegalArgumentException("TPMediaCompositionTrackClip : clipPath empty");
    }
}
