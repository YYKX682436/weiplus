package org.p3343x72743996.p3360x5ff5cf14;

/* renamed from: org.chromium.support_lib_boundary.WebSettingsBoundaryInterface */
/* loaded from: classes6.dex */
public interface InterfaceC29671xebfe7178 {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: org.chromium.support_lib_boundary.WebSettingsBoundaryInterface$AttributionBehavior */
    /* loaded from: classes6.dex */
    public @interface AttributionBehavior {

        /* renamed from: APP_SOURCE_AND_APP_TRIGGER */
        public static final int f74937x9bb42ac = 3;

        /* renamed from: APP_SOURCE_AND_WEB_TRIGGER */
        public static final int f74938x3a7cb0df = 1;

        /* renamed from: DISABLED */
        public static final int f74939x3ecc2a7c = 0;

        /* renamed from: WEB_SOURCE_AND_WEB_TRIGGER */
        public static final int f74940xed00b64c = 2;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: org.chromium.support_lib_boundary.WebSettingsBoundaryInterface$ForceDarkBehavior */
    /* loaded from: classes6.dex */
    public @interface ForceDarkBehavior {

        /* renamed from: FORCE_DARK_ONLY */
        public static final int f74941xb13fee61 = 0;

        /* renamed from: MEDIA_QUERY_ONLY */
        public static final int f74942x5ce7f43e = 1;

        /* renamed from: PREFER_MEDIA_QUERY_OVER_FORCE_DARK */
        public static final int f74943xe3ca4734 = 2;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: org.chromium.support_lib_boundary.WebSettingsBoundaryInterface$WebAuthnSupport */
    /* loaded from: classes6.dex */
    public @interface WebAuthnSupport {
        public static final int APP = 1;

        /* renamed from: BROWSER */
        public static final int f74944x33cab708 = 2;

        /* renamed from: NONE */
        public static final int f74945x24a738 = 0;
    }

    /* renamed from: getAttributionBehavior */
    int m154401x390394bb();

    /* renamed from: getDisabledActionModeMenuItems */
    int m154402x30870356();

    /* renamed from: getEnterpriseAuthenticationAppLinkPolicyEnabled */
    boolean m154403xf7669003();

    /* renamed from: getForceDark */
    int m154404x5a79f24b();

    /* renamed from: getForceDarkBehavior */
    int m154405x505d8dbd();

    /* renamed from: getOffscreenPreRaster */
    boolean m154406x5f09f9b();

    /* renamed from: getRequestedWithHeaderOriginAllowList */
    java.util.Set<java.lang.String> m154407xd828edb6();

    /* renamed from: getSafeBrowsingEnabled */
    boolean m154408xb018e5f7();

    /* renamed from: getUserAgentMetadataMap */
    java.util.Map<java.lang.String, java.lang.Object> m154409xf539e5c9();

    /* renamed from: getWebAuthnSupport */
    int m154410x992aa867();

    /* renamed from: getWillSuppressErrorPage */
    boolean m154411x63955a1a();

    /* renamed from: isAlgorithmicDarkeningAllowed */
    boolean m154412x71e71fa4();

    /* renamed from: setAlgorithmicDarkeningAllowed */
    void m154413xb09ad6c(boolean z17);

    /* renamed from: setAttributionBehavior */
    void m154414x8748542f(int i17);

    /* renamed from: setDisabledActionModeMenuItems */
    void m154415x389f0eca(int i17);

    /* renamed from: setEnterpriseAuthenticationAppLinkPolicyEnabled */
    void m154416x79205b0f(boolean z17);

    /* renamed from: setForceDark */
    void m154417xb6cdb2bf(int i17);

    /* renamed from: setForceDarkBehavior */
    void m154418x2bf39a31(int i17);

    /* renamed from: setOffscreenPreRaster */
    void m154419x9d1c21a7(boolean z17);

    /* renamed from: setRequestedWithHeaderOriginAllowList */
    void m154420xc406d7c2(java.util.Set<java.lang.String> set);

    /* renamed from: setSafeBrowsingEnabled */
    void m154421xfe5da56b(boolean z17);

    /* renamed from: setUserAgentMetadataFromMap */
    void m154422xb178084b(java.util.Map<java.lang.String, java.lang.Object> map);

    /* renamed from: setWebAuthnSupport */
    void m154423xd00141db(int i17);

    /* renamed from: setWillSuppressErrorPage */
    void m154424x33a80c8e(boolean z17);
}
