package com.p314xaae8f345.tav.p2965xf0edce24.p2966x5f198493;

/* renamed from: com.tencent.tav.extractor.wrapper.ExtractorWrapper */
/* loaded from: classes16.dex */
public class C25826xf84f21ef {

    /* renamed from: duration */
    private long f48560x89444d94;

    /* renamed from: lastUpdateTime */
    private long f48561xfad31e6c;

    /* renamed from: preferRotation */
    private int f48562xcc7d15ae;

    /* renamed from: videoPath */
    private java.lang.String f48563x4f713740;

    /* renamed from: videoSize */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 f48564x4f72b31c;

    public C25826xf84f21ef(java.lang.String str) {
        this.f48563x4f713740 = str;
    }

    /* renamed from: exit */
    private boolean m97995x2fb91e() {
        return !android.text.TextUtils.isEmpty(this.f48563x4f713740) && new java.io.File(this.f48563x4f713740).exists();
    }

    /* renamed from: loadWith */
    private void m97996x6e0306cc(com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34) {
        this.f48560x89444d94 = c25820xcadb1d34.m97961x51e8b0a();
        this.f48564x4f72b31c = c25820xcadb1d34.m97966xfb854877();
        this.f48562xcc7d15ae = c25820xcadb1d34.m97962xbb14e2a4();
        this.f48561xfad31e6c = new java.io.File(this.f48563x4f713740).lastModified();
    }

    /* renamed from: needReload */
    private boolean m97997xae03adcf() {
        return this.f48561xfad31e6c != new java.io.File(this.f48563x4f713740).lastModified();
    }

    /* renamed from: checkAndLoad */
    public void m97998xc8f96935(com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34) {
        if (m97995x2fb91e() && m97997xae03adcf()) {
            m97996x6e0306cc(c25820xcadb1d34);
        }
    }

    /* renamed from: getDuration */
    public long m97999x51e8b0a() {
        return this.f48560x89444d94;
    }

    /* renamed from: getPreferRotation */
    public int m98000xbb14e2a4() {
        return this.f48562xcc7d15ae;
    }

    /* renamed from: getVideoPath */
    public java.lang.String m98001x4edea88a() {
        return this.f48563x4f713740;
    }

    /* renamed from: getVideoSize */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m98002x4ee02466() {
        return this.f48564x4f72b31c;
    }
}
