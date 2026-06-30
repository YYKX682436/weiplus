package com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437;

/* renamed from: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils */
/* loaded from: classes16.dex */
public class C26152x782d9536 {

    /* renamed from: OPTIONAL_ID_TYPE_BOOL */
    public static final int f50252xfbc3212a = 3;

    /* renamed from: OPTIONAL_ID_TYPE_FLOAT */
    public static final int f50253x7cd803fc = 7;

    /* renamed from: OPTIONAL_ID_TYPE_ILLEGAL */
    public static final int f50254x45710916 = -1;

    /* renamed from: OPTIONAL_ID_TYPE_INT */
    public static final int f50255xa506658f = 4;

    /* renamed from: OPTIONAL_ID_TYPE_LONG */
    public static final int f50256xfbc7acbc = 1;

    /* renamed from: OPTIONAL_ID_TYPE_OBJECT */
    public static final int f50257x2cf4f57f = 8;

    /* renamed from: OPTIONAL_ID_TYPE_QUEUE_INT */
    public static final int f50258x9f548541 = 5;

    /* renamed from: OPTIONAL_ID_TYPE_QUEUE_STRING */
    public static final int f50259x7e241d5f = 6;

    /* renamed from: OPTIONAL_ID_TYPE_STRING */
    public static final int f50260x34c9b251 = 2;
    private static java.lang.String TAG = "TPThumbPlayerUtils";

    /* renamed from: convert2TPAudioFrameBuffer */
    public static com.p314xaae8f345.p3006xb8ff1437.api.C26169xaecce4f3 m100778x1cda412(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26283xdf8c0ed3 c26283xdf8c0ed3) {
        if (c26283xdf8c0ed3 == null) {
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26169xaecce4f3 c26169xaecce4f3 = new com.p314xaae8f345.p3006xb8ff1437.api.C26169xaecce4f3();
        c26169xaecce4f3.f50396xb45ff7f7 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100888xae234a19(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapAudioSampleFormat.class, c26283xdf8c0ed3.f51598xb45ff7f7);
        c26169xaecce4f3.f50395x2eefaa = c26283xdf8c0ed3.f51597x2eefaa;
        c26169xaecce4f3.f50400x35e001 = c26283xdf8c0ed3.f51599x46e775f5;
        c26169xaecce4f3.f50399x88751aa = c26283xdf8c0ed3.f51602x88751aa;
        c26169xaecce4f3.f50393x48ac560d = c26283xdf8c0ed3.f51595x48ac560d;
        c26169xaecce4f3.f50398x660bcf5 = c26283xdf8c0ed3.f51601x660bded / 1000;
        c26169xaecce4f3.f50397x4bfab7b5 = c26283xdf8c0ed3.f51600x4bfab7b5;
        c26169xaecce4f3.f50394x556423d0 = c26283xdf8c0ed3.f51596x556423d0;
        return c26169xaecce4f3;
    }

    /* renamed from: convert2TPBufferDurationInfo */
    public static com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPBufferDurationInfo m100779xfe32d7bd(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.BufferDurationInfo bufferDurationInfo) {
        if (bufferDurationInfo == null) {
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPBufferDurationInfo tPBufferDurationInfo = new com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPBufferDurationInfo();
        tPBufferDurationInfo.f50876xffd26eb0 = bufferDurationInfo.f53210xffd26eb0;
        tPBufferDurationInfo.f50869xcd329e3f = bufferDurationInfo.f53203xcd329e3f;
        tPBufferDurationInfo.f50877x330f0536 = bufferDurationInfo.f53211x330f0536;
        tPBufferDurationInfo.f50879xf312a0bb = bufferDurationInfo.f53213xf312a0bb;
        tPBufferDurationInfo.f50878x3d765b69 = bufferDurationInfo.f53212x3d765b69;
        tPBufferDurationInfo.f50870xc5baea41 = bufferDurationInfo.f53204xc5baea41;
        tPBufferDurationInfo.f50872x42206e50 = bufferDurationInfo.f53206x42206e50;
        tPBufferDurationInfo.f50871x8c8428fe = bufferDurationInfo.f53205x8c8428fe;
        tPBufferDurationInfo.f50873xc5249d7c = bufferDurationInfo.f53207xc5249d7c;
        tPBufferDurationInfo.f50875x6b65e7b5 = bufferDurationInfo.f53209x6b65e7b5;
        tPBufferDurationInfo.f50874xb5c9a263 = bufferDurationInfo.f53208xb5c9a263;
        tPBufferDurationInfo.f50863x44b9efde = bufferDurationInfo.f53197x44b9efde;
        tPBufferDurationInfo.f50865x908bc113 = bufferDurationInfo.f53199x908bc113;
        tPBufferDurationInfo.f50864xdaef7bc1 = bufferDurationInfo.f53198xdaef7bc1;
        tPBufferDurationInfo.f50866x4423a319 = bufferDurationInfo.f53200x4423a319;
        tPBufferDurationInfo.f50868xb9d13a78 = bufferDurationInfo.f53202xb9d13a78;
        tPBufferDurationInfo.f50867x434f526 = bufferDurationInfo.f53201x434f526;
        return tPBufferDurationInfo;
    }

    /* renamed from: convert2TPDashFormat */
    public static com.p314xaae8f345.p3006xb8ff1437.api.C26173xc4a659c5 m100780x1a709c24(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26309x971775ec c26309x971775ec) {
        if (c26309x971775ec == null) {
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26173xc4a659c5 c26173xc4a659c5 = new com.p314xaae8f345.p3006xb8ff1437.api.C26173xc4a659c5();
        c26173xc4a659c5.f50512xd94d62c8 = c26309x971775ec.f52195xd94d62c8;
        c26173xc4a659c5.f50507xaf3af31d = c26309x971775ec.f52190xaf3af31d;
        c26173xc4a659c5.f50511xad05ed8e = c26309x971775ec.f52194xad05ed8e;
        c26173xc4a659c5.f50510x9fd29358 = c26309x971775ec.f52193x9fd29358;
        c26173xc4a659c5.f50513x6be2dc6 = c26309x971775ec.f52196x6be2dc6;
        c26173xc4a659c5.f50509xb7389127 = c26309x971775ec.f52192xb7389127;
        c26173xc4a659c5.f50506x8ad4c0b1 = c26309x971775ec.f52189x8ad4c0b1;
        c26173xc4a659c5.f50504xe235edc6 = c26309x971775ec.f52187xe235edc6;
        c26173xc4a659c5.f50505xe1ef245d = c26309x971775ec.f52188xe1ef245d;
        c26173xc4a659c5.f50508x207cebed = c26309x971775ec.f52191x207cebed;
        return c26173xc4a659c5;
    }

    /* renamed from: convert2TPDrmInfo */
    public static com.p314xaae8f345.p3006xb8ff1437.api.C26174xf2a580d1 m100781x5fde72d2(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94.TPPlayerDrmParams tPPlayerDrmParams) {
        com.p314xaae8f345.p3006xb8ff1437.api.C26174xf2a580d1 c26174xf2a580d1 = new com.p314xaae8f345.p3006xb8ff1437.api.C26174xf2a580d1();
        c26174xf2a580d1.f50535x6e5d9b2e = tPPlayerDrmParams.f53303xfd61f3a0;
        c26174xf2a580d1.f50538x2608317d = tPPlayerDrmParams.f53306x431b394b;
        c26174xf2a580d1.f50539x2609dec6 = tPPlayerDrmParams.f53307x431ce694;
        c26174xf2a580d1.f50520xe17149c9 = tPPlayerDrmParams.f53287xc0c14dbb;
        c26174xf2a580d1.f50540x729fa179 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100888xae234a19(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapReportDrmType.class, tPPlayerDrmParams.f53288x10b8544c);
        c26174xf2a580d1.f50528x14e1f4cd = tPPlayerDrmParams.f53296x8953966c;
        c26174xf2a580d1.f50527xa08b7886 = tPPlayerDrmParams.f53295xa4bc58de;
        c26174xf2a580d1.f50526xcdb84c48 = tPPlayerDrmParams.f53294xa65d0c67;
        c26174xf2a580d1.f50525xa47772c1 = tPPlayerDrmParams.f53293xc1c5ced9;
        c26174xf2a580d1.f50524xead9b9d5 = tPPlayerDrmParams.f53292x5f86f174;
        c26174xf2a580d1.f50523xe40df8e = tPPlayerDrmParams.f53291x7aefb3e6;
        c26174xf2a580d1.f50537x59351463 = tPPlayerDrmParams.f53305x7da560b1;
        c26174xf2a580d1.f50534xb6f10f93 = tPPlayerDrmParams.f53302x208a4d05;
        c26174xf2a580d1.f50532x3da09ef2 = tPPlayerDrmParams.f53300x2ea7d535;
        c26174xf2a580d1.f50531xe4c867eb = tPPlayerDrmParams.f53299x4a1097a7;
        c26174xf2a580d1.f50522x9ab4d09f = tPPlayerDrmParams.f53290x524bcfbe;
        c26174xf2a580d1.f50521x3ea720d8 = tPPlayerDrmParams.f53289x6db49230;
        c26174xf2a580d1.f50536xe4e01359 = tPPlayerDrmParams.f53304x55b3227;
        c26174xf2a580d1.f50533xe089c0dd = tPPlayerDrmParams.f53301xcf727bcf;
        c26174xf2a580d1.f50530x44bb55a8 = tPPlayerDrmParams.f53298x8f3b146b;
        c26174xf2a580d1.f50529x816d5421 = tPPlayerDrmParams.f53297xaaa3d6dd;
        return c26174xf2a580d1;
    }

    /* renamed from: convert2TPMediaCodecInfo */
    public static com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo m100782x15906db(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.MediaCodecInfo mediaCodecInfo) {
        if (mediaCodecInfo == null) {
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo tPMediaCodecInfo = new com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo();
        int i17 = mediaCodecInfo.f53218x7f94e13e;
        if (i17 == 0) {
            tPMediaCodecInfo.f50894x7f94e13e = com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo.f50889xc181df11;
        } else if (i17 != 1) {
            tPMediaCodecInfo.f50894x7f94e13e = com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo.f50888x3c8f2560;
        } else {
            tPMediaCodecInfo.f50894x7f94e13e = com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo.f50887xc05f666c;
        }
        int i18 = mediaCodecInfo.f53217xa9b6108;
        if (i18 == 0) {
            tPMediaCodecInfo.f50893xa9b6108 = com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo.f50891x96f7dbd1;
        } else if (i18 != 1) {
            tPMediaCodecInfo.f50893xa9b6108 = com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo.f50892x56d7f67c;
        } else {
            tPMediaCodecInfo.f50893xa9b6108 = com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo.f50890xf67a037d;
        }
        tPMediaCodecInfo.msg = mediaCodecInfo.msg;
        return tPMediaCodecInfo;
    }

    /* renamed from: convert2TPMediaDrmInfo */
    public static com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaDrmInfo m100783x2f8b61a4(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.MediaDrmInfo mediaDrmInfo) {
        if (mediaDrmInfo == null) {
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaDrmInfo tPMediaDrmInfo = new com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaDrmInfo();
        tPMediaDrmInfo.f50897xda357d3e = mediaDrmInfo.f53221xda357d3e;
        tPMediaDrmInfo.f50898xda372a87 = mediaDrmInfo.f53222xda372a87;
        tPMediaDrmInfo.f50895x65b34528 = mediaDrmInfo.f53219x65b34528;
        tPMediaDrmInfo.f50896x729fa179 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100888xae234a19(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapDrmType.class, mediaDrmInfo.f53220x729fa179);
        return tPMediaDrmInfo;
    }

    /* renamed from: convert2TPNativeBufferConfig */
    public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3033x5c7f9c9c.C26351x73e345c1 m100784xbd52054(com.p314xaae8f345.p3006xb8ff1437.api.C26179xe269964a c26179xe269964a) {
        if (c26179xe269964a == null) {
            return null;
        }
        return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3033x5c7f9c9c.C26351x73e345c1.Builder().m102150x51bfb048(c26179xe269964a.m101048x81acfdd4()).m102149xca2b077e(c26179xe269964a.m101047xfa18550a()).m102152xbc7ef6f7(c26179xe269964a.m101050xec6c4483()).m102151xfacbe53(c26179xe269964a.m101049x3f9a0bdf()).m102147x70a3eb1b(c26179xe269964a.m101045x26d792a7()).m102148x5dadc46f(c26179xe269964a.m101046x8217b7fb()).m102146x59bc66e();
    }

    /* renamed from: convert2TPNativeFontStyleFlags */
    private static int m100785xf290c137(long j17) {
        int i17 = 0;
        for (java.util.Map.Entry<java.lang.Number, java.lang.Number> entry : com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100879x1d1f8cd(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapSubtitleFontStyle.class)) {
            if ((entry.getKey().intValue() & j17) > 0) {
                i17 |= entry.getValue().intValue();
            }
        }
        return i17;
    }

    /* renamed from: convert2TPNativeRemoteSdpInfo */
    public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3033x5c7f9c9c.C26352x61a9374 m100786x29fb8bf5(com.p314xaae8f345.p3006xb8ff1437.api.C26191xd404514b c26191xd404514b) {
        if (c26191xd404514b == null) {
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3033x5c7f9c9c.C26352x61a9374 c26352x61a9374 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3033x5c7f9c9c.C26352x61a9374();
        c26352x61a9374.f52634x6e268779 = c26191xd404514b.f50969x6e268779;
        c26352x61a9374.f52635x4c531e19 = c26191xd404514b.f50970x4c531e19;
        return c26352x61a9374;
    }

    /* renamed from: convert2TPNativeSubtitleParamsFlags */
    private static long m100787xd017cc77(long j17) {
        long j18 = 0;
        for (java.util.Map.Entry<java.lang.Number, java.lang.Number> entry : com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100879x1d1f8cd(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapSubtitleRenderParams.class)) {
            if ((entry.getKey().longValue() & j17) > 0) {
                j18 |= entry.getValue().longValue();
            }
        }
        return j18;
    }

    /* renamed from: convert2TPNativeSubtitleRenderParams */
    public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.C26448xe1fd3147 m100788x1e0cd5a6(com.p314xaae8f345.p3006xb8ff1437.api.C26195xfe0f07df c26195xfe0f07df) {
        if (c26195xfe0f07df == null) {
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.C26448xe1fd3147 c26448xe1fd3147 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3048x852f4c18.C26448xe1fd3147();
        c26448xe1fd3147.f53714x8fec5f4e = c26195xfe0f07df.f51012x8fec5f4e;
        c26448xe1fd3147.f53713x53d0909f = c26195xfe0f07df.f51011x53d0909f;
        c26448xe1fd3147.f53724x199f35fa = m100787xd017cc77(c26195xfe0f07df.f51022x199f35fa);
        c26448xe1fd3147.f53725x9b190fb6 = m100787xd017cc77(c26195xfe0f07df.f51023x9b190fb6);
        c26448xe1fd3147.f53716x2f98f80f = c26195xfe0f07df.f51014x2f98f80f;
        c26448xe1fd3147.f53719x15caa0f0 = c26195xfe0f07df.f51017x15caa0f0;
        c26448xe1fd3147.f53717xa2aa8c54 = c26195xfe0f07df.f51015xa2aa8c54;
        c26448xe1fd3147.f53720xacebd905 = m100785xf290c137(c26195xfe0f07df.f51018xacebd905);
        c26448xe1fd3147.f53723xa8500ea4 = c26195xfe0f07df.f51021xa8500ea4;
        c26448xe1fd3147.f53722xa7391041 = c26195xfe0f07df.f51020xa7391041;
        c26448xe1fd3147.f53721x94472972 = c26195xfe0f07df.f51019x94472972;
        c26448xe1fd3147.f53726x857be4b0 = c26195xfe0f07df.f51024x857be4b0;
        c26448xe1fd3147.f53715x54a1aa69 = c26195xfe0f07df.f51013x54a1aa69;
        c26448xe1fd3147.f53727xd9a3e8c4 = c26195xfe0f07df.f51025xd9a3e8c4;
        c26448xe1fd3147.f53718xa386663b = c26195xfe0f07df.f51016xa386663b;
        return c26448xe1fd3147;
    }

    /* renamed from: convert2TPPlayerDetailInfo */
    public static com.p314xaae8f345.p3006xb8ff1437.api.C26183xfc0748fc m100789x4f08081b(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26297x46ca5c3b c26297x46ca5c3b) {
        if (c26297x46ca5c3b == null) {
            return null;
        }
        return new com.p314xaae8f345.p3006xb8ff1437.api.C26183xfc0748fc(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100888xae234a19(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapDetailInfoType.class, c26297x46ca5c3b.f51901x368f3a), c26297x46ca5c3b.f51900x81b5142c / 1000);
    }

    /* renamed from: convert2TPPlayerSurfaceDolbyVisionInfo */
    public static com.p314xaae8f345.p3006xb8ff1437.api.C26197xc280015d m100790x8f3add3d(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26416x733cdb55 c26416x733cdb55) {
        if (c26416x733cdb55 == null) {
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26197xc280015d c26197xc280015d = new com.p314xaae8f345.p3006xb8ff1437.api.C26197xc280015d();
        c26197xc280015d.f51031x8ba73c7c = c26416x733cdb55.f53495x8ba73c7c;
        c26197xc280015d.f51030xbe5ee717 = c26416x733cdb55.f53494xbe5ee717;
        c26197xc280015d.f51029xb4feb98c = c26416x733cdb55.f53493xb4feb98c;
        return c26197xc280015d;
    }

    /* renamed from: convert2TPPlayerSurfaceRenderInfo */
    public static com.p314xaae8f345.p3006xb8ff1437.api.C26198xffdbf0d5 m100791xf6ff28f5(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26417xf28cbbdd c26417xf28cbbdd) {
        if (c26417xf28cbbdd == null) {
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26198xffdbf0d5 c26198xffdbf0d5 = new com.p314xaae8f345.p3006xb8ff1437.api.C26198xffdbf0d5();
        c26198xffdbf0d5.f51033x5fd14e24 = c26417xf28cbbdd.f53497x5fd14e24;
        c26198xffdbf0d5.f51032x80897c89 = c26417xf28cbbdd.f53496x80897c89;
        c26198xffdbf0d5.f51034x6e6998f9 = m100796x2b78551e(c26417xf28cbbdd.f53498x6e6998f9);
        return c26198xffdbf0d5;
    }

    /* renamed from: convert2TPPostProcessFrame */
    public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26323x31e71b9a m100792x84e7dab9(com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a c26188x7aa7007a) {
        if (c26188x7aa7007a == null) {
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26323x31e71b9a c26323x31e71b9a = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26323x31e71b9a();
        int m100886x2999bb54 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100886x2999bb54(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapMediaType.class, c26188x7aa7007a.f50937x7f94e13e);
        c26323x31e71b9a.f52316x7f94e13e = m100886x2999bb54;
        if (m100886x2999bb54 == 0) {
            c26323x31e71b9a.f52313xb45ff7f7 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100886x2999bb54(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapPixelFormat.class, c26188x7aa7007a.f50935xb45ff7f7);
        } else if (m100886x2999bb54 == 1) {
            c26323x31e71b9a.f52313xb45ff7f7 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100886x2999bb54(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapAudioSampleFormat.class, c26188x7aa7007a.f50935xb45ff7f7);
        }
        c26323x31e71b9a.f52312x2eefaa = c26188x7aa7007a.f50933x2eefaa;
        c26323x31e71b9a.f52315x46e775f5 = c26188x7aa7007a.f50945x35e001;
        c26323x31e71b9a.f52323x88751aa = c26188x7aa7007a.f50944x88751aa;
        c26323x31e71b9a.f52310x48ac560d = c26188x7aa7007a.f50931x48ac560d;
        c26323x31e71b9a.f52319x660bded = c26188x7aa7007a.f50940x660bcf5 * 1000;
        c26323x31e71b9a.f52317x4bfab7b5 = c26188x7aa7007a.f50938x4bfab7b5;
        c26323x31e71b9a.f52311x556423d0 = c26188x7aa7007a.f50932x556423d0;
        c26323x31e71b9a.f52324x6be2dc6 = c26188x7aa7007a.f50946x6be2dc6;
        c26323x31e71b9a.f52314xb7389127 = c26188x7aa7007a.f50936xb7389127;
        c26323x31e71b9a.f52322xf39d943d = c26188x7aa7007a.f50943xf39d943d;
        c26323x31e71b9a.f52321xf39d6cc4 = c26188x7aa7007a.f50942xf39d6cc4;
        c26323x31e71b9a.f52320xfd990f7e = c26188x7aa7007a.f50941xfd990f7e;
        c26323x31e71b9a.f52318x199f3a33 = c26188x7aa7007a.f50939x199f3a33;
        return c26323x31e71b9a;
    }

    /* renamed from: convert2TPPostProcessFrameBuffer */
    public static com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a m100793xbbbdac59(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26323x31e71b9a c26323x31e71b9a) {
        if (c26323x31e71b9a == null) {
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a c26188x7aa7007a = new com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a();
        int m100888xae234a19 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100888xae234a19(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapMediaType.class, c26323x31e71b9a.f52316x7f94e13e);
        c26188x7aa7007a.f50937x7f94e13e = m100888xae234a19;
        if (m100888xae234a19 == 0) {
            c26188x7aa7007a.f50935xb45ff7f7 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100888xae234a19(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapPixelFormat.class, c26323x31e71b9a.f52313xb45ff7f7);
        } else if (m100888xae234a19 == 1) {
            c26188x7aa7007a.f50935xb45ff7f7 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100888xae234a19(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapAudioSampleFormat.class, c26323x31e71b9a.f52313xb45ff7f7);
        }
        c26188x7aa7007a.f50933x2eefaa = c26323x31e71b9a.f52312x2eefaa;
        c26188x7aa7007a.f50945x35e001 = c26323x31e71b9a.f52315x46e775f5;
        c26188x7aa7007a.f50944x88751aa = c26323x31e71b9a.f52323x88751aa;
        c26188x7aa7007a.f50931x48ac560d = c26323x31e71b9a.f52310x48ac560d;
        c26188x7aa7007a.f50940x660bcf5 = c26323x31e71b9a.f52319x660bded / 1000;
        c26188x7aa7007a.f50938x4bfab7b5 = c26323x31e71b9a.f52317x4bfab7b5;
        c26188x7aa7007a.f50932x556423d0 = c26323x31e71b9a.f52311x556423d0;
        c26188x7aa7007a.f50946x6be2dc6 = c26323x31e71b9a.f52324x6be2dc6;
        c26188x7aa7007a.f50936xb7389127 = c26323x31e71b9a.f52314xb7389127;
        c26188x7aa7007a.f50943xf39d943d = c26323x31e71b9a.f52322xf39d943d;
        c26188x7aa7007a.f50942xf39d6cc4 = c26323x31e71b9a.f52321xf39d6cc4;
        c26188x7aa7007a.f50941xfd990f7e = c26323x31e71b9a.f52320xfd990f7e;
        c26188x7aa7007a.f50939x199f3a33 = c26323x31e71b9a.f52318x199f3a33;
        return c26188x7aa7007a;
    }

    /* renamed from: convert2TPSubtitleFrameBuffer */
    public static com.p314xaae8f345.p3006xb8ff1437.api.C26194x3ac954b9 m100794x5eaa4d3a(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26327x7e714b19 c26327x7e714b19) {
        if (c26327x7e714b19 == null) {
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26194x3ac954b9 c26194x3ac954b9 = new com.p314xaae8f345.p3006xb8ff1437.api.C26194x3ac954b9();
        c26194x3ac954b9.f50987x2eefaa = c26327x7e714b19.f52349x2eefaa;
        c26194x3ac954b9.f50992x46d8ea15 = c26327x7e714b19.f52352x46e775f5;
        c26194x3ac954b9.f50991xb45ff7f7 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100888xae234a19(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapSubtitleFormat.class, c26327x7e714b19.f52350xb45ff7f7);
        int i17 = c26327x7e714b19.f52351xb7389127;
        c26194x3ac954b9.f50995xd2aa402b = i17;
        int i18 = c26327x7e714b19.f52357x6be2dc6;
        c26194x3ac954b9.f50996xe6988e42 = i18;
        c26194x3ac954b9.f50988xdd2db4c = i17;
        c26194x3ac954b9.f50989x224f8b01 = i18;
        c26194x3ac954b9.f50994xfd990f7e = c26327x7e714b19.f52354xfd990f7e;
        c26194x3ac954b9.f50993x660bcf5 = c26327x7e714b19.f52353x660bded / 1000;
        return c26194x3ac954b9;
    }

    /* renamed from: convert2TPVideoCropInfo */
    public static com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPVideoCropInfo m100795x2b78551e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.VideoCropInfo videoCropInfo) {
        if (videoCropInfo == null) {
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPVideoCropInfo tPVideoCropInfo = new com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPVideoCropInfo();
        tPVideoCropInfo.f50906x6be2dc6 = videoCropInfo.f53228x6be2dc6;
        tPVideoCropInfo.f50905xb7389127 = videoCropInfo.f53227xb7389127;
        tPVideoCropInfo.f50902x7e5306b7 = videoCropInfo.f53224x7e5306b7;
        tPVideoCropInfo.f50903x4c64316c = videoCropInfo.f53225x4c64316c;
        tPVideoCropInfo.f50904x3de1c4a5 = videoCropInfo.f53226x3de1c4a5;
        tPVideoCropInfo.f50901x252f14db = videoCropInfo.f53223x252f14db;
        return tPVideoCropInfo;
    }

    /* renamed from: convert2TPVideoFrameBuffer */
    public static com.p314xaae8f345.p3006xb8ff1437.api.C26203x3f6f032e m100797x926fc24d(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26334x22c4354e c26334x22c4354e) {
        int i17;
        com.p314xaae8f345.p3006xb8ff1437.api.C26203x3f6f032e c26203x3f6f032e = new com.p314xaae8f345.p3006xb8ff1437.api.C26203x3f6f032e();
        c26203x3f6f032e.f51074x2eefaa = c26334x22c4354e.f52424x2eefaa;
        c26203x3f6f032e.f51079x46d8ea15 = c26334x22c4354e.f52427x46e775f5;
        c26203x3f6f032e.f51078xb45ff7f7 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100888xae234a19(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapPixelFormat.class, c26334x22c4354e.f52425xb45ff7f7);
        int i18 = c26334x22c4354e.f52426xb7389127;
        c26203x3f6f032e.f51082xd2aa402b = i18;
        int i19 = c26334x22c4354e.f52432x6be2dc6;
        c26203x3f6f032e.f51083xe6988e42 = i19;
        c26203x3f6f032e.f51075xdd2db4c = i18;
        c26203x3f6f032e.f51076x224f8b01 = i19;
        int i27 = c26334x22c4354e.f52430xf39d6cc4;
        if (i27 > 0 && (i17 = c26334x22c4354e.f52431xf39d943d) > 0) {
            c26203x3f6f032e.f51076x224f8b01 = java.lang.Math.round((i17 / i27) * i19);
        }
        c26203x3f6f032e.f51081xfd990f7e = c26334x22c4354e.f52429xfd990f7e;
        c26203x3f6f032e.f51080x660bcf5 = c26334x22c4354e.f52428x660bded / 1000;
        return c26203x3f6f032e;
    }

    /* renamed from: convert2TPVideoPacketBuffer */
    public static com.p314xaae8f345.p3006xb8ff1437.api.C26205xd6ffcbe7 m100798xe416f0a8(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26336x45e43cc7 c26336x45e43cc7) {
        if (c26336x45e43cc7 == null) {
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26205xd6ffcbe7 c26205xd6ffcbe7 = new com.p314xaae8f345.p3006xb8ff1437.api.C26205xd6ffcbe7();
        c26205xd6ffcbe7.f51098x62065b7 = c26336x45e43cc7.f52463x62065b7;
        c26205xd6ffcbe7.f51102x627560e = c26336x45e43cc7.f52467x627560e;
        c26205xd6ffcbe7.f51101xbe9e0888 = c26336x45e43cc7.f52466xbe9e0980 / 1000;
        c26205xd6ffcbe7.f51100xbdf4ee7c = c26336x45e43cc7.f52465xbdf4ef74 / 1000;
        c26205xd6ffcbe7.f51099xcadc8401 = m100790x8f3add3d(c26336x45e43cc7.f52464xcadc8401);
        return c26205xd6ffcbe7;
    }

    /* renamed from: convert2TPVideoSeiInfo */
    public static com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPVideoSeiInfo m100799x28b1cfe5(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.VideoSeiInfo videoSeiInfo) {
        if (videoSeiInfo == null) {
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPVideoSeiInfo tPVideoSeiInfo = new com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPVideoSeiInfo();
        int m100888xae234a19 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100888xae234a19(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapCodecType.class, videoSeiInfo.f53232xcfdefe35);
        tPVideoSeiInfo.f50909xcfdefe35 = m100888xae234a19;
        if (videoSeiInfo.f53231x77f4dc09) {
            tPVideoSeiInfo.f50910x6cf04f36 = videoSeiInfo.f53233x6cf04f36;
        } else if (m100888xae234a19 == 26) {
            tPVideoSeiInfo.f50910x6cf04f36 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100888xae234a19(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapVideoH264SeiType.class, videoSeiInfo.f53233x6cf04f36);
        } else if (m100888xae234a19 == 172) {
            tPVideoSeiInfo.f50910x6cf04f36 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100888xae234a19(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapVideoHevcSeiType.class, videoSeiInfo.f53233x6cf04f36);
        }
        int i17 = videoSeiInfo.f53230x6aa25ecb;
        tPVideoSeiInfo.f50908x82443842 = i17;
        tPVideoSeiInfo.f50907x75ae1ca1 = java.util.Arrays.copyOf(videoSeiInfo.f53229x2eefaa, i17);
        return tPVideoSeiInfo;
    }

    /* renamed from: convertToNativeParamsType */
    public static int m100800xdf41f505(int i17) {
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                return 0;
            }
        }
        return i18;
    }

    /* renamed from: convertToTPNativeAudioAttributes */
    public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26315x77280f9a m100801x8b55e84c(com.p314xaae8f345.p3006xb8ff1437.api.C26168x7199b3b1 c26168x7199b3b1) {
        if (c26168x7199b3b1 == null) {
            return null;
        }
        int m100886x2999bb54 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100886x2999bb54(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapTPAudioAttributeUsage.class, c26168x7199b3b1.m101010x754423eb());
        int m100886x2999bb542 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100886x2999bb54(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapTPAudioAttributeUsage.class, c26168x7199b3b1.m101008xc2a49a1d());
        int i17 = (c26168x7199b3b1.m101009x746d94d1() & 1) == 0 ? 0 : 1;
        if ((c26168x7199b3b1.m101009x746d94d1() & 16) != 0) {
            i17 |= 16;
        }
        if ((c26168x7199b3b1.m101009x746d94d1() & 256) != 0) {
            i17 |= 256;
        }
        return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26315x77280f9a.Builder().m101872x53d23e5f(m100886x2999bb54).m101869x590a0d91(m100886x2999bb542).m101870x52fbaf45(i17).m101868x59bc66e();
    }

    /* renamed from: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils$OptionIdMapping */
    /* loaded from: classes13.dex */
    public static class OptionIdMapping {

        /* renamed from: nativePlayerOptionalID */
        private final int f50261x28a79473;

        /* renamed from: optionalIDType */
        private final int f50262xa5f44a55;

        public OptionIdMapping() {
            this.f50262xa5f44a55 = -1;
            this.f50261x28a79473 = -1;
        }

        /* renamed from: getNativePlayerOptionalID */
        public int m100802x92760b69() {
            return this.f50261x28a79473;
        }

        /* renamed from: getOptionalIDType */
        public int m100803x948c174b() {
            return this.f50262xa5f44a55;
        }

        /* renamed from: isIllegal */
        public boolean m100804x4e4c5aec() {
            return this.f50262xa5f44a55 == -1 || this.f50261x28a79473 == -1;
        }

        public OptionIdMapping(int i17, int i18) {
            this.f50262xa5f44a55 = i17;
            this.f50261x28a79473 = i18;
        }
    }

    /* renamed from: convert2TPVideoCropInfo */
    private static com.p314xaae8f345.p3006xb8ff1437.api.C26198xffdbf0d5.TPVideoCropInfo m100796x2b78551e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26417xf28cbbdd.TPVideoCropInfo tPVideoCropInfo) {
        if (tPVideoCropInfo == null) {
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26198xffdbf0d5.TPVideoCropInfo tPVideoCropInfo2 = new com.p314xaae8f345.p3006xb8ff1437.api.C26198xffdbf0d5.TPVideoCropInfo();
        tPVideoCropInfo2.f51036x7e5306b7 = tPVideoCropInfo.f53500x7e5306b7;
        tPVideoCropInfo2.f51037x4c64316c = tPVideoCropInfo.f53501x4c64316c;
        tPVideoCropInfo2.f51038x3de1c4a5 = tPVideoCropInfo.f53502x3de1c4a5;
        tPVideoCropInfo2.f51035x252f14db = tPVideoCropInfo.f53499x252f14db;
        tPVideoCropInfo2.f51040x6be2dc6 = tPVideoCropInfo.f53504x6be2dc6;
        tPVideoCropInfo2.f51039xb7389127 = tPVideoCropInfo.f53503xb7389127;
        return tPVideoCropInfo2;
    }
}
