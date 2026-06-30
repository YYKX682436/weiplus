package com.p314xaae8f345.tav.p2945x58ceaf0;

/* renamed from: com.tencent.tav.asset.Composition */
/* loaded from: classes16.dex */
public class C25638x3168b18a<CTrack extends com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1> extends com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 {

    /* renamed from: tracks */
    protected java.util.List<CTrack> f47093xcc663888;

    public C25638x3168b18a() {
        this.f47093xcc663888 = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0
    /* renamed from: createTracks */
    public void mo96114x5d1b18a4() {
        int m97968x31d73e7a = this.f47052xf0edce24.m97968x31d73e7a();
        if (this.f47093xcc663888 == null) {
            this.f47093xcc663888 = new java.util.ArrayList();
        }
        for (int i17 = 0; i17 < m97968x31d73e7a; i17++) {
            java.lang.String string = this.f47052xf0edce24.m97969xe2db7ec(i17).getString("mime");
            if (string.startsWith("video/")) {
                int i18 = this.f47068x43ea5e47;
                this.f47068x43ea5e47 = i18 + 1;
                this.f47093xcc663888.add(new com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1(this, i18, 1, new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, mo96130x36bbd779())));
            } else if (string.startsWith("audio/")) {
                int i19 = this.f47068x43ea5e47;
                this.f47068x43ea5e47 = i19 + 1;
                this.f47093xcc663888.add(new com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1(this, i19, 2, new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, mo96115xd375d3d4())));
            }
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0.TAG, " Composition createTracks finish, has track count: " + this.f47093xcc663888);
    }

    @Override // com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0
    /* renamed from: getAudioDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96115xd375d3d4() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        for (CTrack ctrack : this.f47093xcc663888) {
            if (ctrack.m96152x7f025288() == 2) {
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96150x51e8b0a = ctrack.mo96150x51e8b0a();
                if (mo96150x51e8b0a.m97222xf922bec1(c25736x76b98a57)) {
                    c25736x76b98a57 = mo96150x51e8b0a;
                }
            }
        }
        return c25736x76b98a57;
    }

    @Override // com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0
    /* renamed from: getTracks */
    public java.util.List<CTrack> mo96129x317d5b7e() {
        java.util.Objects.toString(this.f47093xcc663888);
        return this.f47093xcc663888;
    }

    @Override // com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0
    /* renamed from: getVideoDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96130x36bbd779() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        for (CTrack ctrack : this.f47093xcc663888) {
            if (ctrack.m96152x7f025288() == 1) {
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96150x51e8b0a = ctrack.mo96150x51e8b0a();
                if (mo96150x51e8b0a.m97222xf922bec1(c25736x76b98a57)) {
                    c25736x76b98a57 = mo96150x51e8b0a;
                }
            }
        }
        return c25736x76b98a57;
    }

    @Override // com.p314xaae8f345.tav.p2945x58ceaf0.InterfaceC25636xc68f9502
    /* renamed from: loadValuesAsynchronouslyForKeys */
    public void mo96175xa0ce9000(java.util.List<java.lang.String> list, com.p314xaae8f345.tav.p2945x58ceaf0.InterfaceC25636xc68f9502.loadCallback loadcallback) {
    }

    @Override // com.p314xaae8f345.tav.p2945x58ceaf0.InterfaceC25636xc68f9502
    /* renamed from: statusOfValueForKey */
    public int mo96176x6744147e(java.lang.String str) {
        return 1;
    }

    /* renamed from: toString */
    public java.lang.String m96182x9616526c() {
        return "Composition{\ntracks=" + this.f47093xcc663888 + "\ntrackCount=" + this.f47067x43968684 + '}';
    }

    public C25638x3168b18a(java.net.URL url) {
        super(url);
        this.f47093xcc663888 = new java.util.ArrayList();
    }

    public C25638x3168b18a(java.lang.String str) {
        super(str);
        this.f47093xcc663888 = new java.util.ArrayList();
    }
}
