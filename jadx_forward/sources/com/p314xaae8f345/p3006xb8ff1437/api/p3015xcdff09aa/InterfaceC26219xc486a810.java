package com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa;

/* renamed from: com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset */
/* loaded from: classes16.dex */
public interface InterfaceC26219xc486a810 extends com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 {

    /* renamed from: TP_PLAYER_DRM_PROPERTY_APPVER */
    public static final java.lang.String f51202x282eca11 = "drm_property_app_ver";

    /* renamed from: TP_PLAYER_DRM_PROPERTY_COOKIE */
    public static final java.lang.String f51203x2b89c693 = "drm_property_cookie";

    /* renamed from: TP_PLAYER_DRM_PROPERTY_DRM_USEL1 */
    public static final java.lang.String f51204x1b083bbd = "drm_property_use_l1";

    /* renamed from: TP_PLAYER_DRM_PROPERTY_EXT_X_KEY */
    public static final java.lang.String f51205x910f278b = "drm_property_ext_x_key";

    /* renamed from: TP_PLAYER_DRM_PROPERTY_GUID */
    public static final java.lang.String f51206x6fa9678 = "drm_property_guid";

    /* renamed from: TP_PLAYER_DRM_PROPERTY_LICENSE_STANDARDIZATION */
    public static final java.lang.String f51207x1583627a = "drm_property_license_standardization";

    /* renamed from: TP_PLAYER_DRM_PROPERTY_LICENSE_URL */
    public static final java.lang.String f51208xc0ab8d62 = "drm_property_license_url";

    /* renamed from: TP_PLAYER_DRM_PROPERTY_PLATFORM */
    public static final java.lang.String f51209x88d0e2 = "drm_property_platform";

    /* renamed from: TP_PLAYER_DRM_PROPERTY_PROVISION_URL */
    public static final java.lang.String f51210x497a33b6 = "drm_property_provision_url";

    /* renamed from: TP_PLAYER_DRM_PROPERTY_SAVE_PATH */
    public static final java.lang.String f51211x955c5718 = "drm_property_save_path";

    /* renamed from: getDrmAllProperties */
    java.util.Map<java.lang.String, java.lang.String> mo101300xd24879cb();

    /* renamed from: getDrmPlayUrl */
    java.lang.String mo101301xe2178ef2();

    /* renamed from: getDrmProperty */
    java.lang.String mo101302xb5abff5e(java.lang.String str, java.lang.String str2);

    @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TP_DRM_TYPE
    /* renamed from: getDrmType */
    int mo101303xb06cdd43();

    /* renamed from: getLicenseHttpHeaders */
    java.util.Map<java.lang.String, java.lang.String> mo101304xc68bd8d3();

    /* renamed from: setDrmPlayUrl */
    void mo101305x103bdcfe(java.lang.String str);

    /* renamed from: setDrmProperty */
    void mo101306x4c1172d2(java.lang.String str, java.lang.String str2);

    /* renamed from: setDrmType */
    void mo101307x23de2ab7(@com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TP_DRM_TYPE int i17);

    /* renamed from: setLicenseHttpHeaders */
    void mo101308x5db75adf(java.util.Map<java.lang.String, java.lang.String> map);
}
