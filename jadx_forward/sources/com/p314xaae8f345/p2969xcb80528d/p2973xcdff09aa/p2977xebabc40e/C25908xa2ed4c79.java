package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e;

/* renamed from: com.tencent.tavkit.composition.resource.TrackInfo */
/* loaded from: classes16.dex */
public class C25908xa2ed4c79 {

    /* renamed from: compositionTrackSegment */
    private com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 f49030xc4237a32;

    /* renamed from: scaleToDuration */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f49031x120b6619;

    /* renamed from: selectedTimeRange */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f49032x9ce39a15;

    /* renamed from: track */
    private com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b f49033x697f14b;

    /* renamed from: getCompositionTrackSegment */
    public com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 m98731x9423e1fc(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        return new com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212(this.f49030xc4237a32.m96184xabff72d6(), this.f49030xc4237a32.m96185x83637b55(), this.f49030xc4237a32.m96173x35b5540b().m97240x2fa78b11(), c25738xead39d26, this.f49030xc4237a32.m96186xac019deb());
    }

    /* renamed from: getMediaType */
    public int m98732x7f025288() {
        com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b = this.f49033x697f14b;
        if (c25634xf527485b != null) {
            return c25634xf527485b.m96152x7f025288();
        }
        com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df05212 = this.f49030xc4237a32;
        if (c25640x7df05212 == null) {
            return 0;
        }
        int m96186xac019deb = c25640x7df05212.m96186xac019deb();
        if (m96186xac019deb == 3) {
            return 1;
        }
        return m96186xac019deb;
    }

    /* renamed from: getScaleToDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m98733xf66d37e3() {
        return this.f49031x120b6619;
    }

    /* renamed from: getSelectedTimeRange */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m98734xf018215f() {
        return this.f49032x9ce39a15;
    }

    /* renamed from: getTrack */
    public com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b m98735x75359795() {
        return this.f49033x697f14b;
    }

    /* renamed from: setCompositionTrackSegment */
    public void m98736xaa53c770(com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df05212) {
        this.f49030xc4237a32 = c25640x7df05212;
    }

    /* renamed from: setScaleToDuration */
    public void m98737x2d43d157(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        this.f49031x120b6619 = c25736x76b98a57;
    }

    /* renamed from: setSelectedTimeRange */
    public void m98738xcbae2dd3(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        this.f49032x9ce39a15 = c25738xead39d26;
    }

    /* renamed from: setTrack */
    public void m98739x53c3b209(com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b) {
        this.f49033x697f14b = c25634xf527485b;
    }
}
