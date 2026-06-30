package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff;

/* renamed from: io.flutter.embedding.engine.systemchannels.LifecycleChannel */
/* loaded from: classes15.dex */
public class C28658xd4882659 {

    /* renamed from: CHANNEL_NAME */
    private static final java.lang.String f71303x87093867 = "flutter/lifecycle";
    private static final java.lang.String TAG = "LifecycleChannel";

    /* renamed from: channel */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa<java.lang.String> f71304x2c0b7d03;

    /* renamed from: lastAndroidState */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28658xd4882659.AppLifecycleState f71305x8db40118;

    /* renamed from: lastFlutterState */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28658xd4882659.AppLifecycleState f71306x377d038b;

    /* renamed from: lastFocus */
    private boolean f71307x769dffe2;

    /* renamed from: io.flutter.embedding.engine.systemchannels.LifecycleChannel$1, reason: invalid class name */
    /* loaded from: classes15.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$LifecycleChannel$AppLifecycleState */
        static final /* synthetic */ int[] f71308xddedd993;

        static {
            int[] iArr = new int[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28658xd4882659.AppLifecycleState.m138181xcee59d22().length];
            f71308xddedd993 = iArr;
            try {
                iArr[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28658xd4882659.AppLifecycleState.RESUMED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f71308xddedd993[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28658xd4882659.AppLifecycleState.INACTIVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f71308xddedd993[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28658xd4882659.AppLifecycleState.HIDDEN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f71308xddedd993[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28658xd4882659.AppLifecycleState.PAUSED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f71308xddedd993[io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28658xd4882659.AppLifecycleState.DETACHED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.LifecycleChannel$AppLifecycleState */
    /* loaded from: classes15.dex */
    public enum AppLifecycleState {
        DETACHED,
        RESUMED,
        INACTIVE,
        HIDDEN,
        PAUSED
    }

    public C28658xd4882659(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 c28604xeb2eb192) {
        this((io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa<java.lang.String>) new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(c28604xeb2eb192, f71303x87093867, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28693x7d6ca65.f71639x4fbc8495));
    }

    /* renamed from: sendState */
    private void m138170xee79e9(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28658xd4882659.AppLifecycleState appLifecycleState, boolean z17) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28658xd4882659.AppLifecycleState appLifecycleState2 = this.f71305x8db40118;
        if (appLifecycleState2 == appLifecycleState && z17 == this.f71307x769dffe2) {
            return;
        }
        if (appLifecycleState == null && appLifecycleState2 == null) {
            this.f71307x769dffe2 = z17;
            return;
        }
        int i17 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28658xd4882659.AnonymousClass1.f71308xddedd993[appLifecycleState.ordinal()];
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28658xd4882659.AppLifecycleState appLifecycleState3 = i17 != 1 ? (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5) ? appLifecycleState : null : z17 ? io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28658xd4882659.AppLifecycleState.RESUMED : io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28658xd4882659.AppLifecycleState.INACTIVE;
        this.f71305x8db40118 = appLifecycleState;
        this.f71307x769dffe2 = z17;
        if (appLifecycleState3 == this.f71306x377d038b) {
            return;
        }
        java.lang.String str = "AppLifecycleState." + appLifecycleState3.name().toLowerCase(java.util.Locale.ROOT);
        io.p3284xd2ae381c.Log.v(TAG, "Sending " + str + " message.");
        this.f71304x2c0b7d03.m138402x35cf88(str);
        this.f71306x377d038b = appLifecycleState3;
    }

    /* renamed from: aWindowIsFocused */
    public void m138171x6c7f4e3c() {
        m138170xee79e9(this.f71305x8db40118, true);
    }

    /* renamed from: appIsDetached */
    public void m138172x673813bd() {
        m138170xee79e9(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28658xd4882659.AppLifecycleState.DETACHED, this.f71307x769dffe2);
    }

    /* renamed from: appIsInactive */
    public void m138173x2a6de4b6() {
        m138170xee79e9(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28658xd4882659.AppLifecycleState.INACTIVE, this.f71307x769dffe2);
    }

    /* renamed from: appIsPaused */
    public void m138174x196db839() {
        m138170xee79e9(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28658xd4882659.AppLifecycleState.PAUSED, this.f71307x769dffe2);
    }

    /* renamed from: appIsResumed */
    public void m138175x84ce002c() {
        m138170xee79e9(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28658xd4882659.AppLifecycleState.RESUMED, this.f71307x769dffe2);
    }

    /* renamed from: noWindowsAreFocused */
    public void m138176x840de5a5() {
        m138170xee79e9(this.f71305x8db40118, false);
    }

    public C28658xd4882659(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa<java.lang.String> c28677x2598ceaa) {
        this.f71305x8db40118 = null;
        this.f71306x377d038b = null;
        this.f71307x769dffe2 = true;
        this.f71304x2c0b7d03 = c28677x2598ceaa;
    }
}
