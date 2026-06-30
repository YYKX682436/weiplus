package com.p314xaae8f345.p2926x359365;

/* renamed from: com.tencent.rtmp.TXLivePlayConfig */
/* loaded from: classes10.dex */
public class C25484xcc963946 implements java.io.Serializable {

    /* renamed from: serialVersionUID */
    private static final long f46496x3a3ed56c = 1;

    /* renamed from: mHeaders */
    protected java.util.Map<java.lang.String, java.lang.String> f46506xcd802259;

    /* renamed from: mCacheTime */
    float f46498x59b82f82 = 5.0f;

    /* renamed from: mMaxAutoAdjustCacheTime */
    float f46507xd9071ba = 5.0f;

    /* renamed from: mMinAutoAdjustCacheTime */
    float f46508x6605be0c = 1.0f;

    /* renamed from: mVideoBlockThreshold */
    int f46510xc8f80a0c = 800;

    /* renamed from: mConnectRetryCount */
    int f46499x2dee6e4 = 3;

    /* renamed from: mConnectRetryInterval */
    int f46500x498502d0 = 3;

    /* renamed from: mAutoAdjustCacheTime */
    boolean f46497x464fd344 = true;

    /* renamed from: mEnableAec */
    boolean f46501x5510924f = false;

    /* renamed from: mEnableMessage */
    boolean f46502xd6b2d197 = false;

    /* renamed from: mEnableMetaData */
    boolean f46503x514fbf = false;

    /* renamed from: mFlvSessionKey */
    java.lang.String f46505x1d7e390c = "";

    /* renamed from: mEnableNearestIP */
    boolean f46504xcfe24795 = true;

    /* renamed from: mRtmpChannelType */
    int f46509x8b25ea0b = 0;

    /* renamed from: getCacheTime */
    public float m94481xde6e56b9() {
        return this.f46498x59b82f82;
    }

    /* renamed from: getConnectRetryCount */
    public int m94482xb931e71b() {
        return this.f46499x2dee6e4;
    }

    /* renamed from: getConnectRetryInterval */
    public int m94483x8e6b0339() {
        return this.f46500x498502d0;
    }

    /* renamed from: getFlvSessionKey */
    public java.lang.String m94484x7fcfecc3() {
        return this.f46505x1d7e390c;
    }

    /* renamed from: getHeaders */
    public java.util.Map<java.lang.String, java.lang.String> m94485x6d34ab50() {
        return this.f46506xcd802259;
    }

    /* renamed from: getMaxAutoAdjustCacheTime */
    public float m94486xb0f7fbe3() {
        return this.f46507xd9071ba;
    }

    /* renamed from: getMinAutoAdjustCacheTime */
    public float m94487x96d4835() {
        return this.f46508x6605be0c;
    }

    /* renamed from: getRtmpChannelType */
    public int m94488x9fd98c02() {
        return this.f46509x8b25ea0b;
    }

    /* renamed from: getVideoBlockThreshold */
    public int m94489x368bd883() {
        return this.f46510xc8f80a0c;
    }

    /* renamed from: isAutoAdjustCacheTime */
    public boolean m94490xded78b67() {
        return this.f46497x464fd344;
    }

    /* renamed from: isEnableAec */
    public boolean m94491x20968a32() {
        return this.f46501x5510924f;
    }

    /* renamed from: isEnableMessage */
    public boolean m94492xfce41ffa() {
        return this.f46502xd6b2d197;
    }

    /* renamed from: isEnableMetaData */
    public boolean m94493xa049cdbc() {
        return this.f46503x514fbf;
    }

    /* renamed from: isEnableNearestIP */
    public boolean m94494x2ef98938() {
        return this.f46504xcfe24795;
    }

    /* renamed from: setAutoAdjustCacheTime */
    public void m94495x228612f(boolean z17) {
        this.f46497x464fd344 = z17;
    }

    /* renamed from: setCacheTime */
    public void m94496x3ac2172d(float f17) {
        this.f46498x59b82f82 = f17;
    }

    /* renamed from: setConnectRetryCount */
    public void m94497x94c7f38f(int i17) {
        this.f46499x2dee6e4 = i17;
    }

    /* renamed from: setConnectRetryInterval */
    public void m94498x8be3245(int i17) {
        this.f46500x498502d0 = i17;
    }

    @java.lang.Deprecated
    /* renamed from: setEnableAEC */
    public void m94499x361a75fa(boolean z17) {
        this.f46501x5510924f = z17;
    }

    /* renamed from: setEnableMessage */
    public void m94500xcbdaebc2(boolean z17) {
        this.f46502xd6b2d197 = z17;
    }

    /* renamed from: setEnableMetaData */
    public void m94501xb02c7af4(boolean z17) {
        this.f46503x514fbf = z17;
    }

    @java.lang.Deprecated
    /* renamed from: setEnableNearestIP */
    public void m94502x1b6c8300(boolean z17) {
        this.f46504xcfe24795 = z17;
    }

    /* renamed from: setFlvSessionKey */
    public void m94503x12a65337(java.lang.String str) {
        this.f46505x1d7e390c = str;
    }

    @java.lang.Deprecated
    /* renamed from: setHeaders */
    public void m94504xe0a5f8c4(java.util.Map<java.lang.String, java.lang.String> map) {
        this.f46506xcd802259 = map;
    }

    /* renamed from: setMaxAutoAdjustCacheTime */
    public void m94505xe33b97ef(float f17) {
        this.f46507xd9071ba = f17;
    }

    /* renamed from: setMinAutoAdjustCacheTime */
    public void m94506x3bb0e441(float f17) {
        this.f46508x6605be0c = f17;
    }

    @java.lang.Deprecated
    /* renamed from: setRtmpChannelType */
    public void m94507xd6b02576(int i17) {
        this.f46509x8b25ea0b = i17;
    }

    /* renamed from: setVideoBlockThreshold */
    public void m94508x84d097f7(int i17) {
        this.f46510xc8f80a0c = i17;
    }

    /* renamed from: toString */
    public java.lang.String m94509x9616526c() {
        return "{mCacheTime=" + this.f46498x59b82f82 + ", mMaxAutoAdjustCacheTime=" + this.f46507xd9071ba + ", mMinAutoAdjustCacheTime=" + this.f46508x6605be0c + ", mAutoAdjustCacheTime=" + this.f46497x464fd344 + ", mVideoBlockThreshold=" + this.f46510xc8f80a0c + ", mConnectRetryCount=" + this.f46499x2dee6e4 + ", mConnectRetryInterval=" + this.f46500x498502d0 + ", mEnableAec=" + this.f46501x5510924f + ", mEnableMessage=" + this.f46502xd6b2d197 + ", mEnableMetaData=" + this.f46503x514fbf + '}';
    }
}
