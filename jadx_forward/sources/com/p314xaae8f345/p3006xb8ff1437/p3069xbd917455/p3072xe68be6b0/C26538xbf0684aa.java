package com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0;

/* renamed from: com.tencent.thumbplayer.tplayer.reportv2.TPPrepareFailReporter */
/* loaded from: classes16.dex */
public class C26538xbf0684aa extends com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26535x3290736e {
    private static final java.lang.String TAG = "TPPrepareFailReporter";

    /* renamed from: UN_USE_PROXY */
    private static final int f54987x645def50 = 0;

    /* renamed from: USE_PROXY */
    private static final int f54988xd1729576 = 1;

    /* renamed from: mReportParamRecord */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26534xafaa5d7d f54989xadd647d = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26534xafaa5d7d();

    /* renamed from: fillStreamInfoToCommonParams */
    private void m103814xa97549fd() {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.api.InterfaceC26550x996747bf interfaceC26550x996747bf = this.f54963x97315ba7;
        if (interfaceC26550x996747bf == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "fillStreamInfoToCommonParams fail, not set mPlayerInfoGetter");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 mo101568xc0f8b3fa = interfaceC26550x996747bf.mo101568xc0f8b3fa();
        this.f54989xadd647d.f54945x9879cc5e.m103936xc80cdeb(this.f54968x806675c4.f55072x23efaf8a);
        this.f54989xadd647d.f54945x9879cc5e.m103948x99514bbd(this.f54968x806675c4.f55073x591e3e08);
        this.f54989xadd647d.f54945x9879cc5e.m103956xca029dad(this.f54968x806675c4.f55071x11423731);
        this.f54989xadd647d.f54945x9879cc5e.m103931xd93cad06(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26373xd285c9f8.m102352xa942c580());
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26534xafaa5d7d c26534xafaa5d7d = this.f54989xadd647d;
        c26534xafaa5d7d.f54945x9879cc5e.m103953xf9d64c3f(c26534xafaa5d7d.f54948x11033d44);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26534xafaa5d7d c26534xafaa5d7d2 = this.f54989xadd647d;
        c26534xafaa5d7d2.f54945x9879cc5e.m103930x7485ec4e(c26534xafaa5d7d2.f54947x577997ee);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26534xafaa5d7d c26534xafaa5d7d3 = this.f54989xadd647d;
        c26534xafaa5d7d3.f54945x9879cc5e.m103928x6f097f1(c26534xafaa5d7d3.f54949xac0eba6f);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26534xafaa5d7d c26534xafaa5d7d4 = this.f54989xadd647d;
        c26534xafaa5d7d4.f54945x9879cc5e.m103927x52cdf2f2(c26534xafaa5d7d4.f54946xdb3e2e77);
        this.f54989xadd647d.f54945x9879cc5e.m103958xe05800da(this.f54968x806675c4.f55069x9b3610be);
        this.f54962x60e7c4fa.put("buffermintotaldurationms", java.lang.Long.valueOf(mo101568xc0f8b3fa.f53260x5a277036.f53279xdc5cc5f9));
        this.f54962x60e7c4fa.put("buffermaxtotaldurationms", java.lang.Long.valueOf(mo101568xc0f8b3fa.f53260x5a277036.f53278x26c080a7));
        this.f54962x60e7c4fa.put("preloadtotaldurationms", java.lang.Long.valueOf(mo101568xc0f8b3fa.f53260x5a277036.f53284x45e5f842));
        this.f54962x60e7c4fa.put("minbufferingdurationms", java.lang.Long.valueOf(mo101568xc0f8b3fa.f53260x5a277036.f53282x72a910b7));
        this.f54962x60e7c4fa.put("minbufferingtimems", java.lang.Long.valueOf(mo101568xc0f8b3fa.f53260x5a277036.f53283x9666230));
        this.f54962x60e7c4fa.put("maxbufferingtimems", java.lang.Long.valueOf(mo101568xc0f8b3fa.f53260x5a277036.f53281x53ca1cde));
        this.f54962x60e7c4fa.put("reducelatencyaction", java.lang.Integer.valueOf(mo101568xc0f8b3fa.f53260x5a277036.f53285x6d1c3f61));
        this.f54962x60e7c4fa.put("reducelatencyspeed", java.lang.Float.valueOf(mo101568xc0f8b3fa.f53260x5a277036.f53286xcdcf9068));
        this.f54962x60e7c4fa.put("buffertype", java.lang.Integer.valueOf(mo101568xc0f8b3fa.f53260x5a277036.f53280x4dd16fe7));
        try {
            this.f54989xadd647d.f54945x9879cc5e.m103947x6c9d2b05(new org.json.JSONObject(this.f54962x60e7c4fa).toString());
        } catch (java.lang.NullPointerException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
        }
    }

    /* renamed from: onDTCdnUrlUpdate */
    private void m103815x36563dba(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTCdnUrlUpdataEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onDTCdnUrlUpdate fail:params is not match");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTCdnUrlUpdataEventInfo dTCdnUrlUpdataEventInfo = (com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTCdnUrlUpdataEventInfo) baseEventInfo;
        java.lang.String m103167x743fd87e = dTCdnUrlUpdataEventInfo.m103167x743fd87e();
        java.lang.String m103168x33425148 = dTCdnUrlUpdataEventInfo.m103168x33425148();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Vod onDTCdnUrlUpdate cdnIp:" + m103167x743fd87e + " uIp:" + m103168x33425148);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26534xafaa5d7d c26534xafaa5d7d = this.f54989xadd647d;
        c26534xafaa5d7d.f54946xdb3e2e77 = m103167x743fd87e;
        c26534xafaa5d7d.f54949xac0eba6f = m103168x33425148;
    }

    /* renamed from: onDTProcessUpdate */
    private void m103816x62f99da9(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTDownloadProgressUpdataEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onDTProcessUpdate fail:params is not match");
            return;
        }
        int m103171x58461223 = ((com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTDownloadProgressUpdataEventInfo) baseEventInfo).m103171x58461223();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Vod onDTProcessUpdate speedKbps:" + m103171x58461223);
        this.f54989xadd647d.f54948x11033d44 = m103171x58461223;
    }

    /* renamed from: onDTProtocolUpdate */
    private void m103817x19c36a10(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTProtocalUpdateEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onDTProtocolUpdate fail:params is not match");
            return;
        }
        java.lang.String m103174xc15f60b5 = ((com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTProtocalUpdateEventInfo) baseEventInfo).m103174xc15f60b5();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Vod onDTProtocolUpdate protocolVer:" + m103174xc15f60b5);
        this.f54989xadd647d.f54947x577997ee = m103174xc15f60b5;
    }

    /* renamed from: onPrepareError */
    private void m103818xfaf06cc0(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayErrorEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onPrepareError fail:params is not match");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayErrorEventInfo playErrorEventInfo = (com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayErrorEventInfo) baseEventInfo;
        int m103181x131202ac = playErrorEventInfo.m103181x131202ac();
        int m103180x130a215f = playErrorEventInfo.m103180x130a215f();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onPrepareError errorType:" + m103181x131202ac + " errorCode:" + m103180x130a215f);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.C26552xd5acf78f c26552xd5acf78f = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.C26552xd5acf78f();
        c26552xd5acf78f.m103962x6f5de1d3(m103180x130a215f);
        m103814xa97549fd();
        m103778xe4b5d01c(this.f54989xadd647d);
        this.f54967x9acdfd30.m103849xc6fc5aba(this.f54989xadd647d.f54945x9879cc5e);
        c26552xd5acf78f.m103885xc9322f66(this.f54989xadd647d.f54945x9879cc5e);
        java.util.Map<java.lang.String, java.lang.String> m103886x18cb9578 = c26552xd5acf78f.m103886x18cb9578();
        m103777xf7a07396("onPrepareError", m103886x18cb9578);
        m103787xeb62bb48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55030xe4791603, m103886x18cb9578);
        m103786xddf12126(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55030xe4791603, m103886x18cb9578);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26535x3290736e, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.InterfaceC26533xdd191086
    /* renamed from: init */
    public void mo103765x316510(android.content.Context context, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26546x3533ba13 c26546x3533ba13) {
        super.mo103765x316510(context, c26546x3533ba13);
        this.f54967x9acdfd30.m103848xa4c20cac(this.f54989xadd647d.f54945x9879cc5e);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26535x3290736e, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.InterfaceC26533xdd191086
    /* renamed from: onEvent */
    public void mo103766xaf8c47fb(int i17, com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (i17 == 6) {
            m103818xfaf06cc0(baseEventInfo);
            return;
        }
        switch (i17) {
            case 100:
                m103816x62f99da9(baseEventInfo);
                return;
            case 101:
                m103815x36563dba(baseEventInfo);
                return;
            case 102:
                m103817x19c36a10(baseEventInfo);
                return;
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26535x3290736e, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.InterfaceC26533xdd191086
    /* renamed from: reset */
    public void mo103767x6761d4f() {
        super.mo103767x6761d4f();
    }
}
