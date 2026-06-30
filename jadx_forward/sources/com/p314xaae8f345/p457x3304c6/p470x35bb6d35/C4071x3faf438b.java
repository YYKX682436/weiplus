package com.p314xaae8f345.p457x3304c6.p470x35bb6d35;

/* renamed from: com.tencent.maas.instamovie.MJMovieOptions */
/* loaded from: classes5.dex */
public class C4071x3faf438b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f129657a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f129658b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f129659c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f129660d;

    /* renamed from: e, reason: collision with root package name */
    public final float f129661e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f129662f;

    /* renamed from: g, reason: collision with root package name */
    public final rg.c f129663g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f129664h;

    /* renamed from: i, reason: collision with root package name */
    public final float f129665i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f129666j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f129667k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f129668l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f129669m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f129670n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f129671o;

    /* renamed from: p, reason: collision with root package name */
    public java.nio.ByteBuffer f129672p;

    public C4071x3faf438b(boolean z17, boolean z18, boolean z19) {
        this.f129667k = false;
        this.f129668l = false;
        this.f129669m = false;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16097xacdfd1ce;
        this.f129670n = c4128x879fba0a;
        this.f129671o = java.util.Collections.emptyList();
        this.f129657a = z17;
        this.f129658b = z18;
        this.f129659c = z19;
        this.f129660d = false;
        this.f129661e = 0.0f;
        this.f129662f = true;
        this.f129663g = null;
        this.f129664h = true;
        this.f129665i = Float.POSITIVE_INFINITY;
        this.f129666j = c4128x879fba0a;
        this.f129672p = null;
    }

    /* renamed from: hasVideoTranscodingOptimDimensionLevel */
    private boolean m33195xc2a719a4() {
        return this.f129663g != null;
    }

    /* renamed from: videoTranscodingOptimDimensionLevel */
    private int m33196x6931fa9e() {
        rg.c cVar = this.f129663g;
        if (cVar == null) {
            return -1;
        }
        return cVar.f476682d;
    }

    /* renamed from: blankTemplatePreviewOffsetPercent */
    public float m33197xe843ac58() {
        return this.f129661e;
    }

    /* renamed from: getClientBuffer */
    public java.nio.ByteBuffer m33198xee94c261() {
        return this.f129672p;
    }

    /* renamed from: getDefaultTemplateIDs */
    public java.util.List<java.lang.String> m33199xbea5b4f3() {
        return this.f129671o;
    }

    /* renamed from: getMaxDuration */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33200xdc3cf9e2() {
        return this.f129666j;
    }

    /* renamed from: getRetainOriginalMediaDurationThreshold */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33201xb91f1bbf() {
        return this.f129670n;
    }

    /* renamed from: isAIAnalysisEnabled */
    public boolean m33202x8d554793() {
        return this.f129664h;
    }

    /* renamed from: isBGMMuted */
    public boolean m33203xc89e6ccd() {
        return this.f129659c;
    }

    /* renamed from: isLyricEnabled */
    public boolean m33204x39cb982c() {
        return this.f129657a;
    }

    /* renamed from: isOSTMuted */
    public boolean m33205x95ca6785() {
        return this.f129658b;
    }

    /* renamed from: isVideoTranscodingOptimEnabled */
    public boolean m33206x911b18ab() {
        return this.f129662f;
    }

    /* renamed from: preprocTimeoutLimitSeconds */
    public float m33207x4f68e50c() {
        return this.f129665i;
    }

    /* renamed from: setClientBuffer */
    public void m33208x24ddbd6d(java.nio.ByteBuffer byteBuffer) {
        this.f129672p = byteBuffer;
    }

    /* renamed from: setDefaultTemplateIDs */
    public void m33209x55d136ff(java.util.List<java.lang.String> list) {
        this.f129671o = list;
    }

    /* renamed from: setMaxDuration */
    public void m33210x72a26d56(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a) {
        this.f129666j = c4128x879fba0a;
    }

    /* renamed from: setRetainOriginalMediaDurationThreshold */
    public void m33211x252ab2cb(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a) {
        this.f129670n = c4128x879fba0a;
    }

    /* renamed from: setShouldAutoRecommendBGM */
    public void m33212x8b8b3090(boolean z17) {
        this.f129668l = z17;
    }

    /* renamed from: setShouldRecommendBGMForRecommendedTemplates */
    public void m33213x4d7a6c86(boolean z17) {
        this.f129667k = z17;
    }

    /* renamed from: setShouldRetainOriginalMediaDuration */
    public void m33214xe2f4b54d(boolean z17) {
        this.f129669m = z17;
    }

    /* renamed from: shouldAdjustBlankTemplatePreviewOffset */
    public boolean m33215x9b66cfef() {
        return this.f129660d;
    }

    /* renamed from: shouldAutoRecommendBGM */
    public boolean m33216xef791d8e() {
        return this.f129668l;
    }

    /* renamed from: shouldRecommendBGMForRecommendedTemplates */
    public boolean m33217x849fb2c8() {
        return this.f129667k;
    }

    /* renamed from: shouldRetainOriginalMediaDuration */
    public boolean m33218x1f9d5d8f() {
        return this.f129669m;
    }

    public C4071x3faf438b(boolean z17, boolean z18, boolean z19, boolean z27, float f17) {
        this.f129667k = false;
        this.f129668l = false;
        this.f129669m = false;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16097xacdfd1ce;
        this.f129670n = c4128x879fba0a;
        this.f129671o = java.util.Collections.emptyList();
        this.f129657a = z17;
        this.f129658b = z18;
        this.f129659c = z19;
        this.f129660d = z27;
        this.f129661e = f17;
        this.f129662f = true;
        this.f129663g = null;
        this.f129664h = true;
        this.f129665i = Float.POSITIVE_INFINITY;
        this.f129666j = c4128x879fba0a;
        this.f129672p = null;
    }

    public C4071x3faf438b(boolean z17, boolean z18, boolean z19, boolean z27, float f17, boolean z28, rg.c cVar, boolean z29, float f18) {
        this.f129667k = false;
        this.f129668l = false;
        this.f129669m = false;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16097xacdfd1ce;
        this.f129670n = c4128x879fba0a;
        this.f129671o = java.util.Collections.emptyList();
        this.f129657a = z17;
        this.f129658b = z18;
        this.f129659c = z19;
        this.f129660d = z27;
        this.f129661e = f17;
        this.f129662f = z28;
        this.f129663g = cVar;
        this.f129664h = z29;
        this.f129665i = f18;
        this.f129666j = c4128x879fba0a;
        this.f129672p = null;
    }

    private C4071x3faf438b(boolean z17, boolean z18, boolean z19, boolean z27, float f17, boolean z28, int i17, boolean z29, float f18) {
        this.f129667k = false;
        this.f129668l = false;
        this.f129669m = false;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16097xacdfd1ce;
        this.f129670n = c4128x879fba0a;
        this.f129671o = java.util.Collections.emptyList();
        this.f129657a = z17;
        this.f129658b = z18;
        this.f129659c = z19;
        this.f129660d = z27;
        this.f129661e = f17;
        this.f129662f = z28;
        this.f129663g = i17 == -1 ? null : rg.c.a(i17);
        this.f129664h = z29;
        this.f129665i = f18;
        this.f129666j = c4128x879fba0a;
        this.f129672p = null;
    }

    private C4071x3faf438b(boolean z17, boolean z18, boolean z19, boolean z27, float f17, boolean z28, int i17, boolean z29, float f18, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, boolean z37, boolean z38, boolean z39, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2, java.lang.String[] strArr) {
        this.f129667k = false;
        this.f129668l = false;
        this.f129669m = false;
        this.f129670n = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16097xacdfd1ce;
        this.f129671o = java.util.Collections.emptyList();
        this.f129657a = z17;
        this.f129658b = z18;
        this.f129659c = z19;
        this.f129660d = z27;
        this.f129661e = f17;
        this.f129662f = z28;
        this.f129663g = i17 == -1 ? null : rg.c.a(i17);
        this.f129664h = z29;
        this.f129665i = f18;
        this.f129666j = c4128x879fba0a;
        this.f129667k = z37;
        this.f129668l = z38;
        this.f129669m = z39;
        this.f129670n = c4128x879fba0a2;
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        java.util.Collections.addAll(arrayList, strArr);
        this.f129671o = arrayList;
        this.f129672p = null;
    }

    private C4071x3faf438b(boolean z17, boolean z18, boolean z19, boolean z27, float f17, boolean z28, int i17, boolean z29, float f18, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, boolean z37, boolean z38, boolean z39, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2, java.lang.String[] strArr, java.nio.ByteBuffer byteBuffer) {
        this.f129667k = false;
        this.f129668l = false;
        this.f129669m = false;
        this.f129670n = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16097xacdfd1ce;
        this.f129671o = java.util.Collections.emptyList();
        this.f129657a = z17;
        this.f129658b = z18;
        this.f129659c = z19;
        this.f129660d = z27;
        this.f129661e = f17;
        this.f129662f = z28;
        this.f129663g = i17 == -1 ? null : rg.c.a(i17);
        this.f129664h = z29;
        this.f129665i = f18;
        this.f129666j = c4128x879fba0a;
        this.f129667k = z37;
        this.f129668l = z38;
        this.f129669m = z39;
        this.f129670n = c4128x879fba0a2;
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        java.util.Collections.addAll(arrayList, strArr);
        this.f129671o = arrayList;
        this.f129672p = byteBuffer;
    }
}
