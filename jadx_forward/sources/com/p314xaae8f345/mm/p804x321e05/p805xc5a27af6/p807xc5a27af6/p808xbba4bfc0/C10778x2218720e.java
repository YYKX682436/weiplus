package com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p808xbba4bfc0;

/* renamed from: com.tencent.mm.kara.feature.feature.business.LiveHomeReddotClickFeatureGroup */
/* loaded from: classes13.dex */
public class C10778x2218720e extends pl0.e {

    /* renamed from: containsTitle */
    @fl0.a
    public int f29266x8b83b779;

    /* renamed from: discoverView */
    @fl0.a
    public com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p809x2eaf0c.C10783x4ed6a297 f29267x46310a2e;

    /* renamed from: histories */
    @fl0.a
    public com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p810x54894fcb.C10788x8dc3e7dd f29268x66d8e032;

    /* renamed from: historiesWithAnchor */
    @fl0.a
    public com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p810x54894fcb.C10790xa4e61e96 f29269xc3aad8ed;

    /* renamed from: historiesWithDisturbance */
    @fl0.a
    public com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p810x54894fcb.C10791xbd38d0ff f29270x80d4c496;

    /* renamed from: isReddotScoreValid */
    @fl0.a
    public int f29271x9899ff0c;

    /* renamed from: myself */
    @fl0.a
    public com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p809x2eaf0c.C10785x7857bc81 f29272xc0df26f8 = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p809x2eaf0c.C10785x7857bc81();

    /* renamed from: noRedotHistories */
    @fl0.a
    public com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p810x54894fcb.C10789x245528b6 f29273x75aceabd;

    /* renamed from: noRedotHistoriesWithDisturbance */
    @fl0.a
    public com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p810x54894fcb.C10792xb7def486 f29274x9c5ef2ab;

    /* renamed from: reddotScore */
    @fl0.a
    public float f29275xe808465a;

    public C10778x2218720e(java.lang.String str, float f17, boolean z17, java.lang.String str2, java.lang.String str3) {
        this.f29275xe808465a = 0.0f;
        this.f29271x9899ff0c = 0;
        this.f29266x8b83b779 = 0;
        g(str);
        this.f29275xe808465a = f17;
        this.f29271x9899ff0c = z17 ? 1 : 0;
        this.f29266x8b83b779 = !android.text.TextUtils.isEmpty(str2) ? 1 : 0;
        this.f29267x46310a2e = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p809x2eaf0c.C10783x4ed6a297();
        this.f29268x66d8e032 = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p810x54894fcb.C10788x8dc3e7dd();
        this.f29270x80d4c496 = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p810x54894fcb.C10791xbd38d0ff();
        this.f29269xc3aad8ed = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p810x54894fcb.C10790xa4e61e96(str3);
        this.f29273x75aceabd = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p810x54894fcb.C10789x245528b6();
        this.f29274x9c5ef2ab = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p810x54894fcb.C10792xb7def486();
    }

    @Override // fl0.b
    /* renamed from: getName */
    public java.lang.String mo46314xfb82e301() {
        return "LiveHomeReddotClickFeatureGroup";
    }
}
