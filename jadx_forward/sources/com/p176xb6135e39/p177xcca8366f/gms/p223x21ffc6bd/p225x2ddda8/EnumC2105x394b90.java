package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8;

/* renamed from: com.google.android.gms.internal.auth.zzbr */
/* loaded from: classes13.dex */
public enum EnumC2105x394b90 {
    CLIENT_LOGIN_DISABLED("ClientLoginDisabled"),
    DEVICE_MANAGEMENT_REQUIRED("DeviceManagementRequiredOrSyncDisabled"),
    SOCKET_TIMEOUT("SocketTimeout"),
    SUCCESS("Ok"),
    UNKNOWN_ERROR("UNKNOWN_ERR"),
    NETWORK_ERROR("NetworkError"),
    SERVICE_UNAVAILABLE("ServiceUnavailable"),
    INTNERNAL_ERROR("InternalError"),
    BAD_AUTHENTICATION("BadAuthentication"),
    EMPTY_CONSUMER_PKG_OR_SIG("EmptyConsumerPackageOrSig"),
    NEEDS_2F("InvalidSecondFactor"),
    NEEDS_POST_SIGN_IN_FLOW("PostSignInFlowRequired"),
    NEEDS_BROWSER("NeedsBrowser"),
    UNKNOWN("Unknown"),
    NOT_VERIFIED("NotVerified"),
    TERMS_NOT_AGREED("TermsNotAgreed"),
    ACCOUNT_DISABLED("AccountDisabled"),
    CAPTCHA("CaptchaRequired"),
    ACCOUNT_DELETED("AccountDeleted"),
    SERVICE_DISABLED("ServiceDisabled"),
    NEED_PERMISSION("NeedPermission"),
    NEED_REMOTE_CONSENT("NeedRemoteConsent"),
    INVALID_SCOPE("INVALID_SCOPE"),
    USER_CANCEL("UserCancel"),
    PERMISSION_DENIED("PermissionDenied"),
    INVALID_AUDIENCE("INVALID_AUDIENCE"),
    UNREGISTERED_ON_API_CONSOLE("UNREGISTERED_ON_API_CONSOLE"),
    THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED("ThirdPartyDeviceManagementRequired"),
    DM_INTERNAL_ERROR("DeviceManagementInternalError"),
    DM_SYNC_DISABLED("DeviceManagementSyncDisabled"),
    DM_ADMIN_BLOCKED("DeviceManagementAdminBlocked"),
    DM_ADMIN_PENDING_APPROVAL("DeviceManagementAdminPendingApproval"),
    DM_STALE_SYNC_REQUIRED("DeviceManagementStaleSyncRequired"),
    DM_DEACTIVATED("DeviceManagementDeactivated"),
    DM_SCREENLOCK_REQUIRED("DeviceManagementScreenlockRequired"),
    DM_REQUIRED("DeviceManagementRequired"),
    ALREADY_HAS_GMAIL("ALREADY_HAS_GMAIL"),
    BAD_PASSWORD("WeakPassword"),
    BAD_REQUEST("BadRequest"),
    BAD_USERNAME("BadUsername"),
    DELETED_GMAIL("DeletedGmail"),
    EXISTING_USERNAME("ExistingUsername"),
    LOGIN_FAIL("LoginFail"),
    NOT_LOGGED_IN("NotLoggedIn"),
    NO_GMAIL("NoGmail"),
    REQUEST_DENIED("RequestDenied"),
    SERVER_ERROR("ServerError"),
    USERNAME_UNAVAILABLE("UsernameUnavailable"),
    GPLUS_OTHER("GPlusOther"),
    GPLUS_NICKNAME("GPlusNickname"),
    GPLUS_INVALID_CHAR("GPlusInvalidChar"),
    GPLUS_INTERSTITIAL("GPlusInterstitial"),
    GPLUS_PROFILE_ERROR("ProfileUpgradeError");


    /* renamed from: zzho */
    private final java.lang.String f6253x394c47;

    EnumC2105x394b90(java.lang.String str) {
        this.f6253x394c47 = str;
    }

    public static boolean zzd(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.EnumC2105x394b90 enumC2105x394b90) {
        return BAD_AUTHENTICATION.equals(enumC2105x394b90) || CAPTCHA.equals(enumC2105x394b90) || NEED_PERMISSION.equals(enumC2105x394b90) || NEED_REMOTE_CONSENT.equals(enumC2105x394b90) || NEEDS_BROWSER.equals(enumC2105x394b90) || USER_CANCEL.equals(enumC2105x394b90) || DEVICE_MANAGEMENT_REQUIRED.equals(enumC2105x394b90) || DM_INTERNAL_ERROR.equals(enumC2105x394b90) || DM_SYNC_DISABLED.equals(enumC2105x394b90) || DM_ADMIN_BLOCKED.equals(enumC2105x394b90) || DM_ADMIN_PENDING_APPROVAL.equals(enumC2105x394b90) || DM_STALE_SYNC_REQUIRED.equals(enumC2105x394b90) || DM_DEACTIVATED.equals(enumC2105x394b90) || DM_REQUIRED.equals(enumC2105x394b90) || THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(enumC2105x394b90) || DM_SCREENLOCK_REQUIRED.equals(enumC2105x394b90);
    }

    public static final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.EnumC2105x394b90 zzh(java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.EnumC2105x394b90 enumC2105x394b90 = null;
        for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.EnumC2105x394b90 enumC2105x394b902 : m18795xcee59d22()) {
            if (enumC2105x394b902.f6253x394c47.equals(str)) {
                enumC2105x394b90 = enumC2105x394b902;
            }
        }
        return enumC2105x394b90;
    }
}
