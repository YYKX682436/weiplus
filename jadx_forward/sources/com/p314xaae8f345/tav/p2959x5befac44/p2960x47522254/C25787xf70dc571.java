package com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254;

/* renamed from: com.tencent.tav.decoder.decodecache.CacheSegment */
/* loaded from: classes16.dex */
class C25787xf70dc571 {

    /* renamed from: cacheFrameList */
    public volatile java.util.List<com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25786x772c472b> f48317x27ec1249 = new java.util.ArrayList();

    /* renamed from: segmentTimeRange */
    public volatile com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f48318x63a1987d;

    public C25787xf70dc571(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        this.f48318x63a1987d = null;
        this.f48318x63a1987d = c25738xead39d26;
    }

    /* renamed from: isCacheFrameUsable */
    private boolean m97766x96f9852d(com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25786x772c472b c25786x772c472b) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 c25734xcdff9c14 = c25786x772c472b.f48315xe9bf8e8a;
        return (c25734xcdff9c14 == null || c25734xcdff9c14.m97194x3a00ef33() == null) ? false : true;
    }

    /* renamed from: clear */
    public void m97767x5a5b64d() {
        for (com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25786x772c472b c25786x772c472b : this.f48317x27ec1249) {
            if (m97766x96f9852d(c25786x772c472b)) {
                c25786x772c472b.f48316x602ddbd7.mo97554xa68d6ca1(c25786x772c472b.f48315xe9bf8e8a.m97194x3a00ef33());
                c25786x772c472b.f48315xe9bf8e8a = null;
            }
        }
        this.f48317x27ec1249.clear();
    }

    /* renamed from: getLastFrameTime */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97768x72e9c42e() {
        return this.f48317x27ec1249.size() > 0 ? this.f48317x27ec1249.get(this.f48317x27ec1249.size() - 1).f48313x207df1da : this.f48318x63a1987d.m97258xb58839a5();
    }

    /* renamed from: popFrame */
    public com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25786x772c472b m97769x2585d19c(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        while (this.f48317x27ec1249.size() > 0) {
            com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25786x772c472b c25786x772c472b = this.f48317x27ec1249.get(0);
            if (!c25786x772c472b.f48313x207df1da.m97238x9f3f7b48(c25736x76b98a57)) {
                return this.f48317x27ec1249.get(0);
            }
            if (m97766x96f9852d(c25786x772c472b)) {
                com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25769xf53fabce interfaceC25769xf53fabce = c25786x772c472b.f48316x602ddbd7;
                if (interfaceC25769xf53fabce == null) {
                    c25786x772c472b.f48315xe9bf8e8a.m97194x3a00ef33().m97285x41012807();
                } else {
                    interfaceC25769xf53fabce.mo97554xa68d6ca1(c25786x772c472b.f48315xe9bf8e8a.m97194x3a00ef33());
                }
                c25786x772c472b.f48315xe9bf8e8a = null;
            }
            this.f48317x27ec1249.remove(0);
        }
        return null;
    }

    /* renamed from: pushFrame */
    public void m97770xd0ce6a73(com.p314xaae8f345.tav.p2959x5befac44.p2960x47522254.C25786x772c472b c25786x772c472b) {
        for (int i17 = 0; i17 < this.f48317x27ec1249.size(); i17++) {
            if (this.f48317x27ec1249.get(i17).f48313x207df1da.m97222xf922bec1(c25786x772c472b.f48313x207df1da)) {
                this.f48317x27ec1249.add(i17, c25786x772c472b);
                return;
            }
        }
        this.f48317x27ec1249.add(c25786x772c472b);
    }
}
