package a91;

/* loaded from: classes13.dex */
public class k0 implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 6) {
            return false;
        }
        try {
            float f17 = (float) jSONArray.getDouble(0);
            float f18 = (float) jSONArray.getDouble(1);
            float f19 = (float) jSONArray.getDouble(2);
            float f27 = (float) jSONArray.getDouble(3);
            android.util.DisplayMetrics displayMetrics = ik1.w.f291842a;
            c(canvas, f17, f18, f19, f27, ik1.w.f() * ((float) jSONArray.getDouble(4)), ik1.w.f() * ((float) jSONArray.getDouble(5)));
            return true;
        } catch (org.json.JSONException unused) {
            return false;
        }
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTransformActionArg setTransformActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTransformActionArg) drawActionArg;
        if (setTransformActionArg == null) {
            return false;
        }
        c(canvas, setTransformActionArg.f77132e, setTransformActionArg.f77133f, setTransformActionArg.f77134g, setTransformActionArg.f77135h, setTransformActionArg.f77136i, setTransformActionArg.f77137m);
        return true;
    }

    public final boolean c(android.graphics.Canvas canvas, float f17, float f18, float f19, float f27, float f28, float f29) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.reset();
        matrix.setValues(new float[]{f17, f19, f28, f18, f27, f29, 0.0f, 0.0f, 1.0f});
        canvas.setMatrix(matrix);
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "setTransform";
    }
}
