package a91;

/* loaded from: classes13.dex */
public class h0 implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        org.json.JSONArray optJSONArray;
        org.json.JSONArray optJSONArray2;
        if (jSONArray.length() < 2) {
            return false;
        }
        java.lang.String optString = jSONArray.optString(0);
        if ("linear".equalsIgnoreCase(optString)) {
            if (jSONArray.length() >= 3 && (optJSONArray2 = jSONArray.optJSONArray(1)) != null && optJSONArray2.length() >= 4) {
                float g17 = ik1.w.g(optJSONArray2, 0);
                float g18 = ik1.w.g(optJSONArray2, 1);
                float g19 = ik1.w.g(optJSONArray2, 2);
                float g27 = ik1.w.g(optJSONArray2, 3);
                org.json.JSONArray optJSONArray3 = jSONArray.optJSONArray(2);
                if (optJSONArray3 != null && optJSONArray3.length() != 0) {
                    int[] iArr = new int[optJSONArray3.length()];
                    float[] fArr = new float[optJSONArray3.length()];
                    for (int i17 = 0; i17 < optJSONArray3.length(); i17++) {
                        org.json.JSONArray optJSONArray4 = optJSONArray3.optJSONArray(i17);
                        if (optJSONArray4.length() >= 2) {
                            fArr[i17] = (float) optJSONArray4.optDouble(0);
                            iArr[i17] = ik1.w.b(optJSONArray4.optJSONArray(1));
                        }
                    }
                    iVar.f552244a.setShader(new android.graphics.LinearGradient(g17, g18, g19, g27, iArr, fArr, android.graphics.Shader.TileMode.CLAMP));
                }
            }
            return false;
        }
        if ("radial".equalsIgnoreCase(optString)) {
            if (jSONArray.length() < 3 || (optJSONArray = jSONArray.optJSONArray(1)) == null || optJSONArray.length() < 3) {
                return false;
            }
            float g28 = ik1.w.g(optJSONArray, 1);
            float g29 = ik1.w.g(optJSONArray, 2);
            float g37 = ik1.w.g(optJSONArray, 3);
            org.json.JSONArray optJSONArray5 = jSONArray.optJSONArray(2);
            int[] iArr2 = new int[optJSONArray5.length()];
            float[] fArr2 = new float[optJSONArray5.length()];
            for (int i18 = 0; i18 < optJSONArray5.length(); i18++) {
                org.json.JSONArray optJSONArray6 = optJSONArray5.optJSONArray(i18);
                if (optJSONArray6.length() >= 2) {
                    fArr2[i18] = (float) optJSONArray6.optDouble(0);
                    iArr2[i18] = ik1.w.b(optJSONArray6.optJSONArray(1));
                }
            }
            iVar.f552244a.setShader(new android.graphics.RadialGradient(g28, g29, g37, iArr2, fArr2, android.graphics.Shader.TileMode.CLAMP));
        } else if ("normal".equalsIgnoreCase(optString)) {
            org.json.JSONArray optJSONArray7 = jSONArray.optJSONArray(1);
            if (optJSONArray7 == null || optJSONArray7.length() < 4) {
                return false;
            }
            iVar.f552244a.setColor(ik1.w.b(optJSONArray7));
        }
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.InterfaceC11753x43f81f3c interfaceC11753x43f81f3c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11786x4f0ed49 c11786x4f0ed49 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11786x4f0ed49) interfaceC11753x43f81f3c;
        if (c11786x4f0ed49 == null) {
            return false;
        }
        return c11786x4f0ed49.a(iVar, canvas);
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "setStrokeStyle";
    }
}
