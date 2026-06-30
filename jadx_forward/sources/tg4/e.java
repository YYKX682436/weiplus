package tg4;

/* loaded from: classes7.dex */
public abstract class e extends tg4.c {
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
    @Override // tg4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(org.json.JSONObject r10, com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "data"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            java.lang.String r0 = "rootView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "invokeImpl:data:"
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r1 = ",viewId:"
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.MBBaseUpdateCoverViewJsApi"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            wq0.a r0 = r11.getF150208e()
            if (r0 != 0) goto L39
            java.lang.String r10 = "rootView.getCustomViewContainer() is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r10)
            java.lang.String r10 = "coverView is null"
            r9.v(r10)
            return
        L39:
            wq0.a r0 = r11.getF150208e()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            android.view.View r0 = r0.o(r12)
            if (r0 != 0) goto L52
            java.lang.String r10 = "view for this viewId is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r10)
            java.lang.String r10 = "fail:view for this viewId is null"
            r9.v(r10)
            return
        L52:
            r2 = 0
            wq0.a r3 = r11.getF150208e()     // Catch: org.json.JSONException -> L76
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r3)     // Catch: org.json.JSONException -> L76
            float[] r5 = r9.u(r10)     // Catch: org.json.JSONException -> L76
            java.lang.String r11 = "hide"
            boolean r11 = r10.getBoolean(r11)     // Catch: org.json.JSONException -> L6b
            if (r11 == 0) goto L69
            r11 = 4
            goto L6c
        L69:
            r6 = r2
            goto L6d
        L6b:
            r11 = -1
        L6c:
            r6 = r11
        L6d:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch: org.json.JSONException -> L76
            r4 = r12
            r7 = r8
            boolean r2 = r3.w(r4, r5, r6, r7, r8)     // Catch: org.json.JSONException -> L76
            goto L7c
        L76:
            java.lang.String r11 = "updateView fail"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r11)
        L7c:
            if (r2 == 0) goto Lab
            boolean r10 = r9.x(r12, r0, r10)
            if (r10 == 0) goto L8a
            java.lang.String r11 = ""
            r9.v(r11)
            goto L90
        L8a:
            java.lang.String r11 = "onUpdateView error"
            r9.v(r11)
        L90:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "update view viewId:"
            r11.<init>(r0)
            r11.append(r12)
            java.lang.String r12 = ", result:"
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r10)
            return
        Lab:
            java.lang.String r10 = "updateView error"
            r9.v(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tg4.e.w(org.json.JSONObject, com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer, int):void");
    }

    public boolean x(int i17, android.view.View view, org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return true;
    }
}
