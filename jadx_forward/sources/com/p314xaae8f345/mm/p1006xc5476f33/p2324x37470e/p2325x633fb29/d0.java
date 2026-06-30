package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f257109d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(android.app.Activity activity) {
        super(0);
        this.f257109d = activity;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        boolean z18;
        boolean z19;
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        try {
            android.view.Display.HdrCapabilities hdrCapabilities = this.f257109d.getWindowManager().getDefaultDisplay().getHdrCapabilities();
            int[] supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(supportedHdrTypes);
            for (int i17 : supportedHdrTypes) {
                jSONArray.put(i17);
            }
            jSONObject.put("HDRTypes", jSONArray);
            jSONObject.put("MaxLuminance", java.lang.Float.valueOf(hdrCapabilities.getDesiredMaxLuminance()));
            jSONObject.put("MinLuminance", java.lang.Float.valueOf(hdrCapabilities.getDesiredMinLuminance()));
            jSONObject.put("AvgLuminance", java.lang.Float.valueOf(hdrCapabilities.getDesiredMaxAverageLuminance()));
            android.media.MediaCodecInfo[] codecInfos = new android.media.MediaCodecList(1).getCodecInfos();
            if (codecInfos != null) {
                z17 = false;
                z18 = false;
                z19 = false;
                for (android.media.MediaCodecInfo mediaCodecInfo : codecInfos) {
                    try {
                        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/hevc");
                        if (capabilitiesForType != null && (codecProfileLevelArr = capabilitiesForType.profileLevels) != null) {
                            int length = codecProfileLevelArr.length;
                            int i18 = 0;
                            while (i18 < length) {
                                android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i18];
                                try {
                                    android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr2 = codecProfileLevelArr;
                                    z17 |= com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101734xf9014ce3(2, codecProfileLevel.profile, codecProfileLevel.level);
                                    z18 |= com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101734xf9014ce3(0, codecProfileLevel.profile, codecProfileLevel.level);
                                    z19 |= com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26292x6745a9d7.m101734xf9014ce3(1, codecProfileLevel.profile, codecProfileLevel.level);
                                    i18++;
                                    codecProfileLevelArr = codecProfileLevelArr2;
                                } catch (java.lang.Exception e17) {
                                    e = e17;
                                    int i19 = rl.b.f478676a;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.HDRUtil", e, "", new java.lang.Object[0]);
                                }
                            }
                        }
                    } catch (java.lang.Exception e18) {
                        e = e18;
                    }
                }
            } else {
                z17 = false;
                z18 = false;
                z19 = false;
            }
            jSONObject.put("isSupportDolbyHDR", z17);
            jSONObject.put("isSupportHDR10", z18);
            jSONObject.put("isSupportHDR10Plus", z19);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.e0.f257119b = r26.i0.t(jSONObject2, ",", ";", false);
        } catch (java.lang.Exception e19) {
            int i27 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.HDRUtil", e19, "", new java.lang.Object[0]);
        }
        return jz5.f0.f384359a;
    }
}
