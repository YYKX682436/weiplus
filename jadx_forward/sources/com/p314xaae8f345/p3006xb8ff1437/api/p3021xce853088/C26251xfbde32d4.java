package com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088;

/* renamed from: com.tencent.thumbplayer.api.richmedia.TPRichMediaFeatureData */
/* loaded from: classes16.dex */
public class C26251xfbde32d4 {

    /* renamed from: mEnv */
    private final java.lang.String f51353x329d40;

    /* renamed from: mFeatureContentList */
    private final java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26251xfbde32d4.TPRichMediaFeatureContent> f51354x1a25a72e = new java.util.ArrayList();

    /* renamed from: mFeatureType */
    private final java.lang.String f51355x939524a3;

    /* renamed from: mVersion */
    private final java.lang.String f51356xb30dcfab;

    /* renamed from: com.tencent.thumbplayer.api.richmedia.TPRichMediaFeatureData$TPRichMediaFeatureContent */
    /* loaded from: classes16.dex */
    public static class TPRichMediaFeatureContent {

        /* renamed from: mContent */
        private java.lang.String f51357xd6cfe74c;

        /* renamed from: mEndTimeMs */
        private long f51358xdbb94c21;

        /* renamed from: mStartTimeMs */
        private long f51359x3be94da8;

        public TPRichMediaFeatureContent(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26439x15a9e08b.TPNativeRichMediaFeatureContent tPNativeRichMediaFeatureContent) {
            this.f51359x3be94da8 = -1L;
            this.f51358xdbb94c21 = -1L;
            this.f51357xd6cfe74c = "";
            this.f51359x3be94da8 = tPNativeRichMediaFeatureContent.m102850x6bb2831f();
            this.f51358xdbb94c21 = tPNativeRichMediaFeatureContent.m102849x606f7358();
            this.f51357xd6cfe74c = tPNativeRichMediaFeatureContent.m102848x76847043();
        }

        /* renamed from: getContent */
        public java.lang.String m101537x76847043() {
            return this.f51357xd6cfe74c;
        }

        /* renamed from: getEndTimeMs */
        public long m101538x606f7358() {
            return this.f51358xdbb94c21;
        }

        /* renamed from: getStartTimeMs */
        public long m101539x6bb2831f() {
            return this.f51359x3be94da8;
        }
    }

    public C26251xfbde32d4(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26439x15a9e08b c26439x15a9e08b) {
        this.f51355x939524a3 = c26439x15a9e08b.m102842xc35e5a1a();
        this.f51353x329d40 = c26439x15a9e08b.m102840xb58839b7();
        this.f51356xb30dcfab = c26439x15a9e08b.m102843x52c258a2();
        if (c26439x15a9e08b.m102841xe0b6b5fa() != null) {
            for (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3046xce853088.C26439x15a9e08b.TPNativeRichMediaFeatureContent tPNativeRichMediaFeatureContent : c26439x15a9e08b.m102841xe0b6b5fa()) {
                this.f51354x1a25a72e.add(new com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26251xfbde32d4.TPRichMediaFeatureContent(tPNativeRichMediaFeatureContent));
            }
        }
    }

    /* renamed from: getEnv */
    public java.lang.String m101533xb58839b7() {
        return this.f51353x329d40;
    }

    /* renamed from: getFeatureContentList */
    public java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.C26251xfbde32d4.TPRichMediaFeatureContent> m101534x2e32add7() {
        return this.f51354x1a25a72e;
    }

    /* renamed from: getFeatureType */
    public java.lang.String m101535xc35e5a1a() {
        return this.f51355x939524a3;
    }

    /* renamed from: getVersion */
    public java.lang.String m101536x52c258a2() {
        return this.f51356xb30dcfab;
    }
}
