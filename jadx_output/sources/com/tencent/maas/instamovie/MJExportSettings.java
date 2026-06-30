package com.tencent.maas.instamovie;

/* loaded from: classes5.dex */
public class MJExportSettings {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.instamovie.mediafoundation.FrameRate f48106a;

    /* renamed from: b, reason: collision with root package name */
    public final int f48107b;

    /* renamed from: c, reason: collision with root package name */
    public final int f48108c;

    /* renamed from: d, reason: collision with root package name */
    public final rg.e f48109d;

    /* renamed from: e, reason: collision with root package name */
    public final rg.a f48110e;

    /* renamed from: f, reason: collision with root package name */
    public final rg.d f48111f;

    /* renamed from: g, reason: collision with root package name */
    public final rg.c f48112g;

    /* renamed from: h, reason: collision with root package name */
    public final int f48113h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f48114i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f48115j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f48116k;

    /* renamed from: l, reason: collision with root package name */
    public int f48117l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTime f48118m;

    /* renamed from: n, reason: collision with root package name */
    public float f48119n;

    /* renamed from: o, reason: collision with root package name */
    public float f48120o;

    /* renamed from: p, reason: collision with root package name */
    public rg.b f48121p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.Map f48122q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f48123r;

    public MJExportSettings(com.tencent.maas.instamovie.mediafoundation.FrameRate frameRate, int i17, int i18, rg.e eVar, rg.a aVar, rg.d dVar, rg.c cVar, int i19) {
        this.f48106a = frameRate;
        this.f48107b = i17;
        this.f48108c = i18;
        this.f48109d = eVar;
        this.f48110e = aVar;
        this.f48111f = dVar;
        this.f48112g = cVar;
        this.f48113h = i19;
        this.f48114i = "";
        this.f48115j = null;
        this.f48116k = false;
        this.f48117l = 15;
        this.f48118m = com.tencent.maas.model.time.MJTime.fromSeconds(5.0d);
        this.f48119n = 0.0f;
        this.f48120o = Float.POSITIVE_INFINITY;
        this.f48121p = rg.b.None;
    }

    public static com.tencent.maas.instamovie.MJExportSettings getDefault1080pSettings() {
        return new com.tencent.maas.instamovie.MJExportSettings(com.tencent.maas.instamovie.mediafoundation.FrameRate.f48196e, 300000, com.tencent.tav.decoder.EncoderWriter.OUTPUT_AUDIO_BIT_RATE, rg.e.H264, rg.a.MPEG4AAC, rg.d.MP4, rg.c.DIMENSION_LEVEL_1080, 30);
    }

    public static com.tencent.maas.instamovie.MJExportSettings getHEVC1080pSettings() {
        return new com.tencent.maas.instamovie.MJExportSettings(com.tencent.maas.instamovie.mediafoundation.FrameRate.f48196e, 300000, com.tencent.tav.decoder.EncoderWriter.OUTPUT_AUDIO_BIT_RATE, rg.e.HEVC, rg.a.MPEG4AAC, rg.d.MP4, rg.c.DIMENSION_LEVEL_1080, 30);
    }

    public int getAudioCodecID() {
        return this.f48110e.f395136d;
    }

    public int getAverageAudioBitRate() {
        return this.f48108c;
    }

    public int getChecksumType() {
        return this.f48121p.f395140d;
    }

    public java.lang.String getCopyrightMetadata() {
        return this.f48115j;
    }

    public float getCoverImageClarityThreshold() {
        return this.f48120o;
    }

    public float getCoverImageDetectionDarknessRatioThreshold() {
        return this.f48119n;
    }

    public int getCoverImageDetectionFrameInterval() {
        return this.f48117l;
    }

    public com.tencent.maas.model.time.MJTime getCoverImageDetectionMaxDuration() {
        return this.f48118m;
    }

    public com.tencent.maas.instamovie.mediafoundation.FrameRate getFrameRate() {
        return this.f48106a;
    }

    public int getMaxKeyframeInterval() {
        return this.f48113h;
    }

    public int getMediaContainerType() {
        return this.f48111f.f395153d;
    }

    public java.util.Map<java.lang.String, java.lang.String> getMetaData() {
        return this.f48122q;
    }

    public int getVideoBitsPerFrame() {
        return this.f48107b;
    }

    public int getVideoCodecID() {
        return this.f48109d.f395158d;
    }

    public int getVideoDimensionLevel() {
        return this.f48112g.f395149d;
    }

    public java.lang.String getVideoEncoderName() {
        return this.f48114i;
    }

    public boolean isCoverImageDetectionEnabled() {
        return this.f48116k;
    }

    public boolean isUseMetadataTags() {
        return this.f48123r;
    }

    public MJExportSettings(com.tencent.maas.instamovie.mediafoundation.FrameRate frameRate, int i17, int i18, rg.e eVar, rg.a aVar, rg.d dVar, rg.c cVar, int i19, java.lang.String str) {
        this.f48106a = frameRate;
        this.f48107b = i17;
        this.f48108c = i18;
        this.f48109d = eVar;
        this.f48110e = aVar;
        this.f48111f = dVar;
        this.f48112g = cVar;
        this.f48113h = i19;
        this.f48114i = str;
        this.f48115j = null;
        this.f48116k = false;
        this.f48117l = 15;
        this.f48118m = com.tencent.maas.model.time.MJTime.fromSeconds(5.0d);
        this.f48119n = 0.0f;
        this.f48120o = Float.POSITIVE_INFINITY;
        this.f48121p = rg.b.None;
    }

    public MJExportSettings(com.tencent.maas.instamovie.mediafoundation.FrameRate frameRate, int i17, int i18, rg.e eVar, rg.a aVar, rg.d dVar, rg.c cVar, int i19, java.lang.String str, java.lang.String str2) {
        this.f48106a = frameRate;
        this.f48107b = i17;
        this.f48108c = i18;
        this.f48109d = eVar;
        this.f48110e = aVar;
        this.f48111f = dVar;
        this.f48112g = cVar;
        this.f48113h = i19;
        this.f48114i = str;
        this.f48115j = str2;
        this.f48116k = false;
        this.f48117l = 15;
        this.f48118m = com.tencent.maas.model.time.MJTime.fromSeconds(5.0d);
        this.f48119n = 0.0f;
        this.f48120o = Float.POSITIVE_INFINITY;
        this.f48121p = rg.b.None;
    }

    public MJExportSettings(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, java.lang.String str, java.lang.String str2) {
        com.tencent.maas.instamovie.mediafoundation.FrameRate.FrameRateType frameRateType = (com.tencent.maas.instamovie.mediafoundation.FrameRate.FrameRateType) ((java.util.HashMap) com.tencent.maas.instamovie.mediafoundation.FrameRate.FrameRateType.f48208o).get(java.lang.Integer.valueOf(i18));
        this.f48106a = new com.tencent.maas.instamovie.mediafoundation.FrameRate(frameRateType == null ? null : frameRateType);
        this.f48107b = i29;
        this.f48108c = i37;
        rg.e eVar = (rg.e) ((java.util.HashMap) rg.e.f395156g).get(java.lang.Integer.valueOf(i19));
        this.f48109d = eVar == null ? null : eVar;
        rg.a aVar = (rg.a) ((java.util.HashMap) rg.a.f395134f).get(java.lang.Integer.valueOf(i27));
        this.f48110e = aVar == null ? null : aVar;
        rg.d dVar = (rg.d) ((java.util.HashMap) rg.d.f395151f).get(java.lang.Integer.valueOf(i28));
        this.f48111f = dVar != null ? dVar : null;
        this.f48112g = rg.c.a(i17);
        this.f48113h = i38;
        this.f48114i = str;
        this.f48115j = str2;
    }
}
