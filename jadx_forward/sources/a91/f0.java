package a91;

/* loaded from: classes13.dex */
public class f0 implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        try {
            return c(iVar, canvas, (android.graphics.Bitmap) jSONArray.get(4), ik1.w.i(jSONArray, 0), ik1.w.i(jSONArray, 1), ik1.w.i(jSONArray, 2), ik1.w.i(jSONArray, 3));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SetPixelsAction", "get bitmap data error, %s", android.util.Log.getStackTraceString(e17));
            return false;
        }
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.InterfaceC11753x43f81f3c interfaceC11753x43f81f3c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11784x64304b71 c11784x64304b71 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11784x64304b71) interfaceC11753x43f81f3c;
        if (c11784x64304b71 == null) {
            return false;
        }
        return c(iVar, canvas, c11784x64304b71.f158657i, c11784x64304b71.f158653e, c11784x64304b71.f158654f, c11784x64304b71.f158655g, c11784x64304b71.f158656h);
    }

    public final boolean c(z81.i iVar, android.graphics.Canvas canvas, android.graphics.Bitmap bitmap, int i17, int i18, int i19, int i27) {
        if (!canvas.isHardwareAccelerated()) {
            iVar.getClass();
            canvas.drawRect(i17, i18, i17 + i19, i18 + i27, iVar.f552248e);
        } else if (canvas instanceof z81.l) {
            ((z81.l) canvas).a(i17, i18, i17 + i19, i18 + i27);
        } else {
            iVar.getClass();
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        canvas.drawBitmap(bitmap, new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new android.graphics.RectF(i17, i18, i17 + i19, i18 + i27), iVar.f552244a);
        return true;
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "__setPixels";
    }
}
