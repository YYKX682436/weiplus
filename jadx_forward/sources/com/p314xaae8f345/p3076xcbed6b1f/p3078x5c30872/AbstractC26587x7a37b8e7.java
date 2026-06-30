package com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872;

/* renamed from: com.tencent.tinker.entry.ApplicationLike */
/* loaded from: classes16.dex */
public abstract class AbstractC26587x7a37b8e7 implements com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.InterfaceC26586xd1743ffa {

    /* renamed from: application */
    private final android.app.Application f55400x5ca40550;

    /* renamed from: applicationStartElapsedTime */
    private final long f55401x83285617;

    /* renamed from: applicationStartMillisTime */
    private final long f55402x84bd44c5;

    /* renamed from: tinkerFlags */
    private final int f55403x6fb0aea8;

    /* renamed from: tinkerLoadVerifyFlag */
    private final boolean f55404x45ae260a;

    /* renamed from: tinkerResultIntent */
    private final android.content.Intent f55405xf990a9d8;

    public AbstractC26587x7a37b8e7(android.app.Application application, int i17, boolean z17, long j17, long j18, android.content.Intent intent) {
        this.f55400x5ca40550 = application;
        this.f55403x6fb0aea8 = i17;
        this.f55404x45ae260a = z17;
        this.f55401x83285617 = j17;
        this.f55402x84bd44c5 = j18;
        this.f55405xf990a9d8 = intent;
    }

    /* renamed from: getApplication */
    public android.app.Application m104434x367a4c1a() {
        return this.f55400x5ca40550;
    }

    /* renamed from: getApplicationStartElapsedTime */
    public long m104435x9bbc8e1() {
        return this.f55401x83285617;
    }

    /* renamed from: getApplicationStartMillisTime */
    public long m104436xe3eb50bb() {
        return this.f55402x84bd44c5;
    }

    /* renamed from: getAssets */
    public android.content.res.AssetManager mo42963x11279679(android.content.res.AssetManager assetManager) {
        return assetManager;
    }

    /* renamed from: getBaseContext */
    public android.content.Context m104437x9bbaf068(android.content.Context context) {
        return context;
    }

    /* renamed from: getClassLoader */
    public java.lang.ClassLoader m104438xa0bf1275(java.lang.ClassLoader classLoader) {
        return classLoader;
    }

    /* renamed from: getResources */
    public android.content.res.Resources mo42964x893a2f6f(android.content.res.Resources resources) {
        return resources;
    }

    /* renamed from: getSystemService */
    public java.lang.Object m104439xac92a5d0(java.lang.String str, java.lang.Object obj) {
        return obj;
    }

    /* renamed from: getTheme */
    public android.content.res.Resources.Theme m104440x75311c13(android.content.res.Resources.Theme theme) {
        return theme;
    }

    /* renamed from: getTinkerFlags */
    public final int m104441x4986f572() {
        return this.f55403x6fb0aea8;
    }

    /* renamed from: getTinkerLoadVerifyFlag */
    public final boolean m104442xf379e280() {
        return this.f55404x45ae260a;
    }

    /* renamed from: getTinkerResultIntent */
    public final android.content.Intent m104443xced0bce() {
        return this.f55405xf990a9d8;
    }

    /* renamed from: mzNightModeUseOf */
    public int mo42965xc80aabb0() {
        return 1;
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.InterfaceC26586xd1743ffa
    /* renamed from: onBaseContextAttached */
    public void mo42966xb9ef6503(android.content.Context context) {
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.InterfaceC26586xd1743ffa
    /* renamed from: onConfigurationChanged */
    public void mo42967x50e1c15d(android.content.res.Configuration configuration) {
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.InterfaceC26586xd1743ffa
    /* renamed from: onCreate */
    public void mo42968x3e5a77bb() {
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.InterfaceC26586xd1743ffa
    /* renamed from: onLowMemory */
    public void mo42969xb5d8ba56() {
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.InterfaceC26586xd1743ffa
    /* renamed from: onTerminate */
    public void mo42970x7784fb42() {
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.InterfaceC26586xd1743ffa
    /* renamed from: onTrimMemory */
    public void mo42971x29685b02(int i17) {
    }
}
