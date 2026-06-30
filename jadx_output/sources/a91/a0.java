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
                iVar.f470711a.setPathEffect(new android.graphics.DashPathEffect(fArr, g17));
            }
            return true;
        } catch (org.json.JSONException unused) {
            return false;
        }
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineDashActionArg setLineDashActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineDashActionArg) drawActionArg;
        if (setLineDashActionArg == null) {
            return false;
        }
        float[] fArr = setLineDashActionArg.f77116e;
        float f17 = setLineDashActionArg.f77117f;
        if (fArr == null || f17 == Float.MIN_VALUE) {
            return true;
        }
        iVar.f470711a.setPathEffect(new android.graphics.DashPathEffect(fArr, f17));
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "setLineDash";
    }
}
