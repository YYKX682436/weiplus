package com.p314xaae8f345.tav.p2957xa228aba5;

/* renamed from: com.tencent.tav.coremedia.CMPerformance */
/* loaded from: classes15.dex */
public class C25733xc7e62966 {

    /* renamed from: endMs */
    private long f47834x5c2c7e1;

    /* renamed from: nextNode */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966 f47835x54e3fb95;

    /* renamed from: preNodes */
    public java.util.ArrayList<com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966> f47836xb1e29dce;

    /* renamed from: stage */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage f47837x68ac2fe;

    /* renamed from: startMs */
    private long f47838x8eeb3da8;

    /* renamed from: com.tencent.tav.coremedia.CMPerformance$CMPerformanceStage */
    /* loaded from: classes15.dex */
    public enum CMPerformanceStage {
        DEFAULT,
        EXTRACTOR,
        DECODE_WAIT,
        DECODE_JUMP,
        DECODE_CACHE,
        DECODE,
        RENDER,
        ENCODE_RENDER_CLEAR,
        ENCODE_RENDER,
        ENCODE_SWAP_BUFFER,
        ENCODE,
        ENCODE_WAIT
    }

    public C25733xc7e62966() {
        this.f47837x68ac2fe = com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage.DEFAULT;
        this.f47838x8eeb3da8 = -1L;
        this.f47834x5c2c7e1 = -1L;
        this.f47836xb1e29dce = new java.util.ArrayList<>();
    }

    /* renamed from: addPreNode */
    public void m97180x5eb42364(com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966 c25733xc7e62966) {
        this.f47836xb1e29dce.add(c25733xc7e62966);
    }

    /* renamed from: costMs */
    public long m97181xaf41fa53() {
        return this.f47834x5c2c7e1 - this.f47838x8eeb3da8;
    }

    /* renamed from: getNextNode */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966 m97182xd0be390b() {
        return this.f47835x54e3fb95;
    }

    /* renamed from: markEnd */
    public void m97183x32057ace() {
        this.f47834x5c2c7e1 = java.lang.System.currentTimeMillis();
    }

    /* renamed from: markStart */
    public void m97184xc75a0595() {
        this.f47838x8eeb3da8 = java.lang.System.currentTimeMillis();
    }

    /* renamed from: setNextNode */
    public void m97185xcb769a17(com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966 c25733xc7e62966) {
        this.f47835x54e3fb95 = c25733xc7e62966;
    }

    /* renamed from: stageValid */
    public boolean m97186x42370b9e() {
        return this.f47837x68ac2fe != com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage.DEFAULT;
    }

    /* renamed from: toString */
    public java.lang.String m97187x9616526c() {
        return "CMPerformance{stage=" + this.f47837x68ac2fe + ", startMs=" + this.f47838x8eeb3da8 + ", endMs=" + this.f47834x5c2c7e1 + '}';
    }

    public C25733xc7e62966(com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage cMPerformanceStage) {
        this.f47837x68ac2fe = com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage.DEFAULT;
        this.f47838x8eeb3da8 = -1L;
        this.f47834x5c2c7e1 = -1L;
        this.f47836xb1e29dce = new java.util.ArrayList<>();
        this.f47837x68ac2fe = cMPerformanceStage;
    }
}
