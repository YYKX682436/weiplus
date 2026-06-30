package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* loaded from: classes5.dex */
public enum z implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    AFFROAM_ERROR_OK(0),
    AFFROAM_ERROR_GENERAL(-1),
    AFFROAM_ERROR_ALREADY_RUNNING(-2),
    AFFROAM_ERROR_FILE_ERROR(-3),
    AFFROAM_ERROR_DISK_FULL(-4),
    AFFROAM_ERROR_DISK_NOT_FOUND(-5),
    AFFROAM_ERROR_WRONG_STATE(-6),
    AFFROAM_ERROR_CANNOT_CONNECT(-7),
    AFFROAM_ERROR_LOCKED(-8),
    AFFROAM_ERROR_ALREADY_DELETED(-9),
    AFFROAM_ERROR_STUB_IOS_USED(-10),
    AFFROAM_ERROR_NEWER_VERSION_REQUIRED_BY_PKG(-11);


    /* renamed from: d, reason: collision with root package name */
    public final int f297568d;

    z(int i17) {
        this.f297568d = i17;
    }

    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.z a(int i17) {
        switch (i17) {
            case -11:
                return AFFROAM_ERROR_NEWER_VERSION_REQUIRED_BY_PKG;
            case -10:
                return AFFROAM_ERROR_STUB_IOS_USED;
            case -9:
                return AFFROAM_ERROR_ALREADY_DELETED;
            case -8:
                return AFFROAM_ERROR_LOCKED;
            case -7:
                return AFFROAM_ERROR_CANNOT_CONNECT;
            case -6:
                return AFFROAM_ERROR_WRONG_STATE;
            case -5:
                return AFFROAM_ERROR_DISK_NOT_FOUND;
            case -4:
                return AFFROAM_ERROR_DISK_FULL;
            case -3:
                return AFFROAM_ERROR_FILE_ERROR;
            case -2:
                return AFFROAM_ERROR_ALREADY_RUNNING;
            case -1:
                return AFFROAM_ERROR_GENERAL;
            case 0:
                return AFFROAM_ERROR_OK;
            default:
                return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f297568d;
    }
}
