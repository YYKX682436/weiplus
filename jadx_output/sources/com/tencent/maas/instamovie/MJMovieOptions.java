package com.tencent.maas.instamovie;

/* loaded from: classes5.dex */
public class MJMovieOptions {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f48124a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48125b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f48126c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f48127d;

    /* renamed from: e, reason: collision with root package name */
    public final float f48128e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f48129f;

    /* renamed from: g, reason: collision with root package name */
    public final rg.c f48130g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f48131h;

    /* renamed from: i, reason: collision with root package name */
    public final float f48132i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTime f48133j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f48134k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f48135l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f48136m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTime f48137n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f48138o;

    /* renamed from: p, reason: collision with root package name */
    public java.nio.ByteBuffer f48139p;

    public MJMovieOptions(boolean z17, boolean z18, boolean z19) {
        this.f48134k = false;
        this.f48135l = false;
        this.f48136m = false;
        com.tencent.maas.model.time.MJTime mJTime = com.tencent.maas.model.time.MJTime.PositiveInfinityTime;
        this.f48137n = mJTime;
        this.f48138o = java.util.Collections.emptyList();
        this.f48124a = z17;
        this.f48125b = z18;
        this.f48126c = z19;
        this.f48127d = false;
        this.f48128e = 0.0f;
        this.f48129f = true;
        this.f48130g = null;
        this.f48131h = true;
        this.f48132i = Float.POSITIVE_INFINITY;
        this.f48133j = mJTime;
        this.f48139p = null;
    }

    private boolean hasVideoTranscodingOptimDimensionLevel() {
        return this.f48130g != null;
    }

    private int videoTranscodingOptimDimensionLevel() {
        rg.c cVar = this.f48130g;
        if (cVar == null) {
            return -1;
        }
        return cVar.f395149d;
    }

    public float blankTemplatePreviewOffsetPercent() {
        return this.f48128e;
    }

    public java.nio.ByteBuffer getClientBuffer() {
        return this.f48139p;
    }

    public java.util.List<java.lang.String> getDefaultTemplateIDs() {
        return this.f48138o;
    }

    public com.tencent.maas.model.time.MJTime getMaxDuration() {
        return this.f48133j;
    }

    public com.tencent.maas.model.time.MJTime getRetainOriginalMediaDurationThreshold() {
        return this.f48137n;
    }

    public boolean isAIAnalysisEnabled() {
        return this.f48131h;
    }

    public boolean isBGMMuted() {
        return this.f48126c;
    }

    public boolean isLyricEnabled() {
        return this.f48124a;
    }

    public boolean isOSTMuted() {
        return this.f48125b;
    }

    public boolean isVideoTranscodingOptimEnabled() {
        return this.f48129f;
    }

    public float preprocTimeoutLimitSeconds() {
        return this.f48132i;
    }

    public void setClientBuffer(java.nio.ByteBuffer byteBuffer) {
        this.f48139p = byteBuffer;
    }

    public void setDefaultTemplateIDs(java.util.List<java.lang.String> list) {
        this.f48138o = list;
    }

    public void setMaxDuration(com.tencent.maas.model.time.MJTime mJTime) {
        this.f48133j = mJTime;
    }

    public void setRetainOriginalMediaDurationThreshold(com.tencent.maas.model.time.MJTime mJTime) {
        this.f48137n = mJTime;
    }

    public void setShouldAutoRecommendBGM(boolean z17) {
        this.f48135l = z17;
    }

    public void setShouldRecommendBGMForRecommendedTemplates(boolean z17) {
        this.f48134k = z17;
    }

    public void setShouldRetainOriginalMediaDuration(boolean z17) {
        this.f48136m = z17;
    }

    public boolean shouldAdjustBlankTemplatePreviewOffset() {
        return this.f48127d;
    }

    public boolean shouldAutoRecommendBGM() {
        return this.f48135l;
    }

    public boolean shouldRecommendBGMForRecommendedTemplates() {
        return this.f48134k;
    }

    public boolean shouldRetainOriginalMediaDuration() {
        return this.f48136m;
    }

    public MJMovieOptions(boolean z17, boolean z18, boolean z19, boolean z27, float f17) {
        this.f48134k = false;
        this.f48135l = false;
        this.f48136m = false;
        com.tencent.maas.model.time.MJTime mJTime = com.tencent.maas.model.time.MJTime.PositiveInfinityTime;
        this.f48137n = mJTime;
        this.f48138o = java.util.Collections.emptyList();
        this.f48124a = z17;
        this.f48125b = z18;
        this.f48126c = z19;
        this.f48127d = z27;
        this.f48128e = f17;
        this.f48129f = true;
        this.f48130g = null;
        this.f48131h = true;
        this.f48132i = Float.POSITIVE_INFINITY;
        this.f48133j = mJTime;
        this.f48139p = null;
    }

    public MJMovieOptions(boolean z17, boolean z18, boolean z19, boolean z27, float f17, boolean z28, rg.c cVar, boolean z29, float f18) {
        this.f48134k = false;
        this.f48135l = false;
        this.f48136m = false;
        com.tencent.maas.model.time.MJTime mJTime = com.tencent.maas.model.time.MJTime.PositiveInfinityTime;
        this.f48137n = mJTime;
        this.f48138o = java.util.Collections.emptyList();
        this.f48124a = z17;
        this.f48125b = z18;
        this.f48126c = z19;
        this.f48127d = z27;
        this.f48128e = f17;
        this.f48129f = z28;
        this.f48130g = cVar;
        this.f48131h = z29;
        this.f48132i = f18;
        this.f48133j = mJTime;
        this.f48139p = null;
    }

    private MJMovieOptions(boolean z17, boolean z18, boolean z19, boolean z27, float f17, boolean z28, int i17, boolean z29, float f18) {
        this.f48134k = false;
        this.f48135l = false;
        this.f48136m = false;
        com.tencent.maas.model.time.MJTime mJTime = com.tencent.maas.model.time.MJTime.PositiveInfinityTime;
        this.f48137n = mJTime;
        this.f48138o = java.util.Collections.emptyList();
        this.f48124a = z17;
        this.f48125b = z18;
        this.f48126c = z19;
        this.f48127d = z27;
        this.f48128e = f17;
        this.f48129f = z28;
        this.f48130g = i17 == -1 ? null : rg.c.a(i17);
        this.f48131h = z29;
        this.f48132i = f18;
        this.f48133j = mJTime;
        this.f48139p = null;
    }

    private MJMovieOptions(boolean z17, boolean z18, boolean z19, boolean z27, float f17, boolean z28, int i17, boolean z29, float f18, com.tencent.maas.model.time.MJTime mJTime, boolean z37, boolean z38, boolean z39, com.tencent.maas.model.time.MJTime mJTime2, java.lang.String[] strArr) {
        this.f48134k = false;
        this.f48135l = false;
        this.f48136m = false;
        this.f48137n = com.tencent.maas.model.time.MJTime.PositiveInfinityTime;
        this.f48138o = java.util.Collections.emptyList();
        this.f48124a = z17;
        this.f48125b = z18;
        this.f48126c = z19;
        this.f48127d = z27;
        this.f48128e = f17;
        this.f48129f = z28;
        this.f48130g = i17 == -1 ? null : rg.c.a(i17);
        this.f48131h = z29;
        this.f48132i = f18;
        this.f48133j = mJTime;
        this.f48134k = z37;
        this.f48135l = z38;
        this.f48136m = z39;
        this.f48137n = mJTime2;
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        java.util.Collections.addAll(arrayList, strArr);
        this.f48138o = arrayList;
        this.f48139p = null;
    }

    private MJMovieOptions(boolean z17, boolean z18, boolean z19, boolean z27, float f17, boolean z28, int i17, boolean z29, float f18, com.tencent.maas.model.time.MJTime mJTime, boolean z37, boolean z38, boolean z39, com.tencent.maas.model.time.MJTime mJTime2, java.lang.String[] strArr, java.nio.ByteBuffer byteBuffer) {
        this.f48134k = false;
        this.f48135l = false;
        this.f48136m = false;
        this.f48137n = com.tencent.maas.model.time.MJTime.PositiveInfinityTime;
        this.f48138o = java.util.Collections.emptyList();
        this.f48124a = z17;
        this.f48125b = z18;
        this.f48126c = z19;
        this.f48127d = z27;
        this.f48128e = f17;
        this.f48129f = z28;
        this.f48130g = i17 == -1 ? null : rg.c.a(i17);
        this.f48131h = z29;
        this.f48132i = f18;
        this.f48133j = mJTime;
        this.f48134k = z37;
        this.f48135l = z38;
        this.f48136m = z39;
        this.f48137n = mJTime2;
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        java.util.Collections.addAll(arrayList, strArr);
        this.f48138o = arrayList;
        this.f48139p = byteBuffer;
    }
}
