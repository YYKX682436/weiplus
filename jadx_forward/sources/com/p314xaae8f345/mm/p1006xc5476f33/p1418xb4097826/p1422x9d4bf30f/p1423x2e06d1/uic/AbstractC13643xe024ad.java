package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic;

/* renamed from: com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC */
/* loaded from: classes2.dex */
public abstract class AbstractC13643xe024ad extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public int f183274d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f183275e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f183276f;

    /* renamed from: g, reason: collision with root package name */
    public long f183277g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f183278h;

    /* renamed from: i, reason: collision with root package name */
    public r45.e21 f183279i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f183280m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.C13645x1701cf61 f183281n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.C13644x4280185f f183282o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC$finderTopicInfoListener$1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC$feedStickyListener$1] */
    public AbstractC13643xe024ad(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f183275e = "";
        this.f183280m = jz5.h.b(new x92.p(this));
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f183281n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5544x5bf4bb91>(a0Var) { // from class: com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC$finderTopicInfoListener$1
            {
                this.f39173x3fe91575 = 1705444769;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5544x5bf4bb91 c5544x5bf4bb91) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5544x5bf4bb91 event = c5544x5bf4bb91;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.od odVar = event.f135868g;
                int i17 = odVar != null ? odVar.f89057b : -1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "FinderTopicEvent : " + i17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad abstractC13643xe024ad = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad.this;
                if (i17 != 0 && i17 != -4056 && i17 != -4058 && i17 != -4063) {
                    abstractC13643xe024ad.Y6();
                    return true;
                }
                if (i17 != 0) {
                    return true;
                }
                abstractC13643xe024ad.f183279i = null;
                abstractC13643xe024ad.Z6(null);
                return true;
            }
        };
        this.f183282o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5444xabe18593>(a0Var) { // from class: com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC$feedStickyListener$1
            {
                this.f39173x3fe91575 = -1128941181;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5444xabe18593 c5444xabe18593) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5444xabe18593 event = c5444xabe18593;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (event.f135784g.f88361a != 1001) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad.this.X6(event);
                return false;
            }
        };
    }

    public int O6(int i17) {
        if (i17 >= 3) {
            return 12;
        }
        return T6();
    }

    public int P6() {
        return 59;
    }

    public int Q6() {
        return 1;
    }

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860 R6();

    public java.lang.String S6() {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_activity_name");
        return stringExtra == null ? "" : stringExtra;
    }

    public int T6() {
        return 7;
    }

    public final vb2.c U6() {
        return (vb2.c) ((jz5.n) this.f183280m).mo141623x754a37bb();
    }

    public boolean V6() {
        return this.f183274d == 2;
    }

    public boolean W6() {
        return this instanceof ea2.j0;
    }

    public abstract void X6(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5444xabe18593 c5444xabe18593);

    public abstract void Y6();

    public abstract void Z6(r45.e21 e21Var);

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ado;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        int i17 = 1;
        if (m158358x197d1fc6() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158358x197d1fc6, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment");
            int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) m158358x197d1fc6).f210798p;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "convertInnerTabType : " + i18);
            i17 = 1 + i18;
        }
        this.f183274d = i17;
        this.f183277g = m158359x1e885992().getLongExtra("key_activity_id", 0L);
        if (this.f183274d >= 3 && (m158358x197d1fc6() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1424x9da2e250.C13646x818616e5)) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc62 = m158358x197d1fc6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158358x197d1fc62, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment");
            this.f183277g = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1424x9da2e250.C13646x818616e5) m158358x197d1fc62).f183286u;
        }
        this.f183278h = m158359x1e885992().getStringExtra("key_encrypted_topic_id");
        this.f183275e = S6();
        this.f183276f = m158359x1e885992().getStringExtra("key_by_pass_info");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        r45.r03 r03Var = (r45.r03) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o.class)).f534252d;
        this.f183279i = r03Var != null ? (r45.e21) r03Var.m75936x14adae67(16) : null;
        mo48813x58998cd();
        mo48813x58998cd();
        mo55423x97a1a3d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "topic:" + this.f183275e + " topicType:" + T6() + " innerTabType:" + this.f183274d + " eventTopicId:" + this.f183277g + " encryptedEventTopicId:" + this.f183278h);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onPreDestroyed */
    public void mo47482x6fa9d635() {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        if (m158358x197d1fc6 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(m158358x197d1fc6).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).getClass();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(m158358x197d1fc6).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).mo451xac79a11b();
        }
        super.mo47482x6fa9d635();
        mo48814x2efc64();
        mo48814x2efc64();
    }

    /* renamed from: setCoveredStyle */
    public void mo55423x97a1a3d() {
    }
}
