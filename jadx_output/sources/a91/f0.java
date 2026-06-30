package a91;

/* loaded from: classes13.dex */
public class f0 implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        try {
            return c(iVar, canvas, (android.graphics.Bitmap) jSONArray.get(4), ik1.w.i(jSONArray, 0), ik1.w.i(jSONArray, 1), ik1.w.i(jSONArray, 2), ik1.w.i(jSONArray, 3));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SetPixelsAction", "get bitmap data error, %s", android.util.Log.getStackTraceString(e17));
            return false;
        }
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.SetPixelsActionArg setPixelsActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.SetPixelsActionArg) drawActionArg;
        if (setPixelsActionArg == null) {
            return false;
        }
        return c(iVar, canvas, setPixelsActionArg.f77124i, setPixelsActionArg.f77120e, setPixelsActionArg.f77121f, setPixelsActionArg.f77122g, setPixelsActionArg.f77123h);
    }

    public final boolean c(z81.i iVar, android.graphics.Canvas canvas, android.graphics.Bitmap bitmap, int i17, int i18, int i19, int i27) {
        if (!canvas.isHardwareAccelerated()) {
            iVar.getClass();
            canvas.drawRect(i17, i18, i17 + i19, i18 + i27, iVar.f470715e);
        } else if (canvas instanceof z81.l) {
            ((z81.l) canvas).a(i17, i18, i17 + i19, i18 + i27);
        } else {
            iVar.getClass();
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        canvas.drawBitmap(bitmap, new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new android.graphics.RectF(i17, i18, i17 + i19, i18 + i27), iVar.f470711a);
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "__setPixels";
    }
}
