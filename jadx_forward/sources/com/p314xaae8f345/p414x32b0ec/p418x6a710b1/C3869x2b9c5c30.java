package com.p314xaae8f345.p414x32b0ec.p418x6a710b1;

/* renamed from: com.tencent.live.utils.MethodUtils */
/* loaded from: classes16.dex */
public class C3869x2b9c5c30 {
    private static final java.lang.String TAG = "TRTCCloudFlutter";

    /* renamed from: getMethodParams */
    public static <T> T m31842x95865c3d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result, java.lang.String str) {
        T t17 = (T) c28687x4bb242ff.m138433xa13f5ebd(str);
        if (t17 == null) {
            result.mo65718x5c4d208("Missing parameter", "Cannot find parameter `" + str + "` or `" + str + "` is null!", java.lang.Integer.valueOf(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15116xa552212a));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TRTCCloudFlutter, |method=");
            sb6.append(c28687x4bb242ff.f71610xbfc5d0e1);
            sb6.append("|arguments=null");
            com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31840x6f02d9a1(4, sb6.toString());
        }
        return t17;
    }

    /* renamed from: getParamCanBeNull */
    public static <T> T m31843x55cadf43(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result, java.lang.String str) {
        return (T) c28687x4bb242ff.m138433xa13f5ebd(str);
    }

    /* renamed from: handleVideoFrame */
    public static java.util.Map m31844xfa0ef1fa(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("pixelFormat", java.lang.Integer.valueOf(v2TXLiveVideoFrame.f15419xa0fe3a1d.ordinal()));
        hashMap.put("bufferType", java.lang.Integer.valueOf(v2TXLiveVideoFrame.f15416x719f779a.ordinal()));
        hashMap.put("width", java.lang.Integer.valueOf(v2TXLiveVideoFrame.f15422x6be2dc6));
        hashMap.put("pixelFormat", java.lang.Integer.valueOf(v2TXLiveVideoFrame.f15418xb7389127));
        hashMap.put("rotation", java.lang.Integer.valueOf(v2TXLiveVideoFrame.f15420xfd990f7e));
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType v2TXLiveBufferType = v2TXLiveVideoFrame.f15416x719f779a;
        if (v2TXLiveBufferType == com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, v2TXLiveVideoFrame.f15417x2eefaa);
        } else if (v2TXLiveBufferType == com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveBufferType.V2TXLiveBufferTypeTexture) {
            hashMap.put("textureId", java.lang.Integer.valueOf(v2TXLiveVideoFrame.f15421xab7dd51b.f15397xc35d0396));
        }
        return hashMap;
    }
}
