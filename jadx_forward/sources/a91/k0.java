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
            android.util.DisplayMetrics displayMetrics = ik1.w.f373375a;
            c(canvas, f17, f18, f19, f27, ik1.w.f() * ((float) jSONArray.getDouble(4)), ik1.w.f() * ((float) jSONArray.getDouble(5)));
            return true;
        } catch (org.json.JSONException unused) {
            return false;
        }
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.InterfaceC11753x43f81f3c interfaceC11753x43f81f3c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11789xd2f25216 c11789xd2f25216 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11789xd2f25216) interfaceC11753x43f81f3c;
        if (c11789xd2f25216 == null) {
            return false;
        }
        c(canvas, c11789xd2f25216.f158665e, c11789xd2f25216.f158666f, c11789xd2f25216.f158667g, c11789xd2f25216.f158668h, c11789xd2f25216.f158669i, c11789xd2f25216.f158670m);
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
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "setTransform";
    }
}
