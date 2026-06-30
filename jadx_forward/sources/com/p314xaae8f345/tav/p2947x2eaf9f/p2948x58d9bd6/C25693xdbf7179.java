package com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6;

/* renamed from: com.tencent.tav.core.audio.AudioSourceComposition */
/* loaded from: classes16.dex */
public class C25693xdbf7179 implements com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25698xaf2a0788<com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b> {

    /* renamed from: mAsset */
    private com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 f47597xbdca3683;

    /* renamed from: mAudioInfo */
    private com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 f47598x85e9e3b7 = new com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984(44100, 1, 2);

    public C25693xdbf7179(com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0) {
        this.f47597xbdca3683 = abstractC25633x3c9fad0;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25698xaf2a0788
    /* renamed from: getDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96879x51e8b0a() {
        return this.f47597xbdca3683.m96116x51e8b0a();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25698xaf2a0788
    /* renamed from: getSourceAudioDecoder */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b mo96880xef8f993f(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b c25669xd1aeed9b = new com.p314xaae8f345.tav.p2947x2eaf9f.C25669xd1aeed9b((java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b>) this.f47597xbdca3683.mo96129x317d5b7e(), -1);
        c25669xd1aeed9b.m96664x66f3cb62(this.f47598x85e9e3b7);
        c25669xd1aeed9b.mo96666xd458f44a(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb.DecodeType.Audio);
        c25669xd1aeed9b.mo96667x7c3e1dab(44);
        return c25669xd1aeed9b;
    }
}
