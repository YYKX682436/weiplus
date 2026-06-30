package a91;

/* loaded from: classes13.dex */
public class a0 implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 2) {
            return false;
        }
        try {
            org.json.JSONArray jSONArray2 = jSONArray.getJSONArray(0);
            if (jSONArray2 == null) {
                return false;
            }
            int length = jSONArray2.length();
            float[] fArr = new float[length];
            for (int i17 = 0; i17 < length; i17++) {
                fArr[i17] = ik1.w.g(jSONArray2, i17);
            }
            float g17 = ik1.w.g(jSONArray, 1);
            if (g17 != Float.MIN_VALUE) {
                iVar.f552244a.setPathEffect(new android.graphics.DashPathEffect(fArr, g17));
            }
            return true;
        } catch (org.json.JSONException unused) {
            return false;
        }
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.InterfaceC11753x43f81f3c interfaceC11753x43f81f3c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11781x68c8b918 c11781x68c8b918 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11781x68c8b918) interfaceC11753x43f81f3c;
        if (c11781x68c8b918 == null) {
            return false;
        }
        float[] fArr = c11781x68c8b918.f158649e;
        float f17 = c11781x68c8b918.f158650f;
        if (fArr == null || f17 == Float.MIN_VALUE) {
            return true;
        }
        iVar.f552244a.setPathEffect(new android.graphics.DashPathEffect(fArr, f17));
        return true;
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "setLineDash";
    }
}
