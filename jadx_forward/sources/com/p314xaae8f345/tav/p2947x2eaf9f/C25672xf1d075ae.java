package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.AudioMixInputParameters */
/* loaded from: classes16.dex */
public class C25672xf1d075ae {

    /* renamed from: audioTapProcessor */
    protected com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25674xc28db305 f47441xd7c97325;

    /* renamed from: audioTimePitchAlgorithm */
    protected java.lang.String f47442x2d6bbb2;

    /* renamed from: trackID */
    protected int f47443xc060d3a6;

    /* renamed from: volumeRanges */
    protected java.util.ArrayList<com.p314xaae8f345.tav.p2947x2eaf9f.C25672xf1d075ae.VolumeRange> f47444x987b8690 = new java.util.ArrayList<>();

    /* renamed from: com.tencent.tav.core.AudioMixInputParameters$VolumeRange */
    /* loaded from: classes16.dex */
    public static class VolumeRange {

        /* renamed from: endVolume */
        public float f47445x64c00bd5;

        /* renamed from: startVolume */
        public float f47446x959a461c;

        /* renamed from: timeRange */
        public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f47447x16fae70;
    }

    public C25672xf1d075ae(int i17, java.lang.String str) {
        this.f47443xc060d3a6 = i17;
        this.f47442x2d6bbb2 = str;
    }

    /* renamed from: containsTime */
    public boolean m96688x805f158c(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.C25672xf1d075ae.VolumeRange> it = this.f47444x987b8690.iterator();
        while (it.hasNext()) {
            if (it.next().f47447x16fae70.m97253x805f158c(c25736x76b98a57)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getAudioTapProcessor */
    public com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25674xc28db305 m96689x2afdfa6f() {
        return this.f47441xd7c97325;
    }

    /* renamed from: getAudioTimePitchAlgorithm */
    public java.lang.String m96690xd2d7237c() {
        return this.f47442x2d6bbb2;
    }

    /* renamed from: getTrackID */
    public int m96691xfe2e0f70() {
        return this.f47443xc060d3a6;
    }

    /* renamed from: getVolumeAtTime */
    public float mo96692xdd6babd0(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25672xf1d075ae.VolumeRange volumeRange;
        long m97232x31040141 = c25736x76b98a57.m97232x31040141();
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.C25672xf1d075ae.VolumeRange> it = this.f47444x987b8690.iterator();
        while (true) {
            if (!it.hasNext()) {
                volumeRange = null;
                break;
            }
            volumeRange = it.next();
            if (m97232x31040141 >= volumeRange.f47447x16fae70.m97260x75286aac().m97232x31040141() && m97232x31040141 < volumeRange.f47447x16fae70.m97258xb58839a5().m97232x31040141()) {
                break;
            }
        }
        if (volumeRange == null) {
            return 1.0f;
        }
        long m97232x310401412 = m97232x31040141 - volumeRange.f47447x16fae70.m97260x75286aac().m97232x31040141();
        float f17 = volumeRange.f47446x959a461c;
        return f17 + ((volumeRange.f47445x64c00bd5 - f17) * ((((float) m97232x310401412) * 1.0f) / ((float) volumeRange.f47447x16fae70.m97256x51e8b0a().m97232x31040141())));
    }

    /* renamed from: getVolumeRampAtTimeRange */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25672xf1d075ae.VolumeRange m96693x7bd493db(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.C25672xf1d075ae.VolumeRange> it = this.f47444x987b8690.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.tav.p2947x2eaf9f.C25672xf1d075ae.VolumeRange next = it.next();
            if (next.f47447x16fae70.m97253x805f158c(c25736x76b98a57)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: toString */
    public java.lang.String m96694x9616526c() {
        return "AudioMixInputParameters{trackID=" + this.f47443xc060d3a6 + ", audioTimePitchAlgorithm='" + this.f47442x2d6bbb2 + "', audioTapProcessor=" + this.f47441xd7c97325 + ", volumeRanges=" + this.f47444x987b8690 + '}';
    }
}
