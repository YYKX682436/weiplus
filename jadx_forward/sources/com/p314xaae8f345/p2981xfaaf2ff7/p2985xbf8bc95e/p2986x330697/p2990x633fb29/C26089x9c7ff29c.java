package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions */
/* loaded from: classes13.dex */
public final class C26089x9c7ff29c {

    /* renamed from: MAX_DATA_LEVEL */
    public static final int f49787x188f806a = 20;

    /* renamed from: MAX_VISIBLE_LEVEL */
    public static final int f49788x7796f17c = 22;

    /* renamed from: MIN_DATA_LEVEL */
    public static final int f49789x3fb73ebc = 3;

    /* renamed from: mDiskCacheDir */
    private volatile java.lang.String f49790x4a62b375;

    /* renamed from: mMaxMemoryCacheSize */
    private int f49794x207a5feb;

    /* renamed from: mTileProvider */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26090xef1182df f49799x7cdb47cc;

    /* renamed from: mVersionInfo */
    private volatile java.lang.String f49800xd31adaf9;

    /* renamed from: mZIndex */
    private int f49801x23d39b45 = 1;

    /* renamed from: mMinDataLevel */
    private int f49796x484b84d5 = 3;

    /* renamed from: mMaxDataLevel */
    private int f49793x2c045a03 = 18;

    /* renamed from: mMinVisibleLevel */
    private int f49797x2cf57177 = 3;

    /* renamed from: mMaxVisibleLevel */
    private int f49795x6f256589 = 18;

    /* renamed from: mDisplayHD */
    private boolean f49791x89794351 = true;

    /* renamed from: mReuseTile */
    private boolean f49798x7434dd55 = false;

    /* renamed from: mLevelOffset */
    private int f49792xca14a8a = 1;

    /* renamed from: betterQuality */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c m99992xcb761cef(boolean z17) {
        m99995xec1f93e(z17);
        if (!z17) {
            m100009x62943937(0);
        }
        return this;
    }

    /* renamed from: dataLevelRange */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c m99993x3d8ff63(int i17, int i18) {
        if (i17 >= 3 && i17 <= java.lang.Math.max(i18, 20)) {
            this.f49796x484b84d5 = i17;
        }
        if (i18 <= 20 && i18 >= java.lang.Math.max(3, i17)) {
            this.f49793x2c045a03 = i18;
        }
        return this;
    }

    /* renamed from: diskCacheDir */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c m99994xb2cd9a68(java.lang.String str) {
        this.f49790x4a62b375 = str;
        return this;
    }

    /* renamed from: displayHD */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c m99995xec1f93e(boolean z17) {
        this.f49791x89794351 = z17;
        return this;
    }

    /* renamed from: getDiskCacheDir */
    public final java.lang.String m99996x13c02cde() {
        return this.f49790x4a62b375;
    }

    /* renamed from: getLevelOffset */
    public final int m99997x3c6a8001() {
        return this.f49792xca14a8a;
    }

    /* renamed from: getMaxDataLevel */
    public final int m99998xf561d36c() {
        return this.f49793x2c045a03;
    }

    /* renamed from: getMaxMemoryCacheSize */
    public final int m99999x34876694(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 interfaceC25963x17625b8) {
        int i17 = this.f49794x207a5feb;
        return i17 == 0 ? interfaceC25963x17625b8.mo36636xf72cbcaf() * 4 : i17;
    }

    /* renamed from: getMaxVisibleLevel */
    public final int m100000x83d90780() {
        return this.f49795x6f256589;
    }

    /* renamed from: getMinDataLevel */
    public final int m100001x11a8fe3e() {
        return this.f49796x484b84d5;
    }

    /* renamed from: getMinVisibleLevel */
    public final int m100002x41a9136e() {
        return this.f49797x2cf57177;
    }

    /* renamed from: getTileProvider */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26090xef1182df m100003x4638c135() {
        return this.f49799x7cdb47cc;
    }

    /* renamed from: getVersionInfo */
    public final java.lang.String m100004x2e41070() {
        return this.f49800xd31adaf9;
    }

    /* renamed from: getZIndex */
    public final int m100005x397e976e() {
        return this.f49801x23d39b45;
    }

    /* renamed from: isBetterQuality */
    public final boolean m100006x4cb573e5() {
        return m100007x54ff3b34();
    }

    /* renamed from: isDisplayHD */
    public final boolean m100007x54ff3b34() {
        return this.f49791x89794351;
    }

    /* renamed from: isReuseTile */
    public final boolean m100008x3fbad538() {
        return this.f49798x7434dd55;
    }

    /* renamed from: levelOffset */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c m100009x62943937(int i17) {
        if (i17 < -2) {
            i17 = -2;
        }
        if (i17 > 2) {
            i17 = 2;
        }
        this.f49792xca14a8a = i17;
        return this;
    }

    /* renamed from: maxMemoryCacheSize */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c m100010x212b049e(int i17) {
        this.f49794x207a5feb = i17;
        return this;
    }

    /* renamed from: reuseTile */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c m100011xf97d9342(boolean z17) {
        this.f49798x7434dd55 = z17;
        return this;
    }

    /* renamed from: tileProvider */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c m100012xe5462ebf(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26090xef1182df interfaceC26090xef1182df) {
        this.f49799x7cdb47cc = interfaceC26090xef1182df;
        return this;
    }

    /* renamed from: toString */
    public final java.lang.String m100013x9616526c() {
        return "TileOverlayOptions{mTileProvider=" + this.f49799x7cdb47cc + ", mDiskCacheDir='" + this.f49790x4a62b375 + "', mVersionInfo='" + this.f49800xd31adaf9 + "', mZIndex=" + this.f49801x23d39b45 + ", mMinDataLevel=" + this.f49796x484b84d5 + ", mMaxDataLevel=" + this.f49793x2c045a03 + ", mDisplayHD=" + this.f49791x89794351 + ", mReuseTile=" + this.f49798x7434dd55 + ", mMaxMemoryCacheSize=" + this.f49794x207a5feb + ", mLevelOffset=" + this.f49792xca14a8a + '}';
    }

    /* renamed from: versionInfo */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c m100014x290dc9a6(java.lang.String str) {
        this.f49800xd31adaf9 = str;
        return this;
    }

    /* renamed from: visibleLevelRange */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c m100015x8267a62b(int i17, int i18) {
        if (i17 >= 3 && i17 <= java.lang.Math.max(i18, 22)) {
            this.f49797x2cf57177 = i17;
        }
        if (i18 <= 22 && i18 >= java.lang.Math.max(3, i17)) {
            this.f49795x6f256589 = i18;
        }
        return this;
    }

    /* renamed from: zIndex */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c m100016xd4677478(int i17) {
        this.f49801x23d39b45 = i17;
        return this;
    }
}
