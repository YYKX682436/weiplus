package com.p314xaae8f345.p457x3304c6.p470x35bb6d35;

/* renamed from: com.tencent.maas.instamovie.MJExportSettings */
/* loaded from: classes5.dex */
public class C4069xbe747ef4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p473xa097e797.C4095x97ef0bcd f129639a;

    /* renamed from: b, reason: collision with root package name */
    public final int f129640b;

    /* renamed from: c, reason: collision with root package name */
    public final int f129641c;

    /* renamed from: d, reason: collision with root package name */
    public final rg.e f129642d;

    /* renamed from: e, reason: collision with root package name */
    public final rg.a f129643e;

    /* renamed from: f, reason: collision with root package name */
    public final rg.d f129644f;

    /* renamed from: g, reason: collision with root package name */
    public final rg.c f129645g;

    /* renamed from: h, reason: collision with root package name */
    public final int f129646h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f129647i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f129648j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f129649k;

    /* renamed from: l, reason: collision with root package name */
    public int f129650l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f129651m;

    /* renamed from: n, reason: collision with root package name */
    public float f129652n;

    /* renamed from: o, reason: collision with root package name */
    public float f129653o;

    /* renamed from: p, reason: collision with root package name */
    public rg.b f129654p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.Map f129655q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f129656r;

    public C4069xbe747ef4(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p473xa097e797.C4095x97ef0bcd c4095x97ef0bcd, int i17, int i18, rg.e eVar, rg.a aVar, rg.d dVar, rg.c cVar, int i19) {
        this.f129639a = c4095x97ef0bcd;
        this.f129640b = i17;
        this.f129641c = i18;
        this.f129642d = eVar;
        this.f129643e = aVar;
        this.f129644f = dVar;
        this.f129645g = cVar;
        this.f129646h = i19;
        this.f129647i = "";
        this.f129648j = null;
        this.f129649k = false;
        this.f129650l = 15;
        this.f129651m = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(5.0d);
        this.f129652n = 0.0f;
        this.f129653o = Float.POSITIVE_INFINITY;
        this.f129654p = rg.b.None;
    }

    /* renamed from: getDefault1080pSettings */
    public static com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 m33172x37f11911() {
        return new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p473xa097e797.C4095x97ef0bcd.f129729e, 300000, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48026xbfd28259, rg.e.H264, rg.a.MPEG4AAC, rg.d.MP4, rg.c.DIMENSION_LEVEL_1080, 30);
    }

    /* renamed from: getHEVC1080pSettings */
    public static com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 m33173xe0c63c7c() {
        return new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p473xa097e797.C4095x97ef0bcd.f129729e, 300000, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48026xbfd28259, rg.e.HEVC, rg.a.MPEG4AAC, rg.d.MP4, rg.c.DIMENSION_LEVEL_1080, 30);
    }

    /* renamed from: getAudioCodecID */
    public int m33174x3a881d71() {
        return this.f129643e.f476669d;
    }

    /* renamed from: getAverageAudioBitRate */
    public int m33175xd21dda5e() {
        return this.f129641c;
    }

    /* renamed from: getChecksumType */
    public int m33176x8b581893() {
        return this.f129654p.f476673d;
    }

    /* renamed from: getCopyrightMetadata */
    public java.lang.String m33177x1112360() {
        return this.f129648j;
    }

    /* renamed from: getCoverImageClarityThreshold */
    public float m33178xba7562b1() {
        return this.f129653o;
    }

    /* renamed from: getCoverImageDetectionDarknessRatioThreshold */
    public float m33179xe39dfa78() {
        return this.f129652n;
    }

    /* renamed from: getCoverImageDetectionFrameInterval */
    public int m33180x942e5f47() {
        return this.f129650l;
    }

    /* renamed from: getCoverImageDetectionMaxDuration */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33181xd6b9d64d() {
        return this.f129651m;
    }

    /* renamed from: getFrameRate */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p473xa097e797.C4095x97ef0bcd m33182x1fea5d37() {
        return this.f129639a;
    }

    /* renamed from: getMaxKeyframeInterval */
    public int m33183x7daa7a1() {
        return this.f129646h;
    }

    /* renamed from: getMediaContainerType */
    public int m33184xca5d3bcd() {
        return this.f129644f.f476686d;
    }

    /* renamed from: getMetaData */
    public java.util.Map<java.lang.String, java.lang.String> m33185x60f92cc5() {
        return this.f129655q;
    }

    /* renamed from: getVideoBitsPerFrame */
    public int m33186x1cc564db() {
        return this.f129640b;
    }

    /* renamed from: getVideoCodecID */
    public int m33187x9050912c() {
        return this.f129642d.f476691d;
    }

    /* renamed from: getVideoDimensionLevel */
    public int m33188xf0ad77e3() {
        return this.f129645g.f476682d;
    }

    /* renamed from: getVideoEncoderName */
    public java.lang.String m33189xfd6e75c2() {
        return this.f129647i;
    }

    /* renamed from: isCoverImageDetectionEnabled */
    public boolean m33190x1a44adca() {
        return this.f129649k;
    }

    /* renamed from: isUseMetadataTags */
    public boolean m33191x28e16c85() {
        return this.f129656r;
    }

    public C4069xbe747ef4(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p473xa097e797.C4095x97ef0bcd c4095x97ef0bcd, int i17, int i18, rg.e eVar, rg.a aVar, rg.d dVar, rg.c cVar, int i19, java.lang.String str) {
        this.f129639a = c4095x97ef0bcd;
        this.f129640b = i17;
        this.f129641c = i18;
        this.f129642d = eVar;
        this.f129643e = aVar;
        this.f129644f = dVar;
        this.f129645g = cVar;
        this.f129646h = i19;
        this.f129647i = str;
        this.f129648j = null;
        this.f129649k = false;
        this.f129650l = 15;
        this.f129651m = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(5.0d);
        this.f129652n = 0.0f;
        this.f129653o = Float.POSITIVE_INFINITY;
        this.f129654p = rg.b.None;
    }

    public C4069xbe747ef4(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p473xa097e797.C4095x97ef0bcd c4095x97ef0bcd, int i17, int i18, rg.e eVar, rg.a aVar, rg.d dVar, rg.c cVar, int i19, java.lang.String str, java.lang.String str2) {
        this.f129639a = c4095x97ef0bcd;
        this.f129640b = i17;
        this.f129641c = i18;
        this.f129642d = eVar;
        this.f129643e = aVar;
        this.f129644f = dVar;
        this.f129645g = cVar;
        this.f129646h = i19;
        this.f129647i = str;
        this.f129648j = str2;
        this.f129649k = false;
        this.f129650l = 15;
        this.f129651m = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(5.0d);
        this.f129652n = 0.0f;
        this.f129653o = Float.POSITIVE_INFINITY;
        this.f129654p = rg.b.None;
    }

    public C4069xbe747ef4(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p473xa097e797.C4095x97ef0bcd.FrameRateType frameRateType = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p473xa097e797.C4095x97ef0bcd.FrameRateType) ((java.util.HashMap) com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p473xa097e797.C4095x97ef0bcd.FrameRateType.f129741o).get(java.lang.Integer.valueOf(i18));
        this.f129639a = new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p473xa097e797.C4095x97ef0bcd(frameRateType == null ? null : frameRateType);
        this.f129640b = i29;
        this.f129641c = i37;
        rg.e eVar = (rg.e) ((java.util.HashMap) rg.e.f476689g).get(java.lang.Integer.valueOf(i19));
        this.f129642d = eVar == null ? null : eVar;
        rg.a aVar = (rg.a) ((java.util.HashMap) rg.a.f476667f).get(java.lang.Integer.valueOf(i27));
        this.f129643e = aVar == null ? null : aVar;
        rg.d dVar = (rg.d) ((java.util.HashMap) rg.d.f476684f).get(java.lang.Integer.valueOf(i28));
        this.f129644f = dVar != null ? dVar : null;
        this.f129645g = rg.c.a(i17);
        this.f129646h = i38;
        this.f129647i = str;
        this.f129648j = str2;
    }
}
