package com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6;

/* renamed from: com.tencent.tav.core.audio.AudioSourceTrack */
/* loaded from: classes16.dex */
class C25694x197a205a implements com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25698xaf2a0788<com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d> {
    public static final java.lang.String TAG = "AudioCompositionTrackEncoder2";

    /* renamed from: mAssetTrack */
    private com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b f47599x5a876488;

    /* renamed from: mAudioInfo */
    private com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 f47600x85e9e3b7 = new com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984(44100, 1, 2);

    public C25694x197a205a(com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b) {
        this.f47599x5a876488 = c25634xf527485b;
    }

    /* renamed from: createDecoderTrackSegment */
    private com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac m96881x477c3330(com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b, com.p314xaae8f345.tav.p2945x58ceaf0.C25635x5b7fe258 c25635x5b7fe258) {
        com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f c25760x91f3af7f;
        if (c25635x5b7fe258.m96174x7aab3243()) {
            c25760x91f3af7f = null;
        } else {
            c25760x91f3af7f = new com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f();
            c25760x91f3af7f.f48008x4e63cb35 = c25634xf527485b.m96160xabff72d6();
            c25760x91f3af7f.f48016xc060d3c6 = c25634xf527485b.m96163xfe2e0f70();
            c25760x91f3af7f.f48010x7f94e13e = c25634xf527485b.m96152x7f025288();
            c25760x91f3af7f.f48014x35e001 = c25634xf527485b.m96153x47007694();
            c25760x91f3af7f.f48012x5880ffeb = c25634xf527485b.m96157x6bdd61e1();
            c25760x91f3af7f.f48013xdb79bafb = c25634xf527485b.m96158xbfdb8cc5();
            c25760x91f3af7f.f48009x207cebed = (int) c25634xf527485b.m96155xe9bce1e7();
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m97240x2fa78b11 = c25635x5b7fe258.m96173x35b5540b().m97240x2fa78b11();
        com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac c25761x99b6cdac = new com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m97240x2fa78b11.m97260x75286aac(), m97240x2fa78b11.m97256x51e8b0a()), c25760x91f3af7f);
        c25761x99b6cdac.m97457xfd7a0d10(c25635x5b7fe258.m96172x61b08d48());
        return c25761x99b6cdac;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25698xaf2a0788
    /* renamed from: getDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96879x51e8b0a() {
        return this.f47599x5a876488.mo96150x51e8b0a();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.p2948x58d9bd6.InterfaceC25698xaf2a0788
    /* renamed from: getSourceAudioDecoder */
    public com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d mo96880xef8f993f(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d c25755x80ee7e3d = new com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d();
        if (this.f47599x5a876488.m96152x7f025288() != 2) {
            return null;
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d c25755x80ee7e3d2 = new com.p314xaae8f345.tav.p2959x5befac44.C25755x80ee7e3d();
        java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25635x5b7fe258> mo96159xbac98516 = this.f47599x5a876488.mo96159xbac98516();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.tav.p2945x58ceaf0.C25635x5b7fe258 c25635x5b7fe258 : mo96159xbac98516) {
            if (c25635x5b7fe258 instanceof com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212) {
                arrayList.add(m96882x477c3330(this.f47599x5a876488, (com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212) c25635x5b7fe258));
            } else {
                arrayList.add(m96881x477c3330(this.f47599x5a876488, c25635x5b7fe258));
            }
        }
        c25755x80ee7e3d2.m97401x719f5ce4(this.f47599x5a876488.m96163xfe2e0f70());
        c25755x80ee7e3d2.mo96670xef2344c9(arrayList);
        c25755x80ee7e3d2.mo96667x7c3e1dab((int) this.f47599x5a876488.m96155xe9bce1e7());
        c25755x80ee7e3d2.mo96671x27f73e1c(this.f47599x5a876488.m96158xbfdb8cc5());
        c25755x80ee7e3d2.mo96666xd458f44a(com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25766x5e5e0fbb.DecodeType.Audio);
        c25755x80ee7e3d2.m97400x66f3cb62(this.f47600x85e9e3b7);
        c25755x80ee7e3d2.mo96650x5b0b7d5a(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, c25738xead39d26.m97258xb58839a5()));
        return c25755x80ee7e3d;
    }

    /* renamed from: createDecoderTrackSegment */
    private com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac m96882x477c3330(com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b, com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df05212) {
        com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f c25760x91f3af7f;
        if (c25640x7df05212.m96174x7aab3243()) {
            c25760x91f3af7f = null;
        } else {
            c25760x91f3af7f = new com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f();
            c25760x91f3af7f.f48016xc060d3c6 = c25640x7df05212.m96185x83637b55();
            c25760x91f3af7f.f48010x7f94e13e = c25634xf527485b.m96152x7f025288();
            c25760x91f3af7f.f48008x4e63cb35 = c25640x7df05212.m96184xabff72d6();
            c25760x91f3af7f.f48012x5880ffeb = c25634xf527485b.m96157x6bdd61e1();
            c25760x91f3af7f.f48014x35e001 = c25634xf527485b.m96153x47007694();
            c25760x91f3af7f.f48009x207cebed = (int) c25634xf527485b.m96155xe9bce1e7();
            c25760x91f3af7f.f48013xdb79bafb = c25634xf527485b.m96158xbfdb8cc5();
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m97240x2fa78b11 = c25640x7df05212.m96173x35b5540b().m97240x2fa78b11();
        com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac c25761x99b6cdac = new com.p314xaae8f345.tav.p2959x5befac44.C25761x99b6cdac(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m97240x2fa78b11.m97260x75286aac(), m97240x2fa78b11.m97256x51e8b0a()), c25760x91f3af7f);
        c25761x99b6cdac.m97457xfd7a0d10(c25640x7df05212.m96172x61b08d48());
        return c25761x99b6cdac;
    }
}
