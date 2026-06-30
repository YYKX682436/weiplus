package com.tencent.live.utils;

/* loaded from: classes16.dex */
public class MethodUtils {
    private static final java.lang.String TAG = "TRTCCloudFlutter";

    public static <T> T getMethodParams(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result, java.lang.String str) {
        T t17 = (T) methodCall.argument(str);
        if (t17 == null) {
            result.error("Missing parameter", "Cannot find parameter `" + str + "` or `" + str + "` is null!", java.lang.Integer.valueOf(com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMNOTFOUND));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TRTCCloudFlutter, |method=");
            sb6.append(methodCall.method);
            sb6.append("|arguments=null");
            com.tencent.live.utils.Logger.premierPrint(4, sb6.toString());
        }
        return t17;
    }

    public static <T> T getParamCanBeNull(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result, java.lang.String str) {
        return (T) methodCall.argument(str);
    }

    public static java.util.Map handleVideoFrame(com.tencent.live2.V2TXLiveDef.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("pixelFormat", java.lang.Integer.valueOf(v2TXLiveVideoFrame.pixelFormat.ordinal()));
        hashMap.put("bufferType", java.lang.Integer.valueOf(v2TXLiveVideoFrame.bufferType.ordinal()));
        hashMap.put("width", java.lang.Integer.valueOf(v2TXLiveVideoFrame.width));
        hashMap.put("pixelFormat", java.lang.Integer.valueOf(v2TXLiveVideoFrame.height));
        hashMap.put("rotation", java.lang.Integer.valueOf(v2TXLiveVideoFrame.rotation));
        com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType = v2TXLiveVideoFrame.bufferType;
        if (v2TXLiveBufferType == com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray) {
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, v2TXLiveVideoFrame.data);
        } else if (v2TXLiveBufferType == com.tencent.live2.V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture) {
            hashMap.put("textureId", java.lang.Integer.valueOf(v2TXLiveVideoFrame.texture.textureId));
        }
        return hashMap;
    }
}
