package com.p314xaae8f345.mm.p1006xc5476f33.vqm;

/* loaded from: classes14.dex */
public enum r implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    VQMProfileInfoMatrixRebootNull(0),
    VQMProfileInfoMatrixRebootBegin(10000),
    VQMProfileInfoMatrixRebootOsVersionChange(10001),
    VQMProfileInfoMatrixRebootAppVersionChange(10002),
    VQMProfileInfoMatrixRebootOsReboot(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6),
    VQMProfileInfoMatrixRebootNormalCrash(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261),
    VQMProfileInfoMatrixRebootQuitByExit(10005),
    VQMProfileInfoMatrixRebootQuitByUser(10006),
    VQMProfileInfoMatrixRebootAppSuspendOom(10007),
    VQMProfileInfoMatrixRebootAppBackgroundOom(10008),
    VQMProfileInfoMatrixRebootAppForegroundOom(10009),
    VQMProfileInfoMatrixRebootPrewarmLaunch(10010),
    VQMProfileInfoMatrixRebootAppForegroundDeadLoop(10011),
    VQMProfileInfoMatrixRebootAppSuspendCrash(10012),
    VQMProfileInfoMatrixRebootBackgroundFetchLaunch(10013),
    VQMProfileInfoMatrixRebootExitSelfForAndroid(11000),
    VQMProfileInfoMatrixRebootSignaledForAndroid(11001),
    VQMProfileInfoMatrixRebootLowMemoryForAndroid(11002),
    VQMProfileInfoMatrixRebootCrashForAndroid(11003),
    VQMProfileInfoMatrixRebootNativeCrashForAndroid(11004),
    VQMProfileInfoMatrixRebootANRForAndroid(11005),
    VQMProfileInfoMatrixRebootInitializationFailureForAndroid(11006),
    VQMProfileInfoMatrixRebootPermissionChangeForAndroid(11007),
    VQMProfileInfoMatrixRebootExcessiveResourceUsageForAndroid(11008),
    VQMProfileInfoMatrixRebootUserRequestedForAndroid(11009),
    VQMProfileInfoMatrixRebootUserStoppedForAndroid(11010),
    VQMProfileInfoMatrixRebootDependencyDiedForAndroid(11011),
    VQMProfileInfoMatrixRebootOtherForAndroid(11012),
    VQMProfileInfoMatrixRebootFreezerForAndroid(11013),
    VQMProfileInfoMatrixRebootPackageStateChangeForAndroid(11014),
    VQMProfileInfoMatrixRebootPackageUpdatedForAndroid(11015),
    VQMProfileInfoMatrixRebootUnknown(19999);


    /* renamed from: d, reason: collision with root package name */
    public final int f259003d;

    r(int i17) {
        this.f259003d = i17;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f259003d;
    }
}
