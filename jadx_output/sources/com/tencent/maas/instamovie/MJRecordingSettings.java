package com.tencent.maas.instamovie;

/* loaded from: classes5.dex */
public class MJRecordingSettings {

    /* renamed from: a, reason: collision with root package name */
    public final rg.e f48146a;

    /* renamed from: b, reason: collision with root package name */
    public final rg.a f48147b;

    /* renamed from: c, reason: collision with root package name */
    public final rg.d f48148c;

    /* renamed from: d, reason: collision with root package name */
    public final rg.c f48149d;

    /* renamed from: e, reason: collision with root package name */
    public final int f48150e;

    /* renamed from: f, reason: collision with root package name */
    public final int f48151f;

    /* renamed from: g, reason: collision with root package name */
    public final int f48152g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f48153h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.Map f48154i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f48155j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.maas.instamovie.d f48156k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f48157l;

    /* renamed from: m, reason: collision with root package name */
    public int f48158m;

    /* renamed from: n, reason: collision with root package name */
    public rg.b f48159n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f48160o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f48161p;

    public MJRecordingSettings(rg.e eVar, rg.a aVar, rg.d dVar, rg.c cVar, int i17, int i18, int i19) {
        this.f48153h = com.tencent.maas.model.time.MJTime.PositiveInfinityTime;
        this.f48156k = com.tencent.maas.instamovie.d.FollowTemplate;
        this.f48157l = true;
        this.f48159n = rg.b.None;
        this.f48160o = false;
        this.f48161p = false;
        this.f48146a = eVar;
        this.f48147b = aVar;
        this.f48148c = dVar;
        this.f48149d = cVar;
        this.f48150e = i17;
        this.f48151f = i18;
        this.f48152g = i19;
    }

    public static com.tencent.maas.instamovie.MJRecordingSettings getDefault1080pSettings() {
        return new com.tencent.maas.instamovie.MJRecordingSettings(rg.e.H264, rg.a.MPEG4AAC, rg.d.MP4, rg.c.DIMENSION_LEVEL_1080, 300000, com.tencent.tav.decoder.EncoderWriter.OUTPUT_AUDIO_BIT_RATE, 30);
    }

    public int getAudioCodecID() {
        return this.f48147b.f395136d;
    }

    public int getAverageAudioBitRate() {
        return this.f48151f;
    }

    public com.tencent.maas.instamovie.d getCamOSTMode() {
        return this.f48156k;
    }

    public int getCamOSTModeValue() {
        return this.f48156k.f48189d;
    }

    public int getChecksumType() {
        return this.f48159n.f395140d;
    }

    public int getMaxKeyframeInterval() {
        return this.f48152g;
    }

    public com.tencent.maas.model.time.MJTime getMaxRecordingDuration() {
        return this.f48153h;
    }

    public int getMediaContainerType() {
        return this.f48148c.f395153d;
    }

    public java.util.Map<java.lang.String, java.lang.String> getMetaData() {
        return this.f48154i;
    }

    public int getVideoBitsPerFrame() {
        return this.f48150e;
    }

    public int getVideoCWAngle() {
        return this.f48158m;
    }

    public int getVideoCodecID() {
        return this.f48146a.f395158d;
    }

    public int getVideoDimensionLevel() {
        return this.f48149d.f395149d;
    }

    public boolean isDisableExportingAtPreviewing() {
        return this.f48160o;
    }

    public boolean isExportPhoto() {
        return this.f48161p;
    }

    public boolean isGenerateCoverImage() {
        return false;
    }

    public boolean isOutputMixedWithBGM() {
        return this.f48157l;
    }

    public boolean isUseMetadataTags() {
        return this.f48155j;
    }

    public MJRecordingSettings(rg.e eVar, rg.a aVar, rg.d dVar, rg.c cVar, int i17, int i18, int i19, com.tencent.maas.model.time.MJTime mJTime) {
        this.f48153h = com.tencent.maas.model.time.MJTime.PositiveInfinityTime;
        this.f48156k = com.tencent.maas.instamovie.d.FollowTemplate;
        this.f48157l = true;
        this.f48159n = rg.b.None;
        this.f48160o = false;
        this.f48161p = false;
        this.f48146a = eVar;
        this.f48147b = aVar;
        this.f48148c = dVar;
        this.f48149d = cVar;
        this.f48150e = i17;
        this.f48151f = i18;
        this.f48152g = i19;
        this.f48153h = mJTime;
    }
}
