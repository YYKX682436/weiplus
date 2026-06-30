package com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f;

/* renamed from: com.tencent.thumbplayer.adapter.TPPlayerDataSource */
/* loaded from: classes16.dex */
public class C26136x85a944c2 {

    /* renamed from: TYPE_ASSET_FD */
    public static final int f49999x6cd0f3f2 = 4;

    /* renamed from: TYPE_CLIP_INFO */
    public static final int f50000x81064d78 = 2;

    /* renamed from: TYPE_DATA_SOURCE */
    public static final int f50001xc84a3ccb = 3;

    /* renamed from: TYPE_PARCEL_FD */
    public static final int f50002x564f51ef = 1;

    /* renamed from: TYPE_URL */
    public static final int f50003x669d2ca = 0;

    /* renamed from: mAssetFileDescriptor */
    private android.content.res.AssetFileDescriptor f50004xf5c0db6e;

    /* renamed from: mHttpHeaders */
    private java.util.Map<java.lang.String, java.lang.String> f50005xc62e731;

    /* renamed from: mParcelFileDescriptor */
    private android.os.ParcelFileDescriptor f50006x2ccd3e81;

    /* renamed from: mTPMediaAsset */
    private com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 f50007x845699f5;

    /* renamed from: mType */
    private int f50008x6280547;

    /* renamed from: mUrl */
    private java.lang.String f50009x32d9c2;

    /* renamed from: tpUrlDataSource */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18 f50010xba36ca18;

    public C26136x85a944c2() {
        this.f50005xc62e731 = new java.util.HashMap();
    }

    /* renamed from: assetFileDescriptor */
    public android.content.res.AssetFileDescriptor m100513xb24cd1b() {
        return this.f50004xf5c0db6e;
    }

    /* renamed from: getTpUrlDataSource */
    public com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18 m100514x9e989be2() {
        return this.f50010xba36ca18;
    }

    /* renamed from: getType */
    public int m100515xfb85f7b0() {
        return this.f50008x6280547;
    }

    /* renamed from: httpHeaders */
    public java.util.Map<java.lang.String, java.lang.String> m100516x6255d5de() {
        return this.f50005xc62e731;
    }

    /* renamed from: isValid */
    public boolean m100517x7b953cf2() {
        return (android.text.TextUtils.isEmpty(this.f50009x32d9c2) && this.f50006x2ccd3e81 == null && this.f50004xf5c0db6e == null && this.f50007x845699f5 == null && this.f50010xba36ca18 == null) ? false : true;
    }

    /* renamed from: mediaAsset */
    public com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 m100518x71f8d96c() {
        return this.f50007x845699f5;
    }

    /* renamed from: parcelFileDescriptor */
    public android.os.ParcelFileDescriptor m100519xc3e78274() {
        return this.f50006x2ccd3e81;
    }

    /* renamed from: setAssetFileDescriptor */
    public void m100520xb1996959(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        this.f50009x32d9c2 = null;
        this.f50008x6280547 = 4;
        this.f50005xc62e731.clear();
        this.f50006x2ccd3e81 = null;
        this.f50004xf5c0db6e = assetFileDescriptor;
    }

    /* renamed from: setHttpHeaders */
    public void m100521xd291901c(java.util.Map<java.lang.String, java.lang.String> map) {
        this.f50005xc62e731.clear();
        java.util.Map<java.lang.String, java.lang.String> map2 = this.f50005xc62e731;
        if (map == null) {
            map = new java.util.HashMap<>(0);
        }
        map2.putAll(map);
    }

    /* renamed from: setMediaClipInfo */
    public void m100522xab0326e0(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1) {
        this.f50009x32d9c2 = null;
        this.f50008x6280547 = 2;
        this.f50005xc62e731.clear();
        this.f50006x2ccd3e81 = null;
        this.f50004xf5c0db6e = null;
        this.f50007x845699f5 = interfaceC26214xf9e9afd1;
    }

    /* renamed from: setParcelFileDescriptor */
    public void m100523xec066df6(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.f50009x32d9c2 = null;
        this.f50008x6280547 = 1;
        this.f50005xc62e731.clear();
        this.f50006x2ccd3e81 = parcelFileDescriptor;
        this.f50004xf5c0db6e = null;
    }

    /* renamed from: setTpUrlDataSource */
    public void m100524xd56f3556(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18 c26142x43104e18) {
        this.f50009x32d9c2 = null;
        this.f50008x6280547 = 3;
        this.f50006x2ccd3e81 = null;
        this.f50004xf5c0db6e = null;
        this.f50010xba36ca18 = c26142x43104e18;
    }

    /* renamed from: setUrl */
    public void m100525xca029dad(java.lang.String str) {
        this.f50009x32d9c2 = str;
        this.f50008x6280547 = 0;
        this.f50006x2ccd3e81 = null;
    }

    public java.lang.String url() {
        return this.f50009x32d9c2;
    }

    public C26136x85a944c2(java.lang.String str) {
        this.f50009x32d9c2 = str;
        this.f50008x6280547 = 0;
        this.f50006x2ccd3e81 = null;
        this.f50004xf5c0db6e = null;
        this.f50005xc62e731 = new java.util.HashMap(0);
    }

    public C26136x85a944c2(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this.f50009x32d9c2 = str;
        this.f50008x6280547 = 0;
        this.f50006x2ccd3e81 = null;
        this.f50004xf5c0db6e = null;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f50005xc62e731 = hashMap;
        hashMap.putAll(map);
    }

    public C26136x85a944c2(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.f50009x32d9c2 = null;
        this.f50008x6280547 = 1;
        this.f50006x2ccd3e81 = parcelFileDescriptor;
        this.f50004xf5c0db6e = null;
        this.f50005xc62e731 = new java.util.HashMap(0);
    }

    public C26136x85a944c2(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        this.f50009x32d9c2 = null;
        this.f50008x6280547 = 4;
        this.f50006x2ccd3e81 = null;
        this.f50004xf5c0db6e = assetFileDescriptor;
        this.f50005xc62e731 = new java.util.HashMap(0);
    }

    public C26136x85a944c2(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1) {
        this.f50009x32d9c2 = null;
        this.f50008x6280547 = 2;
        this.f50006x2ccd3e81 = null;
        this.f50004xf5c0db6e = null;
        this.f50005xc62e731 = new java.util.HashMap(0);
        this.f50007x845699f5 = interfaceC26214xf9e9afd1;
    }
}
