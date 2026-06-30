package xm5;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final xm5.f f536933a = new xm5.f();

    public final java.lang.String a(rm5.q outputConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputConfig, "outputConfig");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("targetSize", outputConfig.f479069a.toString());
        jSONObject.put("videoBitrate", outputConfig.f479070b);
        jSONObject.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1, outputConfig.f479071c);
        jSONObject.put("iFrameInterval", outputConfig.f479072d);
        jSONObject.put("audioBitrate", outputConfig.f479073e);
        jSONObject.put("audioSampleRate", outputConfig.f479074f);
        jSONObject.put("audioChannelCount", outputConfig.f479075g);
        jSONObject.put("highProfileEnable", outputConfig.f479076h);
        jSONObject.put("limitProfileLevelEnable", outputConfig.f479077i);
        jSONObject.put("aacEncodeNeedCodecSpecificData", outputConfig.f479078j);
        jSONObject.put("outputHevc", outputConfig.f479079k);
        jSONObject.put("suggestParallelCount", outputConfig.f479080l);
        android.util.Size size = outputConfig.f479081m;
        jSONObject.put("renderSize", size != null ? size.toString() : null);
        jSONObject.put("colorRange", outputConfig.f479082n);
        jSONObject.put("colorStandard", outputConfig.f479083o);
        jSONObject.put("colorTransfer", outputConfig.f479084p);
        jSONObject.put("correctSizeByCodecCapabilities", outputConfig.f479085q);
        jSONObject.put("checkFrameProcessTimeout", outputConfig.f479086r);
        jSONObject.put("timeoutInterruptWork", outputConfig.f479087s);
        jSONObject.put("maxTimeoutMs", outputConfig.f479088t);
        jSONObject.put("optimizedVideoFrameSamplingEnable", outputConfig.f479089u);
        jSONObject.put("newTextureBlittingEnable", outputConfig.f479090v);
        jSONObject.put("minMuxDuration", outputConfig.f479091w);
        jSONObject.put("minMuxFrameCount", outputConfig.f479092x);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
