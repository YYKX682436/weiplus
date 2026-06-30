package a91;

/* loaded from: classes13.dex */
public class y implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 1) {
            return false;
        }
        try {
            c(iVar, jSONArray.getString(0));
            return true;
        } catch (org.json.JSONException unused) {
            return false;
        }
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.SetGlobalCompositeOperationActionArg setGlobalCompositeOperationActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.SetGlobalCompositeOperationActionArg) drawActionArg;
        if (setGlobalCompositeOperationActionArg == null) {
            return false;
        }
        c(iVar, setGlobalCompositeOperationActionArg.f77114e);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01d6, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(z81.i r3, java.lang.String r4) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a91.y.c(z81.i, java.lang.String):boolean");
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "setGlobalCompositeOperation";
    }
}
