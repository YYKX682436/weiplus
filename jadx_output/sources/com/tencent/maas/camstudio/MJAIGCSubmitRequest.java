package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJAIGCSubmitRequest {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f47850a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f47851b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f47852c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.maas.camstudio.MJAIGCRequestAsset[] f47853d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f47854e;

    public MJAIGCSubmitRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        this(str, str2, str3, objArr, java.util.Collections.emptyMap());
    }

    public java.lang.String toString() {
        return "MJAIGCSubmitRequest{requestID='" + this.f47850a + "', templateID='" + this.f47851b + "', aigcServiceID='" + this.f47852c + "', assets=" + this.f47853d + '}';
    }

    public MJAIGCSubmitRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr, java.util.Map<java.lang.String, java.lang.String> map) {
        com.tencent.maas.camstudio.MJAIGCRequestAsset[] mJAIGCRequestAssetArr;
        this.f47850a = str;
        this.f47851b = str2;
        this.f47852c = str3;
        if (objArr == null) {
            mJAIGCRequestAssetArr = null;
        } else {
            mJAIGCRequestAssetArr = new com.tencent.maas.camstudio.MJAIGCRequestAsset[objArr.length];
            for (int i17 = 0; i17 < objArr.length; i17++) {
                mJAIGCRequestAssetArr[i17] = (com.tencent.maas.camstudio.MJAIGCRequestAsset) objArr[i17];
            }
        }
        this.f47853d = mJAIGCRequestAssetArr;
        this.f47854e = map == null ? java.util.Collections.emptyMap() : map;
    }
}
