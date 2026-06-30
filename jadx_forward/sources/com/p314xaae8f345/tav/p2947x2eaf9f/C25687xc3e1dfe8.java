package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.MutableAudioMixInputParameters */
/* loaded from: classes16.dex */
public class C25687xc3e1dfe8 extends com.p314xaae8f345.tav.p2947x2eaf9f.C25672xf1d075ae {
    public C25687xc3e1dfe8(com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b, java.lang.String str) {
        super(c25634xf527485b.m96163xfe2e0f70(), str);
    }

    /* renamed from: setAudioTapProcessor */
    public void m96791x69406e3(com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25674xc28db305 interfaceC25674xc28db305) {
        this.f47441xd7c97325 = interfaceC25674xc28db305;
    }

    /* renamed from: setAudioTimePitchAlgorithm */
    public void m96792xe90708f0(java.lang.String str) {
        this.f47442x2d6bbb2 = str;
    }

    /* renamed from: setTrackID */
    public void m96793x719f5ce4(int i17) {
        this.f47443xc060d3a6 = i17;
    }

    /* renamed from: setVolumeAtTime */
    public void m96794x13b4a6dc(float f17, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
    }

    /* renamed from: setVolumeForTimeRange */
    public void m96795xaab1dbe3(float f17) {
        java.util.Iterator<com.p314xaae8f345.tav.p2947x2eaf9f.C25672xf1d075ae.VolumeRange> it = this.f47444x987b8690.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.tav.p2947x2eaf9f.C25672xf1d075ae.VolumeRange next = it.next();
            next.f47446x959a461c = f17;
            next.f47445x64c00bd5 = f17;
        }
    }

    /* renamed from: setVolumeRampForTimeRange */
    public void m96797xd407315(float f17, float f18, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25672xf1d075ae.VolumeRange volumeRange = new com.p314xaae8f345.tav.p2947x2eaf9f.C25672xf1d075ae.VolumeRange();
        volumeRange.f47447x16fae70 = c25738xead39d26;
        volumeRange.f47446x959a461c = f17;
        volumeRange.f47445x64c00bd5 = f18;
        this.f47444x987b8690.add(0, volumeRange);
    }

    public C25687xc3e1dfe8(com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b) {
        super(c25634xf527485b.m96163xfe2e0f70(), "");
    }

    /* renamed from: setVolumeForTimeRange */
    public void m96796xaab1dbe3(float f17, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        m96797xd407315(f17, f17, c25738xead39d26);
    }
}
