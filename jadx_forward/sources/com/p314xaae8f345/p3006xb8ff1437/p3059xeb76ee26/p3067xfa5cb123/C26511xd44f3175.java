package com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3067xfa5cb123;

/* renamed from: com.tencent.thumbplayer.tmediacodec.statistics.MediaCodecStatistics */
/* loaded from: classes14.dex */
public class C26511xd44f3175 {

    /* renamed from: mIsReuse */
    private boolean f54211x1977863d;

    /* renamed from: mIsReuseHasSet */
    private boolean f54212x82808405;

    /* renamed from: mIsVideo */
    private boolean f54213x19b17444;

    /* renamed from: mLastTimeInMs */
    private long f54214xb53213db;

    /* renamed from: mReuseEnable */
    private boolean f54215x211ba26a;

    /* renamed from: mStatisticsMap */
    private final java.util.Map<java.lang.String, java.lang.Long> f54216x43b8cdcc = new java.util.HashMap();

    /* renamed from: mCacheResultData */
    private java.lang.String f54210x9457965c = "";

    public C26511xd44f3175(boolean z17) {
        this.f54213x19b17444 = z17;
    }

    /* renamed from: setIsReuse */
    private final void m103502x2c9d5ca8(boolean z17) {
        this.f54211x1977863d = z17;
        this.f54212x82808405 = true;
    }

    /* renamed from: setReuseEnable */
    private final void m103503xe74a4b55(boolean z17) {
        this.f54215x211ba26a = z17;
    }

    /* renamed from: configCodecEnd */
    public final void m103504xed58647(boolean z17) {
        m103502x2c9d5ca8(z17);
        this.f54216x43b8cdcc.put("configCodec", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f54214xb53213db));
    }

    /* renamed from: configCodecStart */
    public final void m103505xb05516ce(boolean z17) {
        m103503xe74a4b55(z17);
        this.f54214xb53213db = java.lang.System.currentTimeMillis();
    }

    /* renamed from: createByCodecEnd */
    public final void m103506xd5699c78() {
        this.f54216x43b8cdcc.put("createCodec", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f54214xb53213db));
    }

    /* renamed from: createByCodecStart */
    public final void m103507x223c64bf() {
        this.f54210x9457965c = "";
        this.f54216x43b8cdcc.clear();
        this.f54214xb53213db = java.lang.System.currentTimeMillis();
    }

    /* renamed from: getData */
    public final java.lang.String m103508xfb7e5820() {
        if (android.text.TextUtils.isEmpty(this.f54210x9457965c)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{\"isVideo\":");
            sb6.append(this.f54213x19b17444 + " ,");
            if (this.f54212x82808405) {
                sb6.append("\"isReuse\":");
                sb6.append(this.f54211x1977863d + " ,");
            }
            sb6.append("\"reuseEnable\":");
            sb6.append(this.f54215x211ba26a + " ,");
            long j17 = 0;
            for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry : this.f54216x43b8cdcc.entrySet()) {
                if (entry != null) {
                    j17 += entry.getValue().longValue();
                }
                sb6.append("\"" + ((java.lang.Object) entry.getKey()) + "\":");
                sb6.append(entry.getValue().longValue() + " ,");
            }
            sb6.append("\"totalCodec\":");
            sb6.append(j17);
            sb6.append("}");
            this.f54210x9457965c = sb6.toString();
        }
        return this.f54210x9457965c;
    }

    /* renamed from: startCodecEnd */
    public final void m103509xd3dda767() {
        this.f54216x43b8cdcc.put("startCodec", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f54214xb53213db));
    }

    /* renamed from: startCodecStart */
    public final void m103510x53d96fee() {
        this.f54214xb53213db = java.lang.System.currentTimeMillis();
    }
}
