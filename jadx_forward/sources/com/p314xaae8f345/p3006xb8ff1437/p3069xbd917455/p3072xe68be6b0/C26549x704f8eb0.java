package com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0;

/* renamed from: com.tencent.thumbplayer.tplayer.reportv2.TPVodReporter */
/* loaded from: classes16.dex */
public class C26549x704f8eb0 extends com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26535x3290736e {

    /* renamed from: BUFFERING_DURATION_THRESHOLD_MS */
    private static final int f55099x611e6de8 = 1200;

    /* renamed from: PLAYER_END_NO_ERROR */
    private static final int f55100x9461498c = 0;
    private static final java.lang.String TAG = "TPVodReporter";

    /* renamed from: mIsPlayDone */
    private boolean f55103x1cde086d = true;

    /* renamed from: mIsSeeking */
    private boolean f55104xcdb027f3 = false;

    /* renamed from: mIsBuffering */
    private boolean f55101xf3f4eeeb = false;

    /* renamed from: mIsPausing */
    private boolean f55102x290f2ebc = false;

    /* renamed from: mReportParamRecord */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26548x32a8cc7b f55105xadd647d = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26548x32a8cc7b();

    /* renamed from: fillDynamicStatisticFlowParams */
    private void m103851x9101cae8(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.vod.C26561xf22d9537 c26561xf22d9537, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 c26404xfb288653) {
        c26561xf22d9537.m104201xdae1b585(c26404xfb288653.f53246x213fe529);
        c26561xf22d9537.m104178xd095a9d7(c26404xfb288653.f53243xe20a7b17);
        c26561xf22d9537.m104203x9a81ee57(c26404xfb288653.f53249x55a6c697);
        c26561xf22d9537.m104202xc4b91627(c26404xfb288653.f53244xad3ea932);
        c26561xf22d9537.m104179x1bd69179(c26404xfb288653.f53241x45c2484);
        c26561xf22d9537.m104204xd50c95f9(c26404xfb288653.f53247xbd922904);
        c26561xf22d9537.m104208x4218c5f1(c26404xfb288653.f53251xa820b85e);
        c26561xf22d9537.m104210x1b95d149(c26404xfb288653.f53252xa4ff606);
    }

    /* renamed from: fillGeneralPlayFlowParams */
    private void m103852x3767dbed(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.vod.C26561xf22d9537 c26561xf22d9537, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 c26405x843ecc94) {
        c26561xf22d9537.m104181xf754e681(c26405x843ecc94.f53262xeac80517.f53309x381bb70c);
        c26561xf22d9537.m104183x7dfcb97b(c26405x843ecc94.f53262xeac80517.f53311x63462d0);
        c26561xf22d9537.m104195x92368716(c26405x843ecc94.f53262xeac80517.f53315x6fa38361);
        c26561xf22d9537.m104193x4ae398a6(c26405x843ecc94.f53262xeac80517.f53313x75387271);
        c26561xf22d9537.m104192x9ce772d8(c26405x843ecc94.f53262xeac80517.f53309x381bb70c);
        c26561xf22d9537.m104200x765afd21(c26405x843ecc94.f53262xeac80517.f53320xac7a12ac);
        c26561xf22d9537.m104199x24bb73cd(c26405x843ecc94.f53262xeac80517.f53319xf4ee00e2);
        c26561xf22d9537.m104197xe9982dd2(c26405x843ecc94.f53262xeac80517.f53317xb9cabae7);
        c26561xf22d9537.m104194xf10db453(c26405x843ecc94.f53262xeac80517.f53314x7ed15028);
        c26561xf22d9537.m104182x3e702bce(c26405x843ecc94.f53262xeac80517.f53310x3d28659);
        c26561xf22d9537.m104209xdb532787(c26405x843ecc94.f53262xeac80517.f53321xc3d8ba92);
        c26561xf22d9537.m104198xa7dbbbc2(c26405x843ecc94.f53262xeac80517.f53318xddfad14d);
        c26561xf22d9537.m104177xdbe9744c(c26405x843ecc94.f53262xeac80517.f53308xc46f0757);
        c26561xf22d9537.m104196x7e96425d(c26405x843ecc94.f53262xeac80517.f53316xb4b557e8);
    }

    /* renamed from: fillPlayerEndConfigParams */
    private void m103853x59efb4ff(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.vod.C26559x871ae52 c26559x871ae52, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 c26405x843ecc94) {
        c26559x871ae52.m104139x75f472a5(c26405x843ecc94.f53259x4233636b.f53271x503740b0);
        c26559x871ae52.m104129xe552546a(c26405x843ecc94.f53259x4233636b.f53263xbf952275);
        c26559x871ae52.m104140xabbfc809(c26405x843ecc94.f53259x4233636b.f53275x60358c9e);
        c26559x871ae52.m104130x1ec19a4(c26405x843ecc94.f53259x4233636b.f53265xb661de39);
        c26559x871ae52.m104131x144bac34(c26405x843ecc94.f53259x4233636b.f53266x4e1d0349);
    }

    /* renamed from: getVodDrmParams */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.vod.C26558xefca0816 m103854xa13915f0(com.p314xaae8f345.p3006xb8ff1437.api.C26174xf2a580d1 c26174xf2a580d1) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.vod.C26558xefca0816 c26558xefca0816 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.vod.C26558xefca0816();
        c26558xefca0816.m103934xe6190c8d(c26174xf2a580d1.f50519xc9b4068b);
        c26558xefca0816.m104115x25468c0(c26174xf2a580d1.f50538x2608317d);
        c26558xefca0816.m104116x2561609(c26174xf2a580d1.f50539x2609dec6);
        c26558xefca0816.m104112xc3909c8b(c26174xf2a580d1.f50535x6e5d9b2e);
        c26558xefca0816.m104094xb5e967e6(c26174xf2a580d1.f50520xe17149c9);
        c26558xefca0816.m104095x23de2ab7(c26174xf2a580d1.f50540x729fa179);
        c26558xefca0816.m104105x392ec1a1(c26174xf2a580d1.f50528x14e1f4cd);
        c26558xefca0816.m104104x54978413(c26174xf2a580d1.f50527xa08b7886);
        c26558xefca0816.m104103x5195951c(c26174xf2a580d1.f50526xcdb84c48);
        c26558xefca0816.m104102x6cfe578e(c26174xf2a580d1.f50525xa47772c1);
        c26558xefca0816.m104099x353217a9(c26174xf2a580d1.f50524xead9b9d5);
        c26558xefca0816.m104098x509ada1b(c26174xf2a580d1.f50523xe40df8e);
        c26558xefca0816.m104114x535086e6(c26174xf2a580d1.f50537x59351463);
        c26558xefca0816.m104111x43ed70(c26174xf2a580d1.f50534xb6f10f93);
        c26558xefca0816.m104109x5e754820(c26174xf2a580d1.f50532x3da09ef2);
        c26558xefca0816.m104108x79de0a92(c26174xf2a580d1.f50531xe4c867eb);
        c26558xefca0816.m104097x780901b3(c26174xf2a580d1.f50522x9ab4d09f);
        c26558xefca0816.m104096x9371c425(c26174xf2a580d1.f50521x3ea720d8);
        c26558xefca0816.m104113x2b18641c(c26174xf2a580d1.f50536xe4e01359);
        c26558xefca0816.m104110x615b887a(c26174xf2a580d1.f50533xe089c0dd);
        c26558xefca0816.m104107xb727d396(c26174xf2a580d1.f50530x44bb55a8);
        c26558xefca0816.m104106xd2909608(c26174xf2a580d1.f50529x816d5421);
        this.f54967x9acdfd30.m103849xc6fc5aba(this.f55105xadd647d.f54945x9879cc5e);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.C26551xb06837ed c26551xb06837ed = this.f55105xadd647d.f54945x9879cc5e;
        int i17 = this.f54965xae2ee286;
        this.f54965xae2ee286 = i17 + 1;
        c26551xb06837ed.m103952xca02949d(i17);
        c26558xefca0816.m103885xc9322f66(this.f55105xadd647d.f54945x9879cc5e);
        return c26558xefca0816;
    }

    /* renamed from: getVodEndParams */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.vod.C26559x871ae52 m103855xb9e0bc2c(long j17, int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 c26405x843ecc94) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.vod.C26559x871ae52 c26559x871ae52 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.vod.C26559x871ae52();
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26548x32a8cc7b c26548x32a8cc7b = this.f55105xadd647d;
        long j18 = j17 - c26548x32a8cc7b.f55087x66c5d963;
        c26548x32a8cc7b.f55090x72983e6b = j18;
        c26559x871ae52.m104133x2e70cc56(j18);
        c26559x871ae52.m104132x6f5de1d3(i17);
        c26559x871ae52.m104138x75034565(this.f55105xadd647d.f55094x26ecee90);
        c26559x871ae52.m104136x59646f7(this.f55105xadd647d.f55091x748a28a8);
        c26559x871ae52.m104137xad6dbd72(this.f55105xadd647d.f55092xbec84261);
        c26559x871ae52.m104134xe58de773(this.f55105xadd647d.f55082xddf3d3c0);
        c26559x871ae52.m104135xad30a76(this.f55105xadd647d.f55083xc4a5c649);
        m103853x59efb4ff(c26559x871ae52, c26405x843ecc94);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.C26551xb06837ed c26551xb06837ed = this.f55105xadd647d.f54945x9879cc5e;
        int i18 = this.f54965xae2ee286;
        this.f54965xae2ee286 = i18 + 1;
        c26551xb06837ed.m103952xca02949d(i18);
        this.f54967x9acdfd30.m103849xc6fc5aba(this.f55105xadd647d.f54945x9879cc5e);
        c26559x871ae52.m103885xc9322f66(this.f55105xadd647d.f54945x9879cc5e);
        return c26559x871ae52;
    }

    /* renamed from: getVodPlayFlowParams */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.vod.C26561xf22d9537 m103856x711f1f9d(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 c26405x843ecc94, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 c26404xfb288653) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.vod.C26561xf22d9537 c26561xf22d9537 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.vod.C26561xf22d9537();
        c26561xf22d9537.m104207xc5740b5c(this.f54968x806675c4.f55076x9d874c31);
        c26561xf22d9537.m104180x202d302(this.f54968x806675c4.f55068xea88660d);
        c26561xf22d9537.m104206xe0b8777c(this.f54968x806675c4.f55074x1526a67);
        c26561xf22d9537.m104205xf434222d(this.f55105xadd647d.f55089x301d09e4);
        m103852x3767dbed(c26561xf22d9537, c26405x843ecc94);
        m103851x9101cae8(c26561xf22d9537, c26404xfb288653);
        this.f54967x9acdfd30.m103849xc6fc5aba(this.f55105xadd647d.f54945x9879cc5e);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.C26551xb06837ed c26551xb06837ed = this.f55105xadd647d.f54945x9879cc5e;
        int i17 = this.f54965xae2ee286;
        this.f54965xae2ee286 = i17 + 1;
        c26551xb06837ed.m103952xca02949d(i17);
        c26561xf22d9537.m103885xc9322f66(this.f55105xadd647d.f54945x9879cc5e);
        return c26561xf22d9537;
    }

    /* renamed from: onAppBackground */
    private void m103857x3be51a90() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onAppBackground");
        if (this.f55103x1cde086d) {
            return;
        }
        m103776x1ebcc756(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55035xb526954f, m103856x711f1f9d(m103782xa70cd483(), m103780x8ed24936(false)));
        m103776x1ebcc756(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55033x81b6e87a, m103855xb9e0bc2c(android.os.SystemClock.elapsedRealtime(), 0, m103782xa70cd483()));
    }

    /* renamed from: onAppForeground */
    private void m103858x1952ea5() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onAppForeground");
        m103785xb1f1ac19(this.f55105xadd647d.f54945x9879cc5e.m103900x194b99df());
    }

    /* renamed from: onBufferingEnd */
    private void m103859x2018c558(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BufferingEndEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onBufferingEnd fail:params is not match");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BufferingEndEventInfo bufferingEndEventInfo = (com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BufferingEndEventInfo) baseEventInfo;
        this.f55101xf3f4eeeb = false;
        if (this.f55104xcdb027f3) {
            return;
        }
        long m103165xb0301981 = bufferingEndEventInfo.m103165xb0301981() - this.f55105xadd647d.f55081xfb598bf0;
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Vod onBufferingEnd bufferingCostTimeMs:" + m103165xb0301981);
        if (m103165xb0301981 <= 1200) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26548x32a8cc7b c26548x32a8cc7b = this.f55105xadd647d;
        c26548x32a8cc7b.f55082xddf3d3c0++;
        c26548x32a8cc7b.f55083xc4a5c649 = (int) (c26548x32a8cc7b.f55083xc4a5c649 + m103165xb0301981);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.vod.C26557xb45b3f19 c26557xb45b3f19 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.vod.C26557xb45b3f19();
        c26557xb45b3f19.m104066xeb2d9731(this.f55105xadd647d.f55086xa23af86);
        c26557xb45b3f19.m104065x1643b182(m103165xb0301981);
        this.f54967x9acdfd30.m103849xc6fc5aba(this.f55105xadd647d.f54945x9879cc5e);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.C26551xb06837ed c26551xb06837ed = this.f55105xadd647d.f54945x9879cc5e;
        int i17 = this.f54965xae2ee286;
        this.f54965xae2ee286 = i17 + 1;
        c26551xb06837ed.m103952xca02949d(i17);
        c26557xb45b3f19.m103885xc9322f66(this.f55105xadd647d.f54945x9879cc5e);
        java.util.Map<java.lang.String, java.lang.String> m103886x18cb9578 = c26557xb45b3f19.m103886x18cb9578();
        m103777xf7a07396("onBufferingEnd", m103886x18cb9578);
        m103787xeb62bb48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55031xbc2e7c01, m103886x18cb9578);
        m103786xddf12126(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55031xbc2e7c01, m103886x18cb9578);
    }

    /* renamed from: onBufferingStart */
    private void m103860x7dc4d59f(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BufferingStartEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onBufferingStart fail:params is not match");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BufferingStartEventInfo bufferingStartEventInfo = (com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BufferingStartEventInfo) baseEventInfo;
        this.f55101xf3f4eeeb = true;
        if (this.f55104xcdb027f3) {
            return;
        }
        this.f55105xadd647d.f55081xfb598bf0 = bufferingStartEventInfo.m103165xb0301981();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Vod onBufferingStart timeMs:" + this.f55105xadd647d.f55081xfb598bf0);
    }

    /* renamed from: onDTCdnUrlUpdate */
    private void m103861x36563dba(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTCdnUrlUpdataEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onDTCdnUrlUpdate fail:params is not match");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTCdnUrlUpdataEventInfo dTCdnUrlUpdataEventInfo = (com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTCdnUrlUpdataEventInfo) baseEventInfo;
        java.lang.String m103167x743fd87e = dTCdnUrlUpdataEventInfo.m103167x743fd87e();
        java.lang.String m103168x33425148 = dTCdnUrlUpdataEventInfo.m103168x33425148();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Vod onDTCdnUrlUpdate cdnIp:" + m103167x743fd87e + " uIp:" + m103168x33425148);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26548x32a8cc7b c26548x32a8cc7b = this.f55105xadd647d;
        c26548x32a8cc7b.f54946xdb3e2e77 = m103167x743fd87e;
        c26548x32a8cc7b.f54949xac0eba6f = m103168x33425148;
    }

    /* renamed from: onDTProcessUpdate */
    private void m103862x62f99da9(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTDownloadProgressUpdataEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onDTProcessUpdate fail:params is not match");
            return;
        }
        int m103171x58461223 = ((com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTDownloadProgressUpdataEventInfo) baseEventInfo).m103171x58461223();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Vod onDTProcessUpdate speedKbps:" + m103171x58461223);
        this.f55105xadd647d.f54948x11033d44 = m103171x58461223;
    }

    /* renamed from: onDTProtocolUpdate */
    private void m103863x19c36a10(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTProtocalUpdateEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onDTProtocolUpdate fail:params is not match");
            return;
        }
        java.lang.String m103174xc15f60b5 = ((com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DTProtocalUpdateEventInfo) baseEventInfo).m103174xc15f60b5();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Vod onDTProtocolUpdate protocolVer:" + m103174xc15f60b5);
        this.f55105xadd647d.f54947x577997ee = m103174xc15f60b5;
    }

    /* renamed from: onDrmInfo */
    private void m103864xc240780e(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DrmEventInfo) {
            m103877xbc497044(((com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.DrmEventInfo) baseEventInfo).m103177xb067b2b7());
        } else {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onDrmInfo fail:params is not match");
        }
    }

    /* renamed from: onPlayerEnd */
    private void m103865x8e94bb1b(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (this.f55103x1cde086d) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "Player has been called End");
            return;
        }
        this.f55103x1cde086d = true;
        m103875xbddcced4(baseEventInfo.m103165xb0301981(), 0, m103783xe943b804(baseEventInfo), m103781x383a3b31(baseEventInfo));
        m103785xb1f1ac19(this.f55105xadd647d.f54945x9879cc5e.m103900x194b99df());
    }

    /* renamed from: onPlayerError */
    private void m103866x3c547448(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (this.f55103x1cde086d) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "Player has been called End");
            return;
        }
        this.f55103x1cde086d = true;
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayErrorEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onPlayerError fail:params is not match");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayErrorEventInfo playErrorEventInfo = (com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayErrorEventInfo) baseEventInfo;
        m103875xbddcced4(playErrorEventInfo.m103165xb0301981(), playErrorEventInfo.m103180x130a215f(), m103783xe943b804(playErrorEventInfo), m103781x383a3b31(playErrorEventInfo));
        m103785xb1f1ac19(this.f55105xadd647d.f54945x9879cc5e.m103900x194b99df());
    }

    /* renamed from: onPlayerPause */
    private void m103867x3ce7c836(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayPauseEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onPlayerPause fail:params is not match");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayPauseEventInfo playPauseEventInfo = (com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayPauseEventInfo) baseEventInfo;
        if (this.f55102x290f2ebc) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onPlayerPause has been called");
            return;
        }
        this.f55102x290f2ebc = true;
        this.f55105xadd647d.f55084xbba3f19c = playPauseEventInfo.m103165xb0301981();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Vod onPlayerPause timeMs:" + this.f55105xadd647d.f55084xbba3f19c);
    }

    /* renamed from: onPlayerStart */
    private void m103868x3d1a66a2(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayStartEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onPlayerStart fail:params is not match");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayStartEventInfo playStartEventInfo = (com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PlayStartEventInfo) baseEventInfo;
        this.f55103x1cde086d = false;
        this.f55102x290f2ebc = false;
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26548x32a8cc7b c26548x32a8cc7b = this.f55105xadd647d;
        if (c26548x32a8cc7b.f55087x66c5d963 == 0) {
            c26548x32a8cc7b.f55087x66c5d963 = playStartEventInfo.m103165xb0301981();
        }
        this.f55105xadd647d.f55088x46ce47d7 = playStartEventInfo.m103165xb0301981();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Vod onPlayerStart timeMs:" + this.f55105xadd647d.f55088x46ce47d7);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26548x32a8cc7b c26548x32a8cc7b2 = this.f55105xadd647d;
        if (c26548x32a8cc7b2.f55084xbba3f19c > 0) {
            long j17 = c26548x32a8cc7b2.f55085xb85697f5;
            long m103165xb0301981 = playStartEventInfo.m103165xb0301981();
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26548x32a8cc7b c26548x32a8cc7b3 = this.f55105xadd647d;
            c26548x32a8cc7b2.f55085xb85697f5 = j17 + (m103165xb0301981 - c26548x32a8cc7b3.f55084xbba3f19c);
            c26548x32a8cc7b3.f55084xbba3f19c = 0L;
        }
    }

    /* renamed from: onPrepareDone */
    private void m103869xce4951ca(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PrepareEndEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onPrepareDone fail:params is not match");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PrepareEndEventInfo prepareEndEventInfo = (com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PrepareEndEventInfo) baseEventInfo;
        long m103165xb0301981 = prepareEndEventInfo.m103165xb0301981() - this.f54968x806675c4.f55074x1526a67;
        this.f55105xadd647d.f55089x301d09e4 = prepareEndEventInfo.m103165xb0301981();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Vod onPrepareDone timeMs:" + m103165xb0301981);
        m103779xa97549fd(this.f55105xadd647d);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.C26551xb06837ed c26551xb06837ed = this.f55105xadd647d.f54945x9879cc5e;
        int i17 = this.f54965xae2ee286;
        this.f54965xae2ee286 = i17 + 1;
        c26551xb06837ed.m103952xca02949d(i17);
        this.f54967x9acdfd30.m103849xc6fc5aba(this.f55105xadd647d.f54945x9879cc5e);
        m103778xe4b5d01c(this.f55105xadd647d);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.vod.C26560x2285782d c26560x2285782d = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.vod.C26560x2285782d();
        c26560x2285782d.m104142x1643b182(m103165xb0301981);
        c26560x2285782d.m103885xc9322f66(this.f55105xadd647d.f54945x9879cc5e);
        java.util.Map<java.lang.String, java.lang.String> m103886x18cb9578 = c26560x2285782d.m103886x18cb9578();
        m103777xf7a07396("onPrepareDone", m103886x18cb9578);
        m103787xeb62bb48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55034x5021f496, m103886x18cb9578);
        m103786xddf12126(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55034x5021f496, m103886x18cb9578);
    }

    /* renamed from: onSeekEnd */
    private void m103870xc52d1064(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SeekEndEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onSeekEnd fail:params is not match");
            return;
        }
        this.f55104xcdb027f3 = false;
        long m103165xb0301981 = ((com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SeekEndEventInfo) baseEventInfo).m103165xb0301981();
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26548x32a8cc7b c26548x32a8cc7b = this.f55105xadd647d;
        long j17 = m103165xb0301981 - c26548x32a8cc7b.f55093xd9ae8320;
        if (j17 > 1200) {
            c26548x32a8cc7b.f55091x748a28a8++;
            c26548x32a8cc7b.f55092xbec84261 = (int) (c26548x32a8cc7b.f55092xbec84261 + j17);
        }
        c26548x32a8cc7b.f55094x26ecee90++;
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Vod onSeekEnd seekCostTimeMs:" + j17 + " mSeekTotalCount:" + this.f55105xadd647d.f55094x26ecee90 + " mSeekBufferingTotalCount:" + this.f55105xadd647d.f55091x748a28a8 + " mSeekBufferingTotalDurationMs:" + this.f55105xadd647d.f55092xbec84261);
    }

    /* renamed from: onSeekStart */
    private void m103871x2ef28dab(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SeekStartEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onSeekStart fail:params is not match");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SeekStartEventInfo seekStartEventInfo = (com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SeekStartEventInfo) baseEventInfo;
        if (this.f55101xf3f4eeeb) {
            m103859x2018c558(new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BufferingEndEventInfo());
        }
        if (this.f55104xcdb027f3) {
            m103870xc52d1064(new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SeekEndEventInfo());
        }
        this.f55104xcdb027f3 = true;
        this.f55105xadd647d.f55093xd9ae8320 = seekStartEventInfo.m103165xb0301981();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Vod onSeekStart timeMs:" + this.f55105xadd647d.f55093xd9ae8320);
    }

    /* renamed from: onSelectTrackEnd */
    private void m103872xb34a1c6b(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SelectTrackEndEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onSelectTrackEnd fail:params is not match");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SelectTrackEndEventInfo selectTrackEndEventInfo = (com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SelectTrackEndEventInfo) baseEventInfo;
        int m103201x130a215f = selectTrackEndEventInfo.m103201x130a215f();
        long m103202x28d92717 = selectTrackEndEventInfo.m103202x28d92717();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Vod onSelectTrackEnd errorCode:" + m103201x130a215f + " trackUniqueIndex:" + m103202x28d92717);
        m103876xf4a5f77a(m103202x28d92717, selectTrackEndEventInfo.m103165xb0301981(), m103201x130a215f);
    }

    /* renamed from: onSelectTrackStart */
    private void m103873x9fcb3f2(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SelectTrackStartEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onSelectTrackStart fail:params is not match");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SelectTrackStartEventInfo selectTrackStartEventInfo = (com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SelectTrackStartEventInfo) baseEventInfo;
        int m103206x322b163d = selectTrackStartEventInfo.m103206x322b163d();
        long m103205x28d92717 = selectTrackStartEventInfo.m103205x28d92717();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Vod onSelectTrackStart trackId:" + m103206x322b163d + " trackUniqueIndex:" + m103205x28d92717);
        if (this.f55105xadd647d.f55095x94785f8e.containsKey(java.lang.Long.valueOf(m103205x28d92717))) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26548x32a8cc7b.TPSelectTrackInfo tPSelectTrackInfo = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26548x32a8cc7b.TPSelectTrackInfo();
        tPSelectTrackInfo.f55096x468debbd = m103206x322b163d;
        tPSelectTrackInfo.f55098xa63276ac = selectTrackStartEventInfo.m103207x2ae89de3();
        tPSelectTrackInfo.f55097x272f3003 = selectTrackStartEventInfo.m103165xb0301981();
        this.f55105xadd647d.f55095x94785f8e.put(java.lang.Long.valueOf(selectTrackStartEventInfo.m103205x28d92717()), tPSelectTrackInfo);
    }

    /* renamed from: onSetPlaySpeed */
    private void m103874x607022b0(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (!(baseEventInfo instanceof com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SetPlaySpeedEventInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onSetPlaySpeed fail:params is not match");
            return;
        }
        this.f55105xadd647d.f55086xa23af86 = ((com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SetPlaySpeedEventInfo) baseEventInfo).m103217x4511374e();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Vod onSetPlaySpeed mPlaySpeed:" + this.f55105xadd647d.f55086xa23af86);
    }

    /* renamed from: reportPlayerEndEvent */
    private void m103875xbddcced4(long j17, int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 c26405x843ecc94, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 c26404xfb288653) {
        if (this.f55101xf3f4eeeb) {
            m103859x2018c558(new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BufferingEndEventInfo());
            this.f55101xf3f4eeeb = false;
        }
        if (this.f55104xcdb027f3) {
            m103870xc52d1064(new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SeekEndEventInfo());
            this.f55104xcdb027f3 = false;
        }
        if (this.f55102x290f2ebc) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26548x32a8cc7b c26548x32a8cc7b = this.f55105xadd647d;
            if (c26548x32a8cc7b.f55084xbba3f19c > 0) {
                long j18 = c26548x32a8cc7b.f55085xb85697f5;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26548x32a8cc7b c26548x32a8cc7b2 = this.f55105xadd647d;
                c26548x32a8cc7b.f55085xb85697f5 = j18 + (elapsedRealtime - c26548x32a8cc7b2.f55084xbba3f19c);
                c26548x32a8cc7b2.f55084xbba3f19c = 0L;
            }
            this.f55102x290f2ebc = false;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "reportPlayerEndEvent playerStopTimeMs:" + j17 + " errorCode:" + i17);
        m103879x37028408(c26405x843ecc94, c26404xfb288653);
        m103878x20e04696(j17, i17, c26405x843ecc94);
    }

    /* renamed from: reportSelectTrackEndEvent */
    private void m103876xf4a5f77a(long j17, long j18, int i17) {
        if (!this.f55105xadd647d.f55095x94785f8e.containsKey(java.lang.Long.valueOf(j17))) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "reportSelectTrackEndEvent mSelectTrackInfoList is not contain key:" + j17);
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26548x32a8cc7b.TPSelectTrackInfo tPSelectTrackInfo = this.f55105xadd647d.f55095x94785f8e.get(java.lang.Long.valueOf(j17));
        long j19 = j18 - tPSelectTrackInfo.f55097x272f3003;
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "reportSelectTrackEndEvent trackUniqueIndex:" + j17 + " costTimeMs:" + j19 + " trackId:" + tPSelectTrackInfo.f55096x468debbd);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.vod.C26562x65d01f26 c26562x65d01f26 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.vod.C26562x65d01f26();
        c26562x65d01f26.m104217x6f5de1d3(i17);
        c26562x65d01f26.m104216x1643b182(j19);
        c26562x65d01f26.m104218xdb5612fc(tPSelectTrackInfo.f55098xa63276ac.m101187x2aedc86f());
        c26562x65d01f26.m104215xffc2d81e(tPSelectTrackInfo.f55098xa63276ac.f51063xf2b76e07 ? 1 : 0);
        this.f54967x9acdfd30.m103849xc6fc5aba(this.f55105xadd647d.f54945x9879cc5e);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.p3073x2eefaa.C26551xb06837ed c26551xb06837ed = this.f55105xadd647d.f54945x9879cc5e;
        int i18 = this.f54965xae2ee286;
        this.f54965xae2ee286 = i18 + 1;
        c26551xb06837ed.m103952xca02949d(i18);
        c26562x65d01f26.m103885xc9322f66(this.f55105xadd647d.f54945x9879cc5e);
        java.util.Map<java.lang.String, java.lang.String> m103886x18cb9578 = c26562x65d01f26.m103886x18cb9578();
        m103777xf7a07396("onSelectTrackEnd", m103886x18cb9578);
        m103787xeb62bb48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55036xff54c349, m103886x18cb9578);
        m103786xddf12126(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55036xff54c349, m103886x18cb9578);
        this.f55105xadd647d.f55095x94785f8e.remove(java.lang.Long.valueOf(j17));
    }

    /* renamed from: reportVodDrmInfoEvent */
    private void m103877xbc497044(com.p314xaae8f345.p3006xb8ff1437.api.C26174xf2a580d1 c26174xf2a580d1) {
        java.util.Map<java.lang.String, java.lang.String> m103886x18cb9578 = m103854xa13915f0(c26174xf2a580d1).m103886x18cb9578();
        m103777xf7a07396("reportPlayerDrmInfoEvent", m103886x18cb9578);
        m103787xeb62bb48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55032x81b6e53e, m103886x18cb9578);
        m103786xddf12126(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55032x81b6e53e, m103886x18cb9578);
    }

    /* renamed from: reportVodEndEvent */
    private void m103878x20e04696(long j17, int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 c26405x843ecc94) {
        java.util.Map<java.lang.String, java.lang.String> m103886x18cb9578 = m103855xb9e0bc2c(j17, i17, c26405x843ecc94).m103886x18cb9578();
        m103777xf7a07396("reportVodEndEvent", m103886x18cb9578);
        m103787xeb62bb48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55033x81b6e87a, m103886x18cb9578);
        m103786xddf12126(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55033x81b6e87a, m103886x18cb9578);
    }

    /* renamed from: reportVodEndFlowEvent */
    private void m103879x37028408(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 c26405x843ecc94, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 c26404xfb288653) {
        java.util.Map<java.lang.String, java.lang.String> m103886x18cb9578 = m103856x711f1f9d(c26405x843ecc94, c26404xfb288653).m103886x18cb9578();
        m103777xf7a07396("reportVodEndFlowEvent", m103886x18cb9578);
        m103787xeb62bb48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55035xb526954f, m103886x18cb9578);
        m103786xddf12126(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26542xb9f10c65.f55035xb526954f, m103886x18cb9578);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26535x3290736e, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.InterfaceC26533xdd191086
    /* renamed from: init */
    public void mo103765x316510(android.content.Context context, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26546x3533ba13 c26546x3533ba13) {
        super.mo103765x316510(context, c26546x3533ba13);
        this.f54967x9acdfd30.m103848xa4c20cac(this.f55105xadd647d.f54945x9879cc5e);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26535x3290736e, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.InterfaceC26533xdd191086
    /* renamed from: onEvent */
    public void mo103766xaf8c47fb(int i17, com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        if (i17 == 1001) {
            m103858x1952ea5();
            return;
        }
        if (i17 == 1002) {
            m103857x3be51a90();
            return;
        }
        switch (i17) {
            case 2:
                m103869xce4951ca(baseEventInfo);
                return;
            case 3:
                m103868x3d1a66a2(baseEventInfo);
                return;
            case 4:
                m103867x3ce7c836(baseEventInfo);
                return;
            case 5:
                m103865x8e94bb1b(baseEventInfo);
                return;
            case 6:
                m103866x3c547448(baseEventInfo);
                return;
            case 7:
                m103871x2ef28dab(baseEventInfo);
                return;
            case 8:
                m103870xc52d1064(baseEventInfo);
                return;
            case 9:
                m103860x7dc4d59f(baseEventInfo);
                return;
            case 10:
                m103859x2018c558(baseEventInfo);
                return;
            case 11:
                m103873x9fcb3f2(baseEventInfo);
                return;
            case 12:
                m103872xb34a1c6b(baseEventInfo);
                return;
            case 13:
                m103874x607022b0(baseEventInfo);
                return;
            case 14:
                m103864xc240780e(baseEventInfo);
                return;
            default:
                switch (i17) {
                    case 100:
                        m103862x62f99da9(baseEventInfo);
                        return;
                    case 101:
                        m103861x36563dba(baseEventInfo);
                        return;
                    case 102:
                        m103863x19c36a10(baseEventInfo);
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26535x3290736e, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.InterfaceC26533xdd191086
    /* renamed from: reset */
    public void mo103767x6761d4f() {
        super.mo103767x6761d4f();
    }
}
