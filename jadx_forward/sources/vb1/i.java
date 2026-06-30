package vb1;

/* loaded from: classes7.dex */
public class i extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f77264x366c91de = 100;

    /* renamed from: NAME */
    public static final java.lang.String f77265x24728b = "canvasToTempFilePath";

    public static android.graphics.Bitmap.CompressFormat C(org.json.JSONObject jSONObject) {
        return "jpg".equalsIgnoreCase(jSONObject.optString("fileType")) ? android.graphics.Bitmap.CompressFormat.JPEG : android.graphics.Bitmap.CompressFormat.PNG;
    }

    public static int D(org.json.JSONObject jSONObject) {
        float optDouble = (float) jSONObject.optDouble("quality", 1.0d);
        return (int) (optDouble >= 0.0f ? optDouble > 1.0f ? 100.0f : optDouble * 100.0f : 0.0f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        ik1.h0.a().m77784x795fa299(new vb1.h(this, lVar, i17, jSONObject));
    }
}
