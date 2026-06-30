package a91;

/* loaded from: classes13.dex */
public class v implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return false;
        }
        try {
            c(iVar, jSONArray.getString(0));
            return true;
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SetFontStyle", "get 'fontStyle' error.");
            return false;
        }
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontStyleActionArg setFontStyleActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontStyleActionArg) drawActionArg;
        if (setFontStyleActionArg == null) {
            return false;
        }
        c(iVar, setFontStyleActionArg.f77111e);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(z81.i r6, java.lang.String r7) {
        /*
            r5 = this;
            r7.getClass()
            int r0 = r7.hashCode()
            r1 = 1
            r2 = 0
            r3 = 2
            r4 = -1
            switch(r0) {
                case -1657669071: goto L25;
                case -1178781136: goto L1a;
                case -1039745817: goto Lf;
                default: goto Le;
            }
        Le:
            goto L2f
        Lf:
            java.lang.String r0 = "normal"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L18
            goto L2f
        L18:
            r4 = r3
            goto L2f
        L1a:
            java.lang.String r0 = "italic"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L23
            goto L2f
        L23:
            r4 = r1
            goto L2f
        L25:
            java.lang.String r0 = "oblique"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L2e
            goto L2f
        L2e:
            r4 = r2
        L2f:
            switch(r4) {
                case 0: goto L49;
                case 1: goto L3e;
                case 2: goto L33;
                default: goto L32;
            }
        L32:
            goto L53
        L33:
            e91.b r7 = r6.f470711a
            r7.d(r2)
            e91.b r6 = r6.f470712b
            r6.d(r2)
            goto L53
        L3e:
            e91.b r7 = r6.f470711a
            r7.d(r3)
            e91.b r6 = r6.f470712b
            r6.d(r3)
            goto L53
        L49:
            e91.b r7 = r6.f470711a
            r7.d(r3)
            e91.b r6 = r6.f470712b
            r6.d(r3)
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a91.v.c(z81.i, java.lang.String):boolean");
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "setFontStyle";
    }
}
