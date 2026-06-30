package com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae;

/* renamed from: com.tencent.tav.core.parallel.info.PipelineWorkInfo */
/* loaded from: classes15.dex */
public class C25720x10844041 {

    /* renamed from: PIPELINE_TYPE_AUDIO */
    public static final int f47720x7b73dc2e = 2;

    /* renamed from: PIPELINE_TYPE_VIDEO */
    public static final int f47721x7c9654d3 = 1;

    /* renamed from: assetWriter */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25666xb4e42f63 f47722x517a8783;

    /* renamed from: indicator */
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb f47723xd58fbe0f;

    /* renamed from: readerOutput */
    public com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 f47724xbdb87fa4;

    /* renamed from: thread */
    public android.os.HandlerThread f47725xcbe10e0a;

    /* renamed from: type */
    public int f47726x368f3a;

    /* renamed from: writerInput */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 f47727x86b39317;

    public C25720x10844041(int i17, com.p314xaae8f345.tav.p2947x2eaf9f.AbstractC25664x249c1694 abstractC25664x249c1694, com.p314xaae8f345.tav.p2947x2eaf9f.C25667x9a895e27 c25667x9a895e27, android.os.HandlerThread handlerThread, com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb c25719xdaa2a3bb) {
        this.f47726x368f3a = i17;
        this.f47724xbdb87fa4 = abstractC25664x249c1694;
        this.f47727x86b39317 = c25667x9a895e27;
        this.f47725xcbe10e0a = handlerThread;
        m97040x3150efcd(c25719xdaa2a3bb);
    }

    /* renamed from: getIndicator */
    public com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb m97038xd4fd2f59() {
        return this.f47723xd58fbe0f;
    }

    /* renamed from: reuseWork */
    public void m97039xf97f07a5(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25720x10844041 c25720x10844041) {
        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb c25719xdaa2a3bb = c25720x10844041.f47723xd58fbe0f;
        c25720x10844041.f47723xd58fbe0f = this.f47723xd58fbe0f;
        this.f47723xd58fbe0f = c25719xdaa2a3bb;
        c25719xdaa2a3bb.m97034x17b80bc3(com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e.AssetParallelStatusStarted);
    }

    /* renamed from: setIndicator */
    public void m97040x3150efcd(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb c25719xdaa2a3bb) {
        this.f47723xd58fbe0f = c25719xdaa2a3bb;
        c25719xdaa2a3bb.m97034x17b80bc3(com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e.AssetParallelStatusPrepared);
    }

    /* renamed from: toString */
    public java.lang.String m97041x9616526c() {
        java.util.Locale locale = java.util.Locale.ENGLISH;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(hashCode());
        objArr[1] = this.f47726x368f3a == 1 ? "video" : "audio";
        objArr[2] = java.lang.Integer.valueOf(this.f47723xd58fbe0f.m97027x7498cf1c());
        objArr[3] = java.lang.Long.valueOf(this.f47723xd58fbe0f.f47717x16fae70.m97261xccb87a6a() / 1000);
        objArr[4] = java.lang.Long.valueOf(this.f47723xd58fbe0f.f47717x16fae70.m97259x74606f23() / 1000);
        return java.lang.String.format(locale, "[hash:%d]type:%s  segment index:%d  time[%d,%d]", objArr);
    }
}
